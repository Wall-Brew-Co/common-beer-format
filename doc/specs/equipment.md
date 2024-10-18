# Equipment Records

## Equipments Wrapper

An `::equipment-wrapper` record set.

- BeerXML Type: `Record Set`

### Wrapped Record

- [Equipments](#equipments)

## Equipments

A vector of valid `::equipment-wrapper` records.

### Collection Type

- [Equipment Wrapper](#equipment-wrapper)

## Equipment Wrapper

An `::equipment` record wrapped in an `:equipment` map.

- BeerXML Type: `Record`

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
- [Evaporation Rate](#evaporation-rate)
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

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:batch-size`
- Clojure Type: Double
- Example: `5.8`

## Boil Size

A non-negative IEEE-754 floating point number representing the pre-boil volume for the equipment setup.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:boil-size`
- Clojure Type: Double
- Example: `10.8`

## Boil Time

A non-negative IEEE-754 floating point number representing the normal amount of time one boils for this equipment setup. This can be used with the evaporation rate to calculate the evaporation loss.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Minute
- Clojure Key Name: `:boil-time`
- Clojure Type: Double
- Example: `15`

## Calculate Boil Volume

A boolean denoting whether or not programs reading this equipment record should calculate the boil size.
When absent, assume false.
When true, then boil-size = `(batch-size - top-up-water - trub-chiller-loss) * (1 + boil-time * evap-rate)`

- BeerXML Type: `Boolean`
- Clojure Key Name: `:calc-boil-volume`
- Clojure Type: Spec
- Example: `true`

## Display Batch Size

A non-empty string denoting a display value for the pre-fermentation volume formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-batch-size`
- Clojure Type: String
- Example: `"4.5 gallons"`

## Display Boil Size

A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-boil-size`
- Clojure Type: String
- Example: `"5.0 gallons"`

## Display Lauter Deadspace

A non-empty string denoting a display value for the volume of wort lost in the lauter vessel formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-lauter-deadspace`
- Clojure Type: String
- Example: `"2.2 liters"`

## Display Top Up Kettle

A non-empty string denoting a display value for the top-up water added to the pre-boil stage of the kettle formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-top-up-kettle`
- Clojure Type: String
- Example: `"2.2 liters"`

## Display Top Up Water

A non-empty string denoting a display value for the volume of top-up water added before fermentation formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-top-up-water`
- Clojure Type: String
- Example: `"2.2 liters"`

## Display Trub Chiller Loss

A non-empty string denoting a display value for the volume of wort lost in transition between boiler and fermentation vessel formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-trub-chiller-loss`
- Clojure Type: String
- Example: `"2.2 liters"`

## Display Tun Volume

A non-empty string denoting a display value for the volume capacity of the mash tun formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-tun-volume`
- Clojure Type: String
- Example: `"20 liters"`

## Display Tun Weight

A non-empty string denoting a display value for the empty weight of the mash tun formatted for display in arbitrary units.

- BeerXML Type: `Text`
- Clojure Key Name: `:display-tun-weight`
- Clojure Type: String
- Example: `"5.5 pounds"`

## Evaporation Rate

A non-negative IEEE-754 floating point number representing the percentage of wort lost to evaporation per hour of the boil.

- BeerXML Type: `Percentage`
- BeerXML Unit: Percent per Hour
- Clojure Key Name: `:evap-rate`
- Clojure Type: Double
- Example: `1.2`

## Hop Utilization

A non-negative IEEE-754 floating point number representing the percentage of large batch hop utilization.

- BeerXML Type: `Percentage`
- Clojure Key Name: `:hop-utilization`
- Clojure Type: Double
- Example: `1.2`

## Lauter Deadspace

A non-negative IEEE-754 floating point number representing the volume of wort lost to the lauter tun.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:lauter-deadspace`
- Clojure Type: Double
- Example: `0.1`

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

## Top Up Kettle

A non-negative IEEE-754 floating point number representing the volume of top-up water added to the boil kettle before the boil begins.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:top-up-kettle`
- Clojure Type: Double
- Example: `2.1`

## Top Up Water

A non-negative IEEE-754 floating point number representing the volume of top-up water added before fermentation in liters.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:top-up-water`
- Clojure Type: Double
- Example: `2.1`

## Trub Chiller Loss

A non-negative IEEE-754 floating point number representing the volume of wort lost during transition from the boiler to primary fermentation vessel.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:trub-chiller-loss`
- Clojure Type: Double
- Example: `0.1`

## Tun Specific Heat

A non-negative IEEE-754 floating point number representing the specific heat of the mash tun in Calories per gram-degree Celsius.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Calories per Gram Degree Celsius
- Clojure Key Name: `:tun-specific-heat`
- Clojure Type: Double
- Example: `0.2`

## Tun Volume

A non-negative IEEE-754 floating point number representing the volume of the of the mash tun in liters.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Liter
- Clojure Key Name: `:tun-volume`
- Clojure Type: Double
- Example: `15.0`

## Tun Weight

A non-negative IEEE-754 floating point number representing the weight of the of the mash tun in kilograms.

- BeerXML Type: `Floating Point`
- BeerXML Unit: Kilogram
- Clojure Key Name: `:tun-weight`
- Clojure Type: Double
- Example: `15.0`

## Version

An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists.

- BeerXML Type: `Integer`
- Clojure Key Name: `:version`
- Clojure Type: Long
- Example: `1`
