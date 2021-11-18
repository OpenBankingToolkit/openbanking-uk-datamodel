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
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class Overdraft1OverdraftFeesCharges {
  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")
  @Valid
  private List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<Overdraft1OverdraftFeeChargeDetail>();

  public Overdraft1OverdraftFeesCharges overdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public Overdraft1OverdraftFeesCharges addOverdraftFeeChargeCapItem(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<Overdraft1OverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   *
   * @return overdraftFeeChargeCap
   */
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  @Valid
  public List<Overdraft1OverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<Overdraft1OverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public Overdraft1OverdraftFeesCharges overdraftFeeChargeDetail(List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public Overdraft1OverdraftFeesCharges addOverdraftFeeChargeDetailItem(Overdraft1OverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
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
  public List<Overdraft1OverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<Overdraft1OverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
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
    Overdraft1OverdraftFeesCharges overdraft1OverdraftFeesCharges = (Overdraft1OverdraftFeesCharges) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeesCharges.overdraftFeeChargeCap) &&
            Objects.equals(this.overdraftFeeChargeDetail, overdraft1OverdraftFeesCharges.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1OverdraftFeesCharges {\n");

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

