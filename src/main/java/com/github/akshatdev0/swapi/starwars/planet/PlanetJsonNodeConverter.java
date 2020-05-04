package com.github.akshatdev0.swapi.starwars.planet;

import static com.github.akshatdev0.swapi.util.StringUtils.*;

import com.fasterxml.jackson.databind.JsonNode;

public class PlanetJsonNodeConverter {

  public Planet convert(JsonNode jsonNode) {
    return ImmutablePlanet.builder()
        .id(jsonNode.get("id").asText())
        .name(jsonNode.get("name").asText())
        .diameter(jsonNode.get("diameter").asInt())
        .rotationPeriod(jsonNode.get("rotation_period").asInt())
        .orbitalPeriod(jsonNode.get("orbital_period").asInt())
        .gravity(jsonNode.get("gravity").asText())
        .population((float) jsonNode.get("population").asDouble())
        .surfaceWater((float) jsonNode.get("surface_water").asDouble())
        .created(jsonNode.get("created").asText())
        .edited(jsonNode.get("edited").asText())
        .addClimates(splitByComma(jsonNode.get("climate").asText()))
        .addTerrains(splitByComma(jsonNode.get("terrain").asText()))
        .build();
  }
}
