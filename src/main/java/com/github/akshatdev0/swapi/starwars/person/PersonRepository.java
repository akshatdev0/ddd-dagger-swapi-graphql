package com.github.akshatdev0.swapi.starwars.person;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.akshatdev0.swapi.jsondb.JsonDB;
import com.github.akshatdev0.swapi.repository.BaseRepository;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonRepository extends BaseRepository<Person, String> {

  private final JsonDB jsonDB;

  final PersonJsonNodeConverter converter;

  PersonRepository() {
    this.jsonDB = new JsonDB();
    this.converter = new PersonJsonNodeConverter();
  }

  @Override
  public Iterable<Person> findAll() {
    return jsonDB.getPersonData().values().stream()
        .map(converter::convert)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<Person> findById(String id) {
    final Map<String, JsonNode> filmData = jsonDB.getPersonData();
    if (!filmData.containsKey(id)) {
      return Optional.empty();
    }
    return Optional.of(converter.convert(filmData.get(id)));
  }
}
