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

import java.util.Objects;

/**
 * ^ Only incuded in the response if &#x60;Data. ReadRefundAccount&#x60; is set to &#x60;Yes&#x60; in the consent.
 */
@ApiModel(description = "^ Only incuded in the response if `Data. ReadRefundAccount` is set to `Yes` in the consent.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBCashAccountDebtor4 {
  @JsonProperty("SchemeName")
  private String schemeName;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification;

  public OBCashAccountDebtor4 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * ^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBExternalAccountIdentification4Code
   *
   * @return schemeName
   */
  @ApiModelProperty(value = "^ Name of the identification scheme, in a coded form as published in an external list. | Namespaced Enumeration OBExternalAccountIdentification4Code")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccountDebtor4 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * ^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text
   *
   * @return identification
   */
  @ApiModelProperty(value = "^ Identification assigned by an institution to identify an account. This identification is known by the account owner. | Max256Text")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccountDebtor4 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * ^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.
   *
   * @return name
   */
  @ApiModelProperty(value = "^ Name of the account, as assigned by the account servicing institution.  Usage The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccountDebtor4 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * ^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text
   *
   * @return secondaryIdentification
   */
  @ApiModelProperty(value = "^ This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination) | Max34Text")
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccountDebtor4 obCashAccountDebtor4 = (OBCashAccountDebtor4) o;
    return Objects.equals(this.schemeName, obCashAccountDebtor4.schemeName) &&
            Objects.equals(this.identification, obCashAccountDebtor4.identification) &&
            Objects.equals(this.name, obCashAccountDebtor4.name) &&
            Objects.equals(this.secondaryIdentification, obCashAccountDebtor4.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccountDebtor4 {\n");

    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

