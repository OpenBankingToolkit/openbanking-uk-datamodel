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
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBBeneficiary2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBBeneficiary2 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("BeneficiaryId")
    private String beneficiaryId = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification3 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount3 creditorAccount = null;

    public OBBeneficiary2 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     * @return accountId
     **/
    @ApiModelProperty(value = "")


    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBBeneficiary2 beneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
     * @return beneficiaryId
     **/
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")

    @Size(min = 1, max = 40)
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public OBBeneficiary2 reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     * @return reference
     **/
    @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

    @Size(min = 1, max = 35)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBBeneficiary2 creditorAgent(OBBranchAndFinancialInstitutionIdentification3 creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     * @return creditorAgent
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBBranchAndFinancialInstitutionIdentification3 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification3 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBBeneficiary2 creditorAccount(OBCashAccount3 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     * @return creditorAccount
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccount3 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount3 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBeneficiary2 obBeneficiary2 = (OBBeneficiary2) o;
        return Objects.equals(this.accountId, obBeneficiary2.accountId) &&
                Objects.equals(this.beneficiaryId, obBeneficiary2.beneficiaryId) &&
                Objects.equals(this.reference, obBeneficiary2.reference) &&
                Objects.equals(this.creditorAgent, obBeneficiary2.creditorAgent) &&
                Objects.equals(this.creditorAccount, obBeneficiary2.creditorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, beneficiaryId, reference, creditorAgent, creditorAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBeneficiary2 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

