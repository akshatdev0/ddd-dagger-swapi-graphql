package com.github.akshatdev0.swapi.starwars.planet;

import graphql.GraphqlErrorException;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class PlanetGraphQLQueryResolver implements GraphQLQueryResolver {

  private final PlanetRepository planetRepository;

  public PlanetGraphQLQueryResolver() {
    planetRepository = new PlanetRepository();
  }

  public Iterable<Planet> allPlanets() {
    return planetRepository.findAll();
  }

  public Planet planet(String id) {
    return planetRepository
        .findById(id)
        .orElseThrow(
            () ->
                GraphqlErrorException.newErrorException()
                    .message("No Planet found with ID: " + id)
                    .build());
  }
}
