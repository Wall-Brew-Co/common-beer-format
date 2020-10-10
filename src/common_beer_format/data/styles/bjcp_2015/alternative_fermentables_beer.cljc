(ns common-beer-format.data.styles.bjcp-2015.alternative-fermentables-beer
  "2015 BJCP guidelines on Beers with alternative (non-barley, non-wheat) fermentables"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def alternative-grain-beer 
  (styles/build-style :alternative-grain-beer {:category        "Alternative Fermentables Beer"
                                               :carb-min        1.5
                                               :fg-max          1.02
                                               :og-min          1.076
                                               :name            "Alternative Grain Beer"
                                               :type            "Mixed"
                                               :style-letter    "A"
                                               :abv-min         0.07
                                               :fg-min          1.016
                                               :category-number "31"
                                               :carb-max        3.0
                                               :ibu-max         15
                                               :ingredients     "Generally ales, although some dark strong lagers exist. Spices are required, and often include those evocative of the Christmas season (e.g., allspice, nutmeg, cinnamon, cloves, ginger) but any combination is possible and creativity is encouraged. Fruit peel (e.g., oranges, lemon) may be used, as may subtle additions of other fruits. Flavorful adjuncts are often used (e.g., molasses, treacle, invert sugar, brown sugar, honey, maple syrup, etc.)."
                                               :examples        "Green's Indian Pale Ale, Lakefront New Grist, New Planet Pale Ale"
                                               :notes           "A base beer enhanced by or featuring the character of additional grain or grains. The specific character depends greatly on the character of the added grains."
                                               :og-max          1.12
                                               :color-min       4.0
                                               :abv-max         0.11
                                               :color-max       22.0
                                               :profile         "Aroma: Same as base beer style. The added grain will lend a particular character, although with some grains the beer will simply seem a bit more grainy or nutty. The alternative grain should provide the major aroma profile for this beer. Appearance: Same as base beer style, although some additional haze may be noticeable. Flavor: Same as base beer style. The additional grain should be noticeable in flavor, although it may not be necessarily identifiable. However, the alternative grain should provide the major flavor profile for this beer. Different grains have different characters; the additional grain should enhance the flavor of the base beer. Many will add an additional grainy, bready, or nutty flavor. Mouthfeel: Same as the base beer, although many additional grains will tend to increase the body (oats, rye) and increase the viscosity, while some may decrease the body (GF grains) resulting in thinness."
                                               :ibu-min         7}))

(def alternative-sugar-beer 
  (styles/build-style :alternative-sugar-beer {:category        "Alternative Fermentables Beer"
                                               :carb-min        1.5
                                               :fg-max          1.02
                                               :og-min          1.076
                                               :name            "Alternative Sugar Beer"
                                               :type            "Mixed"
                                               :style-letter    "B"
                                               :abv-min         0.07
                                               :fg-min          1.016
                                               :category-number "31"
                                               :carb-max        3.0
                                               :ibu-max         15
                                               :ingredients     "Generally ales, although some dark strong lagers exist. Spices are required, and often include those evocative of the Christmas season (e.g., allspice, nutmeg, cinnamon, cloves, ginger) but any combination is possible and creativity is encouraged. Fruit peel (e.g., oranges, lemon) may be used, as may subtle additions of other fruits. Flavorful adjuncts are often used (e.g., molasses, treacle, invert sugar, brown sugar, honey, maple syrup, etc.)."
                                               :examples        "Bell's Hopslam, Fullers Honey Dew, Lagunitas Brown Shugga'"
                                               :notes           "A harmonious marriage of sugar and beer, but still recognizable as a beer. The sugar character should both be evident but in balance with the beer, not so forward as to suggest an artificial product."
                                               :og-max          1.12
                                               :color-min       4.0
                                               :abv-max         0.11
                                               :color-max       22.0
                                               :profile         "Aroma: Same as the base beer, except that some additional fermentables (honey, molasses, etc.) may add an aroma component. Whatever additional aroma component is present should be in balance with the beer components, and be a pleasant combination. Appearance: Same as the base beer, although some sugars will bring additional colors. Flavor: Same as the base beer, except that some additional fermentables (honey, molasses, etc.) may add a flavor component. Whatever additional flavor component is present should be in balance with the beer components, and be a pleasant combination. Added sugars should not have a raw, unfermented flavor. Some added sugars will have unfermentable elements that may provide a fuller finish; fully fermentable sugars may thin out the finish. Mouthfeel: Same as the base beer, although depending on the type of sugar added, could increase or decrease the body."
                                               :ibu-min         7}))

(def alternative-fermentables-beer
  (merge alternative-grain-beer alternative-sugar-beer))
