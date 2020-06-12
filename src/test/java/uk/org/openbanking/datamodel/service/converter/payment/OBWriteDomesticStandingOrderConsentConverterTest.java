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
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteDomesticStandingOrderConsentConverter.toOBWriteDomesticStandingOrderConsent3;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticStandingOrderConsentTestDataFactory.aValidOBWriteDomesticStandingOrderConsent4;

/**
 * Unit test for {@link OBWriteDomesticStandingOrderConsentConverter}.
 */
public class OBWriteDomesticStandingOrderConsentConverterTest {

    @Test
    public void shouldConvertToOBWriteDomesticStandingOrderConsent3() {
        // Given
        OBWriteDomesticStandingOrderConsent4 source = aValidOBWriteDomesticStandingOrderConsent4();
        OBWriteDataDomesticStandingOrderConsent3 expectedData = expectedObWriteDataDomesticStandingOrderConsent3(source.getData());

        // When
        OBWriteDomesticStandingOrderConsent3 obWriteDomesticStandingOrderConsent3 = toOBWriteDomesticStandingOrderConsent3(source);

        // Then
        assertThat(obWriteDomesticStandingOrderConsent3.getData()).isEqualTo(expectedData);
        assertThat(obWriteDomesticStandingOrderConsent3.getRisk()).isEqualTo(source.getRisk());
    }

    private OBWriteDataDomesticStandingOrderConsent3 expectedObWriteDataDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent4Data data) {
        return (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(OBExternalPermissions2Code.valueOf(data.getPermission().name()))
                .initiation(expectedObDomesticStandingOrder3(data.getInitiation()))
                .authorisation(expectedObAuthorisation1(data.getAuthorisation()));
    }

    private OBDomesticStandingOrder3 expectedObDomesticStandingOrder3(OBWriteDomesticStandingOrder3DataInitiation initiation) {
        return (new OBDomesticStandingOrder3())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .recurringPaymentDateTime(initiation.getRecurringPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .firstPaymentAmount((new OBDomesticStandingOrder3FirstPaymentAmount())
                        .currency(initiation.getFirstPaymentAmount().getCurrency())
                        .amount(initiation.getFirstPaymentAmount().getAmount()))
                .recurringPaymentAmount((new OBDomesticStandingOrder3RecurringPaymentAmount())
                        .currency(initiation.getRecurringPaymentAmount().getCurrency())
                        .amount(initiation.getRecurringPaymentAmount().getAmount()))
                .finalPaymentAmount((new OBDomesticStandingOrder3FinalPaymentAmount())
                        .currency(initiation.getFirstPaymentAmount().getCurrency())
                        .amount(initiation.getFirstPaymentAmount().getAmount()))
                .debtorAccount((new OBCashAccountDebtor4())
                        .schemeName(initiation.getDebtorAccount().getSchemeName())
                        .identification(initiation.getDebtorAccount().getIdentification())
                        .name(initiation.getDebtorAccount().getName())
                        .secondaryIdentification(initiation.getDebtorAccount().getSecondaryIdentification()))
                .creditorAccount((new OBCashAccountCreditor3())
                        .schemeName(initiation.getCreditorAccount().getSchemeName())
                        .identification(initiation.getCreditorAccount().getIdentification())
                        .name(initiation.getCreditorAccount().getName())
                        .secondaryIdentification(initiation.getCreditorAccount().getSecondaryIdentification()))
                .supplementaryData(new OBSupplementaryData1());
    }

    private OBAuthorisation1 expectedObAuthorisation1(OBWriteDomesticConsent3DataAuthorisation authorisation) {
        return (new OBAuthorisation1())
                .authorisationType(OBExternalAuthorisation1Code.valueOf(authorisation.getAuthorisationType().name()))
                .completionDateTime(authorisation.getCompletionDateTime());
    }


}