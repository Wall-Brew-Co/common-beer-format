(ns common-beer-format.data.styles.bjcp-2015.fruit-beer
  "2015 BJCP guidelines on Fruit Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def fruit-beers 
  (styles/build-style :fruit-beer {:category        "Fruit Beer"
                                   :carb-min        1.5
                                   :fg-max          1.02
                                   :og-min          1.076
                                   :name            "Fruit Beer"
                                   :type            "Mixed"
                                   :style-letter    "A"
                                   :abv-min         0.07
                                   :fg-min          1.016
                                   :category-number "29"
                                   :carb-max        3.0
                                   :ibu-max         15
                                   :ingredients     "Virtually any style of beer. Any combination of Saccharomyces, Brettanomyces, Lactobacillus, Pediococcus, or other similar fermenters. Can also be a blend of styles. While cherries, raspberries, and peaches are most common, other fruits can be used as well. Vegetables with fruit-like characteristics (chile, rhubarb, pumpkin, etc.) may also be used. Wood or barrel aging is very common, but not required."
                                   :examples        "Bell's Cherry Stout, Dogfish Head Aprihop, Ebulum Elderberry Black Ale, Founders Rübæus"
                                   :notes           "A harmonious marriage of fruit and beer, but still recognizable as a beer. The fruit character should be evident but in balance with the beer, not so forward as to suggest an artificial product."
                                   :og-max          1.12
                                   :color-min       4.0
                                   :abv-max         0.11
                                   :color-max       22.0
                                   :profile         "Aroma: The distinctive aromatics associated with the declared fruit should be noticeable in the aroma; however, note that some fruit (e.g., raspberries, cherries) have stronger aromas and are more distinctive than others (e.g., blueberries, strawberries) – allow for a range of fruit character and intensity from subtle to aggressive. The additional aromatics should blend well with whatever aromatics are appropriate for the declared base beer style. Appearance: Appearance should be appropriate for the declared base beer and declared fruit. For lighter-colored beers with fruits that exhibit distinctive colors, the color should be noticeable. Note that the color of fruit in beer is often lighter than the flesh of the fruit itself and may take on slightly different shades. Fruit beers may have some haze or be clear, although haze is a generally undesirable. The head may take on some of the color of the fruit. Flavor: As with aroma, the distinctive flavor character associated with the declared fruit should be noticeable, and may range in intensity from subtle to aggressive. The balance of fruit with the underlying beer is vital, and the fruit character should not be so artificial and/or inappropriately overpowering as to suggest a ‘fruit juice drink.' Hop bitterness, flavor, malt flavors, alcohol content, and fermentation by-products, such as esters, should be appropriate to the base beer and be harmonious and balanced with the distinctive fruit flavors present. Remember that fruit generally add flavor not sweetness to fruit beers. The sugar found in fruit is usually fully fermented and contributes to lighter flavors and a drier finish than might be expected for the declared base style. However, residual sweetness is not necessarily a negative characteristic unless it has a raw, unfermented quality. Mouthfeel: Mouthfeel may vary depending on the base beer selected and as appropriate to that base beer. Body and carbonation levels should be appropriate to the declared base beer style. Fruit generally adds fermentables that tend to thin out the beer; the resulting beer may seem lighter than expected for the declared base style. Smaller and darker fruit have a tendency to add a tannic depth that should overwhelm the base beer."
                                   :ibu-min         7}))

(def fruit-and-spice-beer 
  (styles/build-style :fruit-and-spice-beer {:category        "Fruit Beer"
                                             :carb-min        1.5
                                             :fg-max          1.02
                                             :og-min          1.076
                                             :name            "Fruit and Spice Beer"
                                             :type            "Mixed"
                                             :style-letter    "B"
                                             :abv-min         0.07
                                             :fg-min          1.016
                                             :category-number "29"
                                             :carb-max        3.0
                                             :ibu-max         15
                                             :ingredients     "Virtually any style of beer. Any combination of Saccharomyces, Brettanomyces, Lactobacillus, Pediococcus, or other similar fermenters. Can also be a blend of styles. While cherries, raspberries, and peaches are most common, other fruits can be used as well. Vegetables with fruit-like characteristics (chile, rhubarb, pumpkin, etc.) may also be used. Wood or barrel aging is very common, but not required."
                                             :examples        "Bell's Cherry Stout, Dogfish Head Aprihop, Ebulum Elderberry Black Ale, Founders Rübæus"
                                             :notes           "A harmonious marriage of fruit, spice, and beer, but still recognizable as a beer. The fruit and spice character should each be evident but in balance with the beer, not so forward as to suggest an artificial product."
                                             :og-max          1.12
                                             :color-min       4.0
                                             :abv-max         0.11
                                             :color-max       22.0
                                             :profile         "Aroma: The distinctive aromatics associated with the declared fruit and spices should be noticeable in the aroma; however, note that some fruit (e.g., raspberries, cherries) and some spices (e.g., cinnamon, ginger) have stronger aromas and are more distinctive than others (e.g., blueberries, strawberries) – allow for a range of fruit and spice character and intensity from subtle to aggressive. The additional aromatics should blend well with whatever aromatics are appropriate for the declared base beer style. The hop aroma may be absent or balanced, depending on the declared base style. Appearance: Appearance should be appropriate for the declared base beer and declared fruit and spices. For lighter-colored beers with fruits or spices that exhibit distinctive colors, the color should be noticeable. Note that the color of fruit in beer is often lighter than the flesh of the fruit itself and may take on slightly different shades. May have some haze or be clear, although haze is a generally undesirable. The head may take on some of the color of the fruit or spice. Flavor: As with aroma, the distinctive flavor character associated with the declared fruits and spices should be noticeable, and may range in intensity from subtle to aggressive. The balance of fruit and spices with the underlying beer is vital, and the fruit character should not be so artificial and/or inappropriately overpowering as to suggest a spiced fruit juice drink. Hop bitterness, flavor, malt flavors, alcohol content, and fermentation by-products, such as esters, should be appropriate to the base beer and be harmonious and balanced with the distinctive fruit and spice flavors present. Remember that fruit generally add flavor not sweetness. The sugar found in fruit is usually fully fermented and contributes to lighter flavors and a drier finish than might be expected for the declared base style. However, residual sweetness is not necessarily a negative characteristic unless it has a raw, unfermented quality. Some SHV(s) are inherently bitter and may result in a beer more bitter than the declared base style. Mouthfeel: Mouthfeel may vary depending on the base beer selected and as appropriate to that base beer. Body and carbonation levels should be appropriate to the declared base beer style. Fruit generally adds fermentables that tend to thin out the beer; the resulting beer may seem lighter than expected for the declared base style. Some SHV(s) may add additional body, although fermentable additions may thin out the beer. Some SHV(s) may add a bit of astringency, although a \"raw\" spice character is undesirable."
                                             :ibu-min         7}))

(def specialty-fruit-beer 
  (styles/build-style :specialty-fruit-beer {:category        "Fruit Beer"
                                             :carb-min        1.5
                                             :fg-max          1.02
                                             :og-min          1.076
                                             :name            "Specialty Fruit Beer"
                                             :type            "Mixed"
                                             :style-letter    "C"
                                             :abv-min         0.07
                                             :fg-min          1.016
                                             :category-number "29"
                                             :carb-max        3.0
                                             :ibu-max         15
                                             :ingredients     "Virtually any style of beer. Any combination of Saccharomyces, Brettanomyces, Lactobacillus, Pediococcus, or other similar fermenters. Can also be a blend of styles. While cherries, raspberries, and peaches are most common, other fruits can be used as well. Vegetables with fruit-like characteristics (chile, rhubarb, pumpkin, etc.) may also be used. Wood or barrel aging is very common, but not required."
                                             :examples        "New Planet Raspberry Ale"
                                             :notes           "A harmonious marriage of fruit, sugar, and beer, but still recognizable as a beer. The fruit and sugar character should both be evident but in balance with the beer, not so forward as to suggest an artificial product."
                                             :og-max          1.12
                                             :color-min       4.0
                                             :abv-max         0.11
                                             :color-max       22.0
                                             :profile         "Aroma: Same as fruit beer, except that some additional fermentables (honey, molasses, etc.) may add an aroma component. Whatever additional aroma component is present should be in balance with the fruit and the beer components, and be a pleasant combination. Appearance: Same as fruit beer. Flavor: Same as fruit beer, except that some additional fermentables (honey, molasses, etc.) may add a flavor component. Whatever additional flavor component is present should be in balance with the fruit and the beer components, and be a pleasant combination. Added sugars should not have a raw, unfermented flavor. Some added sugars will have unfermentable elements that may provide a fuller finish; fully fermentable sugars may thin out the finish. Mouthfeel: Same as fruit beer, although depending on the type of sugar added, could increase or decrease the body."
                                             :ibu-min         7}))

(def ^:const fruit-beer
  (merge fruit-beers fruit-and-spice-beer specialty-fruit-beer))
