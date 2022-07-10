# common-beer-format

[![Clojars Project](https://img.shields.io/clojars/v/com.wallbrew/common-beer-format.svg)](https://clojars.org/com.wallbrew/common-beer-format)
![GitHub Runner](https://github.com/Wall-Brew-Co/common-beer-format/workflows/Clojurescript%20CI/badge.svg)

A Clojure(Script) implementation of the [BeerXML 1.0 schema](http://www.beerxml.com/) with cross-format support using Metosin's [spec-tools.](https://github.com/metosin/spec-tools)
The library endeavors to support the data specification as a [clojure spec](https://clojure.org/about/spec) and includes all optional fields in the core BeerXML spec.

## Installation

A deployed copy of the most recent version of [common-beer-format can be found on clojars.](https://clojars.org/com.wallbrew/common-beer-format)
To use it, add the following as a dependency in your project.clj file:

[![Clojars Project](https://clojars.org/com.wallbrew/common-beer-format/latest-version.svg)](https://clojars.org/com.wallbrew/common-beer-format)

The next time you build your application, [Leiningen](https://leiningen.org/) or [deps.edn](https://clojure.org/guides/deps_and_cli) should pull it automatically.
Alternatively, you may clone or fork the repository to work with it directly.

## Usage

Once the library has been added as a dependency to your project, you can begin utilizing the specs.

To see how the application works, try opening a REPL.

```clj
(:require [clojure.data.xml :as xml]
          [clj-xml.core :as clj-xml]
          [common-beer-format.core :as cbf]
          [common-beer-format.fermentables :as cbf-fermentables])

(def fermentables-file
  (-> "resources/xml/fermentables.xml"
      slurp
      xml/parse-str
      clj-xml/xml->edn))

(cbf/coerce fermentables-file ::cbf-fermentables/fermentables-wrapper)
```

Once the file is read and parsed, the code above will return something like this:

```clj
  {:fermentables
   [{:fermentable
     {:amount 2.27
      :yield 78.0
      :supplier "Fussybrewer Malting"
      :color 3.0
      :name "Pale Malt (2 row) UK"
      :moisture 4.0
      :type "Grain"
      :notes "All purpose base malt for English styles"
      :protein 10.2
      :origin "United Kingdom"
      :coarse-fine-diff 1.5
      :version 1
      :max-in-batch 100.0
      :diastatic-power 45.0}}
    {:fermentable
     {:amount 0.91
      :yield 70.0
      :supplier "Fussybrewer Malting"
      :color 2.0
      :name "Barley, Flaked"
      :moisture 9.0
      :type "Grain"
      :notes "Adds body to porters and stouts, must be mashed"
      :protein 13.2
      :origin "United Kingdom"
      :coarse-fine-diff 1.5
      :version 1
      :max-in-batch 20.0
      :recommend-mash true
      :diastatic-power 0.0}}
    {:fermentable
     {:amount 0.45
      :yield 78.0
      :supplier "Fussybrewer Malting"
      :color 500.0
      :name "Black Barley"
      :moisture 5.0
      :type "Grain"
      :notes "Unmalted roasted barley for stouts, porters"
      :coarse-fine-diff 1.5
      :diastatic-power 0.0
      :protein 13.2
      :max-in-batch 10.0}}]}
```

This library takes data structured to the [BeerXML](http://www.beerxml.com/beerxml.htm) specification and provides a layer of conformance and coercion.

Specs for the following data types have been provided, as well as several wrappers for container objects:

* [Equipment](/src/common_beer_format/equipment.cljc)
* [Fermentables](/src/common_beer_format/fermentables.cljc)
* [Hops](/src/common_beer_format/hops.cljc)
* [Mash](/src/common_beer_format/mash.cljc)
* [Miscs](/src/common_beer_format/miscs.cljc)
* [Recipes](/src/common_beer_format/recipes.cljc)
* [Styles](/src/common_beer_format/styles.cljc)
* [Waters](/src/common_beer_format/waters.cljc)
* [Yeasts](/src/common_beer_format/yeasts.cljc)

### Core Data Functions

In the core namespace, several utility functions have been provided to allow users of common-beer-format to inherit the utilities in `spec-tools`.
That ssers may use any function from `spec-tools` or `clojure.spec`, with the specs in this library.

Surfaced functions include:

* `conform`
* `coerce`
* `explain`
* `explain-data`
* `spec-description`

## Additional Notes

### Wrappers

Since BeerXML was obviously built to XML standards, this data model contains more container objects than either JSON or EDN traditionally.
To cleanly interop with Clojure Spec, this required the construction of spec wrappers for forms like the following:

```clj
  {:fermentables
   [{:fermentable ...}
    {:fermentable ...}]}

;; as well as

{:fermentable
  {:amount 2.27
   :yield 78.0
   :supplier "Fussybrewer Malting"
   :color 3.0
   :name "Pale Malt (2 row) UK"
   :moisture 4.0
   :type "Grain"
   :notes "All purpose base malt for English styles"
   :protein 10.2
   :origin "United Kingdom"
   :coarse-fine-diff 1.5
   :version 1
   :max-in-batch 100.0
   :diastatic-power 45.0}}
```

Therefore, specs named like `::fermentable` and `::fermentables` are used to describe the innermost values- meaning a key-value pair of the data describing a fermentable ingredient or a list of fermentable records.
To coerce and conform the data containing those elements, one would use `::fermentable-wrapper` and `::fermentables-wrapper`.
That allows the clean interop between the internal data structure of `clojure.data.xml`, which defines the data samples above, and the utilities provided by `spec-tools`.

### Pre-Packaged Data

common-beer-format formerly came pre-packaged with many of the most common brewing ingredients used.
While this was convenient, it severly bloated this library and its published version.
This information is still available; however, it must now be loaded as a separate dependency as of `common-beer-format v2.0.0`.
You can find that data in the [common-beer-data](https://github.com/Wall-Brew-Co/common-beer-data) repository.

If we've missed an ingredient you'd like to see in common-beer-data, you can fork that repository and open a pull request or [suggest it here.](https://github.com/Wall-Brew-Co/common-beer-data/issues/new?template=data_request.md)

## License

Copyright © 2020-2022 - [Wall Brew Co](https://wallbrew.com/)

This software is provided for free, public use as outlined in the [MIT License](https://github.com/Wall-Brew-Co/common-beer-format/blob/master/LICENSE)
