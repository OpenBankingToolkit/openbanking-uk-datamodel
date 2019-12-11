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
package uk.org.openbanking.datamodel.service.converter;

import org.junit.Test;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification3Code;
import uk.org.openbanking.datamodel.account.OBExternalAccountIdentification4Code;
import uk.org.openbanking.datamodel.payment.OBExternalAccountIdentification2Code;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class OBExternalAccountIdentificationConverterTest {

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification4Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER),
                is(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.IBAN),
                is(OBExternalAccountIdentification3Code.IBAN));


        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAN),
                is(OBExternalAccountIdentification3Code.PAN));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.BBAN),
                nullValue());

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification4Code.PAYM),
                nullValue());
    }

    @Test
    public void toOBExternalAccountIdentification3_fromOBExternalAccountIdentification2Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.SortCodeAccountNumber),
                is(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification3(OBExternalAccountIdentification2Code.IBAN),
                is(OBExternalAccountIdentification3Code.IBAN));
    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification2Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.SortCodeAccountNumber),
                is(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification2Code.IBAN),
                is(OBExternalAccountIdentification4Code.IBAN));

    }

    @Test
    public void toOBExternalAccountIdentification4_fromOBExternalAccountIdentification3Code() {
        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.SORTCODEACCOUNTNUMBER),
                is(OBExternalAccountIdentification4Code.SORTCODEACCOUNTNUMBER));

        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.IBAN),
                is(OBExternalAccountIdentification4Code.IBAN));


        assertThat(OBExternalAccountIdentificationConverter.toOBExternalAccountIdentification4(OBExternalAccountIdentification3Code.PAN),
                is(OBExternalAccountIdentification4Code.PAN));
    }
}