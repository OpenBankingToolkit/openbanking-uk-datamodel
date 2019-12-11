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
package uk.org.openbanking.datamodel.discovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;
import java.util.StringJoiner;

@ApiModel(description = "Funds Confirmation endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksFundsConfirmation3 implements OBDiscoveryAPILinks{

    @JsonProperty("CreateFundsConfirmationConsent")
    private String createFundsConfirmationConsent;
    @JsonProperty("GetFundsConfirmationConsent")
    private String getFundsConfirmationConsent;
    @JsonProperty("CreateFundsConfirmation")
    private String createFundsConfirmation;

    public String getCreateFundsConfirmationConsent() {
        return createFundsConfirmationConsent;
    }

    public void setCreateFundsConfirmationConsent(String createFundsConfirmationConsent) {
        this.createFundsConfirmationConsent = createFundsConfirmationConsent;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 createFundsConfirmationConsent(String createFundsConfirmationConsent) {
        this.createFundsConfirmationConsent = createFundsConfirmationConsent;
        return this;
    }

    public String getGetFundsConfirmationConsent() {
        return getFundsConfirmationConsent;
    }

    public void setGetFundsConfirmationConsent(String getFundsConfirmationConsent) {
        this.getFundsConfirmationConsent = getFundsConfirmationConsent;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 getFundsConfirmationConsent(String getFundsConfirmationConsent) {
        this.getFundsConfirmationConsent = getFundsConfirmationConsent;
        return this;
    }

    public String getCreateFundsConfirmation() {
        return createFundsConfirmation;
    }

    public void setCreateFundsConfirmation(String createFundsConfirmation) {
        this.createFundsConfirmation = createFundsConfirmation;
    }

    public OBDiscoveryAPILinksFundsConfirmation3 createFundsConfirmation(String createFundsConfirmation) {
        this.createFundsConfirmation = createFundsConfirmation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksFundsConfirmation3 that = (OBDiscoveryAPILinksFundsConfirmation3) o;
        return Objects.equals(createFundsConfirmationConsent, that.createFundsConfirmationConsent) &&
                Objects.equals(getFundsConfirmationConsent, that.getFundsConfirmationConsent) &&
                Objects.equals(createFundsConfirmation, that.createFundsConfirmation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createFundsConfirmationConsent, getFundsConfirmationConsent, createFundsConfirmation);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OBDiscoveryAPILinksFundsConfirmation3.class.getSimpleName() + "[", "]")
                .add("createFundsConfirmationConsent='" + createFundsConfirmationConsent + "'")
                .add("getFundsConfirmationConsent='" + getFundsConfirmationConsent + "'")
                .add("createFundsConfirmation='" + createFundsConfirmation + "'")
                .toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
