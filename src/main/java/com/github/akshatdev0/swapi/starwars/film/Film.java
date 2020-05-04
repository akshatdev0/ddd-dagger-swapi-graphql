package com.github.akshatdev0.swapi.starwars.film;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableFilm.class)
@JsonDeserialize(as = ImmutableFilm.class)
public interface Film {

  String id();

  String title();

  int episodeID();

  String openingCrawl();

  String director();

  @Value.Default
  default List<String> producers() {
    return ImmutableList.of();
  }

  String releaseDate();

  String created();

  String edited();
}
