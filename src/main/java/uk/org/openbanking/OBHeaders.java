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

public class OBHeaders {

    /**
     * The unique id of the ASPSP to which the request is issued.
     *
     * The unique id will be issued by OB.
     *
     * If the value does not match the expected value (based on the Client ID or network certificate of the caller,
     * the ASPSP must reject the request with a 403 (Not Authorized) status code.
     */
    public static final String X_FAPI_FINANCIAL_ID = "x-fapi-financial-id";

    /**
     * The time when the PSU last logged in with the TPP.
     */
    public static final String X_FAPI_CUSTOMER_LAST_LOGGED_TIME = "x-fapi-customer-last-logged-time";

    /**
     * The PSU’s IP address if the PSU is currently logged in with the TPP.
     */
    public static final String X_FAPI_CUSTOMER_IP_ADDRESS = "x-fapi-customer-ip-address";

    /**
     * An RFC4122 UID used as a correlation id.
     *
     * If provided, the ASPSP must “play back” this value in the x-fapi-interaction-id response header.
     */
    public static final String X_FAPI_INTERACTION_ID = "x-fapi-interaction-id";

    /**
     * Standard HTTP Header; Allows Credentials to be provided to the Authorisation / Resource Server depending on the
     * type of resource being requested. For OAuth 2.0 / OIDC, this comprises of either the Basic /
     * Bearer Authentication Schemes.
     */
    public static final String AUTHORIZATION = "Authorization";

    /**
     * Standard HTTP Header; Represents the format of the payload being provided in the request.
     *
     * This must be set to application/json.
     */
    public static final String CONTENT_TYPE = "Content-Type";

    /**
     * Standard HTTP Header; Determine the Content-Type that is required from the Server.
     *
     * If set, it must have the value: application/json.
     *
     * If set to any other value, ASPSP must respond with a 406 Not Acceptable.
     *
     * Optional.
     */
    public static final String ACCEPT = "Accept";

    /**
     * Custom HTTP Header; Unique request identifier to support idempotency.
     *
     * Mandatory for POST requests.
     */
    public static final String X_IDEMPOTENCY_KEY = "x-idempotency-key";

    /**
     * Header containing a detached JWS signature of the body of the payload.
     *
     * Mandatory for requests that contain a payload.
     *
     * A policy decision is under consideration on whether API requests and responses will be digitally signed to
     * provide a simpler means of non-repudiation.
     *
     * This header will only be applicable if the policy decision is to implement non-repudiation through digital
     * signatures.
     */
    public static final String X_JWS_SIGNATURE = "x-jws-signature";

    /**
     * Header indicating the time (in seconds) that the TPP should wait before retrying an operation.
     *
     * The ASPSP should include this header along with responses with the HTTP status code of 429 (Too many requests).
     */
    public static final String RETRY_AFTER = "Retry-After";

}
