package com.github.akshatdev0.swapi;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import graphql.ExecutionInput;
import graphql.GraphQL;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
    implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

  private static final Logger logger = LogManager.getLogger(App.class);

  private static final ObjectMapper objectMapper;

  private static final GraphQL graphQL;

  static {
    // Jackson ObjectMapper
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new GuavaModule());

    // GraphQL
    final GraphQLSchema graphQLSchema =
        SchemaParser.newParser()
            .file("schema.graphql")
            .resolvers(new AppGraphQLQueryResolver())
            .build()
            .makeExecutableSchema();
    graphQL = GraphQL.newGraphQL(graphQLSchema).build();
  }

  @Override
  public APIGatewayProxyResponseEvent handleRequest(
      APIGatewayProxyRequestEvent request, Context context) {

    // Prepare the response with headers
    final APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
    final Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    headers.put("X-Custom-Header", "application/json");
    responseEvent.withHeaders(headers);

    try {
      final String responseBody = handleGraphQLReqeust(request);
      return responseEvent.withBody(responseBody).withStatusCode(200);
    } catch (Exception ex) {
      logger.error(ex);
      return responseEvent.withBody(ex.getMessage()).withStatusCode(500);
    }
  }

  private String handleGraphQLReqeust(APIGatewayProxyRequestEvent request) throws Exception {
    // Get the request requestBody and parse into GraphQLReqeust
    final String requestBody = request.getBody();
    final GraphQLRequest graphQLRequest = objectMapper.readValue(requestBody, GraphQLRequest.class);

    // Prepare GraphQL ExecutionInput from GraphQLRequest
    final ExecutionInput executionInput =
        ExecutionInput.newExecutionInput()
            .query(graphQLRequest.query())
            .variables(graphQLRequest.variables())
            .build();

    // Execute GraphQL and get response
    final Map<String, Object> response = graphQL.execute(executionInput).toSpecification();
    return objectMapper.writeValueAsString(response);
  }
}
