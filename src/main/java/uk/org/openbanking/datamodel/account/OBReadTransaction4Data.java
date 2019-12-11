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
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadTransaction4Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-28T11:14:51.272Z")

public class OBReadTransaction4Data   {
  @JsonProperty("Transaction")
  @Valid
  private List<OBTransaction4> transaction = null;

  public OBReadTransaction4Data transaction(List<OBTransaction4> transaction) {
    this.transaction = transaction;
    return this;
  }

  public OBReadTransaction4Data addTransactionItem(OBTransaction4 transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<OBTransaction4>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

  /**
   * Provides further details on an entry in the report.
   * @return transaction
  **/
  @ApiModelProperty(value = "Provides further details on an entry in the report.")

  @Valid

  public List<OBTransaction4> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<OBTransaction4> transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadTransaction4Data obReadTransaction4Data = (OBReadTransaction4Data) o;
    return Objects.equals(this.transaction, obReadTransaction4Data.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadTransaction4Data {\n");
    
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

