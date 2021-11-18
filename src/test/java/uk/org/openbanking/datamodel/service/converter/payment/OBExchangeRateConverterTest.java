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
import uk.org.openbanking.datamodel.payment.OBExchangeRate1;
import uk.org.openbanking.datamodel.payment.OBExchangeRate2;
import uk.org.openbanking.datamodel.payment.OBExchangeRateType2Code;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalConsentResponse4DataExchangeRateInformation;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBExchangeRateConverter.toOBExchangeRate1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBExchangeRateConverter.toOBExchangeRate2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBExchangeRateConverter.toOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBExchangeRate1;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.testsupport.payment.OBExchangeRateTestDataFactory.aValidOBWriteInternationalConsentResponse4DataExchangeRateInformation;

/**
 * Unit test for {@link OBExchangeRateConverter}.
 */
public class OBExchangeRateConverterTest {

    @Test
    public void shouldConvertToOBExchangeRate1() {
        // Given
        OBWriteInternational3DataInitiationExchangeRateInformation sourceExchangeRate = aValidOBWriteInternational3DataInitiationExchangeRateInformation();

        // When
        OBExchangeRate1 obExchangeRate1 = toOBExchangeRate1(sourceExchangeRate);

        // Then
        assertThat(obExchangeRate1.getUnitCurrency()).isEqualTo(sourceExchangeRate.getUnitCurrency());
        assertThat(obExchangeRate1.getExchangeRate()).isEqualTo(sourceExchangeRate.getExchangeRate());
        assertThat(obExchangeRate1.getRateType()).isEqualTo(OBExchangeRateType2Code.AGREED);
        assertThat(obExchangeRate1.getContractIdentification()).isEqualTo(sourceExchangeRate.getContractIdentification());
    }

    @Test
    public void shouldConvertToOBExchangeRate2() {
        // Given
        OBWriteInternationalConsentResponse4DataExchangeRateInformation sourceExchangeRate = aValidOBWriteInternationalConsentResponse4DataExchangeRateInformation();

        // When
        OBExchangeRate2 obExchangeRate2 = toOBExchangeRate2(sourceExchangeRate);

        // Then
        assertThat(obExchangeRate2.getUnitCurrency()).isEqualTo(sourceExchangeRate.getUnitCurrency());
        assertThat(obExchangeRate2.getExchangeRate()).isEqualTo(sourceExchangeRate.getExchangeRate());
        assertThat(obExchangeRate2.getRateType()).isEqualTo(OBExchangeRateType2Code.AGREED);
        assertThat(obExchangeRate2.getContractIdentification()).isEqualTo(sourceExchangeRate.getContractIdentification());
        assertThat(obExchangeRate2.getExpirationDateTime()).isEqualTo(sourceExchangeRate.getExpirationDateTime());
    }

    @Test
    public void shouldConvertToOBWriteInternational3DataInitiationExchangeRateInformation() {
        // Given
        OBExchangeRate1 sourceExchangeRate = aValidOBExchangeRate1();

        // When
        OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation = toOBWriteInternational3DataInitiationExchangeRateInformation(sourceExchangeRate);

        // Then
        assertThat(exchangeRateInformation.getUnitCurrency()).isEqualTo(sourceExchangeRate.getUnitCurrency());
        assertThat(exchangeRateInformation.getExchangeRate()).isEqualTo(sourceExchangeRate.getExchangeRate());
        assertThat(exchangeRateInformation.getRateType()).isEqualTo(OBExchangeRateType2Code.AGREED);
        assertThat(exchangeRateInformation.getContractIdentification()).isEqualTo(sourceExchangeRate.getContractIdentification());
    }

    @Test
    public void shouldNotConvertGivenNullOBExchangeRate1() {
        // Given
        OBExchangeRate1 sourceExchangeRate = null;

        // When
        OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation = toOBWriteInternational3DataInitiationExchangeRateInformation(sourceExchangeRate);

        // Then
        assertThat(exchangeRateInformation).isNull();
    }

    @Test
    public void shouldNotConvertGivenNullOBWriteInternational3DataInitiationExchangeRateInformation() {
        // Given
        OBWriteInternational3DataInitiationExchangeRateInformation sourceExchangeRate = null;

        // When
        OBExchangeRate1 obExchangeRate1 = toOBExchangeRate1(sourceExchangeRate);

        // Then
        assertThat(obExchangeRate1).isNull();
    }

    @Test
    public void shouldNotConvertGivenNullOBWriteInternationalConsentResponse4DataExchangeRateInformation() {
        // Given
        OBWriteInternationalConsentResponse4DataExchangeRateInformation sourceExchangeRate = null;

        // When
        OBExchangeRate2 obExchangeRate2 = toOBExchangeRate2(sourceExchangeRate);

        // Then
        assertThat(obExchangeRate2).isNull();
    }

}
