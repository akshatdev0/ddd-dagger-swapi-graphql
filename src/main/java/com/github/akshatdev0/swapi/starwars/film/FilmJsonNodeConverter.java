package com.github.akshatdev0.swapi.starwars.film;

import static com.github.akshatdev0.swapi.util.StringUtils.splitByComma;

import com.fasterxml.jackson.databind.JsonNode;

public class FilmJsonNodeConverter {

  public Film convert(JsonNode jsonNode) {
    return ImmutableFilm.builder()
        .id(jsonNode.get("id").asText())
        .title(jsonNode.get("title").asText())
        .episodeID(jsonNode.get("episode_id").asInt())
        .openingCrawl(jsonNode.get("opening_crawl").asText())
        .director(jsonNode.get("director").asText())
        .releaseDate(jsonNode.get("release_date").asText())
        .created(jsonNode.get("created").asText())
        .edited(jsonNode.get("edited").asText())
        .addProducers(splitByComma(jsonNode.get("producer").asText()))
        .build();
  }
}
