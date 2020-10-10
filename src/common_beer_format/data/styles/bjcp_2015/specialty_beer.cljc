(ns common-beer-format.data.styles.bjcp-2015.specialty-beer
  "2015 BJCP guidelines on Specialty Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def clone-beer 
  (styles/build-style :clone-beer {:category        "Specialty Beer"
                                   :carb-min        1.5
                                   :fg-max          1.02
                                   :og-min          1.076
                                   :name            "Clone Beer"
                                   :type            "Mixed"
                                   :style-letter    "A"
                                   :abv-min         0.07
                                   :fg-min          1.016
                                   :category-number "34"
                                   :carb-max        3.0
                                   :ibu-max         15
                                   :ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                                   :examples        "Founders Kentucky Breakfast Stout, Goose Island Bourbon County Stout, J.W. Lees Harvest Ale in Port, Sherry, Lagavulin Whisky or Calvados Casks, The Lost Abbey Angel's Share Ale; many microbreweries have specialty beers served only on premises often directly from the cask."
                                   :notes           "Based on declared clone beer."
                                   :og-max          1.12
                                   :color-min       4.0
                                   :abv-max         0.11
                                   :color-max       22.0
                                   :profile         "Aroma: Based on declared clone beer. Appearance: Based on declared clone beer. Flavor: Based on declared clone beer. Mouthfeel: Based on declared clone beer."
                                   :ibu-min         7}))

(def mixed-style-beer 
  (styles/build-style :mixed-style-beer {:category        "Specialty Beer"
                                         :carb-min        1.5
                                         :fg-max          1.02
                                         :og-min          1.076
                                         :name            "Mixed-Style Beer"
                                         :type            "Mixed"
                                         :style-letter    "B"
                                         :abv-min         0.07
                                         :fg-min          1.016
                                         :category-number "34"
                                         :carb-max        3.0
                                         :ibu-max         15
                                         :ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                                         :examples        "Founders Kentucky Breakfast Stout, Goose Island Bourbon County Stout, J.W. Lees Harvest Ale in Port, Sherry, Lagavulin Whisky or Calvados Casks, The Lost Abbey Angel's Share Ale; many microbreweries have specialty beers served only on premises often directly from the cask."
                                         :notes           "Based on the declared base styles. As with all Specialty-Type Beers, the resulting combination of beer styles needs to be harmonious and balanced, and be pleasant to drink."
                                         :og-max          1.12
                                         :color-min       4.0
                                         :abv-max         0.11
                                         :color-max       22.0
                                         :profile         "Aroma: Based on the declared base styles. Appearance: Based on the declared base styles. Flavor: Based on the declared base styles. Mouthfeel: Based on the declared base styles."
                                         :ibu-min         7}))

(def experimental-beer 
  (styles/build-style :experimental-beer {:category        "Specialty Beer"
                                          :carb-min        1.5
                                          :fg-max          1.02
                                          :og-min          1.076
                                          :name            "Experimental Beer"
                                          :type            "Mixed"
                                          :style-letter    "C"
                                          :abv-min         0.07
                                          :fg-min          1.016
                                          :category-number "34"
                                          :carb-max        3.0
                                          :ibu-max         15
                                          :ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                                          :examples        "None"
                                          :notes           "Varies, but should be a unique experience."
                                          :og-max          1.12
                                          :color-min       4.0
                                          :abv-max         0.11
                                          :color-max       22.0
                                          :profile         "Aroma: Varies. Appearance: Varies. Flavor: Varies. Mouthfeel: Varies."
                                          :ibu-min         7}))

(def specialty-beer
  (merge clone-beer mixed-style-beer experimental-beer))
