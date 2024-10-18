# Common Beer Format Specs

This documentation assumes a moderately advanced level of familiarity with homebrewing, specifically the brewing of beer.
If you are unfamiliar with the brewing process, we highly recommend setting this documentation aside and gathering the essential experience and knowledge first.
The following resources are great places to begin:

- *The Complete Joy of Home Brewing* - Charlie Papazian
- *How to Brew* - John J. Palmer
- [The American Homebrewers Association](https://www.homebrewersassociation.org/)
- A friend, relative, or neighbor with homebrewing experience
- A local brewery or local homebrewing supply store

common-beer-format is a collection of Clojure Specs that describe the BeerXML 1.0 Schema.
Since it is based on XML, the data shapes and conventions may differ from what Clojure programmers may traditionally expect; however, to maximize interoperability with other brewing programs, common-beer-format maintains as much of the original implementation's choices as possible.
This document covers how the BeerXML spec has been translated to clojure.
There is additional documentation containing examples and explanations of the data fields covered by these specs in files named after each central entity: For example, Hops.

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [General](#general)
  - [Tag Names](#tag-names)
  - [Version](#version)
  - [Non-Standard Fields](#non-standard-fields)
  - [Data Formats](#data-formats)
    - [Record Sets](#record-sets)
    - [Records](#records)
    - [Percentage](#percentage)
    - [List / Enumerations](#list--enumerations)
    - [Text](#text)
    - [Boolean](#boolean)
    - [Integer / Long](#integer--long)
    - [Floating Point](#floating-point)
  - [Units of Measure](#units-of-measure)
    - [Weight](#weight)
    - [Volume](#volume)
    - [Temperature](#temperature)
    - [Time](#time)
    - [Specific Gravity](#specific-gravity)
    - [Pressure](#pressure)
      - [Implicit Unit Types](#implicit-unit-types)
        - [Alcohol Content](#alcohol-content)
        - [Bitterness](#bitterness)
        - [Carbonation](#carbonation)
        - [Color](#color)
        - [Specific Heat](#specific-heat)
  - [Optional Extensions](#optional-extensions)
- [Additional Reading](#additional-reading)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## General

BeerXML's implementation expects separate tags for each datum.
For example:

```xml
<HOP>
 <NAME>Cascade</NAME>
 <USE>Boil</USE>
 ...
</HOP>
```

The specification explicitly states that XML Attributes are **not** to be used.
For example:

```xml
<HOP NAME="Cascade" USE="BOIL" ...> </HOP>
```

In clojure, each entity is represented by a nested map:

```clj
{:hop
  {:name "Cascade"
   :use   "Boil"
   ...}}
```

Tools like clj-xml can convert between the clojure map expression and the XML expression of the data directly.
Alternative implementation choices do exist for this combination of type and attribute mapping (e.g. namespaced keywords, qualified keywords); however, they require additional processing to (de)serialize correctly and are not structurally equivalent to the XML they represent.
Throughout common-beer-format, the nesting maps in these data shapes are called `wrappers`.
The specs for these types contain metadata indicating them as such; however, consumers shouldn't need to rely on that fact.

### Tag Names

common-beer-format specs are written for `kebab-cased` maps.
(De)serialization tools, such as `clj-xml`, are able to automatically format between that casing and the `SCREAMING_SNAKE_CASE` defined in BeerXML.

### Version

All records contain a `:version` key that denotes the version of the BeerXML / common-beer-format standard they represent.
This version key is independent of the version of any libraries or tools which may process this data.
As of writing, the only acceptable value for this key is `1`.
The original BeerXML spec intends to maintain backwards compatibility with any future versions; however this key is intended for handling any instances where that is the exception.

### Non-Standard Fields

The specs contained in this library are open.
Consumers may add additional keys to any of the maps to store whatever additional information they desire.
For example an `id` to uniquely represent a specific hop varietal.
Any fields not defined by this specification may be safely ignored by programs consuming data in this format.

### Data Formats

BeerXML specifies the following data types.
We've included information about the clojure implementation of each.

#### Record Sets

A **Record Set** is a collection of [Record](#records)s.
For example, a collection of hops.
In common-beer-format, these are wrapped maps.
For example:

```xml
<HOPS>
    <HOP>
        <NAME>Goldings, East Kent</NAME>
        <VERSION>1</VERSION>
        <ALPHA>5.0</ALPHA>
        <AMOUNT>0.0638</AMOUNT>
        <USE>Boil</USE>
        <TIME>60.0</TIME>
        <NOTES>Great all purpose UK hop for ales, stouts, porters</NOTES>
    </HOP>
</HOPS>
```

Becomes:

```clj
{:hops [{:hop {:name    "Goldings, East Kent"
               :version 1
               :alpha   5.0
               :amount  0.0638
               :use     "Boil"
               :time    60.0
               :notes   "Great all purpose UK hop for ales, stouts, porters"}}]}
```

#### Records

Records are the core entity types in BeerXML and common-beer-format.
The following record types are currently supported:

- **Hop**: All varieties and forms of hops.
  Includes plugs, pellets, and whole cones.
- **Fermentable**: Any and all ingredients containing substantial fermentable sugar.
   Includes malt extract, milled grain, candi sugar, honey, and fruit.
- **Yeast**: All varieties and forms of yeast.
- **Misc**: Any non-hop, non-yeast ingredient that does not significantly change the gravity of the beer.
  For example: herbs, water treatment agents, clarifying agents.
- **Water**: The chemical profile of the water used in mashing and boiling.
- **Style**: A description of a beer style.
  The style may come from any source.
  For example the [Beer Judge Certification Program](https://www.bjcp.org/)
- **Mash Step**: A single step in a mashing process.
  This is not intended for use outside of a mash profile.
- **Mash**: A description of the mashing method used and all mash steps in the process.
- **Recipe**: A single recipe, largely composed of the other record types.
- **Equipment**: The equipment used during the mashing and boiling steps.

BeerXML specifically denotes the required and optional fields of each record type.
common-beer-format specs for records do the same by defining the keys of representative maps as required, unqualified keys and optional, unqualified keys.

Definitions and documentation of these records and their keys are stored individually by Record type.

#### Percentage

An IEEE-754 floating point number used to express a percent out of 100.
For example, 10.4% will stored and transmitted as `10.4` **NOT** `0.104`.
The encoding of this field does not contain the `%` character.

#### List / Enumerations

BeerXML specifies a `List` data format, which is also frequently called an `enumeration`.
All list/enumeration types in BeerXML and common-beer-format are case-sensitive strings.

#### Text

Text is any free-format user provided text.
In all cases, the empty string, and strings only including whitespace characters, are considered invalid.
For multiline files, line breaks should be preserved and importing programs may choose to truncate text if required.
Multiline entries may use either Unix-style newlines, or DOS-style carriage return and newline combinations.
Importing programs **MUST** accept either format.

#### Boolean

The BeerXML spec serializes the boolean type to the literal strings `"TRUE"` and `"FALSE"`.
common-beer-format deserializes these values to the literal clojure values `true` and `false`.
Non-boolean representation of "truthiness" and "falsiness", e.g. `nil`, are **NOT** considered valid.

#### Integer / Long

Any integer value with no decimal point, which may include negative numbers.
common-beer-format will deserialize this type into a `long`.

#### Floating Point

An IEEE-754 floating point number expressed in its simplest form: `1.2`, `0.0004`, etc.
Importing programs should endeavor to maintain as many significant digits of precession as possible.

### Units of Measure

Data serialized into common-beer-format and BeerXML prescribes the unit of measure for most numeric fields (e.g. `amount`).
These specifications also describe `display` fields for most measurements (e.g. `display-color-max`).
The `display` fields are permitted to be stored with any measurement system, but are not intended for use in calculations.
Importing and exporting programs may use alternative units of measure in their internal processing, but must serialize to and expect to deserialize form the below units.

Clojure unit conversion functions may be found in [brewtility.](https://github.com/Wall-Brew-Co/brewtility "A collection of tools for working with common-beer-format adhering data")

#### Weight

Weight is measured in Kilograms (kg).

#### Volume

Volume is measured in Liters (l).
In support of the common non-English spelling, most Wall Brew repositories will accept `Litre` as an equivalent name.

#### Temperature

Temperature is measured in degrees Celsius.

#### Time

Time is measured in minutes, unless superseded in a description of a field.

#### Specific Gravity

Specific gravity is measured relative to the weight of a same-sized sample of neutral water.
For example: `1.030`

#### Pressure

Pressure is measured in Kilopascals (kpa).

##### Implicit Unit Types

BeerXML also includes several fields with implicitly described units of measure that were not formalized into the units standard.
These units are conventional for home brewers, but may not be described by a matching SI unit.
When handling data that describes the following measures, these unit systems are used:

###### Alcohol Content

Alcohol content is described in a [percent](#percentage) alcohol by volume.

###### Bitterness

Bitterness is described in [International Bitterness Units.](https://en.wikipedia.org/wiki/International_bitterness_units)

###### Carbonation

Carbonation is described in equivalent volumes of carbon dioxide (CO2).

###### Color

The color of a fermentable is described in degrees Lovibond with one exception.
Fermentables of the "Liquid Extract" type are measured with the Standard Reference Model.
Styles and recipes measure their color with the Standard Reference Model.

###### Specific Heat

Specific heat is measured in Calories per Gram Degree Celsius.

### Optional Extensions

BeerXML version 1 has been updated with a single appendix describing optional extensions.
common-beer-format contains specs for these extensions, and they are implemented as optional, unqualified keys in [Records.](#records)

## Additional Reading

- [BeerXML 1.0 Schema](http://www.beerxml.com/beerxml.htm)
- [Clojure Spec Guide](https://clojure.org/guides/spec)
