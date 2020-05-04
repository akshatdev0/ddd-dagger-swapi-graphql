package com.github.akshatdev0.swapi.persist;

public interface PersistenceExceptionHandler<T, U extends Throwable> {

  void handle(T object) throws PersistenceException;

  void handle(U throwable) throws PersistenceException;
}
