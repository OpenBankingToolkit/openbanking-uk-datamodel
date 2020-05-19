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
 * OpenAPI spec version: v3.1.4
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBStandingOrder6
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:30:07.421+01:00")
public class OBStandingOrder6 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("StandingOrderId")
    private String standingOrderId = null;

    @JsonProperty("Frequency")
    private String frequency = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("FirstPaymentDateTime")
    private String firstPaymentDateTime = null;

    @JsonProperty("NextPaymentDateTime")
    private String nextPaymentDateTime = null;

    @JsonProperty("LastPaymentDateTime")
    private String lastPaymentDateTime = null;

    @JsonProperty("FinalPaymentDateTime")
    private String finalPaymentDateTime = null;

    @JsonProperty("NumberOfPayments")
    private String numberOfPayments = null;

    @JsonProperty("StandingOrderStatusCode")
    private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

    @JsonProperty("FirstPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount = null;

    @JsonProperty("NextPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount = null;

    @JsonProperty("LastPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount = null;

    @JsonProperty("FinalPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount51 creditorAccount = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBStandingOrder6 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBStandingOrder6 standingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
        return this;
    }

    /**
     * Get standingOrderId
     *
     * @return standingOrderId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getStandingOrderId() {
        return standingOrderId;
    }

    public void setStandingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
    }

    public OBStandingOrder6 frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     **/
    @NotNull
    @Pattern(regexp = "^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    @ApiModelProperty(required = true, value = "")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStandingOrder6 reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBStandingOrder6 firstPaymentDateTime(String firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * Get firstPaymentDateTime
     *
     * @return firstPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(String firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBStandingOrder6 nextPaymentDateTime(String nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
        return this;
    }

    /**
     * Get nextPaymentDateTime
     *
     * @return nextPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getNextPaymentDateTime() {
        return nextPaymentDateTime;
    }

    public void setNextPaymentDateTime(String nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
    }

    public OBStandingOrder6 lastPaymentDateTime(String lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
        return this;
    }

    /**
     * Get lastPaymentDateTime
     *
     * @return lastPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getLastPaymentDateTime() {
        return lastPaymentDateTime;
    }

    public void setLastPaymentDateTime(String lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
    }

    public OBStandingOrder6 finalPaymentDateTime(String finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * Get finalPaymentDateTime
     *
     * @return finalPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public String getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(String finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBStandingOrder6 numberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Get numberOfPayments
     *
     * @return numberOfPayments
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public OBStandingOrder6 standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
        return this;
    }

    /**
     * Get standingOrderStatusCode
     *
     * @return standingOrderStatusCode
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
        return standingOrderStatusCode;
    }

    public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
    }

    public OBStandingOrder6 firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBStandingOrder6 nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
        return this;
    }

    /**
     * Get nextPaymentAmount
     *
     * @return nextPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
    }

    public OBStandingOrder6 lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
        return this;
    }

    /**
     * Get lastPaymentAmount
     *
     * @return lastPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    public OBStandingOrder6 finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBStandingOrder6 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBStandingOrder6 creditorAccount(OBCashAccount51 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCashAccount51 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount51 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBStandingOrder6 supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStandingOrder6 obStandingOrder6 = (OBStandingOrder6) o;
        return Objects.equals(this.accountId, obStandingOrder6.accountId) &&
                Objects.equals(this.standingOrderId, obStandingOrder6.standingOrderId) &&
                Objects.equals(this.frequency, obStandingOrder6.frequency) &&
                Objects.equals(this.reference, obStandingOrder6.reference) &&
                Objects.equals(this.firstPaymentDateTime, obStandingOrder6.firstPaymentDateTime) &&
                Objects.equals(this.nextPaymentDateTime, obStandingOrder6.nextPaymentDateTime) &&
                Objects.equals(this.lastPaymentDateTime, obStandingOrder6.lastPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obStandingOrder6.finalPaymentDateTime) &&
                Objects.equals(this.numberOfPayments, obStandingOrder6.numberOfPayments) &&
                Objects.equals(this.standingOrderStatusCode, obStandingOrder6.standingOrderStatusCode) &&
                Objects.equals(this.firstPaymentAmount, obStandingOrder6.firstPaymentAmount) &&
                Objects.equals(this.nextPaymentAmount, obStandingOrder6.nextPaymentAmount) &&
                Objects.equals(this.lastPaymentAmount, obStandingOrder6.lastPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obStandingOrder6.finalPaymentAmount) &&
                Objects.equals(this.creditorAgent, obStandingOrder6.creditorAgent) &&
                Objects.equals(this.creditorAccount, obStandingOrder6.creditorAccount) &&
                Objects.equals(this.supplementaryData, obStandingOrder6.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, lastPaymentDateTime, finalPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder6 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
        sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
        sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
        sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
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
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

