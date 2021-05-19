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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Postal address of a party.
 */
@ApiModel(description = "Postal address of a party.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBParty2Address {
  @JsonProperty("AddressType")
  private OBAddressTypeCode addressType;

  @JsonProperty("AddressLine")
  @Valid
  private List<String> addressLine = null;

  @JsonProperty("StreetName")
  private String streetName;

  @JsonProperty("BuildingNumber")
  private String buildingNumber;

  @JsonProperty("PostCode")
  private String postCode;

  @JsonProperty("TownName")
  private String townName;

  @JsonProperty("CountrySubDivision")
  private String countrySubDivision;

  @JsonProperty("Country")
  private String country;

  public OBParty2Address addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   *
   * @return addressType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBParty2Address addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBParty2Address addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<String>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   *
   * @return addressLine
   */
  @ApiModelProperty(value = "")
  @Size(min = 0, max = 5)
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  public OBParty2Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   *
   * @return streetName
   */
  @ApiModelProperty(value = "Name of a street or thoroughfare.")
  @Size(min = 1, max = 70)
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBParty2Address buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   *
   * @return buildingNumber
   */
  @ApiModelProperty(value = "Number that identifies the position of a building on a street.")
  @Size(min = 1, max = 16)
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBParty2Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   *
   * @return postCode
   */
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.")
  @Size(min = 1, max = 16)
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBParty2Address townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   *
   * @return townName
   */
  @ApiModelProperty(value = "Name of a built-up area, with defined boundaries, and a local government.")
  @Size(min = 1, max = 35)
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBParty2Address countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country eg, state, region, county.
   *
   * @return countrySubDivision
   */
  @ApiModelProperty(value = "Identifies a subdivision of a country eg, state, region, county.")
  @Size(min = 1, max = 35)
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBParty2Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   *
   * @return country
   */
  @ApiModelProperty(required = true, value = "Nation with its own government, occupying a particular territory.")
  @NotNull
  @Pattern(regexp = "^[A-Z]{2,2}$")
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
    OBParty2Address obParty2Address = (OBParty2Address) o;
    return Objects.equals(this.addressType, obParty2Address.addressType) &&
            Objects.equals(this.addressLine, obParty2Address.addressLine) &&
            Objects.equals(this.streetName, obParty2Address.streetName) &&
            Objects.equals(this.buildingNumber, obParty2Address.buildingNumber) &&
            Objects.equals(this.postCode, obParty2Address.postCode) &&
            Objects.equals(this.townName, obParty2Address.townName) &&
            Objects.equals(this.countrySubDivision, obParty2Address.countrySubDivision) &&
            Objects.equals(this.country, obParty2Address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2Address {\n");

    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
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

