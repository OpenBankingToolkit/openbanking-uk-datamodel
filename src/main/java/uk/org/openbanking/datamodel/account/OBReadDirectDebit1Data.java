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
 * OBReadDirectDebit1Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-01T11:26:57.876+01:00")

public class OBReadDirectDebit1Data   {
  @JsonProperty("DirectDebit")
  @Valid
  private List<OBDirectDebit1> directDebit = null;

  public OBReadDirectDebit1Data directDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  public OBReadDirectDebit1Data addDirectDebitItem(OBDirectDebit1 directDebitItem) {
    if (this.directDebit == null) {
      this.directDebit = new ArrayList<OBDirectDebit1>();
    }
    this.directDebit.add(directDebitItem);
    return this;
  }

  /**
   * Account to or from which a cash entry is made.
   * @return directDebit
  **/
  @ApiModelProperty(value = "Account to or from which a cash entry is made.")

  @Valid

  public List<OBDirectDebit1> getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(List<OBDirectDebit1> directDebit) {
    this.directDebit = directDebit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit1Data obReadDirectDebit1Data = (OBReadDirectDebit1Data) o;
    return Objects.equals(this.directDebit, obReadDirectDebit1Data.directDebit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit1Data {\n");
    
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
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

