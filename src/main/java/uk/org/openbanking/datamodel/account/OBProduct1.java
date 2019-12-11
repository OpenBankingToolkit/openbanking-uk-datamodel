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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Product
 */
@ApiModel(description = "Product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBProduct1 {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("ProductIdentifier")
  private String productIdentifier = null;

  @JsonProperty("ProductType")
  private OBExternalProductType1Code productType = null;

  @JsonProperty("ProductName")
  private String productName = null;

  @JsonProperty("SecondaryProductIdentifier")
  private String secondaryProductIdentifier = null;

  public OBProduct1 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull

 @Size(min=1,max=40)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBProduct1 productIdentifier(String productIdentifier) {
    this.productIdentifier = productIdentifier;
    return this;
  }

   /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return productIdentifier
  **/
  @ApiModelProperty(required = true, value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")
  @NotNull


  public String getProductIdentifier() {
    return productIdentifier;
  }

  public void setProductIdentifier(String productIdentifier) {
    this.productIdentifier = productIdentifier;
  }

  public OBProduct1 productType(OBExternalProductType1Code productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Descriptive code for the product category.
   * @return productType
  **/
  @ApiModelProperty(required = true, value = "Descriptive code for the product category.")
  @NotNull


  public OBExternalProductType1Code getProductType() {
    return productType;
  }

  public void setProductType(OBExternalProductType1Code productType) {
    this.productType = productType;
  }

  public OBProduct1 productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  **/
  @ApiModelProperty(value = "The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBProduct1 secondaryProductIdentifier(String secondaryProductIdentifier) {
    this.secondaryProductIdentifier = secondaryProductIdentifier;
    return this;
  }

   /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return secondaryProductIdentifier
  **/
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")


  public String getSecondaryProductIdentifier() {
    return secondaryProductIdentifier;
  }

  public void setSecondaryProductIdentifier(String secondaryProductIdentifier) {
    this.secondaryProductIdentifier = secondaryProductIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBProduct1 product = (OBProduct1) o;
    return Objects.equals(this.accountId, product.accountId) &&
        Objects.equals(this.productIdentifier, product.productIdentifier) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.secondaryProductIdentifier, product.secondaryProductIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, productIdentifier, productType, productName, secondaryProductIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    secondaryProductIdentifier: ").append(toIndentedString(secondaryProductIdentifier)).append("\n");
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

