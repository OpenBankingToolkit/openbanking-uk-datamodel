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
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteDataInternationalStandingOrderConsent1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T14:05:22.993+01:00")

public class OBWriteDataInternationalStandingOrderConsent1   {
  @JsonProperty("Permission")
  private OBExternalPermissions2Code permission = null;

  @JsonProperty("Initiation")
  private OBInternationalStandingOrder1 initiation = null;

  @JsonProperty("Authorisation")
  private OBAuthorisation1 authorisation = null;

  public OBWriteDataInternationalStandingOrderConsent1 permission(OBExternalPermissions2Code permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBExternalPermissions2Code getPermission() {
    return permission;
  }

  public void setPermission(OBExternalPermissions2Code permission) {
    this.permission = permission;
  }

  public OBWriteDataInternationalStandingOrderConsent1 initiation(OBInternationalStandingOrder1 initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OBInternationalStandingOrder1 getInitiation() {
    return initiation;
  }

  public void setInitiation(OBInternationalStandingOrder1 initiation) {
    this.initiation = initiation;
  }

  public OBWriteDataInternationalStandingOrderConsent1 authorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OBAuthorisation1 getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBAuthorisation1 authorisation) {
    this.authorisation = authorisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteDataInternationalStandingOrderConsent1 obWriteDataInternationalStandingOrderConsent1 = (OBWriteDataInternationalStandingOrderConsent1) o;
    return Objects.equals(this.permission, obWriteDataInternationalStandingOrderConsent1.permission) &&
        Objects.equals(this.initiation, obWriteDataInternationalStandingOrderConsent1.initiation) &&
        Objects.equals(this.authorisation, obWriteDataInternationalStandingOrderConsent1.authorisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, initiation, authorisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteDataInternationalStandingOrderConsent1 {\n");

    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

