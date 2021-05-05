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
import uk.org.openbanking.datamodel.payment.OBActiveOrHistoricCurrencyAndAmount;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Amount of money to be transferred between the debtor and creditor, before deduction of charges, expressed in the currency of the debtor&#39;s account, and to be transferred into a different currency.  Usage : Currency of the amount is expressed in the currency of the debtor&#39;s account, but the amount to be transferred is in another currency. The debtor agent will convert the amount and currency to the to be transferred amount and currency, eg, &#39;pay equivalent of 100000 EUR in JPY&#39;(and account is in EUR).
 */
@ApiModel(description = "Amount of money to be transferred between the debtor and creditor, before deduction of charges, expressed in the currency of the debtor's account, and to be transferred into a different currency.  Usage : Currency of the amount is expressed in the currency of the debtor's account, but the amount to be transferred is in another currency. The debtor agent will convert the amount and currency to the to be transferred amount and currency, eg, 'pay equivalent of 100000 EUR in JPY'(and account is in EUR).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBEquivalentAmount {
    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount amount = null;

    @JsonProperty("CurrencyOfTransfer")
    private String currencyOfTransfer = null;

    public OBEquivalentAmount amount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount amount) {
        this.amount = amount;
    }

    public OBEquivalentAmount currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
     * @return currencyOfTransfer
     **/
    @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    @NotNull

    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEquivalentAmount obTransaction2EquivalentAmount = (OBEquivalentAmount) o;
        return Objects.equals(this.amount, obTransaction2EquivalentAmount.amount) &&
                Objects.equals(this.currencyOfTransfer, obTransaction2EquivalentAmount.currencyOfTransfer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyOfTransfer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEquivalentAmount {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
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

