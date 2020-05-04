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
 * Persistence exception thrown when a previously failed operation might be able to succeed if the
 * application performs some recovery steps and retries the entire transaction or in the case of a
 * distributed transaction, the transaction branch. At a minimum, the recovery operation must
 * include closing the current connection and getting a new connection.
 */
@SuppressWarnings("serial")
public class RecoverablePersistenceException extends PersistenceException {

  /**
   * Constructor for RecoverablePersistenceException.
   *
   * @param msg the detail message
   */
  public RecoverablePersistenceException(String msg) {
    super(msg);
  }

  /**
   * Constructor for RecoverablePersistenceException.
   *
   * @param msg the detail message
   * @param cause the root cause (usually from using a underlying persistence API such as JDBC)
   */
  public RecoverablePersistenceException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
