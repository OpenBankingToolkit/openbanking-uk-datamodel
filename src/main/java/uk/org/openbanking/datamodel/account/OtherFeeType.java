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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee/charge type which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OtherFeeType {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Description")
    private String description = null;

    /**
     * Categorisation of fees and charges into standard categories.
     */
    public enum FeeCategoryEnum {
        OTHER("Other"),

        SERVICING("Servicing");

        private String value;

        FeeCategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeeCategoryEnum fromValue(String text) {
            for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("FeeCategory")
    private FeeCategoryEnum feeCategory = null;

    @JsonProperty("Name")
    private String name = null;

    public OtherFeeType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     * @return code
     **/
    @Pattern(regexp = "^\\w{0,4}$")
    @Size(min = 0, max = 4)
    @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OtherFeeType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     * @return description
     **/
    @NotNull
    @Size(min = 1, max = 350)
    @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OtherFeeType feeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Categorisation of fees and charges into standard categories.
     * @return feeCategory
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
    public FeeCategoryEnum getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
    }

    public OtherFeeType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "Long name associated with the code")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeeType otherFeeType = (OtherFeeType) o;
        return Objects.equals(this.code, otherFeeType.code) &&
                Objects.equals(this.description, otherFeeType.description) &&
                Objects.equals(this.feeCategory, otherFeeType.feeCategory) &&
                Objects.equals(this.name, otherFeeType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, feeCategory, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeeType {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

