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

@ApiModel(description = "Endpoints corresponding to a specific version")
public class OBDiscoveryAPI<T extends OBDiscoveryAPILinks> {

    @JsonProperty("Version")
    private String version;
    @JsonProperty("Links")
    private T links;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OBDiscoveryAPI<T> version(String version) {
        this.version = version;
        return this;
    }

    public T getLinks() {
        return links;
    }

    public void setLinks(T links) {
        this.links = links;
    }

    public OBDiscoveryAPI<T> links(T links) {
        this.links = links;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OBDiscoveryAPI<?> that = (OBDiscoveryAPI<?>) o;
        return Objects.equals(version, that.version) &&
                Objects.equals(links, that.links);
    }

    @Override
    public int hashCode() {

        return Objects.hash(version, links);
    }
}
