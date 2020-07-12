(ns common-beer-format.styles.bjcp-2015.pale-american-ale
  "2015 BJCP guidelines on Pale American Ale"
  (:require [common-beer-format.styles.bjcp-2015.styles :as styles]))

(def blonde-ale 
  (styles/build-style :blonde-ale {:category        "Pale American Ale"
                                   :carb-min        1.5
                                   :fg-max          1.013
                                   :og-min          1.038
                                   :name            "Blonde Ale"
                                   :type            "Ale"
                                   :style-letter    "A"
                                   :abv-min         0.038
                                   :fg-min          1.008
                                   :category-number "18"
                                   :carb-max        3.0
                                   :ibu-max         28
                                   :ingredients     "Generally all malt, but can include up to 25% wheat malt and some sugar adjuncts. Any hop variety can be used. Clean American, lightly fruity English, or Kölsch yeast. May also be made with lager yeast, or cold-conditioned. Some versions may have honey, spices and/or fruit added, although if any of these ingredients are stronger than a background flavor they should be entered in those specialty categories instead."
                                   :examples        "Kona Big Wave Golden Ale, Pelican Kiwanda Cream Ale, Russian River Aud Blonde, Victory Summer Love, Widmer Citra Summer Blonde Brew"
                                   :notes           "Easy-drinking, approachable, malt-oriented American craft beer, often with interesting fruit, hop, or character malt notes. Well-balanced and clean, is a refreshing pint without aggressive flavors."
                                   :og-max          1.054
                                   :color-min       3.0
                                   :abv-max         0.055
                                   :color-max       6.0
                                   :profile         "Aroma: Light to moderate sweet malty aroma, possibly with a light bready or caramelly note. Low to moderate fruitiness is optional, but acceptable. May have a low to medium hop aroma, and can reflect almost any hop variety although citrusy, floral, fruity, and spicy notes are common. Appearance: Light yellow to deep gold in color. Clear to brilliant. Low to medium white head with fair to good retention. Flavor: Initial soft malty sweetness, but optionally some light character malt flavor (e.g., bread, toast, biscuit, wheat) can also be present. Caramel flavors typically absent; if present, they are typically low-color caramel notes. Low to medium fruity esters optional, but are welcome. Light to moderate hop flavor (any variety), but shouldn't be overly aggressive. Medium-low to medium bitterness, but the balance is normally towards the malt or even between malt and hops. Finishes medium-dry to slightly malty-sweet; impression of sweetness is often an expression of lower bitterness than actual residual sweetness. Mouthfeel: Medium-light to medium body. Medium to high carbonation. Smooth without being heavy."
                                   :ibu-min         15}))

(def american-pale-ale 
  (styles/build-style :american-pale-ale {:category        "Pale American Ale"
                                          :carb-min        1.5
                                          :fg-max          1.015
                                          :og-min          1.045
                                          :name            "American Pale Ale"
                                          :type            "Ale"
                                          :style-letter    "B"
                                          :abv-min         0.045
                                          :fg-min          1.01
                                          :category-number "18"
                                          :carb-max        3.0
                                          :ibu-max         50
                                          :ingredients     "Pale ale malt, typically North American two-row. American or New World hops, with a wide range of allowable characteristics. American or English ale yeast (neutral to lightly fruity). Specialty grains may add character and complexity, but generally make up a relatively small portion of the grist. Grains that add malt flavor and richness, light sweetness, and toasty or bready notes are often used (along with late hops) to differentiate brands."
                                          :examples        "Ballast Point Grunion Pale Ale, Firestone Walker Pale 31, Great Lakes Burning River, Sierra Nevada Pale Ale, Stone Pale Ale, Tröegs Pale Ale"
                                          :notes           "A pale, refreshing and hoppy ale, yet with sufficient supporting malt to make the beer balanced and drinkable. The clean hop presence can reflect classic or modern American or New World hop varieties with a wide range of characteristics. An average-strength hop-forward pale American craft beer, generally balanced to be more accessible than modern American IPAs."
                                          :og-max          1.06
                                          :color-min       5.0
                                          :abv-max         0.062
                                          :color-max       10.0
                                          :profile         "Aroma: Moderate to strong hop aroma from American or New World hop varieties with a wide range of possible characteristics, including citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, or melon. None of these specific characteristics are required, but hops should be apparent. Low to moderate maltiness supports the hop presentation, and may optionally show small amounts of specialty malt character (bready, toasty, biscuit, caramelly). Fruity esters vary from moderate to none. Dry hopping (if used) may add grassy notes, although this character should not be excessive. Appearance: Pale golden to light amber. Moderately large white to off-white head with good retention. Generally quite clear, although dry-hopped versions may be slightly hazy. Flavor: Moderate to high hop flavor, typically showing an American or New World hop character (citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, melon, etc.). Low to moderate clean grainy-malt character supports the hop presentation, and may optionally show small amounts of specialty malt character (bready, toasty, biscuity). The balance is typically towards the late hops and bitterness, but the malt presence should be supportive, not distracting. Caramel flavors are often absent or fairly restrained (but are acceptable as long as they don't clash with the hops). Fruity yeast esters can be moderate to none, although many hop varieties are quite fruity. Moderate to high hop bitterness with a medium to dry finish. Hop flavor and bitterness often lingers into the finish, but the aftertaste should generally be clean and not harsh. Dry hopping (if used) may add grassy notes, although this character should not be excessive. Mouthfeel: Medium-light to medium body. Moderate to high carbonation. Overall smooth finish without astringency and harshness."
                                          :ibu-min         30}))

(def ^:const pale-american-ale
  (merge blonde-ale american-pale-ale))
