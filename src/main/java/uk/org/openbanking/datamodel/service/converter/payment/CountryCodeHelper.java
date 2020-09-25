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

import static uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code.IBAN;

/**
 * This class makes a crude attempt to determine the destination country code. If an IBAN is used as the creditor's account identifier, then the country code prefix is used.
 * Otherwise "GB" is used as a default value.
 *
 * <p>
 * This is to populate the corresponding value in the various OB international "data initiation" objects, which became mandatory in v3.1.3 of the API (i.e. this is to avoid a
 * validation error). The actual value is not so important, as it won't be returned from earlier values of the API and will be correctly populated when a customer starts using
 * v3.1.3 onwards.
 * </p>
 */
public class CountryCodeHelper {

    private static final String DEFAULT_COUNTRY_CODE = "GB";

    public static String determineCountryCode(String schemeName, String identification) {
        String countryCode = DEFAULT_COUNTRY_CODE;
        if (isIbanScheme(schemeName) && hasCountryCodePrefix(identification)) {
            countryCode = identification.substring(0, 2);
        }
        return countryCode;
    }

    private static boolean isIbanScheme(String schemeName) {
        return IBAN.toString().equals(schemeName);
    }

    private static boolean hasCountryCodePrefix(String identification) {
        return identification.length() > 2 && isAlpha(identification.substring(0, 2)); // a very crude test! It doesn't actually matter if it's not a valid country code
    }

    private static boolean isAlpha(String value) {
        return value.matches("[a-zA-Z]+");
    }
}
