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
package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBFundsConfirmation1Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-18T09:57:44.731259Z[Europe/London]")
public class OBFundsConfirmation1Data {
    @JsonProperty("ConsentId")
    private String consentId;

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("InstructedAmount")
    private OBFundsConfirmation1DataInstructedAmount instructedAmount;

    public OBFundsConfirmation1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
     *
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

    public OBFundsConfirmation1Data reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
     *
     * @return reference
     */
    @ApiModelProperty(required = true, value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
    @NotNull

    @Size(min = 1, max = 35)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBFundsConfirmation1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
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

    public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
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
        OBFundsConfirmation1Data obFundsConfirmation1Data = (OBFundsConfirmation1Data) o;
        return Objects.equals(this.consentId, obFundsConfirmation1Data.consentId) &&
                Objects.equals(this.reference, obFundsConfirmation1Data.reference) &&
                Objects.equals(this.instructedAmount, obFundsConfirmation1Data.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, reference, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmation1Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

