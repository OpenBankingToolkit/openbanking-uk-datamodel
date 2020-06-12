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

import uk.org.openbanking.datamodel.payment.OBDomesticScheduled1;
import uk.org.openbanking.datamodel.payment.OBDomesticScheduled2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduled2DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBDomesticScheduledConverter {

    public static OBDomesticScheduled2 toOBDomesticScheduled2(OBDomesticScheduled1 domesticScheduled1) {
        return (new OBDomesticScheduled2())
                .creditorAccount(domesticScheduled1.getCreditorAccount())
                .creditorPostalAddress(domesticScheduled1.getCreditorPostalAddress())
                .debtorAccount(domesticScheduled1.getDebtorAccount())
                .endToEndIdentification(domesticScheduled1.getEndToEndIdentification())
                .instructedAmount(domesticScheduled1.getInstructedAmount())
                .instructionIdentification(domesticScheduled1.getInstructionIdentification())
                .localInstrument(domesticScheduled1.getLocalInstrument())
                .remittanceInformation(domesticScheduled1.getRemittanceInformation())
                .requestedExecutionDateTime(domesticScheduled1.getRequestedExecutionDateTime());
    }

    public static OBDomesticScheduled1 toOBDomesticScheduled1(OBDomesticScheduled2 domesticScheduled2) {
        return (new OBDomesticScheduled1())
                .creditorAccount(domesticScheduled2.getCreditorAccount())
                .creditorPostalAddress(domesticScheduled2.getCreditorPostalAddress())
                .debtorAccount(domesticScheduled2.getDebtorAccount())
                .endToEndIdentification(domesticScheduled2.getEndToEndIdentification())
                .instructedAmount(domesticScheduled2.getInstructedAmount())
                .instructionIdentification(domesticScheduled2.getInstructionIdentification())
                .localInstrument(domesticScheduled2.getLocalInstrument())
                .remittanceInformation(domesticScheduled2.getRemittanceInformation())
                .requestedExecutionDateTime(domesticScheduled2.getRequestedExecutionDateTime());
    }

    public static OBDomesticScheduled1 toOBDomesticScheduled1(OBWriteDomesticScheduled2DataInitiation initiation) {
        return initiation == null ? null : (new OBDomesticScheduled1())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBDomesticScheduled2 toOBDomesticScheduled2(OBWriteDomesticScheduled2DataInitiation initiation) {
        return initiation == null ? null : (new OBDomesticScheduled2())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteDomesticScheduled2DataInitiation toOBWriteDomesticScheduled2DataInitiation(OBDomesticScheduled2 initiation) {
        return initiation == null ? null : (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }
}
