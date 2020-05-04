package com.github.akshatdev0.swapi.starwars.film;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.akshatdev0.swapi.jsondb.JsonDB;
import com.github.akshatdev0.swapi.repository.BaseRepository;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilmRepository extends BaseRepository<Film, String> {

  private final JsonDB jsonDB;

  final FilmJsonNodeConverter converter;

  FilmRepository() {
    this.jsonDB = new JsonDB();
    this.converter = new FilmJsonNodeConverter();
  }

  @Override
  public Iterable<Film> findAll() {
    return jsonDB.getFilmData().values().stream()
        .map(converter::convert)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<Film> findById(String id) {
    final Map<String, JsonNode> filmData = jsonDB.getFilmData();
    if (!filmData.containsKey(id)) {
      return Optional.empty();
    }
    return Optional.of(converter.convert(filmData.get(id)));
  }
}
