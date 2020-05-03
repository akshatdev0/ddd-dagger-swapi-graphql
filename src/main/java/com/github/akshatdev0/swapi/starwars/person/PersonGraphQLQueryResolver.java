package com.github.akshatdev0.swapi.starwars.person;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class PersonGraphQLQueryResolver implements GraphQLQueryResolver {

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
}
