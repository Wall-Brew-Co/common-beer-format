(ns common-beer-format.data.styles.bjcp-2015.strong-british-ale
  "2015 BJCP guidelines on Strong British Ale"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))


(def british-strong-ale
  (styles/build-style :british-strong-ale {:category        "Strong British Ale"
                                           :carb-min        1.5
                                           :fg-max          1.022
                                           :og-min          1.055
                                           :name            "British Strong Ale"
                                           :type            "Ale"
                                           :style-letter    "A"
                                           :abv-min         0.055
                                           :fg-min          1.015
                                           :category-number "17"
                                           :carb-max        3.0
                                           :ibu-max         60
                                           :ingredients     "Grists vary, often based on pale malt with caramel and specialty malts. Some darker examples suggest that dark malts (e.g., chocolate, black malt) may be appropriate, though sparingly so as to avoid an overly roasted character. Sugary adjuncts are common, as are starchy adjuncts (maize, flaked barley, wheat). Finishing hops are traditionally English."
                                           :examples        "Fuller's 1845, Harvey's Elizabethan Ale, J.W. Lees Manchester Star, Samuel Smith's Winter Welcome, Young's Winter Warmer"
                                           :notes           "An ale of respectable alcoholic strength, traditionally bottled-conditioned and cellared. Can have a wide range of interpretations, but most will have varying degrees of malty richness, late hops and bitterness, fruity esters, and alcohol warmth. Judges should allow for a significant range in character, as long as the beer is within the alcohol strength range and has an interesting ‘British' character, it likely fits the style. The malt and adjunct flavors and intensity can vary widely, but any combination should result in an agreeable palate experience."
                                           :og-max          1.08
                                           :color-min       8.0
                                           :abv-max         0.08
                                           :color-max       22.0
                                           :profile         "Aroma: Malty-sweet with fruity esters, often with a complex blend of dried-fruit, caramel, nuts, toffee, and/or other specialty malt aromas. Some alcohol notes are acceptable, but shouldn't be hot or solventy. Hop aromas can vary widely, but typically have earthy, resiny, fruity, and/or floral notes. The balance can vary widely, but most examples will have a blend of malt, fruit, hops, and alcohol in varying intensities. Appearance: Deep gold to dark reddish-brown color (many are fairly dark). Generally clear, although darker versions may be almost opaque. Moderate to low cream- to light tan-colored head; average retention. Flavor: Medium to high malt character often rich with nutty, toffee, or caramel flavors. Light chocolate notes are sometimes found in darker beers. May have interesting flavor complexity from brewing sugars. Balance is often malty, but may be well hopped, which affects the impression of maltiness. Moderate fruity esters are common, often with a dark fruit or dried fruit character. The finish may vary from medium dry to somewhat sweet. Alcoholic strength should be evident, though not overwhelming. Diacetyl low to none, and is generally not desirable. Mouthfeel: Medium to full, chewy body. Alcohol warmth is often evident and always welcome. Low to moderate carbonation. Smooth texture."
                                           :ibu-min         30}))


(def old-ale
  (styles/build-style :old-ale {:category        "Strong British Ale"
                                :carb-min        1.5
                                :fg-max          1.022
                                :og-min          1.055
                                :name            "Old Ale"
                                :type            "Ale"
                                :style-letter    "B"
                                :abv-min         0.055
                                :fg-min          1.015
                                :category-number "17"
                                :carb-max        3.0
                                :ibu-max         60
                                :ingredients     "Composition varies, although generally similar to British Strong Ales. The age character is the biggest driver of the final style profile, which is more handling than brewing. May be aged in wood, but should not have a strong wood character."
                                :examples        "Burton Bridge Olde Expensive, Gale's Prize Old Ale, Greene King Strong Suffolk Ale, Marston Owd Roger, Theakston Old Peculier"
                                :notes           "An ale of moderate to fairly significant alcoholic strength, bigger than standard beers, though usually not as strong or rich as barleywine. Often tilted towards a maltier balance. \"It should be a warming beer of the type that is best drunk in half pints by a warm fire on a cold winter's night\" – Michael Jackson."
                                :og-max          1.088
                                :color-min       10.0
                                :abv-max         0.09
                                :color-max       22.0
                                :profile         "Aroma: Malty-sweet with fruity esters, often with a complex blend of dried-fruit, vinous, caramelly, molasses, nutty, toffee, light treacle, and/or other specialty malt aromas. Some alcohol and oxidative notes are acceptable, akin to those found in Sherry or Port. Hop aromas not usually present due to extended aging. Appearance: Light amber to very dark reddish-brown color (most are fairly dark). Age and oxidation may darken the beer further. May be almost opaque (if not, should be clear). Moderate to low cream- to light tan-colored head; may be adversely affected by alcohol and age. Flavor: Medium to high malt character with a luscious malt complexity, often with nutty, caramelly and/or molasses-like flavors. Light chocolate or roasted malt flavors are optional, but should never be prominent. Balance is often malty-sweet, but may be well hopped (the impression of bitterness often depends on amount of aging). Moderate to high fruity esters are common, and may take on a dried-fruit or vinous character. The finish may vary from dry to somewhat sweet. Extended aging may contribute oxidative flavors similar to a fine old Sherry, Port or Madeira. Alcoholic strength should be evident, though not overwhelming. Diacetyl low to none. Some wood-aged or blended versions may have a lactic or Brettanomyces character; but this is optional and should not be too strong. Any acidity or tannin from age should be well-integrated and contribute to complexity in the flavor profile, not be a dominant experience. Mouthfeel: Medium to full, chewy body, although older examples may be lower in body due to continued attenuation during conditioning. Alcohol warmth is often evident and always welcome. Low to moderate carbonation, depending on age and conditioning. Light acidity may be present, as well as some tannin if wood-aged; both are optional."
                                :ibu-min         30}))


(def wee-heavy
  (styles/build-style :wee-heavy {:category        "Strong British Ale"
                                  :carb-min        1.5
                                  :fg-max          1.04
                                  :og-min          1.07
                                  :name            "Wee Heavy"
                                  :type            "Ale"
                                  :style-letter    "C"
                                  :abv-min         0.065
                                  :fg-min          1.018
                                  :category-number "17"
                                  :carb-max        3.0
                                  :ibu-max         35
                                  :ingredients     "Well-modified pale malt, with roasted barley for color. May use some crystal malt for color adjustment. Slight smoke character may be present in some versions, but derives from roasted grains or from the boil. Peated malt is absolutely not traditional."
                                  :examples        "Belhaven Wee Heavy, Gordon Highland Scotch Ale, Inveralmond Blackfriar, McEwan's Scotch Ale, Orkney Skull Splitter, Traquair House Ale"
                                  :notes           "Rich, malty, dextrinous, and usually caramel-sweet, these beers can give an impression that is suggestive of a dessert. Complex secondary malt and alcohol flavors prevent a one-dimensional quality. Strength and maltiness can vary, but should not be cloying or syrupy."
                                  :og-max          1.13
                                  :color-min       14.0
                                  :abv-max         0.1
                                  :color-max       25.0
                                  :profile         "Aroma: Deeply malty, with a strong caramel component. Lightly smoky secondary aromas may also be present, adding complexity; peat smoke is inappropriate. Diacetyl should be low to none. Low to moderate esters and alcohol are often present in stronger versions. Hops are very low to none, and can be slightly earthy or floral. Appearance: Light copper to dark brown color, often with deep ruby highlights. Clear. Usually has a large tan head, which may not persist. Legs may be evident in stronger versions. Flavor: Richly malty with significant caramel (particularly in stronger versions). Hints of roasted malt may be present (sometimes perceived as a faint smoke character), as may some nutty character, all of which may last into the finish. Peat smoke is inappropriate. Hop flavors and bitterness are low to medium-low, so the malt presence should dominate the balance. Diacetyl should be low to none. Low to moderate esters and alcohol are usually present. Esters may suggest plums, raisins or dried fruit. The palate is usually full and sweet, but the finish may be sweet to medium-dry, sometimes with a light roasty-grainy note. Mouthfeel: Medium-full to full-bodied, with some versions (but not all) having a thick, chewy viscosity. A smooth, alcoholic warmth is usually present and is quite welcome since it balances the malty sweetness. Moderate carbonation."
                                  :ibu-min         17}))


(def english-barleywine
  (styles/build-style :english-barleywine {:category        "Strong British Ale"
                                           :carb-min        1.5
                                           :fg-max          1.03
                                           :og-min          1.08
                                           :name            "English Barleywine"
                                           :type            "Ale"
                                           :style-letter    "D"
                                           :abv-min         0.08
                                           :fg-min          1.018
                                           :category-number "17"
                                           :carb-max        3.0
                                           :ibu-max         70
                                           :ingredients     "High-quality, well-modified pale malt should form the backbone of the grist, with judicious amounts of caramel malts. Dark malts should be used with great restraint, if at all, as most of the color arises from a lengthy boil. English hops such as Northdown, Target, East Kent Goldings and Fuggles are typical. Characterful British yeast."
                                           :examples        "Adnams Tally-Ho, Burton Bridge Thomas Sykes Old Ale, Coniston No. 9 Barley Wine, Fuller's Golden Pride, J.W. Lee's Vintage Harvest Ale, Robinson's Old Tom"
                                           :notes           "A showcase of malty richness and complex, intense flavors. Chewy and rich in body, with warming alcohol and a pleasant fruity or hoppy interest. When aged, it can take on port-like flavors. A wintertime sipper."
                                           :og-max          1.12
                                           :color-min       8.0
                                           :abv-max         0.12
                                           :color-max       22.0
                                           :profile         "Aroma: Very rich and strongly malty, often with a caramel-like aroma in darker versions or a light toffee character in paler versions. May have moderate to strong fruitiness, often with a dark- or dried-fruit character, particularly in dark versions. The hop aroma may range from mild to assertive, and is typically floral, earthy, or marmalade-like. Alcohol aromatics may be low to moderate, but are soft and rounded. The intensity of these aromatics often subsides with age. The aroma may have a rich character including bready, toasty, toffee, and/or molasses notes. Aged versions may have a sherry-like quality, possibly vinous or port-like aromatics, and generally more muted malt aromas. Appearance: Color may range from rich gold to very dark amber or even dark brown (often has ruby highlights, but should not be opaque). Low to moderate off-white head; may have low head retention. May be cloudy with chill haze at cooler temperatures, but generally clears to good to brilliant clarity as it warms. The color may appear to have great depth, as if viewed through a thick glass lens. High alcohol and viscosity may be visible in \"legs\" when beer is swirled in a glass. Flavor: Strong, intense, complex, multi-layered malt flavors ranging from bready, toffee, and biscuity in paler versions through nutty, deep toast, dark caramel, and/or molasses in darker versions. Moderate to high malty sweetness on the palate, although the finish may be moderately sweet to moderately dry (depending on aging). Some oxidative or vinous flavors may be present, and often complex alcohol flavors should be evident. Moderate to fairly high fruitiness, often with a dark- or dried-fruit character. Hop bitterness may range from just enough for balance to a firm presence; balance therefore ranges from malty to somewhat bitter. Pale versions are often more bitter, better attenuated, and might show more hop character than darker versions; however, all versions are malty in the balance. Low to moderately high hop flavor, often floral, earthy, or marmalade-like English varieties. Mouthfeel: Full-bodied and chewy, with a velvety, luscious texture (although the body may decline with long conditioning). A smooth warmth from aged alcohol should be present. Carbonation may be low to moderate, depending on age and conditioning."
                                           :ibu-min         35}))


(def strong-british-ale
  (merge british-strong-ale old-ale wee-heavy english-barleywine))
