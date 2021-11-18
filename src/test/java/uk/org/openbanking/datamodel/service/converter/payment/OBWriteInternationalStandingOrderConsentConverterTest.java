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

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteInternationalStandingOrderConsentConverter.toOBWriteInternationalStandingOrderConsent5;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalStandingOrderConsentTestDataFactory.aValidOBWriteInternationalStandingOrderConsent2;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalStandingOrderConsentTestDataFactory.aValidOBWriteInternationalStandingOrderConsent3;

/**
 * Unit test for {@link OBWriteInternationalStandingOrderConsentConverter}.
 */
public class OBWriteInternationalStandingOrderConsentConverterTest {

    @Test
    public void shouldConvertOBWriteInternationalStandingOrderConsent2ToOBWriteInternationalStandingOrderConsent5() {
        // Given
        OBWriteInternationalStandingOrderConsent2 source = aValidOBWriteInternationalStandingOrderConsent2();
        OBWriteInternationalStandingOrderConsent5Data expectedData = expectedOBWriteInternationalStandingOrderConsent5Data(source.getData());

        // When
        OBWriteInternationalStandingOrderConsent5 converted = toOBWriteInternationalStandingOrderConsent5(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    @Test
    public void shouldConvertOBWriteInternationalStandingOrderConsent3ToOBWriteInternationalStandingOrderConsent5() {
        // Given
        OBWriteInternationalStandingOrderConsent3 source = aValidOBWriteInternationalStandingOrderConsent3();
        OBWriteInternationalStandingOrderConsent5Data expectedData = expectedOBWriteInternationalStandingOrderConsent5Data(source.getData());

        // When
        OBWriteInternationalStandingOrderConsent5 converted = toOBWriteInternationalStandingOrderConsent5(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    private OBWriteInternationalStandingOrderConsent5Data expectedOBWriteInternationalStandingOrderConsent5Data(OBWriteDataInternationalStandingOrderConsent2 data) {
        return (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(data.getPermission())
                .initiation(expectedOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()));
    }

    private OBWriteInternationalStandingOrderConsent5Data expectedOBWriteInternationalStandingOrderConsent5Data(OBWriteDataInternationalStandingOrderConsent3 data) {
        return (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(data.getPermission())
                .initiation(expectedOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()));
    }

    private OBWriteInternationalStandingOrder4DataInitiation expectedOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder2 initiation) {
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode("GB")
                .instructedAmount((new OBWriteDomestic2DataInitiationInstructedAmount())
                        .currency(initiation.getInstructedAmount().getCurrency())
                        .amount(initiation.getInstructedAmount().getAmount()))
                .debtorAccount((new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditor((new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                        .name(initiation.getCreditor().getName())
                        .postalAddress(initiation.getCreditor().getPostalAddress()))
                .creditorAgent((new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                        .schemeName(initiation.getCreditorAgent().getSchemeName())
                        .identification(initiation.getCreditorAgent().getIdentification())
                        .name(initiation.getCreditorAgent().getName())
                        .postalAddress(initiation.getCreditorAgent().getPostalAddress()))
                .creditorAccount((new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    private OBWriteInternationalStandingOrder4DataInitiation expectedOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder3 initiation) {
        return (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode("GB")
                .instructedAmount((new OBWriteDomestic2DataInitiationInstructedAmount())
                        .currency(initiation.getInstructedAmount().getCurrency())
                        .amount(initiation.getInstructedAmount().getAmount()))
                .debtorAccount((new OBWriteDomesticStandingOrder3DataInitiationDebtorAccount())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditor((new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                        .name(initiation.getCreditor().getName())
                        .postalAddress(initiation.getCreditor().getPostalAddress()))
                .creditorAgent((new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                        .schemeName(initiation.getCreditorAgent().getSchemeName())
                        .identification(initiation.getCreditorAgent().getIdentification())
                        .name(initiation.getCreditorAgent().getName())
                        .postalAddress(initiation.getCreditorAgent().getPostalAddress()))
                .creditorAccount((new OBWriteInternationalStandingOrder4DataInitiationCreditorAccount())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    private OBWriteDomesticConsent3DataAuthorisation expectedOBWriteDomesticConsent3DataAuthorisation(OBAuthorisation1 authorisation) {
        return (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(authorisation.getAuthorisationType())
                .completionDateTime(authorisation.getCompletionDateTime());
    }
}
