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
import uk.org.openbanking.datamodel.payment.*;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataAuthorisation.AuthorisationTypeEnum;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteDomesticScheduledConsentConverter.toOBWriteDomesticScheduledConsent3;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScheduledConsentTestDataFactory.aValidOBWriteDomesticScheduledConsent2;

/**
 * Unit test for {@link OBWriteDomesticScheduledConsentConverter}.
 */
public class OBWriteDomesticScheduledConsentConverterTest {

    @Test
    public void shouldConvertToOBWriteDomesticScheduledConsent3() {
        // Given
        OBWriteDomesticScheduledConsent2 source = aValidOBWriteDomesticScheduledConsent2();
        OBWriteDomesticScheduledConsent3Data expectedData = expectedOBWriteDomesticScheduledConsent3Data(source.getData());

        // When
        OBWriteDomesticScheduledConsent3 converted = toOBWriteDomesticScheduledConsent3(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    private OBWriteDomesticScheduledConsent3Data expectedOBWriteDomesticScheduledConsent3Data(OBWriteDataDomesticScheduledConsent2 data) {
        return (new OBWriteDomesticScheduledConsent3Data())
                .permission(OBWriteDomesticScheduledConsent3Data.PermissionEnum.CREATE)
                .initiation(expectedOBWriteDomesticScheduled2DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    private OBWriteDomesticScheduled2DataInitiation expectedOBWriteDomesticScheduled2DataInitiation(OBDomesticScheduled2 initiation) {
        return (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount((new OBWriteDomestic2DataInitiationInstructedAmount())
                        .currency(initiation.getInstructedAmount().getCurrency())
                        .amount(initiation.getInstructedAmount().getAmount()))
                .debtorAccount((new OBWriteDomestic2DataInitiationDebtorAccount())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditorAccount((new OBWriteDomestic2DataInitiationCreditorAccount())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation((new OBWriteDomestic2DataInitiationRemittanceInformation())
                        .reference(initiation.getRemittanceInformation().getReference())
                        .unstructured(initiation.getRemittanceInformation().getUnstructured()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    private OBWriteDomesticConsent3DataAuthorisation expectedOBWriteDomesticConsent3DataAuthorisation(OBAuthorisation1 authorisation) {
        return (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(AuthorisationTypeEnum.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }
}