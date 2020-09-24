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

import uk.org.openbanking.datamodel.account.OBCashAccount3;
import uk.org.openbanking.datamodel.payment.OBInternational1;
import uk.org.openbanking.datamodel.payment.OBInternational2;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.CountryCodeHelper.determineCountryCode;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBExchangeRateConverter.toOBExchangeRate1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBExchangeRateConverter.toOBWriteInternational3DataInitiationExchangeRateInformation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBBranchAndFinancialInstitutionIdentification3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBPartyIdentification43;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBWriteInternational3DataInitiationCreditor;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBWriteInternational3DataInitiationCreditorAgent;
import static uk.org.openbanking.datamodel.service.converter.payment.OBPriorityCodeConverter.toOBPriority2Code;
import static uk.org.openbanking.datamodel.service.converter.payment.OBPriorityCodeConverter.toOBWriteInternational3DataInitiationInstructionPriorityEnum;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBInternationalConverter {

    public static OBInternational1 toOBInternational1(OBInternational2 obInternational2) {
        return obInternational2 == null ? null : (new OBInternational1())
                .instructionIdentification(obInternational2.getInstructionIdentification())
                .endToEndIdentification(obInternational2.getEndToEndIdentification())
                .localInstrument(obInternational2.getLocalInstrument())
                .instructionPriority(obInternational2.getInstructionPriority())
                .purpose(obInternational2.getPurpose())
                .chargeBearer(obInternational2.getChargeBearer())
                .currencyOfTransfer(obInternational2.getCurrencyOfTransfer())
                .instructedAmount(obInternational2.getInstructedAmount())
                .exchangeRateInformation(obInternational2.getExchangeRateInformation())
                .debtorAccount(obInternational2.getDebtorAccount())
                .creditor(obInternational2.getCreditor())
                .creditorAgent(obInternational2.getCreditorAgent())
                .creditorAccount(obInternational2.getCreditorAccount())
                .remittanceInformation(obInternational2.getRemittanceInformation());
    }

    public static OBInternational1 toOBInternational1(OBWriteInternational3DataInitiation initiation) {
        return initiation == null ? null : (new OBInternational1())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBPriority2Code(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBExchangeRate1(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBInternational2 toOBInternational2(OBInternational1 obInternational1) {
        return obInternational1 == null ? null : (new OBInternational2())
                .instructionIdentification(obInternational1.getInstructionIdentification())
                .endToEndIdentification(obInternational1.getEndToEndIdentification())
                .localInstrument(obInternational1.getLocalInstrument())
                .instructionPriority(obInternational1.getInstructionPriority())
                .purpose(obInternational1.getPurpose())
                .chargeBearer(obInternational1.getChargeBearer())
                .currencyOfTransfer(obInternational1.getCurrencyOfTransfer())
                .instructedAmount(obInternational1.getInstructedAmount())
                .exchangeRateInformation(obInternational1.getExchangeRateInformation())
                .debtorAccount(obInternational1.getDebtorAccount())
                .creditor(obInternational1.getCreditor())
                .creditorAgent(obInternational1.getCreditorAgent())
                .creditorAccount(obInternational1.getCreditorAccount())
                .remittanceInformation(obInternational1.getRemittanceInformation())
                .supplementaryData(null);
    }

    public static OBInternational2 toOBInternational2(OBWriteInternational3DataInitiation initiation) {
        return initiation == null ? null : (new OBInternational2())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBPriority2Code(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBExchangeRate1(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditor(toOBPartyIdentification43(initiation.getCreditor()))
                .creditorAgent(toOBBranchAndFinancialInstitutionIdentification3(initiation.getCreditorAgent()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteInternational3DataInitiation toOBWriteInternational3DataInitiation(OBInternational1 initiation) {
        OBCashAccount3 creditorAccount = initiation.getCreditorAccount();
        return initiation == null ? null : (new OBWriteInternational3DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBWriteInternational3DataInitiationInstructionPriorityEnum(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .extendedPurpose(null)
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(determineCountryCode(creditorAccount.getSchemeName(), creditorAccount.getIdentification())) // to prevent validation error
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(toOBWriteInternational3DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(creditorAccount))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(null);
    }

    public static OBWriteInternational3DataInitiation toOBWriteInternational3DataInitiation(OBInternational2 initiation) {
        OBCashAccount3 creditorAccount = initiation.getCreditorAccount();
        return initiation == null ? null : (new OBWriteInternational3DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructionPriority(toOBWriteInternational3DataInitiationInstructionPriorityEnum(initiation.getInstructionPriority()))
                .purpose(initiation.getPurpose())
                .chargeBearer(initiation.getChargeBearer())
                .currencyOfTransfer(initiation.getCurrencyOfTransfer())
                .destinationCountryCode(determineCountryCode(creditorAccount.getSchemeName(), creditorAccount.getIdentification())) // to prevent validation error
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .exchangeRateInformation(toOBWriteInternational3DataInitiationExchangeRateInformation(initiation.getExchangeRateInformation()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditor(toOBWriteInternational3DataInitiationCreditor(initiation.getCreditor()))
                .creditorAgent(toOBWriteInternational3DataInitiationCreditorAgent(initiation.getCreditorAgent()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }
}
