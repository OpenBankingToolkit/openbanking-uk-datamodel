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
import uk.org.openbanking.datamodel.payment.OBRisk1;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticScheduledConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent2;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBAuthorisation1;
import static uk.org.openbanking.testsupport.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;

/**
 * Test data factory for the various "OBWriteDomesticScheduledConsent" classes.
 */
public class OBWriteDomesticScheduledConsentTestDataFactory {

    public static OBWriteDomesticScheduledConsent2 aValidOBWriteDomesticScheduledConsent2() {
        return (new OBWriteDomesticScheduledConsent2())
                .data(aValidOBWriteDataDomesticScheduledConsent2())
                .risk(new OBRisk1());
    }

    public static OBWriteDataDomesticScheduledConsent2 aValidOBWriteDataDomesticScheduledConsent2() {
        return (new OBWriteDataDomesticScheduledConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticScheduled2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBDomesticScheduled2 aValidOBDomesticScheduled2() {
        return (new OBDomesticScheduled2())
                .instructionIdentification("ANSM021")
                .endToEndIdentification("FRESCO.21302.GFX.02")
                .localInstrument("UK.OBIE.CHAPS")
                .requestedExecutionDateTime(DateTime.now())
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditorAccount(aValidOBCashAccount3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

}
