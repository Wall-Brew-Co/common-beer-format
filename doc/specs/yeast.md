# Yeast Records

## Yeasts Wrapper

A `::yeasts-wrapper` record.

### Wrapped Record

- [Yeasts](#yeasts)

## Yeasts

A vector of valid `::yeast` records.

### Collection Type

- [Yeast Wrapper](#yeast-wrapper)

## Yeast Wrapper

A `::yeast` record wrapped in a `:yeast` map.

### Wrapped Record

- [Yeast](#yeast)

## Yeast

A record representing the yeast in a beer recipe.

### Required Keys

- [Amount](#amount)
- [Form](#form)
- [Name](#name)
- [Type](#type)
- [Version](#version)

### Optional Keys

- [Add To Secondary](#add-to-secondary)
- [Amount Is Weight](#amount-is-weight)
- [Attenuation](#attenuation)
- [Best For](#best-for)
- [Culture Date](#culture-date)
- [Display Maximum Temperature](#display-maximum-temperature)
- [Display Minimum Temperature](#display-minimum-temperature)
- [Display Amount](#display-amount)
- [Flocculation](#flocculation)
- [Inventory](#inventory)
- [Laboratory](#laboratory)
- [Max Reuse](#max-reuse)
- [Max Temperature](#max-temperature)
- [Min Temperature](#min-temperature)
- [Notes](#notes)
- [Product Id](#product-id)
- [Times Cultured](#times-cultured)

## Add To Secondary

A boolean representing if this yeast was added for a secondary fermentation.
When absent, assume false.

- Key Name: `:add-to-secondary`
- Type: Spec
- Example: `false`

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

## Attenuation

A positive IEEE-754 floating point number representing the percent of malt sugar that can be converted to ethanol and carbon dioxide.

- Key Name: `:attenuation`
- Type: Double
- Example: `73.2`

## Best For

A non-empty string denoting the styles of beer this yeast is best suited for.

- Key Name: `:best-for`
- Type: String
- Example: `"WLP008"`

## Culture Date

A non-empty string denoting a display value for the date the yeast sample was last cultured formatted for display in arbitrary structure.

- Key Name: `:culture-date`
- Type: String
- Example: `"10/10/2020"`

## Display Maximum Temperature

A non-empty string denoting a display value for the maximum fermentation temperature formatted for display in arbitrary units.

- Key Name: `:disp-max-temp`
- Type: String
- Example: `"75F"`

## Display Minimum Temperature

A non-empty string denoting a display value for the minimum fermentation temperature formatted for display in arbitrary units.

- Key Name: `:disp-min-temp`
- Type: String
- Example: `"68F"`

## Display Amount

A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units

- Key Name: `:display-amount`
- Type: String
- Example: `"100 g"`

## Flocculation

A case-insensitive string representing how dense of a floc the yeast will form.
Must be one of: "Low", "High", "Medium", "Very high"

- Low: The yeast settles out of suspension slowly.
- Medium: The yeast settles out of suspension at a moderate rate.
- High: The yeast settles out of suspension quickly.
- Very High: The yeast settles out of suspension very quickly.

- Key Name: `:flocculation`
- Type: String
- Example: `"High"`

## Form

A case-insensitive string representing the form of the yeast added to the beer.
Must be one of: "Culture", "Dry", "Slant", "Liquid"

- Liquid: A liquid slurry of yeast, usually with a source of nutrients or sugars.
- Dry: Dry yeast sold in a dehydrated state to extend shelf life.
- Slant: Yeast cultivated on a solid growth medium.
- Culture: Yeast cultivated from previous fermentations.

- Key Name: `:form`
- Type: String
- Example: `"Ale"`

## Inventory

A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units

- Key Name: `:inventory`
- Type: String
- Example: `"100 lbs"`

## Laboratory

A non-empty string denoting the laboratory that cultivated the yeast.

- Key Name: `:laboratory`
- Type: String
- Example: `"White Labs"`

## Max Reuse

A non-negative integer representing the suggested maximum number of times the yeast may be harvested and recultured.

- Key Name: `:max-reuse`
- Type: Long
- Example: `3`

## Max Temperature

An IEEE-754 floating point number representing the maximum recommended temperature of fermentation.

- Key Name: `:max-temperature`
- Type: Double
- Example: `23.9`

## Min Temperature

An IEEE-754 floating point number representing the minimum recommended temperature of fermentation.

- Key Name: `:min-temperature`
- Type: Double
- Example: `19.5`

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

## Product Id

A non-empty string denoting the product label or id number that identifies the strain of yeast.

- Key Name: `:product-id`
- Type: String
- Example: `"WLP008"`

## Times Cultured

A non-negative integer representing the number of times this yeast has been harvested and re-used.
A value of zero assumes the yeast came directly from the manufacturer.

- Key Name: `:times-cultured`
- Type: Long
- Example: `1`

## Type

A case-insensitive string representing the type of yeast added to the beer.
Must be one of: "Wine", "Lager", "Ale", "Wheat", "Champagne"

- Ale: Yeast that ferments at higher temperatures and produces a more fruity, estery, and alcohol-forward beer.
- Lager: Yeast that ferments at lower temperatures and produces a crisp, clean, and alcohol-restrained beer.
- Wheat: Yeast that ferments at higher temperatures and produces a fruity and phenol-forward beer.
- Wine: Yeast traditionally used in wine making.
- Champagne: Yeast traditionally used in champagne making, offering a dry taste.

- Key Name: `:type`
- Type: String
- Example: `"Ale"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
- Example: `1`
