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
 * OpenAPI spec version: v3.1.2-RC1
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
import java.util.Objects;

/**
 * Account to or from which a cash entry is made.
 */
@ApiModel(description = "Account to or from which a cash entry is made.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBReadDirectDebit1DataDirectDebit {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("DirectDebitId")
    private String directDebitId = null;

    @JsonProperty("MandateIdentification")
    private String mandateIdentification = null;
    @JsonProperty("DirectDebitStatusCode")
    private DirectDebitStatusCodeEnum directDebitStatusCode = null;
    @JsonProperty("Name")
    private String name = null;
    @JsonProperty("PreviousPaymentDateTime")
    private String previousPaymentDateTime = null;
    @JsonProperty("PreviousPaymentAmount")
    private OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount = null;

    public OBReadDirectDebit1DataDirectDebit accountId(String accountId) {
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

    public OBReadDirectDebit1DataDirectDebit directDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
     *
     * @return directDebitId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
    public String getDirectDebitId() {
        return directDebitId;
    }

    public void setDirectDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
    }

    public OBReadDirectDebit1DataDirectDebit mandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
        return this;
    }

    /**
     * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
     *
     * @return mandateIdentification
     **/
    @NotNull
    @Size(min = 1, max = 35)
    @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
    public String getMandateIdentification() {
        return mandateIdentification;
    }

    public void setMandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
    }

    public OBReadDirectDebit1DataDirectDebit directDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
        return this;
    }

    /**
     * Specifies the status of the direct debit in code form.
     *
     * @return directDebitStatusCode
     **/
    @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")
    public DirectDebitStatusCodeEnum getDirectDebitStatusCode() {
        return directDebitStatusCode;
    }

    public void setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
    }

    public OBReadDirectDebit1DataDirectDebit name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of Service User.
     *
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "Name of Service User.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadDirectDebit1DataDirectDebit previousPaymentDateTime(String previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
        return this;
    }

    /**
     * Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return previousPaymentDateTime
     **/
    @ApiModelProperty(value = "Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getPreviousPaymentDateTime() {
        return previousPaymentDateTime;
    }

    public void setPreviousPaymentDateTime(String previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
    }

    public OBReadDirectDebit1DataDirectDebit previousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
        this.previousPaymentAmount = previousPaymentAmount;
        return this;
    }

    /**
     * Get previousPaymentAmount
     *
     * @return previousPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBReadDirectDebit1DataPreviousPaymentAmount getPreviousPaymentAmount() {
        return previousPaymentAmount;
    }

    public void setPreviousPaymentAmount(OBReadDirectDebit1DataPreviousPaymentAmount previousPaymentAmount) {
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
        OBReadDirectDebit1DataDirectDebit obReadDirectDebit1DataDirectDebit = (OBReadDirectDebit1DataDirectDebit) o;
        return Objects.equals(this.accountId, obReadDirectDebit1DataDirectDebit.accountId) &&
                Objects.equals(this.directDebitId, obReadDirectDebit1DataDirectDebit.directDebitId) &&
                Objects.equals(this.mandateIdentification, obReadDirectDebit1DataDirectDebit.mandateIdentification) &&
                Objects.equals(this.directDebitStatusCode, obReadDirectDebit1DataDirectDebit.directDebitStatusCode) &&
                Objects.equals(this.name, obReadDirectDebit1DataDirectDebit.name) &&
                Objects.equals(this.previousPaymentDateTime, obReadDirectDebit1DataDirectDebit.previousPaymentDateTime) &&
                Objects.equals(this.previousPaymentAmount, obReadDirectDebit1DataDirectDebit.previousPaymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, previousPaymentAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDirectDebit1DataDirectDebit {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
        sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
        sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
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

    /**
     * Specifies the status of the direct debit in code form.
     */
    public enum DirectDebitStatusCodeEnum {
        ACTIVE("Active"),

        INACTIVE("Inactive");

        private String value;

        DirectDebitStatusCodeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static DirectDebitStatusCodeEnum fromValue(String text) {
            for (DirectDebitStatusCodeEnum b : DirectDebitStatusCodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

