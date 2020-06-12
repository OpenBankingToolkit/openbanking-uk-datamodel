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

    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBInternationalStandingOrder2 obInternationalStandingOrder2) {
        return (new OBInternationalStandingOrder1())
                .frequency(obInternationalStandingOrder2.getFrequency())
                .reference(obInternationalStandingOrder2.getReference())
                .numberOfPayments(obInternationalStandingOrder2.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder2.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder2.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder2.getPurpose())
                .chargeBearer(obInternationalStandingOrder2.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder2.getCurrencyOfTransfer())
                .instructedAmount(obInternationalStandingOrder2.getInstructedAmount())
                .debtorAccount(obInternationalStandingOrder2.getDebtorAccount())
                .creditor(obInternationalStandingOrder2.getCreditor())
                .creditorAgent(obInternationalStandingOrder2.getCreditorAgent())
                .creditorAccount(obInternationalStandingOrder2.getCreditorAccount());
    }

    public static OBInternationalStandingOrder1 toOBInternationalStandingOrder1(OBInternationalStandingOrder3 obInternationalStandingOrder3) {
        return (new OBInternationalStandingOrder1())
                .frequency(obInternationalStandingOrder3.getFrequency())
                .reference(obInternationalStandingOrder3.getReference())
                .numberOfPayments(obInternationalStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder3.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder3.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder3.getPurpose())
                .chargeBearer(obInternationalStandingOrder3.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder3.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(obInternationalStandingOrder3.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(obInternationalStandingOrder3.getDebtorAccount()))
                .creditor(obInternationalStandingOrder3.getCreditor())
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(obInternationalStandingOrder3.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(obInternationalStandingOrder3.getCreditorAccount()));
    }

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBInternationalStandingOrder1 obInternationalStandingOrder1) {
        return (new OBInternationalStandingOrder2())
                .frequency(obInternationalStandingOrder1.getFrequency())
                .reference(obInternationalStandingOrder1.getReference())
                .numberOfPayments(obInternationalStandingOrder1.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder1.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder1.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder1.getPurpose())
                .chargeBearer(obInternationalStandingOrder1.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder1.getCurrencyOfTransfer())
                .instructedAmount(obInternationalStandingOrder1.getInstructedAmount())
                .debtorAccount(obInternationalStandingOrder1.getDebtorAccount())
                .creditor(obInternationalStandingOrder1.getCreditor())
                .creditorAgent(obInternationalStandingOrder1.getCreditorAgent())
                .creditorAccount(obInternationalStandingOrder1.getCreditorAccount())
                .supplementaryData(null);
    }

    public static OBInternationalStandingOrder2 toOBInternationalStandingOrder2(OBInternationalStandingOrder3 obInternationalStandingOrder3) {
        return (new OBInternationalStandingOrder2())
                .frequency(obInternationalStandingOrder3.getFrequency())
                .reference(obInternationalStandingOrder3.getReference())
                .numberOfPayments(obInternationalStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder3.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder3.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder3.getPurpose())
                .chargeBearer(obInternationalStandingOrder3.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder3.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(obInternationalStandingOrder3.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(obInternationalStandingOrder3.getDebtorAccount()))
                .creditor(obInternationalStandingOrder3.getCreditor())
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(obInternationalStandingOrder3.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(obInternationalStandingOrder3.getCreditorAccount()))
                .supplementaryData(obInternationalStandingOrder3.getSupplementaryData());
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

    public static OBWriteInternationalStandingOrder4DataInitiation toOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder2 obInternationalStandingOrder2) {
        return obInternationalStandingOrder2 == null ? null : (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(obInternationalStandingOrder2.getFrequency())
                .reference(obInternationalStandingOrder2.getReference())
                .numberOfPayments(obInternationalStandingOrder2.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder2.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder2.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder2.getPurpose())
                .chargeBearer(obInternationalStandingOrder2.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder2.getCurrencyOfTransfer())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obInternationalStandingOrder2.getInstructedAmount()))
                .debtorAccount(toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(obInternationalStandingOrder2.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(obInternationalStandingOrder2.getCreditor()))
                .creditorAgent(OBInternationalIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(obInternationalStandingOrder2.getCreditorAgent()))
                .creditorAccount(toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(obInternationalStandingOrder2.getCreditorAccount()))
                .supplementaryData(obInternationalStandingOrder2.getSupplementaryData());
    }


    public static OBWriteInternationalStandingOrder4DataInitiation toOBWriteInternationalStandingOrder4DataInitiation(OBInternationalStandingOrder3 obInternationalStandingOrder3) {
        return obInternationalStandingOrder3 == null ? null : (new OBWriteInternationalStandingOrder4DataInitiation())
                .frequency(obInternationalStandingOrder3.getFrequency())
                .reference(obInternationalStandingOrder3.getReference())
                .numberOfPayments(obInternationalStandingOrder3.getNumberOfPayments())
                .firstPaymentDateTime(obInternationalStandingOrder3.getFirstPaymentDateTime())
                .finalPaymentDateTime(obInternationalStandingOrder3.getFinalPaymentDateTime())
                .purpose(obInternationalStandingOrder3.getPurpose())
                .chargeBearer(obInternationalStandingOrder3.getChargeBearer())
                .currencyOfTransfer(obInternationalStandingOrder3.getCurrencyOfTransfer())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obInternationalStandingOrder3.getInstructedAmount()))
                .debtorAccount(toOBWriteDomesticStandingOrder3DataInitiationDebtorAccount(obInternationalStandingOrder3.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(obInternationalStandingOrder3.getCreditor()))
                .creditorAgent(OBInternationalIdentifierConverter.toOBWriteInternationalStandingOrder4DataInitiationCreditorAgent(obInternationalStandingOrder3.getCreditorAgent()))
                .creditorAccount(toOBWriteInternationalStandingOrder4DataInitiationCreditorAccount(obInternationalStandingOrder3.getCreditorAccount()))
                .supplementaryData(obInternationalStandingOrder3.getSupplementaryData());
    }
}
