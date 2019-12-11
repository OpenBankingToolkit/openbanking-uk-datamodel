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
package uk.org.openbanking.datamodel.error;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OBStandardErrorCodes1 implements StandardErrorCode {

    UK_OBIE_FIELD_EXPECTED("UK.OBIE.Field.Expected"),
    UK_OBIE_FIELD_INVALID("UK.OBIE.Field.Invalid"),
    UK_OBIE_FIELD_INVALID_DATE("UK.OBIE.Field.InvalidDate"),
    UK_OBIE_FIELD_MISSING("UK.OBIE.Field.Missing"),
    UK_OBIE_FIELD_UNEXPECTED("UK.OBIE.Field.Unexpected"),

    UK_OBIE_HEADER_INVALID("UK.OBIE.Header.Invalid"),
    UK_OBIE_HEADER_MISSING("UK.OBIE.Header.Missing"),

    UK_OBIE_PARAMETER_INVALID("UK.OBIE.Parameter.Invalid"),
    UK_OBIE_PARAMETER_MISSING("UK.OBIE.Parameter.Missing"),

    UK_OBIE_RESOURCE_CONSENT_MISMATCH("UK.OBIE.Resource.ConsentMismatch"),
    UK_OBIE_RESOURCE_INVALID_CONSENT_STATUS("UK.OBIE.Resource.InvalidConsentStatus"),
    UK_OBIE_RESOURCE_INVALID_FORMAT("UK.OBIE.Resource.InvalidFormat"),
    UK_OBIE_RESOURCE_NOT_FOUND("UK.OBIE.Resource.NotFound"),

    UK_OBIE_RULES_AFTER_CUT_OFF_DATE_TIME("UK.OBIE.rules.AfterCutOffDateTime"),

    UK_OBIE_SIGNATURE_INVALID("UK.OBIE.Signature.Invalid"),
    UK_OBIE_SIGNATURE_INVALID_CLAIM("UK.OBIE.Signature.InvalidClaim"),
    UK_OBIE_SIGNATURE_MISSING_CLAIM("UK.OBIE.Signature.MissingClaim"),
    UK_OBIE_SIGNATURE_MALFORMED("UK.OBIE.Signature.Malformed"),
    UK_OBIE_SIGNATURE_MISSING("UK.OBIE.Signature.Missing"),
    UK_OBIE_SIGNATURE_UNEXPECTED("UK.OBIE.Signature.Unexpected"),

    UK_OBIE_UNSUPPORTED_ACCOUNT_IDENTIFIER("UK.OBIE.Unsupported.AccountIdentifier"),
    UK_OBIE_UNSUPPORTED_ACCOUNT_SECONDARY_IDENTIFIER("UK.OBIE.Unsupported.AccountSecondaryIdentifier"),
    UK_OBIE_UNSUPPORTED_CURRENCY("UK.OBIE.Unsupported.Currency"),
    UK_OBIE_UNSUPPORTED_FREQUENCY("UK.OBIE.Unsupported.Frequency"),
    UK_OBIE_UNSUPPORTED_LOCAL_INSTRUMENT("UK.OBIE.Unsupported.LocalInstrument"),
    UK_OBIE_UNSUPPORTED_SCHEME("UK.OBIE.Unsupported.Scheme"),
    UK_OBIE_UNSUPPORTED_UNEXPECTED_ERROR("UK.OBIE.Unsupported.UnexpectedError"),

    UK_OBIE_INVALID_CONSENT_STATUS("UK.OBIE.Resource.InvalidConsentStatus"),

    ;

    private String value;

    OBStandardErrorCodes1(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static OBStandardErrorCodes1 fromValue(String text) {
        for (OBStandardErrorCodes1 b : OBStandardErrorCodes1.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}