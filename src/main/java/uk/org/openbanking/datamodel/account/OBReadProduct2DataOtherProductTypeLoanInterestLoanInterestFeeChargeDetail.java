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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail {
    @JsonProperty("FeeType")
    private OBFeeType1Code feeType;

    @JsonProperty("NegotiableIndicator")
    private Boolean negotiableIndicator;

    @JsonProperty("FeeAmount")
    private String feeAmount;

    @JsonProperty("FeeRate")
    private String feeRate;

    @JsonProperty("FeeRateType")
    private OBInterestRateType1Code1 feeRateType;

    @JsonProperty("ApplicationFrequency")
    private OBFeeFrequency1Code2 applicationFrequency;

    @JsonProperty("CalculationFrequency")
    private OBFeeFrequency1Code3 calculationFrequency;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherFeeType")
    private OBOtherFeeChargeDetailType otherFeeType;

    @JsonProperty("OtherFeeRateType")
    private OBOtherCodeType15 otherFeeRateType;

    @JsonProperty("OtherApplicationFrequency")
    private OBOtherCodeType16 otherApplicationFrequency;

    @JsonProperty("OtherCalculationFrequency")
    private OBOtherCodeType17 otherCalculationFrequency;

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeType(OBFeeType1Code feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get feeType
     *
     * @return feeType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBFeeType1Code getFeeType() {
        return feeType;
    }

    public void setFeeType(OBFeeType1Code feeType) {
        this.feeType = feeType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Fee/charge which is usually negotiable rather than a fixed amount
     *
     * @return negotiableIndicator
     */
    @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
    public Boolean getNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     */
    @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     */
    @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail feeRateType(OBInterestRateType1Code1 feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Get feeRateType
     *
     * @return feeRateType
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBInterestRateType1Code1 getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Get applicationFrequency
     *
     * @return applicationFrequency
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBFeeFrequency1Code2 getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * Get calculationFrequency
     *
     * @return calculationFrequency
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBFeeFrequency1Code3 getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     */
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
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
    public OBOtherFeeChargeDetailType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
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
    public OBOtherCodeType15 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OBOtherCodeType15 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
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
    public OBOtherCodeType16 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
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
    public OBOtherCodeType17 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail) o;
        return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeType) &&
                Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.negotiableIndicator) &&
                Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeAmount) &&
                Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.feeRateType) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.notes) &&
                Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
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

