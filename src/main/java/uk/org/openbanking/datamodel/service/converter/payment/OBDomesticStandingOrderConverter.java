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

import uk.org.openbanking.datamodel.payment.OBDomesticStandingOrder1;
import uk.org.openbanking.datamodel.payment.OBDomesticStandingOrder2;
import uk.org.openbanking.datamodel.payment.OBDomesticStandingOrder3;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticStandingOrder3DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccountCreditor3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccountDebtor4;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.*;

public class OBDomesticStandingOrderConverter {

    public static OBDomesticStandingOrder1 toOBDomesticStandingOrder1(OBDomesticStandingOrder2 obDomesticStandingOrder2) {
        return obDomesticStandingOrder2 == null ? null : (new OBDomesticStandingOrder1())
                .frequency(obDomesticStandingOrder2.getFrequency())
                .reference(obDomesticStandingOrder2.getReference())
                .numberOfPayments(obDomesticStandingOrder2.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder2.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder2.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentAmount(obDomesticStandingOrder2.getFirstPaymentAmount())
                .recurringPaymentAmount(obDomesticStandingOrder2.getRecurringPaymentAmount())
                .finalPaymentAmount(obDomesticStandingOrder2.getFinalPaymentAmount())
                .debtorAccount(obDomesticStandingOrder2.getDebtorAccount())
                .creditorAccount(obDomesticStandingOrder2.getCreditorAccount());
    }

    public static OBDomesticStandingOrder1 toOBDomesticStandingOrder1(OBDomesticStandingOrder3 obDomesticStandingOrder3) {
        return obDomesticStandingOrder3 == null ? null : (new OBDomesticStandingOrder1())
                .frequency(obDomesticStandingOrder3.getFrequency())
                .reference(obDomesticStandingOrder3.getReference())
                .numberOfPayments(obDomesticStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder3.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder3.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder3.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getFinalPaymentAmount()))
                .debtorAccount(toOBCashAccount3(obDomesticStandingOrder3.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(obDomesticStandingOrder3.getCreditorAccount()));
    }

    public static OBDomesticStandingOrder2 toOBDomesticStandingOrder2(OBDomesticStandingOrder1 obDomesticStandingOrder1) {
        return obDomesticStandingOrder1 == null ? null : (new OBDomesticStandingOrder2())
                .frequency(obDomesticStandingOrder1.getFrequency())
                .reference(obDomesticStandingOrder1.getReference())
                .numberOfPayments(obDomesticStandingOrder1.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder1.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder1.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentAmount(obDomesticStandingOrder1.getFirstPaymentAmount())
                .recurringPaymentAmount(obDomesticStandingOrder1.getRecurringPaymentAmount())
                .finalPaymentAmount(obDomesticStandingOrder1.getFinalPaymentAmount())
                .debtorAccount(obDomesticStandingOrder1.getDebtorAccount())
                .creditorAccount(obDomesticStandingOrder1.getCreditorAccount())
                .supplementaryData(null);
    }

    public static OBDomesticStandingOrder2 toOBDomesticStandingOrder2(OBDomesticStandingOrder3 obDomesticStandingOrder3) {
        return obDomesticStandingOrder3 == null ? null : (new OBDomesticStandingOrder2())
                .frequency(obDomesticStandingOrder3.getFrequency())
                .reference(obDomesticStandingOrder3.getReference())
                .numberOfPayments(obDomesticStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder3.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder3.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder3.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBActiveOrHistoricCurrencyAndAmount(obDomesticStandingOrder3.getFinalPaymentAmount()))
                .debtorAccount(toOBCashAccount3(obDomesticStandingOrder3.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(obDomesticStandingOrder3.getCreditorAccount()))
                .supplementaryData(obDomesticStandingOrder3.getSupplementaryData());
    }

    public static OBDomesticStandingOrder3 toOBDomesticStandingOrder3(OBDomesticStandingOrder1 obDomesticStandingOrder1) {
        return obDomesticStandingOrder1 == null ? null : (new OBDomesticStandingOrder3())
                .frequency(obDomesticStandingOrder1.getFrequency())
                .reference(obDomesticStandingOrder1.getReference())
                .numberOfPayments(obDomesticStandingOrder1.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder1.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder1.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBDomesticStandingOrder3FirstPaymentAmount(obDomesticStandingOrder1.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBDomesticStandingOrder3RecurringPaymentAmount(obDomesticStandingOrder1.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBDomesticStandingOrder3FinalPaymentAmount(obDomesticStandingOrder1.getFinalPaymentAmount()))
                .debtorAccount(toOBCashAccountDebtor4(obDomesticStandingOrder1.getDebtorAccount()))
                .creditorAccount(toOBCashAccountCreditor3(obDomesticStandingOrder1.getCreditorAccount()))
                .supplementaryData(null);
    }

    public static OBDomesticStandingOrder3 toOBDomesticStandingOrder3(OBDomesticStandingOrder2 obDomesticStandingOrder2) {
        return obDomesticStandingOrder2 == null ? null : (new OBDomesticStandingOrder3())
                .frequency(obDomesticStandingOrder2.getFrequency())
                .reference(obDomesticStandingOrder2.getReference())
                .numberOfPayments(obDomesticStandingOrder2.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder2.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder2.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBDomesticStandingOrder3FirstPaymentAmount(obDomesticStandingOrder2.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBDomesticStandingOrder3RecurringPaymentAmount(obDomesticStandingOrder2.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBDomesticStandingOrder3FinalPaymentAmount(obDomesticStandingOrder2.getFinalPaymentAmount()))
                .debtorAccount(toOBCashAccountDebtor4(obDomesticStandingOrder2.getDebtorAccount()))
                .creditorAccount(toOBCashAccountCreditor3(obDomesticStandingOrder2.getCreditorAccount()))
                .supplementaryData(obDomesticStandingOrder2.getSupplementaryData());
    }

    public static OBDomesticStandingOrder3 toOBDomesticStandingOrder3(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        return initiation == null ? null : (new OBDomesticStandingOrder3())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(initiation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBDomesticStandingOrder3FirstPaymentAmount(initiation.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBDomesticStandingOrder3RecurringPaymentAmount(initiation.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBDomesticStandingOrder3FinalPaymentAmount(initiation.getFinalPaymentAmount()))
                .debtorAccount(toOBCashAccountDebtor4(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccountCreditor3(initiation.getCreditorAccount()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteDomesticStandingOrder3DataInitiation toOBWriteDomesticStandingOrder3DataInitiation(OBDomesticStandingOrder3 obDomesticStandingOrder3) {
        return obDomesticStandingOrder3 == null ? null : (new OBWriteDomesticStandingOrder3DataInitiation())
                .frequency(obDomesticStandingOrder3.getFrequency())
                .reference(obDomesticStandingOrder3.getReference())
                .numberOfPayments(obDomesticStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obDomesticStandingOrder3.getFirstPaymentDateTime())
                .recurringPaymentDateTime(obDomesticStandingOrder3.getRecurringPaymentDateTime())
                .finalPaymentDateTime(obDomesticStandingOrder3.getFinalPaymentDateTime())
                .firstPaymentAmount(toOBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount(obDomesticStandingOrder3.getFirstPaymentAmount()))
                .recurringPaymentAmount(toOBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount(obDomesticStandingOrder3.getRecurringPaymentAmount()))
                .finalPaymentAmount(toOBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount(obDomesticStandingOrder3.getFinalPaymentAmount()))
                .debtorAccount(toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(obDomesticStandingOrder3.getDebtorAccount()))
                .creditorAccount(toOBWriteDomesticStandingOrder3DataInitiationCreditorAccount(obDomesticStandingOrder3.getCreditorAccount()))
                .supplementaryData(obDomesticStandingOrder3.getSupplementaryData());
    }
}
