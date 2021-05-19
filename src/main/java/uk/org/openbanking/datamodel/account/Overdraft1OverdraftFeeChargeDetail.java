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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the fees/charges
 */
@ApiModel(description = "Details about the fees/charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class Overdraft1OverdraftFeeChargeDetail {
    /**
     * Overdraft fee type
     */
    public enum FeeTypeEnum {
        ARRANGEDOVERDRAFT("ArrangedOverdraft"),

        EMERGENCYBORROWING("EmergencyBorrowing"),

        BORROWINGITEM("BorrowingItem"),

        OVERDRAFTRENEWAL("OverdraftRenewal"),

        ANNUALREVIEW("AnnualReview"),

        OVERDRAFTSETUP("OverdraftSetup"),

        SURCHARGE("Surcharge"),

        TEMPOVERDRAFT("TempOverdraft"),

        UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),

        UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),

        OTHER("Other"),

        UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

        private String value;

        FeeTypeEnum(String value) {
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
        public static FeeTypeEnum fromValue(String value) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("FeeType")
    private FeeTypeEnum feeType;

    @JsonProperty("OverdraftControlIndicator")
    private Boolean overdraftControlIndicator;

    @JsonProperty("IncrementalBorrowingAmount")
    private String incrementalBorrowingAmount;

    @JsonProperty("FeeAmount")
    private String feeAmount;

    @JsonProperty("FeeRate")
    private String feeRate;

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     */
    public enum FeeRateTypeEnum {
        LINKEDBASERATE("LinkedBaseRate"),

        GROSS("Gross"),

        NET("Net"),

        OTHER("Other");

        private String value;

        FeeRateTypeEnum(String value) {
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
        public static FeeRateTypeEnum fromValue(String value) {
            for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("FeeRateType")
    private FeeRateTypeEnum feeRateType;

    /**
     * Frequency at which the overdraft charge is applied to the account
     */
    public enum ApplicationFrequencyEnum {
        ACCOUNTCLOSING("AccountClosing"),

        ACCOUNTOPENING("AccountOpening"),

        ACADEMICTERM("AcademicTerm"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONACCOUNTANNIVERSARY("OnAccountAnniversary"),

        OTHER("Other"),

        PERHOUR("PerHour"),

        PEROCCURRENCE("PerOccurrence"),

        PERSHEET("PerSheet"),

        PERTRANSACTION("PerTransaction"),

        PERTRANSACTIONAMOUNT("PerTransactionAmount"),

        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

        QUARTERLY("Quarterly"),

        SIXMONTHLY("SixMonthly"),

        STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

        private String value;

        ApplicationFrequencyEnum(String value) {
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
        public static ApplicationFrequencyEnum fromValue(String value) {
            for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency;

    /**
     * How often is the overdraft fee/charge calculated for the account.
     */
    public enum CalculationFrequencyEnum {
        ACCOUNTCLOSING("AccountClosing"),

        ACCOUNTOPENING("AccountOpening"),

        ACADEMICTERM("AcademicTerm"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONACCOUNTANNIVERSARY("OnAccountAnniversary"),

        OTHER("Other"),

        PERHOUR("PerHour"),

        PEROCCURRENCE("PerOccurrence"),

        PERSHEET("PerSheet"),

        PERTRANSACTION("PerTransaction"),

        PERTRANSACTIONAMOUNT("PerTransactionAmount"),

        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

        QUARTERLY("Quarterly"),

        SIXMONTHLY("SixMonthly"),

        STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

        private String value;

        CalculationFrequencyEnum(String value) {
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
        public static CalculationFrequencyEnum fromValue(String value) {
            for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherFeeType")
    private OtherFeeType otherFeeType;

    @JsonProperty("OtherFeeRateType")
    private OtherFeeRateType otherFeeRateType;

    @JsonProperty("OtherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency;

    @JsonProperty("OtherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency;

    @JsonProperty("OverdraftFeeChargeCap")
    private Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap;

    public Overdraft1OverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Overdraft fee type
     *
     * @return feeType
     */
    @ApiModelProperty(required = true, value = "Overdraft fee type")
    @NotNull
    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
    }

    public Overdraft1OverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Specifies for the overdraft control feature/benefit
     *
     * @return overdraftControlIndicator
     */
    @ApiModelProperty(value = "Specifies for the overdraft control feature/benefit")
    public Boolean getOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public Overdraft1OverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
        return this;
    }

    /**
     * Every additional tranche of an overdraft balance to which an overdraft fee is applied
     *
     * @return incrementalBorrowingAmount
     */
    @ApiModelProperty(value = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getIncrementalBorrowingAmount() {
        return incrementalBorrowingAmount;
    }

    public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    }

    public Overdraft1OverdraftFeeChargeDetail feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     */
    @ApiModelProperty(value = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Overdraft1OverdraftFeeChargeDetail feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     */
    @ApiModelProperty(value = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public Overdraft1OverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRateType
     */
    @ApiModelProperty(value = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    public FeeRateTypeEnum getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
    }

    public Overdraft1OverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Frequency at which the overdraft charge is applied to the account
     *
     * @return applicationFrequency
     */
    @ApiModelProperty(required = true, value = "Frequency at which the overdraft charge is applied to the account")
    @NotNull
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public Overdraft1OverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is the overdraft fee/charge calculated for the account.
     *
     * @return calculationFrequency
     */
    @ApiModelProperty(value = "How often is the overdraft fee/charge calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public Overdraft1OverdraftFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft1OverdraftFeeChargeDetail addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for capturing any other info related to Overdraft Fees Charge Details
     *
     * @return notes
     */
    @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Overdraft1OverdraftFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherFeeType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public Overdraft1OverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public Overdraft1OverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public Overdraft1OverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     */
    @ApiModelProperty(value = "")
    @Valid
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    public Overdraft1OverdraftFeeChargeDetail overdraftFeeChargeCap(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    /**
     * Get overdraftFeeChargeCap
     *
     * @return overdraftFeeChargeCap
     */
    @ApiModelProperty(value = "")
    @Valid
    public Overdraft1OverdraftFeeChargeCap getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(Overdraft1OverdraftFeeChargeCap overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft1OverdraftFeeChargeDetail overdraft1OverdraftFeeChargeDetail = (Overdraft1OverdraftFeeChargeDetail) o;
        return Objects.equals(this.feeType, overdraft1OverdraftFeeChargeDetail.feeType) &&
                Objects.equals(this.overdraftControlIndicator, overdraft1OverdraftFeeChargeDetail.overdraftControlIndicator) &&
                Objects.equals(this.incrementalBorrowingAmount, overdraft1OverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
                Objects.equals(this.feeAmount, overdraft1OverdraftFeeChargeDetail.feeAmount) &&
                Objects.equals(this.feeRate, overdraft1OverdraftFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, overdraft1OverdraftFeeChargeDetail.feeRateType) &&
                Objects.equals(this.applicationFrequency, overdraft1OverdraftFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, overdraft1OverdraftFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.notes, overdraft1OverdraftFeeChargeDetail.notes) &&
                Objects.equals(this.otherFeeType, overdraft1OverdraftFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, overdraft1OverdraftFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, overdraft1OverdraftFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, overdraft1OverdraftFeeChargeDetail.otherCalculationFrequency) &&
                Objects.equals(this.overdraftFeeChargeCap, overdraft1OverdraftFeeChargeDetail.overdraftFeeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, overdraftFeeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft1OverdraftFeeChargeDetail {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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

