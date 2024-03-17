# Hop Records

## Hops Wrapper

A `::hops-wrapper` record.

### Wrapped Record

- [Hops](#hops)

## Hops

A vector of valid `::hop-wrapper` records.

### Collection Type

- [Hop Wrapper](#hop-wrapper)

## Hop Wrapper

A `::hop` record wrapped in a `:hop` map.

### Wrapped Record

- [Hop](#hop)

## Hop

A record representing a hop in a beer recipe.

### Required Keys

- [Alpha](#alpha)
- [Amount](#amount)
- [Name](#name)
- [Time](#time)
- [Use](#use)
- [Version](#version)

### Optional Keys

- [Beta](#beta)
- [Caryophyllene](#caryophyllene)
- [Cohumulone](#cohumulone)
- [Display Amount](#display-amount)
- [Display Time](#display-time)
- [Form](#form)
- [Hop Stability Index](#hop-stability-index)
- [Humulene](#humulene)
- [Inventory](#inventory)
- [Myrcene](#myrcene)
- [Notes](#notes)
- [Origin](#origin)
- [Substitutes](#substitutes)
- [Type](#type)

## Alpha

A non-negative IEEE-754 floating point number representing the percent contents of alpha acid in the hop.

- Clojure Key Name: `:alpha`
- Clojure Type: Double
- Example: `10.7`

## Amount

A ::kilogram value representing the amount of a particular ingredient.

- Clojure Key Name: `:amount`
- Clojure Type: Double
- Example: `12.5`

## Beta

A non-negative IEEE-754 floating point number representing the percent contents of beta acid in the hop.

- Clojure Key Name: `:beta`
- Clojure Type: Double
- Example: `10.7`

## Caryophyllene

A non-negative IEEE-754 floating point number representing the percent contents of caryophyllene in the hop.

- Clojure Key Name: `:caryophyllene`
- Clojure Type: Double
- Example: `10.7`

## Cohumulone

A non-negative IEEE-754 floating point number representing the percent contents of cohumulone in the hop.

- Clojure Key Name: `:cohumulone`
- Clojure Type: Double
- Example: `10.7`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units.

- Clojure Key Name: `:display-amount`
- Clojure Type: String
- Example: `"100 g"`

## Display Time

A non-empty string denoting a display value for an amount of time formatted for display in arbitrary units.

- Clojure Key Name: `:display-time`
- Clojure Type: String
- Example: `"10 days"`

## Form

A case-sensitive string representing the physical form of the hop.
Must be one of: "Pellet", "Leaf", "Plug"

- Pellet: Ground and compressed hop cones.
- Plug: Whole hop cones compressed into plugs.
- Leaf: Whole hop cones.

- Clojure Key Name: `:form`
- Clojure Type: String
- Example: `"leaf"`

## Hop Stability Index

A non-negative IEEE-754 floating point number representing the Hop Stability Index, or percent decay of a hop's alpha acid over six months.

- Clojure Key Name: `:hsi`
- Clojure Type: Double
- Example: `2.2`

## Humulene

A non-negative IEEE-754 floating point number representing the percent contents of humulene in the hop.

- Clojure Key Name: `:humulene`
- Clojure Type: Double
- Example: `10.7`

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units.

- Clojure Key Name: `:inventory`
- Clojure Type: String
- Example: `"100 lbs"`

## Myrcene

A non-negative IEEE-754 floating point number representing the percent contents of myrcene in the hop.

- Clojure Key Name: `:myrcene`
- Clojure Type: Double
- Example: `10.7`

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

## Substitutes

A non-empty string denoting ingredients with me bay used in place of those denoted in the record.

- Clojure Key Name: `:substitutes`
- Clojure Type: String
- Example: `"Citra or Sorachi"`

## Time

A non-negative IEEE-754 floating point number representing the time in minutes the hop was added dependant on the :use field.

- Boil: this is the boil time.
- Mash: this is the mash time.
- First Wort: this is the boil time.
- Aroma: this is the steep time.
- Dry Hop: this is the amount of time to dry hop.

- Clojure Key Name: `:time`
- Clojure Type: Double
- Example: `15.0`

## Type

A case-sensitive string representing the typical purpose of the hop's addition to a beer.
Must be one of: "Both", "Aroma", "Bittering"

- Bittering: Hops added solely for their bittering properties.
- Aroma: Hops added solely for their aromatic properties and flavor.
- Both: Hops which may be added for both/either their bittering and/or aromatic properties.

- Clojure Key Name: `:type`
- Clojure Type: String
- Example: `"bittering"`

## Use

A case-sensitive string representing the means by which the hop is added to the beer.
Must be one of: "Mash", "Boil", "Dry hop", "First wort", "Aroma"

- Aroma: Hops added to the beer after the boil. They do not significantly contribute to the bitterness of the beer.
- Boil: Hops added to the boil for bittering.
- Dry Hop: Hops added to the fermentation vessel after pitching yeast. They do not significantly contribute to the bitterness of the beer.
- First Wort: Hops added to first wort prior to the boil.
- Mash: Hops added to the mash prior to the boil.

- Clojure Key Name: `:use`
- Clojure Type: String
- Example: `"mash"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`
