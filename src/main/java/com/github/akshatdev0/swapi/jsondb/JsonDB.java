package com.github.akshatdev0.swapi.jsondb;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JsonDB {

  private static final Logger logger = LogManager.getLogger(JsonDB.class);

  private static final ObjectMapper objectMapper;

  private static final Map<String, JsonNode> filmData;

  private static final Map<String, JsonNode> personData;

  private static final Map<String, JsonNode> planetData;

  private static final Map<String, JsonNode> starshipData;

  static {
    objectMapper = new ObjectMapper();
    objectMapper.registerModule(new GuavaModule());

    filmData = loadData("data/json/films.json");
    personData = loadData("data/json/persons.json");
    planetData = loadData("data/json/planets.json");
    starshipData = loadData("data/json/starships.json");
  }

  private static Map<String, JsonNode> loadData(String file) {
    final ImmutableMap.Builder<String, JsonNode> builder = ImmutableMap.builder();
    try {
      final InputStream is = JsonDB.class.getClassLoader().getResourceAsStream(file);
      if (is != null) {
        final JsonNode jsonArray = objectMapper.readTree(is);
        if (jsonArray != null && jsonArray.isArray()) {
          jsonArray
              .elements()
              .forEachRemaining(jsonNode -> builder.put(jsonNode.get("id").textValue(), jsonNode));
        }
      }
    } catch (IOException e) {
      logger.error(e);
    }
    return builder.build();
  }

  public final Map<String, JsonNode> getFilmData() {
    return filmData;
  }

  public final Map<String, JsonNode> getPersonData() {
    return personData;
  }

  public final Map<String, JsonNode> getPlanetData() {
    return planetData;
  }

  public final Map<String, JsonNode> getStarshipData() {
    return starshipData;
  }
}
