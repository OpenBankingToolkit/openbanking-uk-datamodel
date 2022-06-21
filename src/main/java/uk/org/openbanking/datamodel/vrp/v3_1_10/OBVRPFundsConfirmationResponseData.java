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
package uk.org.openbanking.datamodel.vrp.v3_1_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.vrp.OBActiveOrHistoricCurrencyAndAmount;
import uk.org.openbanking.datamodel.vrp.OBPAFundsAvailableResult1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBVRPFundsConfirmationResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T08:45:28.716207+01:00[Europe/London]")
public class OBVRPFundsConfirmationResponseData {
    @JsonProperty("FundsConfirmationId")
    private String fundsConfirmationId;

    @JsonProperty("ConsentId")
    private String consentId;

    @JsonProperty("CreationDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("FundsAvailableResult")
    private OBPAFundsAvailableResult1 fundsAvailableResult;

    @JsonProperty("InstructedAmount")
    private OBActiveOrHistoricCurrencyAndAmount instructedAmount;

    public OBVRPFundsConfirmationResponseData fundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
     * @return fundsConfirmationId
     */
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
    @NotNull

    @Size(min = 1, max = 40)
    public String getFundsConfirmationId() {
        return fundsConfirmationId;
    }

    public void setFundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
    }

    public OBVRPFundsConfirmationResponseData consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
     * @return consentId
     */
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    @NotNull

    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBVRPFundsConfirmationResponseData creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.
     * @return creationDateTime
     */
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.")
    @NotNull

    @Valid

    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBVRPFundsConfirmationResponseData reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
     * @return reference
     */
    @ApiModelProperty(value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")

    @Size(min = 1, max = 35)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBVRPFundsConfirmationResponseData fundsAvailableResult(OBPAFundsAvailableResult1 fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
        return this;
    }

    /**
     * Get fundsAvailableResult
     * @return fundsAvailableResult
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBPAFundsAvailableResult1 getFundsAvailableResult() {
        return fundsAvailableResult;
    }

    public void setFundsAvailableResult(OBPAFundsAvailableResult1 fundsAvailableResult) {
        this.fundsAvailableResult = fundsAvailableResult;
    }

    public OBVRPFundsConfirmationResponseData instructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     * @return instructedAmount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBVRPFundsConfirmationResponseData obVRPFundsConfirmationResponseData = (OBVRPFundsConfirmationResponseData) o;
        return Objects.equals(this.fundsConfirmationId, obVRPFundsConfirmationResponseData.fundsConfirmationId) &&
                Objects.equals(this.consentId, obVRPFundsConfirmationResponseData.consentId) &&
                Objects.equals(this.creationDateTime, obVRPFundsConfirmationResponseData.creationDateTime) &&
                Objects.equals(this.reference, obVRPFundsConfirmationResponseData.reference) &&
                Objects.equals(this.fundsAvailableResult, obVRPFundsConfirmationResponseData.fundsAvailableResult) &&
                Objects.equals(this.instructedAmount, obVRPFundsConfirmationResponseData.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsConfirmationId, consentId, creationDateTime, reference, fundsAvailableResult, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBVRPFundsConfirmationResponseData {\n");

        sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    fundsAvailableResult: ").append(toIndentedString(fundsAvailableResult)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

