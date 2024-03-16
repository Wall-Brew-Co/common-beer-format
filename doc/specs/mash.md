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
- [Ph](#ph)
- [Sparge Temperature](#sparge-temperature)
- [Tun Specific Heat](#tun-specific-heat)
- [Tun Temperature](#tun-temperature)
- [Tun Weight](#tun-weight)

## Display Grain Temperature

A non-empty string denoting a display value for grain temperature formatted for display in arbitrary units.

- Key Name: `:display-grain-temp`
- Type: String
- Example: `"72F"`

## Display Sparge Temperature

A non-empty string denoting a display value for sparging process temperature formatted for display in arbitrary units.

- Key Name: `:display-sparge-temp`
- Type: String
- Example: `"172F"`

## Display Tun Temperature

A non-empty string denoting a display value for mash tun temperature formatted for display in arbitrary units.

- Key Name: `:display-tun-temp`
- Type: String
- Example: `"72F"`

## Display Tun Weight

A non-empty string denoting a display value for mash tun weight formatted for display in arbitrary units.

- Key Name: `:display-tun-weight`
- Type: String
- Example: `"72lbs"`

## Equip Adjust

A boolean denoting whether or not programs should account for the temperature effects of the equipment used.
When absent, assume false.

- Key Name: `:equip-adjust`
- Type: Spec
- Example: `true`

## Grain Temperature

A non-negative IEEE-754 floating point number representing the temperature of the grain before adding it to the mash in degrees Celsius.

- Key Name: `:grain-temp`
- Type: Double
- Example: `80.0`

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

## Ph

A non-negative IEEE-754 floating point number representing the PH of the water.

- Key Name: `:ph`
- Type: Double
- Example: `2.5`

## Sparge Temperature

A non-negative IEEE-754 floating point number representing the temperature of the sparge in degrees Celsius.

- Key Name: `:sparge-temp`
- Type: Double
- Example: `50.0`

## Tun Specific Heat

A non-negative IEEE-754 floating point number representing the specific heat of the mash tun in Calories per gram-degree Celsius.

- Key Name: `:tun-specific-heat`
- Type: Double
- Example: `0.2`

## Tun Temperature

A non-negative IEEE-754 floating point number representing the temperature of the grain tun in degrees Celsius.

- Key Name: `:tun-temp`
- Type: Double
- Example: `80.0`

## Tun Weight

A non-negative IEEE-754 floating point number representing the weight of the of the mash tun in kilograms.

- Key Name: `:tun-weight`
- Type: Double
- Example: `15.0`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
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

- Key Name: `:decoction-amt`
- Type: String
- Example: `"7.5 liters"`

## Description

A non-empty string describing the mash step.

- Key Name: `:description`
- Type: String
- Example: `"Stir your grain bag carefully at 140F."`

## Display Infusion Amount

A non-empty string denoting a display value for the volume of infused liquid formatted for display in arbitrary units.

- Key Name: `:display-infuse-amt`
- Type: String
- Example: `"2.2L"`

## Display Step Temperature

A non-empty string denoting a display value for the temperature of an arbitrary step formatted for display in arbitrary units.

- Key Name: `:display-step-temp`
- Type: String
- Example: `"150F"`

## End Temperature

A non-negative IEEE-754 floating point number representing the temperature of the mash after the step has completed in degrees Celsius.

- Key Name: `:end-temp`
- Type: Double
- Example: `80.0`

## Infuse Amount

A non-negative IEEE-754 floating point number representing the volume of water in liters required for an infusion step.

- Key Name: `:infuse-amount`
- Type: Double
- Example: `5.8`

## Infusion Temperature

A non-empty string denoting a display value for the temperature of an infusion step formatted for display in arbitrary units.

- Key Name: `:infuse-temp`
- Type: String
- Example: `"150F"`

## Name

A non-empty string representing the name of the ingredient

- Key Name: `:name`
- Type: String
- Example: `"Citra"`

## Ramp Time

A non-negative IEEE-754 floating point number representing the time in minutes to achieve the desired step temperature.

- Key Name: `:ramp-time`
- Type: Double
- Example: `45.0`

## Step Temperature

A non-negative IEEE-754 floating point number representing the temperature of the mash step should be performed at in degrees Celsius.

- Key Name: `:step-temp`
- Type: Double
- Example: `80.0`

## Step Time

A non-negative IEEE-754 floating point number representing the time in minutes to spend at this step.

- Key Name: `:step-time`
- Type: Double
- Example: `45.0`

## Type

A case-insensitive string representing the type of mash step.
Must be one of: "Infusion", "Temperature", "Decoction"

- Decoction: A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
- Infusion: A mash step where fermentable ingredients steep in water at a specific temperature.
- Temperature: A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source.

- Key Name: `:type`
- Type: String
- Example: `"Temperature"`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists

- Key Name: `:version`
- Type: Long
- Example: `1`

## Water Grain Ratio

A non-empty string denoting a display value for the water:grain ratio after infusion formatted for display in arbitrary units.

- Key Name: `:water-grain-ratio`
- Type: String
- Example: `"1.5qt/lb"`
