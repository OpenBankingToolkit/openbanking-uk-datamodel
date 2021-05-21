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

import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBAuthorisation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticConverter.*;

public class OBWriteDomesticConsentConverter {

    public static OBWriteDomesticConsent1 toOBWriteDomesticConsent1(OBWriteDomesticConsent2 obWriteDomesticConsent2) {
        return (new OBWriteDomesticConsent1())
                .data(toOBWriteDataDomesticConsent1(obWriteDomesticConsent2.getData()))
                .risk(obWriteDomesticConsent2.getRisk());
    }

    public static OBWriteDomesticConsent1 toOBWriteDomesticConsent1(OBWriteDomesticConsent4 domesticConsent4) {
        return domesticConsent4 == null ? null : (new OBWriteDomesticConsent1())
                .data(toOBWriteDataDomesticConsent1(domesticConsent4.getData()))
                .risk(domesticConsent4.getRisk());
    }

    public static OBWriteDomesticConsent2 toOBWriteDomesticConsent2(OBWriteDomesticConsent1 obWriteDomesticConsent1) {
        return (new OBWriteDomesticConsent2())
                .data(toOBWriteDataDomesticConsent2(obWriteDomesticConsent1.getData()))
                .risk(obWriteDomesticConsent1.getRisk());
    }

    public static OBWriteDomesticConsent2 toOBWriteDomesticConsent2(OBWriteDomesticConsent3 obWriteDomesticConsent3) {
        return (new OBWriteDomesticConsent2())
                .data(toOBWriteDataDomesticConsent2(obWriteDomesticConsent3.getData()))
                .risk(obWriteDomesticConsent3.getRisk());
    }

    public static OBWriteDomesticConsent2 toOBWriteDomesticConsent2(OBWriteDomesticConsent4 obWriteDomesticConsent4) {
        return (new OBWriteDomesticConsent2())
                .data(toOBWriteDataDomesticConsent2(obWriteDomesticConsent4.getData()))
                .risk(obWriteDomesticConsent4.getRisk());
    }

    public static OBWriteDomesticConsent4 toOBWriteDomesticConsent4(OBWriteDomesticConsent1 obWriteDomesticConsent1) {
        return (new OBWriteDomesticConsent4())
                .data(toOBWriteDomesticConsent4Data(obWriteDomesticConsent1.getData()))
                .risk(obWriteDomesticConsent1.getRisk());
    }

    public static OBWriteDomesticConsent4 toOBWriteDomesticConsent4(OBWriteDomesticConsent2 obWriteDomesticConsent2) {
        return (new OBWriteDomesticConsent4())
                .data(toOBWriteDomesticConsent4Data(obWriteDomesticConsent2.getData()))
                .risk(obWriteDomesticConsent2.getRisk());
    }

    public static OBWriteDomesticConsent4 toOBWriteDomesticConsent4(OBWriteDomesticConsent3 obWriteDomesticConsent3) {
        return obWriteDomesticConsent3 == null ? null : (new OBWriteDomesticConsent4())
                .data(toOBWriteDomesticConsent4Data(obWriteDomesticConsent3.getData()))
                .risk(obWriteDomesticConsent3.getRisk());
    }

    public static OBWriteDomestic2 toOBWriteDomestic2(OBWriteDomestic1 obWriteDomestic1) {
        return (new OBWriteDomestic2())
                .data(toOBWriteDataDomestic2(obWriteDomestic1.getData()))
                .risk(obWriteDomestic1.getRisk());
    }

    public static OBWriteDataDomesticConsent1 toOBWriteDataDomesticConsent1(OBWriteDataDomesticConsent2 data) {
        return data == null ? null : (new OBWriteDataDomesticConsent1())
                .initiation(toOBDomestic1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticConsent1 toOBWriteDataDomesticConsent1(OBWriteDomesticConsent4Data data) {
        return data == null ? null : (new OBWriteDataDomesticConsent1())
                .initiation(toOBDomestic1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticConsent2 toOBWriteDataDomesticConsent2(OBWriteDataDomesticConsent1 data) {
        return data == null ? null : (new OBWriteDataDomesticConsent2())
                .initiation(toOBDomestic2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticConsent2 toOBWriteDataDomesticConsent2(OBWriteDomesticConsent4Data data) {
        return data == null ? null : (new OBWriteDataDomesticConsent2())
                .initiation(toOBDomestic2(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDomesticConsent4Data toOBWriteDomesticConsent4Data(OBWriteDataDomesticConsent2 data) {
        return data == null ? null : (new OBWriteDomesticConsent4Data())
                .readRefundAccount(null)
                .initiation(toOBWriteDomestic2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticConsent4Data toOBWriteDomesticConsent4Data(OBWriteDomesticConsent3Data data) {
        return data == null ? null : (new OBWriteDomesticConsent4Data())
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(toOBSCASupportData1(data.getScASupportData()));
    }

    public static OBWriteDataDomesticConsent2 toOBWriteDataDomesticConsent2(OBWriteDomesticConsent3Data data) {
        return data == null ? null : (new OBWriteDataDomesticConsent2())
                .initiation(toOBDomestic2(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDomesticConsent4Data toOBWriteDomesticConsent4Data(OBWriteDataDomesticConsent1 data) {
        return data == null ? null : (new OBWriteDomesticConsent4Data())
                .readRefundAccount(null)
                .initiation(toOBWriteDomestic2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDataDomestic2 toOBWriteDataDomestic2(OBWriteDataDomestic1 data) {
        return data == null ? null : (new OBWriteDataDomestic2())
                .consentId(data.getConsentId())
                .initiation(toOBDomestic2(data.getInitiation()));
    }

    public static OBWriteDomesticConsent3DataSCASupportData toOBWriteDomesticConsent3DataSCASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        return scASupportData == null ? null : (new OBWriteDomesticConsent3DataSCASupportData())
                .requestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType())
                .appliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach())
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static OBWriteDomesticConsent4DataSCASupportData toOBWriteDomesticConsent4DataSCASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
        return scASupportData == null ? null : (new OBWriteDomesticConsent4DataSCASupportData())
                .requestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType())
                .appliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach())
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static OBSCASupportData1 toOBSCASupportData1(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
        return scASupportData == null ? null : (new OBSCASupportData1())
                .requestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType())
                .appliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach())
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }
}
