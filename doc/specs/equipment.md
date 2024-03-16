# Equipment Records

## Equipments Wrapper

An ::equipment-wrapper record.

### Wrapped Record

- [Equipments](#equipments)

## Equipments

A vector of valid ::equipment-wrapper records.

### Collection Type

- [Equipment Wrapper](#equipment-wrapper)

## Equipment Wrapper

An ::equipment record wrapped in an ::equipment map.

### Wrapped Record

- [Equipment](#equipment)

## Equipment

A record representing the brewing equipment used in brewing.

### Required Keys

- [Batch Size](#batch-size)
- [Boil Size](#boil-size)
- [Name](#name)
- [Version](#version)

### Optional Keys

- [Boil Time](#boil-time)
- [Calculate Boil Volume](#calculate-boil-volume)
- [Display Batch Size](#display-batch-size)
- [Display Boil Size](#display-boil-size)
- [Display Lauter Deadspace](#display-lauter-deadspace)
- [Display Top Up Kettle](#display-top-up-kettle)
- [Display Top Up Water](#display-top-up-water)
- [Display Trub Chiller Loss](#display-trub-chiller-loss)
- [Display Tun Volume](#display-tun-volume)
- [Display Tun Weight](#display-tun-weight)
- [Evap Rate](#evap-rate)
- [Hop Utilization](#hop-utilization)
- [Lauter Deadspace](#lauter-deadspace)
- [Notes](#notes)
- [Top Up Kettle](#top-up-kettle)
- [Top Up Water](#top-up-water)
- [Trub Chiller Loss](#trub-chiller-loss)
- [Tun Specific Heat](#tun-specific-heat)
- [Tun Volume](#tun-volume)
- [Tun Weight](#tun-weight)

## Batch Size

A non-negative IEEE-754 floating point number representing the target volume of the batch at the start of fermentation.

- Key Name: `:batch-size`
- Type: Double
- Example: `5.8`

## Boil Size

A non-negative IEEE-754 floating point number representing the pre-boil volume for the equipment setup.

- Key Name: `:boil-size`
- Type: Double
- Example: `10.8`

## Boil Time

A non-negative IEEE-754 floating point number representing the normal amount of time one boils for this equipment setup. This can be used with the evaporation rate to calculate the evaporation loss.

- Key Name: `:boil-time`
- Type: Double
- Example: `15.0`

## Calculate Boil Volume

A boolean denoting whether or not programs reading this equipment record should calculate the boil size.
When absent, assume false.
When true, then boil-size = `(batch-size - top-up-water - trub-chiller-loss) * (1 + boil-time * evap-rate)`

- Key Name: `:calc-boil-volume`
- Type: Spec
- Example: `true`

## Display Batch Size

A non-empty string denoting a display value for the pre-fermentation volume formatted for display in arbitrary units.

- Key Name: `:display-batch-size`
- Type: String
- Example: `"4.5 gallons"`

## Display Boil Size

A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units.

- Key Name: `:display-boil-size`
- Type: String
- Example: `"5.0 gallons"`

## Display Lauter Deadspace

A non-empty string denoting a display value for the volume of wort lost in the lauter vessel formatted for display in arbitrary units.

- Key Name: `:display-lauter-deadspace`
- Type: String
- Example: `"2.2 liters"`

## Display Top Up Kettle

A non-empty string denoting a display value for the top-up water added to the pre-boil stage of the kettle formatted for display in arbitrary units.

- Key Name: `:display-top-up-kettle`
- Type: String
- Example: `"2.2 liters"`

## Display Top Up Water

A non-empty string denoting a display value for the volume of top-up water added before fermentation formatted for display in arbitrary units.

- Key Name: `:display-top-up-water`
- Type: String
- Example: `"2.2 liters"`

## Display Trub Chiller Loss

A non-empty string denoting a display value for the volume of wort lost in transition between boiler and fermentation vessel formatted for display in arbitrary units.

- Key Name: `:display-trub-chiller-loss`
- Type: String
- Example: `"2.2 liters"`

## Display Tun Volume

A non-empty string denoting a display value for the volume capacity of the mash tun formatted for display in arbitrary units.

- Key Name: `:display-tun-volume`
- Type: String
- Example: `"20 liters"`

## Display Tun Weight

A non-empty string denoting a display value for the empty weight of the mash tun formatted for display in arbitrary units.

- Key Name: `:display-tun-weight`
- Type: String
- Example: `"5.5 pounds"`

## Evap Rate

A non-negative IEEE-754 floating point number representing the percentage of wort lost to evaporation per hour of the boil.

- Key Name: `:evap-rate`
- Type: Double
- Example: `1.2`

## Hop Utilization

A non-negative IEEE-754 floating point number representing the percentage of large batch hop utilization.

- Key Name: `:hop-utilization`
- Type: Double
- Example: `1.2`

## Lauter Deadspace

A non-negative IEEE-754 floating point number representing the volume of wort lost to the lauter tun.

- Key Name: `:lauter-deadspace`
- Type: Double
- Example: `0.1`

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

## Top Up Kettle

A non-negative IEEE-754 floating point number representing the volume of top-up water added to the boil kettle before the boil begins.

- Key Name: `:top-up-kettle`
- Type: Double
- Example: `2.1`

## Top Up Water

A non-negative IEEE-754 floating point number representing the volume of top-up water added before fermentation in liters.

- Key Name: `:top-up-water`
- Type: Double
- Example: `2.1`

## Trub Chiller Loss

A non-negative IEEE-754 floating point number representing the volume of wort lost during transition from the boiler to primary fermentation vessel.

- Key Name: `:trub-chiller-loss`
- Type: Double
- Example: `0.1`

## Tun Specific Heat

A non-negative IEEE-754 floating point number representing the specific heat of the mash tun in Calories per gram-degree Celsius.

- Key Name: `:tun-specific-heat`
- Type: Double
- Example: `0.2`

## Tun Volume

A non-negative IEEE-754 floating point number representing the volume of the of the mash tun in liters.

- Key Name: `:tun-volume`
- Type: Double
- Example: `15.0`

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
