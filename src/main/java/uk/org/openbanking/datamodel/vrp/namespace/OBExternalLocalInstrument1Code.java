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
package uk.org.openbanking.datamodel.vrp.namespace;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalLocalInstrument1Code {

    BACS("UK.OBIE.BACS"),
    BALANCE_TRANSFER("UK.OBIE.BalanceTransfer"),
    CHAPS("UK.OBIE.CHAPS"),
    EURO1("UK.OBIE.Euro1"),
    FPS("UK.OBIE.FPS"),
    LINK("UK.OBIE.Link"),
    MONEY_TRANSFER("UK.OBIE.MoneyTransfer"),
    PAYM("UK.OBIE.Paym"),
    SEPA_CREDIT_TRANSFER("UK.OBIE.SEPACreditTransfer"),
    SEPA_INSTANT_CREDIT_TRANSFER("UK.OBIE.SEPAInstantCreditTransfer"),
    SWIFT("UK.OBIE.SWIFT"),
    TARGET2("UK.OBIE.Target2");

    private String value;

    OBExternalLocalInstrument1Code(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBExternalLocalInstrument1Code fromValue(String value) {
        for (OBExternalLocalInstrument1Code enum_ : OBExternalLocalInstrument1Code.values()) {
            if (enum_.value.equals(value)) {
                return enum_;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
