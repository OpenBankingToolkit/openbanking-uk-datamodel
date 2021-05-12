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
package uk.org.openbanking.testsupport.payment;

import uk.org.openbanking.datamodel.payment.OBSCASupportData1;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataSCASupportData;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent4DataSCASupportData;

import java.util.UUID;

/**
 * Test data factory for the various "SCASupportData" classes.
 */
public class OBWriteDomesticScaSupportDataTestDataFactory {

    public static OBWriteDomesticConsent3DataSCASupportData aValidOBWriteDomesticConsent3DataSCASupportData() {
        return (new OBWriteDomesticConsent3DataSCASupportData())
                .appliedAuthenticationApproach(OBWriteDomesticConsent3DataSCASupportData.AppliedAuthenticationApproachEnum.CA)
                .referencePaymentOrderId(UUID.randomUUID().toString())
                .requestedSCAExemptionType(OBWriteDomesticConsent3DataSCASupportData.RequestedSCAExemptionTypeEnum.BILLPAYMENT);
    }

    public static OBWriteDomesticConsent4DataSCASupportData aValidOBWriteDomesticConsent4DataSCASupportData() {
        return (new OBWriteDomesticConsent4DataSCASupportData())
                .appliedAuthenticationApproach(OBWriteDomesticConsent4DataSCASupportData.AppliedAuthenticationApproachEnum.CA)
                .referencePaymentOrderId(UUID.randomUUID().toString())
                .requestedSCAExemptionType(OBWriteDomesticConsent4DataSCASupportData.RequestedSCAExemptionTypeEnum.BILLPAYMENT);
    }

    public static OBSCASupportData1 aValidOBSCASupportData1() {
        return (new OBSCASupportData1())
                .appliedAuthenticationApproach(OBSCASupportData1.AppliedAuthenticationApproachEnum.CA)
                .referencePaymentOrderId(UUID.randomUUID().toString())
                .requestedSCAExemptionType(OBSCASupportData1.RequestedSCAExemptionTypeEnum.BILLPAYMENT);
    }
}
