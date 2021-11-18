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
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteFile2DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3Data;

import java.math.BigDecimal;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.aValidOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBSCASupportData1;

/**
 * Test data factory for the {@link OBWriteFileConsent3Data}.
 */
public class OBWriteFileConsentTestDataFactory {

    public static OBWriteFileConsent3 aValidOBWriteFileConsent3() {
        return new OBWriteFileConsent3().data(aValidOBWriteFileConsent3Data());
    }

    public static OBWriteFileConsent3Data aValidOBWriteFileConsent3Data() {
        DateTime now = DateTime.now();
        return (new OBWriteFileConsent3Data())
                .initiation((new OBWriteFile2DataInitiation())
                        .fileType("UK.OBIE.pain.001.001.08")
                        .fileHash("m5ah/h1UjLvJYMxqAoZmj9dKdjZnsGNm+yMkJp/KuqQ")
                        .fileReference("GB2OK238")
                        .numberOfTransactions("1")
                        .controlSum(BigDecimal.ONE)
                        .requestedExecutionDateTime(now)
                        .localInstrument("UK.OBIE.CHAPS")
                        .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                        .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                        .supplementaryData(new OBSupplementaryData1()))
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBSCASupportData1());
    }
}
