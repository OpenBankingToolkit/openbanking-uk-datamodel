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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class Overdraft1OverdraftFeeChargeCap {
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
    @Valid
    private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();

    @JsonProperty("OverdraftControlIndicator")
    private Boolean overdraftControlIndicator;

    /**
     * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
     */
    public enum MinMaxTypeEnum {
        MINIMUM("Minimum"),

        MAXIMUM("Maximum");

        private String value;

        MinMaxTypeEnum(String value) {
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
        public static MinMaxTypeEnum fromValue(String value) {
            for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("MinMaxType")
    private MinMaxTypeEnum minMaxType;

    @JsonProperty("FeeCapOccurrence")
    private Float feeCapOccurrence;

    @JsonProperty("FeeCapAmount")
    private String feeCapAmount;

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     */
    public enum CappingPeriodEnum {
        ACADEMICTERM("AcademicTerm"),

        DAY("Day"),

        HALF_YEAR("Half Year"),

        MONTH("Month"),

        QUARTER("Quarter"),

        WEEK("Week"),

        YEAR("Year");

        private String value;

        CappingPeriodEnum(String value) {
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
        public static CappingPeriodEnum fromValue(String value) {
            for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("CappingPeriod")
    private CappingPeriodEnum cappingPeriod;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherFeeType")
    @Valid
    private List<OverdraftOtherFeeType> otherFeeType = null;

    public Overdraft1OverdraftFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Fee/charge type which is being capped
     *
     * @return feeType
     */
    @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")
    @NotNull
    @Size(min = 1)
    public List<FeeTypeEnum> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
    }

    public Overdraft1OverdraftFeeChargeCap overdraftControlIndicator(Boolean overdraftControlIndicator) {
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

    public Overdraft1OverdraftFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
     *
     * @return minMaxType
     */
    @ApiModelProperty(required = true, value = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")
    @NotNull
    public MinMaxTypeEnum getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
    }

    public Overdraft1OverdraftFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     */
    @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Float getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public Overdraft1OverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge
     *
     * @return feeCapAmount
     */
    @ApiModelProperty(value = "Cap amount charged for a fee/charge")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public Overdraft1OverdraftFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     *
     * @return cappingPeriod
     */
    @ApiModelProperty(value = "Period e.g. day, week, month etc. for which the fee/charge is capped")
    public CappingPeriodEnum getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public Overdraft1OverdraftFeeChargeCap notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Notes related to Overdraft fee charge cap
     *
     * @return notes
     */
    @ApiModelProperty(value = "Notes related to Overdraft fee charge cap")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Overdraft1OverdraftFeeChargeCap otherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addOtherFeeTypeItem(OverdraftOtherFeeType otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<OverdraftOtherFeeType>();
        }
        this.otherFeeType.add(otherFeeTypeItem);
        return this;
    }

    /**
     * Other fee type code which is not available in the standard code set
     *
     * @return otherFeeType
     */
    @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")
    @Valid
    public List<OverdraftOtherFeeType> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft1OverdraftFeeChargeCap overdraft1OverdraftFeeChargeCap = (Overdraft1OverdraftFeeChargeCap) o;
        return Objects.equals(this.feeType, overdraft1OverdraftFeeChargeCap.feeType) &&
                Objects.equals(this.overdraftControlIndicator, overdraft1OverdraftFeeChargeCap.overdraftControlIndicator) &&
                Objects.equals(this.minMaxType, overdraft1OverdraftFeeChargeCap.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, overdraft1OverdraftFeeChargeCap.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, overdraft1OverdraftFeeChargeCap.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, overdraft1OverdraftFeeChargeCap.cappingPeriod) &&
                Objects.equals(this.notes, overdraft1OverdraftFeeChargeCap.notes) &&
                Objects.equals(this.otherFeeType, overdraft1OverdraftFeeChargeCap.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, overdraftControlIndicator, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft1OverdraftFeeChargeCap {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
        sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
        sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
        sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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

