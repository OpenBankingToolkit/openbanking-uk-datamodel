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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Details of the merchant involved in the transaction.
 */
@ApiModel(description = "Details of the merchant involved in the transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBMerchantDetails1 {
    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode = null;

    @JsonProperty("MerchantName")
    private String merchantName = null;

    public OBMerchantDetails1 merchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
     * @return merchantCategoryCode
     **/
    @Size(min = 3, max = 4)
    @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public OBMerchantDetails1 merchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    /**
     * Name by which the merchant is known.
     * @return merchantName
     **/
    @Size(min = 1, max = 350)
    @ApiModelProperty(value = "Name by which the merchant is known.")
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBMerchantDetails1 obMerchantDetails1 = (OBMerchantDetails1) o;
        return Objects.equals(this.merchantCategoryCode, obMerchantDetails1.merchantCategoryCode) &&
                Objects.equals(this.merchantName, obMerchantDetails1.merchantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantCategoryCode, merchantName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBMerchantDetails1 {\n");

        sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
        sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

