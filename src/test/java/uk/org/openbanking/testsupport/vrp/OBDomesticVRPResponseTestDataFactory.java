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

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPRequest;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPResponseData;

import java.util.List;

public class OBDomesticVRPResponseTestDataFactory {

    public static OBDomesticVRPResponseData aValidOBDomesticVRPResponseData(OBDomesticVRPRequest request) {
        return (new OBDomesticVRPResponseData())
                .domesticVRPId("123456")
                .consentId("VRP_1233456")
                .creationDateTime(new DateTime())
                .status(OBDomesticVRPResponseData.StatusEnum.ACCEPTEDSETTLEMENTCOMPLETED)
                .statusUpdateDateTime(new DateTime())
                .expectedExecutionDateTime(new DateTime())
                .expectedSettlementDateTime(new DateTime())
                .refund(OBDomesticVRPCommonTestDataFactory.aValidOBCashAccountDebtorWithName())
                .charges(List.of(OBDomesticVRPCommonTestDataFactory.aValidOBDomesticVRPResponseDataCharges()))
                .initiation(OBDomesticVRPCommonTestDataFactory.aValidOBDomesticVRPInitiation())
                .instruction(OBDomesticVRPRequestTestDataFactory.aValidOBDomesticVRPInstruction())
                .debtorAccount(OBDomesticVRPCommonTestDataFactory.aValidOBCashAccountDebtorWithName());
    }
}
