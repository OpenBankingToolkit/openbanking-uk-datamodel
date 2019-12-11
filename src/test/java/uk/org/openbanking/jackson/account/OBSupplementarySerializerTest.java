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
package uk.org.openbanking.jackson.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OBSupplementarySerializerTest {

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void serialize() throws IOException {

        //Given
        String expectedValue = "{\"foo\":\"bar\"}";

        //When
        OBSupplementaryData1 obSupplementaryData1 = mapper.readValue(expectedValue, OBSupplementaryData1.class);
        String resultValue = mapper.writeValueAsString(obSupplementaryData1);

        //Then
        assertThat(expectedValue, is(resultValue));

    }
}