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
package uk.org.openbanking.testsupport.vrp;

import uk.org.openbanking.datamodel.vrp.namespace.OBExternalAccountIdentification4Code;
import uk.org.openbanking.datamodel.vrp.namespace.OBExternalLocalInstrument1Code;

public interface ConstantsVRPTestData {
    // Generic
    String CONSENT_PREFIX = "DVRP_";

    // Amount
    String GBP = "GBP";
    String AMOUNT = "10.01";

    // Account
    String ACCOUNT_SECONDARY_IDENTIFICATION = "11";
    String REFERENCE = "FRESCO-037";
    String UNSTRUCTURED = "Internal ops code 5120103";
    String SUPPLEMENTARY_DATA = "{}";
    String ACCOUNT_IDENTIFICATION = "08080021325698";
    String ACCOUNT_NAME = "Mr Tim Burgess";
    String ACCOUNT_SCHEME_NAME = OBExternalAccountIdentification4Code.SORT_CODE_ACCOUNT_NUMBER.getValue();

    // Instruction
    String INSTRUCTION_IDENTIFICATION = "32409753409ASFD";
    String END_TO_END_IDENTIFICATION = "12345678";
    String LOCAL_INSTRUMENT = OBExternalLocalInstrument1Code.BACS.getValue();

    // Address
    String BUILDING_NUMBER = "1";
    String STREET_NAME = "The Mall";
    String POSTCODE = "WC1 1AB";
    String TOWN_NAME = "London";
    String COUNTRY = "UK";
    String FUNDS_REFERENCE = "Funds Conf. reference";

}
