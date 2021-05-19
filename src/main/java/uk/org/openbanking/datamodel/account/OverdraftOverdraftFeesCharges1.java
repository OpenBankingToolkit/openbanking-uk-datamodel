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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Overdraft fees and charges details
 */
@ApiModel(description = "Overdraft fees and charges details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OverdraftOverdraftFeesCharges1 {
    @JsonProperty("OverdraftFeeChargeCap")
    @Valid
    private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

    @JsonProperty("OverdraftFeeChargeDetail")
    @Valid
    private List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<OverdraftOverdraftFeeChargeDetail>();

    public OverdraftOverdraftFeesCharges1 overdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OverdraftOverdraftFeesCharges1 addOverdraftFeeChargeCapItem(OverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<OverdraftOverdraftFeeChargeCap>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
     *
     * @return overdraftFeeChargeCap
     */
    @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    @Valid
    public List<OverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OverdraftOverdraftFeesCharges1 overdraftFeeChargeDetail(List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
        return this;
    }

    public OverdraftOverdraftFeesCharges1 addOverdraftFeeChargeDetailItem(OverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
        this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
        return this;
    }

    /**
     * Details about the fees/charges
     *
     * @return overdraftFeeChargeDetail
     */
    @ApiModelProperty(required = true, value = "Details about the fees/charges")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
        return overdraftFeeChargeDetail;
    }

    public void setOverdraftFeeChargeDetail(List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
        this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftOverdraftFeesCharges1 overdraftOverdraftFeesCharges1 = (OverdraftOverdraftFeesCharges1) o;
        return Objects.equals(this.overdraftFeeChargeCap, overdraftOverdraftFeesCharges1.overdraftFeeChargeCap) &&
                Objects.equals(this.overdraftFeeChargeDetail, overdraftOverdraftFeesCharges1.overdraftFeeChargeDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftOverdraftFeesCharges1 {\n");

        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

