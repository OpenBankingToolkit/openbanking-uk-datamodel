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

import uk.org.openbanking.datamodel.payment.OBExternalPermissions2Code;
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticScheduledConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticScheduledConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3Data;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3Data.PermissionEnum;

import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBAuthorisation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBWriteDomesticConsent3DataAuthorisation;
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

    public static OBWriteDomesticScheduledConsent2 toOBWriteDomesticScheduledConsent2(OBWriteDomesticScheduledConsent1 obWriteDomesticScheduledConsent1) {
        return (new OBWriteDomesticScheduledConsent2())
                .data(toOBWriteDataDomesticScheduledConsent2(obWriteDomesticScheduledConsent1.getData()))
                .risk(obWriteDomesticScheduledConsent1.getRisk());
    }

    public static OBWriteDomesticScheduledConsent3 toOBWriteDomesticScheduledConsent3(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return (new OBWriteDomesticScheduledConsent3())
                .data(toOBWriteDomesticScheduledConsent3Data(obWriteDomesticScheduledConsent2))
                .risk(obWriteDomesticScheduledConsent2.getRisk());
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDataDomesticScheduledConsent2 data) {
        return (new OBWriteDataDomesticScheduledConsent1())
                .permission(OBExternalPermissions2Code.valueOf(data.getPermission().name()))
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDomesticScheduledConsent3Data data) {
        return (new OBWriteDataDomesticScheduledConsent1())
                .permission(OBExternalPermissions2Code.valueOf(data.getPermission().name()))
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

    public static OBWriteDataDomesticScheduledConsent2 toOBWriteDataDomesticScheduledConsent2(OBWriteDataDomesticScheduledConsent1 data) {
        return (new OBWriteDataDomesticScheduledConsent2())
                .permission(OBExternalPermissions2Code.valueOf(data.getPermission().name()))
                .initiation(toOBDomesticScheduled2(data.getInitiation()))
                .authorisation(data.getAuthorisation());
    }

    public static OBWriteDomesticScheduledConsent3Data toOBWriteDomesticScheduledConsent3Data(OBWriteDomesticScheduledConsent2 obWriteDomesticScheduledConsent2) {
        return obWriteDomesticScheduledConsent2.getData() == null ? null : (new OBWriteDomesticScheduledConsent3Data())
                .permission(toPermissionEnum(obWriteDomesticScheduledConsent2.getData()))
                .initiation(toOBWriteDomesticScheduled2DataInitiation(obWriteDomesticScheduledConsent2.getData().getInitiation()))
                .authorisation(toOBWriteDomesticConsent3DataAuthorisation(obWriteDomesticScheduledConsent2.getData().getAuthorisation()));
    }

    public static PermissionEnum toPermissionEnum(OBWriteDataDomesticScheduledConsent2 data) {
        return data.getPermission() == null ? null : PermissionEnum.valueOf(data.getPermission().name());
    }

}
