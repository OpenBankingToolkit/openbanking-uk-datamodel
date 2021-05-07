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

import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Range or amounts or rates for which the fee/charge applies
 */
@ApiModel(description = "Range or amounts or rates for which the fee/charge applies")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OBReadProduct2DataOtherProductTypeFeeApplicableRange {
    @JsonProperty("MaximumAmount")
    private String maximumAmount = null;

    @JsonProperty("MaximumRate")
    private String maximumRate = null;

    @JsonProperty("MinimumAmount")
    private String minimumAmount = null;

    @JsonProperty("MinimumRate")
    private String minimumRate = null;

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
        return this;
    }

    /**
     * Maximum Amount on which fee is applicable (where it is expressed as an amount)
     * @return maximumAmount
     **/
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
    public String getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
        return this;
    }

    /**
     * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
     * @return maximumRate
     **/
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
    public String getMaximumRate() {
        return maximumRate;
    }

    public void setMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }

    /**
     * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
     * @return minimumAmount
     **/
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
    public String getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
        return this;
    }

    /**
     * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
     * @return minimumRate
     **/
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
    public String getMinimumRate() {
        return minimumRate;
    }

    public void setMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeFeeApplicableRange obReadProduct2DataOtherProductTypeFeeApplicableRange = (OBReadProduct2DataOtherProductTypeFeeApplicableRange) o;
        return Objects.equals(this.maximumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumAmount) &&
                Objects.equals(this.maximumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumRate) &&
                Objects.equals(this.minimumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumAmount) &&
                Objects.equals(this.minimumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumAmount, maximumRate, minimumAmount, minimumRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeFeeApplicableRange {\n");

        sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
        sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
        sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
        sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
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

