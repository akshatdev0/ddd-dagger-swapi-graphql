package com.github.akshatdev0.swapi.persist;

@Deprecated
public class ExecutionAbortedPersistenceException extends PersistenceException {

  public ExecutionAbortedPersistenceException(String message) {
    super(message);
  }
}
