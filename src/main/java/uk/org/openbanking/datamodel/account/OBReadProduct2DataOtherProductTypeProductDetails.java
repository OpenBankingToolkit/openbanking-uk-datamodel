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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadProduct2DataOtherProductTypeProductDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeProductDetails {
    /**
     * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd
     */
    public enum SegmentEnum {
        GEAS("GEAS"),

        GEBA("GEBA"),

        GEBR("GEBR"),

        GEBU("GEBU"),

        GECI("GECI"),

        GECS("GECS"),

        GEFB("GEFB"),

        GEFG("GEFG"),

        GEG("GEG"),

        GEGR("GEGR"),

        GEGS("GEGS"),

        GEOT("GEOT"),

        GEOV("GEOV"),

        GEPA("GEPA"),

        GEPR("GEPR"),

        GERE("GERE"),

        GEST("GEST"),

        GEYA("GEYA"),

        GEYO("GEYO"),
    
    PSCA("PSCA"),

        PSES("PSES"),

        PSNC("PSNC"),

        PSNP("PSNP"),

        PSRG("PSRG"),

        PSSS("PSSS"),

        PSST("PSST"),

        PSSW("PSSW");

        private String value;

        SegmentEnum(String value) {
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
        public static SegmentEnum fromValue(String value) {
            for (SegmentEnum b : SegmentEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("Segment")
    @Valid
    private List<SegmentEnum> segment = null;

    @JsonProperty("FeeFreeLength")
    private Integer feeFreeLength;

    /**
     * The unit of period (days, weeks, months etc.) of the promotional length
     */
    public enum FeeFreeLengthPeriodEnum {
        PACT("PACT"),

        PDAY("PDAY"),

        PHYR("PHYR"),

        PMTH("PMTH"),

        PQTR("PQTR"),

        PWEK("PWEK"),

        PYER("PYER");

        private String value;

        FeeFreeLengthPeriodEnum(String value) {
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
        public static FeeFreeLengthPeriodEnum fromValue(String value) {
            for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @JsonProperty("FeeFreeLengthPeriod")
    private FeeFreeLengthPeriodEnum feeFreeLengthPeriod;

    @JsonProperty("MonthlyMaximumCharge")
    private String monthlyMaximumCharge;

    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OtherSegment")
    private OBOtherCodeType10 otherSegment;

    public OBReadProduct2DataOtherProductTypeProductDetails segment(List<SegmentEnum> segment) {
        this.segment = segment;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails addSegmentItem(SegmentEnum segmentItem) {
        if (this.segment == null) {
            this.segment = new ArrayList<SegmentEnum>();
        }
        this.segment.add(segmentItem);
        return this;
    }

    /**
     * Get segment
     *
     * @return segment
     */
    @ApiModelProperty(value = "")
    public List<SegmentEnum> getSegment() {
        return segment;
    }

    public void setSegment(List<SegmentEnum> segment) {
        this.segment = segment;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
        return this;
    }

    /**
     * The length/duration of the fee free period
     *
     * @return feeFreeLength
     */
    @ApiModelProperty(value = "The length/duration of the fee free period")
    public Integer getFeeFreeLength() {
        return feeFreeLength;
    }

    public void setFeeFreeLength(Integer feeFreeLength) {
        this.feeFreeLength = feeFreeLength;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
        return this;
    }

    /**
     * The unit of period (days, weeks, months etc.) of the promotional length
     *
     * @return feeFreeLengthPeriod
     */
    @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")
    public FeeFreeLengthPeriodEnum getFeeFreeLengthPeriod() {
        return feeFreeLengthPeriod;
    }

    public void setFeeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
        this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails monthlyMaximumCharge(String monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
        return this;
    }

    /**
     * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
     *
     * @return monthlyMaximumCharge
     */
    @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getMonthlyMaximumCharge() {
        return monthlyMaximumCharge;
    }

    public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
        this.monthlyMaximumCharge = monthlyMaximumCharge;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeProductDetails addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeProductDetails otherSegment(OBOtherCodeType10 otherSegment) {
        this.otherSegment = otherSegment;
        return this;
    }

    /**
     * Get otherSegment
     *
     * @return otherSegment
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBOtherCodeType10 getOtherSegment() {
        return otherSegment;
    }

    public void setOtherSegment(OBOtherCodeType10 otherSegment) {
        this.otherSegment = otherSegment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeProductDetails obReadProduct2DataOtherProductTypeProductDetails = (OBReadProduct2DataOtherProductTypeProductDetails) o;
        return Objects.equals(this.segment, obReadProduct2DataOtherProductTypeProductDetails.segment) &&
                Objects.equals(this.feeFreeLength, obReadProduct2DataOtherProductTypeProductDetails.feeFreeLength) &&
                Objects.equals(this.feeFreeLengthPeriod, obReadProduct2DataOtherProductTypeProductDetails.feeFreeLengthPeriod) &&
                Objects.equals(this.monthlyMaximumCharge, obReadProduct2DataOtherProductTypeProductDetails.monthlyMaximumCharge) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeProductDetails.notes) &&
                Objects.equals(this.otherSegment, obReadProduct2DataOtherProductTypeProductDetails.otherSegment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, monthlyMaximumCharge, notes, otherSegment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeProductDetails {\n");

        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
        sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
        sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
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

