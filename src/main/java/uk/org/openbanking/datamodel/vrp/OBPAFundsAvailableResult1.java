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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Availaility result, clearly indicating the availability of funds given the Amount in the request.
 */
@ApiModel(description = "Availaility result, clearly indicating the availability of funds given the Amount in the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-21T09:44:44.818881+01:00[Europe/London]")

public class OBPAFundsAvailableResult1 {
  @JsonProperty("FundsAvailableDateTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private DateTime fundsAvailableDateTime;

  @JsonProperty("FundsAvailable")
  private OBFundsAvailableEnum fundsAvailable;

  public OBPAFundsAvailableResult1 fundsAvailableDateTime(DateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
    return this;
  }

  /**
   * Date and time at which the funds availability check was generated.
   *
   * @return fundsAvailableDateTime
   */
  @ApiModelProperty(required = true, value = "Date and time at which the funds availability check was generated.")
  @NotNull

  @Valid

  public DateTime getFundsAvailableDateTime() {
    return fundsAvailableDateTime;
  }

  public void setFundsAvailableDateTime(DateTime fundsAvailableDateTime) {
    this.fundsAvailableDateTime = fundsAvailableDateTime;
  }

  public OBPAFundsAvailableResult1 fundsAvailable(OBFundsAvailableEnum fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
    return this;
  }

  /**
   * Availaility result, clearly indicating the availability of funds given the Amount in the request.
   *
   * @return fundsAvailable
   */
  @ApiModelProperty(required = true, value = "Availaility result, clearly indicating the availability of funds given the Amount in the request.")
  @NotNull


  public OBFundsAvailableEnum getFundsAvailable() {
    return fundsAvailable;
  }

  public void setFundsAvailable(OBFundsAvailableEnum fundsAvailable) {
    this.fundsAvailable = fundsAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPAFundsAvailableResult1 obPAFundsAvailableResult1 = (OBPAFundsAvailableResult1) o;
    return Objects.equals(this.fundsAvailableDateTime, obPAFundsAvailableResult1.fundsAvailableDateTime) &&
            Objects.equals(this.fundsAvailable, obPAFundsAvailableResult1.fundsAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableDateTime, fundsAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPAFundsAvailableResult1 {\n");

    sb.append("    fundsAvailableDateTime: ").append(toIndentedString(fundsAvailableDateTime)).append("\n");
    sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
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

