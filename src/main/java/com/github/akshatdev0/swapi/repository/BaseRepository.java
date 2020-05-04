package com.github.akshatdev0.swapi.repository;

import com.github.akshatdev0.swapi.persist.OperationNotSupportedPersistenceException;
import java.util.Optional;

public class BaseRepository<T, ID> implements CrudRepository<T, ID> {

  @Override
  public long count() {
    throw new OperationNotSupportedPersistenceException("count operation not supported!");
  }

  @Override
  public boolean existsById(ID id) {
    throw new OperationNotSupportedPersistenceException("existsById operation not supported!");
  }

  @Override
  public Iterable<T> findAll() {
    throw new OperationNotSupportedPersistenceException("findAll operation not supported!");
  }

  @Override
  public Iterable<T> findAllById(Iterable<ID> ids) {
    throw new OperationNotSupportedPersistenceException("findAllById operation not supported!");
  }

  @Override
  public Optional<T> findById(ID id) {
    throw new OperationNotSupportedPersistenceException("findById operation not supported!");
  }

  @Override
  public T create(T entity) {
    throw new OperationNotSupportedPersistenceException("create operation not supported!");
  }

  @Override
  public T update(T entity) {
    throw new OperationNotSupportedPersistenceException("update operation not supported!");
  }

  @Override
  public void delete(T entity) {
    throw new OperationNotSupportedPersistenceException("delete operation not supported!");
  }

  @Override
  public void deleteAll() {
    throw new OperationNotSupportedPersistenceException("deleteAll operation not supported!");
  }

  @Override
  public void deleteAll(Iterable<? extends T> entities) {
    throw new OperationNotSupportedPersistenceException("deleteAll operation not supported!");
  }

  @Override
  public T deleteById(ID id) {
    throw new OperationNotSupportedPersistenceException("deleteById operation not supported!");
  }
}
