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

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadBeneficiary5Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadBeneficiary5Data {
  @JsonProperty("Beneficiary")
  @Valid
  private List<OBBeneficiary5> beneficiary = null;

  public OBReadBeneficiary5Data beneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<OBBeneficiary5>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   *
   * @return beneficiary
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<OBBeneficiary5> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary5Data {\n");

    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

