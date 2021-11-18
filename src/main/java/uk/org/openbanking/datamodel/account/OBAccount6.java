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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountType     * Data.AccountSubType  For all other accounts, the fields must be populated by the ASPSP.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountType     * Data.AccountSubType  For all other accounts, the fields must be populated by the ASPSP.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBAccount6 {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("Status")
  private OBAccountStatus1Code status;

  @JsonProperty("StatusUpdateDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Nickname")
  private String nickname;

  @JsonProperty("OpeningDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime openingDate;

  @JsonProperty("MaturityDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime maturityDate;

  @JsonProperty("SwitchStatus")
  private String switchStatus;

  @JsonProperty("Account")
  @Valid
  private List<OBAccount6Account> account = null;

  @JsonProperty("Servicer")
  private OBBranchAndFinancialInstitutionIdentification50 servicer;

  public OBAccount6 accountId(String accountId) {
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

  public OBAccount6 status(OBAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBAccountStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount6 statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return statusUpdateDateTime
   */
  @ApiModelProperty(value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @Valid
  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount6 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   *
   * @return currency
   */
  @ApiModelProperty(value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")
  @Pattern(regexp = "^[A-Z]{3,3}$")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount6 accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   *
   * @return accountType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount6 accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   *
   * @return accountSubType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount6 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the description of the account type.
   *
   * @return description
   */
  @ApiModelProperty(value = "Specifies the description of the account type.")

  @Size(min = 1, max = 35)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount6 nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   *
   * @return nickname
   */
  @ApiModelProperty(value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")

  @Size(min = 1, max = 70)
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount6 openingDate(DateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return openingDate
   */
  @ApiModelProperty(value = "Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @Valid
  public DateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(DateTime openingDate) {
    this.openingDate = openingDate;
  }

  public OBAccount6 maturityDate(DateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return maturityDate
   */
  @ApiModelProperty(value = "Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @Valid
  public DateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(DateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public OBAccount6 switchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
    return this;
  }

  /**
   * Specifies the switch status for the account, in a coded form.
   *
   * @return switchStatus
   */
  @ApiModelProperty(value = "Specifies the switch status for the account, in a coded form.")


  public String getSwitchStatus() {
    return switchStatus;
  }

  public void setSwitchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
  }

  public OBAccount6 account(List<OBAccount6Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount6 addAccountItem(OBAccount6Account accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<OBAccount6Account>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   *
   * @return account
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<OBAccount6Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount6Account> account) {
    this.account = account;
  }

  public OBAccount6 servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   *
   * @return servicer
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6 obAccount6 = (OBAccount6) o;
    return Objects.equals(this.accountId, obAccount6.accountId) &&
            Objects.equals(this.status, obAccount6.status) &&
            Objects.equals(this.statusUpdateDateTime, obAccount6.statusUpdateDateTime) &&
            Objects.equals(this.currency, obAccount6.currency) &&
            Objects.equals(this.accountType, obAccount6.accountType) &&
            Objects.equals(this.accountSubType, obAccount6.accountSubType) &&
            Objects.equals(this.description, obAccount6.description) &&
            Objects.equals(this.nickname, obAccount6.nickname) &&
            Objects.equals(this.openingDate, obAccount6.openingDate) &&
            Objects.equals(this.maturityDate, obAccount6.maturityDate) &&
            Objects.equals(this.switchStatus, obAccount6.switchStatus) &&
            Objects.equals(this.account, obAccount6.account) &&
            Objects.equals(this.servicer, obAccount6.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, openingDate, maturityDate, switchStatus, account, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6 {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

