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
package uk.org.openbanking.datamodel.vrp.v3_1_10;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBDomesticVRPConsentResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-30T12:56:02.347748Z[Europe/London]")
public class OBDomesticVRPConsentResponseData   {
  /**
   * Indicates whether information about RefundAccount should be included in the payment response. 
   */
  public enum ReadRefundAccountEnum {
    YES("Yes"),
    
    NO("No");

    private String value;

    ReadRefundAccountEnum(String value) {
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
    public static ReadRefundAccountEnum fromValue(String value) {
      for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ReadRefundAccount")
  private ReadRefundAccountEnum readRefundAccount;

  @JsonProperty("ConsentId")
  private String consentId;

  @JsonProperty("CreationDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime creationDateTime;

  /**
   * Specifies the status of resource in code form. 
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    REJECTED("Rejected");

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
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime statusUpdateDateTime;

  @JsonProperty("ControlParameters")
  private OBDomesticVRPControlParameters controlParameters;

  @JsonProperty("Initiation")
  private OBDomesticVRPInitiation initiation;

  @JsonProperty("DebtorAccount")
  private OBCashAccountDebtorWithName debtorAccount;

  public OBDomesticVRPConsentResponseData readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
    return this;
  }

  /**
   * Indicates whether information about RefundAccount should be included in the payment response. 
   * @return readRefundAccount
  */
  @ApiModelProperty(value = "Indicates whether information about RefundAccount should be included in the payment response. ")


  public ReadRefundAccountEnum getReadRefundAccount() {
    return readRefundAccount;
  }

  public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
  }

  public OBDomesticVRPConsentResponseData consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the consent resource. 
   * @return consentId
  */
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the consent resource. ")
  @NotNull

@Size(min=1,max=128) 
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
   * Date and time at which the resource was created. 
   * @return creationDateTime
  */
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created. ")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBDomesticVRPConsentResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of resource in code form. 
   * @return status
  */
  @ApiModelProperty(required = true, value = "Specifies the status of resource in code form. ")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBDomesticVRPConsentResponseData statusUpdateDateTime(DateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. 
   * @return statusUpdateDateTime
  */
  @ApiModelProperty(required = true, value = "Date and time at which the resource status was updated. ")
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
   * @return debtorAccount
  */
  @ApiModelProperty(value = "")

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

