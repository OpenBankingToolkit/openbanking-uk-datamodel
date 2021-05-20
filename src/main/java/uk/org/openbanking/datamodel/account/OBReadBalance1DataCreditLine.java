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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to provide details on the credit line.
 */
@ApiModel(description = "Set of elements used to provide details on the credit line.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBReadBalance1DataCreditLine {
  @JsonProperty("Included")
  private Boolean included;

  /**
   * Limit type, in a coded form.
   */
  public enum TypeEnum {
    AVAILABLE("Available"),

    CREDIT("Credit"),

    EMERGENCY("Emergency"),

    PRE_AGREED("Pre-Agreed"),

    TEMPORARY("Temporary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Amount")
  private OBReadBalance1DataAmount1 amount;

  public OBReadBalance1DataCreditLine included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   *
   * @return included
   */
  @ApiModelProperty(required = true, value = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
  @NotNull
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataCreditLine type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Limit type, in a coded form.
   *
   * @return type
   */
  @ApiModelProperty(value = "Limit type, in a coded form.")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBReadBalance1DataCreditLine amount(OBReadBalance1DataAmount1 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  @Valid
  public OBReadBalance1DataAmount1 getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataAmount1 amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataCreditLine obReadBalance1DataCreditLine = (OBReadBalance1DataCreditLine) o;
    return Objects.equals(this.included, obReadBalance1DataCreditLine.included) &&
            Objects.equals(this.type, obReadBalance1DataCreditLine.type) &&
            Objects.equals(this.amount, obReadBalance1DataCreditLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataCreditLine {\n");

    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

