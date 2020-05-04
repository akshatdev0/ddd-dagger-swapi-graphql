package com.github.akshatdev0.swapi.starwars.starship;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.akshatdev0.swapi.jsondb.JsonDB;
import com.github.akshatdev0.swapi.repository.BaseRepository;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StarshipRepository extends BaseRepository<Starship, String> {

  private final JsonDB jsonDB;

  final StarshipJsonNodeConverter converter;

  StarshipRepository() {
    this.jsonDB = new JsonDB();
    this.converter = new StarshipJsonNodeConverter();
  }

  @Override
  public Iterable<Starship> findAll() {
    return jsonDB.getStarshipData().values().stream()
        .map(converter::convert)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<Starship> findById(String id) {
    final Map<String, JsonNode> starshipData = jsonDB.getStarshipData();
    if (!starshipData.containsKey(id)) {
      return Optional.empty();
    }
    return Optional.of(converter.convert(starshipData.get(id)));
  }
}
