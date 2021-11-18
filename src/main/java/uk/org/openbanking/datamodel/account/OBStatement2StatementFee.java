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
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Set of elements used to provide details of a fee for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a fee for the statement resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBStatement2StatementFee {
    @JsonProperty("Description")
    private String description;

    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode0 creditDebitIndicator;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Rate")
    private BigDecimal rate;

    @JsonProperty("RateType")
    private String rateType;

    @JsonProperty("Frequency")
    private String frequency;

    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount6 amount;

    public OBStatement2StatementFee description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description that may be available for the statement fee.
     *
     * @return description
     */
    @ApiModelProperty(value = "Description that may be available for the statement fee.")
    @Size(min = 1, max = 128)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBStatement2StatementFee creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
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
    public OBCreditDebitCode0 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBStatement2StatementFee type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Fee type, in a coded form.
     *
     * @return type
     */
    @ApiModelProperty(required = true, value = "Fee type, in a coded form.")
    @NotNull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementFee rate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)
     *
     * @return rate
     */
    @ApiModelProperty(value = "Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount)")
    @Valid
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public OBStatement2StatementFee rateType(String rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Description that may be available for the statement fee rate type.
     *
     * @return rateType
     */
    @ApiModelProperty(value = "Description that may be available for the statement fee rate type.")
    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public OBStatement2StatementFee frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * How frequently the fee is applied to the Account.
     *
     * @return frequency
     */
    @ApiModelProperty(value = "How frequently the fee is applied to the Account.")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStatement2StatementFee amount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
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
    public OBActiveOrHistoricCurrencyAndAmount6 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount6 amount) {
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
        OBStatement2StatementFee obStatement2StatementFee = (OBStatement2StatementFee) o;
        return Objects.equals(this.description, obStatement2StatementFee.description) &&
                Objects.equals(this.creditDebitIndicator, obStatement2StatementFee.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2StatementFee.type) &&
                Objects.equals(this.rate, obStatement2StatementFee.rate) &&
                Objects.equals(this.rateType, obStatement2StatementFee.rateType) &&
                Objects.equals(this.frequency, obStatement2StatementFee.frequency) &&
                Objects.equals(this.amount, obStatement2StatementFee.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementFee {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

