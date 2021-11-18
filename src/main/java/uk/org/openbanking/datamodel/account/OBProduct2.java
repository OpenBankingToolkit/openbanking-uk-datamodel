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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBProduct2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBProduct2   {
  @JsonProperty("ProductName")
  private String productName = null;

  @JsonProperty("ProductId")
  private String productId = null;

  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("SecondaryProductId")
  private String secondaryProductId = null;

  @JsonProperty("ProductType")
  private OBExternalProductType2Code productType = null;

  @JsonProperty("MarketingStateId")
  private String marketingStateId = null;

  @JsonProperty("OtherProductType")
  private OBOtherProductType1 otherProductType = null;

  @JsonProperty("BCA")
  private OBBCAData1 bca = null;

  @JsonProperty("PCA")
  private OBPCAData1 pca = null;

  public OBProduct2 productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  **/
  @ApiModelProperty(value = "The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")

@Size(min=1,max=350) 
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBProduct2 productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return productId
  **/
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")

@Size(min=1,max=40) 
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OBProduct2 accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBProduct2 secondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   * @return secondaryProductId
  **/
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")

@Size(min=1,max=70) 
  public String getSecondaryProductId() {
    return secondaryProductId;
  }

  public void setSecondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBProduct2 productType(OBExternalProductType2Code productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")
  @NotNull
  @Valid

  public OBExternalProductType2Code getProductType() {
    return productType;
  }

  public void setProductType(OBExternalProductType2Code productType) {
    this.productType = productType;
  }

  public OBProduct2 marketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

  /**
   * Unique and unambiguous identification of a Product Marketing State.
   * @return marketingStateId
  **/
  @ApiModelProperty(value = "Unique and unambiguous identification of a Product Marketing State.")

@Size(min=1,max=35) 
  public String getMarketingStateId() {
    return marketingStateId;
  }

  public void setMarketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBProduct2 otherProductType(OBOtherProductType1 otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

  /**
   * Get otherProductType
   * @return otherProductType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherProductType1 getOtherProductType() {
    return otherProductType;
  }

  public void setOtherProductType(OBOtherProductType1 otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBProduct2 bca(OBBCAData1 bca) {
    this.bca = bca;
    return this;
  }

  /**
   * Get BCA
   * @return BCA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBBCAData1 getBca() {
    return bca;
  }

  public void setBca(OBBCAData1 bca) {
    this.bca = bca;
  }

  public OBProduct2 pca(OBPCAData1 pca) {
    this.pca = pca;
    return this;
  }

  /**
   * Get PCA
   * @return PCA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBPCAData1 getPca() {
    return pca;
  }

  public void setPca(OBPCAData1 pca) {
    this.pca = pca;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBProduct2 obProduct2 = (OBProduct2) o;
    return Objects.equals(this.productName, obProduct2.productName) &&
        Objects.equals(this.productId, obProduct2.productId) &&
        Objects.equals(this.accountId, obProduct2.accountId) &&
        Objects.equals(this.secondaryProductId, obProduct2.secondaryProductId) &&
        Objects.equals(this.productType, obProduct2.productType) &&
        Objects.equals(this.marketingStateId, obProduct2.marketingStateId) &&
        Objects.equals(this.otherProductType, obProduct2.otherProductType) &&
        Objects.equals(this.bca, obProduct2.bca) &&
        Objects.equals(this.pca, obProduct2.pca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, bca, pca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBProduct2 {\n");
    
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(bca)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(pca)).append("\n");
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

