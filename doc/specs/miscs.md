# Misc Records

## Miscellaneous Ingredients Wrapper

A `::miscs` record.

### Wrapped Record

- [Miscellaneous Ingredients](#miscellaneous-ingredients)

## Miscellaneous Ingredients

A vector of valid `::misc` records.

### Collection Type

- [Miscellaneous Ingredient Wrapper](#miscellaneous-ingredient-wrapper)

## Miscellaneous Ingredient Wrapper

A `::misc` record wrapped in a `:misc` map.

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

A ::kilogram value representing the amount of a particular ingredient

- Key Name: `:amount`
- Type: Double
- Example: `12.5`

## Amount Is Weight

A boolean representing if the amount of the substance is measured in kilograms.
When absent, assume false and that the amount of substance is measured in liters.

- Key Name: `:amount-is-weight`
- Type: Boolean
- Example: `false`

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

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units

- Key Name: `:inventory`
- Type: String
- Example: `"100 lbs"`

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

## Time

A non-negative IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the :use field.
For "Boil" this is the boil time.
For "Mash" this is the mash time.
For "Primary", "Secondary", and "Bottling" this is the amount of time the ingredient spent in that state.

- Key Name: `:time`
- Type: Double
- Example: `15.0`

## Type

A case-insensitive string representing the type of the miscellaneous item added to the beer.
Must be one of: "Herb", "Spice", "Flavor", "Water agent", "Other", "Fining"

- Fining: A fining agent, such as isinglass.
- Flavor: A flavoring, such as orange peel or a flavor concentrate.
- Herb: An herb, such as mint.
- Other: Any other type of miscellaneous ingredient.
- Spice: A spice, such as cinnamon or ginger.
- Water Agent: A water agent, such as campden tablet.

- Key Name: `:type`
- Type: String
- Example: `"Spice"`

## Use

A case-insensitive string representing the point in the brewing cycle the miscellaneous ingredient is added to the beer.
Must be one of: "Boil", "Secondary", "Primary", "Mash", "Bottling"

- Boil: The ingredient is added to the boil.
- Mash: The ingredient is added to the mash.
- Primary: The ingredient is added to the primary fermentation.
- Secondary: The ingredient is added to the secondary fermentation.
- Bottling: The ingredient is added during the bottling process.

- Key Name: `:use`
- Type: String
- Example: `"Mash"`

## Use For

A non-empty string denoting what the ingredient is used for.

- Key Name: `:use-for`
- Type: String
- Example: `"Used to impart a mild, zesty flavor"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
- Example: `1`
