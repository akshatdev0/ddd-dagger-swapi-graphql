package com.github.akshatdev0.swapi.starwars.person;

import graphql.GraphqlErrorException;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class PersonGraphQLQueryResolver implements GraphQLQueryResolver {

  private final PersonRepository personRepository;

  public PersonGraphQLQueryResolver() {
    personRepository = new PersonRepository();
  }

  public Iterable<Person> allPersons() {
    return personRepository.findAll();
  }

  public Person person(String id) {
    return personRepository
        .findById(id)
        .orElseThrow(
            () ->
                GraphqlErrorException.newErrorException()
                    .message("No Person found with ID: " + id)
                    .build());
  }
}
