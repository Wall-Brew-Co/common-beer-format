# Style Records

## Styles Wrapper

A `::styles-wrapper` record

### Wrapped Record

- [Styles](#styles)

## Styles

A vector of valid `::style` records

### Collection Type

- [Style Wrapper](#style-wrapper)

## Style Wrapper

A `::style` record wrapped in a `:style` map

### Wrapped Record

- [Style](#style)

## Style

A record representing a beer style.

### Required Keys

- [Category](#category)
- [Category Number](#category-number)
- [Color Max](#color-max)
- [Color Min](#color-min)
- [Maximum Final Gravity](#maximum-final-gravity)
- [Minimum Final Gravity](#minimum-final-gravity)
- [Maximum International Bittering Units](#maximum-international-bittering-units)
- [Minimum International Bittering Units](#minimum-international-bittering-units)
- [Name](#name)
- [Maximum Original Gravity](#maximum-original-gravity)
- [Minimum Original Gravity](#minimum-original-gravity)
- [Style Guide](#style-guide)
- [Style Letter](#style-letter)
- [Type](#type)
- [Version](#version)

### Optional Keys

- [Abv Max](#abv-max)
- [Abv Min](#abv-min)
- [Abv Range](#abv-range)
- [Maximum Carbonation](#maximum-carbonation)
- [Minimum Carbonation](#minimum-carbonation)
- [Carbonation Range](#carbonation-range)
- [Color Range](#color-range)
- [Display Color Max](#display-color-max)
- [Display Color Min](#display-color-min)
- [Display Final Gravity Max](#display-final-gravity-max)
- [Display Final Gravity Min](#display-final-gravity-min)
- [Display Original Gravity Max](#display-original-gravity-max)
- [Display Original Gravity Min](#display-original-gravity-min)
- [Examples](#examples)
- [Final Gravity Range](#final-gravity-range)
- [International Bittering Units Range](#international-bittering-units-range)
- [Ingredients](#ingredients)
- [Notes](#notes)
- [Original Gravity Range](#original-gravity-range)
- [Profile](#profile)

## Abv Max

A non-negative IEEE-754 floating point number representing the maximum recommended ABV percentage for the style.

- Key Name: `:abv-max`
- Type: Double
- Example: `0.04`

## Abv Min

A non-negative IEEE-754 floating point number representing the minimum recommended ABV percentage for the style.

- Key Name: `:abv-min`
- Type: Double
- Example: `0.032`

## Abv Range

A non-empty string denoting a display value for the range of ABV levels formatted for display in arbitrary units.

- Key Name: `:abv-range`
- Type: String
- Example: `"8.0-11.2%"`

## Maximum Carbonation

A non-negative IEEE-754 floating point number representing the maximum carbonation for this style in volumes of CO2.

- Key Name: `:carb-max`
- Type: Double
- Example: `2.2`

## Minimum Carbonation

A non-negative IEEE-754 floating point number representing the minimum carbonation for this style in volumes of CO2.

- Key Name: `:carb-min`
- Type: Double
- Example: `1.5`

## Carbonation Range

A non-empty string denoting a display value for the range of carbonation volumes formatted for display in arbitrary units.

- Key Name: `:carb-range`
- Type: String
- Example: `"2.0-2.6 vols CO2"`

## Category

A non-empty string denoting the category this style belongs to.

- Key Name: `:category`
- Type: String
- Example: `"American Lagers"`

## Category Number

A non-empty string denoting the category number of this style.
The category number is a string because it can be a letter followed by a number, e.g. 'A1' on some guides.

- Key Name: `:category-number`
- Type: String
- Example: `"1"`

## Color Max

A non-negative IEEE-754 floating point number representing the darkest color in SRM for the style.

- Key Name: `:color-max`
- Type: Double
- Example: `40.0`

## Color Min

A non-negative IEEE-754 floating point number representing the lightest color in SRM for the style.

- Key Name: `:color-min`
- Type: Double
- Example: `32.0`

## Color Range

A non-empty string denoting a display value for the range of colors formatted for display in arbitrary units.

- Key Name: `:color-range`
- Type: String
- Example: `"10 - 22 SRM"`

## Display Color Max

A non-empty string denoting a display value for the maximum color formatted for display in arbitrary units.

- Key Name: `:display-color-max`
- Type: String
- Example: `"40 SRM"`

## Display Color Min

A non-empty string denoting a display value for the minimum color formatted for display in arbitrary units.

- Key Name: `:display-color-min`
- Type: String
- Example: `"32SRM"`

## Display Final Gravity Max

A non-empty string denoting a display value for the maximum final gravity formatted for display in arbitrary units.

- Key Name: `:display-fg-max`
- Type: String
- Example: `"1.050sg"`

## Display Final Gravity Min

A non-empty string denoting a display value for the minimum final gravity formatted for display in arbitrary units.

- Key Name: `:display-fg-min`
- Type: String
- Example: `"1.036sg"`

## Display Original Gravity Max

A non-empty string denoting a display value for the maximum original gravity formatted for display in arbitrary units.

- Key Name: `:display-og-max`
- Type: String
- Example: `"1.050sg"`

## Display Original Gravity Min

A non-empty string denoting a display value for the minimum original gravity formatted for display in arbitrary units.

- Key Name: `:display-og-min`
- Type: String
- Example: `"1.036sg"`

## Examples

A non-empty string denoting example beers of this style.

- Key Name: `:examples`
- Type: String
- Example: `"Every overly citrus IPA on the market."`

## Maximum Final Gravity

A non-negative IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style.

- Key Name: `:fg-max`
- Type: Double
- Example: `1.06`

## Minimum Final Gravity

A non-negative IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style.

- Key Name: `:fg-min`
- Type: Double
- Example: `1.048`

## Final Gravity Range

A non-empty string denoting a display value for the range of final gravities formatted for display in arbitrary units.

- Key Name: `:fg-range`
- Type: String
- Example: `"1.036sg-1.050sg"`

## Maximum International Bittering Units

A non-negative IEEE-754 floating point number representing the maximum bitterness in IBUs for the style.

- Key Name: `:ibu-max`
- Type: Double
- Example: `40.0`

## Minimum International Bittering Units

A non-negative IEEE-754 floating point number representing the minimum bitterness in IBUs for the style.

- Key Name: `:ibu-min`
- Type: Double
- Example: `32.0`

## International Bittering Units Range

A non-empty string denoting a display value for the range of International Bittering Units formatted for display in arbitrary units.

- Key Name: `:ibu-range`
- Type: String
- Example: `"10-20IBUs"`

## Ingredients

A non-empty string denoting the suggested ingredients for the style.

- Key Name: `:ingredients`
- Type: String
- Example: `"water, barley, and hops."`

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

## Maximum Original Gravity

A non-negative IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style.

- Key Name: `:og-max`
- Type: Double
- Example: `1.06`

## Minimum Original Gravity

A non-negative IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style.

- Key Name: `:og-min`
- Type: Double
- Example: `1.048`

## Original Gravity Range

A non-empty string denoting a display value for the range of original gravities formatted for display in arbitrary units.

- Key Name: `:og-range`
- Type: String
- Example: `"1.036sg-1.050sg"`

## Profile

A non-empty string denoting the aroma and flavor profile of the style.

- Key Name: `:profile`
- Type: String
- Example: `"Full-bodied and dark."`

## Style Guide

A non-empty string denoting the name of the style guide the style/category belongs to.

- Key Name: `:style-guide`
- Type: String
- Example: `"BJCP"`

## Style Letter

A non-empty string denoting the letter used to denote the style or sub-style.

- Key Name: `:style-letter`
- Type: String
- Example: `"A"`

## Type

A case-insensitive string representing the type of beverage the style dictates.
Must be one of: "Mead", "Lager", "Ale", "Mixed", "Wheat", "Cider"

- Ale: A top-fermented beer with a fruity, hoppy taste and a dry finish.
- Cider: A fermented beverage made from fruit and water.
- Lager: A light, bottom-fermented beer with a clean, crisp taste and a smooth finish.
- Mead: A fermented beverage made from honey and water.
- Mixed: A beer style that blends two or more styles.
- Wheat: A beer made with a large proportion of wheat malt.

- Key Name: `:type`
- Type: String
- Example: `"Lager"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
- Example: `1`
