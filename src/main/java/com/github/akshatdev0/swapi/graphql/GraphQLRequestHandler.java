package com.github.akshatdev0.swapi.graphql;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.github.akshatdev0.swapi.starwars.film.FilmGraphQLQueryResolver;
import com.github.akshatdev0.swapi.starwars.person.PersonGraphQLQueryResolver;
import com.github.akshatdev0.swapi.starwars.planet.PlanetGraphQLQueryResolver;
import com.github.akshatdev0.swapi.starwars.starship.StarshipGraphQLQueryResolver;
import graphql.ExecutionInput;
import graphql.GraphQL;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import java.util.Map;

public class GraphQLRequestHandler {

  private static final ObjectMapper objectMapper;

  private static final GraphQL graphQL;

  static {
    // Jackson ObjectMapper
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new GuavaModule());

    // GraphQL
    final GraphQLSchema graphQLSchema =
        SchemaParser.newParser()
            .files(
                "graphql/swapi.graphql",
                "graphql/film.graphql",
                "graphql/person.graphql",
                "graphql/planet.graphql",
                "graphql/starship.graphql")
            .resolvers(
                new FilmGraphQLQueryResolver(),
                new PersonGraphQLQueryResolver(),
                new PlanetGraphQLQueryResolver(),
                new StarshipGraphQLQueryResolver())
            .build()
            .makeExecutableSchema();
    graphQL = GraphQL.newGraphQL(graphQLSchema).build();
  }

  public String handleRequest(String requestBody) throws Exception {
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
