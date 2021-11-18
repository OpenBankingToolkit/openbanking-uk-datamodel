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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 */
@ApiModel(description = "Set of elements to fully identify a proprietary bank transaction code.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class ProprietaryBankTransactionCodeStructure1 {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Issuer")
    private String issuer;

    public ProprietaryBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Proprietary bank transaction code to identify the underlying transaction.
     *
     * @return code
     */
    @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
    @NotNull
    @Size(min = 1, max = 35)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Identification of the issuer of the proprietary bank transaction code.
     *
     * @return issuer
     */
    @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")
    @Size(min = 1, max = 35)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
                Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

