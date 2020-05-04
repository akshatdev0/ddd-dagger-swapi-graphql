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
 * Exception class for exceptions which are unidentified, but can be categorized at a later point.
 * Thus this class is for temporary purposes and should be soon replaced with a categorized
 * exception class.
 */
@SuppressWarnings("serial")
public class UnidentifiedPersistenceException extends UncategorizedPersistenceException {

  /**
   * Constructor for UnidentifiedPersistenceException.
   *
   * @param msg the detail message
   */
  public UnidentifiedPersistenceException(String msg) {
    super(msg);
  }

  /**
   * Constructor for UnidentifiedPersistenceException.
   *
   * @param msg the detail message
   * @param cause the exception thrown by underlying persistence API
   */
  public UnidentifiedPersistenceException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
