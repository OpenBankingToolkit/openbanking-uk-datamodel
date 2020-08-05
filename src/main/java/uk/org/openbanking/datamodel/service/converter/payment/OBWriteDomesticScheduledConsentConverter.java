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
import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent3DataAuthorisation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent4DataAuthorisation;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticScheduledConverter.toOBDomesticScheduled1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticScheduledConverter.toOBDomesticScheduled2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticScheduledConverter.toOBWriteDomesticScheduled2DataInitiation;

public class OBWriteDomesticScheduledConsentConverter {

    public static OBWriteDomesticScheduledConsent1 toOBWriteDomesticScheduledConsent1(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return (new OBWriteDomesticScheduledConsent1())
                .data(toOBWriteDataDomesticScheduledConsent1(obWriteDomesticScheduledConsent2.getData()))
                .risk(obWriteDomesticScheduledConsent2.getRisk());
    }

    public static OBWriteDomesticScheduledConsent1 toOBWriteDomesticScheduledConsent1(OBWriteDomesticScheduledConsent3 obWriteDomesticScheduledConsent3) {
        return (new OBWriteDomesticScheduledConsent1())
                .data(toOBWriteDataDomesticScheduledConsent1(obWriteDomesticScheduledConsent3.getData()))
                .risk(obWriteDomesticScheduledConsent3.getRisk());
    }

    public static OBWriteDomesticScheduledConsent1 toOBWriteDomesticScheduledConsent1(OBWriteDomesticScheduledConsent4 domesticScheduledConsent4) {
        return domesticScheduledConsent4 == null ? null : (new OBWriteDomesticScheduledConsent1())
                .data(toOBWriteDataDomesticScheduledConsent1(domesticScheduledConsent4.getData()))
                .risk(domesticScheduledConsent4.getRisk());
    }

    public static OBWriteDomesticScheduledConsent2 toOBWriteDomesticScheduledConsent2(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return (new OBWriteDomesticScheduledConsent2())
                .data(toOBWriteDataDomesticScheduledConsent2(obWriteDomesticScheduledConsent1.getData()))
                .risk(obWriteDomesticScheduledConsent1.getRisk());
    }

    public static OBWriteDomesticScheduledConsent3 toOBWriteDomesticScheduledConsent3(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return (new OBWriteDomesticScheduledConsent3())
                .data(toOBWriteDomesticScheduledConsent3Data(obWriteDomesticScheduledConsent2.getData()))
                .risk(obWriteDomesticScheduledConsent2.getRisk());
    }

    public static OBWriteDomesticScheduledConsent3 toOBWriteDomesticScheduledConsent3(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return (new OBWriteDomesticScheduledConsent3())
                .data(toOBWriteDomesticScheduledConsent3Data(obWriteDomesticScheduledConsent1.getData()))
                .risk(obWriteDomesticScheduledConsent1.getRisk());
    }

    public static OBWriteDomesticScheduledConsent4 toOBWriteDomesticScheduledConsent4(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return (new OBWriteDomesticScheduledConsent4())
                .data(toOBWriteDomesticScheduledConsent4Data(obWriteDomesticScheduledConsent1.getData()))
                .risk(obWriteDomesticScheduledConsent1.getRisk());
    }

    public static OBWriteDomesticScheduledConsent4 toOBWriteDomesticScheduledConsent4(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return (new OBWriteDomesticScheduledConsent4())
                .data(toOBWriteDomesticScheduledConsent4Data(obWriteDomesticScheduledConsent2.getData()))
                .risk(obWriteDomesticScheduledConsent2.getRisk());
    }

    public static OBWriteDomesticScheduled2 toOBWriteDomesticScheduled2(OBWriteDomesticScheduled1 obWriteDomesticScheduled1) {
        return (new OBWriteDomesticScheduled2())
                .data(toOBWriteDataDomesticScheduled2(obWriteDomesticScheduled1.getData()))
                .risk(obWriteDomesticScheduled1.getRisk());
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDataDomesticScheduledConsent2 data) {
        return data == null ? null : (new OBWriteDataDomesticScheduledConsent1())
                .permission(data.getPermission())
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDomesticScheduledConsent3Data data) {
        return data == null ? null : (new OBWriteDataDomesticScheduledConsent1())
                .permission(toOBExternalPermissions2Code(data.getPermission()))
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDomesticScheduledConsent4Data data) {
        return data == null ? null : (new OBWriteDataDomesticScheduledConsent1())
                .permission(toOBExternalPermissions2Code(data.getPermission()))
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticScheduledConsent2 toOBWriteDataDomesticScheduledConsent2(OBWriteDataDomesticScheduledConsent1 data) {
        return data == null ? null : (new OBWriteDataDomesticScheduledConsent2())
                .permission(data.getPermission())
                .initiation(toOBDomesticScheduled2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDomesticScheduledConsent3Data toOBWriteDomesticScheduledConsent3Data(OBWriteDataDomesticScheduledConsent1 data) {
        return data == null ? null : (new OBWriteDomesticScheduledConsent3Data())
                .permission(toOBWriteDomesticScheduledConsent3DataPermission(data.getPermission()))
                .initiation(toOBWriteDomesticScheduled2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticScheduledConsent4Data toOBWriteDomesticScheduledConsent4Data(OBWriteDataDomesticScheduledConsent1 data) {
        return data == null ? null : (new OBWriteDomesticScheduledConsent4Data())
                .permission(toOBWriteDomesticScheduledConsent4DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(toOBWriteDomesticScheduled2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticScheduledConsent4Data toOBWriteDomesticScheduledConsent4Data(OBWriteDataDomesticScheduledConsent2 data) {
        return data == null ? null : (new OBWriteDomesticScheduledConsent4Data())
                .permission(toOBWriteDomesticScheduledConsent4DataPermission(data.getPermission()))
                .readRefundAccount(null)
                .initiation(toOBWriteDomesticScheduled2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent4DataAuthorisation(data.getAuthorisation()))
                .scASupportData(null);
    }

    public static OBWriteDomesticScheduledConsent3Data toOBWriteDomesticScheduledConsent3Data(OBWriteDataDomesticScheduledConsent2 data) {
        return data == null ? null : (new OBWriteDomesticScheduledConsent3Data())
                .permission(toOBWriteDomesticScheduledConsent3DataPermission(data.getPermission()))
                .initiation(toOBWriteDomesticScheduled2DataInitiation(data.getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticScheduled2 toOBWriteDataDomesticScheduled2(OBWriteDataDomesticScheduled1 data) {
        return data == null ? null : (new OBWriteDataDomesticScheduled2())
                .consentId(data.getConsentId())
                .initiation(toOBDomesticScheduled2(data.getInitiation()));
    }

    public static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteDomesticScheduledConsent3Data.PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }

    private static OBExternalPermissions2Code toOBExternalPermissions2Code(OBWriteDomesticScheduledConsent4Data.PermissionEnum permission) {
        return permission == null ? null : OBExternalPermissions2Code.valueOf(permission.name());
    }

    public static OBWriteDomesticScheduledConsent3Data.PermissionEnum toOBWriteDomesticScheduledConsent3DataPermission(OBExternalPermissions2Code permission) {
        return permission == null ? null : OBWriteDomesticScheduledConsent3Data.PermissionEnum.valueOf(permission.name());
    }

    public static OBWriteDomesticScheduledConsent4Data.PermissionEnum toOBWriteDomesticScheduledConsent4DataPermission(OBExternalPermissions2Code permission) {
        return permission == null ? null : OBWriteDomesticScheduledConsent4Data.PermissionEnum.valueOf(permission.name());
    }

}
