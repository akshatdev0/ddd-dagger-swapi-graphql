package com.github.akshatdev0.swapi;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class AppGraphQLQueryResolver implements GraphQLQueryResolver {

  public Person person() {
    final Person john =
        ImmutablePerson.builder()
            .id("33")
            .name("John")
            .birthYear("1980")
            .gender("male")
            .height(180)
            .mass(80.88f)
            .eyeColor("blue")
            .hairColor("brown")
            .skinColor("white")
            .created("2 days ago")
            .edited("1 hour ago")
            .build();
    return john;
  }

  public Planet planet() {
    final Planet earth =
        ImmutablePlanet.builder()
            .id("EA-101")
            .name("Earth")
            .diameter(12742)
            .rotationPeriod(86164)
            .orbitalPeriod(31600000)
            .gravity("9.8 m/s2")
            .population(759430000000f)
            .surfaceWater(0.75f)
            .addClimates("tropical", "temperate", "polar")
            .addTerrains(
                "Mountains",
                "Plateaus",
                "Valleys",
                "Deserts",
                "Dunes",
                "Islands",
                "Plains",
                "Rivers")
            .created("4.54 billion years ago")
            .edited("1 day ago")
            .build();
    return earth;
  }

  public Starship starship() {
    final Starship starship =
        ImmutableStarship.builder()
            .id("DS-101")
            .name("Death Star")
            .model("DS-1 Orbital Battle Station")
            .addManufacturers("Imperial Department of Military Research", "Sienar Fleet Systems")
            .costInCredits(1000000000000f)
            .length(120000f)
            .maxAtmospheringSpeed(0)
            .crew("342,953")
            .passengers("843,342")
            .cargoCapacity(1000000000000f)
            .consumables("3 years")
            .hyperdriveRating(4.0f)
            .MGLT(10)
            .starshipClass("Deep Space Mobile Battlestation")
            .created("2014-12-10T16:36:50.509000Z")
            .edited("2014-12-20T21:26:24.783000Z")
            .build();
    return starship;
  }

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
