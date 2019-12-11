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
package uk.org.openbanking;

/**
 * All the constants defined by the Open Banking standard.
 */
public class OBConstants {
    public static final String JWT_BEARER_CLIENT_ASSERTION_TYPE =
            "urn:ietf:params:oauth:client-assertion-type:jwt-bearer";
    public static final String INTENT_ID_VALUE_PREFIX = "urn:alphabank:intent:";

    public static class IdTokenClaim {
        public static final String INTENT_ID = "openbanking_intent_id";
        public static final String ACR = "acr";
        public static final String C_HASH = "c_hash";
        public static final String S_HASH = "s_hash";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
    }

    public static class OIDCClaim {
        public static final String GRANT_TYPE = "grant_type";
        public static final String ID_TOKEN = "id_token";
        public static final String USER_INFO = "user_info";
        public static final String CLAIMS = "claims";
        public static final String CONSENT_APPROVAL_REDIRECT_URI = "consentApprovalRedirectUri";
        public static final String RESPONSE_TYPE = "response_type";
        public static final String CLIENT_ID = "client_id";
        public static final String REDIRECT_URI = "redirect_uri";
        public static final String REQUEST = "request";
        public static final String SCOPE = "scope";
        public static final String STATE = "state";
        public static final String NONCE = "nonce";
        public static final String SCOPE_REGISTER_PAYMENT = "registerPayment";
        public static final String SCOPE_OPENID = "openid";
        public static final String SCOPE_ACCOUNT = "account";
        public static final String CLIENT_ASSERTION_TYPE = "client_assertion_type";
        public static final String CLIENT_ASSERTION = "client_assertion";
        public static final String CODE = "code";
    }

    public static class Scope {
        public static final String REGISTER_PAYMENT = "registerPayment";
        public static final String OPENID = "openid";
        public static final String ACCOUNT = "account";
    }

    public static class ResponseType {
        public static final String CODE = "code";
        public static final String ID_TOKEN = "id_token";
    }

    public static class GrantType {
        public static final String CLIENT_CREDENTIAL = "client_credentials";
        public static final String AUTHORIZATION_CODE = "authorization_code";
    }
}
