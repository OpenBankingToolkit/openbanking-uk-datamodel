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
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2DataInitiationInstructedAmount;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;

/**
 * Unit test for {@link OBAmountConverter}.
 */
public class OBAmountConverterTest {

    @Test
    public void shouldConvertToOBActiveOrHistoricCurrencyAndAmount() {
        // Given
        OBWriteDomestic2DataInitiationInstructedAmount sourceAmount = aValidOBWriteDomestic2DataInitiationInstructedAmount();

        // When
        OBActiveOrHistoricCurrencyAndAmount converted = toOBActiveOrHistoricCurrencyAndAmount(sourceAmount);

        // Then
        assertThat(converted.getCurrency()).isEqualTo(sourceAmount.getCurrency());
        assertThat(converted.getAmount()).isEqualTo(sourceAmount.getAmount());
    }

    @Test
    public void shouldNotConvertToOBActiveOrHistoricCurrencyAndAmountGivenNullAmount() {
        // Given
        OBWriteDomestic2DataInitiationInstructedAmount sourceAmount = null;

        // When
        OBActiveOrHistoricCurrencyAndAmount converted = toOBActiveOrHistoricCurrencyAndAmount(sourceAmount);

        // Then
        assertThat(converted).isNull();
    }

}