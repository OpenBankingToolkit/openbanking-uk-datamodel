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
import java.util.Objects;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic amount for the statement resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBStatement2StatementAmount {
  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode0 creditDebitIndicator;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount8 amount;

  public OBStatement2StatementAmount creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   *
   * @return creditDebitIndicator
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementAmount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Amount type, in a coded form.
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "Amount type, in a coded form.")
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementAmount amount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
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
  public OBActiveOrHistoricCurrencyAndAmount8 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
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
    OBStatement2StatementAmount obStatement2StatementAmount = (OBStatement2StatementAmount) o;
    return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmount.creditDebitIndicator) &&
            Objects.equals(this.type, obStatement2StatementAmount.type) &&
            Objects.equals(this.amount, obStatement2StatementAmount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmount {\n");

    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
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

