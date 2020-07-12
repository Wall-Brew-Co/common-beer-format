(ns common-beer-format.styles.bjcp-2015.scottish-ale
  "2015 BJCP guidelines on Scottish Ales"
  (:require [common-beer-format.styles.bjcp-2015.styles :as styles]))

(def scottish-light
  (styles/build-style :scottish-light {:category        "Scottish Ale"
                                       :carb-min        1.5
                                       :fg-max          1.013
                                       :og-min          1.03
                                       :name            "Scottish Light"
                                       :type            "Ale"
                                       :style-letter    "A"
                                       :abv-min         0.025
                                       :fg-min          1.01
                                       :category-number "14"
                                       :carb-max        3.0
                                       :ibu-max         20
                                       :ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the ‘roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                                       :examples        "McEwan's 60"
                                       :notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character. Traditionally the darkest of the Scottish ales, sometimes nearly black but lacking any burnt, overtly roasted character."
                                       :og-max          1.035
                                       :color-min       17.0
                                       :abv-max         0.032
                                       :color-max       22.0
                                       :profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                                       :ibu-min         10}))

(def scottish-heavy
  (styles/build-style :scottish-heavy {:category        "Scottish Ale"
                                       :carb-min        1.5
                                       :fg-max          1.015
                                       :og-min          1.035
                                       :name            "Scottish Heavy"
                                       :type            "Ale"
                                       :style-letter    "B"
                                       :abv-min         0.032
                                       :fg-min          1.01
                                       :category-number "14"
                                       :carb-max        3.0
                                       :ibu-max         20
                                       :ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the ‘roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                                       :examples        "Broughton Greenmantle Ale, Caledonia Smooth, McEwan's 70, Orkney Raven Ale, Tennent's Special Ale"
                                       :notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
                                       :og-max          1.04
                                       :color-min       13.0
                                       :abv-max         0.039
                                       :color-max       22.0
                                       :profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                                       :ibu-min         10}))

(def scottish-export 
  (styles/build-style :scottish-export {:category        "Scottish Ale"
                                        :carb-min        1.5
                                        :fg-max          1.016
                                        :og-min          1.04
                                        :name            "Scottish Export"
                                        :type            "Ale"
                                        :style-letter    "C"
                                        :abv-min         0.039
                                        :fg-min          1.01
                                        :category-number "14"
                                        :carb-max        3.0
                                        :ibu-max         30
                                        :ingredients     "Originally used Scottish pale malt, grits or flaked maize, and brewers caramel for color. Later adapted to use additional ingredients, such as amber and brown malts, crystal and wheat malts, and roasted grains or dark sugars for color but not for the ‘roasty' flavor. Sugar adjuncts are traditional. Clean or slightly fruity yeast. Peat-smoked malt is inauthentic and inappropriate."
                                        :examples        "Belhaven Scottish Ale, Broughton Exciseman's Ale, Orkney Dark Island, Pelican MacPelican's Scottish Style Ale, Weasel Boy Plaid Ferret Scottish Ale"
                                        :notes           "A malt-focused, generally caramelly beer with perhaps a few esters and occasionally a butterscotch aftertaste. Hops only to balance and support the malt. The malt character can range from dry and grainy to rich, toasty, and caramelly, but is never roasty and especially never has a peat smoke character."
                                        :og-max          1.06
                                        :color-min       13.0
                                        :abv-max         0.06
                                        :color-max       22.0
                                        :profile         "Aroma: Low to medium maltiness, often with flavors of toasted breadcrumbs, lady fingers, and English biscuits. Low to medium caramel and low butterscotch is allowable. Light pome fruitiness in best examples. May have low traditional English hop aroma (earthy, floral, orange-citrus, spicy, etc.). Peat smoke is inappropriate. Appearance: Pale copper to very dark brown. Clear. Low to moderate, creamy off-white. Flavor: Entirely malt-focused, with flavors ranging from pale, bready malt with caramel overtones to rich-toasty malt with roasted accents (but never roasty) or a combination thereof. Fruity esters are not required but add depth yet are never high. Hop bitterness to balance the malt. No to low hop flavor is also allowed and should of traditional English character (earthy, floral, orange-citrus, spicy, etc.). Finish ranges from rich and malty to dry and grainy. A subtle butterscotch character is acceptable; however, burnt sugars are not. The malt-hop balance tilts toward malt. Peat smoke is inappropriate. Mouthfeel: Medium-low to medium body. Low to moderate carbonation. Can be relatively rich and creamy to dry and grainy."
                                        :ibu-min         15}))

(def ^:const scottish-ale
  (merge scottish-light scottish-heavy scottish-export))
