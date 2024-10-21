# Water Records

## Waters Wrapper

A `::waters-wrapper` record set.

- BeerXML Type: `Record Set`

### Wrapped Record

- [Waters](#waters)

## Waters

A vector of valid `::water` records.

### Collection Type

- [Water Wrapper](#water-wrapper)

## Water Wrapper

A `::water` record wrapped in a `:water` map.

- BeerXML Type: `Record`

### Wrapped Record

- [Water](#water)

## Water

A record representing the water in a beer recipe.

### Required Keys

- [Amount](#amount)
- [Bicarbonate](#bicarbonate)
- [Calcium](#calcium)
- [Chloride](#chloride)
- [Magnesium](#magnesium)
- [Name](#name)
- [Sodium](#sodium)
- [Sulfate](#sulfate)
- [Version](#version)

### Optional Keys

- [Display Amount](#display-amount)
- [Notes](#notes)
- [PH](#ph)

## Amount

A value representing the amount of a particular ingredient.
When measuring weight, this is in kilograms.
When measuring volume, this is in liters.

- BeerXML Type: `Floating Point`
- BeerXML Units: Kilogram, Liter
- Clojure Key Name: `:amount`
- Clojure Type: Double
- Example: `12.5`

## Bicarbonate

A positive IEEE-754 floating point number representing the amount of bicarbonate (HCO3) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:bicarbonate`
- Clojure Type: Double
- Example: `2.5`

## Calcium

A positive IEEE-754 floating point number representing the amount of calcium (Ca) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:calcium`
- Clojure Type: Double
- Example: `2.5`

## Chloride

A positive IEEE-754 floating point number representing the amount of chloride (Cl-) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:chloride`
- Clojure Type: Double
- Example: `2.5`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-amount`
- Clojure Type: String
- Example: `"100 g"`

## Magnesium

A positive IEEE-754 floating point number representing the amount of magnesium (Mg) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:magnesium`
- Clojure Type: Double
- Example: `2.5`

## Name

A non-empty string representing the name of the ingredient.

- BeerXML Type: `Text`
- Clojure Key Name: `:name`
- Clojure Type: String
- Example: `"Citra"`

## Notes

A non-empty string representing any notes about the subject.

- BeerXML Type: `Text`
- Clojure Key Name: `:notes`
- Clojure Type: String
- Example: `"A wonderful, zesty aroma."`

## PH

A positive IEEE-754 floating point number representing the PH of the water.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:ph`
- Clojure Type: Double
- Example: `2.5`

## Sodium

A positive IEEE-754 floating point number representing the amount of sodium (Na) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:sodium`
- Clojure Type: Double
- Example: `2.5`

## Sulfate

A positive IEEE-754 floating point number representing the amount of sulfate (SO4) in parts per million.

- BeerXML Type: `Floating Point`
- Clojure Key Name: `:sulfate`
- Clojure Type: Double
- Example: `2.5`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- BeerXML Type: `Integer`
- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`
