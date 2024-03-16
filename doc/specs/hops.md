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

- Key Name: `:alpha`
- Type: Double
- Example: `10.7`

## Amount

A ::kilogram value representing the amount of a particular ingredient

- Key Name: `:amount`
- Type: Double
- Example: `12.5`

## Beta

A non-negative IEEE-754 floating point number representing the percent contents of beta acid in the hop.

- Key Name: `:beta`
- Type: Double
- Example: `10.7`

## Caryophyllene

A non-negative IEEE-754 floating point number representing the percent contents of caryophyllene in the hop.

- Key Name: `:caryophyllene`
- Type: Double
- Example: `10.7`

## Cohumulone

A non-negative IEEE-754 floating point number representing the percent contents of cohumulone in the hop.

- Key Name: `:cohumulone`
- Type: Double
- Example: `10.7`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units

- Key Name: `:display-amount`
- Type: String
- Example: `"100 g"`

## Display Time

A non-empty string denoting a display value for an amount of time formatted for display in arbitrary units

- Key Name: `:display-time`
- Type: String
- Example: `"10 days"`

## Form

A case-insensitive string representing the physical form of the hop.
Must be one of: "Leaf", "Plug", "Pellet"

- Pellet: Ground and compressed hop cones.
- Plug: Whole hop cones compressed into plugs.
- Leaf: Whole hop cones.

- Key Name: `:form`
- Type: String
- Example: `"leaf"`

## Hop Stability Index

A non-negative IEEE-754 floating point number representing the Hop Stability Index, or percent decay of a hop's alpha acid over six months.

- Key Name: `:hsi`
- Type: Double
- Example: `2.2`

## Humulene

A non-negative IEEE-754 floating point number representing the percent contents of humulene in the hop.

- Key Name: `:humulene`
- Type: Double
- Example: `10.7`

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units

- Key Name: `:inventory`
- Type: String
- Example: `"100 lbs"`

## Myrcene

A non-negative IEEE-754 floating point number representing the percent contents of myrcene in the hop.

- Key Name: `:myrcene`
- Type: Double
- Example: `10.7`

## Name

A non-empty string representing the name of the ingredient

- Key Name: `:name`
- Type: String
- Example: `"Citra"`

## Notes

A non-empty string representing any notes about the subject

- Key Name: `:notes`
- Type: String
- Example: `"A wonderful, zesty aroma"`

## Origin

A non-empty string denoting the place of origin for a particular ingredient

- Key Name: `:origin`
- Type: String
- Example: `"Nice, France"`

## Substitutes

A non-empty string denoting ingredients with me bay used in place of those denoted in the record

- Key Name: `:substitutes`
- Type: String
- Example: `"Citra or Sorachi"`

## Time

A non-negative IEEE-754 floating point number representing the time in minutes the hop was added dependant on the :use field.

- Boil: this is the boil time.
- Mash: this is the mash time.
- First Wort: this is the boil time.
- Aroma: this is the steep time.
- Dry Hop: this is the amount of time to dry hop.

- Key Name: `:time`
- Type: Double
- Example: `15.0`

## Type

A case-insensitive string representing the typical purpose of the hop's addition to a beer.
Must be one of: "Aroma", "Both", "Bittering"

- Bittering: Hops added solely for their bittering properties.
- Aroma: Hops added solely for their aromatic properties and flavor.
- Both: Hops which may be added for both/either their bittering and/or aromatic properties.

- Key Name: `:type`
- Type: String
- Example: `"bittering"`

## Use

A case-insensitive string representing the means by which the hop is added to the beer.
Must be one of: "Aroma", "Boil", "First wort", "Dry hop", "Mash"

- Aroma: Hops added to the beer after the boil. They do not significantly contribute to the bitterness of the beer.
- Boil: Hops added to the boil for bittering.
- Dry Hop: Hops added to the fermentation vessel after pitching yeast. They do not significantly contribute to the bitterness of the beer.
- First Wort: Hops added to first wort prior to the boil.
- Mash: Hops added to the mash prior to the boil.

- Key Name: `:use`
- Type: String
- Example: `"mash"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
- Example: `1`
