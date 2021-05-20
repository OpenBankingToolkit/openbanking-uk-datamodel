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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on a statement resource.
 */
@ApiModel(description = "Provides further details on a statement resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBStatement2 {
    @JsonProperty("AccountId")
    private String accountId;

    @JsonProperty("StatementId")
    private String statementId;

    @JsonProperty("StatementReference")
    private String statementReference;

    @JsonProperty("Type")
    private OBExternalStatementType1Code type;

    @JsonProperty("StartDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime startDateTime;

    @JsonProperty("EndDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime endDateTime;

    @JsonProperty("CreationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    @JsonProperty("StatementDescription")
    @Valid
    private List<String> statementDescription = null;

    @JsonProperty("StatementBenefit")
    @Valid
    private List<OBStatement2StatementBenefit> statementBenefit = null;

    @JsonProperty("StatementFee")
    @Valid
    private List<OBStatement2StatementFee> statementFee = null;

    @JsonProperty("StatementInterest")
    @Valid
    private List<OBStatement2StatementInterest> statementInterest = null;

    @JsonProperty("StatementAmount")
    @Valid
    private List<OBStatement2StatementAmount> statementAmount = null;

    @JsonProperty("StatementDateTime")
    @Valid
    private List<OBStatement2StatementDateTime> statementDateTime = null;

    @JsonProperty("StatementRate")
    @Valid
    private List<OBStatement2StatementRate> statementRate = null;

    @JsonProperty("StatementValue")
    @Valid
    private List<OBStatement2StatementValue> statementValue = null;

    public OBStatement2 accountId(String accountId) {
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

    public OBStatement2 statementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
     *
     * @return statementId
     */
    @ApiModelProperty(value = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.")
    @Size(min = 1, max = 40)
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public OBStatement2 statementReference(String statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    /**
     * Unique reference for the statement. This reference may be optionally populated if available.
     *
     * @return statementReference
     */
    @ApiModelProperty(value = "Unique reference for the statement. This reference may be optionally populated if available.")
    @Size(min = 1, max = 35)
    public String getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(String statementReference) {
        this.statementReference = statementReference;
    }

    public OBStatement2 type(OBExternalStatementType1Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBExternalStatementType1Code getType() {
        return type;
    }

    public void setType(OBExternalStatementType1Code type) {
        this.type = type;
    }

    public OBStatement2 startDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return startDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    @Valid
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public OBStatement2 endDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return endDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    @Valid
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public OBStatement2 creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    @Valid
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBStatement2 statementDescription(List<String> statementDescription) {
        this.statementDescription = statementDescription;
        return this;
    }

    public OBStatement2 addStatementDescriptionItem(String statementDescriptionItem) {
        if (this.statementDescription == null) {
            this.statementDescription = new ArrayList<String>();
        }
        this.statementDescription.add(statementDescriptionItem);
        return this;
    }

    /**
     * Get statementDescription
     *
     * @return statementDescription
     */
    @ApiModelProperty(value = "")
    public List<String> getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(List<String> statementDescription) {
        this.statementDescription = statementDescription;
    }

    public OBStatement2 statementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
        this.statementBenefit = statementBenefit;
        return this;
    }

    public OBStatement2 addStatementBenefitItem(OBStatement2StatementBenefit statementBenefitItem) {
        if (this.statementBenefit == null) {
            this.statementBenefit = new ArrayList<OBStatement2StatementBenefit>();
        }
        this.statementBenefit.add(statementBenefitItem);
        return this;
    }

    /**
     * Get statementBenefit
     *
     * @return statementBenefit
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementBenefit> getStatementBenefit() {
        return statementBenefit;
    }

    public void setStatementBenefit(List<OBStatement2StatementBenefit> statementBenefit) {
        this.statementBenefit = statementBenefit;
    }

    public OBStatement2 statementFee(List<OBStatement2StatementFee> statementFee) {
        this.statementFee = statementFee;
        return this;
    }

    public OBStatement2 addStatementFeeItem(OBStatement2StatementFee statementFeeItem) {
        if (this.statementFee == null) {
            this.statementFee = new ArrayList<OBStatement2StatementFee>();
        }
        this.statementFee.add(statementFeeItem);
        return this;
    }

    /**
     * Get statementFee
     *
     * @return statementFee
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementFee> getStatementFee() {
        return statementFee;
    }

    public void setStatementFee(List<OBStatement2StatementFee> statementFee) {
        this.statementFee = statementFee;
    }

    public OBStatement2 statementInterest(List<OBStatement2StatementInterest> statementInterest) {
        this.statementInterest = statementInterest;
        return this;
    }

    public OBStatement2 addStatementInterestItem(OBStatement2StatementInterest statementInterestItem) {
        if (this.statementInterest == null) {
            this.statementInterest = new ArrayList<OBStatement2StatementInterest>();
        }
        this.statementInterest.add(statementInterestItem);
        return this;
    }

    /**
     * Get statementInterest
     *
     * @return statementInterest
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementInterest> getStatementInterest() {
        return statementInterest;
    }

    public void setStatementInterest(List<OBStatement2StatementInterest> statementInterest) {
        this.statementInterest = statementInterest;
    }

    public OBStatement2 statementAmount(List<OBStatement2StatementAmount> statementAmount) {
        this.statementAmount = statementAmount;
        return this;
    }

    public OBStatement2 addStatementAmountItem(OBStatement2StatementAmount statementAmountItem) {
        if (this.statementAmount == null) {
            this.statementAmount = new ArrayList<OBStatement2StatementAmount>();
        }
        this.statementAmount.add(statementAmountItem);
        return this;
    }

    /**
     * Get statementAmount
     *
     * @return statementAmount
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementAmount> getStatementAmount() {
        return statementAmount;
    }

    public void setStatementAmount(List<OBStatement2StatementAmount> statementAmount) {
        this.statementAmount = statementAmount;
    }

    public OBStatement2 statementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
        this.statementDateTime = statementDateTime;
        return this;
    }

    public OBStatement2 addStatementDateTimeItem(OBStatement2StatementDateTime statementDateTimeItem) {
        if (this.statementDateTime == null) {
            this.statementDateTime = new ArrayList<OBStatement2StatementDateTime>();
        }
        this.statementDateTime.add(statementDateTimeItem);
        return this;
    }

    /**
     * Get statementDateTime
     *
     * @return statementDateTime
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementDateTime> getStatementDateTime() {
        return statementDateTime;
    }

    public void setStatementDateTime(List<OBStatement2StatementDateTime> statementDateTime) {
        this.statementDateTime = statementDateTime;
    }

    public OBStatement2 statementRate(List<OBStatement2StatementRate> statementRate) {
        this.statementRate = statementRate;
        return this;
    }

    public OBStatement2 addStatementRateItem(OBStatement2StatementRate statementRateItem) {
        if (this.statementRate == null) {
            this.statementRate = new ArrayList<OBStatement2StatementRate>();
        }
        this.statementRate.add(statementRateItem);
        return this;
    }

    /**
     * Get statementRate
     *
     * @return statementRate
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementRate> getStatementRate() {
        return statementRate;
    }

    public void setStatementRate(List<OBStatement2StatementRate> statementRate) {
        this.statementRate = statementRate;
    }

    public OBStatement2 statementValue(List<OBStatement2StatementValue> statementValue) {
        this.statementValue = statementValue;
        return this;
    }

    public OBStatement2 addStatementValueItem(OBStatement2StatementValue statementValueItem) {
        if (this.statementValue == null) {
            this.statementValue = new ArrayList<OBStatement2StatementValue>();
        }
        this.statementValue.add(statementValueItem);
        return this;
    }

    /**
     * Get statementValue
     *
     * @return statementValue
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBStatement2StatementValue> getStatementValue() {
        return statementValue;
    }

    public void setStatementValue(List<OBStatement2StatementValue> statementValue) {
        this.statementValue = statementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2 obStatement2 = (OBStatement2) o;
        return Objects.equals(this.accountId, obStatement2.accountId) &&
                Objects.equals(this.statementId, obStatement2.statementId) &&
                Objects.equals(this.statementReference, obStatement2.statementReference) &&
                Objects.equals(this.type, obStatement2.type) &&
                Objects.equals(this.startDateTime, obStatement2.startDateTime) &&
                Objects.equals(this.endDateTime, obStatement2.endDateTime) &&
                Objects.equals(this.creationDateTime, obStatement2.creationDateTime) &&
                Objects.equals(this.statementDescription, obStatement2.statementDescription) &&
                Objects.equals(this.statementBenefit, obStatement2.statementBenefit) &&
                Objects.equals(this.statementFee, obStatement2.statementFee) &&
                Objects.equals(this.statementInterest, obStatement2.statementInterest) &&
                Objects.equals(this.statementAmount, obStatement2.statementAmount) &&
                Objects.equals(this.statementDateTime, obStatement2.statementDateTime) &&
                Objects.equals(this.statementRate, obStatement2.statementRate) &&
                Objects.equals(this.statementValue, obStatement2.statementValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementAmount, statementDateTime, statementRate, statementValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
        sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
        sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
        sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
        sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
        sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
        sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
        sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
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

