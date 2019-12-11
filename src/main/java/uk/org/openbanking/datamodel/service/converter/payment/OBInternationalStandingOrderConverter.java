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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.*;

public class OBInternationalStandingOrderConverter {

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBInternationalStandingOrder1 obInternationalStandingOrder1) {
        return new OBInternationalStandingOrder2()
                .chargeBearer(obInternationalStandingOrder1.getChargeBearer())
                .creditor(obInternationalStandingOrder1.getCreditor())
                .creditorAccount(obInternationalStandingOrder1.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder1.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder1.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder1.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder1.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder1.getFrequency())
                .instructedAmount(obInternationalStandingOrder1.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder1.getNumberOfPayments())
                .purpose(obInternationalStandingOrder1.getPurpose())
                .reference(obInternationalStandingOrder1.getReference())
                ;
    }


    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBInternationalStandingOrder2 obInternationalStandingOrder2) {
        return new OBInternationalStandingOrder1()
                .chargeBearer(obInternationalStandingOrder2.getChargeBearer())
                .creditor(obInternationalStandingOrder2.getCreditor())
                .creditorAccount(obInternationalStandingOrder2.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder2.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder2.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder2.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder2.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder2.getFrequency())
                .instructedAmount(obInternationalStandingOrder2.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder2.getNumberOfPayments())
                .purpose(obInternationalStandingOrder2.getPurpose())
                .reference(obInternationalStandingOrder2.getReference())
                ;
    }

    public static OBWriteInternationalStandingOrderConsent2 toOBWriteInternationalStandingOrderConsent2(OBWriteInternationalStandingOrderConsent1 obWriteInternationalStandingOrderConsent1) {
        return new OBWriteInternationalStandingOrderConsent2()
                .data(new OBWriteDataInternationalStandingOrderConsent2()
                        .authorisation(obWriteInternationalStandingOrderConsent1.getData().getAuthorisation())
                        .initiation(toOBInternationalStandingOrder2(obWriteInternationalStandingOrderConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrderConsent1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent1 toOBWriteInternationalStandingOrderConsent1(OBWriteInternationalStandingOrderConsent2 obWriteInternationalStandingOrderConsent2) {
        return new OBWriteInternationalStandingOrderConsent1()
                .data(new OBWriteDataInternationalStandingOrderConsent1()
                        .authorisation(obWriteInternationalStandingOrderConsent2.getData().getAuthorisation())
                        .initiation(toOBInternationalStandingOrder1(obWriteInternationalStandingOrderConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrderConsent2.getRisk());
    }

    public static OBWriteInternationalStandingOrder2 toOBWriteInternationalStandingOrder2(OBWriteInternationalStandingOrder1 obWriteInternationalStandingOrder1) {
        return new OBWriteInternationalStandingOrder2()
                .data(new OBWriteDataInternationalStandingOrder2()
                        .consentId(obWriteInternationalStandingOrder1.getData().getConsentId())
                        .initiation(toOBInternationalStandingOrder2(obWriteInternationalStandingOrder1.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrder1.getRisk());
    }

    public static OBWriteInternationalStandingOrder1 toOBWriteInternationalStandingOrder1(OBWriteInternationalStandingOrder2 obWriteInternationalStandingOrder2) {
        return new OBWriteInternationalStandingOrder1()
                .data(new OBWriteDataInternationalStandingOrder1()
                        .consentId(obWriteInternationalStandingOrder2.getData().getConsentId())
                        .initiation(toOBInternationalStandingOrder1(obWriteInternationalStandingOrder2.getData().getInitiation()))
                )
                .risk(obWriteInternationalStandingOrder2.getRisk());
    }

}
