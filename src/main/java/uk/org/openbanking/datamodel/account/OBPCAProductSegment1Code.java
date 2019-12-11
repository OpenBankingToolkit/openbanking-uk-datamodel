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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another.  Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd  With respect to PCA products, they are segmented in relation to different markets that they wish to focus on.
 */
public enum OBPCAProductSegment1Code {
    BASIC("Basic"),

    BENEFITANDREWARD("BenefitAndReward"),

    CREDITINTEREST("CreditInterest"),

    CASHBACK("Cashback"),

    GENERAL("General"),

    GRADUATE("Graduate"),

    OTHER("Other"),

    OVERDRAFT("Overdraft"),

    PACKAGED("Packaged"),

    PREMIUM("Premium"),

    REWARD("Reward"),

    STUDENT("Student"),

    YOUNGADULT("YoungAdult"),

    YOUTH("Youth");

    private String value;

    OBPCAProductSegment1Code(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBPCAProductSegment1Code fromValue(String text) {
        for (OBPCAProductSegment1Code b : OBPCAProductSegment1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}