---
id: Adoption View
title: Adoption View
description: 'Connector Kit'
sidebar_position: 1
---

## Introduction

The ConnectorKit provides a connector framework, based on the [Eclipse Dataspace Components Connector][edc-url] for sovereign, cross-enterprise data exchange.

## Vision & Mission

### Vision

We believe that sharing data along the automotive supply chain adds great value for every participant. The key to such collaboration is trust in the involved partners and assurance that the shared data is not being misused. Our vision is that in 5 years, companies along the automotive value chain will share and exchange data with each other as a matter of course, without anyone fearing that their data will be misused. This unlocks significant value for everyone, which can only be achieved through collaboration.

### Mission

Collaboration needs trust. Within Catena-X trust is built on an open-source architecture and components designed to support full sovereignity.
With this Connector KIT we provide the single source of information and technology to perform trustful data exchange within Catena-X. The Connector KIT bundles the interaction patterns, relevant standards, APIs, and reference implementations  for developers.

## Concept

Trust, interoperability, and data sovereignty are the objectives and values for secure and sustainable peer-to-peer data exchange between organizations and companies. The claim is data sovereignty: Whoever provides data to the Data Space retains control and decides individually who is involved in the data exchange, how, when, where and under what conditions. A corresponding concept was developed in the context of [Gaia-X][gaiax-url] and the [International Data Space Association][idsa-url]. __The essential software component is the EDC Connector.__

![EDC Overview](images/edc_overview.png)

With the [EDC Connector][edc-url], a new communication component was introduced, which implements the following architectural principles:

- Simple. Maintaining a small and efficient core with as few external dependencies as possible.
- Interoperable. Independent of platforms and ecosystems.
- Decentralized. Software components with the necessary capabilities for participating in a Data Space are located on the partners' side, data is only exchanged within agreed contracts.
- Data protection is more important than data sharing. Data to be transmitted is fundamentally linked to policies via contracts; a transfer without a contract is not possible.
- Separation of metadata and data. Enables high throughput rates for the actual data transfer.
- Consistent semantics. Is the basis for interoperability and digital value creation.
- Automation. As far as possible, all processes, starting with determining the identity, through ensuring the contractually agreed regulations to data transmission, are automated.
- Standardization. Existing standards and protocols ([GAIA-X][gaiax-url] and [IDSA][idsa-url]) are used as far as possible.

## Use Case

The EDC Connector is the enabling component for all use cases within Catena-X and the only component to execute the exchange of operational data to Data Space participants. The base use case is therfore the exchange of data between to partners. Value creation along the automotive value chain is tied to processing data in specific contexts. Within Catena-X exist 10 use cases companies can participate in. Active participation in given use cases always requires the use of an [EDC Connector][edc-url]. Depending on the use case a participant chooses to participate in, further components will be required.

- [Sustainability][sustainability-url]
- [Traceability][traceability-url]
- [Demand and Capacity Management][DCM-url]
- [Predictive Unit Real-Time Information Service (PURIS)][PURIS-url]
- [Business Partner Data Management][BPDM-url]
- [Digital Product pass][digital-product-pass-url]

## Business Architecture

The [EDC][edc-url] as a connector implements a framework agreement for sovereign, cross-organizational data exchange. The International Data Spaces Standard (IDS) and relevant principles in connection with [GAIA-X][gaiax-url] were implemented. The connector is designed to be extensible to support alternative protocols and to be integrated into different ecosystems.

The objective is to set up a decentralized software component on the part of the respective partner, which bundles the skills required to participate in a Data Space and enables peer-to-peer connections between participants.
The focus here is particularly on the data sovereignty of the independent companies.
The functionality required for this is bundled in the open-source project "Eclipse Dataspace Connector", to which members of the Eclipse Foundation contribute.

The main difference between the EDC and the previous connectors of the [IDSA][idsa-url] is the separation of the communication into a channel for the metadata and one for the actual data exchange. The channel for the data supports various transmission protocols via so-called data plane extensions. The metadata is transmitted directly via the EDC interface, while the actual data exchange then takes place via the appropriate channel extension. In this way, a highly scalable data exchange is made possible.

![EDC Architecture](images/edc_architecture.png)

The architecture of the EDC combines various services that are necessary for the above principles:

- An interface to the Identity Provider service, currently [IDSA][idsa-url]'s [Dynamic Attribute Provisioning System][daps-url]. This central service provides the identity and the corresponding authentication of the participants in the data exchange. (There is no authorization at this point). Decentralized solutions will also be supported in the future.
- The provision of possible offers (contract offering) which, on the one hand, stipulates the data offered and the associated terms of use (policies) in corresponding contracts.
- An interface for manual selection of data and associated contract offers.
- The actual data transfer via the data plane extension
- The connection of software systems on the customer and provider side

## Additional Resources

### Catena-X Standards

The Connector KIT builds on the [Catena-X Standards][Catena-X-Standards-url].

### Terminology

- Control Plane: The Control Plane handles meta data exchange with other components and Connectors, as well as transfer of access tokens.

- Data Plane: The Data Plane can handle several forms of actual data exchange by utilizing various extensions.

- Extensions: There are different extenions for the Connector, e.g. for the Data Plane. This enables various tranfer modes like httpData or via blob-storage.

- Assets: Data Sources are connected to the Connector and represent Assets.

- Policy Definition: A standardized set of policies can be used to define access to and usage of assets.

- Contract Definition: By combining Assets and Policies, Contracts for data offerings are defined. These Contracts need to be accepted by consuming participants (Connectors) for the data exchange to take place.

### Notice

This work is licensed under the [CC-BY-4.0](https://creativecommons.org/licenses/by/4.0/legalcode).

- SPDX-License-Identifier: CC-BY-4.0
- SPDX-FileCopyrightText: 2023 sovity GmbH
- SPDX-FileCopyrightText: 2023 msg systems AG
- SPDX-FileCopyrightText: 2023 Mercedes-Benz Group AG
- Source URL: https://github.com/eclipse-tractusx/tractusx-edc

[edc-url]: https://github.com/eclipse-edc/Connector
[gaiax-url]: https://www.data-infrastructure.eu/GAIAX/Navigation/EN/Home/home.html
[idsa-url]: https://internationaldataspaces.org/
[daps-url]: https://www.dataspaces.fraunhofer.de/en/software/identity_provider.html
[traceability-url]: https://github.com/eclipse-tractusx/traceability-foss
[sustainability-url]: https://github.com/ChristopherWinterZF/pcf-exchange-kit/tree/featurebranch/devlopmentview
[BPDM-url]: https://github.com/eclipse-tractusx/bpdm
[DCM-url]: https://github.com/eclipse-tractusx/demand-capacity-mgmt/blob/main/README.md
[PURIS-url]: https://github.com/eclipse-tractusx/puris
[digital-product-pass-url]:https://github.com/eclipse-tractusx/digital-product-pass
[Catena-X-Standards-url]:https://catena-x.net/de/standard-library
