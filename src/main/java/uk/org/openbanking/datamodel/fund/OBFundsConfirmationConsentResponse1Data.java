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
package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBFundsConfirmationConsentResponse1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T10:02:34.555654+01:00[Europe/London]")

public class OBFundsConfirmationConsentResponse1Data {
  @JsonProperty("ConsentId")
  private String consentId;

  @JsonProperty("CreationDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime creationDateTime;

  /**
   * Specifies the status of consent resource in code form.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),

    AWAITINGAUTHORISATION("AwaitingAuthorisation"),

    REJECTED("Rejected"),

    REVOKED("Revoked");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("StatusUpdateDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @JsonProperty("ExpirationDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime expirationDateTime;

  @JsonProperty("DebtorAccount")
  private OBFundsConfirmationConsent1DataDebtorAccount debtorAccount;

  public OBFundsConfirmationConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the funds confirmation consent resource.
   *
   * @return consentId
   */
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the funds confirmation consent resource.")
  @NotNull
  @Size(min = 1, max = 128)
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBFundsConfirmationConsentResponse1Data creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return creationDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull
  @Valid
  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of consent resource in code form.
   *
   * @return status
   */
  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBFundsConfirmationConsentResponse1Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return statusUpdateDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull
  @Valid
  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data expirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   *
   * @return expirationDateTime
   */
  @ApiModelProperty(value = "Specified date and time the funds confirmation authorisation will expire. If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @Valid
  public DateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBFundsConfirmationConsentResponse1Data debtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   *
   * @return debtorAccount
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBFundsConfirmationConsent1DataDebtorAccount getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationConsentResponse1Data obFundsConfirmationConsentResponse1Data = (OBFundsConfirmationConsentResponse1Data) o;
    return Objects.equals(this.consentId, obFundsConfirmationConsentResponse1Data.consentId) &&
            Objects.equals(this.creationDateTime, obFundsConfirmationConsentResponse1Data.creationDateTime) &&
            Objects.equals(this.status, obFundsConfirmationConsentResponse1Data.status) &&
            Objects.equals(this.statusUpdateDateTime, obFundsConfirmationConsentResponse1Data.statusUpdateDateTime) &&
            Objects.equals(this.expirationDateTime, obFundsConfirmationConsentResponse1Data.expirationDateTime) &&
            Objects.equals(this.debtorAccount, obFundsConfirmationConsentResponse1Data.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, expirationDateTime, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationConsentResponse1Data {\n");

    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

