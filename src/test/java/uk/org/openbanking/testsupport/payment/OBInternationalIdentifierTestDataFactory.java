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

import uk.org.openbanking.datamodel.payment.OBBranchAndFinancialInstitutionIdentification3;
import uk.org.openbanking.datamodel.payment.OBBranchAndFinancialInstitutionIdentification6;
import uk.org.openbanking.datamodel.payment.OBPartyIdentification43;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationCreditor;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationCreditorAgent;

import static uk.org.openbanking.testsupport.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;

public class OBInternationalIdentifierTestDataFactory {

    public static OBBranchAndFinancialInstitutionIdentification3 aValidOBBranchAndFinancialInstitutionIdentification3() {
        return (new OBBranchAndFinancialInstitutionIdentification3())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400411270111")
                .name("Creditor Agent Name")
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBBranchAndFinancialInstitutionIdentification6 aValidOBBranchAndFinancialInstitutionIdentification6() {
        return (new OBBranchAndFinancialInstitutionIdentification6())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400411270111")
                .name("Creditor Agent Name")
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditorAgent aValidOBWriteInternational3DataInitiationCreditorAgent() {
        return (new OBWriteInternational3DataInitiationCreditorAgent())
                .schemeName("UK.OBIE.SortCodeAccountNumber")
                .identification("40400411270111")
                .name("Creditor Agent Name")
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBPartyIdentification43 aValidOBPartyIdentification43() {
        return (new OBPartyIdentification43())
                .name("Creditor Name")
                .postalAddress(aValidOBPostalAddress6());
    }

    public static OBWriteInternational3DataInitiationCreditor aValidOBWriteInternational3DataInitiationCreditor() {
        return (new OBWriteInternational3DataInitiationCreditor())
                .name("Creditor Name")
                .postalAddress(aValidOBPostalAddress6());
    }
}
