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
package uk.org.openbanking.testsupport.customerinfo;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.account.OBExternalPermissions1Code;
import uk.org.openbanking.datamodel.account.OBReadConsent1;
import uk.org.openbanking.datamodel.account.OBReadData1;
import uk.org.openbanking.testsupport.account.OBRisk2TestDataFactory;

import java.util.List;


public class CustomerInfoTestDataFactory {

    public static OBReadConsent1 aValidCustomerInfoOBReadConsent1(){
        return (new OBReadConsent1()).data(aValidOBReadData1()).risk(OBRisk2TestDataFactory.aValidOBRisk2());
    }

    private static OBReadData1 aValidOBReadData1() {
        OBReadData1 obReadData1 = new OBReadData1();

        List<OBExternalPermissions1Code> permissions = List.of(OBExternalPermissions1Code.READCUSTOMERINFOCONSENT);
        obReadData1.setPermissions(permissions);
        obReadData1.setExpirationDateTime(new DateTime());
        obReadData1.setTransactionFromDateTime(new DateTime());
        obReadData1.setTransactionToDateTime(new DateTime());
        return obReadData1;
    }
}
