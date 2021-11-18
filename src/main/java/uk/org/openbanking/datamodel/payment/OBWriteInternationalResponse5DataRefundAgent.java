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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
 */
@ApiModel(description = "Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWriteInternationalResponse5DataRefundAgent {
    @JsonProperty("SchemeName")
    private String schemeName;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PostalAddress")
    private OBPostalAddress6 postalAddress;

    public OBWriteInternationalResponse5DataRefundAgent schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     */
    @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteInternationalResponse5DataRefundAgent identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
     *
     * @return identification
     */
    @ApiModelProperty(value = "Unique and unambiguous identification of a financial institution or a branch of a financial institution.")
    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteInternationalResponse5DataRefundAgent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which an agent is known and which is usually used to identify that agent.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")
    @Size(min = 1, max = 140)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternationalResponse5DataRefundAgent postalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalResponse5DataRefundAgent obWriteInternationalResponse5DataRefundAgent = (OBWriteInternationalResponse5DataRefundAgent) o;
        return Objects.equals(this.schemeName, obWriteInternationalResponse5DataRefundAgent.schemeName) &&
                Objects.equals(this.identification, obWriteInternationalResponse5DataRefundAgent.identification) &&
                Objects.equals(this.name, obWriteInternationalResponse5DataRefundAgent.name) &&
                Objects.equals(this.postalAddress, obWriteInternationalResponse5DataRefundAgent.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, postalAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalResponse5DataRefundAgent {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
        sb.append("}");
        return sb.toString();
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

