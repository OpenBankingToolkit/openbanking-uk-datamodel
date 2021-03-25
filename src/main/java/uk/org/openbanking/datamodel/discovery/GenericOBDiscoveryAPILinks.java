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

import java.util.*;

public class GenericOBDiscoveryAPILinks implements OBDiscoveryAPILinks {
    private Map<String, String> links = new HashMap<>();

    public GenericOBDiscoveryAPILinks() {
    }

    public GenericOBDiscoveryAPILinks(Map<String, String> links) {
        this.links = links;
    }

    public GenericOBDiscoveryAPILinks addLink(String reference, String endpoint) {
        links.put(reference, endpoint);
        return this;
    }

    public Collection<String> getLinkValues() {
        return new ArrayList(links.values());
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericOBDiscoveryAPILinks)) return false;
        GenericOBDiscoveryAPILinks that = (GenericOBDiscoveryAPILinks) o;
        return Objects.equals(links, that.links);
    }

    public int hashCode() {
        return Objects.hash(links);
    }

    public String toString() {
        return "GenericOBDiscoveryAPILinks{" +
                "links='" + links + '\'' +
                '}';
    }

    public static GenericOBDiscoveryAPILinks.GenericOBDiscoveryAPILinksBuilder builder() {
        return new GenericOBDiscoveryAPILinks.GenericOBDiscoveryAPILinksBuilder();
    }

    public static class GenericOBDiscoveryAPILinksBuilder {
        private Map<String, String> links;

        public GenericOBDiscoveryAPILinks.GenericOBDiscoveryAPILinksBuilder links(Map<String, String> links) {
            this.links = links;
            return this;
        }

        public GenericOBDiscoveryAPILinks build() {
            return new GenericOBDiscoveryAPILinks(this.links);
        }
    }
}
