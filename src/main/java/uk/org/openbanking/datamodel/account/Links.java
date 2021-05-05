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

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Links relevant to the payload
 */
@ApiModel(description = "Links relevant to the payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-16T08:37:28.078Z")

public class Links {
    @JsonProperty("Self")
    private String self = null;

    @JsonProperty("First")
    private String first = null;

    @JsonProperty("Prev")
    private String prev = null;

    @JsonProperty("Next")
    private String next = null;

    @JsonProperty("Last")
    private String last = null;

    public Links self(String self) {
        this.self = self;
        return this;
    }

    /**
     * Get self
     * @return self
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public Links first(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get first
     * @return first
     **/
    @ApiModelProperty(value = "")


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Links prev(String prev) {
        this.prev = prev;
        return this;
    }

    /**
     * Get prev
     * @return prev
     **/
    @ApiModelProperty(value = "")


    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public Links next(String next) {
        this.next = next;
        return this;
    }

    /**
     * Get next
     * @return next
     **/
    @ApiModelProperty(value = "")


    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Links last(String last) {
        this.last = last;
        return this;
    }

    /**
     * Get last
     * @return last
     **/
    @ApiModelProperty(value = "")


    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links links = (Links) o;
        return Objects.equals(this.self, links.self) &&
                Objects.equals(this.first, links.first) &&
                Objects.equals(this.prev, links.prev) &&
                Objects.equals(this.next, links.next) &&
                Objects.equals(this.last, links.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, first, prev, next, last);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links {\n");

        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

