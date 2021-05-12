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
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 */
@ApiModel(description = "Supporting Data provided by TPP, when requesting SCA Exemption.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-10T14:02:35.556Z")


public class OBSCASupportData1   {
  /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
   */
  public enum AppliedAuthenticationApproachEnum {
    CA("CA"),
    
    SCA("SCA");

    private String value;

    AppliedAuthenticationApproachEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AppliedAuthenticationApproachEnum fromValue(String text) {
      for (AppliedAuthenticationApproachEnum b : AppliedAuthenticationApproachEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("AppliedAuthenticationApproach")
  private AppliedAuthenticationApproachEnum appliedAuthenticationApproach = null;

  @JsonProperty("ReferencePaymentOrderId")
  private String referencePaymentOrderId = null;

  /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
   */
  public enum RequestedSCAExemptionTypeEnum {
    BILLPAYMENT("BillPayment"),
    
    CONTACTLESSTRAVEL("ContactlessTravel"),
    
    ECOMMERCEGOODS("EcommerceGoods"),
    
    ECOMMERCESERVICES("EcommerceServices"),
    
    KIOSK("Kiosk"),
    
    PARKING("Parking"),
    
    PARTYTOPARTY("PartyToParty");

    private String value;

    RequestedSCAExemptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequestedSCAExemptionTypeEnum fromValue(String text) {
      for (RequestedSCAExemptionTypeEnum b : RequestedSCAExemptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("RequestedSCAExemptionType")
  private RequestedSCAExemptionTypeEnum requestedSCAExemptionType = null;

  public OBSCASupportData1 appliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    return this;
  }

  /**
   * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
   * @return appliedAuthenticationApproach
  **/
  @ApiModelProperty(value = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP")
  public AppliedAuthenticationApproachEnum getAppliedAuthenticationApproach() {
    return appliedAuthenticationApproach;
  }

  public void setAppliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
    this.appliedAuthenticationApproach = appliedAuthenticationApproach;
  }

  public OBSCASupportData1 referencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
    return this;
  }

  /**
   * If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId  
   * @return referencePaymentOrderId
  **/
  @ApiModelProperty(value = "If the payment is recurring, then this field is populated with the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence. The value here refers to the payment id e.g. DomesticPaymentId  ")

@Size(min=1,max=40) 
  public String getReferencePaymentOrderId() {
    return referencePaymentOrderId;
  }

  public void setReferencePaymentOrderId(String referencePaymentOrderId) {
    this.referencePaymentOrderId = referencePaymentOrderId;
  }

  public OBSCASupportData1 requestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
    return this;
  }

  /**
   * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
   * @return requestedSCAExemptionType
  **/
  @ApiModelProperty(value = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation")


  public RequestedSCAExemptionTypeEnum getRequestedSCAExemptionType() {
    return requestedSCAExemptionType;
  }

  public void setRequestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
    this.requestedSCAExemptionType = requestedSCAExemptionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBSCASupportData1 obSCASupportData1 = (OBSCASupportData1) o;
    return Objects.equals(this.appliedAuthenticationApproach, obSCASupportData1.appliedAuthenticationApproach) &&
        Objects.equals(this.referencePaymentOrderId, obSCASupportData1.referencePaymentOrderId) &&
        Objects.equals(this.requestedSCAExemptionType, obSCASupportData1.requestedSCAExemptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedAuthenticationApproach, referencePaymentOrderId, requestedSCAExemptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBSCASupportData1 {\n");
    
    sb.append("    appliedAuthenticationApproach: ").append(toIndentedString(appliedAuthenticationApproach)).append("\n");
    sb.append("    referencePaymentOrderId: ").append(toIndentedString(referencePaymentOrderId)).append("\n");
    sb.append("    requestedSCAExemptionType: ").append(toIndentedString(requestedSCAExemptionType)).append("\n");
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

