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
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBExchangeRate1;
import uk.org.openbanking.datamodel.payment.OBExchangeRateType2Code;
import uk.org.openbanking.datamodel.payment.OBWriteInternational2DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationExchangeRateInformation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalConsentResponse4DataExchangeRateInformation;

import java.math.BigDecimal;

public class OBExchangeRateTestDataFactory {

    private static final String CURRENCY = "EUR";
    private static final String CONTRACT_IDENTIFICATION = "/tbill/2018/T102993";

    public static OBWriteInternational2DataInitiationExchangeRateInformation aValidOBWriteInternational2DataInitiationExchangeRateInformation() {
        return (new OBWriteInternational2DataInitiationExchangeRateInformation())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN)
                .rateType(OBWriteInternational2DataInitiationExchangeRateInformation.RateTypeEnum.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION);
    }

    public static OBWriteInternational3DataInitiationExchangeRateInformation aValidOBWriteInternational3DataInitiationExchangeRateInformation() {
        return (new OBWriteInternational3DataInitiationExchangeRateInformation())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN)
                .rateType(OBWriteInternational3DataInitiationExchangeRateInformation.RateTypeEnum.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION);
    }

    public static OBWriteInternationalConsentResponse4DataExchangeRateInformation aValidOBWriteInternationalConsentResponse4DataExchangeRateInformation() {
        return (new OBWriteInternationalConsentResponse4DataExchangeRateInformation())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN)
                .rateType(OBWriteInternationalConsentResponse4DataExchangeRateInformation.RateTypeEnum.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION)
                .expirationDateTime(DateTime.now().plusDays(1));
    }

    public static OBExchangeRate1 aValidOBExchangeRate1() {
        return (new OBExchangeRate1())
                .unitCurrency(CURRENCY)
                .exchangeRate(BigDecimal.TEN)
                .rateType(OBExchangeRateType2Code.AGREED)
                .contractIdentification(CONTRACT_IDENTIFICATION);
    }
}
