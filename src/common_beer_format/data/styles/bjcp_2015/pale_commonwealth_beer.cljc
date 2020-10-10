(ns common-beer-format.data.styles.bjcp-2015.pale-commonwealth-beer
  "2015 BJCP guidelines on Pale Commonwealth Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def british-golden-ale
  (styles/build-style :british-golden-ale {:category        "Pale Commonwealth Beer"
                                           :carb-min        1.5
                                           :fg-max          1.012
                                           :og-min          1.038
                                           :name            "British Golden Ale"
                                           :type            "Ale"
                                           :style-letter    "A"
                                           :abv-min         0.038
                                           :fg-min          1.006
                                           :category-number "12"
                                           :carb-max        3.0
                                           :ibu-max         45
                                           :ingredients     "Low-color pale or lager malt acting as a blank canvas for the hop character. May use sugar adjuncts, corn or wheat. English hops frequently used, although citrusy American varietals are becoming more common. Somewhat clean-fermenting British yeast."
                                           :examples        "Crouch Vale Brewers Gold, Fuller's Discovery, Golden Hill Exmoor Gold, Hop Back Summer Lightning, Kelham Island Pale Rider, Morland Old Golden Hen, Oakham JHB"
                                           :notes           "A hop-forward, average-strength to moderately-strong pale bitter. Drinkability and a refreshing quality are critical components of the style."
                                           :og-max          1.053
                                           :color-min       2.0
                                           :abv-max         0.05
                                           :color-max       6.0
                                           :profile         "Aroma: Hop aroma is moderately low to moderately high, and can use any variety of hops – floral, herbal, or earthy English hops and citrusy American hops are most common. Frequently a single hop varietal will be showcased. Little to no malt aroma; no caramel. Medium-low to low fruity aroma from the hops rather than esters. Little to no diacetyl. Appearance: Straw to golden in color. Good to brilliant clarity. Low to moderate white head. A low head is acceptable when carbonation is also low. Flavor: Medium to medium-high bitterness. Hop flavor is moderate to moderately high of any hop variety, although citrus flavors are increasingly common. Medium-low to low malt character, generally bready with perhaps a little biscuity flavor. Caramel flavors are typically absent. Little to no diacetyl. Hop bitterness and flavor should be pronounced. Moderately-low to low esters. Medium-dry to dry finish. Bitterness increases with alcohol level, but is always balanced. Mouthfeel: Light to medium body. Low to moderate carbonation on draught, although bottled commercial versions will be higher. Stronger versions may have a slight alcohol warmth, but this character should not be too high."
                                           :ibu-min         20}))

(def australian-sparkling-ale
  (styles/build-style :australian-sparkling-ale {:category        "Pale Commonwealth Beer"
                                                 :carb-min        1.5
                                                 :fg-max          1.006
                                                 :og-min          1.038
                                                 :name            "Australian Sparkling Ale"
                                                 :type            "Ale"
                                                 :style-letter    "B"
                                                 :abv-min         0.045
                                                 :fg-min          1.004
                                                 :category-number "12"
                                                 :carb-max        3.0
                                                 :ibu-max         35
                                                 :ingredients     "Lightly kilned Australian 2-row pale malt, lager varieties may be used. Small amounts of crystal malt for color adjustment only. Modern examples use no adjuncts, cane sugar for priming only. Historical examples using 45% 2 row, 30% higher protein malt (6 row) would use around 25% sugar to dilute the nitrogen content. Traditionally used Australian hops, Cluster, and Goldings until replaced from mid-1960s by Pride of Ringwood. Highly attenuative Burton-type yeast (Australian-type strain typical). Variable water profile, typically with low carbonate and moderate sulfate."
                                                 :examples        "Coopers Original Pale Ale, Coopers Sparkling Ale"
                                                 :notes           "Smooth and balanced, all components merge together with similar intensities. Moderate flavors showcasing Australian ingredients. Large flavor dimension. Very drinkable, suited to a hot climate. Relies on yeast character."
                                                 :og-max          1.05
                                                 :color-min       4.0
                                                 :abv-max         0.06
                                                 :color-max       7.0
                                                 :profile         "Aroma: Fairly soft, clean aroma with a balanced mix of esters, hops, malt, and yeast – all moderate to low in intensity. The esters are frequently pears and apples, possibly with a very light touch of banana (optional). The hops are earthy, herbaceous, or might show the characteristic iron-like Pride of Ringwood nose. The malt can range from neutral grainy to moderately sweet to lightly bready; no caramel should be evident. Very fresh examples can have a lightly yeasty, sulfury nose. Appearance: Deep yellow to light amber in color, often medium gold. Tall, frothy, persistent white head with tiny bubbles. Noticeable effervescence due to high carbonation. Brilliant clarity if decanted, but typically poured with yeast to have a cloudy appearance. Not typically cloudy unless yeast roused during the pour. Flavor: Medium to low rounded, grainy to bready malt flavor, initially mild to malty-sweet but a medium to medium-high bitterness rises mid-palate to balance the malt. Caramel flavors typically absent. Highly attenuated, giving a dry finish with lingering bitterness, although the body gives an impression of fullness. Medium to medium-high hop flavor, somewhat earthy and possibly herbal, resinous, peppery, or iron-like but not floral, lasting into aftertaste. Medium-high to medium-low esters, often pears and apples. Banana is optional, but should never dominate. May be lightly minerally or sulfury, especially if yeast is present. Should not be bland. Mouthfeel: High to very high carbonation, giving mouth-filling bubbles and a crisp, spritzy carbonic bite. Medium to medium-full body, tending to the higher side if poured with yeast. Smooth but gassy. Stronger versions may have a light alcohol warmth, but lower alcohol versions will not. Very well-attenuated; should not have any residual sweetness."
                                                 :ibu-min         20}))

(def english-ipa
  (styles/build-style :english-ipa {:category        "Pale Commonwealth Beer"
                                    :carb-min        1.5
                                    :fg-max          1.018
                                    :og-min          1.05
                                    :name            "English IPA"
                                    :type            "Ale"
                                    :style-letter    "C"
                                    :abv-min         0.05
                                    :fg-min          1.01
                                    :category-number "12"
                                    :carb-max        3.0
                                    :ibu-max         60
                                    :ingredients     "Pale ale malt. English hops are traditional, particularly as finishing hops. Attenuative British ale yeast. Refined sugar may be used in some versions. Some versions may show a sulfate character from Burton-type water, but this is not essential to the style."
                                    :examples        "Freeminer Trafalgar IPA, Fuller's Bengal Lancer IPA, Meantime India Pale Ale, Ridgeway IPA, Summit True Brit IPA, Thornbridge Jaipur, Worthington White Shield"
                                    :notes           "A hoppy, moderately-strong, very well-attenuated pale British ale with a dry finish and a hoppy aroma and flavor. Classic British ingredients provide the best flavor profile."
                                    :og-max          1.075
                                    :color-min       6.0
                                    :abv-max         0.075
                                    :color-max       14.0
                                    :profile         "Aroma: A moderate to moderately-high hop aroma of floral, spicy-peppery or citrus-orange in nature is typical. A slightly grassy dry-hop aroma is acceptable, but not required. A moderately-low caramel-like or toasty malt presence is optional. Low to moderate fruitiness is acceptable. Some versions may have a sulfury note, although this character is not mandatory. Appearance: Color ranges from golden to deep amber, but most are fairly pale. Should be clear, although unfiltered dry-hopped versions may be a bit hazy. Moderate-sized, persistent head stand with off-white color. Flavor: Hop flavor is medium to high, with a moderate to assertive hop bitterness. The hop flavor should be similar to the aroma (floral, spicy-peppery, citrus-orange, and/or slightly grassy). Malt flavor should be medium-low to medium, and be somewhat bready, optionally with light to medium-light biscuit-like, toasty, toffee-like and/or caramelly aspects. Medium-low to medium fruitiness. Finish is medium-dry to very dry, and the bitterness may linger into the aftertaste but should not be harsh. The balance is toward the hops, but the malt should still be noticeable in support. If high sulfate water is used, a distinctively minerally, dry finish, some sulfur flavor, and a lingering bitterness are usually present. Some clean alcohol flavor can be noted in stronger versions. Oak is inappropriate in this style. Mouthfeel: Smooth, medium-light to medium-bodied mouthfeel without hop-derived astringency, although moderate to medium-high carbonation can combine to render an overall dry sensation despite a supportive malt presence. A low, smooth alcohol warming can and should be sensed in stronger (but not all) versions."
                                    :ibu-min         40}))

(def pale-commonwealth-beer
  (merge british-golden-ale australian-sparkling-ale english-ipa))
