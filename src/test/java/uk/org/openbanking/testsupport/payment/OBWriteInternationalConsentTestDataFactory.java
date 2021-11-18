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

import uk.org.openbanking.datamodel.payment.*;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBExchangeRate1;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBPartyIdentification43;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditor;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBWriteInternational3DataInitiationCreditorAgent;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.*;

/**
 * Test data factory for the various "OBWriteInternationalConsent" classes.
 */
public class OBWriteInternationalConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM020";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.01";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.BACS";
    private static final String PURPOSE = "CDCD";
    private static final String CURRENCY = "USD";

    public static OBWriteInternationalConsent2 aValidOBWriteInternationalConsent2() {
        return (new OBWriteInternationalConsent2())
                .data(aValidOBWriteDataInternationalConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalConsent4 aValidOBWriteInternationalConsent4() {
        return (new OBWriteInternationalConsent4())
                .data(aValidOBWriteInternationalConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteInternationalConsent5 aValidOBWriteInternationalConsent5() {
        return (new OBWriteInternationalConsent5())
                .data(aValidOBWriteInternationalConsent5Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDataInternationalConsent2 aValidOBWriteDataInternationalConsent2() {
        return (new OBWriteDataInternationalConsent2())
                .initiation(aValidOBInternational2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteInternationalConsent4Data aValidOBWriteInternationalConsent4Data() {
        return (new OBWriteInternationalConsent4Data())
                .initiation(aValidOBWriteInternational3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteInternationalConsent5Data aValidOBWriteInternationalConsent5Data() {
        return (new OBWriteInternationalConsent5Data())
                .initiation(aValidOBWriteInternational3DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1())
                .readRefundAccount(OBReadRefundAccountEnum.NO);
    }

    public static OBInternational2 aValidOBInternational2() {
        return (new OBInternational2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBPriority2Code.NORMAL)
                .purpose(PURPOSE)
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .exchangeRateInformation(aValidOBExchangeRate1())
                .debtorAccount(aValidOBCashAccount3())
                .creditor(aValidOBPartyIdentification43())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification3())
                .creditorAccount(aValidOBCashAccount3())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteInternational3DataInitiation aValidOBWriteInternational3DataInitiation() {
        return (new OBWriteInternational3DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructionPriority(OBPriority2Code.NORMAL)
                .purpose(PURPOSE)
                .extendedPurpose("Extended purpose")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
                .currencyOfTransfer(CURRENCY)
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
}
