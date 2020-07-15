(ns common-beer-format.data.styles.bjcp-2015.strong-belgian-ale
  "2015 BJCP guidelines on Strong Belgian Ales"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def belgian-blond-ale 
  (styles/build-style :belgian-blond-ale {:category        "Strong Belgian Ale"
                                          :carb-min        1.5
                                          :fg-max          1.018
                                          :og-min          1.062
                                          :name            "Belgian Blond Ale"
                                          :type            "Ale"
                                          :style-letter    "A"
                                          :abv-min         0.06
                                          :fg-min          1.008
                                          :category-number "25"
                                          :carb-max        3.0
                                          :ibu-max         30
                                          :ingredients     "Belgian Pils malt, aromatic malts, sugar, Belgian yeast strains that produce complex alcohol, phenolics and perfumy esters, Saazer-type, Styrian Goldings, or East Kent Goldings hops. Spices are not traditionally used, although the ingredients and fermentation by-products may give an impression of spicing (often reminiscent of oranges or lemons). If spices are present, should be a background character only."
                                          :examples        "Affligem Blond, Grimbergen Blond, La Trappe Blond, Leffe Blond, Val-Dieu Blond"
                                          :notes           "A moderate-strength golden ale that has a subtle fruity-spicy Belgian yeast complexity, slightly malty-sweet flavor, and dry finish."
                                          :og-max          1.075
                                          :color-min       4.0
                                          :abv-max         0.075
                                          :color-max       7.0
                                          :profile         "Aroma: Light earthy or spicy hop nose, along with a lightly grainy-sweet malt character. Shows a subtle yeast character that may include spicy phenolics, perfumy or honey-like alcohol, or yeasty, fruity esters (commonly orange-like or lemony). Light sweetness that may have a slightly sugar-like character. Subtle yet complex. Appearance: Light to deep gold color. Generally very clear. Large, dense, and creamy white to off-white head. Good head retention with Belgian lace. Flavor: Smooth, light to moderate grainy-sweet malt flavor initially, but finishes medium-dry to dry with some smooth alcohol becoming evident in the aftertaste. Medium hop and alcohol bitterness to balance. Light hop flavor, can be spicy or earthy. Very soft yeast character (esters and alcohols, which are sometimes perfumy or orange/lemon-like). Light spicy phenolics optional. Some lightly caramelized sugar or honey-like sweetness on palate. Mouthfeel: Medium-high to high carbonation, can give mouth-filling bubbly sensation. Medium body. Light to moderate alcohol warmth, but smooth. Can be somewhat creamy."
                                          :ibu-min         15}))

(def saison 
  (styles/build-style :saison {:category        "Strong Belgian Ale"
                               :carb-min        1.5
                               :fg-max          1.008
                               :og-min          1.048
                               :name            "Saison"
                               :type            "Ale"
                               :style-letter    "B"
                               :abv-min         0.035
                               :fg-min          1.002
                               :category-number "25"
                               :carb-max        3.0
                               :ibu-max         35
                               :ingredients     "Not typically spiced, with the yeast, hops and grain providing the character; but spices are allowed if they provide a complementary character. Continental base malts are typical, but the grist frequently contains other grains such as wheat, oats, rye, or spelt. Adjuncts such as sugar and honey can also serve to add complexity and dry out the beer. Darker versions will typically use richer, darker malts, but not typically roasted types. Saazer-type, Styrian or East Kent Golding hops are commonly used. A wide range of herbs or spices can add complexity and uniqueness, but should always meld well with the yeast and hop character. Brettanomyces is not typical for this style; Saisons with Brett should be entered in the American Wild Ale category."
                               :examples        "Ellezelloise Saison, Fantôme Saison, Lefebvre Saison 1900, Saison Dupont Vieille Provision, Saison de Pipaix, Saison Regal, Saison Voisin,Boulevard Tank 7 Farmhouse Ale"
                               :notes           "Most commonly, a pale, refreshing, highly-attenuated, moderately-bitter, moderate-strength Belgian ale with a very dry finish. Typically highly carbonated, and using non-barley cereal grains and optional spices for complexity, as complements the expressive yeast character that is fruity, spicy, and not overly phenolic. Less common variations include both lower-alcohol and higher-alcohol products, as well as darker versions with additional malt character."
                               :og-max          1.065
                               :color-min       5.0
                               :abv-max         0.05
                               :color-max       14.0
                               :profile         "Aroma: Quite aromatic, with fruity, spicy, and hoppy characteristics evident. The esters can be fairly high (moderate to high), and are often reminiscent of citrus fruits such as oranges or lemons. The hops are low to moderate and are often spicy, floral, earthy, or fruity. Stronger versions can have a soft, spicy alcohol note (low intensity). Spicy notes are typically peppery rather than clove-like, and can be up to moderately-strong (typically yeast-derived). Subtle, complementary herb or spice additions are allowable, but should not dominate. The malt character is typically slightly grainy in character and low in intensity. Darker and stronger versions will have more noticeable malt, with darker versions taking characteristics associated with grains of that color (toasty, biscuity, caramelly, chocolate, etc.). In versions where sourness is present instead of bitterness, some of the sour character can be detected (low to moderate). Appearance: Pale versions are often a distinctive pale orange but may be pale golden to amber in color (gold to amber-gold is most common). Darker versions may run from copper to dark brown. Long-lasting, dense, rocky white to ivory head resulting in characteristic Belgian lace on the glass as it fades. Clarity is poor to good, though haze is not unexpected in this type of unfiltered beer. Effervescent. Flavor: Medium-low to medium-high fruity and spicy flavors, supported by a low to medium soft malt character, often with some grainy flavors. Bitterness is typically moderate to high, although sourness can be present in place of bitterness (both should not be strong flavors at the same time). Attenuation is extremely high, which gives a characteristic dry finish essential to the style; a Saison should never finish sweet. The fruity character is frequently citrusy (orange or lemon), and the spices are typically peppery. Allow for a range of balance in the fruity-spicy characteristics; this is often driven by the yeast selection. Hop flavor is low to moderate, and generally spicy or earthy in character. The balance is towards the fruity, spicy, hoppy character, with any bitterness or sourness not overwhelming these flavors. Darker versions will have more malt character, with a range of flavors derived from darker malts (toasty, bready, biscuity, chocolate, etc.) that support the fruity-spicy character of the beer (roasted flavors are not typical). Stronger versions will have more malt flavor in general, as well as a light alcohol impression. Herbs and spices are completely optional, but if present should be used in moderation and not detract from the yeast character. The finish is very dry and the aftertaste is typically bitter and spicy. The hop bitterness can be restrained, although it can seem accentuated due to the high attenuation levels. Mouthfeel: Light to medium body. Alcohol sensation varies with strength, from none in table version to light in standard versions, to moderate in super versions. However, any warming character should be fairly low. Very high carbonation with an effervescent quality. There is enough prickly acidity on the tongue to balance the very dry finish. In versions with sourness, a low to moderate tart character can add a refreshing bite, but not be puckering (optional)."
                               :ibu-min         20}))

(def belgian-golden-strong-ale 
  (styles/build-style :belgian-golden-strong-ale {:category        "Strong Belgian Ale"
                                                  :carb-min        1.5
                                                  :fg-max          1.016
                                                  :og-min          1.07
                                                  :name            "Belgian Golden Strong Ale"
                                                  :type            "Ale"
                                                  :style-letter    "C"
                                                  :abv-min         0.075
                                                  :fg-min          1.005
                                                  :category-number "25"
                                                  :carb-max        3.0
                                                  :ibu-max         35
                                                  :ingredients     "Pilsner malt with substantial sugary adjuncts. Saazer-type hops or Styrian Goldings are commonly used. Belgian yeast strains are used – those that produce fruity esters, spicy phenolics and higher alcohols – often aided by slightly warmer fermentation temperatures. Fairly soft water. Spicing is not traditional; if present, should be a background character only."
                                                  :examples        "Brigand, Delirium Tremens, Dulle Teve, Duvel, Judas, Lucifer, Piraat, Russian River Damnation"
                                                  :notes           "A pale, complex, effervescent, strong Belgian-style ale that is highly attenuated and features fruity and hoppy notes in preference to phenolics."
                                                  :og-max          1.095
                                                  :color-min       3.0
                                                  :abv-max         0.105
                                                  :color-max       6.0
                                                  :profile         "Aroma: Complex with significant fruity esters, moderate spiciness and low to moderate alcohol and hop aromas. Esters are reminiscent of lighter fruits such as pears, oranges or apples. Moderate to moderately low spicy, peppery phenols. A low to moderate yet distinctive perfumy, floral hop character is often present. Alcohols are soft, spicy, perfumy and low-to-moderate in intensity. No hot alcohol or solventy aromas. The malt character is light and slightly grainy-sweet to nearly neutral. Appearance: Yellow to medium gold in color. Good clarity. Effervescent. Massive, long-lasting, rocky, often beady, white head resulting in characteristic Belgian lace on the glass as it fades. Flavor: Marriage of fruity, spicy and alcohol flavors supported by a soft malt character. Esters are reminiscent of pears, oranges or apples. Low to moderately low phenols are peppery in character. A low to moderate spicy hop character is often present. Alcohols are soft and spicy, and are low-to-moderate in intensity. Bitterness is typically medium to high from a combination of hop bitterness and yeast-produced phenolics. Substantial carbonation and bitterness leads to a dry finish with a low to moderately bitter aftertaste. Mouthfeel: Very highly carbonated; effervescent. Light to medium body, although lighter than the substantial gravity would suggest. Smooth but noticeable alcohol warmth. No hot alcohol or solventy character."
                                                  :ibu-min         22}))

(def ^:const strong-belgian-ale
  (merge belgian-blond-ale saison belgian-golden-strong-ale))
