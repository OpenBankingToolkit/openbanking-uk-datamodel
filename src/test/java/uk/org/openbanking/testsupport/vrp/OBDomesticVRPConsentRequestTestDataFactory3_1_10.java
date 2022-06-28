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
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPControlParametersPeriodicLimits;
import uk.org.openbanking.datamodel.vrp.OBVRPInteractionTypes;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPConsentRequest;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPConsentRequestData;
import uk.org.openbanking.datamodel.vrp.v3_1_10.OBDomesticVRPControlParameters;
import uk.org.openbanking.datamodel.vrp.namespace.OBVRPAuthenticationMethods;
import uk.org.openbanking.datamodel.vrp.namespace.OBVRPConsentType;

import java.util.Arrays;
import java.util.List;

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1_3_1_10;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.aValidOBDomesticVRPInitiation3_1_10;

public class OBDomesticVRPConsentRequestTestDataFactory3_1_10 {

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest() {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData())
                .risk(aValidOBRisk1_3_1_10());
    }

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData(psuAuthenticationMethods, vrpTypes))
                .risk(aValidOBRisk1_3_1_10());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData() {
        return (new OBDomesticVRPConsentRequestData())
                .controlParameters(aValidOBDomesticVRPControlParameters())
                .initiation(aValidOBDomesticVRPInitiation3_1_10());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequestData())
                .readRefundAccount(OBDomesticVRPConsentRequestData.ReadRefundAccountEnum.YES)
                .controlParameters(aValidOBDomesticVRPControlParameters(psuAuthenticationMethods, vrpTypes))
                .initiation(aValidOBDomesticVRPInitiation3_1_10());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParameters() {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(Arrays.asList(OBVRPAuthenticationMethods.SCA_NOT_REQUIRED.getValue()))
                .vrPType(Arrays.asList(OBVRPConsentType.SWEEPING.getValue()))
                .validFromDateTime(now)
                .validToDateTime(now.plusDays(10))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits())
                .supplementaryData(new OBSupplementaryData1())
                .psUInteractionTypes(List.of(OBVRPInteractionTypes.INSESSION));
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParameters(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(psuAuthenticationMethods)
                .vrPType(vrpTypes)
                .validFromDateTime(now)
                .validToDateTime(now.plusDays(10))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits())
                .supplementaryData(new OBSupplementaryData1());
    }


    public static OBCashAccountDebtorWithName aValidOBCashAccountDebtorWithName() {
        return (new OBCashAccountDebtorWithName())
                .schemeName(ConstantsVRPTestData.ACCOUNT_SCHEME_NAME)
                .identification(ConstantsVRPTestData.ACCOUNT_IDENTIFICATION)
                .name(ConstantsVRPTestData.ACCOUNT_NAME)
                .secondaryIdentification(ConstantsVRPTestData.ACCOUNT_SECONDARY_IDENTIFICATION);
    }


    public static List<OBDomesticVRPControlParametersPeriodicLimits> aValidOBDomesticVRPControlParametersPeriodicLimits() {
        return Arrays.asList((new OBDomesticVRPControlParametersPeriodicLimits())
                .amount(ConstantsVRPTestData.AMOUNT)
                .currency(ConstantsVRPTestData.GBP)
                .periodAlignment(OBDomesticVRPControlParametersPeriodicLimits.PeriodAlignmentEnum.CALENDAR)
                .periodType(OBDomesticVRPControlParametersPeriodicLimits.PeriodTypeEnum.MONTH));
    }
}
