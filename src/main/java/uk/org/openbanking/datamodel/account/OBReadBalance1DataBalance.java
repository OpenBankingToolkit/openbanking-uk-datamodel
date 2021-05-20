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
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Set of elements used to define the balance details.
 */
@ApiModel(description = "Set of elements used to define the balance details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadBalance1DataBalance {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode2 creditDebitIndicator;

  @JsonProperty("Type")
  private OBBalanceType1Code type;

  @JsonProperty("DateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime dateTime;

  @JsonProperty("Amount")
  private OBReadBalance1DataAmount amount;

  @JsonProperty("CreditLine")
  @Valid
  private List<OBReadBalance1DataCreditLine> creditLine = null;

  public OBReadBalance1DataBalance accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   *
   * @return accountId
   */
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull
  @Size(min = 1, max = 40)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadBalance1DataBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
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
  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBReadBalance1DataBalance type(OBBalanceType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBBalanceType1Code getType() {
    return type;
  }

  public void setType(OBBalanceType1Code type) {
    this.type = type;
  }

  public OBReadBalance1DataBalance dateTime(DateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return dateTime
   */
  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull
  @Valid
  public DateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  public OBReadBalance1DataBalance amount(OBReadBalance1DataAmount amount) {
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
  public OBReadBalance1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataBalance creditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
    return this;
  }

  public OBReadBalance1DataBalance addCreditLineItem(OBReadBalance1DataCreditLine creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<OBReadBalance1DataCreditLine>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

  /**
   * Get creditLine
   *
   * @return creditLine
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<OBReadBalance1DataCreditLine> getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(List<OBReadBalance1DataCreditLine> creditLine) {
    this.creditLine = creditLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataBalance obReadBalance1DataBalance = (OBReadBalance1DataBalance) o;
    return Objects.equals(this.accountId, obReadBalance1DataBalance.accountId) &&
            Objects.equals(this.creditDebitIndicator, obReadBalance1DataBalance.creditDebitIndicator) &&
            Objects.equals(this.type, obReadBalance1DataBalance.type) &&
            Objects.equals(this.dateTime, obReadBalance1DataBalance.dateTime) &&
            Objects.equals(this.amount, obReadBalance1DataBalance.amount) &&
            Objects.equals(this.creditLine, obReadBalance1DataBalance.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalance {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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

