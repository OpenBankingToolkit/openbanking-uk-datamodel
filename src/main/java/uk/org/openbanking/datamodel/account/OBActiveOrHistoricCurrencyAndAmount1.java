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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. Usage: This amount has to be transported unchanged through the transaction chain.
 */
@ApiModel(description = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. Usage: This amount has to be transported unchanged through the transaction chain.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBActiveOrHistoricCurrencyAndAmount1 {
    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Currency")
    private String currency;

    public OBActiveOrHistoricCurrencyAndAmount1 amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @NotNull
    @Pattern(regexp = "^\\d{1,13}$|^\\d{1,13}\\.\\d{1,5}$")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBActiveOrHistoricCurrencyAndAmount1 currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
     *
     * @return currency
     */
    @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBActiveOrHistoricCurrencyAndAmount1 obActiveOrHistoricCurrencyAndAmount1 = (OBActiveOrHistoricCurrencyAndAmount1) o;
        return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount1.amount) &&
                Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount1.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBActiveOrHistoricCurrencyAndAmount1 {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

