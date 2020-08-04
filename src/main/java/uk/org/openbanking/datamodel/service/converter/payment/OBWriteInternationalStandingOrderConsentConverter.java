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
import uk.org.openbanking.datamodel.payment.OBWriteInternationalStandingOrderConsent5Data.PermissionEnum;

import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalStandingOrderConverter.toOBInternationalStandingOrder1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalStandingOrderConverter.toOBInternationalStandingOrder2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalStandingOrderConverter.toOBInternationalStandingOrder3;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalStandingOrderConverter.toOBWriteInternationalStandingOrder4DataInitiation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBWriteDomesticConsentConverter.toOBWriteDomesticConsent4DataSCASupportData;

public class OBWriteInternationalStandingOrderConsentConverter {

    public static OBWriteInternationalStandingOrder1 toOBWriteInternationalStandingOrder1(OBWriteInternationalStandingOrder2 obWriteInternationalStandingOrder2) {
        return (new OBWriteInternationalStandingOrder1())
                .data(toOBWriteDataInternationalStandingOrder1(obWriteInternationalStandingOrder2.getData()))
                .risk(obWriteInternationalStandingOrder2.getRisk());
    }

    public static OBWriteInternationalStandingOrder2 toOBWriteInternationalStandingOrder2(OBWriteInternationalStandingOrder1 obWriteInternationalStandingOrder1) {
        return (new OBWriteInternationalStandingOrder2())
                .data(toOBWriteDataInternationalStandingOrder2(obWriteInternationalStandingOrder1.getData()))
                .risk(obWriteInternationalStandingOrder1.getRisk());
    }

    public static OBWriteInternationalStandingOrder3 toOBWriteInternationalStandingOrder3(OBWriteInternationalStandingOrder2 obWriteInternationalStandingOrder2) {
        return (new OBWriteInternationalStandingOrder3())
                .data(toOBWriteDataInternationalStandingOrder3(obWriteInternationalStandingOrder2.getData()))
                .risk(obWriteInternationalStandingOrder2.getRisk());
    }

    public static OBWriteInternationalStandingOrder3 toOBWriteInternationalStandingOrder3(OBWriteInternationalStandingOrder1 obWriteInternationalStandingOrder1) {
        return (new OBWriteInternationalStandingOrder3())
                .data(toOBWriteDataInternationalStandingOrder3(obWriteInternationalStandingOrder1.getData()))
                .risk(obWriteInternationalStandingOrder1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent1 toOBWriteInternationalStandingOrderConsent1(OBWriteInternationalStandingOrderConsent3 obWriteInternationalStandingOrderConsent3) {
        return (new OBWriteInternationalStandingOrderConsent1())
                .data(toOBWriteDataInternationalStandingOrderConsent1(obWriteInternationalStandingOrderConsent3.getData()))
                .risk(obWriteInternationalStandingOrderConsent3.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent1 toOBWriteInternationalStandingOrderConsent1(OBWriteInternationalStandingOrderConsent2 obWriteInternationalStandingOrderConsent2) {
        return (new OBWriteInternationalStandingOrderConsent1())
                .data(toOBWriteDataInternationalStandingOrderConsent1(obWriteInternationalStandingOrderConsent2.getData()))
                .risk(obWriteInternationalStandingOrderConsent2.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent2 toOBWriteInternationalStandingOrderConsent2(OBWriteInternationalStandingOrderConsent1 obWriteInternationalStandingOrderConsent1) {
        return (new OBWriteInternationalStandingOrderConsent2())
                .data(toOBWriteDataInternationalStandingOrderConsent2(obWriteInternationalStandingOrderConsent1.getData()))
                .risk(obWriteInternationalStandingOrderConsent1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent2 toOBWriteInternationalStandingOrderConsent2(OBWriteInternationalStandingOrderConsent3 obWriteInternationalStandingOrderConsent3) {
        return (new OBWriteInternationalStandingOrderConsent2())
                .data(toOBWriteDataInternationalStandingOrderConsent2(obWriteInternationalStandingOrderConsent3.getData()))
                .risk(obWriteInternationalStandingOrderConsent3.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent5 toOBWriteInternationalStandingOrderConsent5(OBWriteInternationalStandingOrderConsent1 obWriteInternationalStandingOrderConsent1) {
        return obWriteInternationalStandingOrderConsent1 == null ? null : (new OBWriteInternationalStandingOrderConsent5())
                .data(toOBWriteInternationalStandingOrderConsent5Data(obWriteInternationalStandingOrderConsent1.getData()))
                .risk(obWriteInternationalStandingOrderConsent1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent5 toOBWriteInternationalStandingOrderConsent5(OBWriteInternationalStandingOrderConsent2 consent2) {
        return (new OBWriteInternationalStandingOrderConsent5())
                .data(toOBWriteInternationalStandingOrderConsent5Data(consent2.getData()))
                .risk(consent2.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent5 toOBWriteInternationalStandingOrderConsent5(OBWriteInternationalStandingOrderConsent3 consent3) {
        return (new OBWriteInternationalStandingOrderConsent5())
                .data(toOBWriteInternationalStandingOrderConsent5Data(consent3.getData()))
                .risk(consent3.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent6 toOBWriteInternationalStandingOrderConsent6(OBWriteInternationalStandingOrderConsent1 obWriteInternationalStandingOrderConsent1) {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(toOBWriteInternationalStandingOrderConsent6Data(obWriteInternationalStandingOrderConsent1.getData()))
                .risk(obWriteInternationalStandingOrderConsent1.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent6 toOBWriteInternationalStandingOrderConsent6(OBWriteInternationalStandingOrderConsent2 obWriteInternationalStandingOrderConsent2) {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(toOBWriteInternationalStandingOrderConsent6Data(obWriteInternationalStandingOrderConsent2.getData()))
                .risk(obWriteInternationalStandingOrderConsent2.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent6 toOBWriteInternationalStandingOrderConsent6(OBWriteInternationalStandingOrderConsent3 obWriteInternationalStandingOrderConsent3) {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(toOBWriteInternationalStandingOrderConsent6Data(obWriteInternationalStandingOrderConsent3.getData()))
                .risk(obWriteInternationalStandingOrderConsent3.getRisk());
    }

    public static OBWriteInternationalStandingOrderConsent6 toOBWriteInternationalStandingOrderConsent6(OBWriteInternationalStandingOrderConsent5 obWriteInternationalStandingOrderConsent5) {
        return (new OBWriteInternationalStandingOrderConsent6())
                .data(toOBWriteInternationalStandingOrderConsent6Data(obWriteInternationalStandingOrderConsent5.getData()))
                .risk(obWriteInternationalStandingOrderConsent5.getRisk());
    }

    public static OBWriteDataInternationalStandingOrder1 toOBWriteDataInternationalStandingOrder1(OBWriteDataInternationalStandingOrder2 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrder1())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalStandingOrder1(data.getInitiation()));
    }

    public static OBWriteDataInternationalStandingOrder2 toOBWriteDataInternationalStandingOrder2(OBWriteDataInternationalStandingOrder1 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrder2())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalStandingOrder2(data.getInitiation()));
    }

    public static OBWriteDataInternationalStandingOrder3 toOBWriteDataInternationalStandingOrder3(OBWriteDataInternationalStandingOrder2 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrder3())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalStandingOrder3(data.getInitiation()));
    }

    public static OBWriteDataInternationalStandingOrder3 toOBWriteDataInternationalStandingOrder3(OBWriteDataInternationalStandingOrder1 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrder3())
                .consentId(data.getConsentId())
                .initiation(toOBInternationalStandingOrder3(data.getInitiation()));
    }

    public static OBWriteDataInternationalStandingOrderConsent1 toOBWriteDataInternationalStandingOrderConsent1(OBWriteDataInternationalStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrderConsent1())
                .permission(data.getPermission())
                .initiation(toOBInternationalStandingOrder1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataInternationalStandingOrderConsent1 toOBWriteDataInternationalStandingOrderConsent1(OBWriteDataInternationalStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrderConsent1())
                .permission(data.getPermission())
                .initiation(toOBInternationalStandingOrder1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataInternationalStandingOrderConsent2 toOBWriteDataInternationalStandingOrderConsent2(OBWriteDataInternationalStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrderConsent2())
                .permission(data.getPermission())
                .initiation(toOBInternationalStandingOrder2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataInternationalStandingOrderConsent2 toOBWriteDataInternationalStandingOrderConsent2(OBWriteDataInternationalStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteDataInternationalStandingOrderConsent2())
                .permission(data.getPermission())
                .initiation(toOBInternationalStandingOrder2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteInternationalStandingOrderConsent5Data toOBWriteInternationalStandingOrderConsent5Data(OBWriteDataInternationalStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(OBWriteInternationalStandingOrderConsent5Data.PermissionEnum.valueOf(data.getPermission().name()))
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalStandingOrderConsent5Data toOBWriteInternationalStandingOrderConsent5Data(OBWriteDataInternationalStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(toPermissionEnum(data.getPermission()))
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()));
    }

    public static OBWriteInternationalStandingOrderConsent5Data toOBWriteInternationalStandingOrderConsent5Data(OBWriteDataInternationalStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent5Data())
                .permission(toPermissionEnum(data.getPermission()))
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()));
    }

    public static OBWriteInternationalStandingOrderConsent6Data toOBWriteInternationalStandingOrderConsent6Data(OBWriteDataInternationalStandingOrderConsent1 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalStandingOrderConsent6Data.PermissionEnum.valueOf(data.getPermission().name()))
                .readRefundAccount(null)
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalStandingOrderConsent6Data toOBWriteInternationalStandingOrderConsent6Data(OBWriteDataInternationalStandingOrderConsent2 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalStandingOrderConsent6Data.PermissionEnum.valueOf(data.getPermission().name()))
                .readRefundAccount(null)
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalStandingOrderConsent6Data toOBWriteInternationalStandingOrderConsent6Data(OBWriteDataInternationalStandingOrderConsent3 data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalStandingOrderConsent6Data.PermissionEnum.valueOf(data.getPermission().name()))
                .readRefundAccount(null)
                .initiation(toOBWriteInternationalStandingOrder4DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteInternationalStandingOrderConsent6Data toOBWriteInternationalStandingOrderConsent6Data(OBWriteInternationalStandingOrderConsent5Data data) {
        return data == null ? null : (new OBWriteInternationalStandingOrderConsent6Data())
                .permission(OBWriteInternationalStandingOrderConsent6Data.PermissionEnum.valueOf(data.getPermission().name()))
                .readRefundAccount(null)
                .initiation(data.getInitiation())
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(toOBWriteDomesticConsent4DataSCASupportData(data.getScASupportData()));
    }

    public static PermissionEnum toPermissionEnum(OBExternalPermissions2Code permission) {
        return permission == null ? null : PermissionEnum.valueOf(permission.name());
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteInternationalStandingOrderConsent6Data.PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }
}
