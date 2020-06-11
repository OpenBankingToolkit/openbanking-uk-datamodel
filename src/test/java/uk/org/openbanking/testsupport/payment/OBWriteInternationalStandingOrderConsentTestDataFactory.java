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

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccountDebtor4;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBDomestic2InstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification6;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBPartyIdentification43;

/**
 * Test data factory for the various "OBWriteInternationalStandingOrderConsent" classes.
 */
public class OBWriteInternationalStandingOrderConsentTestDataFactory {

    public static OBWriteInternationalStandingOrderConsent2 aValidOBWriteInternationalStandingOrderConsent2() {
        return (new OBWriteInternationalStandingOrderConsent2())
                .data(aValidOBWriteDataInternationalStandingOrderConsent2())
                .risk(new OBRisk1());
    }

    public static OBWriteInternationalStandingOrderConsent3 aValidOBWriteInternationalStandingOrderConsent3() {
        return (new OBWriteInternationalStandingOrderConsent3())
                .data(aValidOBWriteDataInternationalStandingOrderConsent3())
                .risk(new OBRisk1());
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

    public static OBInternationalStandingOrder2 aValidOBInternationalStandingOrder2() {
        DateTime now = DateTime.now();
        return (new OBInternationalStandingOrder2())
                .frequency("EvryWorkgDay")
                .reference("Ipsum Non Arcu Inc.")
                .numberOfPayments("1")
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose("CDCD")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer("USD")
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .supplementaryData(new OBSupplementaryData1());
    }

    private static OBInternationalStandingOrder3 aValidOBInternationalStandingOrder3() {
        DateTime now = DateTime.now();
        return (new OBInternationalStandingOrder3())
                .frequency("EvryWorkgDay")
                .reference("Ipsum Non Arcu Inc.")
                .numberOfPayments("1")
                .firstPaymentDateTime(now)
                .finalPaymentDateTime(now)
                .purpose("CDCD")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer("USD")
                .instructedAmount(aValidOBDomestic2InstructedAmount())
                .debtorAccount(aValidOBCashAccountDebtor4())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification6())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .supplementaryData(new OBSupplementaryData1());
    }
}
