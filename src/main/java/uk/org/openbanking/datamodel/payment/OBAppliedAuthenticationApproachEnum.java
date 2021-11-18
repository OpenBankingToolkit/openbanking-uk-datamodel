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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was
 * subject to SCA performed by the TPP.
 *
 * <p>
 *  N.B. This enum has been created manually and should be used instead of all the equivalent enums that are created in
 *  classes such as {@link OBWriteDomesticConsent3DataSCASupportData} or {@link OBWriteDomesticConsent4DataSCASupportData}
 *  etc. This makes migrating to new API versions considerably easier.
 */
public enum OBAppliedAuthenticationApproachEnum {
    CA("CA"),

    SCA("SCA");

    private String value;

    OBAppliedAuthenticationApproachEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static OBAppliedAuthenticationApproachEnum fromValue(String text) {
        for (OBAppliedAuthenticationApproachEnum b : OBAppliedAuthenticationApproachEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}