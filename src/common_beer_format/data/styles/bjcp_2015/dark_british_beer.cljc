(ns common-beer-format.data.styles.bjcp-2015.dark-british-beer
  "2015 BJCP guidelines on Dark British Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def sweet-stout 
  (styles/build-style :sweet-stout {:category        "Dark British Beer"
                                    :carb-min        1.5
                                    :fg-max          1.024
                                    :og-min          1.044
                                    :name            "Sweet Stout"
                                    :type            "Ale"
                                    :style-letter    "A"
                                    :abv-min         0.04
                                    :fg-min          1.012
                                    :category-number "16"
                                    :carb-max        3.0
                                    :ibu-max         40
                                    :ingredients     "The sweetness in most Sweet Stouts comes from a lower bitterness level than most other stouts and a high percentage of unfermentable dextrins. Lactose, an unfermentable sugar, is frequently added to provide additional residual sweetness. Base of pale malt, and may use roasted barley, black malt, chocolate malt, crystal malt, and adjuncts such as maize or brewing sugars."
                                    :examples        "Bristol Beer Factory Milk Stout, Left Hand Milk Stout, Lancaster Milk Stout, Mackeson's XXX Stout, Marston's Oyster Stout, Samuel Adams Cream Stout"
                                    :notes           "A very dark, sweet, full-bodied, slightly roasty ale that can suggest coffee-and-cream, or sweetened espresso."
                                    :og-max          1.06
                                    :color-min       30.0
                                    :abv-max         0.06
                                    :color-max       40.0
                                    :profile         "Aroma: Mild roasted grain aroma, sometimes with coffee and/or chocolate notes. An impression of cream-like sweetness often exists. Fruitiness can be low to moderately high. Diacetyl low to none. Hop aroma low to none, with floral or earthy notes. Appearance: Very dark brown to black in color. Can be opaque (if not, it should be clear). Creamy tan to brown head. Flavor: Dark roasted grain/malt impression with coffee and/or chocolate flavors dominate the palate. Hop bitterness is moderate. Medium to high sweetness provides a counterpoint to the roasted character and hop bitterness, and lasts into the finish. Low to moderate fruity esters. Diacetyl low to none. The balance between dark grains/malts and sweetness can vary, from quite sweet to moderately dry and somewhat roasty. Mouthfeel: Medium-full to full-bodied and creamy. Low to moderate carbonation. High residual sweetness from unfermented sugars enhances the full-tasting mouthfeel."
                                    :ibu-min         20}))

(def oatmeal-stout 
  (styles/build-style :oatmeal-stout {:category        "Dark British Beer"
                                      :carb-min        1.5
                                      :fg-max          1.018
                                      :og-min          1.045
                                      :name            "Oatmeal Stout"
                                      :type            "Ale"
                                      :style-letter    "B"
                                      :abv-min         0.042
                                      :fg-min          1.01
                                      :category-number "16"
                                      :carb-max        3.0
                                      :ibu-max         40
                                      :ingredients     "Pale, caramel and dark roasted malts (often chocolate) and grains. Oatmeal or malted oats (5-20% or more) used to enhance fullness of body and complexity of flavor. Hops primarily for bittering. Can use brewing sugars or syrups. English ale yeast."
                                      :examples        "Anderson Valley Barney Flats Oatmeal Stout, Broughton Scottish Oatmeal Stout, Figueroa Mountain Stagecoach Stout, St-Ambroise Oatmeal Stout, Samuel Smith Oatmeal Stout, Young's Oatmeal Stout"
                                      :notes           "A very dark, full-bodied, roasty, malty ale with a complementary oatmeal flavor. The sweetness, balance, and oatmeal impression can vary considerably."
                                      :og-max          1.065
                                      :color-min       22.0
                                      :abv-max         0.059
                                      :color-max       40.0
                                      :profile         "Aroma: Mild roasted grain aromas, generally with a coffee-like character. A light malty sweetness can suggest a coffee-and-cream impression. Fruitiness should be low to medium-high. Diacetyl medium-low to none. Hop aroma medium-low to none, earthy or floral. A light grainy-nutty oatmeal aroma is optional. Appearance: Medium brown to black in color. Thick, creamy, persistent tan- to brown-colored head. Can be opaque (if not, it should be clear). Flavor: Similar to the aroma, with a mild roasted coffee to coffee-and-cream flavor, and low to moderately-high fruitiness. Oats and dark roasted grains provide some flavor complexity; the oats can add a nutty, grainy or earthy flavor. Dark grains can combine with malt sweetness to give the impression of milk chocolate or coffee with cream. Medium hop bitterness with the balance toward malt. Medium-sweet to medium-dry finish. Diacetyl medium-low to none. Hop flavor medium-low to none, typically earthy or floral. Mouthfeel: Medium-full to full body, with a smooth, silky, velvety, sometimes an almost oily slickness from the oatmeal. Creamy. Medium to medium-high carbonation."
                                      :ibu-min         25}))

(def tropical-stout 
  (styles/build-style :tropical-stout {:category        "Dark British Beer"
                                       :carb-min        1.5
                                       :fg-max          1.018
                                       :og-min          1.056
                                       :name            "Tropical Stout"
                                       :type            "Ale"
                                       :style-letter    "C"
                                       :abv-min         0.055
                                       :fg-min          1.01
                                       :category-number "16"
                                       :carb-max        3.0
                                       :ibu-max         50
                                       :ingredients     "Similar to a sweet stout, but with more gravity. Pale and dark roasted malts and grains. Hops mostly for bitterness. May use adjuncts and sugar to boost gravity. Typically made with warm-fermented lager yeast."
                                       :examples        "ABC Extra Stout, Dragon Stout, Jamaica Stout, Lion Stout, Royal Extra Stout"
                                       :notes           "A very dark, sweet, fruity, moderately strong ale with smooth roasty flavors without a burnt harshness."
                                       :og-max          1.075
                                       :color-min       30.0
                                       :abv-max         0.08
                                       :color-max       40.0
                                       :profile         "Aroma: Sweetness evident, moderate to high intensity. Roasted grain aromas moderate to high, and can have coffee or chocolate notes. Fruitiness medium to high. May have a molasses, licorice, dried fruit, and/or vinous aromatics. Stronger versions can have a subtle clean aroma of alcohol. Hop aroma low to none. Diacetyl low to none. Appearance: Very deep brown to black in color. Clarity usually obscured by deep color (if not opaque, should be clear). Large tan to brown head with good retention. Flavor: Quite sweet with a smooth dark grain flavors, and restrained bitterness. Roasted grain and malt character can be moderate to high with a smooth coffee or chocolate flavor, although the roast character is moderated in the balance by the sweet finish. Moderate to high fruity esters. Can have a sweet, dark rum-like quality. Little to no hop flavor. Medium-low to no diacetyl. Mouthfeel: Medium-full to full body, often with a smooth, creamy character. May give a warming (but never hot) impression from alcohol presence. Moderate to moderately-high carbonation."
                                       :ibu-min         30}))

(def foreign-extra-stout 
  (styles/build-style :foreign-extra-stout {:category        "Dark British Beer"
                                            :carb-min        1.5
                                            :fg-max          1.018
                                            :og-min          1.056
                                            :name            "Foreign Extra Stout"
                                            :type            "Ale"
                                            :style-letter    "D"
                                            :abv-min         0.063
                                            :fg-min          1.01
                                            :category-number "16"
                                            :carb-max        3.0
                                            :ibu-max         70
                                            :ingredients     "Pale and dark roasted malts and grains, historically also could have used brown and amber malts. Hops mostly for bitterness, typically English varieties. May use adjuncts and sugar to boost gravity."
                                            :examples        "Coopers Best Extra Stout, Guinness Foreign Extra Stout, The Kernel Export Stout, Ridgeway Foreign Export Stout, Southwark Old Stout"
                                            :notes           "A very dark, moderately strong, fairly dry, stout with prominent roast flavors."
                                            :og-max          1.075
                                            :color-min       30.0
                                            :abv-max         0.08
                                            :color-max       40.0
                                            :profile         "Aroma: Moderate to high roasted grain aromas, often with coffee, chocolate and/or lightly burnt notes. Low to medium fruitiness. May have a sweet aroma, or molasses, licorice, dried fruit, and/or vinous aromatics. Stronger versions can have a subtle, clean aroma of alcohol. Hop aroma moderately low to none, can be earthy, herbal or floral. Diacetyl low to none. Appearance: Very deep brown to black in color. Clarity usually obscured by deep color (if not opaque, should be clear). Large tan to brown head with good retention. Flavor: Moderate to high roasted grain and malt flavor with a coffee, chocolate, or lightly burnt grain character, although without a sharp bite. Moderately dry. Low to medium esters. Medium to high bitterness. Moderate to no hop flavor, can be earthy, herbal, or floral. Diacetyl medium-low to none. Mouthfeel: Medium-full to full body, often with a smooth, sometimes creamy character. May give a warming (but never hot) impression from alcohol presence. Moderate to moderately-high carbonation."
                                            :ibu-min         50}))

(def dark-british-beer
  (merge sweet-stout oatmeal-stout tropical-stout foreign-extra-stout))
