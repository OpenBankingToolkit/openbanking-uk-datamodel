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
package uk.org.openbanking.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBReadRefundAccountEnum;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBDomesticVRPConsentResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-21T09:44:44.818881+01:00[Europe/London]")

public class OBDomesticVRPConsentResponseData {

  @JsonProperty("ReadRefundAccount")
  private OBReadRefundAccountEnum readRefundAccount; // use existing enum, rather than duplicating for VRPs

  @JsonProperty("ConsentId")
  private String consentId;

  @JsonProperty("CreationDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime creationDateTime;

  @JsonProperty("Status")
  private String status;

  @JsonProperty("StatusUpdateDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @JsonProperty("ControlParameters")
  private OBDomesticVRPControlParameters controlParameters;

  @JsonProperty("Initiation")
  private OBDomesticVRPInitiation initiation;

  @JsonProperty("DebtorAccount")
  private OBCashAccountDebtorWithName debtorAccount;

  public OBDomesticVRPConsentResponseData readRefundAccount(OBReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
    return this;
  }

  /**
   * Indicates whether information about RefundAccount should be included in the payment response.
   *
   * @return readRefundAccount
   */
  @ApiModelProperty(value = "Indicates whether information about RefundAccount should be included in the payment response. ")


  public OBReadRefundAccountEnum getReadRefundAccount() {
    return readRefundAccount;
  }

  public void setReadRefundAccount(OBReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
  }

  public OBDomesticVRPConsentResponseData consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the consent resource.      | Max128Text
   *
   * @return consentId
   */
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the consent resource.      | Max128Text ")
  @NotNull


  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBDomesticVRPConsentResponseData creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created.|ISODateTime
   *
   * @return creationDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.|ISODateTime ")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBDomesticVRPConsentResponseData status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of resource in code form.  |Authorised AwaitingAuthorisation Rejected Revoked Expired
   *
   * @return status
   */
  @ApiModelProperty(required = true, value = "Specifies the status of resource in code form.  |Authorised AwaitingAuthorisation Rejected Revoked Expired ")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OBDomesticVRPConsentResponseData statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated.  | ISODateTime
   *
   * @return statusUpdateDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated.  | ISODateTime   ")
  @NotNull

  @Valid

  public DateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBDomesticVRPConsentResponseData controlParameters(OBDomesticVRPControlParameters controlParameters) {
    this.controlParameters = controlParameters;
    return this;
  }

  /**
   * Get controlParameters
   *
   * @return controlParameters
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBDomesticVRPControlParameters getControlParameters() {
    return controlParameters;
  }

  public void setControlParameters(OBDomesticVRPControlParameters controlParameters) {
    this.controlParameters = controlParameters;
  }

  public OBDomesticVRPConsentResponseData initiation(OBDomesticVRPInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   *
   * @return initiation
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBDomesticVRPInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBDomesticVRPInitiation initiation) {
    this.initiation = initiation;
  }

  public OBDomesticVRPConsentResponseData debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
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

  public OBCashAccountDebtorWithName getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccountDebtorWithName debtorAccount) {
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
    OBDomesticVRPConsentResponseData obDomesticVRPConsentResponseData = (OBDomesticVRPConsentResponseData) o;
    return Objects.equals(this.readRefundAccount, obDomesticVRPConsentResponseData.readRefundAccount) &&
            Objects.equals(this.consentId, obDomesticVRPConsentResponseData.consentId) &&
            Objects.equals(this.creationDateTime, obDomesticVRPConsentResponseData.creationDateTime) &&
            Objects.equals(this.status, obDomesticVRPConsentResponseData.status) &&
            Objects.equals(this.statusUpdateDateTime, obDomesticVRPConsentResponseData.statusUpdateDateTime) &&
            Objects.equals(this.controlParameters, obDomesticVRPConsentResponseData.controlParameters) &&
            Objects.equals(this.initiation, obDomesticVRPConsentResponseData.initiation) &&
            Objects.equals(this.debtorAccount, obDomesticVRPConsentResponseData.debtorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readRefundAccount, consentId, creationDateTime, status, statusUpdateDateTime, controlParameters, initiation, debtorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDomesticVRPConsentResponseData {\n");

    sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    controlParameters: ").append(toIndentedString(controlParameters)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

