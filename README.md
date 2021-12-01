[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

| |Current Status|
|---|---|
|Build|[![Build Status](https://img.shields.io/endpoint.svg?url=https%3A%2F%2Factions-badge.atrox.dev%2FOpenBankingToolkit%2Fopenbanking-uk-datamodel%2Fbadge%3Fref%3Dmaster&style=flat)](https://actions-badge.atrox.dev/OpenBankingToolkit/openbanking-uk-datamodel/goto?ref=master)|
|Code coverage|[![codecov](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel/branch/master/graph/badge.svg)](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel)
|Release|[![GitHub release (latest by date)](https://img.shields.io/github/v/release/OpenBankingToolkit/openbanking-uk-datamodel.svg)](https://img.shields.io/github/v/release/OpenBankingToolkit/openbanking-uk-datamodel)
|License|![license](https://img.shields.io/github/license/ACRA/acra.svg)|

**_This repository is part of the Open Banking Tool kit. If you just landed to that repository looking for our tool kit,_
_we recommend having a first read to_ https://github.com/OpenBankingToolkit/openbanking-toolkit**

# OpenBanking uk datamodel
A Java data model library (Generated classes from OB Swagger documentation) for Open Banking uk: https://www.openbanking.org.uk/read-write-apis/  .
This project is compiled with JDK 11.

## Usage
```
<dependency>
    <groupId>com.forgerock.openbanking.uk</groupId>
    <artifactId>openbanking-uk-datamodel</artifactId>
</dependency>

```

## Class generation

Many of the classes are generated from the OB Swagger documentation. The project is setup to make it easy to generate
the  OB model classes and skeleton API classes using Maven. For efficiency, the default maven profile does not generate
the code, but it is easy to do so using `code-gen` profile (see below).

The configuration for the swagger generation is currently within this project's main `pom.xml` and the swagger
specification is within `src/main/resources/specification`.

When a new version of OB API is released, the following steps should be performed:
1. Download the Swagger yaml files from OB Spec pages (https://github.com/OpenBankingUK/read-write-api-specs/releases).
   As of v3.1.8, there are swagger files for Accounts, Payments, Funds Confirmation, Events and Variable Recurring Payments.
1. Place the swagger files under `src/main/resources/specification` (replacing existing ones where applicable).
1. Run ```mvn clean install -Pcode-gen```
   > This will generate classes into `target/generated-sources/swagger`
1. Check the generated files and copy them into the appropriate source folder (e.g. `src/main/java`).

   > Note that these guidelines originally advised not to overwrite existing files, but this is flawed since OB regularly
   makes changes/fixes to existing classes. Therefore, it is necessary to overwrite all files and then selectively rollback
   the changes, depending on what's changed. This is a long and painstaking process!

   > It is worth noting that a number of generated files appear to have changed significantly (e.g. `OBReadConsent1`
   switching to `OBReadConsent1Data` and its new `PermissionsEnum`). However, it is important to compare the effect on
   the resulting JSON (plus any changes to the validation), as the change often makes no difference to the API, and yet
   the impact may be significant elsewhere (e.g. on `openbanking-aspsp`). As a result of this, we have  not switched
   to `OBReadConsent1Data`.
   
   > Other notable changes include things like `OBEventSubscriptionResponse1Data` switching from a `String` to a `URL`
   for the `callbackUrl` or `httpopenbankingOrgUkrid` within `OBEventSubject1` being renamed to
   `httpColonOpenbankingOrgUkRid`, but the `@JsonProperty` annotation remaining the same. Again, neither of these make
   any difference to the resulting JSON, so these changes have not been applied.
   
   > TO BE AWARE: the yaml spec used on the client to generate the source
   is the version spec 1.1 it means that the keys  `y|Y|yes|Yes|YES|n|N|no|No|NO` `|true|True|TRUE|false|False|FALSE`
   `|on|On|ON|off|Off|OFF` will be evaluated to boolean `true` and `false` when these keys aren't enclosed in quotes. Check these keys in the yaml file to identify the classes
   that must be change manually to the proper key value.
   
1. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
1. Uncomment the relevant `<inputSpec>` listing within the `openapi-generator-maven-plugin` in the pom for the next
   swagger spec (and repeat for each new swagger YAML file).
1. If using Intellij, run format and optimise imports on newly generated files.
1. Run build to ensure everything compiles and copyrights are generated for new source files.
1. Commit and raise PR.
