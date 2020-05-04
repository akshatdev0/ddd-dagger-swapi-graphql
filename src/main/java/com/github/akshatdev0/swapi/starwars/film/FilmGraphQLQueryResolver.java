package com.github.akshatdev0.swapi.starwars.film;

import graphql.GraphqlErrorException;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class FilmGraphQLQueryResolver implements GraphQLQueryResolver {

  private final FilmRepository filmRepository;

  public FilmGraphQLQueryResolver() {
    filmRepository = new FilmRepository();
  }

  public Iterable<Film> allFilms() {
    return filmRepository.findAll();
  }

  public Film film(String id) {
    return filmRepository
        .findById(id)
        .orElseThrow(
            () ->
                GraphqlErrorException.newErrorException()
                    .message("No Film found with ID: " + id)
                    .build());
  }
}
