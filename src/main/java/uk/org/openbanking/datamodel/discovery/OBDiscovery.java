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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Provides the endpoints details for payments and accounts API
 */
@ApiModel(description = "Provides the endpoints details for payments and accounts API")
public class OBDiscovery {

    @JsonProperty("FinancialId")
    private String financialId;

    @JsonProperty("PaymentInitiationAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinks>> paymentInitiationAPIs;

    @JsonProperty("AccountAndTransactionAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinks>> accountAndTransactionAPIs;

    @JsonProperty("FundsConfirmationAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinks>> fundsConfirmationAPIs;

    @JsonProperty("EventNotificationAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinks>> eventNotificationAPIs;

    @JsonProperty("CustomerInfoAPI")
    private List<OBDiscoveryAPI<OBDiscoveryAPILinks>> infoAPIs;

    public String getFinancialId() {
        return financialId;
    }

    public void setFinancialId(String financialId) {
        this.financialId = financialId;
    }

    public OBDiscovery paymentInitiationAPI(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> paymentInitiationAPIs) {
        this.paymentInitiationAPIs = paymentInitiationAPIs;
        return this;
    }

    public OBDiscovery addPaymentInitiationAPI(OBDiscoveryAPI<OBDiscoveryAPILinks> paymentInitiationAPI) {
        if (this.paymentInitiationAPIs == null) {
            this.paymentInitiationAPIs = new ArrayList<>();
        }
        this.paymentInitiationAPIs.add(paymentInitiationAPI);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinks>> getPaymentInitiationAPIs() {
        return paymentInitiationAPIs;
    }

    public void setPaymentInitiationAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> paymentInitiationAPIs) {
        this.paymentInitiationAPIs = paymentInitiationAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinks>> getPaymentInitiationAPI(String version) {
        return paymentInitiationAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    }

    public OBDiscovery accountAndTransactionAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> accountAndTransactionAPIs) {
        this.accountAndTransactionAPIs = accountAndTransactionAPIs;
        return this;
    }

    public OBDiscovery addAccountAndTransactionAPI(OBDiscoveryAPI<OBDiscoveryAPILinks> accountAndTransactionAPI) {
        if (this.accountAndTransactionAPIs == null) {
            this.accountAndTransactionAPIs = new ArrayList<>();
        }
        this.accountAndTransactionAPIs.add(accountAndTransactionAPI);
        return this;
    }

    public OBDiscovery addInfoAPI(OBDiscoveryAPI<OBDiscoveryAPILinks> infoAPIs){
        if (this.infoAPIs == null){
            this.infoAPIs = new ArrayList<>();
        }
        this.infoAPIs.add(infoAPIs);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinks>> getAccountAndTransactionAPIs() {
        return accountAndTransactionAPIs;
    }

    public void setAccountAndTransactionAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> accountAndTransactionAPIs) {
        this.accountAndTransactionAPIs = accountAndTransactionAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinks>> getAccountAndTransactionAPI(String version) {
        return accountAndTransactionAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    }

    public OBDiscovery fundsConfirmationAPI(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> fundsConfirmationAPIs) {
        this.fundsConfirmationAPIs = fundsConfirmationAPIs;
        return this;
    }

    public OBDiscovery addFundsConfirmationAPI(OBDiscoveryAPI<OBDiscoveryAPILinks> fundsConfirmationAPI) {
        if (this.fundsConfirmationAPIs == null) {
            this.fundsConfirmationAPIs = new ArrayList<>();
        }
        this.fundsConfirmationAPIs.add(fundsConfirmationAPI);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinks>> getFundsConfirmationAPIs() {
        return fundsConfirmationAPIs;
    }

    public void setFundsConfirmationAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> fundsConfirmationAPIs) {
        this.fundsConfirmationAPIs = fundsConfirmationAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinks>> getFundsConfirmationAPIs(String version) {
        return fundsConfirmationAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    }

    public OBDiscovery eventNotificationAPI(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> eventNotificationAPIs) {
        this.eventNotificationAPIs = eventNotificationAPIs;
        return this;
    }

    public OBDiscovery addEventNotificationAPI(OBDiscoveryAPI<OBDiscoveryAPILinks> eventNotificationAPI) {
        if (this.eventNotificationAPIs == null) {
            this.eventNotificationAPIs = new ArrayList<>();
        }
        this.eventNotificationAPIs.add(eventNotificationAPI);
        return this;
    }

    public List<OBDiscoveryAPI<OBDiscoveryAPILinks>> getEventNotificationAPIs() {
        return eventNotificationAPIs;
    }

    public void setEventNotificationAPIs(List<OBDiscoveryAPI<OBDiscoveryAPILinks>> eventNotificationAPIs) {
        this.eventNotificationAPIs = eventNotificationAPIs;
    }

    public Optional<OBDiscoveryAPI<OBDiscoveryAPILinks>> getEventNotificationAPIs(String version) {
        return eventNotificationAPIs.stream().filter(apis -> apis.getVersion().equals(version)).findFirst();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscovery that = (OBDiscovery) o;
        return Objects.equals(paymentInitiationAPIs, that.paymentInitiationAPIs) &&
                Objects.equals(accountAndTransactionAPIs, that.accountAndTransactionAPIs) &&
                Objects.equals(fundsConfirmationAPIs, that.fundsConfirmationAPIs) &&
                Objects.equals(eventNotificationAPIs, that.eventNotificationAPIs)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(financialId, paymentInitiationAPIs, accountAndTransactionAPIs, fundsConfirmationAPIs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDiscovery {\n");
        sb.append("    financialId: ").append(toIndentedString(financialId)).append("\n");
        sb.append("    paymentInitiationAPIs: ").append(toIndentedString(paymentInitiationAPIs)).append("\n");
        sb.append("    accountAndTransactionAPIs: ").append(toIndentedString(accountAndTransactionAPIs)).append("\n");
        sb.append("    fundsConfirmationAPIs: ").append(toIndentedString(fundsConfirmationAPIs)).append("\n");
        sb.append("    eventNotificationAPIs: ").append(toIndentedString(eventNotificationAPIs)).append("\n");
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
