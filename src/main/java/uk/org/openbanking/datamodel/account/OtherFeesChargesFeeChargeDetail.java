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
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OtherFeesChargesFeeChargeDetail {
  /**
   * Categorisation of fees and charges into standard categories.
   */
  public enum FeeCategoryEnum {
    OTHER("Other"),

    SERVICING("Servicing");

    private String value;

    FeeCategoryEnum(String value) {
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
    public static FeeCategoryEnum fromValue(String value) {
      for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("FeeCategory")
  private FeeCategoryEnum feeCategory;

  /**
   * Fee/Charge Type
   */
  public enum FeeTypeEnum {
    SERVICECACCOUNTFEE("ServiceCAccountFee"),

    SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),

    SERVICECOTHER("ServiceCOther"),

    OTHER("Other");

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

  @JsonProperty("FeeAmount")
  private String feeAmount;

  @JsonProperty("FeeRate")
  private String feeRate;

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
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
   * How frequently the fee/charge is applied to the account
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
   * How frequently the fee/charge is calculated
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

  @JsonProperty("OtherFeeCategoryType")
  private OtherFeeCategoryType otherFeeCategoryType;

  @JsonProperty("OtherFeeType")
  private OtherFeeType1 otherFeeType;

  @JsonProperty("OtherFeeRateType")
  private OtherFeeRateType1 otherFeeRateType;

  @JsonProperty("OtherApplicationFrequency")
  private OtherApplicationFrequency1 otherApplicationFrequency;

  @JsonProperty("OtherCalculationFrequency")
  private OtherCalculationFrequency1 otherCalculationFrequency;

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OtherFeesChargesFeeChargeCap> feeChargeCap = null;

  @JsonProperty("FeeApplicableRange")
  private FeeApplicableRange feeApplicableRange;

  public OtherFeesChargesFeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   *
   * @return feeCategory
   */
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull
  public FeeCategoryEnum getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OtherFeesChargesFeeChargeDetail feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Fee/Charge Type
   *
   * @return feeType
   */
  @ApiModelProperty(required = true, value = "Fee/Charge Type")
  @NotNull
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public OtherFeesChargesFeeChargeDetail feeAmount(String feeAmount) {
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

  public OtherFeesChargesFeeChargeDetail feeRate(String feeRate) {
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

  public OtherFeesChargesFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   *
   * @return feeRateType
   */
  @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")


  public FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OtherFeesChargesFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is applied to the account
   *
   * @return applicationFrequency
   */
  @ApiModelProperty(required = true, value = "How frequently the fee/charge is applied to the account")
  @NotNull
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OtherFeesChargesFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How frequently the fee/charge is calculated
   *
   * @return calculationFrequency
   */
  @ApiModelProperty(value = "How frequently the fee/charge is calculated")


  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OtherFeesChargesFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OtherFeesChargesFeeChargeDetail addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the fee/charge details.
   *
   * @return notes
   */
  @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")


  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OtherFeesChargesFeeChargeDetail otherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   *
   * @return otherFeeCategoryType
   */
  @ApiModelProperty(value = "")
  @Valid
  public OtherFeeCategoryType getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public OtherFeesChargesFeeChargeDetail otherFeeType(OtherFeeType1 otherFeeType) {
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
  public OtherFeeType1 getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType1 otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OtherFeesChargesFeeChargeDetail otherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
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
  public OtherFeeRateType1 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OtherFeesChargesFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
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
  public OtherApplicationFrequency1 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OtherFeesChargesFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
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
  public OtherCalculationFrequency1 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OtherFeesChargesFeeChargeDetail feeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesChargesFeeChargeDetail addFeeChargeCapItem(OtherFeesChargesFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OtherFeesChargesFeeChargeCap>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   *
   * @return feeChargeCap
   */
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")
  @Valid
  public List<OtherFeesChargesFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OtherFeesChargesFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OtherFeesChargesFeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   *
   * @return feeApplicableRange
   */
  @ApiModelProperty(value = "")
  @Valid
  public FeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
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
    OtherFeesChargesFeeChargeDetail otherFeesChargesFeeChargeDetail = (OtherFeesChargesFeeChargeDetail) o;
    return Objects.equals(this.feeCategory, otherFeesChargesFeeChargeDetail.feeCategory) &&
            Objects.equals(this.feeType, otherFeesChargesFeeChargeDetail.feeType) &&
            Objects.equals(this.feeAmount, otherFeesChargesFeeChargeDetail.feeAmount) &&
            Objects.equals(this.feeRate, otherFeesChargesFeeChargeDetail.feeRate) &&
            Objects.equals(this.feeRateType, otherFeesChargesFeeChargeDetail.feeRateType) &&
            Objects.equals(this.applicationFrequency, otherFeesChargesFeeChargeDetail.applicationFrequency) &&
            Objects.equals(this.calculationFrequency, otherFeesChargesFeeChargeDetail.calculationFrequency) &&
            Objects.equals(this.notes, otherFeesChargesFeeChargeDetail.notes) &&
            Objects.equals(this.otherFeeCategoryType, otherFeesChargesFeeChargeDetail.otherFeeCategoryType) &&
            Objects.equals(this.otherFeeType, otherFeesChargesFeeChargeDetail.otherFeeType) &&
            Objects.equals(this.otherFeeRateType, otherFeesChargesFeeChargeDetail.otherFeeRateType) &&
            Objects.equals(this.otherApplicationFrequency, otherFeesChargesFeeChargeDetail.otherApplicationFrequency) &&
            Objects.equals(this.otherCalculationFrequency, otherFeesChargesFeeChargeDetail.otherCalculationFrequency) &&
            Objects.equals(this.feeChargeCap, otherFeesChargesFeeChargeDetail.feeChargeCap) &&
            Objects.equals(this.feeApplicableRange, otherFeesChargesFeeChargeDetail.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeChargeCap, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesChargesFeeChargeDetail {\n");

    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

