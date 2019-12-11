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
package uk.org.openbanking.validation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CurrencyCodeValidatorTest {

    private final CurrencyCodeValidator currencyCodeValidator = new CurrencyCodeValidator();

    @Test
    public void isValid() {
        assertThat(currencyCodeValidator.isValid("GBP", null), is(true));
        assertThat(currencyCodeValidator.isValid("EUR", null), is(true));
        assertThat(currencyCodeValidator.isValid("USD", null), is(true));
        assertThat(currencyCodeValidator.isValid("TRY", null), is(true));
        assertThat(currencyCodeValidator.isValid("XTS", null), is(true));

        assertThat(currencyCodeValidator.isValid("", null), is(false));
        assertThat(currencyCodeValidator.isValid(null, null), is(false));
        assertThat(currencyCodeValidator.isValid("A", null), is(false));
        assertThat(currencyCodeValidator.isValid("AB", null), is(false));
        assertThat(currencyCodeValidator.isValid("NCC", null), is(false));
        assertThat(currencyCodeValidator.isValid("ABCD", null), is(false));
        assertThat(currencyCodeValidator.isValid("1234", null), is(false));
    }
}