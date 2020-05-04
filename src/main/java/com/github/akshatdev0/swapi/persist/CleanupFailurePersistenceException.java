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
 * Exception thrown when we couldn't cleanup after a persistence operation, but the actual operation
 * went OK.
 *
 * <p>For example, this exception or a subclass might be thrown if a JDBC Connection couldn't be
 * closed after it had been used successfully.
 *
 * <p>Note that persistence code might perform resources cleanup in a finally block and therefore
 * log cleanup failure rather than rethrow it, to keep the original persistence exception, if any.
 */
@SuppressWarnings("serial")
public class CleanupFailurePersistenceException extends NonTransientPersistenceException {

  /**
   * Constructor for CleanupFailurePersistenceException.
   *
   * @param msg the detail message
   * @param cause the root cause from the underlying persistence API, such as JDBC
   */
  public CleanupFailurePersistenceException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
