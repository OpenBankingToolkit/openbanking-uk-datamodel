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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Details of the merchant involved in the transaction.
 */
@ApiModel(description = "Details of the merchant involved in the transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBMerchantDetails1 {
    @JsonProperty("MerchantName")
    private String merchantName;

    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode;

    public OBMerchantDetails1 merchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    /**
     * Name by which the merchant is known.
     *
     * @return merchantName
     */
    @ApiModelProperty(value = "Name by which the merchant is known.")
    @Size(min = 1, max = 350)
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public OBMerchantDetails1 merchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
     *
     * @return merchantCategoryCode
     */
    @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
    @Size(min = 3, max = 4)
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
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
        return Objects.equals(this.merchantName, obMerchantDetails1.merchantName) &&
                Objects.equals(this.merchantCategoryCode, obMerchantDetails1.merchantCategoryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantName, merchantCategoryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBMerchantDetails1 {\n");

        sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
        sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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

