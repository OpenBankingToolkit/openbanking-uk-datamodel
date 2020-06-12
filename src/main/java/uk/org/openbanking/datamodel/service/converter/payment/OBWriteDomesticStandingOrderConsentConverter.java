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
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder3;

public class OBWriteDomesticStandingOrderConsentConverter {

    public static OBWriteDomesticStandingOrder1 toOBWriteDomesticStandingOrder1(OBWriteDomesticStandingOrder2 obWriteDomesticStandingOrder2) {
        return (new OBWriteDomesticStandingOrder1())
                .data(toOBWriteDataDomesticStandingOrder1(obWriteDomesticStandingOrder2.getData()))
                .risk(obWriteDomesticStandingOrder2.getRisk());
    }

    public static OBWriteDomesticStandingOrder2 toOBWriteDomesticStandingOrder2(OBWriteDomesticStandingOrder1 obWriteDomesticStandingOrder1) {
        return (new OBWriteDomesticStandingOrder2())
                .data(toOBWriteDataDomesticStandingOrder2(obWriteDomesticStandingOrder1.getData()))
                .risk(obWriteDomesticStandingOrder1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return (new OBWriteDomesticStandingOrderConsent1())
                .data(toOBWriteDataDomesticStandingOrderConsent1(obWriteDomesticStandingOrderConsent2.getData()))
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(toOBWriteDataDomesticStandingOrderConsent2(obWriteDomesticStandingOrderConsent1.getData()))
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent3 toOBWriteDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent4 obWriteDomesticStandingOrderConsent4) {
        return (new OBWriteDomesticStandingOrderConsent3())
                .data(toOBWriteDataDomesticStandingOrderConsent3(obWriteDomesticStandingOrderConsent4.getData()))
                .risk(obWriteDomesticStandingOrderConsent4.getRisk());
    }

    public static OBWriteDataDomesticStandingOrder1 toOBWriteDataDomesticStandingOrder1(OBWriteDataDomesticStandingOrder2 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrder1())
                .consentId(data.getConsentId())
                .initiation(toOBDomesticStandingOrder1(data.getInitiation()));
    }

    public static OBWriteDataDomesticStandingOrder2 toOBWriteDataDomesticStandingOrder2(OBWriteDataDomesticStandingOrder1 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrder2())
                .consentId(data.getConsentId())
                .initiation(toOBDomesticStandingOrder2(data.getInitiation()));
    }

    public static OBWriteDataDomesticStandingOrderConsent1 toOBWriteDataDomesticStandingOrderConsent1(OBWriteDataDomesticStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent1())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent2 toOBWriteDataDomesticStandingOrderConsent2(OBWriteDataDomesticStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 toOBWriteDataDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent4Data data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(toOBExternalPermissions2Code(data))
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteDomesticStandingOrderConsent4Data data) {
        return data.getPermission() == null ? null : OBExternalPermissions2Code.valueOf(data.getPermission().name());
    }
}
