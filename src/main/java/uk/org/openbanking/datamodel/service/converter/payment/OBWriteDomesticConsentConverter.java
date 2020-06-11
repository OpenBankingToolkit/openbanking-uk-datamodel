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
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDataDomesticScheduledConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent2;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3Data;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent1;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticScheduledConsent3Data;

import static uk.org.openbanking.datamodel.service.converter.payment.OBConsentAuthorisationConverter.toOBAuthorisation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticConverter.toOBDomestic2;
import static uk.org.openbanking.datamodel.service.converter.payment.OBDomesticScheduledConverter.toOBDomesticScheduled1;

public class OBWriteDomesticConsentConverter {

    public static OBWriteDomesticConsent2 toOBWriteDomesticConsent2(OBWriteDomesticConsent3 obWriteDomesticConsent3) {
        return (new OBWriteDomesticConsent2())
                .data(toOBWriteDataDomesticConsent2(obWriteDomesticConsent3.getData()))
                .risk(obWriteDomesticConsent3.getRisk());
    }

    public static OBWriteDomesticScheduledConsent1 toOBWriteDomesticScheduledConsent1(OBWriteDomesticScheduledConsent3 domesticScheduledConsent3) {
        return (new OBWriteDomesticScheduledConsent1())
                .data(toOBWriteDataDomesticScheduledConsent1(domesticScheduledConsent3.getData()))
                .risk(domesticScheduledConsent3.getRisk());
    }

    public static OBWriteDataDomesticConsent2 toOBWriteDataDomesticConsent2(OBWriteDomesticConsent3Data data) {
        return data == null ? null : (new OBWriteDataDomesticConsent2())
                .authorisation(toOBAuthorisation1(data.getAuthorisation()))
                .initiation(toOBDomestic2(data.getInitiation()));
    }

    public static OBWriteDataDomesticScheduledConsent1 toOBWriteDataDomesticScheduledConsent1(OBWriteDomesticScheduledConsent3Data data) {
        return (new OBWriteDataDomesticScheduledConsent1())
                .permission(OBExternalPermissions2Code.valueOf(data.getPermission().name()))
                .initiation(toOBDomesticScheduled1(data.getInitiation()))
                .authorisation(toOBAuthorisation1(data.getAuthorisation()));
    }

}
