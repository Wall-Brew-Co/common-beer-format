## v2.1.0 / 2022 Jul 24

> This release improves the generators for decimal types to restrict ##NaN and ##Inf from being created

* **Update** - Improve generators for decimal typed fields

## v2.0.0 / 2022 Jul 10

> **BREAKING:** This release bifurcates the three separate utilities this library was responsible into discrete libraries. 
> `common-beer-format` is now exclusively intended for BeerXML specs.
> [clj-xml](https://github.com/Wall-Brew-Co/clj-xml) is now used for simplifying `clojure.data/xml` interop
> [common-beer-data](https://github.com/Wall-Brew-Co/common-beer-data) is now used for storing common ingredients, style guides, etc.

* **Add** - Add `explain`, `explain-data`, `spec-description`, `valid?`, and `invalid?` to prevent consumers from needing to explicitly import transitive libraries
* **Delete** - All static data for ingredients, styles, etc.
* **Delete** - Specialty functionality for `clojure.data/xml` interop

## v1.4.0 / 2022 Jul 09

> This release enables generative testing against all specs

* **Add** - Add `coerce` function to perform type casting
* **Fix** - Add missing `::common-beer-format.specs.equipment/boil-time` and `::common-beer-format.specs.equipment/age-temp` specs
* **Update** - All specs now come with generators

## v1.3.0 / 2020 Jul 18

> Expose a conform function so downstream users aren't required to install spec tools as a dependency for edn data

## v1.2.1 / 2020 Jul 18

> Fix selection function for all-yeasts

## v1.2.0 / 2020 Jul 15

> Add /data/ sub-folders and namespaces for common fermentables, hops, styles, and yeasts

## v1.1.0 / 2020 May 8

> Expand core specs to include optional BeerXML tags

## v1.0.0 / 2020 May 5

> 1.0.0 release, and initial implementation

## v0.0.0 / 2020 Mar 17

> Initial Commit
