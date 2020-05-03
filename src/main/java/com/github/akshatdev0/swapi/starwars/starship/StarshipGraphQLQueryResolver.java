package com.github.akshatdev0.swapi.starwars.starship;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class StarshipGraphQLQueryResolver implements GraphQLQueryResolver {

  public Starship starship() {
    final Starship starship =
        ImmutableStarship.builder()
            .id("DS-101")
            .name("Death Star")
            .model("DS-1 Orbital Battle Station")
            .addManufacturers("Imperial Department of Military Research", "Sienar Fleet Systems")
            .costInCredits(1000000000000f)
            .length(120000f)
            .maxAtmospheringSpeed(0)
            .crew("342,953")
            .passengers("843,342")
            .cargoCapacity(1000000000000f)
            .consumables("3 years")
            .hyperdriveRating(4.0f)
            .MGLT(10)
            .starshipClass("Deep Space Mobile Battlestation")
            .created("2014-12-10T16:36:50.509000Z")
            .edited("2014-12-20T21:26:24.783000Z")
            .build();
    return starship;
  }
}
