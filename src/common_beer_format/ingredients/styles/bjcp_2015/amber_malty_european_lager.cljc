(ns common-beer-format.styles.bjcp-2015.amber-malty-european-lager
  "2015 BJCP guidelines on Amber Malty European Lagers"
  (:require [common-beer-format.styles.bjcp-2015.styles :as styles]))

(def märzen
  (styles/build-style :märzen {:category        "Amber Malty European Lager"
                               :carb-min        1.5
                               :fg-max          1.014
                               :og-min          1.054
                               :name            "Märzen"
                               :type            "Lager"
                               :style-letter    "A"
                               :abv-min         0.058
                               :fg-min          1.01
                               :category-number "6"
                               :carb-max        3.0
                               :ibu-max         24
                               :ingredients     "Grist varies, although traditional German versions emphasized Munich malt. The notion of elegance is derived from the finest quality ingredients, particularly the base malts. A decoction mash was traditionally used to develop the rich malt profile."
                               :examples        "Buergerliches Ur-Saalfelder, Hacker-Pschorr Original Oktoberfest, Paulaner Oktoberfest, Weltenburg Kloster Anno 1050"
                               :notes           "An elegant, malty German amber lager with a clean, rich, toasty and bready malt flavor, restrained bitterness, and a dry finish that encourages another drink. The overall malt impression is soft, elegant, and complex, with a rich aftertaste that is never cloying or heavy."
                               :og-max          1.06
                               :color-min       8.0
                               :abv-max         0.063
                               :color-max       17.0
                               :profile         "Aroma: Moderate intensity aroma of German malt, typically rich, bready, somewhat toasty, with light bread crust notes. Clean lager fermentation character. No hop aroma. Caramel, dry-biscuity, or roasted malt aromas inappropriate. Very light alcohol might be detected, but should never be sharp. Clean, elegant malt richness should be the primary aroma. Appearance: Amber-orange to deep reddish-copper color; should not be golden. Bright clarity, with persistent, off-white foam stand. Flavor: Initial malt flavor often suggests sweetness, but finish is moderately-dry to dry. Distinctive and complex maltiness often includes a bready, toasty aspect. Hop bitterness is moderate, and the hop flavor is low to none (German types: complex, floral, herbal, or spicy). Hops provide sufficient balance that the malty palate and finish do not seem sweet. The aftertaste is malty, with the same elegant, rich malt flavors lingering. Noticeable caramel, biscuit, or roasted flavors are inappropriate. Clean lager fermentation profile. Mouthfeel: Medium body, with a smooth, creamy texture that often suggests a fuller mouthfeel. Medium carbonation. Fully attenuated, without a sweet or cloying impression. May be slightly warming, but the strength should be relatively hidden."
                               :ibu-min         18}))

(def rauchbier
  (styles/build-style :rauchbier {:category        "Amber Malty European Lager"
                                  :carb-min        1.5
                                  :fg-max          1.016
                                  :og-min          1.05
                                  :name            "Rauchbier"
                                  :type            "Lager"
                                  :style-letter    "B"
                                  :abv-min         0.048
                                  :fg-min          1.012
                                  :category-number "6"
                                  :carb-max        3.0
                                  :ibu-max         30
                                  :ingredients     "German Rauchmalz (beechwood-smoked Vienna-type malt) typically makes up 20-100% of the grain bill, with the remainder being German malts typically used in a Märzen. Some breweries adjust the color slightly with a bit of roasted malt. German lager yeast. German or Czech hops."
                                  :examples        "Eisenbahn Rauchbier, Kaiserdom Rauchbier, Schlenkerla Rauchbier Märzen, Spezial Rauchbier Märzen Victory Scarlet Fire Rauchbier"
                                  :notes           "An elegant, malty German amber lager with a balanced, complementary beechwood smoke character. Toasty-rich malt in aroma and flavor, restrained bitterness, low to high smoke flavor, clean fermentation profile, and an attenuated finish are characteristic."
                                  :og-max          1.057
                                  :color-min       12.0
                                  :abv-max         0.06
                                  :color-max       22.0
                                  :profile         "Aroma: Blend of smoke and malt, with a varying balance and intensity. The beechwood smoke character can range from subtle to fairly strong, and can seem smoky, woody, or bacon-like. The malt character can be low to moderate, and be somewhat rich, toasty, or malty-sweet. The malt and smoke components are often inversely proportional (i.e., when smoke increases, malt decreases, and vice versa). Hop aroma may be very low to none. Clean lager fermentation character. Appearance: This should be a very clear beer, with a large, creamy, rich, tan- to cream-colored head. Medium amber/light copper to dark brown color. Flavor: Generally follows the aroma profile, with a blend of smoke and malt in varying balance and intensity, yet always complementary. Märzen-like qualities should be noticeable, particularly a malty, toasty richness, but the beechwood smoke flavor can be low to high. At higher levels, the smoke can take on a ham- or bacon-like character, which is acceptable as long as it doesn't veer into the greasy range. The palate can be somewhat malty, rich, and sweet, yet the finish tends to be medium-dry to dry with the smoke character sometimes enhancing the dryness of the finish. The aftertaste can reflect both malt richness and smoke flavors, with a balanced presentation desirable. Moderate, balanced, hop bitterness. Moderate to none hop flavor with spicy, floral, or herbal notes. Clean lager fermentation character. Harsh, bitter, burnt, charred, rubbery, sulfury or phenolic smoky characteristics are inappropriate. Mouthfeel: Medium body. Medium to medium-high carbonation. Smooth lager character. Significant astringent, phenolic harshness is inappropriate."
                                  :ibu-min         20}))

(def dunkles-bock
  (styles/build-style :dunkles-bock {:category        "Amber Malty European Lager"
                                     :carb-min        1.5
                                     :fg-max          1.019
                                     :og-min          1.064
                                     :name            "Dunkles Bock"
                                     :type            "Lager"
                                     :style-letter    "C"
                                     :abv-min         0.063
                                     :fg-min          1.013
                                     :category-number "6"
                                     :carb-max        3.0
                                     :ibu-max         27
                                     :ingredients     "Munich and Vienna malts, rarely a tiny bit of dark roasted malts for color adjustment, never any non-malt adjuncts. Continental European hop varieties are used. Clean German lager yeast."
                                     :examples        "Aass Bock, Einbecker Ur-Bock Dunkel, Great Lakes Rockefeller Bock, Kneitinger Bock, New Glarus Uff-da Bock, Penn Brewery St. Nikolaus Bock"
                                     :notes           "A dark, strong, malty German lager beer that emphasizes the malty-rich and somewhat toasty qualities of continental malts without being sweet in the finish."
                                     :og-max          1.072
                                     :color-min       14.0
                                     :abv-max         0.072
                                     :color-max       22.0
                                     :profile         "Aroma: Medium to medium-high bready-malty-rich aroma, often with moderate amounts of rich Maillard products and/or toasty overtones. Virtually no hop aroma. Some alcohol may be noticeable. Clean lager character, although the malts can provide a slight (low to none) dark fruit character, particularly in aged examples. Appearance: Light copper to brown color, often with attractive garnet highlights. Lagering should provide good clarity despite the dark color. Large, creamy, persistent, off-white head. Flavor: Complex, rich maltiness is dominated by the toasty-rich Maillard products. Some caramel notes may be present. Hop bitterness is generally only high enough to support the malt flavors, allowing a bit of sweetness to linger into the finish. Well-attenuated, not cloying. Clean fermentation profile, although the malt can provide a slight dark fruit character. No hop flavor. No roasted or burnt character. Mouthfeel: Medium to medium-full bodied. Moderate to moderately low carbonation. Some alcohol warmth may be found, but should never be hot. Smooth, without harshness or astringency."
                                     :ibu-min         20}))

(def ^:const amber-malty-european-lager
  (merge märzen rauchbier dunkles-bock))
