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
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.*;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBDomestic2InstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.*;

/**
 * Test data factory for the various "OBWriteInternationalStandingOrderConsent" classes.
 */
public class OBWriteInternationalStandingOrderConsentTestDataFactory {

    private static final String FREQUENCY = "EvryWorkgDay";
    private static final String REFERENCE = "Ipsum Non Arcu Inc.";
    private static final String NUMBER_OF_PAYMENTS = "1";
    private static final String PURPOSE = "CDCD";
    private static final String CURRENCY = "USD";

    public static OBWriteInternationalStandingOrderConsent2 aValidOBWriteInternationalStandingOrderConsent2() {
        return (new OBWriteInternationalStandingOrderConsent2())
                .data(aValidOBWriteDataInternationalStandingOrderConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent3 aValidOBWriteInternationalStandingOrderConsent3() {
        return (new OBWriteInternationalStandingOrderConsent3())
                .data(aValidOBWriteDataInternationalStandingOrderConsent3())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent4 aValidOBWriteInternationalStandingOrderConsent4() {
        return (new OBWriteInternationalStandingOrderConsent4())
                .data(aValidOBWriteInternationalStandingOrderConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent5 aValidOBWriteInternationalStandingOrderConsent5() {
        return (new OBWriteInternationalStandingOrderConsent5())
                .data(aValidOBWriteInternationalStandingOrderConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent6 aValidOBWriteInternationalStandingOrderConsent6() {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(aValidOBWriteInternationalStandingOrderConsent6Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDataInternationalStandingOrderConsent2 aValidOBWriteDataInternationalStandingOrderConsent2() {
        return (new OBWriteDataInternationalStandingOrderConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBInternationalStandingOrder2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataInternationalStandingOrderConsent3 aValidOBWriteDataInternationalStandingOrderConsent3() {
        return (new OBWriteDataInternationalStandingOrderConsent3())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBInternationalStandingOrder3())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteInternationalStandingOrderConsent4Data aValidOBWriteInternationalStandingOrderConsent4Data() {
        return (new OBWriteInternationalStandingOrderConsent4Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(new OBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalStandingOrderConsent5Data aValidOBWriteInternationalStandingOrderConsent5Data() {
        return (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder4DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalStandingOrderConsent6Data aValidOBWriteInternationalStandingOrderConsent6Data() {
        return (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBWriteInternationalStandingOrder4DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccountEnum.NO);
    }

    public static OBInternationalStandingOrder2 aValidOBInternationalStandingOrder2() {
        DateTime now = DateTime.now();
        return (new OBInternationalStandingOrder2())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBInternationalStandingOrder3 aValidOBInternationalStandingOrder3() {
        DateTime now = DateTime.now();
        return (new OBInternationalStandingOrder3())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBDomestic2InstructedAmount())
                .debtorAccount(aValidOBCashAccountDebtor4())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification6())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternationalStandingOrder3DataInitiation aValidOBWriteInternationalStandingOrder3DataInitiation() {
        DateTime now = DateTime.now();
        return (new OBWriteInternationalStandingOrder3DataInitiation())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .debtorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                .creditor(aValidOBWriteInternational2DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternationalStandingOrder3DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteInternationalStandingOrder3DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }


    public static OBWriteInternationalStandingOrder4DataInitiation aValidOBWriteInternationalStandingOrder4DataInitiation() {
        DateTime now = DateTime.now();
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(FREQUENCY)
                .reference(REFERENCE)
                .numberOfPayments(NUMBER_OF_PAYMENTS)
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose(PURPOSE)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .destinationCountryCode("GB")
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .debtorAccount(aValidOBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                .creditor(aValidOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                .supplementaryData(new OBSupplementaryData1());
    }
}
