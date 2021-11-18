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

import org.junit.Test;
import uk.org.openbanking.datamodel.account.OBCashAccount3;
import uk.org.openbanking.datamodel.payment.OBAuthorisation1;
import uk.org.openbanking.datamodel.payment.OBExternalAuthorisation1Code;
import uk.org.openbanking.datamodel.payment.OBFile2;
import uk.org.openbanking.datamodel.payment.OBRemittanceInformation1;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.payment.OBWriteDataFileConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteFileConsent3Data;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteFileConsentConverter.toOBWriteFileConsent2;
import static uk.org.openbanking.testsupport.payment.OBWriteFileConsentTestDataFactory.aValidOBWriteFileConsent3Data;

/**
 * Unit test for {@link OBWriteFileConsentConverter}.
 */
public class OBWriteFileConsentConverterTest {

    @Test
    public void shouldConvertToOBWriteDomesticConsent2() {
        // Given
        OBWriteFileConsent3Data data = aValidOBWriteFileConsent3Data();
        OBWriteFileConsent3 obWriteFileConsent3 = new OBWriteFileConsent3();
        obWriteFileConsent3.data(data);
        OBWriteDataFileConsent2 expectedData = expectedObWriteDataFileConsent2(data);

        // When
        OBWriteFileConsent2 obWriteFileConsent2 = toOBWriteFileConsent2(obWriteFileConsent3);

        // Then
        assertThat(obWriteFileConsent2.getData()).isEqualTo(expectedData);
    }

    private OBWriteDataFileConsent2 expectedObWriteDataFileConsent2(OBWriteFileConsent3Data data) {
        return (new OBWriteDataFileConsent2())
                .initiation(expectedObFile2(data))
                .authorisation(expectedObAuthorisation1(data));
    }

    private OBFile2 expectedObFile2(OBWriteFileConsent3Data data) {
        return (new OBFile2())
                .fileType(data.getInitiation().getFileType())
                .fileHash(data.getInitiation().getFileHash())
                .fileReference(data.getInitiation().getFileReference())
                .numberOfTransactions(data.getInitiation().getNumberOfTransactions())
                .controlSum(data.getInitiation().getControlSum())
                .requestedExecutionDateTime(data.getInitiation().getRequestedExecutionDateTime())
                .localInstrument(data.getInitiation().getLocalInstrument())
                .debtorAccount((new OBCashAccount3())
                        .schemeName(data.getInitiation().getDebtorAccount().getSchemeName())
                        .identification(data.getInitiation().getDebtorAccount().getIdentification())
                        .name(data.getInitiation().getDebtorAccount().getName())
                        .secondaryIdentification(data.getInitiation().getDebtorAccount().getSecondaryIdentification()))
                .remittanceInformation((new OBRemittanceInformation1())
                        .unstructured(data.getInitiation().getRemittanceInformation().getUnstructured())
                        .reference(data.getInitiation().getRemittanceInformation().getReference()))
                .supplementaryData(new OBSupplementaryData1());
    }

    private OBAuthorisation1 expectedObAuthorisation1(OBWriteFileConsent3Data data) {
        return (new OBAuthorisation1())
                .authorisationType(OBExternalAuthorisation1Code.valueOf(data.getAuthorisation().getAuthorisationType().name()))
                .completionDateTime(data.getAuthorisation().getCompletionDateTime());
    }

}