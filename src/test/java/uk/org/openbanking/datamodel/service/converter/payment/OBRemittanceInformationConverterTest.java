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

import org.junit.Test;
import uk.org.openbanking.datamodel.payment.OBRemittanceInformation1;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2DataInitiationRemittanceInformation;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBRemittanceInformation1;
import static uk.org.openbanking.datamodel.service.converter.payment.OBRemittanceInformationConverter.toOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;

/**
 * Unit test for {@link OBRemittanceInformationConverter}.
 */
public class OBRemittanceInformationConverterTest {

    @Test
    public void shouldConvertToOBRemittanceInformation1() {
        // Given
        OBWriteDomestic2DataInitiationRemittanceInformation source = aValidOBWriteDomestic2DataInitiationRemittanceInformation();

        // When
        OBRemittanceInformation1 converted = toOBRemittanceInformation1(source);

        // Then
        assertThat(converted.getReference()).isEqualTo(source.getReference());
        assertThat(converted.getUnstructured()).isEqualTo(source.getUnstructured());
    }

    @Test
    public void shouldConvertToOBWriteDomestic2DataInitiationRemittanceInformation() {
        // Given
        OBRemittanceInformation1 source = aValidOBRemittanceInformation1();

        // When
        OBWriteDomestic2DataInitiationRemittanceInformation converted = toOBWriteDomestic2DataInitiationRemittanceInformation(source);

        // Then
        assertThat(converted.getReference()).isEqualTo(source.getReference());
        assertThat(converted.getUnstructured()).isEqualTo(source.getUnstructured());
    }

    @Test
    public void shouldNotConvertToOBRemittanceInformation1GivenNull() {
        // Given
        OBWriteDomestic2DataInitiationRemittanceInformation source = null;

        // When
        OBRemittanceInformation1 converted = toOBRemittanceInformation1(source);

        // Then
        assertThat(converted).isNull();
    }

    @Test
    public void shouldNotConvertToOBWriteDomestic2DataInitiationRemittanceInformationGivenNull() {
        // Given
        OBRemittanceInformation1 source = null;

        // When
        OBWriteDomestic2DataInitiationRemittanceInformation converted = toOBWriteDomestic2DataInitiationRemittanceInformation(source);

        // Then
        assertThat(converted).isNull();
    }

}
