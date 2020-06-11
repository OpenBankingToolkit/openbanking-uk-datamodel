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

import uk.org.openbanking.datamodel.payment.OBChargeBearerType1Code;
import uk.org.openbanking.datamodel.payment.OBInternational2;
import uk.org.openbanking.datamodel.payment.OBPriority2Code;
import uk.org.openbanking.datamodel.payment.OBRisk1;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteDataInternationalConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalConsent2;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBExchangeRate1;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBPartyIdentification43;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;

/**
 * Test data factory for the various "OBWriteInternationalConsent" classes.
 */
public class OBWriteInternationalConsentTestDataFactory {

    public static OBWriteInternationalConsent2 aValidOBWriteInternationalConsent2() {
        return (new OBWriteInternationalConsent2())
                .data(aValidOBWriteDataInternationalConsent2())
                .risk(new OBRisk1());
    }

    public static OBWriteDataInternationalConsent2 aValidOBWriteDataInternationalConsent2() {
        return (new OBWriteDataInternationalConsent2())
                .initiation(aValidOBInternational2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBInternational2 aValidOBInternational2() {
        return (new OBInternational2())
                .instructionIdentification("ANSM020")
                .endToEndIdentification("FRESCO.21302.GFX.01")
                .localInstrument("UK.OBIE.BACS")
                .instructionPriority(OBPriority2Code.NORMAL)
                .purpose("CDCD")
                .chargeBearer(OBChargeBearerType1Code.SHARED)
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
