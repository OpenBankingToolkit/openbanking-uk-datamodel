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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadStandingOrder2Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBReadStandingOrder2Data   {
  @JsonProperty("StandingOrder")
  @Valid
  private List<OBStandingOrder2> standingOrder = null;

  public OBReadStandingOrder2Data standingOrder(List<OBStandingOrder2> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder2Data addStandingOrderItem(OBStandingOrder2 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<OBStandingOrder2>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Account to or from which a cash entry is made.
   * @return standingOrder
  **/
  @ApiModelProperty(value = "Account to or from which a cash entry is made.")

  @Valid

  public List<OBStandingOrder2> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder2> standingOrder) {
    this.standingOrder = standingOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder2Data obReadStandingOrder2Data = (OBReadStandingOrder2Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder2Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder2Data {\n");

    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

