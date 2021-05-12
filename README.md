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

**NOTE** There are two ways to generate the model and API classes - either using the Swagger 2 codegen tool, or doing it via https://editor.swagger.io/.

Many of the classes are generated from OB Swagger documentation. When a new version of OB API is released,
the following steps are performed:
1. Download the Read/Write API's Swagger json files from OB's github (https://github.com/OpenBankingUK/read-write-api-specs/releases)
1. Then choose one of the following methods to generate the class files:

### Swagger Spec using Sagger 2 Codegen
1. Download `swagger-codegen-cli-2.4.5.jar` (using this version will match existing generated classes up to 3.1.7 and uses the same dependencies).
1. Run:
```   
java -jar swagger-codegen-cli-2.4.5.jar generate \
  -i {your_json_file} \
  -DuseBeanValidation=true \
  -Dmodels \
  --model-package uk.org.openbanking.datamodel \
  --group-id com.forgerock.openbanking \
  --artifact-id openbanking-sdk \
  -l java \
  --library resttemplate \
  -o generated
```
> Refer to https://github.com/swagger-api/swagger-codegen#getting-started for more information (e.g. how to generate the API controller interfaces).

### Generation using Swagger Editor
1. Copy & paste the relevant swagger spec into https://editor.swagger.io/.
1. From here, you can click on 'Generate Server' and then choose 'Spring'. This will download a zip file containing all class file.

> This approach will generate the model and controller files and will work with either a Swagger spec or Open API spec. Note that OB appears to be moving
> towards only supporting Open API specs.

### Copy generated files

1. Copy the generated class files into the appropriate source directory (if you copy them into IntelliJ directly then the packages will be corrected - if necessary).
   
> Note that these guidelines originally advised not to overwrite existing files, but this is flawed since OB regularly make changes/fixes to existing classes.
> Therefore, it is necessary to overwrite all files and then selectively rollback the changes, depending on what's changed. This is a long painstaking process!
2. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
1. Repeat generation for each new swagger json file
1. If using Intelij, run format and optimise imports on newly generated files.
1. Fix imports where necessary - e.g. use the Links and Meta from the `account` package and use `org.joda.time.DateTime` instead of `org.threeten.bp.DateTime.DateTime`.
1. Increment the major or minor version in pom.xml
1. Run build to ensure everything compiles and copyrights are generated for new source files.
1. Commit and raise PR.  
