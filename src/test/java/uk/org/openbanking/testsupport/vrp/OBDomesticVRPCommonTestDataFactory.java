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
import uk.org.openbanking.datamodel.vrp.*;


public class OBDomesticVRPCommonTestDataFactory {

    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName(ConstantsVRPTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVRPTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVRPTestData.ACCOUNT_NAME)
                .secondaryIdentification(ConstantsVRPTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
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
                .unstructured(ConstantsVRPTestData.UNSTRUCTURED)
                .reference(ConstantsVRPTestData.REFERENCE);
    }

    public static OBVRPRemittanceInformation aValidOBVRPRemittanceInformation() {
        return (new OBVRPRemittanceInformation())
                .unstructured(ConstantsVRPTestData.UNSTRUCTURED)
                .reference(ConstantsVRPTestData.REFERENCE);
    }

    public static OBSupplementaryData1 aValidOBSupplementaryData1() {
        OBSupplementaryData1 supplementaryData1 = new OBSupplementaryData1();
        supplementaryData1.setData(ConstantsVRPTestData.SUPPLEMENTARY_DATA);
        return supplementaryData1;
    }

    public static OBActiveOrHistoricCurrencyAndAmount aValidOBActiveOrHistoricCurrencyAndAmount() {
        return (new OBActiveOrHistoricCurrencyAndAmount())
                .amount(ConstantsVRPTestData.AMOUNT)
                .currency(ConstantsVRPTestData.GBP);
    }

    public static OBCashAccountCreditor3 aValidOBCashAccountCreditor3() {
        return (new OBCashAccountCreditor3())
                .identification(ConstantsVRPTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVRPTestData.ACCOUNT_NAME)
                .schemeName(ConstantsVRPTestData.ACCOUNT_SCHEME_NAME)
                .secondaryIdentification(ConstantsVRPTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
    }

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName(ConstantsVRPTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVRPTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVRPTestData.ACCOUNT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBPostalAddress6 aValidOBPostalAddress6() {
        return (new OBPostalAddress6())
                .addressType(OBAddressTypeCode.RESIDENTIAL)
                .buildingNumber(ConstantsVRPTestData.BUILDING_NUMBER)
                .streetName(ConstantsVRPTestData.STREET_NAME)
                .postCode(ConstantsVRPTestData.POSTCODE)
                .townName(ConstantsVRPTestData.TOWN_NAME)
                .country(ConstantsVRPTestData.COUNTRY);
    }

    public static OBDomesticVRPResponseDataCharges aValidOBDomesticVRPResponseDataCharges() {
        return (new OBDomesticVRPResponseDataCharges())
                .amount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .chargeBearer(OBChargeBearerType1Code.BORNEBYCREDITOR)
                .type(OBExternalPaymentChargeType1Code.BALANCETRANSFEROUT);
    }

}
