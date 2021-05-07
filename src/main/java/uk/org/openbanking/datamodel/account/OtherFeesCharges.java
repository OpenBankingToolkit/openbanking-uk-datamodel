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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class OtherFeesCharges {
    @JsonProperty("FeeChargeDetail")
    private List<OtherFeesChargesFeeChargeDetail> feeChargeDetail = new ArrayList<OtherFeesChargesFeeChargeDetail>();

    @JsonProperty("FeeChargeCap")
    private List<OtherFeesChargesFeeChargeCap> feeChargeCap = null;

    public OtherFeesCharges feeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
        return this;
    }

    public OtherFeesCharges addFeeChargeDetailItem(OtherFeesChargesFeeChargeDetail feeChargeDetailItem) {
        this.feeChargeDetail.add(feeChargeDetailItem);
        return this;
    }

    /**
     * Other fees/charges details
     * @return feeChargeDetail
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Other fees/charges details")
    public List<OtherFeesChargesFeeChargeDetail> getFeeChargeDetail() {
        return feeChargeDetail;
    }

    public void setFeeChargeDetail(List<OtherFeesChargesFeeChargeDetail> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public OtherFeesCharges feeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public OtherFeesCharges addFeeChargeCapItem(OtherFeesChargesFeeChargeCap feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<OtherFeesChargesFeeChargeCap>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge
     * @return feeChargeCap
     **/
    @Valid
    @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
    public List<OtherFeesChargesFeeChargeCap> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeesCharges otherFeesCharges = (OtherFeesCharges) o;
        return Objects.equals(this.feeChargeDetail, otherFeesCharges.feeChargeDetail) &&
                Objects.equals(this.feeChargeCap, otherFeesCharges.feeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeChargeDetail, feeChargeCap);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeesCharges {\n");

        sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
        sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

