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
package uk.org.openbanking.datamodel.customerinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Postal address of a party.
 */
@ApiModel(description = "Postal address of a party.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-15T15:44:09.337510Z[Europe/London]")
public class CustomerInfoAddress   {
  @JsonProperty("address_type")
  private AddressTypeCode addressType;

  @JsonProperty("street_address")
  @Valid
  private List<String> streetAddress = null;

  @JsonProperty("postal_code")
  private String postalCode;

  @JsonProperty("country")
  private String country;

  public CustomerInfoAddress addressType(AddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public CustomerInfoAddress streetAddress(List<String> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public CustomerInfoAddress addStreetAddressItem(String streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<String>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
  */
  @ApiModelProperty(value = "")

@Size(min=0,max=5) 
  public List<String> getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(List<String> streetAddress) {
    this.streetAddress = streetAddress;
  }

  public CustomerInfoAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postalCode
  */
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")

@Size(min=1,max=16) 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public CustomerInfoAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   * @return country
  */
  @ApiModelProperty(value = "Nation with its own government, occupying a particular territory.")

@Pattern(regexp="^[A-Z]{2,2}$") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfoAddress customerInfoAddress = (CustomerInfoAddress) o;
    return Objects.equals(this.addressType, customerInfoAddress.addressType) &&
        Objects.equals(this.streetAddress, customerInfoAddress.streetAddress) &&
        Objects.equals(this.postalCode, customerInfoAddress.postalCode) &&
        Objects.equals(this.country, customerInfoAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, streetAddress, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInfoAddress {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

