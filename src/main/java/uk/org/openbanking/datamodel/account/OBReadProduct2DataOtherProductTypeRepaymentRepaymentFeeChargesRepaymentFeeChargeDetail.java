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
 * Details about specific fees/charges that are applied for repayment
 */
@ApiModel(description = "Details about specific fees/charges that are applied for repayment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail {
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
    private OBOtherCodeType18 otherFeeRateType;

    @JsonProperty("OtherApplicationFrequency")
    private OBOtherCodeType16 otherApplicationFrequency;

    @JsonProperty("OtherCalculationFrequency")
    private OBOtherCodeType17 otherCalculationFrequency;

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail feeType(OBFeeType1Code feeType) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail feeAmount(String feeAmount) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail feeRate(String feeRate) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail feeRateType(OBInterestRateType1Code1 feeRateType) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail otherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
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
    public OBOtherCodeType18 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
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
        OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail) o;
        return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.feeType) &&
                Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.negotiableIndicator) &&
                Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.feeAmount) &&
                Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.feeRateType) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.notes) &&
                Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail {\n");

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

