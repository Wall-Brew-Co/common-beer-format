(ns common-beer-format.data.styles.bjcp-2015.smoked-beer
  "2015 BJCP guidelines on Smoked Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def classic-style-smoked-beer 
  (styles/build-style :classic-style-smoked-beer {:category        "Smoked Beer"
                                                  :carb-min        1.5
                                                  :fg-max          1.02
                                                  :og-min          1.076
                                                  :name            "Classic Style Smoked Beer"
                                                  :type            "Mixed"
                                                  :style-letter    "A"
                                                  :abv-min         0.07
                                                  :fg-min          1.016
                                                  :category-number "32"
                                                  :carb-max        3.0
                                                  :ibu-max         15
                                                  :ingredients     "Different materials used to smoke malt result in unique flavor and aroma characteristics. Beechwood, or other hardwood (oak, maple, mesquite, alder, pecan, apple, cherry, other fruitwoods) smoked malts may be used. The various woods may remind one of certain smoked products due to their food association (e.g., hickory with ribs, maple with bacon or sausage, and alder with salmon). Evergreen wood should never be used since it adds a medicinal, piney flavor to the malt. Noticeable peat-smoked malt is universally undesirable due to its sharp, piercing phenolics and dirt-like earthiness. The remaining ingredients vary with the base style. If smoked malts are combined with other unusual ingredients (fruits, vegetables, spices, honey, etc.) in noticeable quantities, the resulting beer should be entered in the Specialty Smoked Beer."
                                                  :examples        "Alaskan Smoked Porter, Schlenkerla Weizen Rauchbier and Ur-Bock Rauchbier, Spezial Lagerbier, Weissbier and Bockbier, Stone Smoked Porter"
                                                  :notes           "A smoke-enhanced beer showing good balance between the smoke and beer character, while remaining pleasant to drink. Balance in the use of smoke, hops and malt character is exhibited by the better examples."
                                                  :og-max          1.12
                                                  :color-min       4.0
                                                  :abv-max         0.11
                                                  :color-max       22.0
                                                  :profile         "Aroma: The aroma should be a pleasant balance between the expected aroma of the base beer and the smokiness imparted by the use of smoked malts. The intensity and character of the smoke and base beer style can vary, with either being prominent in the balance. Smokiness may vary from low to assertive; however, balance in the overall presentation is the key to well-made examples. The quality and secondary characteristics of the smoke are reflective of the source of the smoke (e.g., alder, oak, beechwood). Sharp, phenolic, harsh, rubbery, or burnt smoke-derived aromatics are inappropriate. Appearance: Variable. The appearance should reflect the base beer style, although the color of the beer is often a bit darker than the plain base style. Flavor: As with aroma, there should be a balance between smokiness and the expected flavor characteristics of the base beer style. Smokiness may vary from low to assertive. Smoky flavors may range from woody to somewhat bacon-like depending on the type of malts used. The balance of underlying beer characteristics and smoke can vary, although the resulting blend should be somewhat balanced and enjoyable. Smoke can add some dryness to the finish. Harsh, bitter, burnt, charred, rubbery, sulfury, medicinal, or phenolic smoky characteristics are generally inappropriate (although some of these characteristics may be present in some base styles; however, the smoked malt shouldn't contribute these flavors). Mouthfeel: Varies with the base beer style. Significant astringent, phenolic smoke-derived harshness is inappropriate."
                                                  :ibu-min         7}))

(def specialty-smoked-beer 
  (styles/build-style :specialty-smoked-beer {:category        "Smoked Beer"
                                              :carb-min        1.5
                                              :fg-max          1.02
                                              :og-min          1.076
                                              :name            "Specialty Smoked Beer"
                                              :type            "Mixed"
                                              :style-letter    "B"
                                              :abv-min         0.07
                                              :fg-min          1.016
                                              :category-number "32"
                                              :carb-max        3.0
                                              :ibu-max         15
                                              :ingredients     "Different materials used to smoke malt result in unique flavor and aroma characteristics. Beechwood, or other hardwood (oak, maple, mesquite, alder, pecan, apple, cherry, other fruitwoods) smoked malts may be used. The various woods may remind one of certain smoked products due to their food association (e.g., hickory with ribs, maple with bacon or sausage, and alder with salmon). Evergreen wood should never be used since it adds a medicinal, piney flavor to the malt. Noticeable peat-smoked malt is universally undesirable due to its sharp, piercing phenolics and dirt-like earthiness. The beer ingredients vary with the base style. Other unusual ingredients (fruits, vegetables, spices, honey, etc.) used in noticeable quantities."
                                              :examples        "Alaskan Smoked Porter, Schlenkerla Weizen Rauchbier and Ur-Bock Rauchbier, Spezial Lagerbier, Weissbier and Bockbier, Stone Smoked Porter"
                                              :notes           "A smoke-enhanced beer showing good balance between the smoke, the beer character, and the added ingredients, while remaining pleasant to drink. Balance in the use of smoke, hops and malt character is exhibited by the better examples."
                                              :og-max          1.12
                                              :color-min       4.0
                                              :abv-max         0.11
                                              :color-max       22.0
                                              :profile         "Aroma: The aroma should be a pleasant balance between the expected aroma of the base beer, the smokiness imparted by the use of smoked malts, and any additional ingredients. The intensity and character of the smoke, base beer style, and additional ingredients can vary, with any being more prominent in the balance. Smokiness may vary from low to assertive; however, balance in the overall presentation is the key to well-made examples. The quality and secondary characteristics of the smoke are reflective of the source of the smoke (e.g., alder, oak, beechwood). Sharp, phenolic, harsh, rubbery, or burnt smoke-derived aromatics are inappropriate. Appearance: Variable. The appearance should reflect the base beer style, although the color of the beer is often a bit darker than the plain base style. The use of certain fruits and spices may affect the color and hue of the beer as well. Flavor: As with aroma, there should be a balance between smokiness, the expected flavor characteristics of the base beer style, and the additional ingredients. Smokiness may vary from low to assertive. Smoky flavors may range from woody to somewhat bacon-like depending on the type of malts used. The balance of underlying beer characteristics and smoke can vary, although the resulting blend should be somewhat balanced and enjoyable. Smoke can add some dryness to the finish. Harsh, bitter, burnt, charred, rubbery, sulfury, medicinal, or phenolic smoky characteristics are generally inappropriate (although some of these characteristics may be present in some base styles; however, the smoked malt shouldn't contribute these flavors). Mouthfeel: Varies with the base beer style. Significant astringent, phenolic smoke-derived harshness is inappropriate."
                                              :ibu-min         7}))

(def smoked-beer
  (merge classic-style-smoked-beer specialty-smoked-beer))
