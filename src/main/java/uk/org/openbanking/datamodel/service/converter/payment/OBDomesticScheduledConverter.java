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

    public static OBDomesticScheduled1 toOBDomesticScheduled1(OBDomesticScheduled2 obDomesticScheduled2) {
        return obDomesticScheduled2 == null ? null : (new OBDomesticScheduled1())
                .instructionIdentification(obDomesticScheduled2.getInstructionIdentification())
                .endToEndIdentification(obDomesticScheduled2.getEndToEndIdentification())
                .localInstrument(obDomesticScheduled2.getLocalInstrument())
                .requestedExecutionDateTime(obDomesticScheduled2.getRequestedExecutionDateTime())
                .instructedAmount(obDomesticScheduled2.getInstructedAmount())
                .debtorAccount(obDomesticScheduled2.getDebtorAccount())
                .creditorAccount(obDomesticScheduled2.getCreditorAccount())
                .creditorPostalAddress(obDomesticScheduled2.getCreditorPostalAddress())
                .remittanceInformation(obDomesticScheduled2.getRemittanceInformation());
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

    public static OBDomesticScheduled2 toOBDomesticScheduled2(OBDomesticScheduled1 obDomesticScheduled1) {
        return obDomesticScheduled1 == null ? null : (new OBDomesticScheduled2())
                .instructionIdentification(obDomesticScheduled1.getInstructionIdentification())
                .endToEndIdentification(obDomesticScheduled1.getEndToEndIdentification())
                .localInstrument(obDomesticScheduled1.getLocalInstrument())
                .requestedExecutionDateTime(obDomesticScheduled1.getRequestedExecutionDateTime())
                .instructedAmount(obDomesticScheduled1.getInstructedAmount())
                .debtorAccount(obDomesticScheduled1.getDebtorAccount())
                .creditorAccount(obDomesticScheduled1.getCreditorAccount())
                .creditorPostalAddress(obDomesticScheduled1.getCreditorPostalAddress())
                .remittanceInformation(obDomesticScheduled1.getRemittanceInformation())
                .supplementaryData(null);
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

    public static OBWriteDomesticScheduled2DataInitiation toOBWriteDomesticScheduled2DataInitiation(OBDomesticScheduled1 obDomesticScheduled1) {
        return obDomesticScheduled1 == null ? null : (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(obDomesticScheduled1.getInstructionIdentification())
                .endToEndIdentification(obDomesticScheduled1.getEndToEndIdentification())
                .localInstrument(obDomesticScheduled1.getLocalInstrument())
                .requestedExecutionDateTime(obDomesticScheduled1.getRequestedExecutionDateTime())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obDomesticScheduled1.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(obDomesticScheduled1.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(obDomesticScheduled1.getCreditorAccount()))
                .creditorPostalAddress(obDomesticScheduled1.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(obDomesticScheduled1.getRemittanceInformation()))
                .supplementaryData(null);
    }

    public static OBWriteDomesticScheduled2DataInitiation toOBWriteDomesticScheduled2DataInitiation(OBDomesticScheduled2 obDomesticScheduled2) {
        return obDomesticScheduled2 == null ? null : (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(obDomesticScheduled2.getInstructionIdentification())
                .endToEndIdentification(obDomesticScheduled2.getEndToEndIdentification())
                .localInstrument(obDomesticScheduled2.getLocalInstrument())
                .requestedExecutionDateTime(obDomesticScheduled2.getRequestedExecutionDateTime())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(obDomesticScheduled2.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(obDomesticScheduled2.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(obDomesticScheduled2.getCreditorAccount()))
                .creditorPostalAddress(obDomesticScheduled2.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(obDomesticScheduled2.getRemittanceInformation()))
                .supplementaryData(obDomesticScheduled2.getSupplementaryData());
    }
}
