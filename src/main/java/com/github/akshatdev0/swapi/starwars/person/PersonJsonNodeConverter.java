package com.github.akshatdev0.swapi.starwars.person;

import com.fasterxml.jackson.databind.JsonNode;

public class PersonJsonNodeConverter {

  public Person convert(JsonNode jsonNode) {
    return ImmutablePerson.builder()
        .id(jsonNode.get("id").asText())
        .name(jsonNode.get("name").asText())
        .birthYear(jsonNode.get("birth_year").asText())
        .gender(jsonNode.get("gender").asText())
        .height(jsonNode.get("height").asInt())
        .mass((float) jsonNode.get("mass").asDouble())
        .eyeColor(jsonNode.get("eye_color").asText())
        .hairColor(jsonNode.get("hair_color").asText())
        .skinColor(jsonNode.get("skin_color").asText())
        .created(jsonNode.get("created").asText())
        .edited(jsonNode.get("edited").asText())
        .build();
  }
}
