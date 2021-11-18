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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to provide details of a charge for the payment initiation.
 */
@ApiModel(description = "Set of elements used to provide details of a charge for the payment initiation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWriteDomesticConsentResponse5DataCharges {
  @JsonProperty("ChargeBearer")
  private OBChargeBearerType1Code chargeBearer;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount amount;

  public OBWriteDomesticConsentResponse5DataCharges chargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

  /**
   * Get chargeBearer
   *
   * @return chargeBearer
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBChargeBearerType1Code getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public OBWriteDomesticConsentResponse5DataCharges type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Charge type, in a coded form.
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "Charge type, in a coded form.")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBWriteDomesticConsentResponse5DataCharges amount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBActiveOrHistoricCurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDomesticConsentResponse5DataCharges obWriteDomesticConsentResponse5DataCharges = (OBWriteDomesticConsentResponse5DataCharges) o;
    return Objects.equals(this.chargeBearer, obWriteDomesticConsentResponse5DataCharges.chargeBearer) &&
            Objects.equals(this.type, obWriteDomesticConsentResponse5DataCharges.type) &&
            Objects.equals(this.amount, obWriteDomesticConsentResponse5DataCharges.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeBearer, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDomesticConsentResponse5DataCharges {\n");

    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

