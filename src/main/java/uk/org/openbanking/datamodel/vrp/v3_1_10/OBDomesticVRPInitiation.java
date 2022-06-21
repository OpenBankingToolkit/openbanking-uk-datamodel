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
import uk.org.openbanking.datamodel.vrp.OBCashAccountCreditor3;
import uk.org.openbanking.datamodel.vrp.OBCashAccountDebtorWithName;
import uk.org.openbanking.datamodel.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.vrp.OBPostalAddress6;

import javax.validation.Valid;
import java.util.Objects;

/**
 * OBDomesticVRPInitiation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-21T08:45:28.716207+01:00[Europe/London]")
public class OBDomesticVRPInitiation {
    @JsonProperty("DebtorAccount")
    private OBCashAccountDebtorWithName debtorAccount;

    @JsonProperty("CreditorAccount")
    private OBCashAccountCreditor3 creditorAccount;

    @JsonProperty("CreditorPostalAddress")
    private OBPostalAddress6 creditorPostalAddress;

    @JsonProperty("RemittanceInformation")
    private OBDomesticVRPInitiationRemittanceInformation remittanceInformation;

    public OBDomesticVRPInitiation debtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     * @return debtorAccount
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccountDebtorWithName getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccountDebtorWithName debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBDomesticVRPInitiation creditorAccount(OBCashAccountCreditor3 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     * @return creditorAccount
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBCashAccountCreditor3 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccountCreditor3 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBDomesticVRPInitiation creditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
        this.creditorPostalAddress = creditorPostalAddress;
        return this;
    }

    /**
     * Get creditorPostalAddress
     * @return creditorPostalAddress
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBPostalAddress6 getCreditorPostalAddress() {
        return creditorPostalAddress;
    }

    public void setCreditorPostalAddress(OBPostalAddress6 creditorPostalAddress) {
        this.creditorPostalAddress = creditorPostalAddress;
    }

    public OBDomesticVRPInitiation remittanceInformation(OBDomesticVRPInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     * @return remittanceInformation
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBDomesticVRPInitiationRemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBDomesticVRPInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPInitiation obDomesticVRPInitiation = (OBDomesticVRPInitiation) o;
        return Objects.equals(this.debtorAccount, obDomesticVRPInitiation.debtorAccount) &&
                Objects.equals(this.creditorAccount, obDomesticVRPInitiation.creditorAccount) &&
                Objects.equals(this.creditorPostalAddress, obDomesticVRPInitiation.creditorPostalAddress) &&
                Objects.equals(this.remittanceInformation, obDomesticVRPInitiation.remittanceInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtorAccount, creditorAccount, creditorPostalAddress, remittanceInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPInitiation {\n");

        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    creditorPostalAddress: ").append(toIndentedString(creditorPostalAddress)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

