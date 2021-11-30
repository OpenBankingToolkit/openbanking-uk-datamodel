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
package uk.org.openbanking.testsupport.payment;

import uk.org.openbanking.datamodel.payment.*;

import static uk.org.openbanking.testsupport.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;

public class OBInternationalIdentifierTestDataFactory {

    private static final String SCHEME_NAME = "UK.OBIE.SortCodeAccountNumber";
    private static final String IDENTIFICATION = "40400411270111";
    private static final String CREDITOR_AGENT_NAME = "Creditor Agent Name";
    private static final String CREDITOR_NAME = "Creditor Name";


    public static OBBranchAndFinancialInstitutionIdentification3 aValidOBBranchAndFinancialInstitutionIdentification3() {
        return (new OBBranchAndFinancialInstitutionIdentification3())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational2DataInitiationCreditorAgent aValidOBWriteInternational2DataInitiationCreditorAgent() {
        return (new OBWriteInternational2DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditorAgent aValidOBWriteInternational3DataInitiationCreditorAgent() {
        return (new OBWriteInternational3DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternationalStandingOrder3DataInitiationCreditorAgent aValidOBWriteInternationalStandingOrder3DataInitiationCreditorAgent() {
        return (new OBWriteInternationalStandingOrder3DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternationalStandingOrder4DataInitiationCreditorAgent aValidOBWriteInternationalStandingOrder4DataInitiationCreditorAgent() {
        return (new OBWriteInternationalStandingOrder4DataInitiationCreditorAgent())
                .schemeName(SCHEME_NAME)
                .identification(IDENTIFICATION)
                .name(CREDITOR_AGENT_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBPartyIdentification43 aValidOBPartyIdentification43() {
        return (new OBPartyIdentification43())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational2DataInitiationCreditor aValidOBWriteInternational2DataInitiationCreditor() {
        return (new OBWriteInternational2DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditor aValidOBWriteInternational3DataInitiationCreditor() {
        return (new OBWriteInternational3DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor aValidOBWriteInternationalScheduledConsentResponse6DataInitiationCreditor() {
        return (new OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor())
                .name(CREDITOR_NAME)
                .postalAddress(aValidOBPostalAddress6());
    }
}
