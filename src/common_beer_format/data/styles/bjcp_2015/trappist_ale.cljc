(ns common-beer-format.data.styles.bjcp-2015.trappist-ale
  "2015 BJCP guidelines on Trappists"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def trappist-single 
  (styles/build-style :trappist-single {:category        "Trappist Ale"
                                        :carb-min        1.5
                                        :fg-max          1.01
                                        :og-min          1.044
                                        :name            "Trappist Single"
                                        :type            "Ale"
                                        :style-letter    "A"
                                        :abv-min         0.048
                                        :fg-min          1.004
                                        :category-number "26"
                                        :carb-max        3.0
                                        :ibu-max         45
                                        :ingredients     "Pilsner malt, Belgian Trappist yeast, Saazer-type hops."
                                        :examples        "Achel 5° Blond, St. Bernardus Extra 4, Westmalle Extra, Westvleteren Blond"
                                        :notes           "A pale, bitter, highly attenuated and well carbonated Trappist ale, showing a fruity-spicy Trappist yeast character, a spicy-floral hop profile, and a soft, supportive grainy-sweet malt palate."
                                        :og-max          1.054
                                        :color-min       3.0
                                        :abv-max         0.06
                                        :color-max       5.0
                                        :profile         "Aroma: Medium-low to medium-high Trappist yeast character, showing a fruity-spicy character along with medium-low to medium spicy or floral hops, occasionally enhanced by light herbal/citrusy spice additions. Low to medium-low grainy-sweet malt backdrop, which may have a light honey or sugar quality. Fruit expression can vary widely (citrus, pome fruit, stone fruit). Light spicy, yeast-driven phenolics found in the best examples. Bubblegum inappropriate. Appearance: Pale yellow to medium gold color. Generally good clarity, with a moderate-sized, persistent, billowy white head with characteristic lacing. Flavor: Fruity, hoppy, bitter, and dry. Initial malty-sweet impression, with a grainy-sweet soft malt palate, and a dry, hoppy finish. The malt may have a light honeyed biscuit or cracker impression. Moderate spicy or floral hop flavor. Esters can be citrus (orange, lemon, grapefruit), pome fruit (apple, pear), or stone fruit (apricot, peach). Light to moderate spicy, peppery, or clove phenolics. Bitterness rises towards the crisp, dry finish, with an aftertaste of light malt, moderate hops and yeast character. Mouthfeel: Medium-light to medium body. Smooth. Medium-high to high carbonation, can be somewhat prickly. Should not have noticeable alcohol warmth."
                                        :ibu-min         25}))

(def belgian-dubbel 
  (styles/build-style :belgian-dubbel {:category        "Trappist Ale"
                                       :carb-min        1.5
                                       :fg-max          1.018
                                       :og-min          1.062
                                       :name            "Belgian Dubbel"
                                       :type            "Ale"
                                       :style-letter    "B"
                                       :abv-min         0.06
                                       :fg-min          1.008
                                       :category-number "26"
                                       :carb-max        3.0
                                       :ibu-max         25
                                       :ingredients     "Belgian yeast strains prone to production of higher alcohols, esters, and phenolics are commonly used. Impression of complex grain bill, although traditional versions are typically Belgian Pils malt with caramelized sugar syrup or other unrefined sugars providing much of the character. Saazer-type, English-type or Styrian Goldings hops commonly used. No spices are traditionally used, although restrained use is allowable (background strength only)."
                                       :examples        "Affligem Dubbel, Chimay Première, Corsendonk Pater, Grimbergen Double, La Trappe Dubbel, St. Bernardus Pater 6, Trappistes Rochefort 6, Westmalle Dubbel"
                                       :notes           "A deep reddish-copper, moderately strong, malty, complex Trappist ale with rich malty flavors, dark or dried fruit esters, and light alcohol blended together in a malty presentation that still finishes fairly dry."
                                       :og-max          1.075
                                       :color-min       10.0
                                       :abv-max         0.076
                                       :color-max       17.0
                                       :profile         "Aroma: Complex, rich-sweet malty aroma, possibly with hints of chocolate, caramel and/or toast (but never roasted or burnt aromas). Moderate fruity esters (usually including raisins and plums, sometimes also dried cherries). Esters sometimes include banana or apple. Spicy phenols and higher alcohols are common (may include light clove and spice, peppery, rose-like and/or perfumy notes). Spicy qualities can be moderate to very low. Alcohol, if present, is soft and never hot or solventy. Low to no spicy, herbal, or floral hop aroma, typically absent. The malt is most prominent in the balance with esters and a touch of alcohol in support, blending together for a harmonious presentation. Appearance: Dark amber to copper in color, with an attractive reddish depth of color. Generally clear. Large, dense, and long-lasting creamy off-white head. Flavor: Similar qualities as aroma. Rich, complex medium to medium-full rich-sweet malt flavor on the palate yet finishes moderately dry. Complex malt, ester, alcohol and phenol interplay (raisiny flavors are common; dried fruit flavors are welcome; clove or pepper spiciness is optional). Balance is always toward the malt. Medium-low bitterness that doesn't persist into the aftertaste. Low spicy, floral, or herbal hop flavor is optional and not usually present. Mouthfeel: Medium-full body. Medium-high carbonation, which can influence the perception of body. Low alcohol warmth. Smooth, never hot or solventy."
                                       :ibu-min         15}))

(def belgian-tripel 
  (styles/build-style :belgian-tripel {:category        "Trappist Ale"
                                       :carb-min        1.5
                                       :fg-max          1.014
                                       :og-min          1.075
                                       :name            "Belgian Tripel"
                                       :type            "Ale"
                                       :style-letter    "C"
                                       :abv-min         0.075
                                       :fg-min          1.008
                                       :category-number "26"
                                       :carb-max        3.0
                                       :ibu-max         40
                                       :ingredients     "Pilsner malt, typically with pale sugar adjuncts. Saazer-type hops or Styrian Goldings are commonly used. Belgian yeast strains are used – those that produce fruity esters, spicy phenolics and higher alcohols – often aided by slightly warmer fermentation temperatures. Spice additions are generally not traditional, and if used, should be a background character only. Fairly soft water."
                                       :examples        "Affligem Tripel, Chimay Cinq Cents, La Rulles Tripel, La Trappe Tripel, St. Bernardus Tripel, Unibroue La Fin Du Monde, Val-Dieu Triple, Watou Tripel, Westmalle Tripel"
                                       :notes           "A pale, somewhat spicy, dry, strong Trappist ale with a pleasant rounded malt flavor and firm bitterness. Quite aromatic, with spicy, fruity, and light alcohol notes combining with the supportive clean malt character to produce a surprisingly drinkable beverage considering the high alcohol level."
                                       :og-max          1.085
                                       :color-min       4.5
                                       :abv-max         0.095
                                       :color-max       7.0
                                       :profile         "Aroma: Complex bouquet with moderate to significant spiciness, moderate fruity esters and low alcohol and hop aromas. Generous spicy, peppery, sometimes clove-like phenols. Esters are often reminiscent of citrus fruits such as oranges, but may sometimes have a slight banana character. A low yet distinctive spicy, floral, sometimes perfumy hop character is usually found. Alcohols are soft, spicy and low in intensity. The malt character is light, with a soft, slightly grainy-sweet or slightly honey-like impression. The best examples have a seamless, harmonious interplay between the yeast character, hops, malt, and alcohol. Appearance: Deep yellow to deep gold in color. Good clarity. Effervescent. Long-lasting, creamy, rocky, white head resulting in characteristic Belgian lace on the glass as it fades. Flavor: Marriage of spicy, fruity and alcohol flavors supported by a soft, rounded grainy-sweet malt impression, occasionally with a very light honey note. Low to moderate phenols are peppery in character. Esters are reminiscent of citrus fruit such as orange or sometimes lemon, and are low to moderate. A low to moderate spicy hop character is usually found. Alcohols are soft, spicy, and low in intensity. Bitterness is typically medium to high from a combination of hop bitterness and yeast-produced phenolics. Substantial carbonation and bitterness lends a dry finish with a moderately bitter aftertaste with substantial spicy-fruity yeast character. The grainy-sweet malt flavor does not imply any residual sweetness. Mouthfeel: Medium-light to medium body, although lighter than the substantial gravity would suggest. Highly carbonated. The alcohol content is deceptive, and has little to no obvious warming sensation. Always effervescent."
                                       :ibu-min         20}))

(def belgian-dark-strong-ale 
  (styles/build-style :belgian-dark-strong-ale {:category        "Trappist Ale"
                                                :carb-min        1.5
                                                :fg-max          1.024
                                                :og-min          1.075
                                                :name            "Belgian Dark Strong Ale"
                                                :type            "Ale"
                                                :style-letter    "D"
                                                :abv-min         0.08
                                                :fg-min          1.01
                                                :category-number "26"
                                                :carb-max        3.0
                                                :ibu-max         35
                                                :ingredients     "Belgian yeast strains prone to production of higher alcohols, esters, and sometimes phenolics are commonly used. Impression of a complex grain bill, although many traditional versions are quite simple, with caramelized sugar syrup or unrefined sugars and yeast providing much of the complexity. Saazer-type, English-type or Styrian Goldings hops commonly used. Spices generally not used; if used, keep subtle and in the background."
                                                :examples        "Achel Extra Brune, Boulevard The Sixth Glass, Chimay Grande Réserve, Gouden Carolus Grand Cru of the Emperor, Rochefort 8 and 10, St. Bernardus Abt 12, Westvleteren 12"
                                                :notes           "A dark, complex, very strong Belgian ale with a delicious blend of malt richness, dark fruit flavors, and spicy elements. Complex, rich, smooth and dangerous."
                                                :og-max          1.11
                                                :color-min       12.0
                                                :abv-max         0.12
                                                :color-max       22.0
                                                :profile         "Aroma: Complex, with a rich-sweet malty presence, significant esters and alcohol, and an optional light to moderate spiciness. The malt is rich and strong, and can have a deep bready-toasty quality often with a deep caramel complexity. The fruity esters are strong to moderately low, and can contain raisin, plum, dried cherry, fig or prune notes. Spicy phenols may be present, but usually have a peppery quality not clove-like; light vanilla is possible. Alcohols are soft, spicy, perfumy and/or rose-like, and are low to moderate in intensity. Hops are not usually present (but a very low spicy, floral, or herbal hop aroma is acceptable). No dark/roast malt aroma. No hot alcohols or solventy aromas. Appearance: Deep amber to deep coppery-brown in color (dark in this context implies more deeply colored than golden). Huge, dense, moussy, persistent cream- to light tan-colored head. Can be clear to somewhat hazy. Flavor: Similar to aroma (same malt, ester, phenol, alcohol, and hop comments apply to flavor as well). Moderately malty-rich on the palate, which can have a sweet impression if bitterness is low. Usually moderately dry to dry finish, although may be up to moderately sweet. Medium-low to moderate bitterness; alcohol provides some of the balance to the malt. Generally malty-rich balance, but can be fairly even with bitterness. The complex and varied flavors should blend smoothly and harmoniously. The finish should not be heavy or syrupy. Mouthfeel: High carbonation but not sharp. Smooth but noticeable alcohol warmth. Body can range from medium-light to medium-full and creamy. Most are medium-bodied."
                                                :ibu-min         20}))

(def ^:const trappist-ale
  (merge trappist-single belgian-dubbel belgian-tripel belgian-dark-strong-ale))
