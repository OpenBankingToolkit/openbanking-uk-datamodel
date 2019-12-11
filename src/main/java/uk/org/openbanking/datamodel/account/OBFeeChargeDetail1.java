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
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBFeeChargeDetail1 {

  @JsonProperty("FeeCategory")
  private OBFeeCategory1Code feeCategory = null;

  @JsonProperty("FeeType")
  private OBFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OBFeeChargeCap1> feeChargeCap = null;

  @JsonProperty("OtherFeeCategoryType")
  private OBOtherCodeType1 otherFeeCategoryType = null;

  @JsonProperty("OtherFeeType")
  private OBOtherFeeChargeDetailType otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType1 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType1 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType1 otherCalculationFrequency = null;

  @JsonProperty("OBFeeApplicableRange1")
  private OBFeeApplicableRange1 feeApplicableRange = null;

  public OBFeeChargeDetail1 feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull


  public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBFeeChargeDetail1 feeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Fee/Charge Type
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "Fee/Charge Type")
  @NotNull


  public OBFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBFeeChargeDetail1 negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")


  public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBFeeChargeDetail1 feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")

@Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBFeeChargeDetail1 feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")

@Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$") 
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBFeeChargeDetail1 feeRateType(OBInterestRateType1Code feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")


  public OBInterestRateType1Code getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBFeeChargeDetail1 applicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is applied to the account
   * @return applicationFrequency
  **/
  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
  @NotNull


  public OBFeeFrequency1Code getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBFeeChargeDetail1 calculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is calculated
   * @return calculationFrequency
  **/
  @ApiModelProperty(value = "How frequently the fee/charge is calculated")


  public OBFeeFrequency1Code getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBFeeChargeDetail1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBFeeChargeDetail1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the fee/charge details.
   * @return notes
  **/
  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBFeeChargeDetail1 feeChargeCap(List<OBFeeChargeCap1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBFeeChargeDetail1 addFeeChargeCapItem(OBFeeChargeCap1 feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OBFeeChargeCap1>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
   * @return feeChargeCap
  **/
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")

  @Valid

  public List<OBFeeChargeCap1> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBFeeChargeCap1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OBFeeChargeDetail1 otherFeeCategoryType(OBOtherCodeType1 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OBOtherCodeType1 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public OBFeeChargeDetail1 otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBFeeChargeDetail1 otherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBFeeChargeDetail1 otherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBFeeChargeDetail1 otherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBOtherCodeType1 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBFeeChargeDetail1 feeApplicableRange(OBFeeApplicableRange1 feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBFeeApplicableRange1 getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(OBFeeApplicableRange1 feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFeeChargeDetail1 obBCAData1FeeChargeDetail = (OBFeeChargeDetail1) o;
    return Objects.equals(this.feeCategory, obBCAData1FeeChargeDetail.feeCategory) &&
        Objects.equals(this.feeType, obBCAData1FeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, obBCAData1FeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.feeAmount, obBCAData1FeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, obBCAData1FeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, obBCAData1FeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, obBCAData1FeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obBCAData1FeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, obBCAData1FeeChargeDetail.notes) &&
        Objects.equals(this.feeChargeCap, obBCAData1FeeChargeDetail.feeChargeCap) &&
        Objects.equals(this.otherFeeCategoryType, obBCAData1FeeChargeDetail.otherFeeCategoryType) &&
        Objects.equals(this.otherFeeType, obBCAData1FeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obBCAData1FeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obBCAData1FeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obBCAData1FeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.feeApplicableRange, obBCAData1FeeChargeDetail.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, feeChargeCap, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFeeChargeDetail1 {\n");

    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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

