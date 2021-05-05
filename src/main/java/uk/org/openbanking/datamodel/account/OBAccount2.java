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
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBAccount2 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("Currency")
    private String currency = null;

    @JsonProperty("AccountType")
    private OBExternalAccountType1Code accountType = null;

    @JsonProperty("AccountSubType")
    private OBExternalAccountSubType1Code accountSubType = null;

    @JsonProperty("Description")
    private String description = null;

    @JsonProperty("Nickname")
    private String nickname = null;

    @JsonProperty("Account")
    @Valid
    private List<OBCashAccount3> account = null;

    @JsonProperty("Servicer")
    private OBBranchAndFinancialInstitutionIdentification4 servicer = null;

    public OBAccount2 accountId(String accountId) {
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

    public OBAccount2 currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
     * @return currency
     **/
    @ApiModelProperty(required = true, value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")
    @NotNull

    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OBAccount2 accountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     * @return accountType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalAccountType1Code getAccountType() {
        return accountType;
    }

    public void setAccountType(OBExternalAccountType1Code accountType) {
        this.accountType = accountType;
    }

    public OBAccount2 accountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
        return this;
    }

    /**
     * Get accountSubType
     * @return accountSubType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalAccountSubType1Code getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
        this.accountSubType = accountSubType;
    }

    public OBAccount2 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Specifies the description of the account type.
     * @return description
     **/
    @ApiModelProperty(value = "Specifies the description of the account type.")

    @Size(min = 1, max = 35)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBAccount2 nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
     * @return nickname
     **/
    @ApiModelProperty(value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")

    @Size(min = 1, max = 70)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public OBAccount2 account(List<OBCashAccount3> account) {
        this.account = account;
        return this;
    }

    public OBAccount2 addAccountItem(OBCashAccount3 accountItem) {
        if (this.account == null) {
            this.account = new ArrayList<OBCashAccount3>();
        }
        this.account.add(accountItem);
        return this;
    }

    /**
     * Provides the details to identify an account.
     * @return account
     **/
    @ApiModelProperty(value = "Provides the details to identify an account.")

    @Valid

    public List<OBCashAccount3> getAccount() {
        return account;
    }

    public void setAccount(List<OBCashAccount3> account) {
        this.account = account;
    }

    public OBAccount2 servicer(OBBranchAndFinancialInstitutionIdentification4 servicer) {
        this.servicer = servicer;
        return this;
    }

    /**
     * Get servicer
     * @return servicer
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBBranchAndFinancialInstitutionIdentification4 getServicer() {
        return servicer;
    }

    public void setServicer(OBBranchAndFinancialInstitutionIdentification4 servicer) {
        this.servicer = servicer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBAccount2 obAccount2 = (OBAccount2) o;
        return Objects.equals(this.accountId, obAccount2.accountId) &&
                Objects.equals(this.currency, obAccount2.currency) &&
                Objects.equals(this.accountType, obAccount2.accountType) &&
                Objects.equals(this.accountSubType, obAccount2.accountSubType) &&
                Objects.equals(this.description, obAccount2.description) &&
                Objects.equals(this.nickname, obAccount2.nickname) &&
                Objects.equals(this.account, obAccount2.account) &&
                Objects.equals(this.servicer, obAccount2.servicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, currency, accountType, accountSubType, description, nickname, account, servicer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBAccount2 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

