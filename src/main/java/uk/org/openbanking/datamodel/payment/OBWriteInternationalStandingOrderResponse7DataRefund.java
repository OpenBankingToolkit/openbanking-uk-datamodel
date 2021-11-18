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
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternationalStandingOrderResponse7DataRefund
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-20T10:23:11.959Z")
public class OBWriteInternationalStandingOrderResponse7DataRefund   {
  @JsonProperty("Creditor")
  private OBWriteInternationalStandingOrderResponse7DataRefundCreditor creditor = null;

  @JsonProperty("Agent")
  private OBWriteInternationalResponse5DataRefundAgent agent = null;

  @JsonProperty("Account")
  private OBWriteDomesticResponse5DataRefundAccount account = null;

  public OBWriteInternationalStandingOrderResponse7DataRefund creditor(OBWriteInternationalStandingOrderResponse7DataRefundCreditor creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
  **/
  @ApiModelProperty(value = "")
  @Valid
  public OBWriteInternationalStandingOrderResponse7DataRefundCreditor getCreditor() {
    return creditor;
  }

  public void setCreditor(OBWriteInternationalStandingOrderResponse7DataRefundCreditor creditor) {
    this.creditor = creditor;
  }

  public OBWriteInternationalStandingOrderResponse7DataRefund agent(OBWriteInternationalResponse5DataRefundAgent agent) {
    this.agent = agent;
    return this;
  }

  /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  @Valid
  public OBWriteInternationalResponse5DataRefundAgent getAgent() {
    return agent;
  }

  public void setAgent(OBWriteInternationalResponse5DataRefundAgent agent) {
    this.agent = agent;
  }

  public OBWriteInternationalStandingOrderResponse7DataRefund account(OBWriteDomesticResponse5DataRefundAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBWriteDomesticResponse5DataRefundAccount getAccount() {
    return account;
  }

  public void setAccount(OBWriteDomesticResponse5DataRefundAccount account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalStandingOrderResponse7DataRefund obWriteInternationalStandingOrderResponse7DataRefund = (OBWriteInternationalStandingOrderResponse7DataRefund) o;
    return Objects.equals(this.creditor, obWriteInternationalStandingOrderResponse7DataRefund.creditor) &&
        Objects.equals(this.agent, obWriteInternationalStandingOrderResponse7DataRefund.agent) &&
        Objects.equals(this.account, obWriteInternationalStandingOrderResponse7DataRefund.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditor, agent, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrderResponse7DataRefund {\n");
    
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

