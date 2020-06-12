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
package uk.org.openbanking.datamodel.service.converter.account;

import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification3Code;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

public class OBExternalAccountIdentificationConverter {

    public static OBExternalAccountIdentification3Code toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code obExternalAccountIdentification4Code) {
        if (obExternalAccountIdentification4Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification4Code) {
            case PAN:
                return OBExternalAccountIdentification3Code.PAN;
            case IBAN:
                return OBExternalAccountIdentification3Code.IBAN;
            case SORTCODEACCOUNTNUMBER:
                return OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER;
            case BBAN:
            case PAYM:
            default:
                return null;
        }
    }

    public static OBExternalAccountIdentification3Code toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code obExternalAccountIdentification2Code) {
        if (obExternalAccountIdentification2Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification2Code) {
            case SortCodeAccountNumber:
                return OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER;
            default:
                return OBExternalAccountIdentification3Code.IBAN; // Existing default behaviour on 1.1
        }
    }

    public static OBExternalAccountIdentification4Code toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code obExternalAccountIdentification3Code) {
        if (obExternalAccountIdentification3Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification3Code) {
            case SORTCODEACCOUNTNUMBER:
                return OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER;
            case PAN:
                return OBExternalAccountIdentification4Code.PAN;
            default:
                return OBExternalAccountIdentification4Code.IBAN;
        }
    }

    public static OBExternalAccountIdentification4Code toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code obExternalAccountIdentification2Code) {
        if (obExternalAccountIdentification2Code==null) {
            return null;
        }
        switch (obExternalAccountIdentification2Code) {
            case SortCodeAccountNumber:
                return OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER;
            default:
                return OBExternalAccountIdentification4Code.IBAN;
        }
    }

}
