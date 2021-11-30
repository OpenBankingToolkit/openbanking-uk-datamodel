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
import uk.org.openbanking.datamodel.vrp.*;

import java.util.Arrays;
import java.util.List;

import static org.joda.time.DateTime.now;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBCashAccountCreditor3;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification6;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.vrp.OBDomesticVRPCommonTestDataFactory.*;

public class OBDomesticVRPConsentRequestTestDataFactory {

    private static final String GBP = "GBP";
    private static final String AMOUNT = "10.01";

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest() {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData())
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequest aValidOBDomesticVRPConsentRequest(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequest())
                .data(aValidOBDomesticVRPConsentRequestData(psuAuthenticationMethods, vrpTypes))
                .risk(aValidOBRisk1());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData() {
        return (new OBDomesticVRPConsentRequestData())
                .controlParameters(aValidOBDomesticVRPControlParameters())
                .initiation(aValidOBDomesticVRPInitiation());
    }

    public static OBDomesticVRPConsentRequestData aValidOBDomesticVRPConsentRequestData(List<String> psuAuthenticationMethods, List<String> vrpTypes) {
        return (new OBDomesticVRPConsentRequestData())
                .controlParameters(aValidOBDomesticVRPControlParameters(psuAuthenticationMethods, vrpTypes))
                .initiation(aValidOBDomesticVRPInitiation());
    }

    public static OBDomesticVRPControlParameters aValidOBDomesticVRPControlParameters() {
        DateTime now = now();
        return (new OBDomesticVRPControlParameters())
                .psUAuthenticationMethods(Arrays.asList("UK.OBIE.SCA"))
                .vrPType(Arrays.asList("UK.OBIE.VRPType.Sweeping"))
                .validFromDateTime(now)
                .validToDateTime(now.plusDays(10))
                .maximumIndividualAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .periodicLimits(aValidOBDomesticVRPControlParametersPeriodicLimits())
                .supplementaryData(new OBSupplementaryData1());
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
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("08080021325698")
                .name("Mr Tim Burgess")
                .secondaryIdentification("11");
    }



    public static List<OBDomesticVRPControlParametersPeriodicLimits> aValidOBDomesticVRPControlParametersPeriodicLimits() {
        return Arrays.asList((new OBDomesticVRPControlParametersPeriodicLimits())
                .amount(AMOUNT)
                .currency(GBP)
                .periodAlignment(OBDomesticVRPControlParametersPeriodicLimits.PeriodAlignmentEnum.CALENDAR)
                .periodType(OBDomesticVRPControlParametersPeriodicLimits.PeriodTypeEnum.MONTH));
    }
}
