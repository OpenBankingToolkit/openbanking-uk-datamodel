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
package uk.org.openbanking.datamodel.vrp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBDomesticVRPDetailsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-21T09:44:44.818881+01:00[Europe/London]")

public class OBDomesticVRPDetailsData {
    @JsonProperty("PaymentStatus")
    @Valid
    private List<OBDomesticVRPDetailsDataPaymentStatus> paymentStatus = null;

    public OBDomesticVRPDetailsData paymentStatus(List<OBDomesticVRPDetailsDataPaymentStatus> paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public OBDomesticVRPDetailsData addPaymentStatusItem(OBDomesticVRPDetailsDataPaymentStatus paymentStatusItem) {
        if (this.paymentStatus == null) {
            this.paymentStatus = new ArrayList<OBDomesticVRPDetailsDataPaymentStatus>();
        }
        this.paymentStatus.add(paymentStatusItem);
        return this;
    }

    /**
     * Get paymentStatus
     *
     * @return paymentStatus
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<OBDomesticVRPDetailsDataPaymentStatus> getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(List<OBDomesticVRPDetailsDataPaymentStatus> paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPDetailsData obDomesticVRPDetailsData = (OBDomesticVRPDetailsData) o;
        return Objects.equals(this.paymentStatus, obDomesticVRPDetailsData.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPDetailsData {\n");

        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

