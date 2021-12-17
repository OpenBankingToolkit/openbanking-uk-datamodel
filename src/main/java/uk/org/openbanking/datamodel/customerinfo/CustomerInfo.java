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
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * CustomerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-15T15:44:09.337510Z[Europe/London]")
public class CustomerInfo   {
  @JsonProperty("party_id")
  private String partyId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("initials")
  private String initials;

  @JsonProperty("family_name")
  private String familyName;

  @JsonProperty("given_name")
  private String givenName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone_number")
  private String phoneNumber;

  @JsonProperty("birthdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate birthdate;

  @JsonProperty("address")
  private CustomerInfoAddress address;

  public CustomerInfo partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
   * @return partyId
  */
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")
  @NotNull

@Size(min=1,max=40) 
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public CustomerInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the party. The title of a person. e.g. Mr, Mrs, Reverend, Lieutenant Colonel.
   * @return title
  */
  @ApiModelProperty(value = "Title of the party. The title of a person. e.g. Mr, Mrs, Reverend, Lieutenant Colonel.")

@Size(min=1,max=70) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CustomerInfo initials(String initials) {
    this.initials = initials;
    return this;
  }

  /**
   * The initials of an Individual. eg. M.K.
   * @return initials
  */
  @ApiModelProperty(value = "The initials of an Individual. eg. M.K.")

@Size(min=1,max=70) 
  public String getInitials() {
    return initials;
  }

  public void setInitials(String initials) {
    this.initials = initials;
  }

  public CustomerInfo familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return familyName
  */
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")

@Size(min=1,max=70) 
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public CustomerInfo givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return givenName
  */
  @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")

@Size(min=1,max=70) 
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public CustomerInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Address for electronic mail (e-mail).
   * @return email
  */
  @ApiModelProperty(value = "Address for electronic mail (e-mail).")

@Size(min=1,max=256) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Collection of information that identifies a phone number, as defined by telecom services.
   * @return phoneNumber
  */
  @ApiModelProperty(value = "Collection of information that identifies a phone number, as defined by telecom services.")

@Pattern(regexp="\\+[0-9]{1,3}-[0-9()+\\-]{1,30}") 
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CustomerInfo birthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Get birthdate
   * @return birthdate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public CustomerInfo address(CustomerInfoAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(value = "")

  @Valid

  public CustomerInfoAddress getAddress() {
    return address;
  }

  public void setAddress(CustomerInfoAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfo customerInfo = (CustomerInfo) o;
    return Objects.equals(this.partyId, customerInfo.partyId) &&
        Objects.equals(this.title, customerInfo.title) &&
        Objects.equals(this.initials, customerInfo.initials) &&
        Objects.equals(this.familyName, customerInfo.familyName) &&
        Objects.equals(this.givenName, customerInfo.givenName) &&
        Objects.equals(this.email, customerInfo.email) &&
        Objects.equals(this.phoneNumber, customerInfo.phoneNumber) &&
        Objects.equals(this.birthdate, customerInfo.birthdate) &&
        Objects.equals(this.address, customerInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, title, initials, familyName, givenName, email, phoneNumber, birthdate, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInfo {\n");
    
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

