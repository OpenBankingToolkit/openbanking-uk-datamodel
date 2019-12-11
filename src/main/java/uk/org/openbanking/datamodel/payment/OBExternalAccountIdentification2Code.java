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
package uk.org.openbanking.datamodel.payment;

public enum OBExternalAccountIdentification2Code {
    /**
     * An identifier used internationally by financial institutions to uniquely identify the account of a customer at
     * a financial institution, as described in the latest edition of the international standard ISO 13616. “Banking
     * and related financial services – International Bank Account Number (IBAN)”.
     */
    IBAN("UK.OBIE.IBAN"),
    /**
     * Sort Code and Account Number – identifier scheme used in the UK by financial institutions to identify the
     * account of a customer. The identifier is the concatenation of the 6 digit UK sort code and 8 digit account number.
     The regular expression for this identifier is: ^[0-9]{6}[0-9]{8}$
     */
    SortCodeAccountNumber("UK.OBIE.SortCodeAccountNumber");

    private String reference;

    OBExternalAccountIdentification2Code(String reference) {
        this.reference = reference;
    }

    /**
     * Get the Official reference like "UK.OBIE.SortCodeAccountNumber"
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Parse from reference
     * @param reference the reference
     * @return null if not found
     */
    public static OBExternalAccountIdentification2Code valueOfReference(String reference) {
        for (OBExternalAccountIdentification2Code code : OBExternalAccountIdentification2Code.values()) {
            if (code.getReference().equals(reference)) {
                return code;
            }
        }
        return null;
    }
}
