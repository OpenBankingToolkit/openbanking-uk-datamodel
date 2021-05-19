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
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Account to or from which a cash entry is made.
 */
@ApiModel(description = "Account to or from which a cash entry is made.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadDirectDebit2DataDirectDebit {
    @JsonProperty("AccountId")
    private String accountId;

    @JsonProperty("DirectDebitId")
    private String directDebitId;

    @JsonProperty("MandateIdentification")
    private String mandateIdentification;

    @JsonProperty("DirectDebitStatusCode")
    private OBExternalDirectDebitStatus1Code directDebitStatusCode;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PreviousPaymentDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime previousPaymentDateTime;

    @JsonProperty("Frequency")
    private String frequency;

    @JsonProperty("PreviousPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount;

    public OBReadDirectDebit2DataDirectDebit accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @NotNull
    @Size(min = 1, max = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBReadDirectDebit2DataDirectDebit directDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
     *
     * @return directDebitId
     */
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
    @Size(min = 1, max = 40)
    public String getDirectDebitId() {
        return directDebitId;
    }

    public void setDirectDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
    }

    public OBReadDirectDebit2DataDirectDebit mandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
        return this;
    }

    /**
     * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
     *
     * @return mandateIdentification
     */
    @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
    @NotNull
    @Size(min = 1, max = 35)
    public String getMandateIdentification() {
        return mandateIdentification;
    }

    public void setMandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
    }

    public OBReadDirectDebit2DataDirectDebit directDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
        return this;
    }

    /**
     * Get directDebitStatusCode
     *
     * @return directDebitStatusCode
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
        return directDebitStatusCode;
    }

    public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
    }

    public OBReadDirectDebit2DataDirectDebit name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of Service User.
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "Name of Service User.")
    @NotNull
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadDirectDebit2DataDirectDebit previousPaymentDateTime(DateTime previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
        return this;
    }

    /**
     * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return previousPaymentDateTime
     */
    @ApiModelProperty(value = "Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @Valid
    public DateTime getPreviousPaymentDateTime() {
        return previousPaymentDateTime;
    }

    public void setPreviousPaymentDateTime(DateTime previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
    }

    public OBReadDirectDebit2DataDirectDebit frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Regularity with which direct debit instructions are to be created and processed.
     *
     * @return frequency
     */
    @ApiModelProperty(value = "Regularity with which direct debit instructions are to be created and processed.")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBReadDirectDebit2DataDirectDebit previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
        this.previousPaymentAmount = previousPaymentAmount;
        return this;
    }

    /**
     * Get previousPaymentAmount
     *
     * @return previousPaymentAmount
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
        return previousPaymentAmount;
    }

    public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
        this.previousPaymentAmount = previousPaymentAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDirectDebit2DataDirectDebit obReadDirectDebit2DataDirectDebit = (OBReadDirectDebit2DataDirectDebit) o;
        return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebit.accountId) &&
                Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebit.directDebitId) &&
                Objects.equals(this.mandateIdentification, obReadDirectDebit2DataDirectDebit.mandateIdentification) &&
                Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebit.directDebitStatusCode) &&
                Objects.equals(this.name, obReadDirectDebit2DataDirectDebit.name) &&
                Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebit.previousPaymentDateTime) &&
                Objects.equals(this.frequency, obReadDirectDebit2DataDirectDebit.frequency) &&
                Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebit.previousPaymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, frequency, previousPaymentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDirectDebit2DataDirectDebit {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
        sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
        sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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

