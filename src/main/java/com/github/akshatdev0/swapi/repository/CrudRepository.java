package com.github.akshatdev0.swapi.repository;

import java.util.Optional;

public interface CrudRepository<T, ID> {

  long count();

  boolean existsById(ID id);

  Iterable<T> findAll();

  Iterable<T> findAllById(Iterable<ID> ids);

  Optional<T> findById(ID id);

  T create(T entity);

  T update(T entity);

  // TODO: 15/04/20 @akshat Make this method return the deleted entity
  void delete(T entity);

  void deleteAll();

  void deleteAll(Iterable<? extends T> entities);

  T deleteById(ID id);
}
