(ns common-beer-format.data.styles.bjcp-2015.american-wild-ale
  "2015 BJCP guidelines on Wild American Ales"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))


(def brett-beer
  (styles/build-style :brett-beer {:category        "American Wild Ale"
                                   :carb-min        1.5
                                   :fg-max          1.02
                                   :og-min          1.076
                                   :name            "Brett Beer"
                                   :type            "Ale"
                                   :style-letter    "A"
                                   :abv-min         0.07
                                   :fg-min          1.016
                                   :category-number "28"
                                   :carb-max        3.0
                                   :ibu-max         15
                                   :ingredients     "Virtually any style of beer, fermented in any manner, then finished with one or more strains of Brett. Alternatively, a beer made with Brett as the sole fermentation strain."
                                   :examples        "Boulevard Saison Brett, Hill Farmstead Arthur, Logsdon Seizoen Bretta, Russian River Sanctification, The Bruery Saison Rue, Victory Helios"
                                   :notes           "Most often drier and fruitier than the base style suggests. Funky notes range from low to high, depending on the age of the beer and strain(s) of Brett used. Funkiness is generally restrained in younger 100% Brett examples, but tends to increase with age. May possess a light acidity, although this does not come from Brett."
                                   :og-max          1.12
                                   :color-min       4.0
                                   :abv-max         0.11
                                   :color-max       22.0
                                   :profile         "Aroma: Variable by base style. Young Brett-fermented beers will possess more fruity notes (e.g., tropical fruit, stone fruit, or citrus), but this is variable by the strain(s) of Brett used. For 100% Brett beers heavily hopped with American hop varieties, the fermentation-derived flavors are often difficult to tease from the hop aromatics. Older 100% Brett beers may start to develop a little funk (e.g., barnyard, wet hay, or slightly earthy or smoky notes), but this character should not dominate. If the beer is fermented with a brewer's yeast in addition to Brett, some of the character of the primary yeast may remain. A faint sourness is acceptable but should not be a prominent character. Appearance: Variable by base style. Clarity can be variable, and depends on the base style and ingredients used. Some haze is not necessarily a fault. Flavor: Variable by base style. Brett character may range from minimal to aggressive. Can be quite fruity (e.g., tropical fruit, berry, stone fruit, citrus), or have some smoky, earthy, or barnyard character. Should not be unpleasantly funky, such as Band-Aid, fetid, nail polish remover, cheese, etc. Light sourness is acceptable with the beer being lightly tart, but should not be truly sour. Always fruitier when young, gaining more funk with age. May not be acetic or lactic. Malt flavors are often less pronounced than in the base style, leaving a beer most often dry and crisp due to high attenuation by the Brett. Mouthfeel: Variable by base style. Generally a light body, lighter than what might be expected from the base style but an overly thin body is a fault. Generally moderate to high carbonation. Head retention is variable."
                                   :ibu-min         7}))


(def mixed-fermentation-sour-beer
  (styles/build-style :mixed-fermentation-sour-beer {:category        "American Wild Ale"
                                                     :carb-min        1.5
                                                     :fg-max          1.02
                                                     :og-min          1.076
                                                     :name            "Mixed-Fermentation Sour Beer"
                                                     :type            "Mixed"
                                                     :style-letter    "B"
                                                     :abv-min         0.07
                                                     :fg-min          1.016
                                                     :category-number "28"
                                                     :carb-max        3.0
                                                     :ibu-max         15
                                                     :ingredients     "Virtually any style of beer. Usually fermented by Lactobacillus and/or Pediococcus, often in conjunction with Saccharomyces and/or Brettanomyces. Can also be a blend of styles. Wood or barrel aging is very common, but not required."
                                                     :examples        "Boulevard Love Child, Cascade Vlad the Imp Aler, Jester King Le Petit Prince, Jolly Pumpkin Calabaza Blanca, Russian River Temptation, The Bruery Rueuze, The Bruery Tart of Darkness"
                                                     :notes           "A sour and/or funky version of a base style of beer."
                                                     :og-max          1.12
                                                     :color-min       4.0
                                                     :abv-max         0.11
                                                     :color-max       22.0
                                                     :profile         "Aroma: Variable by base style. The contribution of non-Saccharomyces microbes should be noticeable to strong, and often contribute a sour and/or funky, wild note. The best examples will display a range of aromatics, rather than a single dominant character. The aroma should be inviting, not harsh or unpleasant. Appearance: Variable by base style. Clarity can be variable; some haze is not a fault. Head retention can be poor due to high levels of acid or anti-foam properties of some lactobacillus strains. Flavor: Variable by base style. Look for an agreeable balance between the base beer and the fermentation character. A range of results is possible from fairly high acidity/funk to a subtle, pleasant, harmonious beer. The best examples are pleasurable to drink with the esters and phenols complementing the malt and/or hops. The wild character can be prominent, but does not need to be dominating in a style with an otherwise strong malt/hop profile. Acidity should be firm yet enjoyable, but should not be biting or vinegary; prominent or objectionable/offensive acetic acid is a fault. Bitterness tends to be low, especially as sourness increases. Mouthfeel: Variable by base style. Generally a light body, almost always lighter than what might be expected from the base style. Generally moderate to high carbonation, although often lower in higher alcohol examples."
                                                     :ibu-min         7}))


(def wild-specialty-beer
  (styles/build-style :wild-specialty-beer {:category        "American Wild Ale"
                                            :carb-min        1.5
                                            :fg-max          1.02
                                            :og-min          1.076
                                            :name            "Wild Specialty Beer"
                                            :type            "Mixed"
                                            :style-letter    "C"
                                            :abv-min         0.07
                                            :fg-min          1.016
                                            :category-number "28"
                                            :carb-max        3.0
                                            :ibu-max         15
                                            :ingredients     "Virtually any style of beer. Any combination of Saccharomyces, Brettanomyces, Lactobacillus, Pediococcus, or other similar fermenters. Can also be a blend of styles. While cherries, raspberries, and peaches are most common, other fruits can be used as well. Vegetables with fruit-like characteristics (chile, rhubarb, pumpkin, etc.) may also be used. Wood or barrel aging is very common, but not required."
                                            :examples        "Cascade Bourbonic Plague, Jester King Atrial Rubicite, New Belgium Eric's Ale, New Glarus Belgian Red, Russian River Supplication, The Lost Abbey Cuvee de Tomme"
                                            :notes           "A sour and/or funky version of a fruit, herb, or spice beer, or a wild beer aged in wood. If wood-aged, the wood should not be the primary or dominant character."
                                            :og-max          1.12
                                            :color-min       4.0
                                            :abv-max         0.11
                                            :color-max       22.0
                                            :profile         "Aroma: Variable by base style. Should show the fruit, sour and/or funk of a wild fermentation, as well as the characteristics of the special ingredients used. The best examples will blend the aromatics from the fermentation with the special ingredients, creating an aroma that may be difficult to attribute precisely. Appearance: Variable by base style, generally showing a color, tint, or hue from any fruit (if used) in both the beer and the head. Clarity can be variable; some haze is not a fault. Head retention is often poor. Flavor: Variable by base style. Should show the fruit, sour and/or funk of a wild fermentation, as well as the characteristics of the special ingredients used. Any fruit sweetness is generally gone, so only the esters typically remain from the fruit. The sour character from the fruit and wild fermentation could be prominent, but should not be overwhelming. The acidity and tannin from any fruit can both enhance the dryness of the beer, so care must be taken with the balance. The acidity should enhance the perception of the fruit flavor, not detract from it. Wood notes, if present, add flavor but should be balanced. Mouthfeel: Variable by base style. Generally a light body, lighter than what might be expected from the base style. Generally moderate to high carbonation; carbonation should balance the base style if one is declared. The presence of tannin from some fruit or wood can provide a slight astringency, enhance the body, or make the beer seem drier than it is."
                                            :ibu-min         7}))


(def american-wild-ale
  (merge brett-beer mixed-fermentation-sour-beer wild-specialty-beer))
