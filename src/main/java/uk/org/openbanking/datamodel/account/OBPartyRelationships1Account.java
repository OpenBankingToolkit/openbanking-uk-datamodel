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
import java.util.Objects;

/**
 * Relationship to the Account resource.
 */
@ApiModel(description = "Relationship to the Account resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBPartyRelationships1Account   {
  @JsonProperty("Related")
  private String related;

  @JsonProperty("Id")
  private String id;

  public OBPartyRelationships1Account related(String related) {
    this.related = related;
    return this;
  }

  /**
   * Absolute URI to the related resource.
   * @return related
  */
  @ApiModelProperty(required = true, value = "Absolute URI to the related resource.")
  @NotNull
  @Valid
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
  */
  @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.")
  @NotNull

@Size(min=1,max=40) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1Account obPartyRelationships1Account = (OBPartyRelationships1Account) o;
    return Objects.equals(this.related, obPartyRelationships1Account.related) &&
        Objects.equals(this.id, obPartyRelationships1Account.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(related, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

