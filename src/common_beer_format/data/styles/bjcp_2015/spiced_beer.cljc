(ns common-beer-format.data.styles.bjcp-2015.spiced-beer
  "2015 BJCP guidelines on Spiced Beers"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def spice-herb-or-vegetable-beer
  (styles/build-style :spice-herb-or-vegetable-beer {:category        "Spiced Beer"
                                                     :carb-min        1.5
                                                     :fg-max          1.02
                                                     :og-min          1.076
                                                     :name            "Spice, Herb, or Vegetable Beer"
                                                     :type            "Mixed"
                                                     :style-letter    "A"
                                                     :abv-min         0.07
                                                     :fg-min          1.016
                                                     :category-number "30"
                                                     :carb-max        3.0
                                                     :ibu-max         15
                                                     :ingredients     "Virtually any style of beer. Any combination of Saccharomyces, Brettanomyces, Lactobacillus, Pediococcus, or other similar fermenters. Can also be a blend of styles. While cherries, raspberries, and peaches are most common, other fruits can be used as well. Vegetables with fruit-like characteristics (chile, rhubarb, pumpkin, etc.) may also be used. Wood or barrel aging is very common, but not required."
                                                     :examples        "Alesmith Speedway Stout, Bell's Java Stout, Elysian Avatar Jasmine IPA, Founders Breakfast Stout, Rogue Chipotle Ale, Traquair Jacobite Ale, Young's Double Chocolate Stout,"
                                                     :notes           "A harmonious marriage of SHV and beer, but still recognizable as a beer. The SHV character should be evident but in balance with the beer, not so forward as to suggest an artificial product."
                                                     :og-max          1.12
                                                     :color-min       4.0
                                                     :abv-max         0.11
                                                     :color-max       22.0
                                                     :profile         "Aroma: The character of the particular spices, herbs and/or vegetables (SHV) should be noticeable in the aroma; however, note that some SHV (e.g., ginger, cinnamon) have stronger aromas and are more distinctive than others (e.g., some vegetables) – allow for a range of SHV character and intensity from subtle to aggressive. The individual character of each SHV(s) may not always be identifiable when used in combination. Hop aroma may be absent or balanced with SHV, depending on the style. The SHV(s) should add an extra complexity to the beer, but not be so prominent as to unbalance the resulting presentation. Appearance: Appearance should be appropriate to the declared base beer and declared special ingredients. For lighter-colored beers with spices, herbs or vegetables that exhibit distinctive colors, the colors may be noticeable in the beer and possibly the head. May have some haze or be clear. Head formation may be adversely affected by some ingredients, such as chocolate. Flavor: As with aroma, the distinctive flavor character associated with the particular SHV(s) should be noticeable, and may range in intensity from subtle to aggressive. The individual character of each SHV(s) may not always be identifiable when used in combination. The balance of SHV with the underlying beer is vital, and the SHV character should not be so artificial and/or overpowering as to overwhelm the beer. Hop bitterness, flavor, malt flavors, alcohol content, and fermentation by-products, such as esters, should be appropriate to the base beer and be harmonious and balanced with the distinctive SHV flavors present. Some SHV(s) are inherently bitter and may result in a beer more bitter than the declared base style. Mouthfeel: Mouthfeel may vary depending on the base beer selected and as appropriate to that base beer. Body and carbonation levels should be appropriate to the base beer style being presented. Some SHV(s) may add additional body, although fermentable additions may thin out the beer. Some SHV(s) may add a bit of astringency, although a \"raw\" spice character is undesirable."
                                                     :ibu-min         7}))

(def autumn-seasonal-beer
  (styles/build-style :autumn-seasonal-beer {:category        "Spiced Beer"
                                             :carb-min        1.5
                                             :fg-max          1.02
                                             :og-min          1.076
                                             :name            "Autumn Seasonal Beer"
                                             :type            "Mixed"
                                             :style-letter    "B"
                                             :abv-min         0.07
                                             :fg-min          1.016
                                             :category-number "30"
                                             :carb-max        3.0
                                             :ibu-max         15
                                             :ingredients     "Spices are required, and often include those evocative of the fall or Thanksgiving season (e.g., allspice, nutmeg, cinnamon, cloves, ginger) but any combination is possible and creativity is encouraged. Flavorful adjuncts are often used (e.g., molasses, invert sugar, brown sugar, honey, maple syrup, etc.). Squash-type or gourd-type vegetables (most frequently pumpkin) are often used."
                                             :examples        "Dogfish Head Punkin Ale, Schlafly Pumpkin Ale, Southampton Pumpkin Ale"
                                             :notes           "An amber to copper, spiced beer that often has a moderately rich body and slightly warming finish suggesting a good accompaniment for the cool fall season, and often evocative of Thanksgiving traditions."
                                             :og-max          1.12
                                             :color-min       4.0
                                             :abv-max         0.11
                                             :color-max       22.0
                                             :profile         "Aroma: A wide range of aromatics is possible, although many examples are reminiscent of pumpkin pie, candied yams, or similar harvest or (US) Thanksgiving themed dishes. Any combination of aromatics that suggests the fall season is welcome. The base beer style often has a malty profile that supports the balanced presentation of the aromatics from spices and possibly other special ingredients. Additional fermentables (e.g., brown sugar, honey, molasses, maple syrup, etc.) may lend their own unique aromatics. Hop aromatics are often absent, subdued, or slightly spicy. Alcohol aromatics may be found in some examples, but this character should be restrained. The overall aroma should be balanced and harmonious, and is often fairly complex and inviting. Appearance: Generally medium amber to coppery-brown (lighter versions are more common). Usually clear, although darker versions may be virtually opaque. Some chill haze is acceptable. Generally has a well-formed head that is often off-white to tan. Some versions with squashes will take on an unusual hue for beer, with orange-like hints. Flavor: Many interpretations are possible; allow for brewer creativity as long as the resulting product is balanced and provides some spice (and optionally, sugar and vegetable) presentation. Spices associated with the fall season are typical (as mentioned in the Aroma section). The spices and optional fermentables should be supportive and blend well with the base beer style. Rich, malty and/or sweet malt-based flavors are common, and may include caramel, toasty, biscuity, or nutty flavors (toasted bread crust or cooked pie crust flavors are welcome). May include distinctive flavors from specific fermentables (molasses, honey, brown sugar, etc.), although these elements are not required. Flavor derived from squash-based vegetables are often elusive. The wide range of special ingredients should be supportive and balanced, not so prominent as to overshadow the base beer. Bitterness and hop flavor are generally restrained so as to not interfere with the spices and special ingredients. Generally finishes rather full and satisfying, and often has some alcohol flavor. Roasted malt characteristics are typically absent. Mouthfeel: A wide range of interpretations is possible. Body is generally medium to full, and a certain malty and/or vegetable-based chewiness is often present. Moderately low to moderately high carbonation is typical. Many examples will show some well-aged, warming alcohol content, but without being overly hot. The beers do not have to be overly strong to show some warming effects."
                                             :ibu-min         7}))

(def winter-seasonal-beer 
  (styles/build-style :winter-seasonal-beer {:category        "Spiced Beer"
                                             :carb-min        1.5
                                             :fg-max          1.02
                                             :og-min          1.076
                                             :name            "Winter Seasonal Beer"
                                             :type            "Mixed"
                                             :style-letter    "C"
                                             :abv-min         0.07
                                             :fg-min          1.016
                                             :category-number "30"
                                             :carb-max        3.0
                                             :ibu-max         15
                                             :ingredients     "Generally ales, although some dark strong lagers exist. Spices are required, and often include those evocative of the Christmas season (e.g., allspice, nutmeg, cinnamon, cloves, ginger) but any combination is possible and creativity is encouraged. Fruit peel (e.g., oranges, lemon) may be used, as may subtle additions of other fruits. Flavorful adjuncts are often used (e.g., molasses, treacle, invert sugar, brown sugar, honey, maple syrup, etc.)."
                                             :examples        "Anchor Our Special Ale, Goose Island Christmas Ale, Great Lakes Christmas Ale, Harpoon Winter Warmer, Lakefront Holiday Spice Lager Beer, Weyerbacher Winter Ale"
                                             :notes           "A stronger, darker, spiced beer that often has a rich body and warming finish suggesting a good accompaniment for the cold winter season."
                                             :og-max          1.12
                                             :color-min       4.0
                                             :abv-max         0.11
                                             :color-max       22.0
                                             :profile         "Aroma: A wide range of aromatics is possible, although many examples are reminiscent of Christmas cookies, gingerbread, English-type Christmas pudding, evergreen trees, or mulling spices. Any combination of aromatics that suggests the holiday season is welcome. The base beer style often has a malty profile that supports the balanced presentation of the aromatics from spices and possibly other special ingredients. Additional fermentables (e.g., honey, molasses, maple syrup, etc.) may lend their own unique aromatics. Hop aromatics are often absent, subdued, or slightly spicy. Some fruit character (often of dried citrus peel, or dried fruit such as raisins or plums) is optional but acceptable. Alcohol aromatics may be found in some examples, but this character should be restrained. The overall aroma should be balanced and harmonious, and is often fairly complex and inviting. Appearance: Generally medium amber to very dark brown (darker versions are more common). Usually clear, although darker versions may be virtually opaque. Some chill haze is acceptable. Generally has a well-formed head that is often off-white to tan. Flavor: Many interpretations are possible; allow for brewer creativity as long as the resulting product is balanced and provides some spice presentation. Spices associated with the holiday season are typical (as mentioned in the Aroma section). The spices and optional fermentables should be supportive and blend well with the base beer style. Rich, malty and/or sweet malt-based flavors are common, and may include caramel, toast, nutty, or chocolate flavors. May include some dried fruit or dried fruit peel flavors such as raisin, plum, fig, orange peel or lemon peel. May include distinctive flavors from specific fermentables (molasses, honey, brown sugar, etc.), although these elements are not required. A light evergreen tree character is optional but found in some examples. The wide range of special ingredients should be supportive and balanced, not so prominent as to overshadow the base beer. Bitterness and hop flavor are generally restrained so as to not interfere with the spices and special ingredients. Generally finishes rather full and satisfying, and often has some alcohol flavor. Roasted malt characteristics are rare, and not usually stronger than chocolate. Mouthfeel: A wide range of interpretations is possible. Body is generally medium to full, and a certain malty chewiness is often present. Moderately low to moderately high carbonation is typical. Many examples will show some well-aged, warming alcohol content, but without being overly hot. The beers do not have to be overly strong to show some warming effects."
                                             :ibu-min         7}))

(def ^:const spiced-beer
  (merge spice-herb-or-vegetable-beer autumn-seasonal-beer winter-seasonal-beer))
