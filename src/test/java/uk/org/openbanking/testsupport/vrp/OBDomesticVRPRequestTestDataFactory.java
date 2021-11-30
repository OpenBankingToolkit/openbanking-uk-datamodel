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
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification6;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.*;

public class OBDomesticVRPRequestTestDataFactory {

    public static String INSTRUCTION_IDENTIFICATION = "32409753409ASFD";
    private static final String END_TO_END_IDENTIFICATION = "12345678";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.BACS";

    public static OBDomesticVRPRequest aValidOBDomesticVRPRequest(){
        return (new OBDomesticVRPRequest())
                .data(aValidOBDomesticVRPRequestData())
                .risk(aValidOBRisk1());
    }

    private static OBDomesticVRPRequestData aValidOBDomesticVRPRequestData() {
        return (new OBDomesticVRPRequestData())
                .consentId("VRP_357f4d56-379f-4908-a608-2fca79242ed9")
                .psUAuthenticationMethod("UK.OBIE.SCA")
                .initiation(aValidOBDomesticVRPInitiation())
                .instruction(aValidOBDomesticVRPInstruction());

    }

    private static OBDomesticVRPInstruction aValidOBDomesticVRPInstruction() {
        return (new OBDomesticVRPInstruction())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification6())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .remittanceInformation(aValidOBVRPRemittanceInformation())
                .supplementaryData(aValidOBSupplementaryData1());
    }
}
