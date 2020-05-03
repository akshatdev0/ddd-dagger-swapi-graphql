package com.github.akshatdev0.swapi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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

  List<String> producers();

  String releaseDate();

  String created();

  String edited();
}
