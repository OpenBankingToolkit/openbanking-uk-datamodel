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
package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBFundsConfirmationConsent1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T10:02:34.555654+01:00[Europe/London]")

public class OBFundsConfirmationConsent1 {
  // validation within OBFundsConfirmationConsentData1 now mirrors OBFundsConfirmationConsent1Data (to minimise impact)
  @JsonProperty("Data")
  private OBFundsConfirmationConsentData1 data = null; // hand-edited (avoided switch to OBFundsConfirmationConsent1Data)

  public OBFundsConfirmationConsent1 data(OBFundsConfirmationConsentData1 data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public OBFundsConfirmationConsentData1 getData() {
    return data;
  }

  public void setData(OBFundsConfirmationConsentData1 data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBFundsConfirmationConsent1 obFundsConfirmationConsent1 = (OBFundsConfirmationConsent1) o;
    return Objects.equals(this.data, obFundsConfirmationConsent1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBFundsConfirmationConsent1 {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

