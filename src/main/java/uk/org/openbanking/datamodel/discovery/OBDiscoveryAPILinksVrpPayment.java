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

@ApiModel(description = "VRP Payment endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksVrpPayment implements OBDiscoveryAPILinks {
    @JsonProperty("CreateDomesticVrpPaymentConsent")
    private String createDomesticVrpPaymentConsent;
    @JsonProperty("GetDomesticVrpPaymentConsent")
    private String getDomesticVrpPaymentConsent;
    @JsonProperty("DeleteDomesticVrpPaymentConsent")
    private String deleteDomesticVrpPaymentConsent;
    @JsonProperty("GetDomesticVrpPaymentFundsConfirmation")
    private String getDomesticVrpPaymentFundsConfirmation;
    @JsonProperty("CreateDomesticVrpPayment")
    private String createDomesticVrpPayment;
    @JsonProperty("GetDomesticVrpPayment")
    private String getDomesticVrpPayment;
    @JsonProperty("GetDomesticVrpPaymentDetails")
    private String getDomesticVrpPaymentDetails;

    public String getCreateDomesticVrpPaymentConsent() {
        return createDomesticVrpPaymentConsent;
    }

    public void setCreateDomesticVrpPaymentConsent(String createDomesticVrpPaymentConsent) {
        this.createDomesticVrpPaymentConsent = createDomesticVrpPaymentConsent;
    }

    public OBDiscoveryAPILinksVrpPayment createDomesticVrpPaymentConsent(String createDomesticVrpPaymentConsent) {
        this.createDomesticVrpPaymentConsent = createDomesticVrpPaymentConsent;
        return this;
    }

    public String getGetDomesticVrpPaymentConsent() {
        return getDomesticVrpPaymentConsent;
    }

    public void setGetDomesticVrpPaymentConsent(String getDomesticVrpPaymentConsent) {
        this.getDomesticVrpPaymentConsent = getDomesticVrpPaymentConsent;
    }

    public OBDiscoveryAPILinksVrpPayment getDomesticVrpPaymentConsent(String getDomesticVrpPaymentConsent) {
        this.getDomesticVrpPaymentConsent = getDomesticVrpPaymentConsent;
        return this;
    }

    public String getDeleteDomesticVrpPaymentConsent() {
        return deleteDomesticVrpPaymentConsent;
    }

    public void setDeleteDomesticVrpPaymentConsent(String deleteDomesticVrpPaymentConsent) {
        this.deleteDomesticVrpPaymentConsent = deleteDomesticVrpPaymentConsent;
    }

    public OBDiscoveryAPILinksVrpPayment deleteDomesticVrpPaymentConsent(String deleteDomesticVrpPaymentConsent) {
        this.deleteDomesticVrpPaymentConsent = deleteDomesticVrpPaymentConsent;
        return this;
    }

    public String getGetDomesticVrpPaymentFundsConfirmation() {
        return getDomesticVrpPaymentFundsConfirmation;
    }

    public void setGetDomesticVrpPaymentFundsConfirmation(String getDomesticVrpPaymentFundsConfirmation) {
        this.getDomesticVrpPaymentFundsConfirmation = getDomesticVrpPaymentFundsConfirmation;
    }

    public OBDiscoveryAPILinksVrpPayment getDomesticVrpPaymentFundsConfirmation(String getDomesticVrpPaymentFundsConfirmation) {
        this.getDomesticVrpPaymentFundsConfirmation = getDomesticVrpPaymentFundsConfirmation;
        return this;
    }

    public String getCreateDomesticVrpPayment() {
        return createDomesticVrpPayment;
    }

    public void setCreateDomesticVrpPayment(String createDomesticVrpPayment) {
        this.createDomesticVrpPayment = createDomesticVrpPayment;
    }

    public OBDiscoveryAPILinksVrpPayment createDomesticVrpPayment(String createDomesticVrpPayment) {
        this.createDomesticVrpPayment = createDomesticVrpPayment;
        return this;
    }

    public String getGetDomesticVrpPayment() {
        return getDomesticVrpPayment;
    }

    public void setGetDomesticVrpPayment(String getDomesticVrpPayment) {
        this.getDomesticVrpPayment = getDomesticVrpPayment;
    }

    public OBDiscoveryAPILinksVrpPayment getDomesticVrpPayment(String getDomesticVrpPayment) {
        this.getDomesticVrpPayment = getDomesticVrpPayment;
        return this;
    }

    public String getGetDomesticVrpPaymentDetails() {
        return getDomesticVrpPaymentDetails;
    }

    public void setGetDomesticVrpPaymentDetails(String getDomesticVrpPaymentDetails) {
        this.getDomesticVrpPaymentDetails = getDomesticVrpPaymentDetails;
    }

    public OBDiscoveryAPILinksVrpPayment getDomesticVrpPaymentDetails(String getDomesticVrpPaymentDetails) {
        this.getDomesticVrpPaymentDetails = getDomesticVrpPaymentDetails;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OBDiscoveryAPILinksVrpPayment)) return false;
        OBDiscoveryAPILinksVrpPayment that = (OBDiscoveryAPILinksVrpPayment) o;
        return Objects.equals(createDomesticVrpPaymentConsent, that.createDomesticVrpPaymentConsent) &&
                Objects.equals(getDomesticVrpPaymentConsent, that.getDomesticVrpPaymentConsent) &&
                Objects.equals(deleteDomesticVrpPaymentConsent, that.deleteDomesticVrpPaymentConsent) &&
                Objects.equals(getDomesticVrpPaymentFundsConfirmation, that.getDomesticVrpPaymentFundsConfirmation) &&
                Objects.equals(createDomesticVrpPayment, that.createDomesticVrpPayment) &&
                Objects.equals(getDomesticVrpPayment, that.getDomesticVrpPayment) &&
                Objects.equals(getDomesticVrpPaymentDetails, that.getDomesticVrpPaymentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDomesticVrpPaymentConsent, getDomesticVrpPaymentConsent, deleteDomesticVrpPaymentConsent,
                getDomesticVrpPaymentFundsConfirmation, createDomesticVrpPayment, getDomesticVrpPayment,
                getDomesticVrpPaymentDetails);
    }

    @Override
    public String toString() {
        return "OBDiscoveryAPILinksVrpPayment{" +

                ", createDomesticVrpPaymentConsent='" + createDomesticVrpPaymentConsent + '\'' +
                ", getDomesticVrpPaymentConsent='" + getDomesticVrpPaymentConsent + '\'' +
                ", deleteDomesticVrpPaymentConsent='" + deleteDomesticVrpPaymentConsent + '\'' +
                ", getDomesticVrpPaymentFundsConfirmation='" + getDomesticVrpPaymentFundsConfirmation + '\'' +
                ", createDomesticVrpPayment='" + createDomesticVrpPayment + '\'' +
                ", getDomesticVrpPayment='" + getDomesticVrpPayment + '\'' +
                ", getDomesticVrpPaymentDetails='" + getDomesticVrpPaymentDetails + '\'' +
                "}";
    }
}
