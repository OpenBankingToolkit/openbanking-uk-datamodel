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
 * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
 */
public enum OBExternalPermissions1Code {
  
  READACCOUNTSBASIC("ReadAccountsBasic"),
  
  READACCOUNTSDETAIL("ReadAccountsDetail"),
  
  READBALANCES("ReadBalances"),
  
  READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),
  
  READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),
  
  READDIRECTDEBITS("ReadDirectDebits"),
  
  READOFFERS("ReadOffers"),
  
  READPAN("ReadPAN"),
  
  READPARTY("ReadParty"),
  
  READPARTYPSU("ReadPartyPSU"),
  
  READPRODUCTS("ReadProducts"),
  
  READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),
  
  READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),
  
  READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),
  
  READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),
  
  READSTATEMENTSBASIC("ReadStatementsBasic"),
  
  READSTATEMENTSDETAIL("ReadStatementsDetail"),
  
  READTRANSACTIONSBASIC("ReadTransactionsBasic"),
  
  READTRANSACTIONSCREDITS("ReadTransactionsCredits"),
  
  READTRANSACTIONSDEBITS("ReadTransactionsDebits"),
  
  READTRANSACTIONSDETAIL("ReadTransactionsDetail");

  private String value;

  OBExternalPermissions1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalPermissions1Code fromValue(String text) {
    for (OBExternalPermissions1Code b : OBExternalPermissions1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

