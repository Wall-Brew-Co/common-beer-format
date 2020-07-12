(ns common-beer-format.styles.bjcp-2015.american-porter-and-stout
  "2015 BJCP guidelines on American Porters and Stouts"
  (:require [common-beer-format.styles.bjcp-2015.styles :as styles]))

(def american-porter 
  (styles/build-style :american-porter {:category        "American Porter And Stout"
                                        :carb-min        1.5
                                        :fg-max          1.018
                                        :og-min          1.05
                                        :name            "American Porter"
                                        :type            "Ale"
                                        :style-letter    "A"
                                        :abv-min         0.048
                                        :fg-min          1.012
                                        :category-number "20"
                                        :carb-max        3.0
                                        :ibu-max         50
                                        :ingredients     "May contain several malts, prominently dark malts, which often include black malt (chocolate malt is also often used). American hops typically used for bittering, but US or UK finishing hops can be used; a clashing citrus quality is generally undesirable. Ale yeast can either be clean US versions or characterful English varieties."
                                        :examples        "Anchor Porter, Boulevard Bully! Porter, Deschutes Black Butte Porter, Founders Porter, Great Lakes Edmund Fitzgerald Porter, Smuttynose Robust Porter, Sierra Nevada Porter"
                                        :notes           "A substantial, malty dark beer with a complex and flavorful dark malt character."
                                        :og-max          1.07
                                        :color-min       22.0
                                        :abv-max         0.065
                                        :color-max       40.0
                                        :profile         "Aroma: Medium-light to medium-strong dark malt aroma, often with a lightly burnt character. Optionally may also show some additional malt character in support (grainy, bready, toffee-like, caramelly, chocolate, coffee, rich, and/or sweet). Hop aroma low to high, often with a resiny, earthy, or floral character. May be dry-hopped. Fruity esters are moderate to none. Appearance: Medium brown to very dark brown, often with ruby- or garnet-like highlights. Can approach black in color. Clarity may be difficult to discern in such a dark beer, but when not opaque will be clear (particularly when held up to the light). Full, tan-colored head with moderately good head retention. Flavor: Moderately strong malt flavor usually features a lightly burnt malt character (and sometimes chocolate and/or coffee flavors) with a bit of grainy, dark malt dryness in the finish. Overall flavor may finish from dry to medium-sweet. May have a sharp character from dark roasted grains, but should not be overly acrid, burnt or harsh. Medium to high bitterness, which can be accentuated by the dark malt. Hop flavor can vary from low to high with a resiny, earthy, or floral character, and balances the dark malt flavors. The dark malt and hops should not clash. Dry-hopped versions may have a resiny flavor. Fruity esters moderate to none. Mouthfeel: Medium to medium-full body. Moderately low to moderately high carbonation. Stronger versions may have a slight alcohol warmth. May have a slight astringency from dark malts, although this character should not be strong."
                                        :ibu-min         25}))

(def american-stout (styles/build-style :american-stout {:category        "American Porter And Stout"
                                                         :carb-min        1.5
                                                         :fg-max          1.022
                                                         :og-min          1.05
                                                         :name            "American Stout"
                                                         :type            "Ale"
                                                         :style-letter    "B"
                                                         :abv-min         0.05
                                                         :fg-min          1.01
                                                         :category-number "20"
                                                         :carb-max        3.0
                                                         :ibu-max         75
                                                         :ingredients     "Common American base malts and yeast. Varied use of dark and roasted malts, as well as caramel-type malts. Adjuncts such as oatmeal may be present in low quantities. American hop varieties."
                                                         :examples        "Avery Out of Bounds Stout, Deschutes Obsidian Stout, North Coast Old No. 38, Rogue Shakespeare Stout, Sierra Nevada Stout"
                                                         :notes           "A fairly strong, highly roasted, bitter, hoppy dark stout. Has the body and dark flavors typical of stouts with a more aggressive American hop character and bitterness."
                                                         :og-max          1.075
                                                         :color-min       30.0
                                                         :abv-max         0.07
                                                         :color-max       40.0
                                                         :profile         "Aroma: Moderate to strong aroma of roasted malts, often having a roasted coffee or dark chocolate quality. Burnt or charcoal aromas are acceptable at low levels. Medium to very low hop aroma, often with a citrusy or resiny character. Medium to no esters. Light alcohol-derived aromatics are also optional. Appearance: Generally a jet black color, although some may appear very dark brown. Large, persistent head of light tan to light brown in color. Usually opaque. Flavor: Moderate to very high roasted malt flavors, often tasting of coffee, roasted coffee beans, dark or bittersweet chocolate. May have the flavor of slightly burnt coffee grounds, but this character should not be prominent. Low to medium malt sweetness, often with rich chocolate or caramel flavors. Medium to high bitterness. Low to high hop flavor, generally citrusy or resiny. Low to no esters. Medium to dry finish, occasionally with a lightly burnt quality. Alcohol flavors can be present up to medium levels, but smooth. Mouthfeel: Medium to full body. Can be somewhat creamy, particularly if a small amount of oats have been used to enhance mouthfeel. Can have a bit of roast-derived astringency, but this character should not be excessive. Medium-high to high carbonation. Light to moderately strong alcohol warmth, but smooth and not excessively hot."
                                                         :ibu-min         35}))

(def imperial-stout 
  (styles/build-style :imperial-stout {:category        "American Porter And Stout"
                                       :carb-min        1.5
                                       :fg-max          1.03
                                       :og-min          1.075
                                       :name            "Imperial Stout"
                                       :type            "Ale"
                                       :style-letter    "C"
                                       :abv-min         0.08
                                       :fg-min          1.018
                                       :category-number "20"
                                       :carb-max        3.0
                                       :ibu-max         90
                                       :ingredients     "Well-modified pale malt, with generous quantities of roasted malts and/or grain. May have a complex grain bill using virtually any variety of malt. Any type of hops may be used. American or English ale yeast."
                                       :examples        "American –Bell's Expedition Stout, Cigar City Marshal Zhukov's Imperial Stout, Great Divide Yeti Imperial Stout, North Coast Old Rasputin Imperial Stout, Sierra Nevada Narwhal Imperial Stout; English – Courage Imperial Russian Stout, Le Coq Imperial Extra Double Stout, Samuel Smith Imperial Stout"
                                       :notes           "An intensely-flavored, big, dark ale with a wide range of flavor balances and regional interpretations. Roasty-burnt malt with deep dark or dried fruit flavors, and a warming, bittersweet finish. Despite the intense flavors, the components need to meld together to create a complex, harmonious beer, not a hot mess."
                                       :og-max          1.115
                                       :color-min       30.0
                                       :abv-max         0.12
                                       :color-max       40.0
                                       :profile         "Aroma: Rich and complex, with variable amounts of roasted grains, maltiness, fruity esters, hops, and alcohol. The roasted malt character can take on coffee, dark chocolate, or slightly burnt tones and can be light to moderately strong. The malt aroma can be subtle to rich and barleywine-like. May optionally show a slight specialty malt character (e.g., caramel), but this should only add complexity and not dominate. Fruity esters may be low to moderately strong, and may take on a complex, dark fruit (e.g., plums, prunes, raisins) character. Hop aroma can be very low to quite aggressive, and may contain any hop variety. An alcohol character may be present, but shouldn't be sharp, hot, or solventy. Aged versions may have a slight vinous or port-like quality, but shouldn't be sour. The balance can vary with any of the aroma elements taking center stage. Not all possible aromas described need be present; many interpretations are possible. Aging affects the intensity, balance and smoothness of aromatics. Appearance: Color may range from very dark reddish-brown to jet black. Opaque. Deep tan to dark brown head. Generally has a well-formed head, although head retention may be low to moderate. High alcohol and viscosity may be visible in \"legs\" when beer is swirled in a glass. Flavor: Rich, deep, complex and frequently quite intense, with variable amounts of roasted malt/grains, maltiness, fruity esters, hop bitterness and flavor, and alcohol. Medium to aggressively high bitterness. Medium-low to high hop flavor (any variety). Moderate to aggressively high roasted malt/grain flavors can suggest bittersweet or unsweetened chocolate, cocoa, and/or strong coffee. A slightly burnt grain, burnt currant or tarry character may be evident. Fruity esters may be low to intense, and can take on a dark fruit character (raisins, plums, or prunes). Malt backbone can be balanced and supportive to rich and barleywine-like, and may optionally show some supporting caramel, bready or toasty flavors. The palate and finish can vary from relatively dry to moderately sweet, usually with some lingering roastiness, hop bitterness and warming character. The balance and intensity of flavors can be affected by aging, with some flavors becoming more subdued over time and some aged, vinous or port-like qualities developing. Mouthfeel: Full to very full-bodied and chewy, with a velvety, luscious texture (although the body may decline with long conditioning). Gentle smooth warmth from alcohol should be present and noticeable, but not a primary characteristic; in well-conditioned versions, the alcohol can be deceptive. Should not be syrupy or under-attenuated. Carbonation may be low to moderate, depending on age and conditioning."
                                       :ibu-min         50}))

(def ^:const american-porter-and-stout
  (merge american-porter american-stout imperial-stout))
