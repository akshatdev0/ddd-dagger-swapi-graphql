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
 * Root for exceptions thrown when we use a persistence resource incorrectly. Thrown for example on
 * specifying bad SQL when using a RDBMS. Resource-specific subclasses are supplied by concrete
 * persistence packages.
 */
@SuppressWarnings("serial")
public class InvalidPersistenceResourceUsageException extends NonTransientPersistenceException {

  /**
   * Constructor for InvalidPersistenceResourceUsageException.
   *
   * @param msg the detail message
   */
  public InvalidPersistenceResourceUsageException(String msg) {
    super(msg);
  }

  /**
   * Constructor for InvalidPersistenceResourceUsageException.
   *
   * @param msg the detail message
   * @param cause the root cause from the persistence API in use
   */
  public InvalidPersistenceResourceUsageException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
