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
import java.util.Objects;

/**
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 */
@ApiModel(description = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBBankTransactionCodeStructure1 {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("SubCode")
    private String subCode;

    public OBBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Specifies the family within a domain.
     *
     * @return code
     */
    @ApiModelProperty(required = true, value = "Specifies the family within a domain.")
    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBBankTransactionCodeStructure1 subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }

    /**
     * Specifies the sub-product family within a specific family.
     *
     * @return subCode
     */
    @ApiModelProperty(required = true, value = "Specifies the sub-product family within a specific family.")
    @NotNull
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBankTransactionCodeStructure1 obBankTransactionCodeStructure1 = (OBBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, obBankTransactionCodeStructure1.code) &&
                Objects.equals(this.subCode, obBankTransactionCodeStructure1.subCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, subCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBankTransactionCodeStructure1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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

