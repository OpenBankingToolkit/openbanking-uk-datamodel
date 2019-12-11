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

public class OBDomesticStandingOrderConverter {

    public static OBDomesticStandingOrder2 toOBDomesticStandingOrder2(OBDomesticStandingOrder1 domesticStandingOrder1) {
        return new OBDomesticStandingOrder2()
                .creditorAccount(domesticStandingOrder1.getCreditorAccount())
                .debtorAccount(domesticStandingOrder1.getDebtorAccount())
                .finalPaymentAmount(domesticStandingOrder1.getFinalPaymentAmount())
                .finalPaymentDateTime(domesticStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentAmount(domesticStandingOrder1.getFirstPaymentAmount())
                .firstPaymentDateTime(domesticStandingOrder1.getFirstPaymentDateTime())
                .recurringPaymentAmount(domesticStandingOrder1.getRecurringPaymentAmount())
                .recurringPaymentDateTime(domesticStandingOrder1.getRecurringPaymentDateTime())
                .frequency(domesticStandingOrder1.getFrequency())
                .numberOfPayments(domesticStandingOrder1.getNumberOfPayments())
                .reference(domesticStandingOrder1.getReference());
    }

    public static OBDomesticStandingOrder1 toOBDomesticStandingOrder1(OBDomesticStandingOrder2 domesticStandingOrder2) {
        return new OBDomesticStandingOrder1()
                .creditorAccount(domesticStandingOrder2.getCreditorAccount())
                .debtorAccount(domesticStandingOrder2.getDebtorAccount())
                .finalPaymentAmount(domesticStandingOrder2.getFinalPaymentAmount())
                .finalPaymentDateTime(domesticStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentAmount(domesticStandingOrder2.getFirstPaymentAmount())
                .firstPaymentDateTime(domesticStandingOrder2.getFirstPaymentDateTime())
                .recurringPaymentAmount(domesticStandingOrder2.getRecurringPaymentAmount())
                .recurringPaymentDateTime(domesticStandingOrder2.getRecurringPaymentDateTime())
                .frequency(domesticStandingOrder2.getFrequency())
                .numberOfPayments(domesticStandingOrder2.getNumberOfPayments())
                .reference(domesticStandingOrder2.getReference());
    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return new OBWriteDomesticStandingOrderConsent2()
                .data(new OBWriteDataDomesticStandingOrderConsent2()
                        .authorisation(obWriteDomesticStandingOrderConsent1.getData().getAuthorisation())
                        .initiation(toOBDomesticStandingOrder2(obWriteDomesticStandingOrderConsent1.getData().getInitiation()))
                        .permission(obWriteDomesticStandingOrderConsent1.getData().getPermission())
                )
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return new OBWriteDomesticStandingOrderConsent1()
                .data(new OBWriteDataDomesticStandingOrderConsent1()
                        .authorisation(obWriteDomesticStandingOrderConsent2.getData().getAuthorisation())
                        .initiation(toOBDomesticStandingOrder1(obWriteDomesticStandingOrderConsent2.getData().getInitiation()))
                        .permission(obWriteDomesticStandingOrderConsent2.getData().getPermission())
                )
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrder2 toOBWriteDomesticStandingOrder2(OBWriteDomesticStandingOrder1 obWriteDomesticStandingOrder1) {
        return new OBWriteDomesticStandingOrder2()
                .data(new OBWriteDataDomesticStandingOrder2()
                        .consentId(obWriteDomesticStandingOrder1.getData().getConsentId())
                        .initiation(toOBDomesticStandingOrder2(obWriteDomesticStandingOrder1.getData().getInitiation()))
                )
                .risk(obWriteDomesticStandingOrder1.getRisk());
    }

    public static OBWriteDomesticStandingOrder1 toOBWriteDomesticStandingOrder1(OBWriteDomesticStandingOrder2 obWriteDomesticStandingOrder2) {
        return new OBWriteDomesticStandingOrder1()
                .data(new OBWriteDataDomesticStandingOrder1()
                        .consentId(obWriteDomesticStandingOrder2.getData().getConsentId())
                        .initiation(toOBDomesticStandingOrder1(obWriteDomesticStandingOrder2.getData().getInitiation()))
                )
                .risk(obWriteDomesticStandingOrder2.getRisk());
    }
}
