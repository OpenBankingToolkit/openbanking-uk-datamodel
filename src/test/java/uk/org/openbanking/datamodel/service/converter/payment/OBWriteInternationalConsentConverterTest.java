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
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteInternationalConsentConverter.toOBWriteInternationalConsent4;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalConsentTestDataFactory.aValidOBWriteInternationalConsent2;

/**
 * Unit test for {@link OBWriteInternationalConsentConverter}.
 */
public class OBWriteInternationalConsentConverterTest {

    @Test
    public void shouldConvertToOBWriteInternationalConsent4() {
        // Given
        OBWriteInternationalConsent2 source = aValidOBWriteInternationalConsent2();
        OBWriteInternationalConsent4Data expectedData = expectedOBWriteInternationalConsent4Data(source.getData());

        // When
        OBWriteInternationalConsent4 converted = toOBWriteInternationalConsent4(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    private OBWriteInternationalConsent4Data expectedOBWriteInternationalConsent4Data(OBWriteDataInternationalConsent2 data) {
        return (new OBWriteInternationalConsent4Data())
                .initiation(expectedOBWriteInternational3DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    private OBWriteInternational3DataInitiation expectedOBWriteInternational3DataInitiation(OBInternational2 initiation) {
        return (new OBWriteInternational3DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(OBWriteInternational3DataInitiation.InstructionPriorityEnum.valueOf(initiation.getInstructionPriority().name()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(null)
                .instructedAmount((new OBWriteDomestic2DataInitiationInstructedAmount())
                        .currency(initiation.getInstructedAmount().getCurrency())
                        .amount(initiation.getInstructedAmount().getAmount()))
                .exchangeRateInformation((new OBWriteInternational3DataInitiationExchangeRateInformation())
                        .unitCurrency(initiation.getExchangeRateInformation().getUnitCurrency())
                        .exchangeRate(initiation.getExchangeRateInformation().getExchangeRate())
                        .rateType(OBWriteInternational3DataInitiationExchangeRateInformation.RateTypeEnum.valueOf(initiation.getExchangeRateInformation().getRateType().name()))
                        .contractIdentification(initiation.getExchangeRateInformation().getContractIdentification()))
                .debtorAccount((new OBWriteDomestic2DataInitiationDebtorAccount())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditor((new OBWriteInternational3DataInitiationCreditor())
                        .name(initiation.getCreditor().getName())
                        .postalAddress(initiation.getCreditor().getPostalAddress()))
                .creditorAgent((new OBWriteInternational3DataInitiationCreditorAgent())
                        .schemeName(initiation.getCreditorAgent().getSchemeName())
                        .identification(initiation.getCreditorAgent().getIdentification())
                        .name(initiation.getCreditorAgent().getName())
                        .postalAddress(initiation.getCreditorAgent().getPostalAddress()))
                .creditorAccount((new OBWriteDomestic2DataInitiationCreditorAccount())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
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
