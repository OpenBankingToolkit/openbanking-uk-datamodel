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
package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.account.Links;
import uk.org.openbanking.datamodel.account.Meta;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteFundsConfirmationResponse1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-20T11:30:55.433304+01:00[Europe/London]")

public class OBWriteFundsConfirmationResponse1   {
  @JsonProperty("Data")
  private OBWriteFundsConfirmationResponse1Data data;

  @JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;

  public OBWriteFundsConfirmationResponse1 data(OBWriteFundsConfirmationResponse1Data data) {
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
  public OBWriteFundsConfirmationResponse1Data getData() {
    return data;
  }

  public void setData(OBWriteFundsConfirmationResponse1Data data) {
    this.data = data;
  }

  public OBWriteFundsConfirmationResponse1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   *
   * @return links
   */
  @ApiModelProperty(value = "")
  @Valid
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBWriteFundsConfirmationResponse1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   *
   * @return meta
   */
  @ApiModelProperty(value = "")
  @Valid
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
    OBWriteFundsConfirmationResponse1 obWriteFundsConfirmationResponse1 = (OBWriteFundsConfirmationResponse1) o;
    return Objects.equals(this.data, obWriteFundsConfirmationResponse1.data) &&
        Objects.equals(this.links, obWriteFundsConfirmationResponse1.links) &&
        Objects.equals(this.meta, obWriteFundsConfirmationResponse1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteFundsConfirmationResponse1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

