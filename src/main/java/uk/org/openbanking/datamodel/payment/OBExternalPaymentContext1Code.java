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

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * Specifies the payment context
 */
public enum OBExternalPaymentContext1Code {
  
  BILLPAYMENT("BillPayment"),
  
  ECOMMERCEGOODS("EcommerceGoods"),
  
  ECOMMERCESERVICES("EcommerceServices"),
  
  OTHER("Other"),
  
  PARTYTOPARTY("PartyToParty");

  private String value;

  OBExternalPaymentContext1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalPaymentContext1Code fromValue(String text) {
    if (text == null) {
      return null;
    }
    for (OBExternalPaymentContext1Code b : OBExternalPaymentContext1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("PaymentContextCode is not one of the valid values");
  }
}

