(ns common-beer-format.data.styles.bjcp-2015.historic-beer
  "2015 BJCP guidelines on Historic Beer"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def gose
  (styles/build-style :gose {:category        "Historical Beer"
                             :carb-min        1.5
                             :fg-max          1.01
                             :og-min          1.036
                             :name            "Gose"
                             :type            "Ale"
                             :style-letter    "A"
                             :abv-min         0.042
                             :fg-min          1.006
                             :category-number "27"
                             :carb-max        3.0
                             :ibu-max         12
                             :ingredients     "Pilsner and wheat malt, restrained use of salt and coriander seed, lactobacillus. The coriander should have a fresh, citrusy (lemon or bitter orange), bright note, and not be vegetal, celery-like, or ham-like. The salt should have a sea salt or fresh salt character, not a metallic, iodine note."
                             :examples        "Anderson Valley Gose, Bayerisch Bahnhof Leipziger Gose, Döllnitzer Ritterguts Gose"
                             :notes           "A highly-carbonated, tart and fruity wheat ale with a restrained coriander and salt character and low bitterness. Very refreshing, with bright flavors and high attenuation."
                             :og-max          1.056
                             :color-min       3.0
                             :abv-max         0.048
                             :color-max       4.0
                             :profile         "Aroma: Light to moderately fruity aroma of pome fruit. Light sourness, slightly sharp. Noticeable coriander, which can have an aromatic lemony quality, and an intensity up to moderate. Light bready, doughy, yeasty character like uncooked sourdough bread. The acidity and coriander can give a bright, lively impression. The salt may be perceived as a very light, clean sea breeze character or just a general freshness, if noticeable at all. Appearance: Unfiltered, with a moderate to full haze. Moderate to tall sized white head with tight bubbles and good retention. Effervescent. Medium yellow color. Flavor: Moderate to restrained but noticeable sourness, like a squeeze of lemon in iced tea. Moderate bready/doughy malt flavor. Light to moderate fruity character of pome fruit, stone fruit, or lemons. Light to moderate salt character, up to the threshold of taste; the salt should be noticeable (particularly in the initial taste) but not taste overtly salty. Low bitterness, no hop flavor. Dry, fully-attenuated finish, with acidity not hops balancing the malt. Acidity can be more noticeable in the finish, and enhance the refreshing quality of the beer. The acidity should be balanced, not forward (although historical versions could be very sour). Mouthfeel: High to very high carbonation, effervescent. Medium-light to medium-full body. Salt may give a slightly tingly, mouthwatering quality, if perceived at all. The yeast and wheat can give it a little body, but it shouldn't have a heavy feel."
                             :ibu-min         5}))

(def kentucky-common
  (styles/build-style :kentucky-common {:category        "Historical Beer"
                                        :carb-min        1.5
                                        :fg-max          1.018
                                        :og-min          1.044
                                        :name            "Kentucky Common"
                                        :type            "Ale"
                                        :style-letter    "B"
                                        :abv-min         0.04
                                        :fg-min          1.01
                                        :category-number "27"
                                        :carb-max        3.0
                                        :ibu-max         30
                                        :ingredients     "Six-row barley malt was used with 35% corn grits to dilute the excessive protein levels along with 1 to 2% each caramel and black malt. Native American hops, usually about .2 pounds per barrel of Western hops for bittering and a similar amount of New York hops (such as Clusters) for flavor (15 minutes prior to knock out). Imported continental Saazer-type hops (.1 pounds per barrel) were added at knock out for aroma. Water in the Louisville area was typically moderate to high in carbonates. Mash water was often pre-boiled to precipitate the carbonate and Gypsum was commonly added. Considering the time from mash in to kegging for delivery was typically 6 to 8 days, clearly aggressive top-fermenting yeasts was used."
                                        :examples        "Apocalypse Brew Works Ortel's 1912"
                                        :notes           "A darker-colored, light-flavored, malt-accented beer with a dry finish and interesting character malt flavors. Refreshing due to its high carbonation and mild flavors, and highly sessionable due to being served very fresh and with restrained alcohol levels."
                                        :og-max          1.055
                                        :color-min       11.0
                                        :abv-max         0.055
                                        :color-max       20.0
                                        :profile         "Aroma: Low to medium grainy, corn-like or sweet maltiness with a low toast, biscuity-grainy, bready, or caramel malt accent. Medium to moderately-low hop aroma, usually floral or spicy in character. Clean fermentation character, with possible faint berry ester. Low levels of DMS are acceptable. No sourness. Malt-forward in the balance. Appearance: Amber-orange to light brown in color. Typically clear, but may have some light haze due to limited conditioning. Foam stand may not be long lasting, and is usually white to beige in color. Flavor: Moderate grainy-sweet maltiness with low to medium-low caramel, toffee, bready, and/or biscuity notes. Generally light palate flavors typical of adjunct beers; a low grainy, corn-like sweetness is common. Medium to low floral or spicy hop flavor. Medium to low hop bitterness, which should neither be coarse nor have a harsh aftertaste. May exhibit light fruitiness. Balance in the finish is towards the malt. May have a lightly flinty or minerally-sulfate flavor in the finish. The finish is fairly dry, including the contributions of roasted grains and minerals. No sourness. Mouthfeel: Medium to medium-light body with a relatively soft mouthfeel. Highly carbonated. Can have a creamy texture."
                                        :ibu-min         15}))

(def lichtenhainer
  (styles/build-style :lichtenhainer {:category        "Historical Beer"
                                      :carb-min        1.5
                                      :fg-max          1.008
                                      :og-min          1.032
                                      :name            "Lichtenhainer"
                                      :type            "Ale"
                                      :style-letter    "C"
                                      :abv-min         0.035
                                      :fg-min          1.004
                                      :category-number "27"
                                      :carb-max        3.0
                                      :ibu-max         12
                                      :ingredients     "Smoked barley malt, wheat malt, lactobacillus, top-fermenting yeast. Grists vary, but the wheat would typically be 30-50%."
                                      :examples        "Apocalypse Brew Works Ortel's 1912"
                                      :notes           "A sour, smoked, lower-gravity historical German wheat beer. Complex yet refreshing character due to high attenuation and carbonation, along with low bitterness and moderate sourness."
                                      :og-max          1.04
                                      :color-min       3.0
                                      :abv-max         0.047
                                      :color-max       6.0
                                      :profile         "Aroma: Moderately strong fresh smoky aroma, light hints of sourness, medium-low fruity esters, possibly apples or lemons, moderate bready-grainy malt. The smoke character is stronger than the bready notes, and the smoke has a ‘dry' character, like the remnants of an old fire, not a ‘greasy' smoke. Appearance: Tall off-white head, rocky and persistent. Deep yellow to light gold color. Fair clarity, may be somewhat hazy. Flavor: Moderately strong fruity flavor, possibly lemons or apples. Moderate intensity, clean lactic tartness (no funk). Similar smoky character as aroma (dry wood fire), medium strength. Dry finish, with acidity and smoke in the aftertaste. Low bitterness; the acidity is providing the balance, not hops. Fresh, clean palate and slightly puckery aftertaste. The wheat character is on the low side; the smoke and acidity are more prominent in the balance. The lemony-tart/green apple flavor is strongest in the finish, with smoke a close second. Complex. Mouthfeel: Tingly acidity. High carbonation. Medium to medium-light body."
                                      :ibu-min         5}))

(def london-brown-ale
  (styles/build-style :london-brown-ale {:category        "Historical Beer"
                                         :carb-min        1.5
                                         :fg-max          1.015
                                         :og-min          1.033
                                         :name            "London Brown Ale"
                                         :type            "Ale"
                                         :style-letter    "D"
                                         :abv-min         0.028
                                         :fg-min          1.012
                                         :category-number "27"
                                         :carb-max        3.0
                                         :ibu-max         20
                                         :ingredients     "English pale ale malt as a base with a healthy proportion of darker caramel malts and often some roasted (black) malt and wheat malt (this is Mann's traditional grist – others can rely on dark sugars for color and flavor). Moderate to high carbonate water. English hop varieties are most authentic, though with low flavor and bitterness almost any type could be used. Post-fermentation sweetening with lactose or artificial sweeteners, or sucrose (if pasteurized)."
                                         :examples        "Harveys Bloomsbury Brown Ale, Mann's Brown Ale"
                                         :notes           "A luscious, sweet, malt-oriented dark brown ale, with caramel and toffee malt complexity and a sweet finish."
                                         :og-max          1.038
                                         :color-min       22.0
                                         :abv-max         0.036
                                         :color-max       35.0
                                         :profile         "Aroma: Moderate malty-sweet aroma, often with a rich, caramel or toffee-like character. Low to medium fruity esters, often dark fruit like plums. Very low to no hop aroma, earthy or floral qualities. Appearance: Medium to very dark brown color, but can be nearly black. Nearly opaque, although should be relatively clear if visible. Low to moderate off-white to tan head. Flavor: Deep, caramel or toffee-like malty and sweet flavor on the palate and lasting into the finish. Hints of biscuit and coffee are common. Some fruity esters can be present (typically dark fruit); relatively clean fermentation profile for an English ale. Low hop bitterness. Hop flavor is low to non-existent, possibly earthy or floral in character. Moderately-low to no perceivable roasty or bitter black malt flavor. Moderately sweet finish with a smooth, malty aftertaste. May have a sugary-sweet flavor. Mouthfeel: Medium body, but the residual sweetness may give a heavier impression. Medium-low to medium carbonation. Quite creamy and smooth in texture, particularly for its gravity."
                                         :ibu-min         15}))

(def piwo-grodziskie 
  (styles/build-style :piwo-grodziskie {:category        "Historical Beer"
                                        :carb-min        1.5
                                        :fg-max          1.012
                                        :og-min          1.028
                                        :name            "Piwo Grodziskie"
                                        :type            "Ale"
                                        :style-letter    "E"
                                        :abv-min         0.025
                                        :fg-min          1.006
                                        :category-number "27"
                                        :carb-max        3.0
                                        :ibu-max         35
                                        :ingredients     "Grain bill usually consists entirely of oak-smoked wheat malt. Oak-smoked wheat malt has a different (and less intense) smoke character than German beechwood-smoked barley malt; it has a drier, crisper, leaner quality – a bacon/ham smoke flavor is inappropriate. Saazer-type hops (Polish, Czech or German), moderate hardness sulfate water, and a relatively clean and attenuative continental ale yeast fermented at moderate ale temperatures are traditional. German hefeweizen yeast or other strains with a phenol or strong ester character are inappropriate."
                                        :examples        "Harveys Bloomsbury Brown Ale, Mann's Brown Ale"
                                        :notes           "A low-gravity, highly-carbonated, light-bodied ale combining an oak-smoked flavor with a clean hop bitterness. Highly sessionable."
                                        :og-max          1.032
                                        :color-min       3.0
                                        :abv-max         0.033
                                        :color-max       6.0
                                        :profile         "Aroma: Low to moderate oak wood smoke is the most prominent aroma component, but can be subtle and hard to detect. A low spicy, herbal, or floral hop aroma is typically present, and should be lower than or equal to the smoke in intensity. Hints of grainy wheat are also detected in the best examples. The aroma is otherwise clean, although light pome fruit esters (especially ripe red apple or pear) are welcome. No acidity. Slight water-derived sulfury notes may be present. Appearance: Pale yellow to medium gold in color with excellent clarity. A tall, billowy, white, tightly-knit head with excellent retention is distinctive. Murkiness is a fault. Flavor: Moderately-low to medium oak smoke flavor up front which carries into the finish; the smoke can be stronger in flavor than in aroma. The smoke character is gentle, should not be acrid, and can lend an impression of sweetness. A moderate to strong bitterness is readily evident which lingers through the finish. The overall balance is toward bitterness. Low but perceptible spicy, herbal, or floral hop flavor. Low grainy wheat character in the background. Light pome fruit esters (red apple or pear) may be present. Dry, crisp finish. No sourness. Mouthfeel: Light in body, with a crisp and dry finish. Carbonation is quite high and can add a slight carbonic bite or prickly sensation. No noticeable alcohol warmth."
                                        :ibu-min         20}))

(def pre-prohibition-lager 
  (styles/build-style :pre-prohibition-lager {:category        "Historical Beer"
                                              :carb-min        1.5
                                              :fg-max          1.015
                                              :og-min          1.044
                                              :name            "Pre-Prohibition Lager"
                                              :type            "Lager"
                                              :style-letter    "F"
                                              :abv-min         0.045
                                              :fg-min          1.01
                                              :category-number "27"
                                              :carb-max        3.0
                                              :ibu-max         40
                                              :ingredients     "Six-row barley with 20% to 30% flaked maize (corn) or rice to dilute the excessive protein levels; modern versions may be all malt. Native American hops such as Clusters, traditional continental hops, or modern noble-type crosses are also appropriate. Modern American hops such as Cascade are inappropriate. Water with a high mineral content can lead to an unpleasant coarseness in flavor and harshness in aftertaste. A wide range of lager yeast character can be exhibited, although modern versions tend to be fairly clean."
                                              :examples        "Anchor California Lager, Coors Batch 19, Little Harpeth Chicken Scratch"
                                              :notes           "A clean, refreshing, but bitter pale lager, often showcasing a grainy-sweet corn flavor. All malt or rice-based versions have a crisper, more neutral character. The higher bitterness level is the largest differentiator between this style and most modern mass-market pale lagers, but the more robust flavor profile also sets it apart."
                                              :og-max          1.06
                                              :color-min       3.0
                                              :abv-max         0.06
                                              :color-max       6.0
                                              :profile         "Aroma: Low to medium grainy, corn-like or sweet maltiness may be evident (although rice-based beers are more neutral). Medium to moderately high hop aroma, with a range of character from rustic to floral to herbal/spicy; a fruity or citrusy modern hop character is inappropriate. Clean lager character. Low DMS is acceptable. May show some yeast character, as with modern American lagers; allow for a range of subtle supporting yeast notes. Appearance: Yellow to deep gold color. Substantial, long lasting white head. Bright clarity. Flavor: Medium to medium-high maltiness with a grainy flavor, and optionally a corn-like roundness and impression of sweetness. Substantial hop bitterness stands up to the malt and lingers through the dry finish. All malt and rice-based versions are often crisper, drier, and generally lack corn-like flavors. Medium to high hop flavor, with a rustic, floral, or herbal/spicy character. Medium to high hop bitterness, which should neither be overly coarse nor have a harsh aftertaste. Allow for a range of lager yeast character, as with modern American lagers, but generally fairly neutral. Mouthfeel: Medium body with a moderately rich, creamy mouthfeel. Smooth and well-lagered. Medium to high carbonation levels."
                                              :ibu-min         25}))

(def pre-prohibition-porter 
  (styles/build-style :pre-prohibition-porter {:category        "Historical Beer"
                                               :carb-min        1.5
                                               :fg-max          1.016
                                               :og-min          1.046
                                               :name            "Pre-Prohibition Porter"
                                               :type            "Ale"
                                               :style-letter    "G"
                                               :abv-min         0.045
                                               :fg-min          1.01
                                               :category-number "27"
                                               :carb-max        3.0
                                               :ibu-max         30
                                               :ingredients     "Two and six row malt (or a combination of both) are used, along with low percentages of dark malts including black, chocolate, and brown malt (roasted barley is not typically used). Adjuncts are acceptable, including corn, brewers licorice, molasses, and porterine. More historical versions will have up to twenty percent adjuncts. Lager or ale yeast. Emphasis on historical or traditional American bittering hops (Cluster, Willamette, Cascade), though finishing and flavor hops may vary."
                                               :examples        "Stegmaier Porter, Yuengling Porter"
                                               :notes           "An American adaptation of English Porter using American ingredients, including adjuncts."
                                               :og-max          1.06
                                               :color-min       18.0
                                               :abv-max         0.06
                                               :color-max       30.0
                                               :profile         "Aroma: Base grainy malt aroma with low levels of dark malt (slight burnt or chocolate notes). Low hop aroma. Low to moderate low levels of DMS acceptable. May show low levels of caramel and biscuit aroma. No to very low esters. Light adjunct (licorice, molasses) aroma acceptable. Diacetyl low to none. Clean lager profile acceptable. Appearance: Medium to dark brown, though some examples can be nearly black in color, with ruby or mahogany highlights. Relatively clear. Light to medium tan head which will persist in the glass. Flavor: Grainy base malt flavor, with low levels of chocolate or burnt black malt notes, along with low levels of caramel, biscuit, licorice, and toast notes. Corn/DMS flavor acceptable at low to moderate levels. American hop bitterness low to moderate and American hop flavor low to none. Balance is typically even between malt and hops, with a moderate dry finish. Mouthfeel: Medium light to medium body, moderate carbonation, low to moderate creaminess. May have a slight astringency from the dark malts."
                                               :ibu-min         20}))

(def roggenbier 
  (styles/build-style :roggenbier {:category        "Historical Beer"
                                   :carb-min        1.5
                                   :fg-max          1.014
                                   :og-min          1.046
                                   :name            "Roggenbier"
                                   :type            "Ale"
                                   :style-letter    "H"
                                   :abv-min         0.045
                                   :fg-min          1.01
                                   :category-number "27"
                                   :carb-max        3.0
                                   :ibu-max         20
                                   :ingredients     "Malted rye typically constitutes 50% or greater of the grist (some versions have 60-65% rye). Remainder of grist can include pale malt, Munich malt, wheat malt, crystal malt and/or small amounts of debittered dark malts for color adjustment. Weizen yeast provides distinctive banana esters and clove phenols. Light usage of Saazer-type hops in bitterness, flavor and aroma. Lower fermentation temperatures accentuate the clove character by suppressing ester formation. Decoction mash traditionally used (as with weissbiers)."
                                   :examples        "Thurn und Taxis Roggen"
                                   :notes           "A dunkelweizen made with rye rather than wheat, but with a greater body and light finishing hops."
                                   :og-max          1.056
                                   :color-min       14.0
                                   :abv-max         0.06
                                   :color-max       19.0
                                   :profile         "Aroma: Light to moderate spicy rye aroma intermingled with light to moderate weizen yeast aromatics (spicy clove and fruity esters, either banana or citrus). Light spicy, floral, or herbal hops are acceptable. Appearance: Light coppery-orange to very dark reddish or coppery-brown color. Large creamy off-white to tan head, quite dense and persistent (often thick and rocky). Cloudy, hazy appearance. Flavor: Grainy, moderately-low to moderately-strong spicy rye flavor, often having a hearty flavor reminiscent of rye or pumpernickel bread. Medium to medium-low bitterness allows an initial malt sweetness (sometimes with a bit of caramel) to be tasted before yeast and rye character takes over. Low to moderate weizen yeast character (banana, clove), although the balance can vary. Medium-dry, grainy finish with a lightly bitter (from rye) aftertaste. Low to moderate spicy, herbal, or floral hop flavor acceptable, and can persist into aftertaste. Mouthfeel: Medium to medium-full body. High carbonation. Moderately creamy."
                                   :ibu-min         10}))

(def sahti 
  (styles/build-style :sahti {:category        "Historical Beer"
                              :carb-min        1.5
                              :fg-max          1.02
                              :og-min          1.076
                              :name            "Sahti"
                              :type            "Ale"
                              :style-letter    "I"
                              :abv-min         0.07
                              :fg-min          1.016
                              :category-number "27"
                              :carb-max        3.0
                              :ibu-max         15
                              :ingredients     "Malted barley along with malted and unmalted grains, often rye. Low hops. Juniper boughs used for lautering (traditionally in a hollowed-out log), but often producing a juniper/berry character. Often uses top-fermenting baker's yeast in a fast, warm fermentation (German Weizen yeast is a good substitute). Not boiled; a long mash steep is used, with a separately added hop tea."
                              :examples        "Thurn und Taxis Roggen"
                              :notes           "A sweet, heavy, strong traditional Finnish beer with a rye, juniper, and juniper berry flavor and a strong banana-clove yeast character."
                              :og-max          1.12
                              :color-min       4.0
                              :abv-max         0.11
                              :color-max       22.0
                              :profile         "Aroma: High banana esters with moderate to moderately-high clove-like phenolics. Not sour. May have a low to moderate juniper character. Grainy malt, caramel, and rye in background. Light alcohol aroma. Sweet malt impression. Appearance: Pale yellow to dark brown color; most are medium to dark amber. Generally quite cloudy (unfiltered). Little head, due to low carbonation. Flavor: Strong banana and moderate to moderately-high clove yeast character. Moderate grainy rye flavor. Low bitterness. Fairly sweet finish. Juniper can add a pine-like flavor; juniper berries can add a gin-like flavor; both should be complementary, not dominant. No noticeable hop flavor. Moderate caramel flavor but no roast. Multi-layered and complex, with kind of a wortiness that is unusual in other beer styles. Not sour. Mouthfeel: Thick, viscous, and heavy with protein (no boil means no hot break). Nearly still to medium-low carbonation. Strongly warming from the alcohol level and young age, but often masked by sweetness."
                              :ibu-min         7}))

(def historic-beer
  (merge gose kentucky-common lichtenhainer london-brown-ale piwo-grodziskie pre-prohibition-lager pre-prohibition-porter roggenbier sahti))
