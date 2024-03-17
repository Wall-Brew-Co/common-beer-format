# Recipe Records

## Recipes Wrapper

A `::recipes-wrapper` record.

### Wrapped Record

- [Recipes](#recipes)

## Recipes

A vector of valid `::recipe` records.

### Collection Type

- [Recipe Wrapper](#recipe-wrapper)

## Recipe Wrapper

A `::recipe` record wrapped in a `:recipes` map.

### Wrapped Record

- [Recipe](#recipe)

## Recipe

A record representing a beer recipe.

### Required Keys

- [Batch Size](#batch-size)
- [Boil Size](#boil-size)
- [Boil Time](#boil-time)
- [Brewer](#brewer)
- [Fermentables](#fermentables)
- [Hops](#hops)
- [Mash](#mash)
- [Miscellaneous Ingredients](#miscellaneous-ingredients)
- [Name](#name)
- [Style](#style)
- [Type](#type)
- [Version](#version)
- [Waters](#waters)
- [Yeasts](#yeasts)

### Optional Keys

- [Abv](#abv)
- [Actual Efficiency](#actual-efficiency)
- [Age](#age)
- [Aging Temperature](#aging-temperature)
- [Assistant Brewer](#assistant-brewer)
- [Calories](#calories)
- [Carbonation](#carbonation)
- [Carbonation Temp](#carbonation-temp)
- [Carbonation Used](#carbonation-used)
- [Date](#date)
- [Display Aging Temperature](#display-aging-temperature)
- [Display Batch Size](#display-batch-size)
- [Display Boil Size](#display-boil-size)
- [Display Carbonation Temperature](#display-carbonation-temperature)
- [Display Final Gravity](#display-final-gravity)
- [Display Original Gravity](#display-original-gravity)
- [Display Primary Temperature](#display-primary-temperature)
- [Display Secondary Temperature](#display-secondary-temperature)
- [Display Tertiary Temperature](#display-tertiary-temperature)
- [Efficiency](#efficiency)
- [Equipment](#equipment)
- [Estimated ABV](#estimated-abv)
- [Estimated Color](#estimated-color)
- [Estimated Final Gravity](#estimated-final-gravity)
- [Estimated Original Gravity](#estimated-original-gravity)
- [Fermentation Stages](#fermentation-stages)
- [Final Gravity](#final-gravity)
- [Forced Carbonation](#forced-carbonation)
- [International Bitterness Units](#international-bitterness-units)
- [Ibu Method](#ibu-method)
- [Keg Priming Factor](#keg-priming-factor)
- [Notes](#notes)
- [Original Gravity](#original-gravity)
- [Primary Age](#primary-age)
- [Primary Temperature](#primary-temperature)
- [Priming Sugar Equivalent](#priming-sugar-equivalent)
- [Priming Sugar Name](#priming-sugar-name)
- [Secondary Age](#secondary-age)
- [Secondary Temperature](#secondary-temperature)
- [Taste Notes](#taste-notes)
- [Taste Rating](#taste-rating)
- [Tertiary Age](#tertiary-age)
- [Tertiary Temperature](#tertiary-temperature)

## Abv

A non-negative IEEE-754 floating point number representing the actual ABV for the recipe.

- Clojure Key Name: `:abv`
- Clojure Type: Double
- Example: `40.0`

## Actual Efficiency

A non-negative IEEE-754 floating point number representing the actual conversion efficiency between the measured final and original gravities.

- Clojure Key Name: `:actual-efficiency`
- Clojure Type: Double
- Example: `40.0`

## Age

A non-negative IEEE-754 floating point number representing the number of days to bottle age the beer.

- Clojure Key Name: `:age`
- Clojure Type: Double
- Example: `12.0`

## Aging Temperature

A non-negative IEEE-754 floating point number representing the temperature in degrees Celsius for bottle aging.

- Clojure Key Name: `:age-temp`
- Clojure Type: Double
- Example: `12.0`

## Assistant Brewer

A non-empty string denoting the name of the assistant brewer.

- Clojure Key Name: `:asst-brewer`
- Clojure Type: String
- Example: `"Dariusz R. Jakubowski"`

## Batch Size

A non-negative IEEE-754 floating point number representing the target final volume of recipe.

- Clojure Key Name: `:batch-size`
- Clojure Type: Double
- Example: `5.8`

## Boil Size

A non-negative IEEE-754 floating point number representing the starting volume of the wort.

- Clojure Key Name: `:boil-size`
- Clojure Type: Double
- Example: `7.5`

## Boil Time

A non-negative IEEE-754 floating point number representing the time in minutes to boil the wort.

- Clojure Key Name: `:boil-time`
- Clojure Type: Double
- Example: `45.0`

## Brewer

A non-empty string denoting the name of the brewer.

- Clojure Key Name: `:brewer`
- Clojure Type: String
- Example: `"Nick A. Nichols"`

## Calories

A non-empty string describing the number of dietary calories per serving of this recipe.

- Clojure Key Name: `:calories`
- Clojure Type: String
- Example: `"180 Cal / pint"`

## Carbonation

An IEEE-754 floating point number representing the carbonation for this recipe in volumes of CO2.

- Clojure Key Name: `:carbonation`
- Clojure Type: Double
- Example: `1.5`

## Carbonation Temp

An IEEE-754 floating point number representing the temperature in degrees Celsius for either bottling or forced carbonation.

- Clojure Key Name: `:carbonation-temp`
- Clojure Type: Double
- Example: `12.0`

## Carbonation Used

A non-empty string denoting a display value for the carbonation measures used formatted for display in arbitrary units.

- Clojure Key Name: `:carbonation-used`
- Clojure Type: String
- Example: `"Kegged at 1.36 atmospheres"`

## Date

A non-empty string denoting the display date the recipe was created on.
Intentionally implemented as a string type to match BeerXML spec.

- Clojure Key Name: `:date`
- Clojure Type: String
- Example: `"2020/05/06"`

## Display Aging Temperature

A non-empty string denoting a display value for the temperature of the aging step formatted for display in arbitrary units.

- Clojure Key Name: `:display-age-temp`
- Clojure Type: String
- Example: `"68F"`

## Display Batch Size

A non-empty string denoting a display value for the pre-fermentation volume formatted for display in arbitrary units.

- Clojure Key Name: `:display-batch-size`
- Clojure Type: String
- Example: `"4.5 gallons"`

## Display Boil Size

A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units.

- Clojure Key Name: `:display-boil-size`
- Clojure Type: String
- Example: `"5.0 gallons"`

## Display Carbonation Temperature

A non-empty string denoting a display value for the temperature of the bottling step formatted for display in arbitrary units.

- Clojure Key Name: `:display-carb-temp`
- Clojure Type: String
- Example: `"68F"`

## Display Final Gravity

A non-empty string denoting a display value for the post-fermentation gravity formatted for display in arbitrary units.

- Clojure Key Name: `:display-fg`
- Clojure Type: String
- Example: `"1.050sg"`

## Display Original Gravity

A non-empty string denoting a display value for the pre-fermentation gravity formatted for display in arbitrary units.

- Clojure Key Name: `:display-og`
- Clojure Type: String
- Example: `"1.050sg"`

## Display Primary Temperature

A non-empty string denoting a display value for the temperature of the primary fermentation step formatted for display in arbitrary units.

- Clojure Key Name: `:display-primary-temp`
- Clojure Type: String
- Example: `"68F"`

## Display Secondary Temperature

A non-empty string denoting a display value for the temperature of the secondary fermentation step formatted for display in arbitrary units.

- Clojure Key Name: `:display-secondary-temp`
- Clojure Type: String
- Example: `"68F"`

## Display Tertiary Temperature

A non-empty string denoting a display value for the temperature of the tertiary fermentation step formatted for display in arbitrary units.

- Clojure Key Name: `:display-tertiary-temp`
- Clojure Type: String
- Example: `"68F"`

## Efficiency

A non-negative IEEE-754 floating point number representing the percent brewhouse efficiency to be used for estimating the starting gravity of the beer.

- Clojure Key Name: `:efficiency`
- Clojure Type: Double
- Example: `85.6`

## Estimated ABV

A non-negative IEEE-754 floating point number representing the estimated ABV for the recipe.

- Clojure Key Name: `:est-abv`
- Clojure Type: Double
- Example: `40.0`

## Estimated Color

A non-empty string describing the calculated color formatted for display in arbitrary units.

- Clojure Key Name: `:est-color`
- Clojure Type: String
- Example: `"30SRM"`

## Estimated Final Gravity

A non-empty string describing the calculated estimated final gravity formatted for display in arbitrary units.

- Clojure Key Name: `:est-fg`
- Clojure Type: String
- Example: `"1.050sg"`

## Estimated Original Gravity

A non-empty string describing the calculated estimated original gravity formatted for display in arbitrary units.

- Clojure Key Name: `:est-og`
- Clojure Type: String
- Example: `"1.050sg"`

## Fermentation Stages

An integer representing the number of fermentation stages in the recipe.

- Clojure Key Name: `:fermentation-stages`
- Clojure Type: Long
- Example: `2`

## Final Gravity

A non-negative IEEE-754 floating point number representing the post-fermentation specific gravity of the recipe.

- Clojure Key Name: `:fg`
- Clojure Type: Double
- Example: `1.048`

## Forced Carbonation

A boolean representing if this batch was force carbonated with CO2 pressure.
When absent, assume false.

- Clojure Key Name: `:forced-carbonation`
- Clojure Type: Spec
- Example: `false`

## International Bitterness Units

A positive IEEE-754 floating point number representing the bitterness in IBUs for the recipe.

- Clojure Key Name: `:ibu`
- Clojure Type: Double
- Example: `40.0`

## Ibu Method

A case-sensitive string representing the method of calculation used derive the IBUs.
Must be one of: "Tinseth", "Rager", "Garetz"

- Garetz: The Garetz method of IBU calculation.
- Rager: The Rager method of IBU calculation.
- Tinseth: The Tinseth method of IBU calculation.

- Clojure Key Name: `:ibu-method`
- Clojure Type: String
- Example: `"Garetz"`

## Keg Priming Factor

An IEEE-754 floating point number representing the conversion factor of sugar needed to prime carbonation in large containers.

- Clojure Key Name: `:keg-priming-factor`
- Clojure Type: Double
- Example: `1.5`

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

## Original Gravity

A non-negative IEEE-754 floating point number representing the pre-fermentation specific gravity of the recipe.

- Clojure Key Name: `:og`
- Clojure Type: Double
- Example: `1.06`

## Primary Age

A positive IEEE-754 floating point number representing the number of days spent in primary fermentation.

- Clojure Key Name: `:primary-age`
- Clojure Type: Double
- Example: `12.0`

## Primary Temperature

A non-negative IEEE-754 floating point number representing the temperature in degrees Celsius for primary fermentation.

- Clojure Key Name: `:primary-temp`
- Clojure Type: Double
- Example: `12.0`

## Priming Sugar Equivalent

An IEEE-754 floating point number representing the conversion factor to an equivalent amount of corn sugar.

- Clojure Key Name: `:priming-sugar-equiv`
- Clojure Type: Double
- Example: `1.5`

## Priming Sugar Name

A non-empty string denoting the name of the priming agent used to carbonate the beer.

- Clojure Key Name: `:priming-sugar-name`
- Clojure Type: String
- Example: `"Corn Sugar"`

## Secondary Age

A non-negative IEEE-754 floating point number representing the number of days spent in secondary fermentation.

- Clojure Key Name: `:secondary-age`
- Clojure Type: Double
- Example: `12.0`

## Secondary Temperature

A non-negative IEEE-754 floating point number representing the temperature in degrees Celsius for secondary fermentation.

- Clojure Key Name: `:secondary-temp`
- Clojure Type: Double
- Example: `12.0`

## Taste Notes

A non-empty string denoting any tasting notes.

- Clojure Key Name: `:taste-notes`
- Clojure Type: String
- Example: `"A nice, full body and intense mouthfeel"`

## Taste Rating

An IEEE-754 floating point number representing the tasting score of the beer.

- Clojure Key Name: `:taste-rating`
- Clojure Type: Double
- Example: `100.0`

## Tertiary Age

A non-negative IEEE-754 floating point number representing the number of days spent in tertiary fermentation.

- Clojure Key Name: `:tertiary-age`
- Clojure Type: Double
- Example: `12.0`

## Tertiary Temperature

A non-negative IEEE-754 floating point number representing the temperature in degrees Celsius for tertiary fermentation.

- Clojure Key Name: `:tertiary-temp`
- Clojure Type: Double
- Example: `12.0`

## Type

A case-sensitive string representing the type of recipe.
Must be one of: "Partial mash", "All grain", "Extract"

- All Grain: A recipe that uses only malted grains.
- Partial Mash: A recipe that uses a combination of malted grains and malt extract.
- Extract: A recipe that uses only malt extract.

- Clojure Key Name: `:type`
- Clojure Type: String
- Example: `"All Grain"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`
