(ns common-beer-format.data.styles.bjcp-2015.wood-beer
  "2015 BJCP guidelines on Wood Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))


(def wood-aged-beer
  (styles/build-style :wood-aged-beer {:category        "Wood Beer"
                                       :carb-min        1.5
                                       :fg-max          1.02
                                       :og-min          1.076
                                       :name            "Wood-Aged Beer"
                                       :type            "Mixed"
                                       :style-letter    "A"
                                       :abv-min         0.07
                                       :fg-min          1.016
                                       :category-number "33"
                                       :carb-max        3.0
                                       :ibu-max         15
                                       :ingredients     "Varies with base style. Aged in wooden casks or barrels, or using wood-based additives (wood chips, wood staves, oak essence). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                                       :examples        "Bush Prestige, Cigar City Humidor India Pale Ale, Faust Holzfassgereifter Eisbock, Firestone Walker Double Barrel Ale, Great Divide Oak Aged Yeti Imperial Stout, Petrus Aged Pale, Samuel Smith Yorkshire Stingo"
                                       :notes           "A harmonious blend of the base beer style with characteristics from aging in contact with wood. The best examples will be smooth, flavorful, well-balanced and well-aged."
                                       :og-max          1.12
                                       :color-min       4.0
                                       :abv-max         0.11
                                       :color-max       22.0
                                       :profile         "Aroma: Varies with base style. A low to moderate wood- or oak-based aroma is usually present. Fresh wood can occasionally impart raw \"green\" aromatics, although this character should never be too strong. Other optional aromatics include a low to moderate vanilla, caramel, toffee, toast, or cocoa character from any char on the wood. Any alcohol character should be smooth and balanced, not hot. Some background oxidation character is optional, and can take on a pleasant, sherry-like character and not be papery or cardboard-like. Should not have added alcohol character. Appearance: Varies with base style. Often darker than the unadulterated base beer style, particularly if toasted/charred barrels are used. Flavor: Varies with base style. Wood usually contributes a woody or oaky flavor, which can occasionally take on a raw \"green\" flavor if new wood is used. Other flavors that may optionally be present include vanilla (from vanillin in the wood); caramel, butterscotch, toasted bread or almonds (from toasted wood); and coffee, chocolate, cocoa (from charred wood). The wood and/or other cask-derived flavors should be balanced, supportive and noticeable, but should not overpower the base beer style. Some background oxidation character is optional, although this should take on a pleasant, sherry-like character and not be papery or cardboard-like. Mouthfeel: Varies with base style. Wood can add tannins to the beer, depending on age of the cask. The tannins can lead to additional astringency (which should never be high), or simply a fuller mouthfeel. Tart or acidic characteristics should be low to none, and never distracting."
                                       :ibu-min         7}))


(def specialty-wood-aged-beer
  (styles/build-style :specialty-wood-aged-beer {:category        "Wood Beer"
                                                 :carb-min        1.5
                                                 :fg-max          1.02
                                                 :og-min          1.076
                                                 :name            "Specialty Wood-Aged Beer"
                                                 :type            "Mixed"
                                                 :style-letter    "B"
                                                 :abv-min         0.07
                                                 :fg-min          1.016
                                                 :category-number "33"
                                                 :carb-max        3.0
                                                 :ibu-max         15
                                                 :ingredients     "Varies with base style. Aged in wooden casks or barrels previously used to store alcohol (e.g., whiskey, bourbon, port, sherry, Madeira, wine, etc). Fuller-bodied, higher-gravity base styles often are used since they can best stand up to the additional flavors, although experimentation is encouraged."
                                                 :examples        "Founders Kentucky Breakfast Stout, Goose Island Bourbon County Stout, J.W. Lees Harvest Ale in Port, Sherry, Lagavulin Whisky or Calvados Casks, The Lost Abbey Angel's Share Ale; many microbreweries have specialty beers served only on premises often directly from the cask."
                                                 :notes           "A harmonious blend of the base beer style with characteristics from aging in contact with wood (including alcoholic products previously in contact with the wood). The best examples will be smooth, flavorful, well-balanced and well-aged."
                                                 :og-max          1.12
                                                 :color-min       4.0
                                                 :abv-max         0.11
                                                 :color-max       22.0
                                                 :profile         "Aroma: Varies with base style. A low to moderate wood- or oak-based aroma is usually present. Other aromatics often include a low to moderate vanilla, caramel, toffee, toast, or cocoa character, as well as any aromatics associated with alcohol (distilled spirits, wine, etc.) previously stored in the wood. The added alcohol character should be smooth and balanced, not hot. Some background oxidation character is optional, and can take on a pleasant, sherry-like character and not be papery or cardboard-like. Appearance: Varies with base style. Often darker than the unadulterated base beer style, particularly if whiskey/bourbon barrels are used. Beers aged in wine barrels or other products with distinctive colors may also impart a color to the finished beer. Flavor: Varies with base style. Wood usually contributes a woody or oaky flavor. Other flavors that are typically present include vanilla (from vanillin in the wood); caramel, butterscotch, toasted bread or almonds (from toasted wood); coffee, chocolate, cocoa (from charred wood or bourbon casks); and alcohol flavors from other products previously stored in the wood. The wood and/or other cask-derived flavors should be balanced, supportive and noticeable, but should not overpower the base beer style. Some background oxidation character is optional, although this should take on a pleasant, sherry-like character and not be papery or cardboard-like. Mouthfeel: Varies with base style. Wood can add tannins to the beer, depending on age of the cask. The tannins can lead to additional astringency (which should never be high), or simply a fuller mouthfeel. Usually exhibits additional alcohol warming. Higher alcohol levels should not result in \"hot\" beers; aged, smooth flavors are most desirable. Tart or acidic characteristics should be low to none."
                                                 :ibu-min         7}))


(def wood-beer
  (merge wood-aged-beer specialty-wood-aged-beer))
