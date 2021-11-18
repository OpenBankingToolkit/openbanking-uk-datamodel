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
import uk.org.openbanking.datamodel.account.Links;
import uk.org.openbanking.datamodel.account.Meta;
import uk.org.openbanking.datamodel.payment.OBRisk1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBDomesticVRPResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T16:24:12.845482Z[Europe/London]")
public class OBDomesticVRPResponse {
    @JsonProperty("Data")
    private OBDomesticVRPResponseData data;

    @JsonProperty("Risk")
    private OBRisk1 risk; // use existing OBRisk1 for Payments, rather than duplicating it for VRPs

    @JsonProperty("Links")
    private Links links; // use existing acounts Link class, rather than duplicating it for VRPs

    @JsonProperty("Meta")
    private Meta meta; // use existing accounts Meta class, rather than duplicating it for VRPs

    public OBDomesticVRPResponse data(OBDomesticVRPResponseData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBDomesticVRPResponseData getData() {
        return data;
    }

    public void setData(OBDomesticVRPResponseData data) {
        this.data = data;
    }

    public OBDomesticVRPResponse risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     * @return risk
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }

    public OBDomesticVRPResponse links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBDomesticVRPResponse meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Meta Data relevant to the payload. At present no fields are used for VRP.
     * @return meta
     */
    @ApiModelProperty(required = true, value = "Meta Data relevant to the payload. At present no fields are used for VRP.")
    @NotNull


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBDomesticVRPResponse obDomesticVRPResponse = (OBDomesticVRPResponse) o;
        return Objects.equals(this.data, obDomesticVRPResponse.data) &&
                Objects.equals(this.risk, obDomesticVRPResponse.risk) &&
                Objects.equals(this.links, obDomesticVRPResponse.links) &&
                Objects.equals(this.meta, obDomesticVRPResponse.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk, links, meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBDomesticVRPResponse {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

