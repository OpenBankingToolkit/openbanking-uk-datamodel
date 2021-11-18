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
package uk.org.openbanking.datamodel.service.converter.account;

import uk.org.openbanking.datamodel.account.OBExternalProductType1Code;
import uk.org.openbanking.datamodel.account.OBExternalProductType2Code;
import uk.org.openbanking.datamodel.account.OBProduct1;
import uk.org.openbanking.datamodel.account.OBProduct2;

/**
 * Convert OB product data-model in different version
 */
public class OBProductConverter {

    /**
     * Convert a product in V2 to V1
     * @param obProduct2 product in V2 format
     * @return product in V1 format
     */
    public static OBProduct1 toProduct1(OBProduct2 obProduct2) {
        OBProduct1 product1 = new OBProduct1()
                .accountId(obProduct2.getAccountId())
                .productType(OBExternalProductType1Code.valueOf(obProduct2.getProductType().toString()));


        if (obProduct2.getProductId() != null) {
            product1.productIdentifier(obProduct2.getProductId());
        }
        if (obProduct2.getProductName() != null) {
            product1.productName(obProduct2.getProductName());
        }
        if (obProduct2.getSecondaryProductId() != null) {
            product1.secondaryProductIdentifier(obProduct2.getSecondaryProductId());
        }

        return product1;
    }

    /**
     * Convert a product in V2 to V1
     * @param obProduct2V3 product in V2 format
     * @return product in V1 format
     */
    public static OBProduct2 toProductBeforeV3(OBProduct2 obProduct2V3) {

        OBProduct2 product2 = new OBProduct2()
                .accountId(obProduct2V3.getAccountId());

        switch (obProduct2V3.getProductType()) {
            case BUSINESSCURRENTACCOUNT:
                product2.setProductType(OBExternalProductType2Code.BCA);
                break;
            case PERSONALCURRENTACCOUNT:
                product2.setProductType(OBExternalProductType2Code.PCA);
                break;
        }

        if (obProduct2V3.getProductId() != null) {
            product2.productId(obProduct2V3.getProductId());
        }
        if (obProduct2V3.getProductName() != null) {
            product2.productName(obProduct2V3.getProductName());
        }
        if (obProduct2V3.getSecondaryProductId() != null) {
            product2.secondaryProductId(obProduct2V3.getSecondaryProductId());
        }

        return product2;
    }

    /**
     * Convert a product in V1 to V2
     * @param obProduct1 product in V1 format
     * @return product in V2 format
     */
    public static OBProduct2 toProduct2(OBProduct1 obProduct1) {
        OBProduct2 product2 = new OBProduct2()
                .accountId(obProduct1.getAccountId())
                .productType(OBExternalProductType2Code.valueOf(obProduct1.getProductType().toString()));

        if (obProduct1.getProductIdentifier() != null) {
            product2.productId(obProduct1.getProductIdentifier());
        }
        if (obProduct1.getProductName() != null) {
            product2.productName(obProduct1.getProductName());
        }
        if (obProduct1.getSecondaryProductIdentifier() != null) {
            product2.secondaryProductId(obProduct1.getSecondaryProductIdentifier());
        }

        return product2;
    }
}
