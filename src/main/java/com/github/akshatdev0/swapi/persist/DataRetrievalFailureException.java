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
 * Exception thrown if certain expected data could not be retrieved, e.g. when looking up specific
 * data via a known identifier. This exception will be thrown either by O/R mapping tools or by DAO
 * implementations.
 */
@SuppressWarnings("serial")
public class DataRetrievalFailureException extends NonTransientPersistenceException {

  /**
   * Constructor for DataRetrievalFailureException.
   *
   * @param msg the detail message
   */
  public DataRetrievalFailureException(String msg) {
    super(msg);
  }

  /**
   * Constructor for DataRetrievalFailureException.
   *
   * @param msg the detail message
   * @param cause the root cause from the persistence API in use
   */
  public DataRetrievalFailureException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
