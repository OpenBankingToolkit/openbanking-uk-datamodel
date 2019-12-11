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
package uk.org.openbanking.datamodel.discovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel(description = "Payment endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksPayment1 implements OBDiscoveryAPILinks{

    @JsonProperty("CreateSingleImmediatePayment")
    private String createSingleImmediatePayment;
    @JsonProperty("GetSingleImmediatePayment")
    private String getSingleImmediatePayment;
    @JsonProperty("CreatePaymentSubmission")
    private String createPaymentSubmission;
    @JsonProperty("GetPaymentSubmission")
    private String getPaymentSubmission;

    public String getCreateSingleImmediatePayment() {
        return createSingleImmediatePayment;
    }

    public void setCreateSingleImmediatePayment(String createSingleImmediatePayment) {
        this.createSingleImmediatePayment = createSingleImmediatePayment;
    }

    public OBDiscoveryAPILinksPayment1 createSingleImmediatePayment(String createSingleImmediatePayment) {
        this.createSingleImmediatePayment = createSingleImmediatePayment;
        return this;
    }

    public String getGetSingleImmediatePayment() {
        return getSingleImmediatePayment;
    }

    public void setGetSingleImmediatePayment(String getSingleImmediatePayment) {
        this.getSingleImmediatePayment = getSingleImmediatePayment;
    }

    public OBDiscoveryAPILinksPayment1 getSingleImmediatePayment(String getSingleImmediatePayment) {
        this.getSingleImmediatePayment = getSingleImmediatePayment;
        return this;
    }

    public String getCreatePaymentSubmission() {
        return createPaymentSubmission;
    }

    public void setCreatePaymentSubmission(String createPaymentSubmission) {
        this.createPaymentSubmission = createPaymentSubmission;
    }

    public OBDiscoveryAPILinksPayment1 createPaymentSubmission(String createPaymentSubmission) {
        this.createPaymentSubmission = createPaymentSubmission;
        return this;
    }

    public String getGetPaymentSubmission() {
        return getPaymentSubmission;
    }

    public void setGetPaymentSubmission(String getPaymentSubmission) {
        this.getPaymentSubmission = getPaymentSubmission;
    }

    public OBDiscoveryAPILinksPayment1 getPaymentSubmission(String getPaymentSubmission) {
        this.getPaymentSubmission = getPaymentSubmission;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksPayment1 that = (OBDiscoveryAPILinksPayment1) o;
        return Objects.equals(createSingleImmediatePayment, that.createSingleImmediatePayment) &&
                Objects.equals(getSingleImmediatePayment, that.getSingleImmediatePayment) &&
                Objects.equals(createPaymentSubmission, that.createPaymentSubmission) &&
                Objects.equals(getPaymentSubmission, that.getPaymentSubmission);
    }

    @Override
    public int hashCode() {

        return Objects.hash(createSingleImmediatePayment, getSingleImmediatePayment, createPaymentSubmission,
                getPaymentSubmission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDiscovery {\n");
        sb.append("    createSingleImmediatePayment: ").append(toIndentedString(createSingleImmediatePayment)).append("\n");
        sb.append("    getSingleImmediatePayment: ").append(toIndentedString(getSingleImmediatePayment)).append("\n");
        sb.append("    createPaymentSubmission: ").append(toIndentedString(createPaymentSubmission)).append("\n");
        sb.append("    getPaymentSubmission: ").append(toIndentedString(getPaymentSubmission)).append("\n");
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
