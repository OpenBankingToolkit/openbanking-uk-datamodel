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
import java.util.Objects;

/**
 * Account
 */
@ApiModel(description = "Account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class OBAccount1 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("Currency")
    private String currency = null;

    @JsonProperty("Nickname")
    private String nickname = null;

    @JsonProperty("Account")
    private OBCashAccount1 account = null;

    @JsonProperty("Servicer")
    private OBBranchAndFinancialInstitutionIdentification2 servicer = null;

    public OBAccount1 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     * @return accountId
     **/
    @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @NotNull

    @Size(min = 1, max = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBAccount1 currency(String currency) {
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

    public OBAccount1 nickname(String nickname) {
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

    public OBAccount1 account(OBCashAccount1 account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     * @return account
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccount1 getAccount() {
        return account;
    }

    public void setAccount(OBCashAccount1 account) {
        this.account = account;
    }

    public OBAccount1 servicer(OBBranchAndFinancialInstitutionIdentification2 servicer) {
        this.servicer = servicer;
        return this;
    }

    /**
     * Get servicer
     * @return servicer
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBBranchAndFinancialInstitutionIdentification2 getServicer() {
        return servicer;
    }

    public void setServicer(OBBranchAndFinancialInstitutionIdentification2 servicer) {
        this.servicer = servicer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBAccount1 account = (OBAccount1) o;
        return Objects.equals(this.accountId, account.accountId) &&
                Objects.equals(this.currency, account.currency) &&
                Objects.equals(this.nickname, account.nickname) &&
                Objects.equals(this.account, account.account) &&
                Objects.equals(this.servicer, account.servicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, currency, nickname, account, servicer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

