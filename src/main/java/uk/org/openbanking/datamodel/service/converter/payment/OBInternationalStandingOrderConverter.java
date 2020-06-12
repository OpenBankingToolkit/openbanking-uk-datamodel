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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.OBInternationalStandingOrder1;
import uk.org.openbanking.datamodel.payment.OBInternationalStandingOrder2;
import uk.org.openbanking.datamodel.payment.OBInternationalStandingOrder3;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalStandingOrder4DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccountCreditor3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccountDebtor4;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBDomestic2InstructedAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBBranchAndFinancialInstitutionIdentification6;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBPartyIdentification43;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBWriteInternational3DataInitiationCreditor;

public class OBInternationalStandingOrderConverter {

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBInternationalStandingOrder1 obInternationalStandingOrder1) {
        return (new OBInternationalStandingOrder2())
                .chargeBearer(obInternationalStandingOrder1.getChargeBearer())
                .creditor(obInternationalStandingOrder1.getCreditor())
                .creditorAccount(obInternationalStandingOrder1.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder1.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder1.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder1.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder1.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder1.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder1.getFrequency())
                .instructedAmount(obInternationalStandingOrder1.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder1.getNumberOfPayments())
                .purpose(obInternationalStandingOrder1.getPurpose())
                .reference(obInternationalStandingOrder1.getReference());
    }

    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBInternationalStandingOrder2 obInternationalStandingOrder2) {
        return (new OBInternationalStandingOrder1())
                .chargeBearer(obInternationalStandingOrder2.getChargeBearer())
                .creditor(obInternationalStandingOrder2.getCreditor())
                .creditorAccount(obInternationalStandingOrder2.getCreditorAccount())
                .creditorAgent(obInternationalStandingOrder2.getCreditorAgent())
                .currencyOfTransfer(obInternationalStandingOrder2.getCurrencyOfTransfer())
                .debtorAccount(obInternationalStandingOrder2.getDebtorAccount())
                .finalPaymentDateTime(obInternationalStandingOrder2.getFinalPaymentDateTime())
                .firstPaymentDateTime(obInternationalStandingOrder2.getFirstPaymentDateTime())
                .frequency(obInternationalStandingOrder2.getFrequency())
                .instructedAmount(obInternationalStandingOrder2.getInstructedAmount())
                .numberOfPayments(obInternationalStandingOrder2.getNumberOfPayments())
                .purpose(obInternationalStandingOrder2.getPurpose())
                .reference(obInternationalStandingOrder2.getReference());
    }

    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        return initiation == null ? null : (new OBInternationalStandingOrder1())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()));
    }

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        return initiation == null ? null : (new OBInternationalStandingOrder2())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBInternationalStandingOrder3 toOBInternationalStandingOrder3(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        return initiation == null ? null : (new OBInternationalStandingOrder3())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBDomestic2InstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccountDebtor4(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification6(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccountCreditor3(initiation.getCreditorAccount()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteInternationalStandingOrder4DataInitiation toOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder2 initiation) {
        return initiation == null ? null : (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(OBInternationalIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(initiation.getSupplementaryData());
    }


    public static OBWriteInternationalStandingOrder4DataInitiation toOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder3 initiation) {
        return initiation == null ? null : (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(initiation.getFrequency())
                .reference(initiation.getReference())
                .numberOfPayments(initiation.getNumberOfPayments())
                .firstPaymentDateTime(initiation.getFirstPaymentDateTime())
                .finalPaymentDateTime(initiation.getFinalPaymentDateTime())
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(OBInternationalIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .supplementaryData(initiation.getSupplementaryData());
    }
}
