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
import uk.org.openbanking.datamodel.account.OBCashAccount3;
import uk.org.openbanking.datamodel.payment.OBWriteDomestic2DataInitiationDebtorAccount;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.openbanking.datamodel.service.converter.payment.OBAccountConverter.toOBCashAccount3;
import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.aValidOBWriteDomestic2DataInitiationDebtorAccount;

/**
 * Unit test for {@link OBAccountConverter}.
 */
public class OBAccountConverterTest {

    @Test
    public void shouldConvertToOBCashAccount3() {
        // Given
        OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = aValidOBWriteDomestic2DataInitiationDebtorAccount();

        // When
        OBCashAccount3 obCashAccount3 = toOBCashAccount3(debtorAccount);

        // Then
        assertThat(obCashAccount3.getSchemeName()).isEqualTo(debtorAccount.getSchemeName());
        assertThat(obCashAccount3.getIdentification()).isEqualTo(debtorAccount.getIdentification());
        assertThat(obCashAccount3.getName()).isEqualTo(debtorAccount.getName());
        assertThat(obCashAccount3.getSecondaryIdentification()).isEqualTo(debtorAccount.getSecondaryIdentification());
    }

    @Test
    public void shouldConvertToOBCashAccount3GivenNullField() {
        // Given
        OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = aValidOBWriteDomestic2DataInitiationDebtorAccount();
        debtorAccount.secondaryIdentification(null);

        // When
        OBCashAccount3 obCashAccount3 = toOBCashAccount3(debtorAccount);

        // Then
        assertThat(obCashAccount3.getSchemeName()).isEqualTo(debtorAccount.getSchemeName());
        assertThat(obCashAccount3.getIdentification()).isEqualTo(debtorAccount.getIdentification());
        assertThat(obCashAccount3.getName()).isEqualTo(debtorAccount.getName());
        assertThat(obCashAccount3.getSecondaryIdentification()).isNull();
    }

    @Test
    public void shouldNotConvertToOBCashAccount3GivenNullDebtorAccount() {
        // Given
        OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

        // When
        OBCashAccount3 obCashAccount3 = toOBCashAccount3(debtorAccount);

        // Then
        assertThat(obCashAccount3).isNull();
    }
}