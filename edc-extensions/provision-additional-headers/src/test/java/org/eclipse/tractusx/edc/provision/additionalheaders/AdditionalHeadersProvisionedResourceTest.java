/*
 * Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 * Copyright (c) 2021-2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.eclipse.tractusx.edc.provision.additionalheaders;

import org.eclipse.edc.spi.types.TypeManager;
import org.eclipse.edc.spi.types.domain.DataAddress;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AdditionalHeadersProvisionedResourceTest {

    @Test
    void serdes() {
        var typeManager = new TypeManager();
        var resource =
                AdditionalHeadersProvisionedResource.Builder.newInstance()
                        .id(UUID.randomUUID().toString())
                        .resourceDefinitionId(UUID.randomUUID().toString())
                        .transferProcessId(UUID.randomUUID().toString())
                        .hasToken(false)
                        .resourceName("name")
                        .dataAddress(DataAddress.Builder.newInstance().type("type").build())
                        .build();

        var json = typeManager.writeValueAsString(resource);
        var deserialized = typeManager.readValue(json, AdditionalHeadersProvisionedResource.class);

        assertThat(deserialized).usingRecursiveComparison().isEqualTo(resource);
    }
}
