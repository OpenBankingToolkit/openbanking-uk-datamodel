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

public class OBJoseHeaderClaims {

    /**
     * The algorithm that will be used for signing the JWS.
     *
     * The list of valid algorithms is here https://tools.ietf.org/html/rfc7518#section-3.1.
     *
     * The algorithms that will be supported by OB will be specified in the future.
     */
    public static final String ALG = "alg";

    /**
     * This must match the certificate id of the certificate selected in step 1.
     */
    public static final String KID = "kid";

    /**
     * This must have the boolean value false.
     *
     * This indicates that the message payload is not base64 url encoded.
     *
     * (See RFC 7797 – The “b64” header Parameter)
     */
    public static final String B64 = "b64";

    /**
     * This must be a JSON number representing the number of seconds from 1970-01-01T0:0:0Z as measured in UTC
     * until the date/time.
     *
     * This is a private header parameter name. (See RFC 7515 – Private Header Parameter Names)
     */
    public static final String OB_IAT = "http://openbanking.org.uk/iat";

    /**
     * This must be a string containing the id of the TPP. This must match the dn of the signing certificate.
     *
     * This is a private header parameter name. (See RFC 7515 – Private Header Parameter Names)
     */
    public static final String OB_ISS = "http://openbanking.org.uk/iss";

    /**
     *
     * This must be a string array consisting of the values “b64”, “http://openbanking.org.uk/iat“,
     * “http://openbanking.org.uk/iss“
     *
     * This indicates that the JWS signature validator must understand and process the three additional claims.
     */
    public static final String OB_CRIT = "crit";
}
