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

import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPInstruction;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPRequestData;
import uk.org.openbanking.datamodel.vrp.namespace.OBVRPAuthenticationMethods;

import java.util.UUID;

import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBDomesticVRPInitiation3_1_10;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBPostalAddress6;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBSupplementaryData1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBVRPRemittanceInformation;

public class OBDomesticVRPRequestTestDataFactory3_1_10 {

    public static OBDomesticVRPRequest aValidOBDomesticVRPRequest() {
        return (new OBDomesticVRPRequest())
                .data(aValidOBDomesticVRPRequestData())
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPRequest aValidOBDomesticVRPRequest(String consentId) {
        return (new OBDomesticVRPRequest())
                .data(aValidOBDomesticVRPRequestData(consentId))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData() {
        return (new OBDomesticVRPRequestData())
                .consentId(ConstantsVRPTestData.CONSENT_PREFIX + UUID.randomUUID())
                .psUAuthenticationMethod(OBVRPAuthenticationMethods.SCA.getValue())
                .initiation(aValidOBDomesticVRPInitiation3_1_10())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData(String consentId) {
        return (new OBDomesticVRPRequestData())
                .consentId(consentId)
                .psUAuthenticationMethod(OBVRPAuthenticationMethods.SCA.getValue())
                .initiation(aValidOBDomesticVRPInitiation3_1_10())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPInstruction aValidOBDomesticVRPInstruction() {
        return (new OBDomesticVRPInstruction())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .instructionIdentification(ConstantsVRPTestData.INSTRUCTION_IDENTIFICATION)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .endToEndIdentification(ConstantsVRPTestData.END_TO_END_IDENTIFICATION)
                .localInstrument(ConstantsVRPTestData.LOCAL_INSTRUMENT)
                .remittanceInformation(aValidOBVRPRemittanceInformation())
                .supplementaryData(aValidOBSupplementaryData1());
    }
}
