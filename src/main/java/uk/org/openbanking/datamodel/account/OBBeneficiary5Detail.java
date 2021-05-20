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
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OBBeneficiary5Detail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBBeneficiary5Detail {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("BeneficiaryId")
  private String beneficiaryId;

  @JsonProperty("BeneficiaryType")
  private OBBeneficiaryType1Code beneficiaryType;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("SupplementaryData")
  @Valid
  private Map<String, Object> supplementaryData = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification60 creditorAgent;

  @JsonProperty("CreditorAccount")
  private OBCashAccount50 creditorAccount;

  public OBBeneficiary5Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   *
   * @return accountId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @Size(min = 1, max = 40)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBBeneficiary5Detail beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
   *
   * @return beneficiaryId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")
  @Size(min = 1, max = 40)
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public OBBeneficiary5Detail beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * Get beneficiaryType
   *
   * @return beneficiaryType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBBeneficiaryType1Code getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }

  public OBBeneficiary5Detail reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   *
   * @return reference
   */
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  @Size(min = 1, max = 35)
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBBeneficiary5Detail supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBBeneficiary5Detail putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<String, Object>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   *
   * @return supplementaryData
   */
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")


  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBBeneficiary5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   *
   * @return creditorAgent
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBBeneficiary5Detail creditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   *
   * @return creditorAccount
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBCashAccount50 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBeneficiary5Detail obBeneficiary5Detail = (OBBeneficiary5Detail) o;
    return Objects.equals(this.accountId, obBeneficiary5Detail.accountId) &&
            Objects.equals(this.beneficiaryId, obBeneficiary5Detail.beneficiaryId) &&
            Objects.equals(this.beneficiaryType, obBeneficiary5Detail.beneficiaryType) &&
            Objects.equals(this.reference, obBeneficiary5Detail.reference) &&
            Objects.equals(this.supplementaryData, obBeneficiary5Detail.supplementaryData) &&
            Objects.equals(this.creditorAgent, obBeneficiary5Detail.creditorAgent) &&
            Objects.equals(this.creditorAccount, obBeneficiary5Detail.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary5Detail {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

