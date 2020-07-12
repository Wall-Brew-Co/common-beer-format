(ns common-beer-format.data.styles.bjcp-2015.pale-bitter-european-beer
  "2015 BJCP guidelines on Pale Bitter European Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def german-leichtbier
  (styles/build-style :german-leichtbier {:category        "Pale Bitter European Beer"
                                          :carb-min        1.5
                                          :fg-max          1.01
                                          :og-min          1.026
                                          :name            "German Leichtbier"
                                          :type            "Lager"
                                          :style-letter    "A"
                                          :abv-min         0.024
                                          :fg-min          1.006
                                          :category-number "5"
                                          :carb-max        3.0
                                          :ibu-max         28
                                          :ingredients     "Similar to a German Pils or Helles, continental Pils malt, German lager yeast, Saazer-type hops."
                                          :examples        "Beck's Light, Bitburger Light, Mahr's Leicht, Paulaner Münchner Hell Leicht, Paulaner Premium Leicht"
                                          :notes           "A pale, highly-attenuated, light-bodied German lager with lower alcohol and calories than normal-strength beers. Moderately bitter with noticeable malt and hop flavors, the beer is still interesting to drink."
                                          :og-max          1.034
                                          :color-min       2.0
                                          :abv-max         0.036
                                          :color-max       5.0
                                          :profile         "Aroma: Low to medium hop aroma, with a spicy, herbal, or floral character. Low to medium-low grainy-sweet or slightly crackery malt aroma. Clean fermentation profile. Appearance: Straw to pale gold in color. Brilliant clarity. Moderate white head with average to below average persistence. Flavor: Low to medium grainy-sweet malt flavor initially. Medium hop bitterness. Low to medium hop flavor, with a spicy, herbal, or floral quality. Clean fermentation character, well-lagered. Dry finish with a light malty and hoppy aftertaste. Mouthfeel: Light to very light body. Medium to high carbonation. Smooth, well-attenuated."
                                          :ibu-min         15}))

(def kölsch
  (styles/build-style :kölsch {:category        "Pale Bitter European Beer"
                               :carb-min        1.5
                               :fg-max          1.011
                               :og-min          1.044
                               :name            "Kölsch"
                               :type            "Ale"
                               :style-letter    "B"
                               :abv-min         0.044
                               :fg-min          1.007
                               :category-number "5"
                               :carb-max        3.0
                               :ibu-max         30
                               :ingredients     "Traditional German hops (Hallertau, Tettnang, Spalt or Hersbrucker). German Pils or pale malt. Attenuative, clean ale yeast. Up to 20% wheat malt may be used, but this is quite rare in authentic versions. Current commercial practice is to ferment warm, cold condition for a short period of time, and serve young."
                               :examples        "Früh Kölsch, Gaffel Kölsch, Mühlen Kölsch, Reissdorf Kölsch, Sion Kölsch, Sünner Kölsch"
                               :notes           "A clean, crisp, delicately-balanced beer usually with a very subtle fruit and hop character. Subdued maltiness throughout leads into a pleasantly well-attenuated and refreshing finish. Freshness makes a huge difference with this beer, as the delicate character can fade quickly with age. Brilliant clarity is characteristic."
                               :og-max          1.05
                               :color-min       3.5
                               :abv-max         0.052
                               :color-max       5.0
                               :profile         "Aroma: Low to very low malt aroma, with a grainy-sweet character. A pleasant, subtle fruit aroma from fermentation (apple, cherry or pear) is acceptable, but not always present. A low floral, spicy or herbal hop aroma is optional but not out of style. Some yeast strains may give a slight winy or sulfury character (this characteristic is also optional, but not a fault). Overall, the intensity of aromatics is fairly subtle but generally balanced, clean, and fresh. Appearance: Very pale gold to light gold. Very clear (authentic commercial versions are filtered to a brilliant clarity). Has a delicate white head that may not persist. Flavor: Soft, rounded palate comprised of a delicate flavor balance between soft yet attenuated malt, an almost imperceptible fruity sweetness from fermentation, and a medium-low to medium bitterness with a delicate dryness and slight crispness in the finish (but no harsh aftertaste). The malt tends to be grainy-sweet, possibly with a very light bready or honey quality. The hop flavor is variable, and can range from low to moderately-high; most are medium-low to medium intensity and have a floral, spicy, or herbal character. May have a malty-sweet impression at the start, but this is not required. No noticeable residual sweetness. May have a slightly winy, minerally, or sulfury accent that accentuates the dryness and flavor balance. A slight wheat taste is rare but not a fault. Otherwise, very clean. Mouthfeel: Medium-light to medium body (most are medium-light). Medium to medium-high carbonation. Smooth and generally crisp and well-attenuated."
                               :ibu-min         18}))

(def german-helles-exportbier
  (styles/build-style :german-helles-exportbier {:category        "Pale Bitter European Beer"
                                                 :carb-min        1.5
                                                 :fg-max          1.015
                                                 :og-min          1.048
                                                 :name            "German Helles Exportbier"
                                                 :type            "Lager"
                                                 :style-letter    "C"
                                                 :abv-min         0.048
                                                 :fg-min          1.01
                                                 :category-number "5"
                                                 :carb-max        3.0
                                                 :ibu-max         30
                                                 :ingredients     "Minerally water with high levels of sulfates, carbonates and chlorides, German or Czech noble hops, Pilsner malt, German lager yeast. Newer commercial versions can contain adjuncts and hop extract."
                                                 :examples        "DAB Original, Dortmunder Kronen, Dortmunder Union Export, Flensburger Gold, Gordon Biersch Golden Export, Great Lakes Dortmunder Gold"
                                                 :notes           "A pale, well-balanced, smooth German lager that is slightly stronger than the average beer with a moderate body and a mild, aromatic hop and malt character."
                                                 :og-max          1.056
                                                 :color-min       4.0
                                                 :abv-max         0.06
                                                 :color-max       7.0
                                                 :profile         "Aroma: Low to medium hop aroma, typically floral, spicy, or herbal in character. Moderate grainy-sweet malt aroma. Clean fermentation profile. A slight sulfury note at the start that dissipates is not a fault, neither is a low background note of DMS. Appearance: Light gold to deep gold. Clear. Persistent white head. Flavor: Neither grainy-sweet malt nor floral, spicy, or herbal hops dominate, but both are in good balance with a touch of malty sweetness, providing a smooth yet crisply refreshing beer. Balance continues through the finish and the hop bitterness lingers in aftertaste (although some examples may finish slightly sweet). Clean fermentation character. Some mineral character might be noted from the water, although it usually does not come across as an overt minerally flavor. Mouthfeel: Medium body, medium carbonation. Smooth but crisp."
                                                 :ibu-min         20}))

(def german-pils
  (styles/build-style :german-pils {:category        "Pale Bitter European Beer"
                                    :carb-min        1.5
                                    :fg-max          1.013
                                    :og-min          1.044
                                    :name            "German Pils"
                                    :type            "Lager"
                                    :style-letter    "D"
                                    :abv-min         0.044
                                    :fg-min          1.008
                                    :category-number "5"
                                    :carb-max        3.0
                                    :ibu-max         40
                                    :ingredients     "Continental Pilsner malt, German hop varieties (especially Saazer-type varieties such as Tettnanger, Hallertauer, and Spalt for taste and aroma; Saaz is less common), German lager yeast."
                                    :examples        "König Pilsener, Left Hand Polestar Pils, Paulaner Premium Pils, Schönramer Pils, Stoudt Pils, Tröegs Sunshine Pils, Trumer Pils"
                                    :notes           "A light-bodied, highly-attenuated, gold-colored, bottom-fermented bitter German beer showing excellent head retention and an elegant, floral hop aroma. Crisp, clean, and refreshing, a German Pils showcases the finest quality German malt and hops."
                                    :og-max          1.05
                                    :color-min       2.0
                                    :abv-max         0.052
                                    :color-max       5.0
                                    :profile         "Aroma: Medium-low to low grainy-sweet-rich malt character (often with a light honey and slightly toasted cracker quality) and distinctive flowery, spicy, or herbal hops. Clean fermentation profile. May optionally have a very light sulfury note that comes from water as much as yeast. The hops are moderately-low to moderately-high, but should not totally dominate the malt presence. One-dimensional examples are inferior to the more complex qualities when all ingredients are sensed. May have a very low background note of DMS. Appearance: Straw to light gold, brilliant to very clear, with a creamy, long-lasting white head. Flavor: Medium to high hop bitterness dominates the palate and lingers into the aftertaste. Moderate to moderately-low grainy-sweet malt character supports the hop bitterness. Low to high floral, spicy, or herbal hop flavor. Clean fermentation profile. Dry to medium-dry, crisp, well-attenuated finish with a bitter aftertaste and light malt flavor. Examples made with water with higher sulfate levels often will have a low sulfury flavor that accentuates the dryness and lengthens the finish; this is acceptable but not mandatory. Some versions have a soft finish with more of a malt flavor, but still with noticeable hop bitterness and flavor, with the balance still towards bitterness. Mouthfeel: Medium-light body. Medium to high carbonation."
                                    :ibu-min         22}))

(def ^:const pale-bitter-european-beer
  (merge german-leichtbier kölsch german-helles-exportbier german-pils))
