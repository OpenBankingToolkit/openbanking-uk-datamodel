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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee/charge type which is not available in the standard code set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OtherFeeType1 {
  @JsonProperty("Code")
  private String code;

  /**
   * Categorisation of fees and charges into standard categories.
   */
  public enum FeeCategoryEnum {
    OTHER("Other"),

    SERVICING("Servicing");

    private String value;

    FeeCategoryEnum(String value) {
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
    public static FeeCategoryEnum fromValue(String value) {
      for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("FeeCategory")
  private FeeCategoryEnum feeCategory;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  public OtherFeeType1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   *
   * @return code
   */
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
  @Pattern(regexp = "^\\w{0,4}$")
  @Size(min = 0, max = 4)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherFeeType1 feeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Categorisation of fees and charges into standard categories.
   *
   * @return feeCategory
   */
  @ApiModelProperty(required = true, value = "Categorisation of fees and charges into standard categories.")
  @NotNull
  public FeeCategoryEnum getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OtherFeeType1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Long name associated with the code")
  @NotNull
  @Size(min = 1, max = 70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherFeeType1 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   *
   * @return description
   */
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
  @NotNull
  @Size(min = 1, max = 350)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeeType1 otherFeeType1 = (OtherFeeType1) o;
    return Objects.equals(this.code, otherFeeType1.code) &&
            Objects.equals(this.feeCategory, otherFeeType1.feeCategory) &&
            Objects.equals(this.name, otherFeeType1.name) &&
            Objects.equals(this.description, otherFeeType1.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, feeCategory, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeeType1 {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

