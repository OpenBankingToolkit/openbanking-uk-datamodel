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
package uk.org.openbanking.testsupport.vrp;

import uk.org.openbanking.datamodel.vrp.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.vrp.OBVRPFundsConfirmationRequest;
import uk.org.openbanking.datamodel.vrp.OBVRPFundsConfirmationRequestData;

import java.util.UUID;

public class OBVRPFundsConfirmationRequestTestDataFactory {

    public static OBVRPFundsConfirmationRequest aValidOBVRPFundsConfirmationRequest() {
        return new OBVRPFundsConfirmationRequest()
                .data(
                        new OBVRPFundsConfirmationRequestData()
                                .consentId(ConstantsVRPTestData.CONSENT_PREFIX + UUID.randomUUID().toString())
                                .reference(ConstantsVRPTestData.FUNDS_REFERENCE)
                                .instructedAmount(
                                        new OBActiveOrHistoricCurrencyAndAmount()
                                                .amount(ConstantsVRPTestData.AMOUNT)
                                                .currency(ConstantsVRPTestData.GBP)
                                )

                );
    }

    public static OBVRPFundsConfirmationRequest aValidOBVRPFundsConfirmationRequest(
            String consentId, String reference, String amount, String currency
    ) {
        return new OBVRPFundsConfirmationRequest()
                .data(
                        new OBVRPFundsConfirmationRequestData()
                                .consentId(consentId)
                                .reference(reference)
                                .instructedAmount(
                                        new OBActiveOrHistoricCurrencyAndAmount()
                                                .amount(amount)
                                                .currency(currency)
                                )

                );
    }
}
