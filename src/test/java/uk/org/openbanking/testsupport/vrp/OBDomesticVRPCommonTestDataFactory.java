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
import uk.org.openbanking.datamodel.vrp.namespace.OBExternalAccountIdentification4Code;


public class OBDomesticVRPCommonTestDataFactory {

    private final static String SUPPLEMENTARY_DATA = "SUPPLEMENTARY_DATA";
    private static final String AMOUNT = "10.01";
    private static final String CURRENCY = "GBP";
    private static final String CASH_ACCOUNT_IDENTIFICATION = "08080021325698";
    private static final String CASH_ACCOUNT_NAME = "Mr Tim Burgess";
    private static final String CAS_ACCOUNT_SCHEME_NAME = OBExternalAccountIdentification4Code.SORT_CODE_ACCOUNT_NUMBER.getValue();
    private static final String CASH_ACCOUNT_SECONDARY_IDENTIFICATION = "11";

    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName(CAS_ACCOUNT_SCHEME_NAME)
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

    public static OBSupplementaryData1 aValidOBSupplementaryData1() {
        OBSupplementaryData1 supplementaryData1 = new OBSupplementaryData1();
        supplementaryData1.setData(SUPPLEMENTARY_DATA);
        return supplementaryData1;
    }

    public static OBActiveOrHistoricCurrencyAndAmount aValidOBActiveOrHistoricCurrencyAndAmount() {
        return (new OBActiveOrHistoricCurrencyAndAmount())
                .amount(AMOUNT)
                .currency(CURRENCY);
    }

    public static OBCashAccountCreditor3 aValidOBCashAccountCreditor3() {
        return (new OBCashAccountCreditor3())
                .identification(CASH_ACCOUNT_IDENTIFICATION)
                .name(CASH_ACCOUNT_NAME)
                .schemeName(CAS_ACCOUNT_SCHEME_NAME)
                .secondaryIdentification(CASH_ACCOUNT_SECONDARY_IDENTIFICATION);
    }

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName(CAS_ACCOUNT_SCHEME_NAME)
                .identification(CASH_ACCOUNT_IDENTIFICATION)
                .name(CASH_ACCOUNT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBPostalAddress6 aValidOBPostalAddress6() {
        return (new OBPostalAddress6())
                .addressType(OBAddressTypeCode.RESIDENTIAL)
                .buildingNumber("1")
                .streetName("The Mall")
                .postCode("WC1 1AB")
                .townName("London")
                .country("UK");
    }

    public static OBDomesticVRPResponseDataCharges aValidOBDomesticVRPResponseDataCharges() {
        return (new OBDomesticVRPResponseDataCharges())
                .amount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .chargeBearer(OBChargeBearerType1Code.BORNEBYCREDITOR)
                .type(OBExternalPaymentChargeType1Code.BALANCETRANSFEROUT);
    }

}
