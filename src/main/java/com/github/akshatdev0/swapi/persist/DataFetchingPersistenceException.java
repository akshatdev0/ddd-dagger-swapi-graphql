package com.github.akshatdev0.swapi.persist;

@Deprecated
public class DataFetchingPersistenceException extends PersistenceException {

  public DataFetchingPersistenceException(String s) {
    super(s);
  }

  public DataFetchingPersistenceException(String s, Exception e) {
    super(s, e);
  }
}
