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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-20T14:49:17.040592+01:00[Europe/London]")
public class OBRisk1 {
    @JsonProperty("PaymentContextCode")
    private OBExternalPaymentContext1Code paymentContextCode;

    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode;

    @JsonProperty("MerchantCustomerIdentification")
    private String merchantCustomerIdentification;

    @JsonProperty("ContractPresentInidicator")
    private Boolean contractPresentInidicator;

    @JsonProperty("BeneficiaryPrepopulatedIndicator")
    private Boolean beneficiaryPrepopulatedIndicator;

    @JsonProperty("PaymentPurposeCode")
    private String paymentPurposeCode;

    @JsonProperty("BeneficiaryAccountType")
    private OBExternalExtendedAccountType1Code beneficiaryAccountType;

    @JsonProperty("DeliveryAddress")
    private OBRisk1DeliveryAddress deliveryAddress;

    public OBRisk1 paymentContextCode(OBExternalPaymentContext1Code paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
        return this;
    }

    /**
     * Specifies the payment context * BillPayment - @deprecated * EcommerceGoods - @deprecated * EcommerceServices - @deprecated * Other - @deprecated * PartyToParty - @deprecated
     *
     * @return paymentContextCode
     */
    @ApiModelProperty(value = "Specifies the payment context * BillPayment - @deprecated * EcommerceGoods - @deprecated * EcommerceServices - @deprecated * Other - @deprecated * PartyToParty - @deprecated ")
    @Valid
    public OBExternalPaymentContext1Code getPaymentContextCode() {
        return paymentContextCode;
    }

    public void setPaymentContextCode(OBExternalPaymentContext1Code paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
    }

    public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
     *
     * @return merchantCategoryCode
     */
    @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")

    @Size(min = 3, max = 4)
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
        return this;
    }

    /**
     * The unique customer identifier of the PSU with the merchant.
     *
     * @return merchantCustomerIdentification
     */
    @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")

    @Size(min = 1, max = 70)
    public String getMerchantCustomerIdentification() {
        return merchantCustomerIdentification;
    }

    public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
    }

    public OBRisk1 contractPresentInidicator(Boolean contractPresentInidicator) {
        this.contractPresentInidicator = contractPresentInidicator;
        return this;
    }

    /**
     * Indicates if Payee has a contractual relationship with the PISP.
     *
     * @return contractPresentInidicator
     */
    @ApiModelProperty(value = "Indicates if Payee has a contractual relationship with the PISP.")


    public Boolean getContractPresentInidicator() {
        return contractPresentInidicator;
    }

    public void setContractPresentInidicator(Boolean contractPresentInidicator) {
        this.contractPresentInidicator = contractPresentInidicator;
    }

    public OBRisk1 beneficiaryPrepopulatedIndicator(Boolean beneficiaryPrepopulatedIndicator) {
        this.beneficiaryPrepopulatedIndicator = beneficiaryPrepopulatedIndicator;
        return this;
    }

    /**
     * Indicates if PISP has immutably prepopulated payment details in for the PSU.
     *
     * @return beneficiaryPrepopulatedIndicator
     */
    @ApiModelProperty(value = "Indicates if PISP has immutably prepopulated payment details in for the PSU.")


    public Boolean getBeneficiaryPrepopulatedIndicator() {
        return beneficiaryPrepopulatedIndicator;
    }

    public void setBeneficiaryPrepopulatedIndicator(Boolean beneficiaryPrepopulatedIndicator) {
        this.beneficiaryPrepopulatedIndicator = beneficiaryPrepopulatedIndicator;
    }

    public OBRisk1 paymentPurposeCode(String paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
        return this;
    }

    /**
     * Category code, related to the type of services or goods that corresponds to the underlying purpose of the payment that conforms to Recommended UK Purpose Code in ISO 20022 Payment Messaging List
     *
     * @return paymentPurposeCode
     */
    @ApiModelProperty(value = "Category code, related to the type of services or goods that corresponds to the underlying purpose of the payment that conforms to Recommended UK Purpose Code in ISO 20022 Payment Messaging List")

    @Size(min = 3, max = 4)
    public String getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    public void setPaymentPurposeCode(String paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
    }

    public OBRisk1 beneficiaryAccountType(OBExternalExtendedAccountType1Code beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
        return this;
    }

    /**
     * Get beneficiaryAccountType
     *
     * @return beneficiaryAccountType
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBExternalExtendedAccountType1Code getBeneficiaryAccountType() {
        return beneficiaryAccountType;
    }

    public void setBeneficiaryAccountType(OBExternalExtendedAccountType1Code beneficiaryAccountType) {
        this.beneficiaryAccountType = beneficiaryAccountType;
    }

    public OBRisk1 deliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    /**
     * Get deliveryAddress
     *
     * @return deliveryAddress
     */
    @ApiModelProperty(value = "")

    @Valid

    public OBRisk1DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRisk1 obRisk1 = (OBRisk1) o;
        return Objects.equals(this.paymentContextCode, obRisk1.paymentContextCode) &&
                Objects.equals(this.merchantCategoryCode, obRisk1.merchantCategoryCode) &&
                Objects.equals(this.merchantCustomerIdentification, obRisk1.merchantCustomerIdentification) &&
                Objects.equals(this.contractPresentInidicator, obRisk1.contractPresentInidicator) &&
                Objects.equals(this.beneficiaryPrepopulatedIndicator, obRisk1.beneficiaryPrepopulatedIndicator) &&
                Objects.equals(this.paymentPurposeCode, obRisk1.paymentPurposeCode) &&
                Objects.equals(this.beneficiaryAccountType, obRisk1.beneficiaryAccountType) &&
                Objects.equals(this.deliveryAddress, obRisk1.deliveryAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, contractPresentInidicator, beneficiaryPrepopulatedIndicator, paymentPurposeCode, beneficiaryAccountType, deliveryAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRisk1 {\n");

        sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
        sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
        sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
        sb.append("    contractPresentInidicator: ").append(toIndentedString(contractPresentInidicator)).append("\n");
        sb.append("    beneficiaryPrepopulatedIndicator: ").append(toIndentedString(beneficiaryPrepopulatedIndicator)).append("\n");
        sb.append("    paymentPurposeCode: ").append(toIndentedString(paymentPurposeCode)).append("\n");
        sb.append("    beneficiaryAccountType: ").append(toIndentedString(beneficiaryAccountType)).append("\n");
        sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

