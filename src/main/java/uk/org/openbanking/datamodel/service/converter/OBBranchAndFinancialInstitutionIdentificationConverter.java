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
package uk.org.openbanking.datamodel.service.converter;

import uk.org.openbanking.datamodel.account.OBBranchAndFinancialInstitutionIdentification2;
import uk.org.openbanking.datamodel.account.OBBranchAndFinancialInstitutionIdentification4;
import uk.org.openbanking.datamodel.account.OBExternalFinancialInstitutionIdentification2Code;

public class OBBranchAndFinancialInstitutionIdentificationConverter {

    /**
     * Convert institution identification from V3 to V1
     * @param institutionIdentification4 institution identification in V3 format
     * @return institution identification in V1 format
     */
    public static OBBranchAndFinancialInstitutionIdentification2 toOBBranchAndFinancialInstitutionIdentification2(OBBranchAndFinancialInstitutionIdentification4 institutionIdentification4) {
        return new OBBranchAndFinancialInstitutionIdentification2()
                .identification(institutionIdentification4.getIdentification())
                .schemeName(OBExternalFinancialInstitutionIdentification2Code.valueOf(institutionIdentification4.getSchemeName()));
    }

    /**
     * Convert institution identification from V2 to V3
     * @param institutionIdentification2 institution identification in V2 format
     * @return institution identification in V3 format
     */
    public static OBBranchAndFinancialInstitutionIdentification4 toOBBranchAndFinancialInstitutionIdentification2(OBBranchAndFinancialInstitutionIdentification2 institutionIdentification2) {
        return new OBBranchAndFinancialInstitutionIdentification4()
                .identification(institutionIdentification2.getIdentification())
                .schemeName(institutionIdentification2.getSchemeName().toString());
    }
}
