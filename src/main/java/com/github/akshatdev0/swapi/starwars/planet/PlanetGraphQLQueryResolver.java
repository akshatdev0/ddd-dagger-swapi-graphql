package com.github.akshatdev0.swapi.starwars.planet;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class PlanetGraphQLQueryResolver implements GraphQLQueryResolver {

  public Planet planet() {
    final Planet earth =
        ImmutablePlanet.builder()
            .id("EA-101")
            .name("Earth")
            .diameter(12742)
            .rotationPeriod(86164)
            .orbitalPeriod(31600000)
            .gravity("9.8 m/s2")
            .population(759430000000f)
            .surfaceWater(0.75f)
            .addClimates("tropical", "temperate", "polar")
            .addTerrains(
                "Mountains",
                "Plateaus",
                "Valleys",
                "Deserts",
                "Dunes",
                "Islands",
                "Plains",
                "Rivers")
            .created("4.54 billion years ago")
            .edited("1 day ago")
            .build();
    return earth;
  }
}
