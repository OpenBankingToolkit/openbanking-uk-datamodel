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

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.OBAuthorisation1;
import uk.org.openbanking.datamodel.payment.OBExternalAuthorisation1Code;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataAuthorisation;

/**
 * Test data factory for various OB consent authorisation types.
 */
public class OBConsentAuthorisationTestDataFactory {

    public static OBAuthorisation1 aValidOBAuthorisation1() {
        return (new OBAuthorisation1())
                .authorisationType(OBExternalAuthorisation1Code.ANY)
                .completionDateTime(DateTime.now());
    }

    public static OBWriteDomesticConsent3DataAuthorisation aValidOBWriteDomesticConsent3DataAuthorisation() {
        return (new OBWriteDomesticConsent3DataAuthorisation())
                .authorisationType(OBWriteDomesticConsent3DataAuthorisation.AuthorisationTypeEnum.ANY)
                .completionDateTime(DateTime.now());
    }
}
