[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

| |Current Status|
|---|---|
|Build|[![Build Status](https://img.shields.io/endpoint.svg?url=https%3A%2F%2Factions-badge.atrox.dev%2FOpenBankingToolkit%2Fopenbanking-uk-datamodel%2Fbadge%3Fref%3Dmaster&style=flat)](https://actions-badge.atrox.dev/OpenBankingToolkit/openbanking-uk-datamodel/goto?ref=master)|
|Code coverage|[![codecov](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel/branch/master/graph/badge.svg)](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel)
|Bintray|[![Bintray](https://img.shields.io/bintray/v/openbanking-toolkit/OpenBankingToolkit/openbanking-uk-datamodel.svg?maxAge=2592000)](https://bintray.com/openbanking-toolkit/OpenBankingToolkit/openbanking-uk-datamodel)|
|License|![license](https://img.shields.io/github/license/ACRA/acra.svg)|

**_This repository is part of the Open Banking Tool kit. If you just landed to that repository looking for our tool kit,_
_we recommend having a first read to_ https://github.com/OpenBankingToolkit/openbanking-toolkit**

# OpenBanking-Java-SDK
A Java SDK to help implementing the Open Banking standard : https://www.openbanking.org.uk/read-write-apis/  .
This project is compiled with JDK 8.

## Usage
```
<dependency>
    <groupId>com.forgerock.openbanking</groupId>
    <artifactId>openbanking-sdk</artifactId>
</dependency>

```

## Class generation
Many of the classes are generated from OB Swagger documentation. When a new version of OB API is released, 
the following steps are performed:
1. Download the Swagger json files from OB Spec pages (e.g. for 3.1.1 accounts: https://openbanking.atlassian.net/wiki/spaces/DZ/pages/999622968/Account+and+Transaction+API+Specification+-+v3.1.1#AccountandTransactionAPISpecification-v3.1.1-SwaggerSpecification)
>Note: there are currently swagger files for Accounts, Payments, Funds Confirmation, ASPSP Callback and TPP Events - more may be available in future releases).
1. Download `swagger-codegen-cli-2.4.5.jar` (using this version will match existing generated classes and uses the same dependencies).
1. Run ```
java -jar swagger-codegen-cli-2.4.5.jar generate \
  -i {your_json_file} \
  -DuseBeanValidation=true \
  -Dmodels \
  --model-package uk.org.openbanking.datamodel \
  --group-id com.forgerock.openbanking \
  --artifact-id openbanking-sdk \
  -l java \
  --library resttemplate \
  -o generated```
 1. Check the generated files and copy them into appropriate source directory. Do not overwrite existing files.
 1. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
 1. Repeat generation for each new swagger json file
 1. If using Intelij, run format and optimise imports on newly generated files.
 1. Fix imports where necessary - e.g. use the Links and Meta from the `account` package and use `org.joda.time.DateTime` instead of `org.threeten.bp.OffsetDateTime.OffsetDateTime`.
 1. Increment the major or minor version in pom.xml
 1. Run build to ensure everything compiles and copyrights are generated for new source files.
 1. Commit and raise PR.  

