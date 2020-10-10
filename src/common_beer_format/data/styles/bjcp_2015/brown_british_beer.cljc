(ns common-beer-format.data.styles.bjcp-2015.brown-british-beer
  "2015 BJCP guidelines on Brown British Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def dark-mild
  (styles/build-style :dark-mild {:category        "Brown British Beer"
                                  :carb-min        1.5
                                  :fg-max          1.013
                                  :og-min          1.03
                                  :name            "Dark Mild"
                                  :type            "Ale"
                                  :style-letter    "A"
                                  :abv-min         0.03
                                  :fg-min          1.008
                                  :category-number "13"
                                  :carb-max        3.0
                                  :ibu-max         25
                                  :ingredients     "Pale British base malts (often fairly dextrinous), crystal malt, dark malts or dark sugar adjuncts, may also include adjuncts such as flaked maize, and may be colored with brewer's caramel. Characterful British ale yeast. Any type of hops, since their character is muted and rarely is noticeable."
                                  :examples        "Banks's Mild, Cain's Dark Mild, Highgate Dark Mild, Brain's Dark, Moorhouse Black Cat, Rudgate Ruby Mild, Theakston Traditional Mild"
                                  :notes           "A dark, low-gravity, malt-focused British session ale readily suited to drinking in quantity. Refreshing, yet flavorful, with a wide range of dark malt or dark sugar expression."
                                  :og-max          1.038
                                  :color-min       12.0
                                  :abv-max         0.038
                                  :color-max       25.0
                                  :profile         "Aroma: Low to moderate malt aroma, and may have some fruitiness. The malt expression can take on a wide range of character, which can include caramel, toffee, grainy, toasted, nutty, chocolate, or lightly roasted. Little to no hop aroma, earthy or floral if present. Very low to no diacetyl. Appearance: Copper to dark brown or mahogany color. A few paler examples (medium amber to light brown) exist. Generally clear, although is traditionally unfiltered. Low to moderate off-white to tan head; retention may be poor. Flavor: Generally a malty beer, although may have a very wide range of malt- and yeast-based flavors (e.g., malty, sweet, caramel, toffee, toast, nutty, chocolate, coffee, roast, fruit, licorice, plum, raisin). Can finish sweet to dry. Versions with darker malts may have a dry, roasted finish. Low to moderate bitterness, enough to provide some balance but not enough to overpower the malt. Fruity esters moderate to none. Diacetyl and hop flavor low to none. Mouthfeel: Light to medium body. Generally low to medium-low carbonation. Roast-based versions may have a light astringency. Sweeter versions may seem to have a rather full mouthfeel for the gravity."
                                  :ibu-min         10}))

(def british-brown-ale
  (styles/build-style :british-brown-ale {:category        "Brown British Beer"
                                          :carb-min        1.5
                                          :fg-max          1.013
                                          :og-min          1.04
                                          :name            "British Brown Ale"
                                          :type            "Ale"
                                          :style-letter    "B"
                                          :abv-min         0.042
                                          :fg-min          1.008
                                          :category-number "13"
                                          :carb-max        3.0
                                          :ibu-max         30
                                          :ingredients     "British mild ale or pale ale malt base with caramel malts. May also have small amounts darker malts (e.g., chocolate) to provide color and the nutty character. English hop varieties are most authentic."
                                          :examples        "Maxim Double Maxim, Newcastle Brown Ale, Riggwelter Yorkshire Ale, Samuel Smith's Nut Brown Ale, Wychwood Hobgoblin"
                                          :notes           "A malty, brown caramel-centric British ale without the roasted flavors of a Porter."
                                          :og-max          1.052
                                          :color-min       12.0
                                          :abv-max         0.054
                                          :color-max       22.0
                                          :profile         "Aroma: Light, sweet malt aroma with toffee, nutty, or light chocolate notes, and a light to heavy caramel quality. A light but appealing floral or earthy hop aroma may also be noticed. A light fruity aroma may be evident, but should not dominate. Appearance: Dark amber to dark reddish-brown color. Clear. Low to moderate off-white to light tan head. Flavor: Gentle to moderate malt sweetness, with a light to heavy caramel character and a medium to dry finish. Malt may also have a nutty, toasted, biscuity, toffee, or light chocolate character. Medium to medium-low bitterness. Malt-hop balance ranges from even to malt-focused; hop flavor low to none (floral or earthy qualities). Low to moderate fruity esters can be present. Mouthfeel: Medium-light to medium body. Medium to medium-high carbonation."
                                          :ibu-min         20}))

(def english-porter
  (styles/build-style :english-porter {:category        "Brown British Beer"
                                       :carb-min        1.5
                                       :fg-max          1.014
                                       :og-min          1.04
                                       :name            "English Porter"
                                       :type            "Ale"
                                       :style-letter    "C"
                                       :abv-min         0.04
                                       :fg-min          1.008
                                       :category-number "13"
                                       :carb-max        3.0
                                       :ibu-max         35
                                       :ingredients     "Grists vary, but something producing a dark color is always involved. Chocolate or other dark-roasted malts, caramel malt, brewing sugars, and the like are common. London-type porters often use brown malt as a characteristic flavor."
                                       :examples        "Burton Bridge Burton Porter, Fuller's London Porter, Nethergate Old Growler Porter, RCH Old Slug Porter, Samuel Smith Taddy Porter"
                                       :notes           "A moderate-strength brown beer with a restrained roasty character and bitterness. May have a range of roasted flavors, generally without burnt qualities, and often has a chocolate-caramel-malty profile."
                                       :og-max          1.052
                                       :color-min       20.0
                                       :abv-max         0.054
                                       :color-max       30.0
                                       :profile         "Aroma: Moderate to moderately low bready, biscuity, and toasty malt aroma with mild roastiness, and may have a chocolate quality. May also show some non-roasted malt character in support (caramelly, nutty, toffee-like and/or sweet). May have up to a moderate level of floral or earthy hops. Fruity esters moderate to none. Diacetyl low to none. Appearance: Light brown to dark brown in color, often with ruby highlights when held up to light. Good clarity, although may approach being opaque. Moderate off-white to light tan head with good to fair retention. Flavor: Moderate bready, biscuity, and toasty malt flavor includes a mild to moderate roastiness (frequently with a chocolate character) and often a significant caramel, nutty, and/or toffee character. May have other secondary flavors such as coffee, licorice, biscuits or toast in support. Should not have a significant burnt or harsh roasted flavor, although small amounts may contribute a bitter chocolate complexity. Earthy or floral hop flavor moderate to none. Medium-low to medium hop bitterness will vary the balance from slightly malty to slightly bitter. Usually fairly well-attenuated, although can be somewhat sweet. Diacetyl moderately-low to none. Moderate to low fruity esters. Mouthfeel: Medium-light to medium body. Moderately-low to moderately-high carbonation. Light to moderate creamy texture."
                                       :ibu-min         18}))

(def brown-british-beer
  (merge dark-mild british-brown-ale english-porter))
