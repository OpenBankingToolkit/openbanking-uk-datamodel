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

import uk.org.openbanking.datamodel.account.*;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

/**
 * Convert OB beneficiary data-model in different version
 */
public class OBBeneficiaryConverter {

    /**
     * Convert a beneficiary V2 to V1
     * @param obBeneficiary2 beneficiary in V2 format
     * @return beneficiary in V1 format
     */
    public static OBBeneficiary1 toBeneficiary1(OBBeneficiary2 obBeneficiary2) {
        OBBeneficiary1 obBeneficiary1 = new OBBeneficiary1();
        if (obBeneficiary2.getAccountId() != null) {
            obBeneficiary1.accountId(obBeneficiary2.getAccountId());
        }
        if (obBeneficiary2.getBeneficiaryId() != null) {
            obBeneficiary1.beneficiaryId(obBeneficiary2.getBeneficiaryId());
        }
        if (obBeneficiary2.getReference() != null) {
            obBeneficiary1.reference(obBeneficiary2.getReference());
        }
        if (obBeneficiary2.getCreditorAgent() != null) {
            obBeneficiary1.servicer(new OBBranchAndFinancialInstitutionIdentification2()
                    .schemeName(OBExternalFinancialInstitutionIdentification2Code.valueOf(obBeneficiary2.getCreditorAgent().getSchemeName()))
                    .identification(obBeneficiary2.getCreditorAgent().getIdentification())
            );
        }
        if (obBeneficiary2.getCreditorAccount() != null) {
            obBeneficiary1.creditorAccount(toCreditorAccount1(obBeneficiary2.getCreditorAccount()));
        }


        return obBeneficiary1;
    }

    /**
     * Convert a beneficiary V1 to V2
     * @param obBeneficiary1 beneficiary in V1 format
     * @return beneficiary in V2 format
     */
    public static OBBeneficiary2 toBeneficiary2(OBBeneficiary1 obBeneficiary1) {

        OBBeneficiary2 obBeneficiary2 = new OBBeneficiary2();
        if (obBeneficiary1.getAccountId() != null) {
            obBeneficiary2.accountId(obBeneficiary1.getAccountId());
        }
        if (obBeneficiary1.getBeneficiaryId() != null) {
            obBeneficiary2.beneficiaryId(obBeneficiary1.getBeneficiaryId());
        }
        if (obBeneficiary1.getReference() != null) {
            obBeneficiary2.reference(obBeneficiary1.getReference());
        }
        if (obBeneficiary1.getServicer() != null) {
            obBeneficiary2.creditorAgent(new OBBranchAndFinancialInstitutionIdentification3()
                    .schemeName(obBeneficiary1.getServicer().getSchemeName().toString())
                    .identification(obBeneficiary1.getServicer().getIdentification())
            );
        }
        if (obBeneficiary1.getCreditorAccount() != null) {
            obBeneficiary2.creditorAccount(toCreditorAccount3(obBeneficiary1));
        }
        return obBeneficiary2;
    }

    private static OBCashAccount1 toCreditorAccount1(OBCashAccount3 creditorAccount) {
        return new OBCashAccount1()
                .identification(creditorAccount.getIdentification())
                .name(creditorAccount.getName())
                .schemeName(OBExternalAccountIdentification2Code.valueOfReference(creditorAccount.getSchemeName()))
                .secondaryIdentification(creditorAccount.getSecondaryIdentification());
    }

    private static OBCashAccount3 toCreditorAccount3(OBBeneficiary1 obBeneficiary1) {
        OBCashAccount1 creditorAccount = obBeneficiary1.getCreditorAccount();
        return new OBCashAccount3()
                .identification(creditorAccount.getIdentification())
                .name(creditorAccount.getName())
                .schemeName(creditorAccount.getSchemeName().toString())
                .secondaryIdentification(creditorAccount.getSecondaryIdentification());
    }
}
