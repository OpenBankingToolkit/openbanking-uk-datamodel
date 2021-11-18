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
 * Details about the fees/charges
 */
@ApiModel(description = "Details about the fees/charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail {
  @JsonProperty("FeeType")
  private OBOverdraftFeeType1Code feeType;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator;

  @JsonProperty("OverdraftControlIndicator")
  private Boolean overdraftControlIndicator;

  @JsonProperty("IncrementalBorrowingAmount")
  private String incrementalBorrowingAmount;

  @JsonProperty("FeeAmount")
  private String feeAmount;

  @JsonProperty("FeeRate")
  private String feeRate;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code0 feeRateType;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code0 applicationFrequency;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code1 calculationFrequency;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OverdraftFeeChargeCap")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OtherFeeType")
  private OBOtherCodeType13 otherFeeType;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType14 otherFeeRateType;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType11 otherApplicationFrequency;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType12 otherCalculationFrequency;

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeType(OBOverdraftFeeType1Code feeType) {
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
  public OBOverdraftFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBOverdraftFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Indicates whether fee and charges are negotiable
   *
   * @return negotiableIndicator
   */
  @ApiModelProperty(value = "Indicates whether fee and charges are negotiable")


  public Boolean getNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.
   *
   * @return overdraftControlIndicator
   */
  @ApiModelProperty(value = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")


  public Boolean getOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeAmount(String feeAmount) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRate(String feeRate) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail feeRateType(OBInterestRateType1Code0 feeRateType) {
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
  public OBInterestRateType1Code0 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code0 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail applicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
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
  public OBFeeFrequency1Code0 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code0 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail calculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * Get calculationFrequency
   *
   * @return calculationFrequency
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBFeeFrequency1Code1 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code1 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail overdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   *
   * @return overdraftFeeChargeCap
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeType(OBOtherCodeType13 otherFeeType) {
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
  public OBOtherCodeType13 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherCodeType13 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
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
  public OBOtherCodeType14 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType14 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
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
  public OBOtherCodeType11 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
  public OBOtherCodeType12 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
    OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail = (OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail) o;
    return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeType) &&
            Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.negotiableIndicator) &&
            Objects.equals(this.overdraftControlIndicator, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.overdraftControlIndicator) &&
            Objects.equals(this.incrementalBorrowingAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
            Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeAmount) &&
            Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeRate) &&
            Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.feeRateType) &&
            Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.applicationFrequency) &&
            Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.calculationFrequency) &&
            Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.notes) &&
            Objects.equals(this.overdraftFeeChargeCap, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.overdraftFeeChargeCap) &&
            Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherFeeType) &&
            Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherFeeRateType) &&
            Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherApplicationFrequency) &&
            Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeOverdraftOverdraftFeeChargeDetail {\n");

    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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

