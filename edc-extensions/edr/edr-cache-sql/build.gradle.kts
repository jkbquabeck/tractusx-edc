/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    implementation(project(":spi:edr-spi"))

    implementation(libs.edc.spi.core)
    implementation(libs.edc.core.sql)
    implementation(libs.edc.spi.transactionspi)
    implementation(libs.edc.spi.transaction.datasource)
    implementation(libs.edc.sql.lease)

    testImplementation(libs.edc.transaction.local)

    testImplementation(testFixtures(project(":spi:edr-spi")))
    testImplementation(testFixtures(libs.edc.core.sql))
    testImplementation(testFixtures(libs.edc.sql.lease))

    testImplementation(testFixtures(libs.edc.junit))

}
