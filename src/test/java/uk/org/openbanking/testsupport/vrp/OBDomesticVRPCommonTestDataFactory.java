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

import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInitiation;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.vrp.OBVRPRemittanceInformation;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification6;

public class OBDomesticVRPCommonTestDataFactory {

    private final static String SUPPLEMENTARY_DATA = "SUPPLEMENTARY_DATA";

    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("08080021325698")
                .name("Mr Tim Burgess")
                .secondaryIdentification("11");
    }

    public static OBDomesticVRPInitiation aValidOBDomesticVRPInitiation() {
        return (new OBDomesticVRPInitiation())
                .creditorAccount(aValidOBCashAccountCreditor3())
                .debtorAccount(aValidOBCashAccountDebtorWithName())
                .creditorAgent(aValidOBBranchAndFinancialInstitutionIdentification6())
                .remittanceInformation(aValidOBDomesticVRPInitiationRemittanceInformation());
    }

    public static OBDomesticVRPInitiationRemittanceInformation aValidOBDomesticVRPInitiationRemittanceInformation() {
        return (new OBDomesticVRPInitiationRemittanceInformation())
                .unstructured("Internal ops code 5120103")
                .reference("FRESCO-037");
    }

    public static OBVRPRemittanceInformation aValidOBVRPRemittanceInformation() {
        return (new OBVRPRemittanceInformation())
                .unstructured("Internal ops code 5120103")
                .reference("FRESCO-037");
    }

    public static OBSupplementaryData1 aValidOBSupplementaryData1(){
        OBSupplementaryData1 supplementaryData1 = new OBSupplementaryData1();
        supplementaryData1.setData(SUPPLEMENTARY_DATA);
        return supplementaryData1;
    }
}
