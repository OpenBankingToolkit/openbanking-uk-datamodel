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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBParty2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBParty2 {
    @JsonProperty("PartyId")
    private String partyId;

    @JsonProperty("PartyNumber")
    private String partyNumber;

    @JsonProperty("PartyType")
    private OBExternalPartyType1Code partyType;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("FullLegalName")
    private String fullLegalName;

    @JsonProperty("LegalStructure")
    private String legalStructure;

    @JsonProperty("BeneficialOwnership")
    private Boolean beneficialOwnership;

    @JsonProperty("AccountRole")
    private String accountRole;

    @JsonProperty("EmailAddress")
    private String emailAddress;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Mobile")
    private String mobile;

    @JsonProperty("Relationships")
    private OBPartyRelationships1 relationships;

    @JsonProperty("Address")
    @Valid
    private List<OBParty2Address> address = null;

    public OBParty2 partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
     *
     * @return partyId
     */
    @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.")
    @NotNull
    @Size(min = 1, max = 40)
    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public OBParty2 partyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
        return this;
    }

    /**
     * Number assigned by an agent to identify its customer.
     *
     * @return partyNumber
     */
    @ApiModelProperty(value = "Number assigned by an agent to identify its customer.")
    @Size(min = 1, max = 35)
    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public OBParty2 partyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
        return this;
    }

    /**
     * Get partyType
     *
     * @return partyType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBExternalPartyType1Code getPartyType() {
        return partyType;
    }

    public void setPartyType(OBExternalPartyType1Code partyType) {
        this.partyType = partyType;
    }

    public OBParty2 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which a party is known and which is usually used to identify that party.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")
    @Size(min = 1, max = 350)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBParty2 fullLegalName(String fullLegalName) {
        this.fullLegalName = fullLegalName;
        return this;
    }

    /**
     * Specifies a character string with a maximum length of 350 characters.
     *
     * @return fullLegalName
     */
    @ApiModelProperty(value = "Specifies a character string with a maximum length of 350 characters.")
    @Size(min = 1, max = 350)
    public String getFullLegalName() {
        return fullLegalName;
    }

    public void setFullLegalName(String fullLegalName) {
        this.fullLegalName = fullLegalName;
    }

    public OBParty2 legalStructure(String legalStructure) {
        this.legalStructure = legalStructure;
        return this;
    }

    /**
     * Legal standing of the party.
     *
     * @return legalStructure
     */
    @ApiModelProperty(value = "Legal standing of the party.")
    public String getLegalStructure() {
        return legalStructure;
    }

    public void setLegalStructure(String legalStructure) {
        this.legalStructure = legalStructure;
    }

    public OBParty2 beneficialOwnership(Boolean beneficialOwnership) {
        this.beneficialOwnership = beneficialOwnership;
        return this;
    }

    /**
     * Get beneficialOwnership
     *
     * @return beneficialOwnership
     */
    @ApiModelProperty(value = "")
    public Boolean getBeneficialOwnership() {
        return beneficialOwnership;
    }

    public void setBeneficialOwnership(Boolean beneficialOwnership) {
        this.beneficialOwnership = beneficialOwnership;
    }

    public OBParty2 accountRole(String accountRole) {
        this.accountRole = accountRole;
        return this;
    }

    /**
     * A party’s role with respect to the related account.
     *
     * @return accountRole
     */
    @ApiModelProperty(value = "A party’s role with respect to the related account.")
    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    public OBParty2 emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Address for electronic mail (e-mail).
     *
     * @return emailAddress
     */
    @ApiModelProperty(value = "Address for electronic mail (e-mail).")
    @Size(min = 1, max = 256)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public OBParty2 phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Collection of information that identifies a phone number, as defined by telecom services.
     *
     * @return phone
     */
    @ApiModelProperty(value = "Collection of information that identifies a phone number, as defined by telecom services.")
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OBParty2 mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Collection of information that identifies a mobile phone number, as defined by telecom services.
     *
     * @return mobile
     */
    @ApiModelProperty(value = "Collection of information that identifies a mobile phone number, as defined by telecom services.")
    @Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public OBParty2 relationships(OBPartyRelationships1 relationships) {
        this.relationships = relationships;
        return this;
    }

    /**
     * Get relationships
     *
     * @return relationships
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBPartyRelationships1 getRelationships() {
        return relationships;
    }

    public void setRelationships(OBPartyRelationships1 relationships) {
        this.relationships = relationships;
    }

    public OBParty2 address(List<OBParty2Address> address) {
        this.address = address;
        return this;
    }

    public OBParty2 addAddressItem(OBParty2Address addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<OBParty2Address>();
        }
        this.address.add(addressItem);
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBParty2Address> getAddress() {
        return address;
    }

    public void setAddress(List<OBParty2Address> address) {
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
        OBParty2 obParty2 = (OBParty2) o;
        return Objects.equals(this.partyId, obParty2.partyId) &&
                Objects.equals(this.partyNumber, obParty2.partyNumber) &&
                Objects.equals(this.partyType, obParty2.partyType) &&
                Objects.equals(this.name, obParty2.name) &&
                Objects.equals(this.fullLegalName, obParty2.fullLegalName) &&
                Objects.equals(this.legalStructure, obParty2.legalStructure) &&
                Objects.equals(this.beneficialOwnership, obParty2.beneficialOwnership) &&
                Objects.equals(this.accountRole, obParty2.accountRole) &&
                Objects.equals(this.emailAddress, obParty2.emailAddress) &&
                Objects.equals(this.phone, obParty2.phone) &&
                Objects.equals(this.mobile, obParty2.mobile) &&
                Objects.equals(this.relationships, obParty2.relationships) &&
                Objects.equals(this.address, obParty2.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyId, partyNumber, partyType, name, fullLegalName, legalStructure, beneficialOwnership, accountRole, emailAddress, phone, mobile, relationships, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBParty2 {\n");

        sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
        sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
        sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fullLegalName: ").append(toIndentedString(fullLegalName)).append("\n");
        sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
        sb.append("    beneficialOwnership: ").append(toIndentedString(beneficialOwnership)).append("\n");
        sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

