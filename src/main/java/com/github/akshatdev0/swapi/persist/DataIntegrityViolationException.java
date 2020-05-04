/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * NOTICE: This work has been taken from spring-framework and modified as per Ethos use-case.
 *         This is a prominent notice stating the same.
 *
 * This work is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 */

package com.github.akshatdev0.swapi.persist;

/**
 * Exception thrown when an attempt to insert or update data results in violation of an integrity
 * constraint. Note that this is not purely a relational concept; unique primary keys are required
 * by most database types.
 */
@SuppressWarnings("serial")
public class DataIntegrityViolationException extends NonTransientPersistenceException {

  /**
   * Constructor for DataIntegrityViolationException.
   *
   * @param msg the detail message
   */
  public DataIntegrityViolationException(String msg) {
    super(msg);
  }

  /**
   * Constructor for DataIntegrityViolationException.
   *
   * @param msg the detail message
   * @param cause the root cause from the persistence API in use
   */
  public DataIntegrityViolationException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
