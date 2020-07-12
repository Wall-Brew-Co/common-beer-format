(ns common-beer-format.data.styles.bjcp-2015.pale-malty-european-lager
  "2015 BJCP guidelines on Pale Malty European Lagers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def munich-helles
  (styles/build-style :munich-helles {:category        "Pale Malty European Lager"
                                      :carb-min        1.5
                                      :fg-max          1.012
                                      :og-min          1.044
                                      :name            "Munich Helles"
                                      :type            "Lager"
                                      :style-letter    "A"
                                      :abv-min         0.047
                                      :fg-min          1.006
                                      :category-number "4"
                                      :carb-max        3.0
                                      :ibu-max         22
                                      :ingredients     "Continental Pilsner malt, traditional German Saazer-type hop varieties, clean German lager yeast."
                                      :examples        "Augustiner Lagerbier Hell, Bürgerbräu Wolznacher Hell Naturtrüb, Hacker-Pschorr Münchner Gold, Löwenbraü Original, Paulaner Premium Lager, Spaten Premium Lager, Weihenstephaner Original"
                                      :notes           "A clean, malty, gold-colored German lager with a smooth grainy-sweet malty flavor and a soft, dry finish. Subtle spicy, floral, or herbal hops and restrained bitterness help keep the balance malty but not sweet, which helps make this beer a refreshing, everyday drink."
                                      :og-max          1.048
                                      :color-min       3.0
                                      :abv-max         0.054
                                      :color-max       5.0
                                      :profile         "Aroma: Moderate grainy-sweet malt aroma. Low to moderately-low spicy, floral, or herbal hop aroma. While a clean aroma is most desirable, a very low background note of DMS is not a fault. Pleasant, clean fermentation profile, with malt dominating the balance. The freshest examples will have more of a malty-sweet aroma. Appearance: Medium yellow to pale gold. Clear. Persistent creamy white head. Flavor: Moderately malty start with the suggestion of sweetness, moderate grainy-sweet malt flavor with a soft, rounded palate impression, supported by a low to medium-low hop bitterness. The finish is soft and dry, not crisp and biting. Low to moderately-low spicy, floral or herbal hop flavor. The malt dominates the hops in the palate, finish, and aftertaste, but the hops should be noticeable. There should not be any residual sweetness, simply the impression of maltiness with restrained bitterness. Very fresh examples will seem sweeter due to the fresh, rich malt character that can fade with time. Clean fermentation profile. Mouthfeel: Medium body. Medium carbonation. Smooth, well-lagered character."
                                      :ibu-min         16}))

(def festbier
  (styles/build-style :festbier {:category        "Pale Malty European Lager"
                                 :carb-min        1.5
                                 :fg-max          1.012
                                 :og-min          1.054
                                 :name            "Festbier"
                                 :type            "Lager"
                                 :style-letter    "B"
                                 :abv-min         0.058
                                 :fg-min          1.01
                                 :category-number "4"
                                 :carb-max        3.0
                                 :ibu-max         25
                                 :ingredients     "Majority Pils malt, but with some Vienna and/or Munich malt to increase maltiness. Differences in commercial examples are mostly due to different maltsters and yeast, not major grist differences."
                                 :examples        "Augustiner Oktoberfest, Hacker-Pschorr Superior Festbier, Hofbräu Festbier, Löwenbräu Oktoberfestbier, Paulaner Wiesn, Schönramer Gold, Weihenstephaner Festbier"
                                 :notes           "A smooth, clean, pale German lager with a moderately strong malty flavor and a light hop character. Deftly balances strength and drinkability, with a palate impression and finish that encourages drinking. Showcases elegant German malt flavors without becoming too heavy or filling."
                                 :og-max          1.057
                                 :color-min       4.0
                                 :abv-max         0.063
                                 :color-max       7.0
                                 :profile         "Aroma: Moderate malty richness, with an emphasis on toasty-doughy aromatics and an impression of sweetness. Low to medium-low floral, herbal, or spicy hops. The malt should not have a deeply toasted, caramel, or biscuity quality. Clean lager fermentation character. Appearance: Deep yellow to deep gold color; should not have amber hues. Bright clarity. Persistent white to off-white foam stand. Most commercial examples are medium gold in color. Flavor: Medium to medium-high malty flavor initially, with a lightly toasty, bread dough quality and an impression of soft sweetness. Medium to medium-low bitterness, definitely malty in the balance. Well-attenuated and crisp, but not dry. Medium-low to medium floral, herbal, or spicy hop flavor. Clean lager fermentation character. The taste is mostly of Pils malt, but with slightly toasty hints. The bitterness is supportive, but still should yield a malty, flavorful finish. Mouthfeel: Medium body, with a smooth, somewhat creamy texture. Medium carbonation. Alcohol strength barely noticeable as warming, if at all."
                                 :ibu-min         18}))

(def helles-bock
  (styles/build-style :helles-bock {:category        "Pale Malty European Lager"
                                    :carb-min        1.5
                                    :fg-max          1.018
                                    :og-min          1.064
                                    :name            "Helles Bock"
                                    :type            "Lager"
                                    :style-letter    "C"
                                    :abv-min         0.063
                                    :fg-min          1.011
                                    :category-number "4"
                                    :carb-max        3.0
                                    :ibu-max         35
                                    :ingredients     "Base of Pils and/or Vienna malt with some Munich malt to add character (although much less than in a traditional bock). No non-malt adjuncts. Saazer-type hops. Clean lager yeast. Decoction mash is typical, but boiling is less than in Dunkles Bock to restrain color development."
                                    :examples        "Altenmünster Maibock, Ayinger Maibock, Capital Maibock, Blind Tiger Maibock, Einbecker Mai-Urbock, Hacker-Pschorr Hubertus Bock, Mahr's Bock"
                                    :notes           "A relatively pale, strong, malty German lager beer with a nicely attenuated finish that enhances drinkability. The hop character is generally more apparent than in other bocks."
                                    :og-max          1.072
                                    :color-min       6.0
                                    :abv-max         0.074
                                    :color-max       11.0
                                    :profile         "Aroma: Moderate to strong grainy-sweet malt aroma, often with a lightly toasted quality and low Maillard products. Moderately-low to no hop aroma, often with a spicy, herbal, or floral quality. Clean fermentation profile. Fruity esters should be low to none. Very light alcohol may be noticeable. May have a light DMS aroma. Appearance: Deep gold to light amber in color. Bright to clear clarity. Large, creamy, persistent, white head. Flavor: Moderately to moderately strong grainy-sweet malt flavor dominates with some toasty notes and/or Maillard products providing added interest. Little to no caramel flavors. May have a light DMS flavor. Moderate to no hop flavor (spicy, herbal, floral, peppery). Moderate hop bitterness (more so in the balance than in other bocks). Clean fermentation profile. Well-attenuated, not cloying, with a moderately-dry finish that may taste of both malt and hops. Mouthfeel: Medium-bodied. Moderate to moderately-high carbonation. Smooth and clean with no harshness or astringency, despite the increased hop bitterness. A light alcohol warming may be present."
                                    :ibu-min         23}))

(def ^:const pale-malty-european-lager
  (merge munich-helles festbier helles-bock))
