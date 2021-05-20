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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other fee rate type which is not available in the standard code set
 */
@ApiModel(description = "Other fee rate type which is not available in the standard code set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBOtherCodeType18 {
    @JsonProperty("Code")
    private String code;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    public OBOtherCodeType18 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     */
    @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
    @Pattern(regexp = "^\\\\w{0,4}$")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBOtherCodeType18 name(String name) {
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

    public OBOtherCodeType18 description(String description) {
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
        OBOtherCodeType18 obOtherCodeType18 = (OBOtherCodeType18) o;
        return Objects.equals(this.code, obOtherCodeType18.code) &&
                Objects.equals(this.name, obOtherCodeType18.name) &&
                Objects.equals(this.description, obOtherCodeType18.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOtherCodeType18 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

