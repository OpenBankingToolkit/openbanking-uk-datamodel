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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBBCAData1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBBCAData1 {
    @JsonProperty("ProductDetails")
    private ProductDetails productDetails;

    @JsonProperty("CreditInterest")
    private CreditInterest creditInterest;

    @JsonProperty("Overdraft")
    private Overdraft overdraft;

    @JsonProperty("OtherFeesCharges")
    @Valid
    private List<OBBCAData1OtherFeesCharges> otherFeesCharges = null;

    public OBBCAData1 productDetails(ProductDetails productDetails) {
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
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public OBBCAData1 creditInterest(CreditInterest creditInterest) {
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
    public CreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(CreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    public OBBCAData1 overdraft(Overdraft overdraft) {
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
    public Overdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft overdraft) {
        this.overdraft = overdraft;
    }

    public OBBCAData1 otherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public OBBCAData1 addOtherFeesChargesItem(OBBCAData1OtherFeesCharges otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<OBBCAData1OtherFeesCharges>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
     *
     * @return otherFeesCharges
     */
    @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
    @Valid
    public List<OBBCAData1OtherFeesCharges> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<OBBCAData1OtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBCAData1 obBCAData1 = (OBBCAData1) o;
        return Objects.equals(this.productDetails, obBCAData1.productDetails) &&
                Objects.equals(this.creditInterest, obBCAData1.creditInterest) &&
                Objects.equals(this.overdraft, obBCAData1.overdraft) &&
                Objects.equals(this.otherFeesCharges, obBCAData1.otherFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBCAData1 {\n");

        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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

