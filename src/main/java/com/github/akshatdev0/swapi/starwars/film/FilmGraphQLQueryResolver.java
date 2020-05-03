package com.github.akshatdev0.swapi.starwars.film;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class FilmGraphQLQueryResolver implements GraphQLQueryResolver {

  public Film film() {
    final Film film =
        ImmutableFilm.builder()
            .id("FI-106")
            .title("Return of the Jedi")
            .episodeID(6)
            .openingCrawl(
                "Luke Skywalker has returned to\r\nhis home planet of Tatooine in\r\nan attempt to rescue his\r\nfriend Han Solo from the\r\nclutches of the vile gangster\r\nJabba the Hutt.\r\n\r\nLittle does Luke know that the\r\nGALACTIC EMPIRE has secretly\r\nbegun construction on a new\r\narmored space station even\r\nmore powerful than the first\r\ndreaded Death Star.\r\n\r\nWhen completed, this ultimate\r\nweapon will spell certain doom\r\nfor the small band of rebels\r\nstruggling to restore freedom\r\nto the galaxy...")
            .director("Richard Marquand")
            .addProducers("Howard G. Kazanjian", "George Lucas", "Rick McCallum")
            .releaseDate("1983-05-25")
            .created("2014-12-18T10:39:33.255000Z")
            .edited("2014-12-20T09:48:37.462000Z")
            .build();
    return film;
  }
}
