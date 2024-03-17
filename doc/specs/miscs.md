# Misc Records

## Miscellaneous Ingredients Wrapper

A `::miscs` record.

- BeerXML Type: `Record Set`

### Wrapped Record

- [Miscellaneous Ingredients](#miscellaneous-ingredients)

## Miscellaneous Ingredients

A vector of valid `::misc` records.

### Collection Type

- [Miscellaneous Ingredient Wrapper](#miscellaneous-ingredient-wrapper)

## Miscellaneous Ingredient Wrapper

A `::misc` record wrapped in a `:misc` map.

- BeerXML Type: `Record`

### Wrapped Record

- [Miscellaneous Ingredient](#miscellaneous-ingredient)

## Miscellaneous Ingredient

A record representing a miscellaneous ingredient in a beer recipe.

### Required Keys

- [Amount](#amount)
- [Name](#name)
- [Time](#time)
- [Type](#type)
- [Use](#use)
- [Version](#version)

### Optional Keys

- [Amount Is Weight](#amount-is-weight)
- [Display Amount](#display-amount)
- [Display Time](#display-time)
- [Inventory](#inventory)
- [Notes](#notes)
- [Use For](#use-for)

## Amount

A value representing the amount of a particular ingredient.
When measuring weight, this is in kilograms.
When measuring volume, this is in liters.

- BeerXML Type: `Floating Point`
- BeerXML Units: Kilogram, Liter
- Clojure Key Name: `:amount`
- Clojure Type: Double
- Example: `12.5`

## Amount Is Weight

A boolean representing if the amount of the substance is measured in kilograms.
When absent, assume false and that the amount of substance is measured in liters.

- BeerXML Type: `Boolean`
- Clojure Key Name: `:amount-is-weight`
- Clojure Type: Boolean
- Example: `false`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-amount`
- Clojure Type: String
- Example: `"100 g"`

## Display Time

A non-empty string denoting a display value for an amount of time formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-time`
- Clojure Type: String
- Example: `"10 days"`

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:inventory`
- Clojure Type: String
- Example: `"100 lbs"`

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
- Example: `"A wonderful, zesty aroma"`

## Time

A non-negative IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the `:use` field.
For "Boil" this is the boil time.
For "Mash" this is the mash time.
For "Primary", "Secondary", and "Bottling" this is the amount of time the ingredient spent in that state.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Minute
- Clojure Key Name: `:time`
- Clojure Type: Double
- Example: `15.0`

## Type

A case-sensitive string representing the type of the miscellaneous item added to the beer.
Must be one of: "Flavor", "Spice", "Water agent", "Fining", "Other", "Herb"

- Fining: A fining agent, such as isinglass.
- Flavor: A flavoring, such as orange peel or a flavor concentrate.
- Herb: An herb, such as mint.
- Other: Any other type of miscellaneous ingredient.
- Spice: A spice, such as cinnamon or ginger.
- Water Agent: A water agent, such as campden tablet.

- BeerXML Type: `List`
- Clojure Key Name: `:type`
- Clojure Type: String
- Example: `"Spice"`

## Use

A case-sensitive string representing the point in the brewing cycle the miscellaneous ingredient is added to the beer.
Must be one of: "Mash", "Boil", "Bottling", "Secondary", "Primary"

- Boil: The ingredient is added to the boil.
- Mash: The ingredient is added to the mash.
- Primary: The ingredient is added to the primary fermentation.
- Secondary: The ingredient is added to the secondary fermentation.
- Bottling: The ingredient is added during the bottling process.

- BeerXML Type: `List`
- Clojure Key Name: `:use`
- Clojure Type: String
- Example: `"Mash"`

## Use For

A non-empty string denoting what the ingredient is used for.

- BeerXML Type: `Text`
- Clojure Key Name: `:use-for`
- Clojure Type: String
- Example: `"Used to impart a mild, zesty flavor"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- BeerXML Type: `Integer`
- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`
