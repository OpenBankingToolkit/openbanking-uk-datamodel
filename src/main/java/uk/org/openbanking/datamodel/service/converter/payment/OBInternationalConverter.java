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

public class OBInternationalConverter {

    public static OBInternational2 toOBInternational2(OBInternational1 obInternational1) {
        return new OBInternational2()
                .creditorAccount(obInternational1.getCreditorAccount())
                .debtorAccount(obInternational1.getDebtorAccount())
                .endToEndIdentification(obInternational1.getEndToEndIdentification())
                .instructedAmount(obInternational1.getInstructedAmount())
                .instructionIdentification(obInternational1.getInstructionIdentification())
                .localInstrument(obInternational1.getLocalInstrument())
                .remittanceInformation(obInternational1.getRemittanceInformation())
                .chargeBearer(obInternational1.getChargeBearer())
                .creditor(obInternational1.getCreditor())
                .creditorAgent(obInternational1.getCreditorAgent())
                .currencyOfTransfer(obInternational1.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternational1.getExchangeRateInformation())
                .instructionPriority(obInternational1.getInstructionPriority())
                ;
    }

    public static OBInternational1 toOBInternational1(OBInternational2 obInternational2) {
        return new OBInternational1()
                .creditorAccount(obInternational2.getCreditorAccount())
                .debtorAccount(obInternational2.getDebtorAccount())
                .endToEndIdentification(obInternational2.getEndToEndIdentification())
                .instructedAmount(obInternational2.getInstructedAmount())
                .instructionIdentification(obInternational2.getInstructionIdentification())
                .localInstrument(obInternational2.getLocalInstrument())
                .remittanceInformation(obInternational2.getRemittanceInformation())
                .chargeBearer(obInternational2.getChargeBearer())
                .creditor(obInternational2.getCreditor())
                .creditorAgent(obInternational2.getCreditorAgent())
                .currencyOfTransfer(obInternational2.getCurrencyOfTransfer())
                .exchangeRateInformation(obInternational2.getExchangeRateInformation())
                .instructionPriority(obInternational2.getInstructionPriority())
                ;
    }

    public static OBWriteInternationalConsent2 toOBWriteInternationalConsent2(OBWriteInternationalConsent1 obWriteInternationalConsent1) {
        return new OBWriteInternationalConsent2()
                .data(new OBWriteDataInternationalConsent2()
                        .authorisation(obWriteInternationalConsent1.getData().getAuthorisation())
                        .initiation(toOBInternational2(obWriteInternationalConsent1.getData().getInitiation()))
                )
                .risk(obWriteInternationalConsent1.getRisk());
    }

    public static OBWriteInternationalConsent1 toOBWriteInternationalConsent1(OBWriteInternationalConsent2 obWriteInternationalConsent2) {
        return new OBWriteInternationalConsent1()
                .data(new OBWriteDataInternationalConsent1()
                        .authorisation(obWriteInternationalConsent2.getData().getAuthorisation())
                        .initiation(toOBInternational1(obWriteInternationalConsent2.getData().getInitiation()))
                )
                .risk(obWriteInternationalConsent2.getRisk());
    }

    public static OBWriteInternational2 toOBWriteInternational2(OBWriteInternational1 obWriteInternational1) {
        return new OBWriteInternational2()
                .data(new OBWriteDataInternational2()
                        .consentId(obWriteInternational1.getData().getConsentId())
                        .initiation(toOBInternational2(obWriteInternational1.getData().getInitiation()))
                )
                .risk(obWriteInternational1.getRisk());
    }

    public static OBWriteInternational1 toOBWriteInternational1(OBWriteInternational2 obWriteInternational2) {
        return new OBWriteInternational1()
                .data(new OBWriteDataInternational1()
                        .consentId(obWriteInternational2.getData().getConsentId())
                        .initiation(toOBInternational1(obWriteInternational2.getData().getInitiation()))
                )
                .risk(obWriteInternational2.getRisk());
    }
}
