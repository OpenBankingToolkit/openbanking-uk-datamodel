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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tier Band Details
 */
@ApiModel(description = "Tier Band Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-05T09:20:17.613+01:00")
public class CreditInterest1TierBand {
    @JsonProperty("AER")
    private String AER = null;

    /**
     * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s PCA.
     */
    public enum ApplicationFrequencyEnum {
        PERACADEMICTERM("PerAcademicTerm"),

        DAILY("Daily"),

        HALFYEARLY("HalfYearly"),

        MONTHLY("Monthly"),

        OTHER("Other"),

        QUARTERLY("Quarterly"),

        PERSTATEMENTDATE("PerStatementDate"),

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
        public static ApplicationFrequencyEnum fromValue(String text) {
            for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency = null;

    @JsonProperty("BankInterestRate")
    private String bankInterestRate = null;

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
     */
    public enum BankInterestRateTypeEnum {
        LINKEDBASERATE("LinkedBaseRate"),

        GROSS("Gross"),

        NET("Net"),

        OTHER("Other");

        private String value;

        BankInterestRateTypeEnum(String value) {
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
        public static BankInterestRateTypeEnum fromValue(String text) {
            for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("BankInterestRateType")
    private BankInterestRateTypeEnum bankInterestRateType = null;

    /**
     * How often is credit interest calculated for the account.
     */
    public enum CalculationFrequencyEnum {
        PERACADEMICTERM("PerAcademicTerm"),

        DAILY("Daily"),

        HALFYEARLY("HalfYearly"),

        MONTHLY("Monthly"),

        OTHER("Other"),

        QUARTERLY("Quarterly"),

        PERSTATEMENTDATE("PerStatementDate"),

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
        public static CalculationFrequencyEnum fromValue(String text) {
            for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency = null;

    /**
     * Amount on which Interest applied.
     */
    public enum DepositInterestAppliedCoverageEnum {
        TIERED("Tiered"),

        WHOLE("Whole");

        private String value;

        DepositInterestAppliedCoverageEnum(String value) {
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
        public static DepositInterestAppliedCoverageEnum fromValue(String text) {
            for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("DepositInterestAppliedCoverage")
    private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage = null;

    /**
     * Type of interest rate, Fixed or Variable
     */
    public enum FixedVariableInterestRateTypeEnum {
        FIXED("Fixed"),

        VARIABLE("Variable");

        private String value;

        FixedVariableInterestRateTypeEnum(String value) {
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
        public static FixedVariableInterestRateTypeEnum fromValue(String text) {
            for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("FixedVariableInterestRateType")
    private FixedVariableInterestRateTypeEnum fixedVariableInterestRateType = null;

    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency = null;

    @JsonProperty("OtherBankInterestType")
    private OtherBankInterestType otherBankInterestType = null;

    @JsonProperty("OtherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency = null;

    @JsonProperty("TierValueMaximum")
    private String tierValueMaximum = null;

    @JsonProperty("TierValueMinimum")
    private String tierValueMinimum = null;

    public CreditInterest1TierBand AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     * @return AER
     **/
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(required = true, value = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public CreditInterest1TierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s PCA.
     * @return applicationFrequency
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's PCA.")
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public CreditInterest1TierBand bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the PCA product
     * @return bankInterestRate
     **/
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Bank Interest for the PCA product")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public CreditInterest1TierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
        return this;
    }

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
     * @return bankInterestRateType
     **/
    @ApiModelProperty(value = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.")
    public BankInterestRateTypeEnum getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public CreditInterest1TierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is credit interest calculated for the account.
     * @return calculationFrequency
     **/
    @ApiModelProperty(value = "How often is credit interest calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public CreditInterest1TierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
        return this;
    }

    /**
     * Amount on which Interest applied.
     * @return depositInterestAppliedCoverage
     **/
    @ApiModelProperty(value = "Amount on which Interest applied.")
    public DepositInterestAppliedCoverageEnum getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public CreditInterest1TierBand fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Type of interest rate, Fixed or Variable
     * @return fixedVariableInterestRateType
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Type of interest rate, Fixed or Variable")
    public FixedVariableInterestRateTypeEnum getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public CreditInterest1TierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a PCA.
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a PCA.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public CreditInterest1TierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public CreditInterest1TierBand addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band details
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public CreditInterest1TierBand otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     * @return otherApplicationFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public CreditInterest1TierBand otherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
        return this;
    }

    /**
     * Get otherBankInterestType
     * @return otherBankInterestType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public CreditInterest1TierBand otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     * @return otherCalculationFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    public CreditInterest1TierBand tierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Maximum deposit value for which the credit interest tier applies.
     * @return tierValueMaximum
     **/
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(value = "Maximum deposit value for which the credit interest tier applies.")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public CreditInterest1TierBand tierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum deposit value for which the credit interest tier applies.
     * @return tierValueMinimum
     **/
    @NotNull
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    @ApiModelProperty(required = true, value = "Minimum deposit value for which the credit interest tier applies.")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditInterest1TierBand creditInterest1TierBand = (CreditInterest1TierBand) o;
        return Objects.equals(this.AER, creditInterest1TierBand.AER) &&
                Objects.equals(this.applicationFrequency, creditInterest1TierBand.applicationFrequency) &&
                Objects.equals(this.bankInterestRate, creditInterest1TierBand.bankInterestRate) &&
                Objects.equals(this.bankInterestRateType, creditInterest1TierBand.bankInterestRateType) &&
                Objects.equals(this.calculationFrequency, creditInterest1TierBand.calculationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, creditInterest1TierBand.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, creditInterest1TierBand.fixedVariableInterestRateType) &&
                Objects.equals(this.identification, creditInterest1TierBand.identification) &&
                Objects.equals(this.notes, creditInterest1TierBand.notes) &&
                Objects.equals(this.otherApplicationFrequency, creditInterest1TierBand.otherApplicationFrequency) &&
                Objects.equals(this.otherBankInterestType, creditInterest1TierBand.otherBankInterestType) &&
                Objects.equals(this.otherCalculationFrequency, creditInterest1TierBand.otherCalculationFrequency) &&
                Objects.equals(this.tierValueMaximum, creditInterest1TierBand.tierValueMaximum) &&
                Objects.equals(this.tierValueMinimum, creditInterest1TierBand.tierValueMinimum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AER, applicationFrequency, bankInterestRate, bankInterestRateType, calculationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, identification, notes, otherApplicationFrequency, otherBankInterestType, otherCalculationFrequency, tierValueMaximum, tierValueMinimum);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditInterest1TierBand {\n");

        sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
        sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
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

