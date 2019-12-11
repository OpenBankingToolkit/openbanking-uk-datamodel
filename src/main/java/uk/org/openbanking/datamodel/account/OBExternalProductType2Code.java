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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Descriptive code for the product category.  If ProductType - \"Other\" is chosen, the object OtherProductType must be populated with name, and description.
 */
public enum OBExternalProductType2Code {

  BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),

  COMMERCIALCREDITCARD("CommercialCreditCard"),

  OTHER("Other"),

  PERSONALCURRENTACCOUNT("PersonalCurrentAccount"),

  SMELOAN("SMELoan"),

  @Deprecated
  /**
   * Use BUSINESSCURRENTACCOUNT instead in V3
   */
  BCA("BCA"),

  @Deprecated
  /**
   * Use PERSONALCURRENTACCOUNT instead in V3
   */
  PCA("PCA");

  private String value;

  OBExternalProductType2Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalProductType2Code fromValue(String text) {
    for (OBExternalProductType2Code b : OBExternalProductType2Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

