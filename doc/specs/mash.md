# Mash Records

## Mash Wrapper

A `::mash-wrapper` record

### Wrapped Record

- [Mash](#mash)

## Mash

A record representing the mashing process.

### Required Keys

- [Grain Temperature](#grain-temperature)
- [Mash Steps](#mash-steps)
- [Name](#name)
- [Version](#version)

### Optional Keys

- [Display Grain Temperature](#display-grain-temperature)
- [Display Sparge Temperature](#display-sparge-temperature)
- [Display Tun Temperature](#display-tun-temperature)
- [Display Tun Weight](#display-tun-weight)
- [Equip Adjust](#equip-adjust)
- [Notes](#notes)
- [PH](#ph)
- [Sparge Temperature](#sparge-temperature)
- [Tun Specific Heat](#tun-specific-heat)
- [Tun Temperature](#tun-temperature)
- [Tun Weight](#tun-weight)

## Display Grain Temperature

A non-empty string denoting a display value for grain temperature formatted for display in arbitrary units.

- Clojure Key Name: `:display-grain-temp`
- Clojure Type: String
- Example: `"72F"`

## Display Sparge Temperature

A non-empty string denoting a display value for sparging process temperature formatted for display in arbitrary units.

- Clojure Key Name: `:display-sparge-temp`
- Clojure Type: String
- Example: `"172F"`

## Display Tun Temperature

A non-empty string denoting a display value for mash tun temperature formatted for display in arbitrary units.

- Clojure Key Name: `:display-tun-temp`
- Clojure Type: String
- Example: `"72F"`

## Display Tun Weight

A non-empty string denoting a display value for mash tun weight formatted for display in arbitrary units.

- Clojure Key Name: `:display-tun-weight`
- Clojure Type: String
- Example: `"72lbs"`

## Equip Adjust

A boolean denoting whether or not programs should account for the temperature effects of the equipment used.
When absent, assume false.

- Clojure Key Name: `:equip-adjust`
- Clojure Type: Spec
- Example: `true`

## Grain Temperature

A non-negative IEEE-754 floating point number representing the temperature of the grain before adding it to the mash in degrees Celsius.

- Clojure Key Name: `:grain-temp`
- Clojure Type: Double
- Example: `80.0`

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

## PH

A non-negative IEEE-754 floating point number representing the PH of the water.

- Clojure Key Name: `:ph`
- Clojure Type: Double
- Example: `2.5`

## Sparge Temperature

A non-negative IEEE-754 floating point number representing the temperature of the sparge in degrees Celsius.

- Clojure Key Name: `:sparge-temp`
- Clojure Type: Double
- Example: `50.0`

## Tun Specific Heat

A non-negative IEEE-754 floating point number representing the specific heat of the mash tun in Calories per gram-degree Celsius.

- Clojure Key Name: `:tun-specific-heat`
- Clojure Type: Double
- Example: `0.2`

## Tun Temperature

A non-negative IEEE-754 floating point number representing the temperature of the grain tun in degrees Celsius.

- Clojure Key Name: `:tun-temp`
- Clojure Type: Double
- Example: `80.0`

## Tun Weight

A non-negative IEEE-754 floating point number representing the weight of the of the mash tun in kilograms.

- Clojure Key Name: `:tun-weight`
- Clojure Type: Double
- Example: `15.0`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`

## Mash Steps

A vector of valid `::mash-step` records

### Collection Type

- [Mash Step Wrapper](#mash-step-wrapper)

## Mash Step Wrapper

A `::mash` record wrapped in a `:mash` map

### Wrapped Record

- [Mash Step](#mash-step)

## Mash Step

A record representing a step within the mashing process.

### Required Keys

- [Infuse Amount](#infuse-amount)
- [Name](#name)
- [Step Temperature](#step-temperature)
- [Step Time](#step-time)
- [Type](#type)
- [Version](#version)

### Optional Keys

- [Decoction Amount](#decoction-amount)
- [Description](#description)
- [Display Infusion Amount](#display-infusion-amount)
- [Display Step Temperature](#display-step-temperature)
- [End Temperature](#end-temperature)
- [Infusion Temperature](#infusion-temperature)
- [Ramp Time](#ramp-time)
- [Water Grain Ratio](#water-grain-ratio)

## Decoction Amount

A non-empty string denoting a display value for the calculated volume of mash to decoct formatted for display in arbitrary units.

- Clojure Key Name: `:decoction-amt`
- Clojure Type: String
- Example: `"7.5 liters"`

## Description

A non-empty string describing the mash step.

- Clojure Key Name: `:description`
- Clojure Type: String
- Example: `"Stir your grain bag carefully at 140F."`

## Display Infusion Amount

A non-empty string denoting a display value for the volume of infused liquid formatted for display in arbitrary units.

- Clojure Key Name: `:display-infuse-amt`
- Clojure Type: String
- Example: `"2.2L"`

## Display Step Temperature

A non-empty string denoting a display value for the temperature of an arbitrary step formatted for display in arbitrary units.

- Clojure Key Name: `:display-step-temp`
- Clojure Type: String
- Example: `"150F"`

## End Temperature

A non-negative IEEE-754 floating point number representing the temperature of the mash after the step has completed in degrees Celsius.

- Clojure Key Name: `:end-temp`
- Clojure Type: Double
- Example: `80.0`

## Infuse Amount

A non-negative IEEE-754 floating point number representing the volume of water in liters required for an infusion step.

- Clojure Key Name: `:infuse-amount`
- Clojure Type: Double
- Example: `5.8`

## Infusion Temperature

A non-empty string denoting a display value for the temperature of an infusion step formatted for display in arbitrary units.

- Clojure Key Name: `:infuse-temp`
- Clojure Type: String
- Example: `"150F"`

## Name

A non-empty string representing the name of the ingredient.

- Clojure Key Name: `:name`
- Clojure Type: String
- Example: `"Citra"`

## Ramp Time

A non-negative IEEE-754 floating point number representing the time in minutes to achieve the desired step temperature.

- Clojure Key Name: `:ramp-time`
- Clojure Type: Double
- Example: `45.0`

## Step Temperature

A non-negative IEEE-754 floating point number representing the temperature of the mash step should be performed at in degrees Celsius.

- Clojure Key Name: `:step-temp`
- Clojure Type: Double
- Example: `80.0`

## Step Time

A non-negative IEEE-754 floating point number representing the time in minutes to spend at this step.

- Clojure Key Name: `:step-time`
- Clojure Type: Double
- Example: `45.0`

## Type

A case-sensitive string representing the type of mash step.
Must be one of: "Decoction", "Temperature", "Infusion"

- Decoction: A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
- Infusion: A mash step where fermentable ingredients steep in water at a specific temperature.
- Temperature: A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source.

- Clojure Key Name: `:type`
- Clojure Type: String
- Example: `"Temperature"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`

## Water Grain Ratio

A non-empty string denoting a display value for the water:grain ratio after infusion formatted for display in arbitrary units.

- Clojure Key Name: `:water-grain-ratio`
- Clojure Type: String
- Example: `"1.5qt/lb"`
