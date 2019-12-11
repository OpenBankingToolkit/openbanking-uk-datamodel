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

import uk.org.openbanking.datamodel.payment.*;

public class OBInternationalScheduledConverter {

    public static OBInternationalScheduled2 toOBInternationalScheduled2(OBInternationalScheduled1 obInternationalScheduled1) {
        return new OBInternationalScheduled2()
                .creditorAccount(obInternationalScheduled1.getCreditorAccount())
                .debtorAccount(obInternationalScheduled1.getDebtorAccount())
                .endToEndIdentification(obInternationalScheduled1.getEndToEndIdentification())
                .instructedAmount(obInternationalScheduled1.getInstructedAmount())
                .instructionIdentification(obInternationalScheduled1.getInstructionIdentification())
                .localInstrument(obInternationalScheduled1.getLocalInstrument())
                .remittanceInformation(obInternationalScheduled1.getRemittanceInformation())
                .chargeBearer(obInternationalScheduled1.getChargeBearer())
                .creditor(obInternationalScheduled1.getCreditor())
                .creditorAgent(obInternationalScheduled1.getCreditorAgent())
                .currencyOfTransfer(obInternationalScheduled1.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternationalScheduled1.getExchangeRateInformation())
                .instructionPriority(obInternationalScheduled1.getInstructionPriority())
                .requestedExecutionDateTime(obInternationalScheduled1.getRequestedExecutionDateTime())
                ;
    }


    public static OBInternationalScheduled1 toOBInternationalScheduled1(OBInternationalScheduled2 obInternationalScheduled2) {
        return new OBInternationalScheduled1()
                .creditorAccount(obInternationalScheduled2.getCreditorAccount())
                .debtorAccount(obInternationalScheduled2.getDebtorAccount())
                .endToEndIdentification(obInternationalScheduled2.getEndToEndIdentification())
                .instructedAmount(obInternationalScheduled2.getInstructedAmount())
                .instructionIdentification(obInternationalScheduled2.getInstructionIdentification())
                .localInstrument(obInternationalScheduled2.getLocalInstrument())
                .remittanceInformation(obInternationalScheduled2.getRemittanceInformation())
                .chargeBearer(obInternationalScheduled2.getChargeBearer())
                .creditor(obInternationalScheduled2.getCreditor())
                .creditorAgent(obInternationalScheduled2.getCreditorAgent())
                .currencyOfTransfer(obInternationalScheduled2.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternationalScheduled2.getExchangeRateInformation())
                .instructionPriority(obInternationalScheduled2.getInstructionPriority())
                .requestedExecutionDateTime(obInternationalScheduled2.getRequestedExecutionDateTime())
                ;
    }

    public static OBWriteInternationalScheduledConsent2 toOBWriteInternationalScheduledConsent2(OBWriteInternationalScheduledConsent1 obWriteInternationalScheduledConsent1) {
        return new OBWriteInternationalScheduledConsent2()
                .data(new OBWriteDataInternationalScheduledConsent2()
                        .authorisation(obWriteInternationalScheduledConsent1.getData().getAuthorisation())
                        .initiation(toOBInternationalScheduled2(obWriteInternationalScheduledConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduledConsent1.getRisk());
    }

    public static OBWriteInternationalScheduledConsent1 toOBWriteInternationalScheduledConsent1(OBWriteInternationalScheduledConsent2 obWriteInternationalScheduledConsent2) {
        return new OBWriteInternationalScheduledConsent1()
                .data(new OBWriteDataInternationalScheduledConsent1()
                        .authorisation(obWriteInternationalScheduledConsent2.getData().getAuthorisation())
                        .initiation(toOBInternationalScheduled1(obWriteInternationalScheduledConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduledConsent2.getRisk());
    }

    public static OBWriteInternationalScheduled2 toOBWriteInternationalScheduled2(OBWriteInternationalScheduled1 obWriteInternationalScheduled1) {
        return new OBWriteInternationalScheduled2()
                .data(new OBWriteDataInternationalScheduled2()
                        .consentId(obWriteInternationalScheduled1.getData().getConsentId())
                        .initiation(toOBInternationalScheduled2(obWriteInternationalScheduled1.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduled1.getRisk());
    }

    public static OBWriteInternationalScheduled1 toOBWriteInternationalScheduled1(OBWriteInternationalScheduled2 obWriteInternationalScheduled2) {
        return new OBWriteInternationalScheduled1()
                .data(new OBWriteDataInternationalScheduled1()
                        .consentId(obWriteInternationalScheduled2.getData().getConsentId())
                        .initiation(toOBInternationalScheduled1(obWriteInternationalScheduled2.getData().getInitiation()))
                )
                .risk(obWriteInternationalScheduled2.getRisk());
    }

}
