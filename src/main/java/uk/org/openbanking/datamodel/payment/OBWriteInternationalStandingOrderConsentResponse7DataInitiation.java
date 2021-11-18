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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for an international standing order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-11T10:59:35.118Z[GMT]")

public class OBWriteInternationalStandingOrderConsentResponse7DataInitiation {
    @JsonProperty("Frequency")
    private String frequency = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("NumberOfPayments")
    private String numberOfPayments = null;

    @JsonProperty("FirstPaymentDateTime")
    private DateTime firstPaymentDateTime = null;

    @JsonProperty("FinalPaymentDateTime")
    private DateTime finalPaymentDateTime = null;

    @JsonProperty("Purpose")
    private String purpose = null;

    @JsonProperty("ExtendedPurpose")
    private String extendedPurpose = null;

    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer = null;

    @JsonProperty("CurrencyOfTransfer")
    private String currencyOfTransfer = null;

    @JsonProperty("DestinationCountryCode")
    private String destinationCountryCode = null;

    @JsonProperty("InstructedAmount")
    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

    @JsonProperty("DebtorAccount")
    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

    @JsonProperty("Creditor")
    private OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor = null;

    @JsonProperty("CreditorAgent")
    private OBWriteInternationalStandingOrder4DataInitiationCreditorAgent creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
     *
     * @return frequency
     **/
    @NotNull
    @Pattern(regexp = "^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    @ApiModelProperty(required = true, value = "Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation numberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
     *
     * @return numberOfPayments
     **/
    @ApiModelProperty(value = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.")
    @Size(min = 1, max = 35)
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation firstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return firstPaymentDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation finalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return finalPaymentDateTime
     **/
    @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @Valid
    public DateTime getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
     *
     * @return purpose
     **/
    @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")
    @Size(min = 1, max = 4)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation extendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
        return this;
    }

    /**
     * Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.
     *
     * @return extendedPurpose
     **/
    @ApiModelProperty(value = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.")
    @Size(min = 1, max = 140)
    public String getExtendedPurpose() {
        return extendedPurpose;
    }

    public void setExtendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     **/
    @ApiModelProperty(value = "")
    @Valid
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
     *
     * @return currencyOfTransfer
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation destinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
        return this;
    }

    /**
     * Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
     *
     * @return destinationCountryCode
     **/
    @ApiModelProperty(value = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).")
    @Pattern(regexp = "[A-Z]{2,2}")
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     **/
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation creditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     **/
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation creditorAgent(OBWriteInternationalStandingOrder4DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteInternationalStandingOrder4DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteInternationalStandingOrder4DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation creditorAccount(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternationalStandingOrder4DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteInternationalStandingOrder4DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalStandingOrderConsentResponse7DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @ApiModelProperty(value = "")
    @Valid
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderConsentResponse7DataInitiation obWriteInternationalStandingOrderConsentResponse7DataInitiation = (OBWriteInternationalStandingOrderConsentResponse7DataInitiation) o;
        return Objects.equals(this.frequency, obWriteInternationalStandingOrderConsentResponse7DataInitiation.frequency) &&
                Objects.equals(this.reference, obWriteInternationalStandingOrderConsentResponse7DataInitiation.reference) &&
                Objects.equals(this.numberOfPayments, obWriteInternationalStandingOrderConsentResponse7DataInitiation.numberOfPayments) &&
                Objects.equals(this.firstPaymentDateTime, obWriteInternationalStandingOrderConsentResponse7DataInitiation.firstPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obWriteInternationalStandingOrderConsentResponse7DataInitiation.finalPaymentDateTime) &&
                Objects.equals(this.purpose, obWriteInternationalStandingOrderConsentResponse7DataInitiation.purpose) &&
                Objects.equals(this.extendedPurpose, obWriteInternationalStandingOrderConsentResponse7DataInitiation.extendedPurpose) &&
                Objects.equals(this.chargeBearer, obWriteInternationalStandingOrderConsentResponse7DataInitiation.chargeBearer) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternationalStandingOrderConsentResponse7DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.destinationCountryCode, obWriteInternationalStandingOrderConsentResponse7DataInitiation.destinationCountryCode) &&
                Objects.equals(this.instructedAmount, obWriteInternationalStandingOrderConsentResponse7DataInitiation.instructedAmount) &&
                Objects.equals(this.debtorAccount, obWriteInternationalStandingOrderConsentResponse7DataInitiation.debtorAccount) &&
                Objects.equals(this.creditor, obWriteInternationalStandingOrderConsentResponse7DataInitiation.creditor) &&
                Objects.equals(this.creditorAgent, obWriteInternationalStandingOrderConsentResponse7DataInitiation.creditorAgent) &&
                Objects.equals(this.creditorAccount, obWriteInternationalStandingOrderConsentResponse7DataInitiation.creditorAccount) &&
                Objects.equals(this.supplementaryData, obWriteInternationalStandingOrderConsentResponse7DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, reference, numberOfPayments, firstPaymentDateTime, finalPaymentDateTime, purpose, extendedPurpose, chargeBearer, currencyOfTransfer, destinationCountryCode, instructedAmount, debtorAccount, creditor, creditorAgent, creditorAccount, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderConsentResponse7DataInitiation {\n");

        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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
