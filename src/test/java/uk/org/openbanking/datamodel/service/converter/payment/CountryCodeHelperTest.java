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

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code.IBAN;
import static uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER;

public class CountryCodeHelperTest {

    private static final String DEFAULT_COUNTRY_CODE = "GB";

    @Test
    public void shouldUseDefaultCountryCodeGivenSortCodeAndAccountNumber() {
        // Given
        String schemeName = SORTCODEACCOUNTNUMBER.toString();
        String identification = "40400412345678";

        // When
        String countryCode = CountryCodeHelper.determineCountryCode(schemeName, identification);

        // Then
        assertThat(countryCode).isEqualTo(DEFAULT_COUNTRY_CODE);
    }

    @Test
    public void shouldUseIbanCountryCodeGivenValidIban() {
        // Given
        String schemeName = IBAN.toString();
        String identification = "DE89 3704 0044 0532 0130 00";

        // When
        String countryCode = CountryCodeHelper.determineCountryCode(schemeName, identification);

        // Then
        assertThat(countryCode).isEqualTo("DE");
    }

    @Test
    public void shouldUseDefaultCountryCodeGivenInvalidIban() {
        // Given
        String schemeName = IBAN.toString();
        String identification = "40400412345678";

        // When
        String countryCode = CountryCodeHelper.determineCountryCode(schemeName, identification);

        // Then
        assertThat(countryCode).isEqualTo(DEFAULT_COUNTRY_CODE);
    }

    @Test
    public void shouldUseDefaultCountryCodeGivenMissingIban() {
        // Given
        String schemeName = IBAN.toString();
        String identification = "";

        // When
        String countryCode = CountryCodeHelper.determineCountryCode(schemeName, identification);

        // Then
        assertThat(countryCode).isEqualTo(DEFAULT_COUNTRY_CODE);
    }

    @Test
    public void shouldUseDefaultCountryCodeGivenIbanWithOtherScheme() {
        // Given
        String schemeName = SORTCODEACCOUNTNUMBER.toString();
        String identification = "DE89 3704 0044 0532 0130 00";

        // When
        String countryCode = CountryCodeHelper.determineCountryCode(schemeName, identification);

        // Then
        assertThat(countryCode).isEqualTo(DEFAULT_COUNTRY_CODE);
    }
}
