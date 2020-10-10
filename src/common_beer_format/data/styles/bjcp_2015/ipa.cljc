(ns common-beer-format.data.styles.bjcp-2015.ipa
  "2015 BJCP guidelines on IPAs"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def american-ipa 
  (styles/build-style :american-ipa {:category        "IPA"
                                     :carb-min        1.5
                                     :fg-max          1.014
                                     :og-min          1.056
                                     :name            "American IPA"
                                     :type            "Ale"
                                     :style-letter    "A"
                                     :abv-min         0.055
                                     :fg-min          1.008
                                     :category-number "21"
                                     :carb-max        3.0
                                     :ibu-max         70
                                     :ingredients     "Pale ale or 2-row brewers malt as the base, American or New World hops, American or English yeast with a clean or slightly fruity profile. Generally all-malt, but mashed at lower temperatures for high attenuation. Sugar additions to aid attenuation are acceptable. Restrained use of crystal malts, if any, as high amounts can lead to a sweet finish and clash with the hop character."
                                     :examples        "Alpine Duet, Bell's Two-Hearted Ale, Fat Heads Head Hunter IPA, Firestone Walker Union Jack, Lagunitas IPA, Russian River Blind Pig IPA, Stone IPA"
                                     :notes           "A decidedly hoppy and bitter, moderately strong American pale ale, showcasing modern American or New World hop varieties. The balance is hop-forward, with a clean fermentation profile, dryish finish, and clean, supporting malt allowing a creative range of hop character to shine through."
                                     :og-max          1.07
                                     :color-min       6.0
                                     :abv-max         0.075
                                     :color-max       14.0
                                     :profile         "Aroma: A prominent to intense hop aroma featuring one or more characteristics of American or New World hops, such as citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, melon, etc. Many versions are dry hopped and can have an additional fresh hop aroma; this is desirable but not required. Grassiness should be minimal, if present. A low to medium-low clean, grainy-malty aroma may be found in the background. Fruitiness from yeast may also be detected in some versions, although a neutral fermentation character is also acceptable. A restrained alcohol note may be present, but this character should be minimal at best. Any American or New World hop character is acceptable; new hop varieties continue to be released and should not constrain this style. Appearance: Color ranges from medium gold to light reddish-amber. Should be clear, although unfiltered dry-hopped versions may be a bit hazy. Medium-sized, white to off-white head with good persistence. Flavor: Hop flavor is medium to very high, and should reflect an American or New World hop character, such as citrus, floral, pine, resinous, spicy, tropical fruit, stone fruit, berry, melon, etc. Medium-high to very high hop bitterness. Malt flavor should be low to medium-low, and is generally clean and grainy-malty although some light caramel or toasty flavors are acceptable. Low yeast-derived fruitiness is acceptable but not required. Dry to medium-dry finish; residual sweetness should be low to none. The bitterness and hop flavor may linger into the aftertaste but should not be harsh. A very light, clean alcohol flavor may be noted in stronger versions. May be slightly sulfury, but most examples do not exhibit this character. Mouthfeel: Medium-light to medium body, with a smooth texture. Medium to medium-high carbonation. No harsh hop-derived astringency. Very light, smooth alcohol warming not a fault if it does not intrude into overall balance."
                                     :ibu-min         40}))

(def specialty-ipa 
  (styles/build-style :specialty-ipa {:category        "IPA"
                                      :carb-min        1.5
                                      :fg-max          1.014
                                      :og-min          1.056
                                      :name            "Specialty IPA"
                                      :type            "Ale"
                                      :style-letter    "B"
                                      :abv-min         0.055
                                      :fg-min          1.008
                                      :category-number "21"
                                      :carb-max        3.0
                                      :ibu-max         70
                                      :ingredients     "Pale ale or 2-row brewers malt as the base, American or New World hops, American or English yeast with a clean or slightly fruity profile. Generally all-malt, but mashed at lower temperatures for high attenuation. Sugar additions to aid attenuation are acceptable. Restrained use of crystal malts, if any, as high amounts can lead to a sweet finish and clash with the hop character."
                                      :examples        "Alpine Duet, Bell's Two-Hearted Ale, Fat Heads Head Hunter IPA, Firestone Walker Union Jack, Lagunitas IPA, Russian River Blind Pig IPA, Stone IPA"
                                      :notes           "Recognizable as an IPA by balance – a hop-forward, bitter, dryish beer – with something else present to distinguish it from the standard categories. Should have good drinkability, regardless of the form. Excessive harshness and heaviness are typically faults, as are strong flavor clashes between the hops and the other specialty ingredients."
                                      :og-max          1.07
                                      :color-min       6.0
                                      :abv-max         0.075
                                      :color-max       14.0
                                      :profile         "Aroma: Detectable hop aroma is required; characterization of hops is dependent on the specific type of Specialty IPA. Other aromatics may be present; hop aroma is typically the strongest element. Appearance: Color depends on specific type of Specialty IPA. Most should be clear, although certain styles with high amounts of starchy adjuncts, or unfiltered dry-hopped versions may be slightly hazy. Darker types can be opaque making clarity irrelevant. Good, persistent head stand with color dependent on the specific type of Specialty IPA. Flavor: Hop flavor is typically medium-low to high, with qualities dependent on typical varieties used in the specific Specialty IPA. Hop bitterness is typically medium-high to very high, with qualities dependent on typical varieties used in the specific Specialty IPA. Malt flavor generally low to medium, with qualities dependent on typical varieties used in the specific Specialty IPA. Commonly will have a medium-dry to dry finish. Some clean alcohol flavor can be noted in stronger versions. Various types of Specialty IPAs can show additional malt and yeast characteristics, depending on the type. Mouthfeel: Smooth, medium-light to medium-bodied mouthfeel. Medium carbonation. Some smooth alcohol warming can be sensed in stronger versions."
                                      :ibu-min         40}))

(def ipa
  (merge american-ipa specialty-ipa))
