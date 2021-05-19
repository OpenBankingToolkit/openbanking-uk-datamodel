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
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadDataTransaction6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadDataTransaction6 {
    @JsonProperty("Transaction")
    @Valid
    private List<OBTransaction6> transaction = null;

    public OBReadDataTransaction6 transaction(List<OBTransaction6> transaction) {
        this.transaction = transaction;
        return this;
    }

    public OBReadDataTransaction6 addTransactionItem(OBTransaction6 transactionItem) {
        if (this.transaction == null) {
            this.transaction = new ArrayList<OBTransaction6>();
        }
        this.transaction.add(transactionItem);
        return this;
    }

    /**
     * Get transaction
     *
     * @return transaction
     */
    @ApiModelProperty(value = "")
    @Valid
    public List<OBTransaction6> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<OBTransaction6> transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataTransaction6 obReadDataTransaction6 = (OBReadDataTransaction6) o;
        return Objects.equals(this.transaction, obReadDataTransaction6.transaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataTransaction6 {\n");

        sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

