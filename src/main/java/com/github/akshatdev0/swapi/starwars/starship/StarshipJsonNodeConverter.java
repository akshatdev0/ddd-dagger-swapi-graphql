package com.github.akshatdev0.swapi.starwars.starship;

import static com.github.akshatdev0.swapi.util.StringUtils.splitByComma;

import com.fasterxml.jackson.databind.JsonNode;

public class StarshipJsonNodeConverter {

  public Starship convert(JsonNode jsonNode) {
    return ImmutableStarship.builder()
        .id(jsonNode.get("id").asText())
        .name(jsonNode.get("name").asText())
        .model(jsonNode.get("model").asText())
        .costInCredits((float) jsonNode.get("cost_in_credits").asDouble())
        .length((float) jsonNode.get("length").asDouble())
        .maxAtmospheringSpeed(jsonNode.get("max_atmosphering_speed").asInt())
        .crew(jsonNode.get("crew").asText())
        .passengers(jsonNode.get("passengers").asText())
        .cargoCapacity((float) jsonNode.get("cargo_capacity").asDouble())
        .consumables(jsonNode.get("consumables").asText())
        .consumables(jsonNode.get("consumables").asText())
        .hyperdriveRating((float) jsonNode.get("hyperdrive_rating").asDouble())
        .MGLT(jsonNode.get("MGLT").asInt())
        .starshipClass(jsonNode.get("starship_class").asText())
        .created(jsonNode.get("created").asText())
        .edited(jsonNode.get("edited").asText())
        .addManufacturers(splitByComma(jsonNode.get("manufacturer").asText()))
        .build();
  }
}
