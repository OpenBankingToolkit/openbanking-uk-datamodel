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
package uk.org.openbanking.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBDomesticVRPControlParametersPeriodicLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-21T09:44:44.818881+01:00[Europe/London]")

public class OBDomesticVRPControlParametersPeriodicLimits {
    /**
     * ^ Period type for this period limit
     */
    public enum PeriodTypeEnum {
        DAY("Day"),

        WEEK("Week"),

        FORTNIGHT("Fortnight"),

        MONTH("Month"),

        HALF_YEAR("Half-year"),

        YEAR("Year");

        private String value;

        PeriodTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodTypeEnum fromValue(String value) {
            for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("PeriodType")
    private PeriodTypeEnum periodType;

    /**
     * ^ Specifies whether the period starts on the date of consent creation or lines up with a calendar
     */
    public enum PeriodAlignmentEnum {
        CONSENT("Consent"),

        CALENDAR("Calendar");

        private String value;

        PeriodAlignmentEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodAlignmentEnum fromValue(String value) {
            for (PeriodAlignmentEnum b : PeriodAlignmentEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("PeriodAlignment")
    private PeriodAlignmentEnum periodAlignment;

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("Currency")
    private String currency;

    public OBDomesticVRPControlParametersPeriodicLimits periodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * ^ Period type for this period limit
     *
     * @return periodType
     */
    @ApiModelProperty(required = true, value = "^ Period type for this period limit")
    @NotNull


    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public OBDomesticVRPControlParametersPeriodicLimits periodAlignment(PeriodAlignmentEnum periodAlignment) {
        this.periodAlignment = periodAlignment;
        return this;
    }

    /**
     * ^ Specifies whether the period starts on the date of consent creation or lines up with a calendar
     *
     * @return periodAlignment
     */
    @ApiModelProperty(required = true, value = "^ Specifies whether the period starts on the date of consent creation or lines up with a calendar")
    @NotNull


    public PeriodAlignmentEnum getPeriodAlignment() {
        return periodAlignment;
    }

    public void setPeriodAlignment(PeriodAlignmentEnum periodAlignment) {
        this.periodAlignment = periodAlignment;
    }

    public OBDomesticVRPControlParametersPeriodicLimits amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * ^ A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
     *
     * @return amount
     */
    @ApiModelProperty(required = true, value = "^ A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
    @NotNull


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBDomesticVRPControlParametersPeriodicLimits currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * ^ A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".   | ActiveOrHistoricCurrencyCode
     *
     * @return currency
     */
    @ApiModelProperty(required = true, value = "^ A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".   | ActiveOrHistoricCurrencyCode")
    @NotNull


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
        OBDomesticVRPControlParametersPeriodicLimits obDomesticVRPControlParametersPeriodicLimits = (OBDomesticVRPControlParametersPeriodicLimits) o;
        return Objects.equals(this.periodType, obDomesticVRPControlParametersPeriodicLimits.periodType) &&
                Objects.equals(this.periodAlignment, obDomesticVRPControlParametersPeriodicLimits.periodAlignment) &&
                Objects.equals(this.amount, obDomesticVRPControlParametersPeriodicLimits.amount) &&
                Objects.equals(this.currency, obDomesticVRPControlParametersPeriodicLimits.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodAlignment, amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPControlParametersPeriodicLimits {\n");

        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodAlignment: ").append(toIndentedString(periodAlignment)).append("\n");
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

