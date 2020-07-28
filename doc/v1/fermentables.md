# Fermentables

The specs for fermentable ingredients are meant to encapsulate the grains, extracts, and sugars that provide the main source of fermentable sugars in a beer.

The common-beer-format implements the 1.0 version of the BeerXML spec, and provides definitions for the following required attributes:

| Name      | Quick Description
|-----------|------------------
| `name`    | A string representing the name of the ingredient
| `version` | An integer representing the version of the BeerXML spec implemented in a given record.
| `type`    | Must be one of: 'Grain', 'Sugar', 'Extract', 'Dry Extract', and 'Adjunct'
| `amount`  | A number representing the weight of a particular ingredient in kilograms
| `yield`   | A number representing the percent rendered sugar from the fermentable
| `color`   | A number representing the [SRM color](https://en.wikipedia.org/wiki/Standard_Reference_Method) of a fermentable

The following optional attributes are also supported:

| Name               | Quick Description
|--------------------|------------------
| `add-after-boil`   | A boolean representing if the fermentable is added after the boil
| `origin`           | A string representing the place of origin of the fermentable
| `supplier`         | A string representing the place of sale/supply of the fermentable
| `notes`            | A string for any notes about the fermentable
| `coarse-fine-diff` | A number representing the percent difference in yield between a coarse and a fine grain milling
| `moisture`         | A number representing the percent of moisture in the fermentable
| `diastatic-power`  | A number representing the ability of a malt to convert starches into fermentable sugars in [Degrees Lintner](https://en.wikipedia.org/wiki/Degree_Lintner)
| `protein`          | A number representing the percent protein contents of the grain
| `max-in-batch`     | A number representing the maximum suggested percentage the fermentable should comprise of a recipe
| `recommend-mash`   | A boolean representing if the fermentable should be added before or during the mashing process
| `ibu-gal-per-lb`   | A number representing the added bitterness of a fermentable in [IBUs](https://en.wikipedia.org/wiki/Beer_measurement#Bitterness) per pound per gallon in a 60 minute boil
| `display-amount`   | A string representing the `amount` value as formatted for display in whatever preferred system of measurement the user desires
| `potential`        | A number representing the [potential maximum original gravity](https://en.wikipedia.org/wiki/Gravity_(alcoholic_beverage)) of the fermentable
| `inventory`        | A string representing the amount of the fermentable in inventory as formatted for display in whatever preferred system of measurement the user desires
| `display-color`    | A string representing the color of the fermentable as formatted for display in whatever preferred system of measurement the user desires

## License

Copyright © 2020 - [Wall Brew Co](https://wallbrew.com/)

This software is provided for free, public use as outlined in the [MIT License](https://github.com/Wall-Brew-Co/common-beer-format/blob/master/LICENSE)
