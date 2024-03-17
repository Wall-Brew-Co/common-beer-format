# Fermentable Records

## Fermentables Wrapper

A `::fermentables-wrapper` record.

### Wrapped Record

- [Fermentables](#fermentables)

## Fermentables

A vector of valid `::fermentable-wrapper` records.

### Collection Type

- [Fermentable Wrapper](#fermentable-wrapper)

## Fermentable Wrapper

A `::fermentable` record wrapped in a `::fermentable` map.

### Wrapped Record

- [Fermentable](#fermentable)

## Fermentable

A record representing a fermentable ingredient in a beer recipe.

### Required Keys

- [Amount](#amount)
- [Color](#color)
- [Name](#name)
- [Type](#type)
- [Version](#version)
- [Yield](#yield)

### Optional Keys

- [Add After Boil](#add-after-boil)
- [Coarse Fine Difference](#coarse-fine-difference)
- [Diastatic Power](#diastatic-power)
- [Display Amount](#display-amount)
- [Display Color](#display-color)
- [Ibu Gal Per Lb](#ibu-gal-per-lb)
- [Inventory](#inventory)
- [Max In Batch](#max-in-batch)
- [Moisture](#moisture)
- [Notes](#notes)
- [Origin](#origin)
- [Potential](#potential)
- [Protein](#protein)
- [Recommend Mash](#recommend-mash)
- [Supplier](#supplier)

## Add After Boil

A boolean representing if the fermentable was added after the boil.
When absent, assume false.

- Clojure Key Name: `:add-after-boil`
- Clojure Type: Spec
- Example: `false`

## Amount

A ::kilogram value representing the amount of a particular ingredient.

- Clojure Key Name: `:amount`
- Clojure Type: Double
- Example: `12.5`

## Coarse Fine Difference

A non-negative IEEE-754 floating point number representing the percent difference between the coarse grain yield and fine grain yield.
Only appropriate for the 'Grain' or 'Adjunct' types.

- Clojure Key Name: `:coarse-fine-diff`
- Clojure Type: Double
- Example: `0.856`

## Color

A non-negative IEEE-754 floating point number representing the color in Lovibond for the grain type, and SRM for all other types for the fermentable.

- Clojure Key Name: `:color`
- Clojure Type: Double
- Example: `32.0`

## Diastatic Power

A non-negative IEEE-754 floating point number representing the diastatic power of the grain in Lintner units.
Only appropriate for the 'Grain' or 'Adjunct' types.

- Clojure Key Name: `:diastatic-power`
- Clojure Type: Double
- Example: `0.65`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units.

- Clojure Key Name: `:display-amount`
- Clojure Type: String
- Example: `"100 g"`

## Display Color

A non-empty string denoting a display value for the color of the ingredient formatted for display in arbitrary units.

- Clojure Key Name: `:display-color`
- Clojure Type: String
- Example: `"200 Lovibond"`

## Ibu Gal Per Lb

A non-negative IEEE-754 floating point number representing the IBUs per pound per gallon of water assuming a 60 minute boil.
Only appropriate for the 'Extract' type.

- Clojure Key Name: `:ibu-gal-per-lb`
- Clojure Type: Double
- Example: `12.5`

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units.

- Clojure Key Name: `:inventory`
- Clojure Type: String
- Example: `"100 lbs"`

## Max In Batch

A non-negative IEEE-754 floating point number representing the suggested maximum percent by weight of the fermentable with respect to all fermentables.

- Clojure Key Name: `:max-in-batch`
- Clojure Type: Double
- Example: `1.0`

## Moisture

A non-negative IEEE-754 floating point number representing the percent moisture in the grain.
Only appropriate for the 'Grain' or 'Adjunct' types.

- Clojure Key Name: `:moisture`
- Clojure Type: Double
- Example: `0.45`

## Name

A non-empty string representing the name of the ingredient.

- Clojure Key Name: `:name`
- Clojure Type: String
- Example: `"Citra"`

## Notes

A non-empty string representing any notes about the subject.

- Clojure Key Name: `:notes`
- Clojure Type: String
- Example: `"A wonderful, zesty aroma"`

## Origin

A non-empty string denoting the place of origin for a particular ingredient.

- Clojure Key Name: `:origin`
- Clojure Type: String
- Example: `"Nice, France"`

## Potential

A non-negative IEEE-754 floating point number representing the potential yield in specific gravity units of the ingredient.

- Clojure Key Name: `:potential`
- Clojure Type: Double
- Example: `1.048`

## Protein

A non-negative IEEE-754 floating point number representing the protein contents of the grain.
Only appropriate for the 'Grain' or 'Adjunct' types.

- Clojure Key Name: `:protein`
- Clojure Type: Double
- Example: `0.1`

## Recommend Mash

A boolean representing if the fermentable is recommended to be included in the mashing step.
Only appropriate for the 'Grain' or 'Adjunct' types.
When absent, assume false.

- Clojure Key Name: `:recommend-mash`
- Clojure Type: Spec
- Example: `false`

## Supplier

A non-empty string denoting the supplier of the fermentable ingredient.

- Clojure Key Name: `:supplier`
- Clojure Type: String
- Example: `"Gnome Brew"`

## Type

A case-sensitive string representing the form of the fermentable.
Must be one of: "Dry extract", "Sugar", "Adjunct", "Grain", "Extract"

- Adjunct: Non-grain and non-sugar ingredients that are added to the wort that contain fermentable sugars.
- Dry Extract: Dry extract is a concentrated form of fermentable sugars derived from malted barley.
- Extract: Extract is a concentrated form of fermentable sugars derived from malted barley in liquid form.
- Grain: Whole or milled barley, rye, wheat, or other grain.
- Sugar: Raw, candied, and other natural sources of sugar (e.g. Honey) .)

- Clojure Key Name: `:type`
- Clojure Type: String
- Example: `"grain"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`

## Yield

A non-negative IEEE-754 floating point number representing the percent rendered sugar from the fermentable.

- Clojure Key Name: `:yield`
- Clojure Type: Double
- Example: `0.856`
