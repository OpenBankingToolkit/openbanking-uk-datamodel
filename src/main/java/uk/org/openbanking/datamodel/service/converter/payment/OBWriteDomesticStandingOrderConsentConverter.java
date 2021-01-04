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
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBDomesticStandingOrder3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticStandingOrderConverter.toOBWriteDomesticStandingOrder3DataInitiation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteDomesticConsentConverter.toOBWriteDomesticConsent4DataSCASupportData;

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

    public static OBWriteDomesticStandingOrder3 toOBWriteDomesticStandingOrder3(OBWriteDomesticStandingOrder1 obWriteDomesticStandingOrder1) {
        return (new OBWriteDomesticStandingOrder3())
                .data(toOBWriteDomesticStandingOrder3Data(obWriteDomesticStandingOrder1.getData()))
                .risk(obWriteDomesticStandingOrder1.getRisk());
    }

    public static OBWriteDomesticStandingOrder3 toOBWriteDomesticStandingOrder3(OBWriteDomesticStandingOrder2 obWriteDomesticStandingOrder2) {
        return (new OBWriteDomesticStandingOrder3())
                .data(toOBWriteDomesticStandingOrder3Data(obWriteDomesticStandingOrder2.getData()))
                .risk(obWriteDomesticStandingOrder2.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return (new OBWriteDomesticStandingOrderConsent1())
                .data(toOBWriteDataDomesticStandingOrderConsent1(obWriteDomesticStandingOrderConsent2.getData()))
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent3 obWriteDomesticStandingOrderConsent3) {
        return (new OBWriteDomesticStandingOrderConsent1())
                .data(toOBWriteDataDomesticStandingOrderConsent1(obWriteDomesticStandingOrderConsent3.getData()))
                .risk(obWriteDomesticStandingOrderConsent3.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent1 toOBWriteDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent5 domesticStandingOrderConsent) {
        return (new OBWriteDomesticStandingOrderConsent1())
                .data(toOBWriteDataDomesticStandingOrderConsent1(domesticStandingOrderConsent.getData()))
                .risk(domesticStandingOrderConsent.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent5 domesticStandingOrderConsent) {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(toOBWriteDataDomesticStandingOrderConsent2(domesticStandingOrderConsent.getData()))
                .risk(domesticStandingOrderConsent.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent3 domesticStandingOrderConsent) {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(toOBWriteDataDomesticStandingOrderConsent2(domesticStandingOrderConsent.getData()))
                .risk(domesticStandingOrderConsent.getRisk());

    }

    public static OBWriteDomesticStandingOrderConsent2 toOBWriteDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return (new OBWriteDomesticStandingOrderConsent2())
                .data(toOBWriteDataDomesticStandingOrderConsent2(obWriteDomesticStandingOrderConsent1.getData()))
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent3 toOBWriteDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return obWriteDomesticStandingOrderConsent1 == null ? null : (new OBWriteDomesticStandingOrderConsent3())
                .data(toOBWriteDataDomesticStandingOrderConsent3(obWriteDomesticStandingOrderConsent1.getData()))
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent3 toOBWriteDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return (new OBWriteDomesticStandingOrderConsent3())
                .data(toOBWriteDataDomesticStandingOrderConsent3(obWriteDomesticStandingOrderConsent2.getData()))
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent3 toOBWriteDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent4 obWriteDomesticStandingOrderConsent4) {
        return (new OBWriteDomesticStandingOrderConsent3())
                .data(toOBWriteDataDomesticStandingOrderConsent3(obWriteDomesticStandingOrderConsent4.getData()))
                .risk(obWriteDomesticStandingOrderConsent4.getRisk());
    }

    public static OBWriteDomesticScheduledConsent4 toOBWriteDomesticScheduledConsent4(OBWriteDomesticScheduledConsent3 obWriteDomesticScheduledConsent3) {
        return obWriteDomesticScheduledConsent3 == null ? null : (new OBWriteDomesticScheduledConsent4())
                .data(toOBWriteDomesticScheduledConsent4Data(obWriteDomesticScheduledConsent3.getData()))
                .risk(obWriteDomesticScheduledConsent3.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent5 toOBWriteDomesticStandingOrderConsent5(OBWriteDomesticStandingOrderConsent1 obWriteDomesticStandingOrderConsent1) {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(toOBWriteDomesticStandingOrderConsent5Data(obWriteDomesticStandingOrderConsent1.getData()))
                .risk(obWriteDomesticStandingOrderConsent1.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent5 toOBWriteDomesticStandingOrderConsent5(OBWriteDomesticStandingOrderConsent2 obWriteDomesticStandingOrderConsent2) {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(toOBWriteDomesticStandingOrderConsent5Data(obWriteDomesticStandingOrderConsent2.getData()))
                .risk(obWriteDomesticStandingOrderConsent2.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent5 toOBWriteDomesticStandingOrderConsent5(OBWriteDomesticStandingOrderConsent3 obWriteDomesticStandingOrderConsent3) {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(toOBWriteDomesticStandingOrderConsent5Data(obWriteDomesticStandingOrderConsent3.getData()))
                .risk(obWriteDomesticStandingOrderConsent3.getRisk());
    }

    public static OBWriteDomesticStandingOrderConsent5 toOBWriteDomesticStandingOrderConsent5(OBWriteDomesticStandingOrderConsent4 obWriteDomesticStandingOrderConsent4) {
        return (new OBWriteDomesticStandingOrderConsent5())
                .data(toOBWriteDomesticStandingOrderConsent5Data(obWriteDomesticStandingOrderConsent4.getData()))
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

    public static OBWriteDataDomesticStandingOrder3 toOBWriteDataDomesticStandingOrder3(OBWriteDataDomesticStandingOrder1 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrder3())
                .consentId(data.getConsentId())
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()));
    }

    public static OBWriteDomesticStandingOrder3Data toOBWriteDomesticStandingOrder3Data(OBWriteDataDomesticStandingOrder1 data) {
        return data == null ? null : (new OBWriteDomesticStandingOrder3Data())
                .consentId(data.getConsentId())
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()));
    }

    public static OBWriteDomesticStandingOrder3Data toOBWriteDomesticStandingOrder3Data(OBWriteDataDomesticStandingOrder2 data) {
        return data == null ? null : (new OBWriteDomesticStandingOrder3Data())
                .consentId(data.getConsentId())
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()));
    }

    public static OBWriteDataDomesticStandingOrder3 toOBWriteDataDomesticStandingOrder3(OBWriteDataDomesticStandingOrder2 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrder3())
                .consentId(data.getConsentId())
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()));
    }

    public static OBWriteDataDomesticStandingOrderConsent1 toOBWriteDataDomesticStandingOrderConsent1(OBWriteDataDomesticStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent1())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent1 toOBWriteDataDomesticStandingOrderConsent1(OBWriteDataDomesticStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent1())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent1 toOBWriteDataDomesticStandingOrderConsent1(OBWriteDomesticStandingOrderConsent5Data data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent1())
                .permission(toOBExternalPermissions2Code(data.getPermission()))
                .initiation(toOBDomesticStandingOrder1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticStandingOrderConsent2 toOBWriteDataDomesticStandingOrderConsent2(OBWriteDomesticStandingOrderConsent5Data data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(toOBExternalPermissions2Code(data.getPermission()))
                .initiation(toOBDomesticStandingOrder2(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticStandingOrderConsent2 toOBWriteDataDomesticStandingOrderConsent2(OBWriteDataDomesticStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent2 toOBWriteDataDomesticStandingOrderConsent2(OBWriteDataDomesticStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent2())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 toOBWriteDataDomesticStandingOrderConsent3(OBWriteDataDomesticStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 toOBWriteDataDomesticStandingOrderConsent3(OBWriteDataDomesticStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(data.getPermission())
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticStandingOrderConsent3 toOBWriteDataDomesticStandingOrderConsent3(OBWriteDomesticStandingOrderConsent4Data data) {
        return data == null ? null : (new OBWriteDataDomesticStandingOrderConsent3())
                .permission(toOBExternalPermissions2Code(data.getPermission()))
                .initiation(toOBDomesticStandingOrder3(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDomesticScheduledConsent4Data toOBWriteDomesticScheduledConsent4Data(OBWriteDomesticScheduledConsent3Data data) {
        return data == null ? null : (new OBWriteDomesticScheduledConsent4Data())
                .permission(toOBWriteDomesticScheduledConsent4DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(toOBWriteDomesticConsent4DataSCASupportData(data.getScASupportData()));
    }

    public static OBWriteDomesticStandingOrderConsent5Data toOBWriteDomesticStandingOrderConsent5Data(OBWriteDataDomesticStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(toOBWriteDomesticScheduledConsent5DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticStandingOrderConsent5Data toOBWriteDomesticStandingOrderConsent5Data(OBWriteDataDomesticStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(toOBWriteDomesticScheduledConsent5DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticStandingOrderConsent5Data toOBWriteDomesticStandingOrderConsent5Data(OBWriteDataDomesticStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(toOBWriteDomesticScheduledConsent5DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(toOBWriteDomesticStandingOrder3DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                . scASupportData(null);
    }

    public static OBWriteDomesticStandingOrderConsent5Data toOBWriteDomesticStandingOrderConsent5Data(OBWriteDomesticStandingOrderConsent4Data data) {
        return data == null ? null : (new OBWriteDomesticStandingOrderConsent5Data())
                .permission(toOBWriteDomesticScheduledConsent5DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(toOBWriteDomesticConsent4DataSCASupportData(data.getScASupportData()));
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteDomesticStandingOrderConsent4Data.PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteDomesticStandingOrderConsent5Data.PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }

    public static OBWriteDomesticScheduledConsent4Data.PermissionEnum toOBWriteDomesticScheduledConsent4DataPermission(OBWriteDomesticScheduledConsent3Data.PermissionEnum permission) {
        return permission == null ? null : OBWriteDomesticScheduledConsent4Data.PermissionEnum.valueOf(permission.name());
    }

    public static OBWriteDomesticStandingOrderConsent5Data.PermissionEnum toOBWriteDomesticScheduledConsent5DataPermission(OBExternalPermissions2Code permission) {
        return permission == null ? null : OBWriteDomesticStandingOrderConsent5Data.PermissionEnum.valueOf(permission.name());
    }

    public static OBWriteDomesticStandingOrderConsent5Data.PermissionEnum toOBWriteDomesticScheduledConsent5DataPermission(OBWriteDomesticStandingOrderConsent4Data.PermissionEnum permission) {
        return permission == null ? null : OBWriteDomesticStandingOrderConsent5Data.PermissionEnum.valueOf(permission.name());
    }
}
