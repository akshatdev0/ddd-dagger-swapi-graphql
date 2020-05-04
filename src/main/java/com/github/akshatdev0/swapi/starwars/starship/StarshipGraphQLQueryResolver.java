package com.github.akshatdev0.swapi.starwars.starship;

import graphql.GraphqlErrorException;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class StarshipGraphQLQueryResolver implements GraphQLQueryResolver {

  private final StarshipRepository starshipRepository;

  public StarshipGraphQLQueryResolver() {
    starshipRepository = new StarshipRepository();
  }

  public Iterable<Starship> allStarships() {
    return starshipRepository.findAll();
  }

  public Starship starship(String id) {
    return starshipRepository
        .findById(id)
        .orElseThrow(
            () ->
                GraphqlErrorException.newErrorException()
                    .message("No Starship found with ID: " + id)
                    .build());
  }
}
