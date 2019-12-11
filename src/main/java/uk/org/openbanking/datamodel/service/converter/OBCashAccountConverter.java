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


public class OBCashAccountConverter {

    /**
     * Convert cash account from V3 to V1
     * @param cashAccount3 cash account in V3 format
     * @return cash account in V1 format
     */
    public static OBCashAccount1 toOBCashAccount1(OBCashAccount3 cashAccount3) {
        return new OBCashAccount1()
                .identification(cashAccount3.getIdentification())
                .name(cashAccount3.getName())
                .schemeName(OBExternalAccountIdentification2Code.valueOfReference(cashAccount3.getSchemeName()))
                .secondaryIdentification(cashAccount3.getSecondaryIdentification());
    }

    /**
     * Convert cash account from V3 to V2
     * @param cashAccount3 cash account in V3 format
     * @return cash account in V2 format
     */
    public static OBCashAccount2 toOBCashAccount2(OBCashAccount3 cashAccount3) {
        return new OBCashAccount2()
                .identification(cashAccount3.getIdentification())
                .name(cashAccount3.getName())
                .schemeName(schemeNameToOBExternalAccountIdentification3Code(cashAccount3.getSchemeName()))
                .secondaryIdentification(cashAccount3.getSecondaryIdentification());
    }

    private static OBExternalAccountIdentification3Code schemeNameToOBExternalAccountIdentification3Code(String schemeName) {
        // Try OBExternalAccountIdentification4Code
        OBExternalAccountIdentification4Code accountId4Code = OBExternalAccountIdentification4Code.fromValue(schemeName);
        if (accountId4Code!=null) {
            return OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(accountId4Code);
        }

        // Try OBExternalAccountIdentification3Code
        OBExternalAccountIdentification3Code accountId3Code = OBExternalAccountIdentification3Code.fromValue(schemeName);
        if (accountId3Code!=null) {
            return accountId3Code;
        }

        // Try OBExternalAccountIdentification2Code
        OBExternalAccountIdentification2Code accountId2Code = OBExternalAccountIdentification2Code.valueOfReference(schemeName);
        if (accountId2Code!=null) {
            return OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(accountId2Code);
        }

        return null;
    }

    /**
     * Convert cash account from V1 to V3
     * @param cashAccount1 cash account in V1 format
     * @return cash account in V3 format
     */
    public static OBCashAccount3 toOBCashAccount3(OBCashAccount1 cashAccount1) {
        OBExternalAccountIdentification4Code code = OBExternalAccountIdentification4Code.fromValue(cashAccount1.getSchemeName().toString());
        return new OBCashAccount3()
                .identification(cashAccount1.getIdentification())
                .name(cashAccount1.getName())
                .schemeName((code==null) ? cashAccount1.getSchemeName().toString() : code.toString())
                .secondaryIdentification(cashAccount1.getSecondaryIdentification());
    }
}
