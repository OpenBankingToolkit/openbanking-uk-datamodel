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
import java.math.BigDecimal;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWriteFile2DataInitiation {
    @JsonProperty("FileType")
    private String fileType;

    @JsonProperty("FileHash")
    private String fileHash;

    @JsonProperty("FileReference")
    private String fileReference;

    @JsonProperty("NumberOfTransactions")
    private String numberOfTransactions;

    @JsonProperty("ControlSum")
    private BigDecimal controlSum;

    @JsonProperty("RequestedExecutionDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime requestedExecutionDateTime;

    @JsonProperty("LocalInstrument")
    private String localInstrument;

    @JsonProperty("DebtorAccount")
    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    @JsonProperty("RemittanceInformation")
    private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation;

    @JsonProperty("SupplementaryData")
    @Valid
    private OBSupplementaryData1 supplementaryData = null;

    public OBWriteFile2DataInitiation fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Specifies the payment file type.
     *
     * @return fileType
     */
    @ApiModelProperty(required = true, value = "Specifies the payment file type.")
    @NotNull
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public OBWriteFile2DataInitiation fileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * A base64 encoding of a SHA256 hash of the file to be uploaded.
     *
     * @return fileHash
     */
    @ApiModelProperty(required = true, value = "A base64 encoding of a SHA256 hash of the file to be uploaded.")
    @NotNull
    @Size(min = 1, max = 44)
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public OBWriteFile2DataInitiation fileReference(String fileReference) {
        this.fileReference = fileReference;
        return this;
    }

    /**
     * Reference for the file.
     *
     * @return fileReference
     */
    @ApiModelProperty(value = "Reference for the file.")
    @Size(min = 1, max = 40)
    public String getFileReference() {
        return fileReference;
    }

    public void setFileReference(String fileReference) {
        this.fileReference = fileReference;
    }

    public OBWriteFile2DataInitiation numberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
        return this;
    }

    /**
     * Number of individual transactions contained in the payment information group.
     *
     * @return numberOfTransactions
     */
    @ApiModelProperty(value = "Number of individual transactions contained in the payment information group.")
    @Pattern(regexp = "[0-9]{1,15}")
    public String getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(String numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public OBWriteFile2DataInitiation controlSum(BigDecimal controlSum) {
        this.controlSum = controlSum;
        return this;
    }

    /**
     * Total of all individual amounts included in the group, irrespective of currencies.
     *
     * @return controlSum
     */
    @ApiModelProperty(value = "Total of all individual amounts included in the group, irrespective of currencies.")
    @Valid
    public BigDecimal getControlSum() {
        return controlSum;
    }

    public void setControlSum(BigDecimal controlSum) {
        this.controlSum = controlSum;
    }

    public OBWriteFile2DataInitiation requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     */
    @ApiModelProperty(value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @Valid
    public DateTime getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteFile2DataInitiation localInstrument(String localInstrument) {
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

    public OBWriteFile2DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
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

    public OBWriteFile2DataInitiation remittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
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

    public OBWriteFile2DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBWriteFile2DataInitiation obWriteFile2DataInitiation = (OBWriteFile2DataInitiation) o;
        return Objects.equals(this.fileType, obWriteFile2DataInitiation.fileType) &&
                Objects.equals(this.fileHash, obWriteFile2DataInitiation.fileHash) &&
                Objects.equals(this.fileReference, obWriteFile2DataInitiation.fileReference) &&
                Objects.equals(this.numberOfTransactions, obWriteFile2DataInitiation.numberOfTransactions) &&
                Objects.equals(this.controlSum, obWriteFile2DataInitiation.controlSum) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteFile2DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.localInstrument, obWriteFile2DataInitiation.localInstrument) &&
                Objects.equals(this.debtorAccount, obWriteFile2DataInitiation.debtorAccount) &&
                Objects.equals(this.remittanceInformation, obWriteFile2DataInitiation.remittanceInformation) &&
                Objects.equals(this.supplementaryData, obWriteFile2DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, fileHash, fileReference, numberOfTransactions, controlSum, requestedExecutionDateTime, localInstrument, debtorAccount, remittanceInformation, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteFile2DataInitiation {\n");

        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
        sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
        sb.append("    controlSum: ").append(toIndentedString(controlSum)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

