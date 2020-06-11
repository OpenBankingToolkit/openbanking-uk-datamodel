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
import uk.org.openbanking.datamodel.payment.OBBranchAndFinancialInstitutionIdentification3;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiationCreditorAgent;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBInternationalIdentifierConverter.toOBWriteInternational3DataInitiationCreditorAgent;
import static uk.org.openbanking.testsupport.payment.OBInternationalIdentifierTestDataFactory.aValidOBBranchAndFinancialInstitutionIdentification3;

/**
 * Unit test for {@link OBInternationalIdentifierConverter}.
 */
public class OBInternationalIdentifierConverterTest {

    @Test
    public void shouldConvertToOBWriteInternational3DataInitiationCreditorAgent() {
        // Given
        OBBranchAndFinancialInstitutionIdentification3 sourceIdentification = aValidOBBranchAndFinancialInstitutionIdentification3();

        // When
        OBWriteInternational3DataInitiationCreditorAgent converted = toOBWriteInternational3DataInitiationCreditorAgent(sourceIdentification);

        // Then
        assertThat(converted.getSchemeName()).isEqualTo(sourceIdentification.getSchemeName());
        assertThat(converted.getIdentification()).isEqualTo(sourceIdentification.getIdentification());
        assertThat(converted.getName()).isEqualTo(sourceIdentification.getName());
        assertThat(converted.getPostalAddress()).isEqualTo(sourceIdentification.getPostalAddress());
    }

    @Test
    public void shouldNotConvertToOBWriteInternational3DataInitiationCreditorAgentGivenNull() {
        // Given
        OBBranchAndFinancialInstitutionIdentification3 sourceIdentification = null;

        // When
        OBWriteInternational3DataInitiationCreditorAgent converted = toOBWriteInternational3DataInitiationCreditorAgent(sourceIdentification);

        // Then
        assertThat(converted).isNull();
    }

}
