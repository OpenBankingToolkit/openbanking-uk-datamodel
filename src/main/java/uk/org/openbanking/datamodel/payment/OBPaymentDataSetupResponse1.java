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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.jackson.DateTimeDeserializer;
import uk.org.openbanking.jackson.DateTimeSerializer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp
 */
@ApiModel(description = "Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp")


public class OBPaymentDataSetupResponse1 {
  @JsonProperty("PaymentId")
  private String paymentId = null;

  @JsonProperty("Status")
  private OBTransactionIndividualStatus1Code status = null;

  @JsonProperty("CreationDateTime")
  @JsonDeserialize(using = DateTimeDeserializer.class)
  @JsonSerialize(using = DateTimeSerializer.class)
  private DateTime creationDateTime = null;

  @JsonProperty("Initiation")
  private OBInitiation1 initiation = null;

  public OBPaymentDataSetupResponse1 paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.")
  @NotNull

 @Size(min=1,max=128)
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public OBPaymentDataSetupResponse1 status(OBTransactionIndividualStatus1Code status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the payment resource.
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the payment resource.")


  public OBTransactionIndividualStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBTransactionIndividualStatus1Code status) {
    this.status = status;
  }

  public OBPaymentDataSetupResponse1 creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.  All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBPaymentDataSetupResponse1 initiation(OBInitiation1 initiation) {
    this.initiation = initiation;
    return this;
  }

   /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBInitiation1 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInitiation1 initiation) {
    this.initiation = initiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPaymentDataSetupResponse1 paymentSetupResponse = (OBPaymentDataSetupResponse1) o;
    return Objects.equals(this.paymentId, paymentSetupResponse.paymentId) &&
        Objects.equals(this.status, paymentSetupResponse.status) &&
        Objects.equals(this.creationDateTime, paymentSetupResponse.creationDateTime) &&
        Objects.equals(this.initiation, paymentSetupResponse.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, status, creationDateTime, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

