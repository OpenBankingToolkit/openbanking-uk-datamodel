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

import uk.org.openbanking.datamodel.payment.OBFile1;
import uk.org.openbanking.datamodel.payment.OBFile2;
import uk.org.openbanking.datamodel.payment.OBWriteFile2DataInitiation;

import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBWriteDomestic2DataInitiationDebtorAccount;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;

public class OBFileConverter {

    public static OBFile1 toOBFile1(OBFile2 obFile2) {
        return (new OBFile1())
                .controlSum(obFile2.getControlSum())
                .debtorAccount(obFile2.getDebtorAccount())
                .fileHash(obFile2.getFileHash())
                .fileReference(obFile2.getFileReference())
                .fileType(obFile2.getFileType())
                .localInstrument(obFile2.getLocalInstrument())
                .numberOfTransactions(obFile2.getNumberOfTransactions())
                .requestedExecutionDateTime(obFile2.getRequestedExecutionDateTime())
                .remittanceInformation(obFile2.getRemittanceInformation());
    }

    public static OBFile1 toOBFile1(OBWriteFile2DataInitiation initiation) {
        return initiation == null ? null : (new OBFile1())
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()));
    }

    public static OBFile2 toOBFile2(OBFile1 obFile1) {
        return (new OBFile2())
                .controlSum(obFile1.getControlSum())
                .debtorAccount(obFile1.getDebtorAccount())
                .fileHash(obFile1.getFileHash())
                .fileReference(obFile1.getFileReference())
                .fileType(obFile1.getFileType())
                .localInstrument(obFile1.getLocalInstrument())
                .numberOfTransactions(obFile1.getNumberOfTransactions())
                .requestedExecutionDateTime(obFile1.getRequestedExecutionDateTime())
                .remittanceInformation(obFile1.getRemittanceInformation())
                .supplementaryData(null);
    }

    public static OBFile2 toOBFile2(OBWriteFile2DataInitiation initiation) {
        return initiation == null ? null : (new OBFile2())
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBCashAccount3(initiation.getDebtorAccount()))
                .remittanceInformation(toOBRemittanceInformation1(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

    public static OBWriteFile2DataInitiation toOBWriteFile2DataInitiation(OBFile1 initiation) {
        return initiation == null ? null : (new OBWriteFile2DataInitiation())
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(null);
    }

    public static OBWriteFile2DataInitiation toOBWriteFile2DataInitiation(OBFile2 initiation) {
        return initiation == null ? null : (new OBWriteFile2DataInitiation())
                .fileType(initiation.getFileType())
                .fileHash(initiation.getFileHash())
                .fileReference(initiation.getFileReference())
                .numberOfTransactions(initiation.getNumberOfTransactions())
                .controlSum(initiation.getControlSum())
                .requestedExecutionDateTime(initiation.getRequestedExecutionDateTime())
                .localInstrument(initiation.getLocalInstrument())
                .debtorAccount(toOBWriteDomestic2DataInitiationDebtorAccount(initiation.getDebtorAccount()))
                .remittanceInformation(toOBWriteDomestic2DataInitiationRemittanceInformation(initiation.getRemittanceInformation()))
                .supplementaryData(initiation.getSupplementaryData());
    }

}
