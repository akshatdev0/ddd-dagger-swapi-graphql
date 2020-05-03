package com.github.akshatdev0.swapi;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class AppGraphQLQueryResolver implements GraphQLQueryResolver {

  public String hello() {
    return "world";
  }

  public Person person() {
    final Person john =
        ImmutablePerson.builder()
            .id("33")
            .name("John")
            .birthYear("1980")
            .gender("male")
            .height(180)
            .mass(80.88f)
            .created("2 days ago")
            .edited("1 hour ago")
            .build();
    return john;
  }
}
