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
import uk.org.openbanking.datamodel.payment.*;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteInternationalScheduledConsentConverter.toOBWriteInternationalScheduledConsent1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteInternationalScheduledConsentConverter.toOBWriteInternationalScheduledConsent4;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalScheduledConsentTestDataFactory.aValidOBWriteInternationalScheduledConsent1;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalScheduledConsentTestDataFactory.aValidOBWriteInternationalScheduledConsent2;
import static uk.org.openbanking.testsupport.payment.OBWriteInternationalScheduledConsentTestDataFactory.aValidOBWriteInternationalScheduledConsent4;

/**
 * Unit test for {@link OBWriteInternationalScheduledConsentConverter}.
 */
public class OBWriteInternationalScheduledConsentConverterTest {

    @Test
    public void shouldConvertOBWriteInternationalScheduledConsent4ToOBWriteInternationalScheduledConsent1() {
        // Given
        OBWriteInternationalScheduledConsent4 source = aValidOBWriteInternationalScheduledConsent4();
        OBWriteDataInternationalScheduledConsent1 expectedData = expectedOBWriteDataInternationalScheduledConsent1(source.getData());

        // When
        OBWriteInternationalScheduledConsent1 converted = toOBWriteInternationalScheduledConsent1(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    @Test
    public void shouldConvertOBWriteInternationalScheduledConsent1ToOBWriteInternationalScheduledConsent4() {
        // Given
        OBWriteInternationalScheduledConsent1 source = aValidOBWriteInternationalScheduledConsent1();
        OBWriteInternationalScheduledConsent4Data expectedData = expectedOBWriteInternationalScheduledConsent4Data(source.getData());

        // When
        OBWriteInternationalScheduledConsent4 converted = toOBWriteInternationalScheduledConsent4(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    @Test
    public void shouldConvertOBWriteInternationalScheduledConsent2ToOBWriteInternationalScheduledConsent4() {
        // Given
        OBWriteInternationalScheduledConsent2 source = aValidOBWriteInternationalScheduledConsent2();
        OBWriteInternationalScheduledConsent4Data expectedData = expectedOBWriteInternationalScheduledConsent4Data(source.getData());

        // When
        OBWriteInternationalScheduledConsent4 converted = toOBWriteInternationalScheduledConsent4(source);

        // Then
        assertThat(converted.getData()).isEqualTo(expectedData);
        assertThat(converted.getRisk()).isEqualTo(source.getRisk());
    }

    private OBWriteDataInternationalScheduledConsent1 expectedOBWriteDataInternationalScheduledConsent1(OBWriteInternationalScheduledConsent4Data data) {
        return (new OBWriteDataInternationalScheduledConsent1())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(expectedOBInternationalScheduled1(data.getInitiation()))
                .authorisation(expectedOBAuthorisation1(data.getAuthorisation()));
    }

    private OBWriteInternationalScheduledConsent4Data expectedOBWriteInternationalScheduledConsent4Data(OBWriteDataInternationalScheduledConsent1 data) {
        return (new OBWriteInternationalScheduledConsent4Data())
                .permission(OBWriteInternationalScheduledConsent4Data.PermissionEnum.valueOf(data.getPermission().name()))
                .initiation(expectedOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    private OBWriteInternationalScheduledConsent4Data expectedOBWriteInternationalScheduledConsent4Data(OBWriteDataInternationalScheduledConsent2 data) {
        return (new OBWriteInternationalScheduledConsent4Data())
                .permission(OBWriteInternationalScheduledConsent4Data.PermissionEnum.valueOf(data.getPermission().name()))
                .initiation(expectedOBWriteInternationalScheduled3DataInitiation(data.getInitiation()))
                .authorisation(expectedOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    private OBInternationalScheduled1 expectedOBInternationalScheduled1(OBWriteInternationalScheduled3DataInitiation initiation) {
        return (new OBInternationalScheduled1())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(OBPriority2Code.valueOf(initiation.getInstructionPriority().name()))
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount((new OBActiveOrHistoricCurrencyAndAmount())
                        .currency(initiation.getInstructedAmount().getCurrency())
                        .amount(initiation.getInstructedAmount().getAmount()))
                .exchangeRateInformation((new OBExchangeRate1())
                        .unitCurrency(initiation.getExchangeRateInformation().getUnitCurrency())
                        .exchangeRate(initiation.getExchangeRateInformation().getExchangeRate())
                        .rateType(OBExchangeRateType2Code.valueOf(initiation.getExchangeRateInformation().getRateType().name()))
                        .contractIdentification(initiation.getExchangeRateInformation().getContractIdentification()))
                .debtorAccount((new OBCashAccount3())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditor((new OBPartyIdentification43())
                        .name(initiation.getCreditor().getName())
                        .postalAddress(initiation.getCreditor().getPostalAddress()))
                .creditorAgent((new OBBranchAndFinancialInstitutionIdentification3())
                        .schemeName(initiation.getCreditorAgent().getSchemeName())
                        .identification(initiation.getCreditorAgent().getIdentification())
                        .name(initiation.getCreditorAgent().getName())
                        .postalAddress(initiation.getCreditorAgent().getPostalAddress()))
                .creditorAccount((new OBCashAccount3())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
                .remittanceInformation((new OBRemittanceInformation1())
                        .reference(initiation.getRemittanceInformation().getReference())
                        .unstructured(initiation.getRemittanceInformation().getUnstructured()));
    }

    private OBWriteInternationalScheduled3DataInitiation expectedOBWriteInternationalScheduled3DataInitiation(OBInternationalScheduled1 initiation) {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum.valueOf(initiation.getInstructionPriority().name()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode("GB")
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
                .supplementaryData(null);
    }

    private OBWriteInternationalScheduled3DataInitiation expectedOBWriteInternationalScheduled3DataInitiation(OBInternationalScheduled2 initiation) {
        return (new OBWriteInternationalScheduled3DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum.valueOf(initiation.getInstructionPriority().name()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode("GB")
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

    private OBAuthorisation1 expectedOBAuthorisation1(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return (new OBAuthorisation1())
                .authorisationType(OBExternalAuthorisation1Code.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

    private OBWriteDomesticConsent3DataAuthorisation expectedOBWriteDomesticConsent3DataAuthorisation(OBAuthorisation1 authorisation) {
        return (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(OBWriteDomesticConsent3DataAuthorisation.AuthorisationTypeEnum.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }

}
