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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBBranchAndFinancialInstitutionIdentification2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBBranchAndFinancialInstitutionIdentification2 {
    @JsonProperty("SchemeName")
    private OBExternalFinancialInstitutionIdentification2Code schemeName = null;

    @JsonProperty("Identification")
    private String identification = null;

    public OBBranchAndFinancialInstitutionIdentification2 schemeName(OBExternalFinancialInstitutionIdentification2Code schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Get schemeName
     * @return schemeName
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalFinancialInstitutionIdentification2Code getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(OBExternalFinancialInstitutionIdentification2Code schemeName) {
        this.schemeName = schemeName;
    }

    public OBBranchAndFinancialInstitutionIdentification2 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Get identification
     * @return identification
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBranchAndFinancialInstitutionIdentification2 obBranchAndFinancialInstitutionIdentification2 = (OBBranchAndFinancialInstitutionIdentification2) o;
        return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification2.schemeName) &&
                Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification2.identification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBranchAndFinancialInstitutionIdentification2 {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

