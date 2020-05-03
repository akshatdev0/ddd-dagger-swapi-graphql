package com.github.akshatdev0.swapi;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.github.akshatdev0.swapi.graphql.GraphQLRequestHandler;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
    implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

  private static final Logger logger = LogManager.getLogger(App.class);

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
      final GraphQLRequestHandler requestHandler = new GraphQLRequestHandler();
      final String responseBody = requestHandler.handleRequest(request.getBody());
      return responseEvent.withBody(responseBody).withStatusCode(200);
    } catch (Exception ex) {
      logger.error(ex);
      return responseEvent.withBody(ex.getMessage()).withStatusCode(500);
    }
  }
}
