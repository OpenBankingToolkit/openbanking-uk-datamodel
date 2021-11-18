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
package uk.org.openbanking.testsupport.payment;

import uk.org.openbanking.datamodel.payment.OBRemittanceInformation1;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2DataInitiationRemittanceInformation;

/**
 * Test data factory for the various OB classes representing payment remittance information.
 */
public class OBRemittanceInformationTestDataFactory {

    public static OBWriteDomestic2DataInitiationRemittanceInformation aValidOBWriteDomestic2DataInitiationRemittanceInformation() {
        return (new OBWriteDomestic2DataInitiationRemittanceInformation())
                .unstructured("Internal ops code 5120103")
                .reference("FRESCO-037");
    }

    public static OBRemittanceInformation1 aValidOBRemittanceInformation1() {
        return (new OBRemittanceInformation1())
                .unstructured("Internal ops code 5120103")
                .reference("FRESCO-037");
    }
}
