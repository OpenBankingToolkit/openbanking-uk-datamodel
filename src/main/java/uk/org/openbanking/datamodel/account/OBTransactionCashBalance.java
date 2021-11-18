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
import java.util.Objects;

/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 */
@ApiModel(description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBTransactionCashBalance {
    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode2 creditDebitIndicator;

    @JsonProperty("Type")
    private OBBalanceType1Code type;

    @JsonProperty("Amount")
    private OBTransactionCashBalanceAmount amount;

    public OBTransactionCashBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBCreditDebitCode2 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransactionCashBalance type(OBBalanceType1Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBBalanceType1Code getType() {
        return type;
    }

    public void setType(OBBalanceType1Code type) {
        this.type = type;
    }

    public OBTransactionCashBalance amount(OBTransactionCashBalanceAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBTransactionCashBalanceAmount getAmount() {
        return amount;
    }

    public void setAmount(OBTransactionCashBalanceAmount amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransactionCashBalance obTransactionCashBalance = (OBTransactionCashBalance) o;
        return Objects.equals(this.creditDebitIndicator, obTransactionCashBalance.creditDebitIndicator) &&
                Objects.equals(this.type, obTransactionCashBalance.type) &&
                Objects.equals(this.amount, obTransactionCashBalance.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditDebitIndicator, type, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransactionCashBalance {\n");

        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

