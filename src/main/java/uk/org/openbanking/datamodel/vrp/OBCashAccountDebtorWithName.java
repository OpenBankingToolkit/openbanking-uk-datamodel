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
package uk.org.openbanking.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ^ Only incuded in the response if &#x60;Data. ReadRefundAccount&#x60; is set to &#x60;Yes&#x60; in the consent.
 */
@ApiModel(description = "^ Only incuded in the response if `Data. ReadRefundAccount` is set to `Yes` in the consent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T16:24:12.845482Z[Europe/London]")
public class OBCashAccountDebtorWithName {
    @JsonProperty("SchemeName")
    private String schemeName;

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("SecondaryIdentification")
    private String secondaryIdentification;

    public OBCashAccountDebtorWithName schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * ^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBExternalAccountIdentification4Code
     * @return schemeName
     */
    @ApiModelProperty(required = true, value = "^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBExternalAccountIdentification4Code")
    @NotNull


    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBCashAccountDebtorWithName identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * ^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text
     * @return identification
     */
    @ApiModelProperty(required = true, value = "^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text")
    @NotNull


    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBCashAccountDebtorWithName name(String name) {
        this.name = name;
        return this;
    }

    /**
     * ^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
     * @return name
     */
    @ApiModelProperty(required = true, value = "^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.")
    @NotNull


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBCashAccountDebtorWithName secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * ^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text
     * @return secondaryIdentification
     */
    @ApiModelProperty(value = "^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text")


    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBCashAccountDebtorWithName obCashAccountDebtorWithName = (OBCashAccountDebtorWithName) o;
        return Objects.equals(this.schemeName, obCashAccountDebtorWithName.schemeName) &&
                Objects.equals(this.identification, obCashAccountDebtorWithName.identification) &&
                Objects.equals(this.name, obCashAccountDebtorWithName.name) &&
                Objects.equals(this.secondaryIdentification, obCashAccountDebtorWithName.secondaryIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, secondaryIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCashAccountDebtorWithName {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

