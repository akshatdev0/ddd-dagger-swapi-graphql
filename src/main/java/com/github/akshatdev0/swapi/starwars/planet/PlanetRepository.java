package com.github.akshatdev0.swapi.starwars.planet;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.akshatdev0.swapi.jsondb.JsonDB;
import com.github.akshatdev0.swapi.repository.BaseRepository;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PlanetRepository extends BaseRepository<Planet, String> {

  private final JsonDB jsonDB;

  final PlanetJsonNodeConverter converter;

  PlanetRepository() {
    this.jsonDB = new JsonDB();
    this.converter = new PlanetJsonNodeConverter();
  }

  @Override
  public Iterable<Planet> findAll() {
    return jsonDB.getPlanetData().values().stream()
        .map(converter::convert)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<Planet> findById(String id) {
    final Map<String, JsonNode> planetData = jsonDB.getPlanetData();
    if (!planetData.containsKey(id)) {
      return Optional.empty();
    }
    return Optional.of(converter.convert(planetData.get(id)));
  }
}
