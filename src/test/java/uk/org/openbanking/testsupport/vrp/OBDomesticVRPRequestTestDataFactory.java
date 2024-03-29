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

import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInstruction;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPRequestData;
import uk.org.openbanking.datamodel.vrp.namespace.OBVRPAuthenticationMethods;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPInitiation;

import java.util.UUID;

import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.*;

public class OBDomesticVRPRequestTestDataFactory {

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
                .initiation(aValidOBDomesticVRPInitiation())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData(String consentId) {
        return (new OBDomesticVRPRequestData())
                .consentId(consentId)
                .psUAuthenticationMethod(OBVRPAuthenticationMethods.SCA.getValue())
                .initiation(aValidOBDomesticVRPInitiation())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    public static OBDomesticVRPInstruction aValidOBDomesticVRPInstruction() {
        return (new OBDomesticVRPInstruction())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification6())
                .instructionIdentification(ConstantsVRPTestData.INSTRUCTION_IDENTIFICATION)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .endToEndIdentification(ConstantsVRPTestData.END_TO_END_IDENTIFICATION)
                .localInstrument(ConstantsVRPTestData.LOCAL_INSTRUMENT)
                .remittanceInformation(aValidOBVRPRemittanceInformation())
                .supplementaryData(aValidOBSupplementaryData1());
    }

    public static uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPInstruction aValidOBDomesticVRPInstruction3_1_10() {
        return (new uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPInstruction ())
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
