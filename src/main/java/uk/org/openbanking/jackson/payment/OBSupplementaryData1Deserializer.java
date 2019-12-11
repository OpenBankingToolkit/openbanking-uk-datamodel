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
package uk.org.openbanking.jackson.payment;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import uk.org.openbanking.datamodel.payment.OBSupplementaryData1;

import java.io.IOException;

public class OBSupplementaryData1Deserializer extends StdDeserializer<OBSupplementaryData1> {

    public OBSupplementaryData1Deserializer() {
        this(null);
    }

    public OBSupplementaryData1Deserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public OBSupplementaryData1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String data = jsonParser.readValueAsTree().toString();
        OBSupplementaryData1 obSupplementaryData1 = new OBSupplementaryData1();
        obSupplementaryData1.setData(data);
        return obSupplementaryData1;
    }
}
