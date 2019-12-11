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
import uk.org.openbanking.datamodel.account.OBCashAccount3;

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
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:15:38.268Z")

public class OBFile2   {
  @JsonProperty("FileType")
  private String fileType = null;

  @JsonProperty("FileHash")
  private String fileHash = null;

  @JsonProperty("FileReference")
  private String fileReference = null;

  @JsonProperty("NumberOfTransactions")
  private String numberOfTransactions = null;

  @JsonProperty("ControlSum")
  private BigDecimal controlSum = null;

  @JsonProperty("RequestedExecutionDateTime")
  private DateTime requestedExecutionDateTime = null;

  @JsonProperty("LocalInstrument")
  private String localInstrument = null;

  @JsonProperty("DebtorAccount")
  private OBCashAccount3 debtorAccount = null;

  @JsonProperty("RemittanceInformation")
  private OBRemittanceInformation1 remittanceInformation = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBFile2 fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * Get fileType
   * @return fileType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public OBFile2 fileHash(String fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  /**
   * A base64 encoding of a SHA256 hash of the file to be uploaded.
   * @return fileHash
  **/
  @ApiModelProperty(required = true, value = "A base64 encoding of a SHA256 hash of the file to be uploaded.")
  @NotNull

@Size(min=1,max=44) 
  public String getFileHash() {
    return fileHash;
  }

  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }

  public OBFile2 fileReference(String fileReference) {
    this.fileReference = fileReference;
    return this;
  }

  /**
   * Reference for the file.
   * @return fileReference
  **/
  @ApiModelProperty(value = "Reference for the file.")

@Size(min=1,max=40) 
  public String getFileReference() {
    return fileReference;
  }

  public void setFileReference(String fileReference) {
    this.fileReference = fileReference;
  }

  public OBFile2 numberOfTransactions(String numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

  /**
   * Number of individual transactions contained in the payment information group.
   * @return numberOfTransactions
  **/
  @ApiModelProperty(value = "Number of individual transactions contained in the payment information group.")

@Pattern(regexp="[0-9]{1,15}") @Size(min=1,max=15) 
  public String getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(String numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  public OBFile2 controlSum(BigDecimal controlSum) {
    this.controlSum = controlSum;
    return this;
  }

  /**
   * Total of all individual amounts included in the group, irrespective of currencies.
   * @return controlSum
  **/
  @ApiModelProperty(value = "Total of all individual amounts included in the group, irrespective of currencies.")

  @Valid

  public BigDecimal getControlSum() {
    return controlSum;
  }

  public void setControlSum(BigDecimal controlSum) {
    this.controlSum = controlSum;
  }

  public OBFile2 requestedExecutionDateTime(DateTime requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
    return this;
  }

  /**
   * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return requestedExecutionDateTime
  **/
  @ApiModelProperty(value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  @Valid

  public DateTime getRequestedExecutionDateTime() {
    return requestedExecutionDateTime;
  }

  public void setRequestedExecutionDateTime(DateTime requestedExecutionDateTime) {
    this.requestedExecutionDateTime = requestedExecutionDateTime;
  }

  public OBFile2 localInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

  /**
   * Get localInstrument
   * @return localInstrument
  **/
  @ApiModelProperty(value = "")


  public String getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(String localInstrument) {
    this.localInstrument = localInstrument;
  }

  public OBFile2 debtorAccount(OBCashAccount3 debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBCashAccount3 getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(OBCashAccount3 debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public OBFile2 remittanceInformation(OBRemittanceInformation1 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

  /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBRemittanceInformation1 getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(OBRemittanceInformation1 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public OBFile2 supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
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
    OBFile2 obFile2 = (OBFile2) o;
    return Objects.equals(this.fileType, obFile2.fileType) &&
        Objects.equals(this.fileHash, obFile2.fileHash) &&
        Objects.equals(this.fileReference, obFile2.fileReference) &&
        Objects.equals(this.numberOfTransactions, obFile2.numberOfTransactions) &&
        Objects.equals(this.controlSum, obFile2.controlSum) &&
        Objects.equals(this.requestedExecutionDateTime, obFile2.requestedExecutionDateTime) &&
        Objects.equals(this.localInstrument, obFile2.localInstrument) &&
        Objects.equals(this.debtorAccount, obFile2.debtorAccount) &&
        Objects.equals(this.remittanceInformation, obFile2.remittanceInformation) &&
        Objects.equals(this.supplementaryData, obFile2.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileType, fileHash, fileReference, numberOfTransactions, controlSum, requestedExecutionDateTime, localInstrument, debtorAccount, remittanceInformation, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFile2 {\n");

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

