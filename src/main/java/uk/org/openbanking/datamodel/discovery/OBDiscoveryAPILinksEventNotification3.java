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
import java.util.StringJoiner;

@ApiModel(description = "Event notification endpoints corresponding to a specific version")
public class OBDiscoveryAPILinksEventNotification3 implements OBDiscoveryAPILinks{

    @JsonProperty("CreateCallbackUrl")
    private String createCallbackUrl;
    @JsonProperty("GetCallbackUrls")
    private String getCallbackUrls;
    @JsonProperty("AmendCallbackUrl")
    private String amendCallbackUrl;
    @JsonProperty("DeleteCallbackUrl")
    private String deleteCallbackUrl;

    public OBDiscoveryAPILinksEventNotification3() {
    }

    public String getCreateCallbackUrl() {
        return createCallbackUrl;
    }

    public void setCreateCallbackUrl(String createCallbackUrl) {
        this.createCallbackUrl = createCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification3 createCallbackUrl(String createCallbackUrl) {
        this.createCallbackUrl = createCallbackUrl;
        return this;
    }

    public String getGetCallbackUrls() {
        return getCallbackUrls;
    }

    public void setGetCallbackUrls(String getCallbackUrls) {
        this.getCallbackUrls = getCallbackUrls;
    }

    public OBDiscoveryAPILinksEventNotification3 getCallbackUrls(String getCallbackUrls) {
        this.getCallbackUrls = getCallbackUrls;
        return this;
    }

    public String getAmendCallbackUrl() {
        return amendCallbackUrl;
    }

    public void setAmendCallbackUrl(String amendCallbackUrl) {
        this.amendCallbackUrl = amendCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification3 amendCallbackUrl(String amendCallbackUrl) {
        this.amendCallbackUrl = amendCallbackUrl;
        return this;
    }

    public String getDeleteCallbackUrl() {
        return deleteCallbackUrl;
    }

    public void setDeleteCallbackUrl(String deleteCallbackUrl) {
        this.deleteCallbackUrl = deleteCallbackUrl;
    }

    public OBDiscoveryAPILinksEventNotification3 deleteCallbackUrl(String deleteCallbackUrl) {
        this.deleteCallbackUrl = deleteCallbackUrl;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPILinksEventNotification3 that = (OBDiscoveryAPILinksEventNotification3) o;
        return Objects.equals(createCallbackUrl, that.createCallbackUrl) &&
                Objects.equals(getCallbackUrls, that.getCallbackUrls) &&
                Objects.equals(amendCallbackUrl, that.amendCallbackUrl) &&
                Objects.equals(deleteCallbackUrl, that.deleteCallbackUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createCallbackUrl, getCallbackUrls, amendCallbackUrl, deleteCallbackUrl);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OBDiscoveryAPILinksEventNotification3.class.getSimpleName() + "[", "]")
                .add("createCallbackUrl='" + createCallbackUrl + "'")
                .add("getCallbackUrl='" + getCallbackUrls + "'")
                .add("amendCallbackUrl='" + amendCallbackUrl + "'")
                .add("deleteCallbackUrl='" + deleteCallbackUrl + "'")
                .toString();
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
