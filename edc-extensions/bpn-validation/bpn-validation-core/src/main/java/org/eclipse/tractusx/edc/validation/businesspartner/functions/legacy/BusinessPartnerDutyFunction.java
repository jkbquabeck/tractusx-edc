/*
 *
 *   Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft
 *
 *   See the NOTICE file(s) distributed with this work for additional
 *   information regarding copyright ownership.
 *
 *   This program and the accompanying materials are made available under the
 *   terms of the Apache License, Version 2.0 which is available at
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *   License for the specific language governing permissions and limitations
 *   under the License.
 *
 *   SPDX-License-Identifier: Apache-2.0
 *
 */

package org.eclipse.tractusx.edc.validation.businesspartner.functions.legacy;

import org.eclipse.edc.policy.engine.spi.AtomicConstraintFunction;
import org.eclipse.edc.policy.engine.spi.PolicyContext;
import org.eclipse.edc.policy.model.Duty;
import org.eclipse.edc.policy.model.Operator;
import org.eclipse.edc.spi.monitor.Monitor;

/**
 * AtomicConstraintFunction to validate business partner numbers for edc duties.
 *
 * @deprecated Please use {@code BusinessPartnerGroupFunction} instead
 */
@Deprecated(forRemoval = true, since = "0.5.0")
public class BusinessPartnerDutyFunction extends AbstractBusinessPartnerValidation
        implements AtomicConstraintFunction<Duty> {

    public BusinessPartnerDutyFunction(Monitor monitor, boolean shouldLogOnAgreementEvaluation) {
        super(monitor, shouldLogOnAgreementEvaluation);
    }

    @Override
    public boolean evaluate(Operator operator, Object rightValue, Duty rule, PolicyContext context) {
        return evaluate(operator, rightValue, context);
    }
}
