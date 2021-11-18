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
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */
@ApiModel(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges {
    @JsonProperty("RepaymentFeeChargeDetail")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail>();

    @JsonProperty("RepaymentFeeChargeCap")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
        this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }

    /**
     * Get repaymentFeeChargeDetail
     *
     * @return repaymentFeeChargeDetail
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
        return repaymentFeeChargeDetail;
    }

    public void setRepaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
        this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
        this.repaymentFeeChargeCap = repaymentFeeChargeCap;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeCapItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
        if (this.repaymentFeeChargeCap == null) {
            this.repaymentFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap>();
        }
        this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
        return this;
    }

    /**
     * Get repaymentFeeChargeCap
     *
     * @return repaymentFeeChargeCap
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
        return repaymentFeeChargeCap;
    }

    public void setRepaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
        this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges) o;
        return Objects.equals(this.repaymentFeeChargeDetail, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeDetail) &&
                Objects.equals(this.repaymentFeeChargeCap, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeCap);
    }

  @Override
  public int hashCode() {
      return Objects.hash(repaymentFeeChargeDetail, repaymentFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges {\n");

      sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
      sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
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

