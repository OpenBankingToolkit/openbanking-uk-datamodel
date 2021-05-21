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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWriteInternationalScheduledConsentResponse6DataInitiation {
    @JsonProperty("InstructionIdentification")
    private String instructionIdentification;

    @JsonProperty("EndToEndIdentification")
    private String endToEndIdentification;

    @JsonProperty("LocalInstrument")
    private String localInstrument;

    @JsonProperty("InstructionPriority")
    private OBPriority2Code instructionPriority;

    @JsonProperty("Purpose")
    private String purpose;

    @JsonProperty("ExtendedPurpose")
    private String extendedPurpose;

    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer;

    @JsonProperty("RequestedExecutionDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime requestedExecutionDateTime;

    @JsonProperty("CurrencyOfTransfer")
    private String currencyOfTransfer;

    @JsonProperty("DestinationCountryCode")
    private String destinationCountryCode;

    @JsonProperty("InstructedAmount")
    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount;

    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation;

    @JsonProperty("DebtorAccount")
    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    @JsonProperty("Creditor")
    private OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor;

    @JsonProperty("CreditorAgent")
    private OBWriteInternational3DataInitiationCreditorAgent creditorAgent;

    @JsonProperty("CreditorAccount")
    private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount;

    @JsonProperty("RemittanceInformation")
    private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation;

    @JsonProperty("SupplementaryData")
    @Valid
    private OBSupplementaryData1 supplementaryData = null;

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
        return this;
    }

    /**
     * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
     *
     * @return instructionIdentification
     */
    @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
    @NotNull
    @Size(min = 1, max = 35)
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
     *
     * @return endToEndIdentification
     */
    @ApiModelProperty(value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
    @Size(min = 1, max = 35)
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
     *
     * @return localInstrument
     */
    @ApiModelProperty(value = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructionPriority(OBPriority2Code instructionPriority) {
        this.instructionPriority = instructionPriority;
        return this;
    }

    /**
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
     *
     * @return instructionPriority
     */
    @ApiModelProperty(value = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.")
    public OBPriority2Code getInstructionPriority() {
        return instructionPriority;
    }

    public void setInstructionPriority(OBPriority2Code instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
     *
     * @return purpose
     */
    @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")
    @Size(min = 1, max = 4)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation extendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
        return this;
    }

    /**
     * Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.
     *
     * @return extendedPurpose
     */
    @ApiModelProperty(value = "Specifies the purpose of an international payment, when there is no corresponding 4 character code available in the ISO20022 list of Purpose Codes.")
    @Size(min = 1, max = 140)
    public String getExtendedPurpose() {
        return extendedPurpose;
    }

    public void setExtendedPurpose(String extendedPurpose) {
        this.extendedPurpose = extendedPurpose;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     */
    @ApiModelProperty(required = true, value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    @Valid
    public DateTime getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.
     *
     * @return currencyOfTransfer
     */
    @ApiModelProperty(required = true, value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation destinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
        return this;
    }

    /**
     * Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).
     *
     * @return destinationCountryCode
     */
    @ApiModelProperty(value = "Country in which Credit Account is domiciled. Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).")
    @Pattern(regexp = "[A-Z]{2,2}")
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation instructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBWriteDomestic2DataInitiationInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBWriteDomestic2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation exchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteInternational3DataInitiationExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternational3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalScheduledConsentResponse6DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteInternational3DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteInternational3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation creditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBWriteDomestic2DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomestic2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBWriteDomestic2DataInitiationRemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBWriteInternationalScheduledConsentResponse6DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Additional information that can not be captured in the structured fields and/or any other specific block.
     *
     * @return supplementaryData
     */
    @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")
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
        OBWriteInternationalScheduledConsentResponse6DataInitiation obWriteInternationalScheduledConsentResponse6DataInitiation = (OBWriteInternationalScheduledConsentResponse6DataInitiation) o;
        return Objects.equals(this.instructionIdentification, obWriteInternationalScheduledConsentResponse6DataInitiation.instructionIdentification) &&
                Objects.equals(this.endToEndIdentification, obWriteInternationalScheduledConsentResponse6DataInitiation.endToEndIdentification) &&
                Objects.equals(this.localInstrument, obWriteInternationalScheduledConsentResponse6DataInitiation.localInstrument) &&
                Objects.equals(this.instructionPriority, obWriteInternationalScheduledConsentResponse6DataInitiation.instructionPriority) &&
                Objects.equals(this.purpose, obWriteInternationalScheduledConsentResponse6DataInitiation.purpose) &&
                Objects.equals(this.extendedPurpose, obWriteInternationalScheduledConsentResponse6DataInitiation.extendedPurpose) &&
                Objects.equals(this.chargeBearer, obWriteInternationalScheduledConsentResponse6DataInitiation.chargeBearer) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteInternationalScheduledConsentResponse6DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternationalScheduledConsentResponse6DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.destinationCountryCode, obWriteInternationalScheduledConsentResponse6DataInitiation.destinationCountryCode) &&
                Objects.equals(this.instructedAmount, obWriteInternationalScheduledConsentResponse6DataInitiation.instructedAmount) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledConsentResponse6DataInitiation.exchangeRateInformation) &&
                Objects.equals(this.debtorAccount, obWriteInternationalScheduledConsentResponse6DataInitiation.debtorAccount) &&
                Objects.equals(this.creditor, obWriteInternationalScheduledConsentResponse6DataInitiation.creditor) &&
                Objects.equals(this.creditorAgent, obWriteInternationalScheduledConsentResponse6DataInitiation.creditorAgent) &&
                Objects.equals(this.creditorAccount, obWriteInternationalScheduledConsentResponse6DataInitiation.creditorAccount) &&
                Objects.equals(this.remittanceInformation, obWriteInternationalScheduledConsentResponse6DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteInternationalScheduledConsentResponse6DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionIdentification, endToEndIdentification, localInstrument, instructionPriority, purpose, extendedPurpose, chargeBearer, requestedExecutionDateTime, currencyOfTransfer, destinationCountryCode, instructedAmount, exchangeRateInformation, debtorAccount, creditor, creditorAgent, creditorAccount, remittanceInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsentResponse6DataInitiation {\n");

        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    extendedPurpose: ").append(toIndentedString(extendedPurpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    destinationCountryCode: ").append(toIndentedString(destinationCountryCode)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

