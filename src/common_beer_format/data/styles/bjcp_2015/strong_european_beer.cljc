(ns common-beer-format.data.styles.bjcp-2015.strong-european-beer
  "2015 BJCP guidelines on Strong European Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))


(def doppelbock
  (styles/build-style :doppelbock {:category        "Strong European Beer"
                                   :carb-min        1.5
                                   :fg-max          1.024
                                   :og-min          1.072
                                   :name            "Doppelbock"
                                   :type            "Lager"
                                   :style-letter    "A"
                                   :abv-min         0.07
                                   :fg-min          1.016
                                   :category-number "9"
                                   :carb-max        3.0
                                   :ibu-max         26
                                   :ingredients     "Pils and/or Vienna malt for pale versions (with some Munich), Munich and Vienna malts for darker ones and occasionally a tiny bit of darker color malts (such as Carafa). Saazer-type hops. Clean lager yeast. Decoction mashing is traditional."
                                   :examples        "Dark Versions –Andechser Doppelbock Dunkel, Ayinger Celebrator, Paulaner Salvator, Spaten Optimator, Tröegs Troegenator, Weihenstephaner Korbinian,; Pale Versions – Eggenberg Urbock 23º, EKU 28, Plank Bavarian Heller Doppelbock"
                                   :notes           "A strong, rich, and very malty German lager that can have both pale and dark variants. The darker versions have more richly-developed, deeper malt flavors, while the paler versions have slightly more hops and dryness."
                                   :og-max          1.112
                                   :color-min       6.0
                                   :abv-max         0.1
                                   :color-max       25.0
                                   :profile         "Aroma: Very strong maltiness. Darker versions will have significant Maillard products and often some toasty aromas. A light caramel aroma is acceptable. Lighter versions will have a strong malt presence with some Maillard products and toasty notes. Virtually no hop aroma, although a light noble hop aroma is acceptable in pale versions. A moderately low malt-derived dark fruit character may be present (but is optional) in dark versions. A very slight chocolate-like aroma may be present in darker versions, but no roasted or burned aromatics should ever be present. Moderate alcohol aroma may be present. Appearance: Deep gold to dark brown in color. Darker versions often have ruby highlights. Lagering should provide good clarity. Large, creamy, persistent head (color varies with base style: white for pale versions, off-white for dark varieties). Stronger versions might have impaired head retention, and can display noticeable legs. Flavor: Very rich and malty. Darker versions will have significant Maillard products and often some toasty flavors. Lighter versions will have a strong malt flavor with some Maillard products and toasty notes. A very slight chocolate flavor is optional in darker versions, but should never be perceived as roasty or burnt. Clean lager character. A moderately low malt-derived dark fruit character is optional in darker versions. Invariably there will be an impression of alcoholic strength, but this should be smooth and warming rather than harsh or burning. Little to no hop flavor (more is acceptable in pale versions). Hop bitterness varies from moderate to moderately low but always allows malt to dominate the flavor. Most versions are fairly malty-sweet, but should have an impression of attenuation. The sweetness comes from low hopping, not from incomplete fermentation. Paler versions generally have a drier finish. Mouthfeel: Medium-full to full body. Moderate to moderately-low carbonation. Very smooth without harshness, astringency. A light alcohol warmth may be noted, but it should never burn."
                                   :ibu-min         16}))


(def eisbock
  (styles/build-style :eisbock {:category        "Strong European Beer"
                                :carb-min        1.5
                                :fg-max          1.035
                                :og-min          1.078
                                :name            "Eisbock"
                                :type            "Lager"
                                :style-letter    "B"
                                :abv-min         0.09
                                :fg-min          1.02
                                :category-number "9"
                                :carb-max        3.0
                                :ibu-max         35
                                :ingredients     "Same as doppelbock. Commercial eisbocks are generally concentrated anywhere from 7% to 33% (by volume)."
                                :examples        "Kulmbacher Eisbock"
                                :notes           "A strong, full-bodied, rich, and malty dark German lager often with a viscous quality and strong flavors. Even though flavors are concentrated, the alcohol should be smooth and warming, not burning."
                                :og-max          1.12
                                :color-min       18.0
                                :abv-max         0.14
                                :color-max       30.0
                                :profile         "Aroma: Dominated by a balance of rich, intense malt and a definite alcohol presence. No hop aroma. May have significant malt-derived dark fruit esters. Alcohol aromas should not be harsh or solventy. Appearance: Deep copper to dark brown in color, often with attractive ruby highlights. Lagering should provide good clarity. Head retention may be moderate to poor. Off-white to deep ivory colored head. Pronounced legs are often evident. Flavor: Rich, sweet malt balanced by a significant alcohol presence. The malt can have Maillard products, toasty qualities, some caramel, and occasionally a slight chocolate flavor. No hop flavor. Hop bitterness just offsets the malt sweetness enough to avoid a cloying character. May have significant malt-derived dark fruit esters. The alcohol should be smooth, not harsh or hot, and should help the hop bitterness balance the strong malt presence. The finish should be of malt and alcohol, and can have a certain dryness from the alcohol. It should not be sticky, syrupy or cloyingly sweet. Clean lager character. Mouthfeel: Full to very full-bodied. Low carbonation. Significant alcohol warmth without sharp hotness. Very smooth without harsh edges from alcohol, bitterness, fusels, or other concentrated flavors."
                                :ibu-min         25}))


(def baltic-porter
  (styles/build-style :baltic-porter {:category        "Strong European Beer"
                                      :carb-min        1.5
                                      :fg-max          1.024
                                      :og-min          1.06
                                      :name            "Baltic Porter"
                                      :type            "Ale"
                                      :style-letter    "C"
                                      :abv-min         0.065
                                      :fg-min          1.016
                                      :category-number "9"
                                      :carb-max        3.0
                                      :ibu-max         40
                                      :ingredients     "Generally lager yeast (cold fermented if using ale yeast, as is required when brewed in Russia). Debittered chocolate or black malt. Munich or Vienna base malt. Continental hops (Saazer-type, typically). May contain crystal malts and/or adjuncts. Brown or amber malt common in historical recipes."
                                      :examples        "Aldaris Porteris, Baltika #6 Porter, Devils Backbone Danzig, Okocim Porter, Sinebrychoff Porter, Zywiec Porter"
                                      :notes           "A Baltic Porter often has the malt flavors reminiscent of an English porter and the restrained roast of a schwarzbier, but with a higher OG and alcohol content than either. Very complex, with multi-layered malt and dark fruit flavors."
                                      :og-max          1.09
                                      :color-min       17.0
                                      :abv-max         0.095
                                      :color-max       30.0
                                      :profile         "Aroma: Rich malty sweetness often containing caramel, toffee, nutty to deep toast, and/or licorice notes. Complex alcohol and ester profile of moderate strength, and reminiscent of plums, prunes, raisins, cherries or currants, occasionally with a vinous Port-like quality. Some darker malt character that is deep chocolate, coffee or molasses but never burnt. No hops. No sourness. Very smooth. Appearance: Dark reddish-copper to opaque dark brown (not black). Thick, persistent tan-colored head. Clear, although darker versions can be opaque. Flavor: As with aroma, has a rich malty sweetness with a complex blend of deep malt, dried fruit esters, and alcohol. Has a prominent yet smooth schwarzbier-like roasted flavor that stops short of burnt. Mouth-filling and very smooth. Clean lager character. Starts sweet but darker malt flavors quickly dominates and persists through finish. Just a touch dry with a hint of roast coffee or licorice in the finish. Malt can have a caramel, toffee, nutty, molasses and/or licorice complexity. Light hints of black currant and dark fruits. Medium-low to medium bitterness from malt and hops, just to provide balance. Hop flavor from slightly spicy hops ranges from none to medium-low. Mouthfeel: Generally quite full-bodied and smooth, with a well-aged alcohol warmth. Medium to medium-high carbonation, making it seem even more mouth-filling. Not heavy on the tongue due to carbonation level."
                                      :ibu-min         20}))


(def strong-european-beer
  (merge doppelbock eisbock baltic-porter))
