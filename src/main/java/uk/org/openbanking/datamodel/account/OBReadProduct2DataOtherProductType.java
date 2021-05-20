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

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

/**
 * Other product type details associated with the account.
 */
@ApiModel(description = "Other product type details associated with the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductType {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ProductDetails")
    private OBReadProduct2DataOtherProductTypeProductDetails productDetails;

    @JsonProperty("CreditInterest")
    private OBReadProduct2DataOtherProductTypeCreditInterest creditInterest;

    @JsonProperty("Overdraft")
    private OBReadProduct2DataOtherProductTypeOverdraft overdraft;

    @JsonProperty("LoanInterest")
    private OBReadProduct2DataOtherProductTypeLoanInterest loanInterest;

    @JsonProperty("Repayment")
    private OBReadProduct2DataOtherProductTypeRepayment repayment;

    @JsonProperty("OtherFeesCharges")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges = null;

    @JsonProperty("SupplementaryData")
    @Valid
    private OBSupplementaryData1 supplementaryData = null;

    public OBReadProduct2DataOtherProductType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the product
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "Long name associated with the product")
    @NotNull
    @Size(min = 1, max = 350)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadProduct2DataOtherProductType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the Product associated with the account
     *
     * @return description
     */
    @ApiModelProperty(required = true, value = "Description of the Product associated with the account")
    @NotNull
    @Size(min = 1, max = 350)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBReadProduct2DataOtherProductType productDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * Get productDetails
     *
     * @return productDetails
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public OBReadProduct2DataOtherProductType creditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
        return this;
    }

    /**
     * Get creditInterest
     *
     * @return creditInterest
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeCreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    public OBReadProduct2DataOtherProductType overdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
        return this;
    }

    /**
     * Get overdraft
     *
     * @return overdraft
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeOverdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
    }

    public OBReadProduct2DataOtherProductType loanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
        return this;
    }

    /**
     * Get loanInterest
     *
     * @return loanInterest
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeLoanInterest getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
    }

    public OBReadProduct2DataOtherProductType repayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
        return this;
    }

    /**
     * Get repayment
     *
     * @return repayment
     */
    @ApiModelProperty(value = "")
    @Valid
    public OBReadProduct2DataOtherProductTypeRepayment getRepayment() {
        return repayment;
    }

    public void setRepayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
    }

    public OBReadProduct2DataOtherProductType otherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductType addOtherFeesChargesItem(OBReadProduct2DataOtherProductTypeOtherFeesCharges otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeOtherFeesCharges>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Get otherFeesCharges
     *
     * @return otherFeesCharges
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    public OBReadProduct2DataOtherProductType supplementaryData(OBSupplementaryData1 supplementaryData) {
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
        OBReadProduct2DataOtherProductType obReadProduct2DataOtherProductType = (OBReadProduct2DataOtherProductType) o;
        return Objects.equals(this.name, obReadProduct2DataOtherProductType.name) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductType.description) &&
                Objects.equals(this.productDetails, obReadProduct2DataOtherProductType.productDetails) &&
                Objects.equals(this.creditInterest, obReadProduct2DataOtherProductType.creditInterest) &&
                Objects.equals(this.overdraft, obReadProduct2DataOtherProductType.overdraft) &&
                Objects.equals(this.loanInterest, obReadProduct2DataOtherProductType.loanInterest) &&
                Objects.equals(this.repayment, obReadProduct2DataOtherProductType.repayment) &&
                Objects.equals(this.otherFeesCharges, obReadProduct2DataOtherProductType.otherFeesCharges) &&
                Objects.equals(this.supplementaryData, obReadProduct2DataOtherProductType.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, productDetails, creditInterest, overdraft, loanInterest, repayment, otherFeesCharges, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductType {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
        sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

