/**
 * Copyright 2019 ForgeRock AS.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of authorisation flow requested.
 *
 * <p>
 * N.B. This enum should be used instead of all the equivalent 'AuthorisationType' inner enums that are created in
 * classes such as {@link OBWriteDomesticConsent3DataAuthorisation} or {@link OBWriteDomesticConsent4DataAuthorisation}
 * etc. This makes migrating to new API versions considerably easier.
 */
public enum OBExternalAuthorisation1Code {
  
  ANY("Any"),
  
  SINGLE("Single");

  private String value;

  OBExternalAuthorisation1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalAuthorisation1Code fromValue(String text) {
    for (OBExternalAuthorisation1Code b : OBExternalAuthorisation1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

