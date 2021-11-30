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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBDomesticVRPRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-30T12:56:02.347748Z[Europe/London]")
public class OBDomesticVRPRequestData   {
  @JsonProperty("ConsentId")
  private String consentId;

  @JsonProperty("PSUAuthenticationMethod")
  private String psUAuthenticationMethod;

  @JsonProperty("Initiation")
  private OBDomesticVRPInitiation initiation;

  @JsonProperty("Instruction")
  private OBDomesticVRPInstruction instruction;

  public OBDomesticVRPRequestData consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Identifier for the Domestic VRP Consent that this payment is made under.
   * @return consentId
  */
  @ApiModelProperty(required = true, value = "Identifier for the Domestic VRP Consent that this payment is made under.")
  @NotNull

@Size(min=1,max=128) 
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBDomesticVRPRequestData psUAuthenticationMethod(String psUAuthenticationMethod) {
    this.psUAuthenticationMethod = psUAuthenticationMethod;
    return this;
  }

  /**
   * Get psUAuthenticationMethod
   * @return psUAuthenticationMethod
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPsUAuthenticationMethod() {
    return psUAuthenticationMethod;
  }

  public void setPsUAuthenticationMethod(String psUAuthenticationMethod) {
    this.psUAuthenticationMethod = psUAuthenticationMethod;
  }

  public OBDomesticVRPRequestData initiation(OBDomesticVRPInitiation initiation) {
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

  public OBDomesticVRPRequestData instruction(OBDomesticVRPInstruction instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBDomesticVRPInstruction getInstruction() {
    return instruction;
  }

  public void setInstruction(OBDomesticVRPInstruction instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBDomesticVRPRequestData obDomesticVRPRequestData = (OBDomesticVRPRequestData) o;
    return Objects.equals(this.consentId, obDomesticVRPRequestData.consentId) &&
        Objects.equals(this.psUAuthenticationMethod, obDomesticVRPRequestData.psUAuthenticationMethod) &&
        Objects.equals(this.initiation, obDomesticVRPRequestData.initiation) &&
        Objects.equals(this.instruction, obDomesticVRPRequestData.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, psUAuthenticationMethod, initiation, instruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBDomesticVRPRequestData {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    psUAuthenticationMethod: ").append(toIndentedString(psUAuthenticationMethod)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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

