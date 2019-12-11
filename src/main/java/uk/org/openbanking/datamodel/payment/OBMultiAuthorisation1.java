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
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The multiple authorisation flow response from the ASPSP.
 */
@ApiModel(description = "The multiple authorisation flow response from the ASPSP.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBMultiAuthorisation1   {
  @JsonProperty("Status")
  private OBExternalStatus2Code status = null;

  @JsonProperty("NumberRequired")
  private Integer numberRequired = null;

  @JsonProperty("NumberReceived")
  private Integer numberReceived = null;

  @JsonProperty("LastUpdateDateTime")
  private DateTime lastUpdateDateTime = null;

  @JsonProperty("ExpirationDateTime")
  private DateTime expirationDateTime = null;

  public OBMultiAuthorisation1 status(OBExternalStatus2Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalStatus2Code getStatus() {
    return status;
  }

  public void setStatus(OBExternalStatus2Code status) {
    this.status = status;
  }

  public OBMultiAuthorisation1 numberRequired(Integer numberRequired) {
    this.numberRequired = numberRequired;
    return this;
  }

  /**
   * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
   * @return numberRequired
  **/
  @ApiModelProperty(value = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")


  public Integer getNumberRequired() {
    return numberRequired;
  }

  public void setNumberRequired(Integer numberRequired) {
    this.numberRequired = numberRequired;
  }

  public OBMultiAuthorisation1 numberReceived(Integer numberReceived) {
    this.numberReceived = numberReceived;
    return this;
  }

  /**
   * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
   * @return numberReceived
  **/
  @ApiModelProperty(value = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")


  public Integer getNumberReceived() {
    return numberReceived;
  }

  public void setNumberReceived(Integer numberReceived) {
    this.numberReceived = numberReceived;
  }

  public OBMultiAuthorisation1 lastUpdateDateTime(DateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
    return this;
  }

  /**
   * Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastUpdateDateTime
  **/
  @ApiModelProperty(value = "Last date and time at the authorisation flow was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getLastUpdateDateTime() {
    return lastUpdateDateTime;
  }

  public void setLastUpdateDateTime(DateTime lastUpdateDateTime) {
    this.lastUpdateDateTime = lastUpdateDateTime;
  }

  public OBMultiAuthorisation1 expirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(DateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMultiAuthorisation1 obMultiAuthorisation1 = (OBMultiAuthorisation1) o;
    return Objects.equals(this.status, obMultiAuthorisation1.status) &&
        Objects.equals(this.numberRequired, obMultiAuthorisation1.numberRequired) &&
        Objects.equals(this.numberReceived, obMultiAuthorisation1.numberReceived) &&
        Objects.equals(this.lastUpdateDateTime, obMultiAuthorisation1.lastUpdateDateTime) &&
        Objects.equals(this.expirationDateTime, obMultiAuthorisation1.expirationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, numberRequired, numberReceived, lastUpdateDateTime, expirationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMultiAuthorisation1 {\n");

    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
    sb.append("    numberReceived: ").append(toIndentedString(numberReceived)).append("\n");
    sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

