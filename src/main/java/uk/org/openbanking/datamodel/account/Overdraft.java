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
 * Borrowing details
 */
@ApiModel(description = "Borrowing details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class Overdraft {
    @JsonProperty("Notes")
    @Valid
    private List<String> notes = null;

    @JsonProperty("OverdraftTierBandSet")
    @Valid
    private List<OverdraftOverdraftTierBandSet> overdraftTierBandSet = new ArrayList<OverdraftOverdraftTierBandSet>();

    public Overdraft notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Associated Notes about the overdraft rates
     *
     * @return notes
     */
    @ApiModelProperty(value = "Associated Notes about the overdraft rates")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Overdraft overdraftTierBandSet(List<OverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public Overdraft addOverdraftTierBandSetItem(OverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Tier band set details
     *
     * @return overdraftTierBandSet
     */
    @ApiModelProperty(required = true, value = "Tier band set details")
    @NotNull
    @Valid
    @Size(min = 1)
    public List<OverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<OverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft overdraft = (Overdraft) o;
        return Objects.equals(this.notes, overdraft.notes) &&
                Objects.equals(this.overdraftTierBandSet, overdraft.overdraftTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, overdraftTierBandSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft {\n");

        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

