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
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduledConsent4Data.PermissionEnum;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBExchangeRate1;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBPartyIdentification43;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditor;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditorAgent;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;

/**
 * Test data factory for the various "OBWriteInternationalScheduledConsent" classes.
 */
public class OBWriteInternationalScheduledConsentTestDataFactory {

    public static OBWriteInternationalScheduledConsent1 aValidOBWriteInternationalScheduledConsent1() {
        return (new OBWriteInternationalScheduledConsent1())
                .data(aValidOBWriteDataInternationalScheduledConsent1())
                .risk(new OBRisk1());
    }

    public static OBWriteInternationalScheduledConsent2 aValidOBWriteInternationalScheduledConsent2() {
        return (new OBWriteInternationalScheduledConsent2())
                .data(aValidOBWriteDataInternationalScheduledConsent2())
                .risk(new OBRisk1());
    }

    public static OBWriteInternationalScheduledConsent4 aValidOBWriteInternationalScheduledConsent4() {
        return (new OBWriteInternationalScheduledConsent4())
                .data(aValidOBWriteInternationalScheduledConsent4Data())
                .risk(new OBRisk1());
    }

    public static OBWriteDataInternationalScheduledConsent1 aValidOBWriteDataInternationalScheduledConsent1() {
        return (new OBWriteDataInternationalScheduledConsent1())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBInternationalScheduled1())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDataInternationalScheduledConsent2 aValidOBWriteDataInternationalScheduledConsent2() {
        return (new OBWriteDataInternationalScheduledConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBInternationalScheduled2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteInternationalScheduledConsent4Data aValidOBWriteInternationalScheduledConsent4Data() {
        return (new OBWriteInternationalScheduledConsent4Data())
                .permission(PermissionEnum.CREATE)
                .initiation(aValidOBWriteInternationalScheduled3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(new OBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalScheduled3DataInitiation aValidOBWriteInternationalScheduled3DataInitiation() {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification("ANSM020")
                .endToEndIdentification("FRESCO.21302.GFX.01")
                .localInstrument("UK.OBIE.BACS")
                .instructionPriority(OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum.URGENT)
                .purpose("CDCD")
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer("USD")
                .destinationCountryCode("GB")
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .exchangeRateInformation(aValidOBWriteInternational3DataInitiationExchangeRateInformation())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditor(aValidOBWriteInternational3DataInitiationCreditor())
                .creditorAgent(aValidOBWriteInternational3DataInitiationCreditorAgent())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBInternationalScheduled1 aValidOBInternationalScheduled1() {
        return (new OBInternationalScheduled1())
                .instructionIdentification("ANSM020")
                .endToEndIdentification("FRESCO.21302.GFX.01")
                .localInstrument("UK.OBIE.BACS")
                .instructionPriority(OBPriority2Code.URGENT)
                .purpose("CDCD")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer("USD")
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .exchangeRateInformation(aValidOBExchangeRate1())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .remittanceInformation(aValidOBRemittanceInformation1());
    }

    public static OBInternationalScheduled2 aValidOBInternationalScheduled2() {
        return (new OBInternationalScheduled2())
                .instructionIdentification("ANSM020")
                .endToEndIdentification("FRESCO.21302.GFX.01")
                .localInstrument("UK.OBIE.BACS")
                .instructionPriority(OBPriority2Code.URGENT)
                .purpose("CDCD")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .requestedExecutionDateTime(DateTime.now())
                .currencyOfTransfer("USD")
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .exchangeRateInformation(aValidOBExchangeRate1())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }
}
