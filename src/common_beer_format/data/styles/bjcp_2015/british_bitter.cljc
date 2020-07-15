(ns common-beer-format.data.styles.bjcp-2015.british-bitter
  "2015 BJCP guidelines on British Bitter"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def ordinary-bitter
  (styles/build-style :ordinary-bitter {:category        "British Bitter"
                                        :carb-min        1.5
                                        :fg-max          1.011
                                        :og-min          1.03
                                        :name            "Ordinary Bitter"
                                        :type            "Ale"
                                        :style-letter    "A"
                                        :abv-min         0.032
                                        :fg-min          1.007
                                        :category-number "11"
                                        :carb-max        3.0
                                        :ibu-max         35
                                        :ingredients     "Pale ale, amber, and/or crystal malts. May use a touch of dark malt for color adjustment. May use sugar adjuncts, corn, or wheat. English finishing hops are most traditional, but any hops are fair game; if American hops are used, a light touch is required. Characterful British yeast."
                                        :examples        "Adnams Southwold Bitter, Brains Bitter, Fuller's Chiswick Bitter, Greene King IPA, Tetley's Original Bitter, Young's Bitter"
                                        :notes           "Low gravity, low alcohol levels, and low carbonation make this an easy-drinking session beer. The malt profile can vary in flavor and intensity, but should never override the overall bitter impression. Drinkability is a critical component of the style"
                                        :og-max          1.039
                                        :color-min       8.0
                                        :abv-max         0.038
                                        :color-max       14.0
                                        :profile         "Aroma: Low to moderate malt aroma, often (but not always) with a light caramel quality. Bready, biscuity, or lightly toasty malt complexity is common. Mild to moderate fruitiness. Hop aroma can range from moderate to none, typically with a floral, earthy, resiny, and/or fruity character. Generally no diacetyl, although very low levels are allowed. Appearance: Pale amber to light copper color. Good to brilliant clarity. Low to moderate white to off-white head. May have very little head due to low carbonation. Flavor: Medium to moderately high bitterness. Moderately low to moderately high fruity esters. Moderate to low hop flavor, typically with an earthy, resiny, fruity, and/or floral character. Low to medium maltiness with a dry finish. The malt profile is typically bready, biscuity, or lightly toasty. Low to moderate caramel or toffee flavors are optional. Balance is often decidedly bitter, although the bitterness should not completely overpower the malt flavor, esters and hop flavor. Generally no diacetyl, although very low levels are allowed. Mouthfeel: Light to medium-light body. Low carbonation, although bottled examples can have moderate carbonation."
                                        :ibu-min         25}))

(def best-bitter
  (styles/build-style :best-bitter {:category        "British Bitter"
                                    :carb-min        1.5
                                    :fg-max          1.012
                                    :og-min          1.04
                                    :name            "Best Bitter"
                                    :type            "Ale"
                                    :style-letter    "B"
                                    :abv-min         0.038
                                    :fg-min          1.008
                                    :category-number "11"
                                    :carb-max        3.0
                                    :ibu-max         40
                                    :ingredients     "Pale ale, amber, and/or crystal malts. May use a touch of dark malt for color adjustment. May use sugar adjuncts, corn or wheat. English finishing hops are most traditional, but any hops are fair game; if American hops are used, a light touch is required. Characterful British yeast."
                                    :examples        "Adnams SSB, Coniston Bluebird Bitter, Fuller's London Pride, Harvey's Sussex Best Bitter, Shepherd Neame Master Brew Kentish Ale, Timothy Taylor Landlord,Young's Special"
                                    :notes           "A flavorful, yet refreshing, session beer. Some examples can be more malt balanced, but this should not override the overall bitter impression. Drinkability is a critical component of the style."
                                    :og-max          1.048
                                    :color-min       8.0
                                    :abv-max         0.046
                                    :color-max       16.0
                                    :profile         "Aroma: Low to moderate malt aroma, often (but not always) with a low to medium-low caramel quality. Bready, biscuit, or lightly toasty malt complexity is common. Mild to moderate fruitiness. Hop aroma can range from moderate to none, typically with a floral, earthy, resiny, and/or fruity character. Generally no diacetyl, although very low levels are allowed. Appearance: Pale amber to medium copper color. Good to brilliant clarity. Low to moderate white to off-white head. May have very little head due to low carbonation. Flavor: Medium to moderately high bitterness. Moderately low to moderately high fruity esters. Moderate to low hop flavor, typically with an earthy, resiny, fruity, and/or floral character. Low to medium maltiness with a dry finish. The malt profile is typically bready, biscuity, or lightly toasty. Low to moderate caramel or toffee flavors are optional. Balance is often decidedly bitter, although the bitterness should not completely overpower the malt flavor, esters and hop flavor. Generally no diacetyl, although very low levels are allowed. Mouthfeel: Medium-light to medium body. Low carbonation, although bottled examples can have moderate carbonation."
                                    :ibu-min         25}))

(def strong-bitter
  (styles/build-style :strong-bitter {:category        "British Bitter"
                                      :carb-min        1.5
                                      :fg-max          1.016
                                      :og-min          1.048
                                      :name            "Strong Bitter"
                                      :type            "Ale"
                                      :style-letter    "C"
                                      :abv-min         0.046
                                      :fg-min          1.01
                                      :category-number "11"
                                      :carb-max        3.0
                                      :ibu-max         50
                                      :ingredients     "Pale ale, amber, and/or crystal malts, may use a touch of black malt for color adjustment. May use sugar adjuncts, corn or wheat. English finishing hops are most traditional, but any hops are fair game; if American hops are used, a light touch is required. Characterful British yeast. Burton versions use medium to high sulfate water, which can increase the perception of dryness and add a minerally or sulfury aroma and flavor."
                                      :examples        "Bass Ale, Highland Orkney Blast, Samuel Smith's Old Brewery Pale Ale, Shepherd Neame Bishop's Finger, Shepherd Neame Spitfire, West Berkshire Dr. Hexter's Healer, Whitbread Pale Ale, Young's Ram Rod"
                                      :notes           "An average-strength to moderately-strong British bitter ale. The balance may be fairly even between malt and hops to somewhat bitter. Drinkability is a critical component of the style. A rather broad style that allows for considerable interpretation by the brewer."
                                      :og-max          1.06
                                      :color-min       8.0
                                      :abv-max         0.062
                                      :color-max       18.0
                                      :profile         "Aroma: Hop aroma moderately-high to moderately-low, typically with a floral, earthy, resiny, and/or fruity character. Medium to medium-high malt aroma, optionally with a low to moderate caramel component. Medium-low to medium-high fruity esters. Generally no diacetyl, although very low levels are allowed. Appearance: Light amber to deep copper color. Good to brilliant clarity. Low to moderate white to off-white head. A low head is acceptable when carbonation is also low. Flavor: Medium to medium-high bitterness with supporting malt flavors evident. The malt profile is typically bready, biscuity, nutty, or lightly toasty, and optionally has a moderately low to moderate caramel or toffee flavor. Hop flavor moderate to moderately high, typically with a floral, earthy, resiny, and/or fruity character. Hop bitterness and flavor should be noticeable, but should not totally dominate malt flavors. Moderately-low to high fruity esters. Optionally may have low amounts of alcohol. Medium-dry to dry finish. Generally no diacetyl, although very low levels are allowed. Mouthfeel: Medium-light to medium-full body. Low to moderate carbonation, although bottled versions will be higher. Stronger versions may have a slight alcohol warmth but this character should not be too high."
                                      :ibu-min         30}))

(def ^:const british-bitter
  (merge ordinary-bitter best-bitter strong-bitter))
