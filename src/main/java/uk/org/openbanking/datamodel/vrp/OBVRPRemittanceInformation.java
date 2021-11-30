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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts&#39; receivable system.
 */
@ApiModel(description = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-30T12:56:02.347748Z[Europe/London]")
public class OBVRPRemittanceInformation   {
  @JsonProperty("Unstructured")
  private String unstructured;

  @JsonProperty("Reference")
  private String reference;

  public OBVRPRemittanceInformation unstructured(String unstructured) {
    this.unstructured = unstructured;
    return this;
  }

  /**
   * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
   * @return unstructured
  */
  @ApiModelProperty(value = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.")

@Size(min=1,max=140) 
  public String getUnstructured() {
    return unstructured;
  }

  public void setUnstructured(String unstructured) {
    this.unstructured = unstructured;
  }

  public OBVRPRemittanceInformation reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. The PISP must populate this with the same value as specified in the `Data.Initiation.RemittanceInformation.Reference` of the consent.
   * @return reference
  */
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. The PISP must populate this with the same value as specified in the `Data.Initiation.RemittanceInformation.Reference` of the consent.")

@Size(min=1,max=35) 
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBVRPRemittanceInformation obVRPRemittanceInformation = (OBVRPRemittanceInformation) o;
    return Objects.equals(this.unstructured, obVRPRemittanceInformation.unstructured) &&
        Objects.equals(this.reference, obVRPRemittanceInformation.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unstructured, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBVRPRemittanceInformation {\n");
    
    sb.append("    unstructured: ").append(toIndentedString(unstructured)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

