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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges {
    @JsonProperty("LoanInterestFeeChargeDetail")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail>();

    @JsonProperty("LoanInterestFeeChargeCap")
    @Valid
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail loanInterestFeeChargeDetailItem) {
        this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeDetail
     *
     * @return loanInterestFeeChargeDetail
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
        return loanInterestFeeChargeDetail;
    }

    public void setLoanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeCapItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap loanInterestFeeChargeCapItem) {
        if (this.loanInterestFeeChargeCap == null) {
            this.loanInterestFeeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap>();
        }
        this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeCap
     *
     * @return loanInterestFeeChargeCap
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
        return loanInterestFeeChargeCap;
    }

    public void setLoanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges) o;
        return Objects.equals(this.loanInterestFeeChargeDetail, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges.loanInterestFeeChargeDetail) &&
                Objects.equals(this.loanInterestFeeChargeCap, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges.loanInterestFeeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges {\n");

        sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
        sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

