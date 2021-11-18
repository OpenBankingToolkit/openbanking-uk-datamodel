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
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeFeeChargeCap {
  /**
   * Fee/charge type which is being capped
   */
  public enum FeeTypeEnum {
    FEPF("FEPF"),

    FTOT("FTOT"),

    FYAF("FYAF"),

    FYAM("FYAM"),

    FYAQ("FYAQ"),

    FYCP("FYCP"),

    FYDB("FYDB"),

    FYMI("FYMI"),

    FYXX("FYXX");

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

  @JsonProperty("MinMaxType")
  private OBMinMaxType1Code minMaxType;

  @JsonProperty("FeeCapOccurrence")
  private Integer feeCapOccurrence;

  @JsonProperty("FeeCapAmount")
  private String feeCapAmount;

  @JsonProperty("CappingPeriod")
  private OBPeriod1Code cappingPeriod;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherFeeType")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType = null;

  public OBReadProduct2DataOtherProductTypeFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

  /**
   * Get feeType
   *
   * @return feeType
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Size(min = 1)
  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }

  public void setFeeType(List<FeeTypeEnum> feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap minMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
    return this;
  }

  /**
   * Get minMaxType
   *
   * @return minMaxType
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBMinMaxType1Code getMinMaxType() {
    return minMaxType;
  }

  public void setMinMaxType(OBMinMaxType1Code minMaxType) {
    this.minMaxType = minMaxType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap feeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

  /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   *
   * @return feeCapOccurrence
   */
  @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")


  public Integer getFeeCapOccurrence() {
    return feeCapOccurrence;
  }

  public void setFeeCapOccurrence(Integer feeCapOccurrence) {
    this.feeCapOccurrence = feeCapOccurrence;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap feeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
    return this;
  }

  /**
   * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   *
   * @return feeCapAmount
   */
  @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
  @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
  public String getFeeCapAmount() {
    return feeCapAmount;
  }

  public void setFeeCapAmount(String feeCapAmount) {
    this.feeCapAmount = feeCapAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap cappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
    return this;
  }

  /**
   * Get cappingPeriod
   *
   * @return cappingPeriod
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBPeriod1Code getCappingPeriod() {
    return cappingPeriod;
  }

  public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
    this.cappingPeriod = cappingPeriod;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeFeeChargeCap otherFeeType(List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeCap addOtherFeeTypeItem(OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

  /**
   * Get otherFeeType
   *
   * @return otherFeeType
   */
  @ApiModelProperty(value = "")
  @Valid
  public List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType) {
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
    OBReadProduct2DataOtherProductTypeFeeChargeCap obReadProduct2DataOtherProductTypeFeeChargeCap = (OBReadProduct2DataOtherProductTypeFeeChargeCap) o;
    return Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeFeeChargeCap.feeType) &&
            Objects.equals(this.minMaxType, obReadProduct2DataOtherProductTypeFeeChargeCap.minMaxType) &&
            Objects.equals(this.feeCapOccurrence, obReadProduct2DataOtherProductTypeFeeChargeCap.feeCapOccurrence) &&
            Objects.equals(this.feeCapAmount, obReadProduct2DataOtherProductTypeFeeChargeCap.feeCapAmount) &&
            Objects.equals(this.cappingPeriod, obReadProduct2DataOtherProductTypeFeeChargeCap.cappingPeriod) &&
            Objects.equals(this.notes, obReadProduct2DataOtherProductTypeFeeChargeCap.notes) &&
            Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeFeeChargeCap.otherFeeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeFeeChargeCap {\n");

    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
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

