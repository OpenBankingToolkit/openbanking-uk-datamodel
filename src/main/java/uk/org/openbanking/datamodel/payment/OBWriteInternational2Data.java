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
/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBWriteInternational2Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteInternational2Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("Initiation")
    private OBWriteInternational2DataInitiation initiation = null;

    public OBWriteInternational2Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternational2Data initiation(OBWriteInternational2DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternational2DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternational2DataInitiation initiation) {
        this.initiation = initiation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternational2Data obWriteInternational2Data = (OBWriteInternational2Data) o;
        return Objects.equals(this.consentId, obWriteInternational2Data.consentId) &&
                Objects.equals(this.initiation, obWriteInternational2Data.initiation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, initiation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational2Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

