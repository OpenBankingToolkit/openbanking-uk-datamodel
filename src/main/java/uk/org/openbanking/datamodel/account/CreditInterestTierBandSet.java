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
/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class CreditInterestTierBandSet {
    /**
     * Methods of calculating interest
     */
    public enum CalculationMethodEnum {
        COMPOUND("Compound"),

        SIMPLEINTEREST("SimpleInterest");

        private String value;

        CalculationMethodEnum(String value) {
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
        public static CalculationMethodEnum fromValue(String text) {
            for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("CalculationMethod")
    private CalculationMethodEnum calculationMethod = null;

    /**
     * Describes whether accrued interest is payable only to the BCA or to another bank account
     */
    public enum DestinationEnum {
        PAYAWAY("PayAway"),

        SELFCREDIT("SelfCredit");

        private String value;

        DestinationEnum(String value) {
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
        public static DestinationEnum fromValue(String text) {
            for (DestinationEnum b : DestinationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Destination")
    private DestinationEnum destination = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("TierBand")
    private List<CreditInterestTierBand> tierBand = new ArrayList<CreditInterestTierBand>();

    /**
     * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
     */
    public enum TierBandMethodEnum {
        BANDED("Banded"),

        TIERED("Tiered"),

        WHOLE("Whole");

        private String value;

        TierBandMethodEnum(String value) {
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
        public static TierBandMethodEnum fromValue(String text) {
            for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("TierBandMethod")
    private TierBandMethodEnum tierBandMethod = null;

    public CreditInterestTierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
        return this;
    }

    /**
     * Methods of calculating interest
     * @return calculationMethod
     **/
    @ApiModelProperty(value = "Methods of calculating interest")
    public CalculationMethodEnum getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public CreditInterestTierBandSet destination(DestinationEnum destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Describes whether accrued interest is payable only to the BCA or to another bank account
     * @return destination
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Describes whether accrued interest is payable only to the BCA or to another bank account")
    public DestinationEnum getDestination() {
        return destination;
    }

    public void setDestination(DestinationEnum destination) {
        this.destination = destination;
    }

    public CreditInterestTierBandSet notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public CreditInterestTierBandSet addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band Set details
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public CreditInterestTierBandSet tierBand(List<CreditInterestTierBand> tierBand) {
        this.tierBand = tierBand;
        return this;
    }

    public CreditInterestTierBandSet addTierBandItem(CreditInterestTierBand tierBandItem) {
        this.tierBand.add(tierBandItem);
        return this;
    }

    /**
     * Tier Band Details
     * @return tierBand
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Tier Band Details")
    public List<CreditInterestTierBand> getTierBand() {
        return tierBand;
    }

    public void setTierBand(List<CreditInterestTierBand> tierBand) {
        this.tierBand = tierBand;
    }

    public CreditInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
     * @return tierBandMethod
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance")
    public TierBandMethodEnum getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditInterestTierBandSet creditInterestTierBandSet = (CreditInterestTierBandSet) o;
        return Objects.equals(this.calculationMethod, creditInterestTierBandSet.calculationMethod) &&
                Objects.equals(this.destination, creditInterestTierBandSet.destination) &&
                Objects.equals(this.notes, creditInterestTierBandSet.notes) &&
                Objects.equals(this.tierBand, creditInterestTierBandSet.tierBand) &&
                Objects.equals(this.tierBandMethod, creditInterestTierBandSet.tierBandMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculationMethod, destination, notes, tierBand, tierBandMethod);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditInterestTierBandSet {\n");

        sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
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

