# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/)

## Table of Contents

* [2.6.0 - 2024-10-21](#260---2024-10-21)
* [2.5.0 - 2024-10-21](#250---2024-10-21)
* [2.4.1 - 2024-10-13](#241---2024-10-13)
* [2.4.0 - 2024-09-21](#240---2024-09-21)
* [2.3.0 - 2024-03-17](#230---2024-03-17)
* [2.2.2 - 2024-03-10](#222---2024-03-10)
* [2.2.1 - 2023-02-12](#221---2023-02-12)
* [2.2.0 - 2023-02-09](#220---2023-02-09)
* [2.1.0 - 2022-07-24](#210---2022-07-24)
* [2.0.0 - 2022-07-20](#200---2022-07-20)
* [1.4.0 - 2022-07-19](#140---2022-07-19)
* [1.3.0 - 2020-07-18](#130---2020-07-18)
* [1.2.1 - 2020-07-18](#121---2020-07-18)
* [1.2.0 - 2020-07-15](#120---2020-07-15)
* [1.1.0 - 2020-05-08](#110---2020-05-08)
* [1.0.0 - 2020-05-05](#100---2020-05-05)
* [0.0.0 - 2020-03-17](#000---2020-03-17)

## 2.6.0 - 2024-10-21

* Changed
  * Removed dependency on `nnichols/nnichols` and added an explicit dependency on `org.clojure/test.check`

## 2.5.0 - 2024-10-21

* Added
  * Development time functionality to export specs as JSON Schema
* Fixed
  * Updated the sample data in each spec to render as the correct type

## 2.4.1 - 2024-10-13

* Fixed
  * Eliminated reader macro usage in test files.

## 2.4.0 - 2024-09-21

* Fixed
  * Added the `<orgnization>` tag to the pom.xml file.

## 2.3.0 - 2024-03-17

* Added
  * Documentation generation from specs to markdown.
* Changed
  * Specs now carry metadata indicating the BeerXML Types and Units they are associated with.
  * Specs may contain metadata to render human friendly names for abbreviated fields.
  * List specs are tightened to only allow valid BeerXML units and types.
  * Symbols have been added for all legal values for BeerXML List types. For example: `common-beer-format.miscs/boil`.
* Removed
  * Data (de)serialization dependencies (`clojure.data.xml`, `clojure.data.json`) leftover from `clj-xml`'s promotion to a standalone library have been removed.
  * Data generation dependencies (`clojure.test.check`) have been removed.

## 2.2.2 - 2024-03-10

* Changed
  * Bumped `org.clojure/clojure` to `1.11.2`. Note: Addressing `CVE-2024-22871` / `GHSA-vr64-r9qj-h27f` requires consumers to upgrade to this version.

## 2.2.1 - 2023-02-12

* Fixed
  * Ensure all yeast flocculation values are valid.

## 2.2.0 - 2023-02-09

* Added
  * Symbols for keywords in the equipment namespace
  * Symbols for keywords in the fermentables namespace
  * Symbols for keywords in the hops namespace
  * Symbols for keywords in the mash namespace
  * Symbols for keywords in the miscs namespace
  * Symbols for keywords in the recipes namespace
  * Symbols for keywords in the styles namespace
  * Symbols for keywords in the waters namespace
  * Symbols for keywords in the yeasts namespace
  * A forwarding function for `get-spec`
* Changed
  * The symbols not intended for public consumption are no accurately tagged with the `:no-doc` metadata
* Fixed
  * Fixed a bug where collection types would generate maps and sets in property tests.

## 2.1.0 - 2022-07-24

* Added
  * Improved data generators for decimal values to restrict `NaN` and `Inf`

## 2.0.0 - 2022-07-20

* Added
  * `explain`, `explain-data`, `spec-description`, `valid?`, and `invalid?` to prevent consumers from needing to explicitly import transitive libraries
* Removed
  * BREAKING: Removed XML parser and migrated functionality into [clj-xml.](https://github.com/Wall-Brew-Co/clj-xml)
  * BREAKING: Removed static data and migrated functionality into [common-beer-data.](https://github.com/Wall-Brew-Co/common-beer-data)

## 1.4.0 - 2022-07-19

* Added
  * Data generators for all specifications
  * `coerce` function to perform type casting on ingested data
* Fixed
  * Added missing `::common-beer-format.specs.equipment/boil-time` spec
  * Added missing `::common-beer-format.specs.equipment/age-temp` spec

## 1.3.0 - 2020-07-18

* Added
  * `conform` function so downstream users aren't required to install spec-tools

## 1.2.1 - 2020-07-18

* Fixed
  * Selection functions for yeasts to include DCL samples

## 1.2.0 - 2020-07-15

* Added
  * Create `/data` subdirectory for sample static data.
  * Import sample fermentable data
  * Import sample hop data
  * Import BJCP style guides
  * Import sample yeast data

## 1.1.0 - 2020-05-08

* Added
  * Extend all specifications to include optional BeerXML attributes

## 1.0.0 - 2020-05-05

* Added
  * Create base specification for BeerXML equipment records.
  * Create base specification for BeerXML fermentable records.
  * Create base specification for BeerXML hop records.
  * Create base specification for BeerXML mash records.
  * Create base specification for BeerXML misc records.
  * Create base specification for BeerXML recipe records.
  * Create base specification for BeerXML style records.
  * Create base specification for BeerXML water records.
  * Create base specification for BeerXML yeast records.

## 0.0.0 - 2020-03-17

* Added
  * Repository initialized.

## Source

This changelog was generated by [sealog.](https://github.com/Wall-Brew-Co/lein-sealog)
Please do not edit it directly. Instead, edit the source data files and regenerate this file.
