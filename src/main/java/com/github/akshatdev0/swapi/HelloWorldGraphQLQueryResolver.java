package com.github.akshatdev0.swapi;

import graphql.kickstart.tools.GraphQLQueryResolver;

public class HelloWorldGraphQLQueryResolver implements GraphQLQueryResolver {

  public String hello() {
    return "world";
  }
}
