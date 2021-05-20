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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Payment status details as per underlying Payment Rail.
 */
@ApiModel(description = "Payment status details as per underlying Payment Rail.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWritePaymentDetailsResponse1DataStatusDetail {
  @JsonProperty("LocalInstrument")
  private String localInstrument;

  @JsonProperty("Status")
  private String status;

  /**
   * Reason Code provided for the status of a transfer.
   */
  public enum StatusReasonEnum {
    CANCELLED("Cancelled"),

    PENDINGFAILINGSETTLEMENT("PendingFailingSettlement"),

    PENDINGSETTLEMENT("PendingSettlement"),

    PROPRIETARY("Proprietary"),

    PROPRIETARYREJECTION("ProprietaryRejection"),

    SUSPENDED("Suspended"),

    UNMATCHED("Unmatched");

    private String value;

    StatusReasonEnum(String value) {
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
    public static StatusReasonEnum fromValue(String value) {
      for (StatusReasonEnum b : StatusReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("StatusReason")
  private StatusReasonEnum statusReason;

  @JsonProperty("StatusReasonDescription")
  private String statusReasonDescription;

  public OBWritePaymentDetailsResponse1DataStatusDetail localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
   *
   * @return localInstrument
   */
  @ApiModelProperty(value = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.")
  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of a transfer, as assigned by the transaction administrator.
   *
   * @return status
   */
  @ApiModelProperty(required = true, value = "Status of a transfer, as assigned by the transaction administrator.")
  @NotNull
  @Size(min = 1, max = 128)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Reason Code provided for the status of a transfer.
   *
   * @return statusReason
   */
  @ApiModelProperty(value = "Reason Code provided for the status of a transfer.")
  public StatusReasonEnum getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(StatusReasonEnum statusReason) {
    this.statusReason = statusReason;
  }

  public OBWritePaymentDetailsResponse1DataStatusDetail statusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
    return this;
  }

  /**
   * Reason provided for the status of a transfer.
   *
   * @return statusReasonDescription
   */
  @ApiModelProperty(value = "Reason provided for the status of a transfer.")
  @Size(min = 1, max = 256)
  public String getStatusReasonDescription() {
    return statusReasonDescription;
  }

  public void setStatusReasonDescription(String statusReasonDescription) {
    this.statusReasonDescription = statusReasonDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWritePaymentDetailsResponse1DataStatusDetail obWritePaymentDetailsResponse1DataStatusDetail = (OBWritePaymentDetailsResponse1DataStatusDetail) o;
    return Objects.equals(this.localInstrument, obWritePaymentDetailsResponse1DataStatusDetail.localInstrument) &&
            Objects.equals(this.status, obWritePaymentDetailsResponse1DataStatusDetail.status) &&
            Objects.equals(this.statusReason, obWritePaymentDetailsResponse1DataStatusDetail.statusReason) &&
            Objects.equals(this.statusReasonDescription, obWritePaymentDetailsResponse1DataStatusDetail.statusReasonDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localInstrument, status, statusReason, statusReasonDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWritePaymentDetailsResponse1DataStatusDetail {\n");

    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusReasonDescription: ").append(toIndentedString(statusReasonDescription)).append("\n");
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

