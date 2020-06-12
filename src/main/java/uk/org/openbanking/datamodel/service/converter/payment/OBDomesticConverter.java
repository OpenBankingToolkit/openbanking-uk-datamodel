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

import uk.org.openbanking.datamodel.payment.OBDomestic1;
import uk.org.openbanking.datamodel.payment.OBDomestic2;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationCreditorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAmountConverter.toOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBDomesticConverter {

    public static OBDomestic2 toOBDomestic2(OBDomestic1 domestic1) {
        return (new OBDomestic2())
                .creditorAccount(domestic1.getCreditorAccount())
                .creditorPostalAddress(domestic1.getCreditorPostalAddress())
                .debtorAccount(domestic1.getDebtorAccount())
                .endToEndIdentification(domestic1.getEndToEndIdentification())
                .instructedAmount(domestic1.getInstructedAmount())
                .instructionIdentification(domestic1.getInstructionIdentification())
                .localInstrument(domestic1.getLocalInstrument())
                .remittanceInformation(domestic1.getRemittanceInformation());
    }

    public static OBDomestic1 toOBDomestic1(OBDomestic2 domestic2) {
        return (new OBDomestic1())
                .creditorAccount(domestic2.getCreditorAccount())
                .creditorPostalAddress(domestic2.getCreditorPostalAddress())
                .debtorAccount(domestic2.getDebtorAccount())
                .endToEndIdentification(domestic2.getEndToEndIdentification())
                .instructedAmount(domestic2.getInstructedAmount())
                .instructionIdentification(domestic2.getInstructionIdentification())
                .localInstrument(domestic2.getLocalInstrument())
                .remittanceInformation(domestic2.getRemittanceInformation());
    }

    public static OBDomestic2 toOBDomestic2(OBWriteDomestic2DataInitiation initiation) {
        return initiation == null ? null : (new OBDomestic2())
                .creditorAccount(toOBCashAccount3(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .instructedAmount(toOBActiveOrHistoricCurrencyAndAmount(initiation.getInstructedAmount()))
                .instructionIdentification(initiation.getInstructionIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteDomestic2DataInitiation toOBWriteDomestic2DataInitiation(OBDomestic2 initiation) {
        return initiation == null ? null : (new OBWriteDomestic2DataInitiation())
                .instructionIdentification(initiation.getInstructionIdentification())
                .endToEndIdentification(initiation.getEndToEndIdentification())
                .localInstrument(initiation.getLocalInstrument())
                .instructedAmount(toOBWriteDomestic2DataInitiationInstructedAmount(initiation.getInstructedAmount()))
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .creditorAccount(toOBWriteDomestic2DataInitiationCreditorAccount(initiation.getCreditorAccount()))
                .creditorPostalAddress(initiation.getCreditorPostalAddress())
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }
}
