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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import org.junit.Before;
import org.junit.Test;
import uk.org.openbanking.datamodel.account.OBRisk2;
import uk.org.openbanking.datamodel.payment.OBRisk1;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OBRiskTest {

    private ObjectMapper mapper = new ObjectMapper();
    private Validator validator;

    @Before
    public void setUp() {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void serialize() throws IOException {

        //Given
        String expectedValue = "{" +
                "\"PaymentContextCode\":\"EcommerceGoods\"," +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        OBRisk1 obRisk1 = mapper.readValue(expectedValue, OBRisk1.class);
        Set<ConstraintViolation<OBRisk1>> violations = validator.validate(obRisk1);
        assertTrue(violations.isEmpty());
        String resultValue = mapper.writeValueAsString(obRisk1);

        //Then
        assertThat(expectedValue, is(resultValue));
    }

    @Test
    public void paymentContextCodeNotSpecified() throws IOException {

        //Given
        String expectedValue = "{" +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        OBRisk1 obRisk1 = mapper.readValue(expectedValue, OBRisk1.class);
        Set<ConstraintViolation<OBRisk1>> violations = validator.validate(obRisk1);
        assertTrue(violations.isEmpty());
        String resultValue = mapper.writeValueAsString(obRisk1);

        //Then
        assertThat(expectedValue, is(resultValue));
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testInvalidPaymentContext() throws IOException {

        //Given
        String expectedValue = "{" +
                "\"PaymentContextCode\":\"wrongValue\"," +
                "\"MerchantCategoryCode\":\"5967\"," +
                "\"MerchantCustomerIdentification\":\"053598653254\"," +
                "\"DeliveryAddress\":{" +
                "\"AddressLine\":[" +
                "\"Flat 7\"," +
                "\"Acacia Lodge\"" +
                "]," +
                "\"StreetName\":\"Acacia Avenue\"," +
                "\"BuildingNumber\":\"27\"," +
                "\"PostCode\":\"GU31 2ZZ\"," +
                "\"TownName\":\"Sparsholt\"," +
                "\"CountrySubDivision\":\"Wessex\"," +
                "\"Country\":\"UK\"" +
                "}" +
                "}";

        //When
        mapper.readValue(expectedValue, OBRisk1.class);

        //Then
        //exception should be throw
    }
}
