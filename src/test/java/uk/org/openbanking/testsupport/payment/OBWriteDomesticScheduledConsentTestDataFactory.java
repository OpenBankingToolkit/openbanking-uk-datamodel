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
import uk.org.openbanking.datamodel.payment.OBDomesticScheduled2;
import uk.org.openbanking.datamodel.payment.OBExternalPermissions2Code;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticScheduledConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataSCASupportData;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduled2DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3Data;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;

/**
 * Test data factory for the various "OBWriteDomesticScheduledConsent" classes.
 */
public class OBWriteDomesticScheduledConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM021";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.02";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.CHAPS";

    public static OBWriteDomesticScheduledConsent2 aValidOBWriteDomesticScheduledConsent2() {
        return (new OBWriteDomesticScheduledConsent2())
                .data(aValidOBWriteDataDomesticScheduledConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticScheduledConsent3 aValidOBWriteDomesticScheduledConsent3() {
        return (new OBWriteDomesticScheduledConsent3())
                .data(aValidOBWriteDomesticScheduledConsent3Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDataDomesticScheduledConsent2 aValidOBWriteDataDomesticScheduledConsent2() {
        return (new OBWriteDataDomesticScheduledConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticScheduled2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDomesticScheduledConsent3Data aValidOBWriteDomesticScheduledConsent3Data() {
        return (new OBWriteDomesticScheduledConsent3Data())
                .permission(OBWriteDomesticScheduledConsent3Data.PermissionEnum.CREATE)
                .initiation(aValidOBWriteDomesticScheduled2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(new OBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBDomesticScheduled2 aValidOBDomesticScheduled2() {
        return (new OBDomesticScheduled2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(DateTime.now())
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditorAccount(aValidOBCashAccount3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteDomesticScheduled2DataInitiation aValidOBWriteDomesticScheduled2DataInitiation() {
        return (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(DateTime.now())
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

}
