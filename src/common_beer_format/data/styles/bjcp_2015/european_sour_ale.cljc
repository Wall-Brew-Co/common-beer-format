(ns common-beer-format.data.styles.bjcp-2015.european-sour-ale
  "2015 BJCP guidelines on European Sour Ales"
  (:require [common-beer-format.data.styles.bjcp-2015.styles :as styles]))

(def berliner-weisse 
  (styles/build-style :berliner-weisse {:category        "European Sour Ale"
                                        :carb-min        1.5
                                        :fg-max          1.006
                                        :og-min          1.028
                                        :name            "Berliner Weisse"
                                        :type            "Ale"
                                        :style-letter    "A"
                                        :abv-min         0.028
                                        :fg-min          1.003
                                        :category-number "23"
                                        :carb-max        3.0
                                        :ibu-max         8
                                        :ingredients     "Wheat malt content is typically 50% of the grist (as is tradition with all German wheat beers) with the remainder typically being Pilsner malt. A symbiotic fermentation with top-fermenting yeast and Lactobacillus (various strains) provides the sharp sourness, which may be enhanced by blending of beers of different ages during fermentation and by extended cool aging. Hop bitterness is non-existent. Decoction mashing with mash hopping is traditional. German brewing scientists believe that Brettanomyces is essential to get the correct flavor profile, but this character is never strong."
                                        :examples        "Bayerischer Bahnhof Berliner Style Weisse, Berliner Kindl Weisse, Nodding Head Berliner Weisse, The Bruery Hottenroth"
                                        :notes           "A very pale, refreshing, low-alcohol German wheat beer with a clean lactic sourness and a very high carbonation level. A light bread dough malt flavor supports the sourness, which shouldn't seem artificial. Any Brettanomyces funk is restrained."
                                        :og-max          1.032
                                        :color-min       2.0
                                        :abv-max         0.038
                                        :color-max       3.0
                                        :profile         "Aroma: A sharply sour character is dominant (moderate to moderately-high). Can have up to a moderately fruity character (often lemony or tart apple). The fruitiness may increase with age and a light flowery character may develop. No hop aroma. The wheat may present as uncooked bread dough in fresher versions; combined with the acidity, may suggest sourdough bread. May optionally have a restrained funky Brettanomyces character. Appearance: Very pale straw in color. Clarity ranges from clear to somewhat hazy. Large, dense, white head with poor retention. Always effervescent. Flavor: Clean lactic sourness dominates and can be quite strong. Some complementary doughy, bready or grainy wheat flavor is generally noticeable. Hop bitterness is undetectable; sourness provides the balance rather than hops. Never vinegary. A restrained citrusy-lemony or tart apple fruitiness may be detected. Very dry finish. Balance dominated by sourness, but some malt flavor should be present. No hop flavor. May optionally have a restrained funky Brettanomyces character. Mouthfeel: Light body. Very high carbonation. No sensation of alcohol. Crisp, juicy acidity."
                                        :ibu-min         3}))

(def flanders-red-ale 
  (styles/build-style :flanders-red-ale {:category        "European Sour Ale"
                                         :carb-min        1.5
                                         :fg-max          1.012
                                         :og-min          1.048
                                         :name            "Flanders Red Ale"
                                         :type            "Ale"
                                         :style-letter    "B"
                                         :abv-min         0.046
                                         :fg-min          1.002
                                         :category-number "23"
                                         :carb-max        3.0
                                         :ibu-max         25
                                         :ingredients     "A base of Vienna and/or Munich malts, light to medium cara-malts, and a small amount of Special B are used with up to 20% maize. Low alpha acid continental hops are commonly used (avoid high alpha or distinctive American hops). Saccharomyces, Lactobacillus and Brettanomyces (and acetobacter) contribute to the fermentation and eventual flavor."
                                         :examples        "Cuvée des Jacobins Rouge, Duchesse de Bourgogne, Rodenbach Grand Cru, Rodenbach Klassiek, Vichtenaar Flemish Ale"
                                         :notes           "A sour, fruity, red wine-like Belgian-style ale with interesting supportive malt flavors and fruit complexity. The dry finish and tannin completes the mental image of a fine red wine."
                                         :og-max          1.057
                                         :color-min       10.0
                                         :abv-max         0.065
                                         :color-max       16.0
                                         :profile         "Aroma: Complex fruity-sour profile with supporting malt that often gives a wine-like impression. Fruitiness is high, and reminiscent of black cherries, oranges, plums or red currants. There are often low to medium-low vanilla and/or chocolate notes. Spicy phenols can be present in low amounts for complexity. The sour aroma ranges from balanced to intense. Prominent vinegary acetic character is inappropriate. No hop aroma. Diacetyl is perceived only in very minor quantities, if at all, as a complementary aroma. Appearance: Deep red, burgundy to reddish-brown in color. Good clarity. White to very pale tan head. Average to good head retention. Flavor: Intense fruitiness commonly includes plum, orange, black cherry or red currant flavors. A mild vanilla and/or chocolate character is often present. Spicy phenols can be present in low amounts for complexity. Sour flavor ranges from complementary to intense, and can have an acidic bite. Malty flavors range from complementary to prominent, and often have a soft toasty-rich quality. Generally as the sour character increases, the malt character blends to more of a background flavor (and vice versa). No hop flavor. Restrained hop bitterness. An acidic, tannic bitterness is often present in low to moderate amounts, and adds an aged red wine-like character and finish. Prominent vinegary acetic character is inappropriate. Diacetyl is perceived only in very minor quantities, if at all, as a complementary flavor. Balanced to the malt side, but dominated by the fruity, sour, wine-like impression. Mouthfeel: Medium bodied. Low to medium carbonation. Low to medium astringency, like a well-aged red wine, often with a prickly acidity. Deceivingly light and crisp on the palate although a somewhat sweet finish is not uncommon."
                                         :ibu-min         10}))

(def oud-bruin 
  (styles/build-style :oud-bruin {:category        "European Sour Ale"
                                  :carb-min        1.5
                                  :fg-max          1.012
                                  :og-min          1.04
                                  :name            "Oud Bruin"
                                  :type            "Ale"
                                  :style-letter    "C"
                                  :abv-min         0.04
                                  :fg-min          1.008
                                  :category-number "23"
                                  :carb-max        3.0
                                  :ibu-max         25
                                  :ingredients     "A base of Pils malt with judicious amounts of dark cara malts and a tiny bit of black or roast malt. Often includes maize. Low alpha acid continental hops are typical (avoid high alpha or distinctive American hops). Saccharomyces and Lactobacillus (and acetobacter) contribute to the fermentation and eventual flavor. Lactobacillus reacts poorly to elevated levels of alcohol. Water high in carbonates is typical of its home region and will buffer the acidity of darker malts and the lactic sourness. Magnesium in the water accentuates the sourness."
                                  :examples        "Ichtegem Oud Bruin, Liefmans Goudenband, Liefmans Liefmans Oud Bruin, Petrus Oud Bruin, Riva Vondel, Vanderghinste Bellegems Bruin"
                                  :notes           "A malty, fruity, aged, somewhat sour Belgian-style brown ale."
                                  :og-max          1.074
                                  :color-min       15.0
                                  :abv-max         0.08
                                  :color-max       22.0
                                  :profile         "Aroma: Complex combination of fruity esters and rich malt character. Medium to medium-high esters commonly reminiscent of raisins, plums, figs, dates, black cherries or prunes. Medium low to medium high malt character of caramel, toffee, orange, treacle or chocolate. Spicy phenols can be present in low amounts for complexity. A sherry-like character may be present and generally denotes an aged example. A low sour aroma may be present, and can modestly increase with age but should not grow to a noticeable acetic/vinegary character. Hop aroma absent. Diacetyl is perceived only in very minor quantities, if at all, as a complementary aroma. Appearance: Dark reddish-brown to brown in color. Good clarity. Average to good head retention. Ivory to light tan head color. Flavor: Malty with fruity complexity and typically some caramel character. Medium to medium-high fruitiness commonly includes dark or dried fruit such as raisins, plums, figs, dates, black cherries or prunes. Medium low to medium high malt character of caramel, toffee, orange, treacle or chocolate. Spicy phenols can be present in low amounts for complexity. A slight sourness often becomes more pronounced in well-aged examples, along with some sherry-like character, producing a \"sweet-and-sour\" profile. The sourness should not grow to a notable acetic/vinegary character. Hop flavor absent. Restrained hop bitterness. Low oxidation is appropriate as a point of complexity. Diacetyl is perceived only in very minor quantities, if at all, as a complementary flavor. Balance is malty, but with fruitiness and sourness present. Sweet and tart finish Mouthfeel: Medium to medium-full body. Low to moderate carbonation. No astringency."
                                  :ibu-min         20}))

(def lambic 
  (styles/build-style :lambic {:category        "European Sour Ale"
                               :carb-min        1.5
                               :fg-max          1.01
                               :og-min          1.04
                               :name            "Lambic"
                               :type            "Ale"
                               :style-letter    "D"
                               :abv-min         0.05
                               :fg-min          1.001
                               :category-number "23"
                               :carb-max        3.0
                               :ibu-max         10
                               :ingredients     "Unmalted wheat (30-40%), Pilsner malt and aged hops (3 years) are used. The aged hops are used more for preservative effects than bitterness, and makes actual bitterness levels difficult to estimate. Traditionally these beers are spontaneously fermented with naturally occurring yeast and bacteria in predominately oaken barrels. The barrels used are neutral with little oak character, so don't expect a fresh or forward oak character – more neutral is typical. Home-brewed and craft-brewed versions are more typically made with pure cultures of yeast commonly including Saccharomyces, Brettanomyces, Pediococcus and Lactobacillus in an attempt to recreate the effects of the dominant microbiota of Brussels and the surrounding countryside of the Senne River valley. Cultures taken from bottles are sometimes used but there is no simple way of knowing what organisms are still viable."
                               :examples        "The only bottled version readily available is Cantillon Grand Cru Bruocsella of whatever single batch vintage the brewer deems worthy to bottle. De Cam sometimes bottles their very old (5 years) lambic. In and around Brussels there are specialty cafes that often have draught lambics from traditional brewers or blenders such as Boon, De Cam, Cantillon, Drie Fonteinen, Lindemans, Timmermans and Girardin."
                               :notes           "A fairly sour, often moderately funky wild Belgian wheat beer with sourness taking the place of hop bitterness in the balance. Traditionally spontaneously fermented in the Brussels area and served uncarbonated, the refreshing acidity makes for a very pleasant café drink."
                               :og-max          1.054
                               :color-min       3.0
                               :abv-max         0.065
                               :color-max       7.0
                               :profile         "Aroma: A decidedly sour aroma is often dominant in young examples, but may become more subdued with age as it blends with aromas described as barnyard, earthy, goaty, hay, horsey, and horse blanket. A mild citrus-fruity aroma is considered favorable. An enteric, smoky, cigar-like, or cheesy aroma is unfavorable. Older versions are commonly fruity with aromas of apples or even honey. No hop aroma. Appearance: Pale yellow to deep golden in color; age tends to darken the beer. Clarity is hazy to good. Younger versions are often cloudy, while older ones are generally clear. White colored head generally has poor retention. Flavor: Young examples are often noticeably lactic-sour, but aging can bring this character more in balance with the malt, wheat and barnyard characteristics. Fruity flavors are simpler in young lambics and more complex in the older examples, where they are reminiscent of apples or other light fruits, rhubarb, or honey. Some citrus flavor (often grapefruit) is occasionally noticeable, and is desirable. The malt and wheat character are typically low with some bready-grainy notes. An enteric, smoky or cigar-like character is undesirable. Hop bitterness is low to none, and generally undetectable; sourness provides the balance. Typically has a dry finish. No hop flavor. Mouthfeel: Light to medium-light body. In spite of the low finishing gravity, the many mouth-filling flavors prevent the beer from feeling like water. As a rule of thumb, lambic dries with age, which makes dryness a reasonable indicator of age. Has a medium to high tart, puckering quality without being sharply astringent. Traditional versions are virtually to completely uncarbonated, but bottled examples can pick up moderate carbonation with age."
                               :ibu-min         0}))

(def gueuze 
  (styles/build-style :gueuze {:category        "European Sour Ale"
                               :carb-min        1.5
                               :fg-max          1.006
                               :og-min          1.04
                               :name            "Gueuze"
                               :type            "Ale"
                               :style-letter    "E"
                               :abv-min         0.05
                               :fg-min          1.0
                               :category-number "23"
                               :carb-max        3.0
                               :ibu-max         10
                               :ingredients     "Unmalted wheat (30-40%), Pilsner malt and aged hops (3 years) are used. The aged hops are used more for preservative effects than bitterness, and makes actual bitterness levels difficult to estimate. Traditionally these beers are spontaneously fermented with naturally occurring yeast and bacteria in predominately oaken barrels. The barrels used are old and have little oak character, so don't expect a fresh or forward oak character – more neutral is typical. Home-brewed and craft-brewed versions are more typically made with pure cultures of yeast commonly including Saccharomyces, Brettanomyces, Pediococcus and Lactobacillus in an attempt to recreate the effects of the dominant microbiota of Brussels and the surrounding countryside of the Senne River valley. Cultures taken from bottles are sometimes used but there is no simple way of knowing what organisms are still viable."
                               :examples        "Boon Oude Gueuze, Boon Oude Gueuze Marriage Parfait, Cantillon Gueuze, De Cam Gueuze, De Cam/Drei Fonteinen Millennium Gueuze, Drie Fonteinen Oud Gueuze, Girardin Gueuze (Black Label), Hanssens Oude Gueuze, Lindemans Gueuze Cuvée René, Mort Subite (Unfiltered) Gueuze, Oud Beersel Oude Gueuze"
                               :notes           "A complex, pleasantly sour but balanced wild Belgian wheat beer that is highly carbonated and very refreshing. The spontaneous fermentation character can provide a very interesting complexity, with a wide range of wild barnyard, horse blanket, or leather characteristics intermingling with citrusy-fruity flavors and acidity."
                               :og-max          1.06
                               :color-min       3.0
                               :abv-max         0.08
                               :color-max       7.0
                               :profile         "Aroma: A moderately sour aroma blends with aromas described as barnyard, leather, earthy, goaty, hay, horsey, and horse blanket. While some may be more dominantly sour, balance is the key and denotes a better gueuze. Commonly fruity with aromas of citrus fruits (often grapefruit), apples or other light fruits, rhubarb, or honey. A very mild oak aroma is considered favorable. An enteric, smoky, cigar-like, or cheesy aroma is unfavorable. No hop aroma. Appearance: Golden color, with excellent clarity and a thick, rocky, mousse-like, white head that seems to last forever. Always effervescent. Flavor: A moderately sour character is classically in balance with the malt, wheat and barnyard characteristics. A low, complementary sweetness may be present but higher levels are not traditional. While some may be more dominantly sour, balance is the key and denotes a better gueuze. A varied fruit flavor is common, and can have a honey-like character. A mild vanilla and/or oak flavor is occasionally noticeable. The malt is generally low and bready-grainy. An enteric, smoky or cigar-like character is undesirable. Hop bitterness is generally absent but a very low hop bitterness may occasionally be perceived; sourness provides most of the balance. Crisp, dry, and tart finish. No hop flavor. Mouthfeel: Light to medium-light body. In spite of the low finishing gravity, the many mouth-filling flavors prevent the beer from feeling like water. Has a low to high tart, puckering quality without being sharply astringent. Some versions have a light warming character. Highly carbonated."
                               :ibu-min         0}))

(def fruit-lambic 
  (styles/build-style :fruit-lambic {:category        "European Sour Ale"
                                     :carb-min        1.5
                                     :fg-max          1.01
                                     :og-min          1.04
                                     :name            "Fruit Lambic"
                                     :type            "Ale"
                                     :style-letter    "F"
                                     :abv-min         0.05
                                     :fg-min          1.0
                                     :category-number "23"
                                     :carb-max        3.0
                                     :ibu-max         10
                                     :ingredients     "Unmalted wheat (30-40%), Pilsner malt and aged hops (3 years) are used. The aged hops are used more for preservative effects than bitterness, and makes actual bitterness levels difficult to estimate. Traditional products use 10-30% fruit (25%, if cherry). Fruits traditionally used include tart cherries (with pits), raspberries or Muscat grapes. More recent examples include peaches, apricots or merlot grapes. Tart or acidic fruit is traditionally used as its purpose is not to sweeten the beer but to add a new dimension. Traditionally these beers are spontaneously fermented with naturally occurring yeast and bacteria in predominately oaken barrels. The barrels used are old and have little oak character, so don't expect a fresh or forward oak character – more neutral is typical. Home-brewed and craft-brewed versions are more typically made with pure cultures of yeast commonly including Saccharomyces, Brettanomyces, Pediococcus and Lactobacillus in an attempt to recreate the effects of the dominant microbiota of Brussels and the surrounding countryside of the Senne River valley. Cultures taken from bottles are sometimes used but there is no simple way of knowing what organisms are still viable."
                                     :examples        "Boon Framboise Marriage Parfait, Boon Kriek Marriage Parfait, Boon Oude Kriek, Cantillon Fou' Foune, Cantillon Kriek, Cantillon Lou Pepe Kriek, Cantillon Lou Pepe Framboise, Cantillon Rose de Gambrinus, Cantillon St. Lamvinus, Cantillon Vigneronne, De Cam Oude Kriek, Drie Fonteinen Kriek, Girardin Kriek, Hanssens Oude Kriek, Oud Beersel Kriek, Mort Subite Kriek"
                                     :notes           "A complex, fruity, pleasantly sour, wild wheat ale fermented by a variety of Belgian microbiota, and showcasing the fruit contributions blended with the wild character. The type of fruit can sometimes be hard to identify as fermented and aged fruit characteristics can seem different from the more recognizable fresh fruit aromas and flavors."
                                     :og-max          1.06
                                     :color-min       3.0
                                     :abv-max         0.07
                                     :color-max       7.0
                                     :profile         "Aroma: The specified fruit should be the dominant aroma. A low to moderately sour character blends with aromas described as barnyard, earthy, goaty, hay, horsey, and horse blanket (and thus should be recognizable as a lambic). The fruit aroma commonly blends well with the other aromas. An enteric, smoky, cigar-like, or cheesy aroma is unfavorable. No hop aroma. Appearance: The variety of fruit generally determines the color, although lighter-colored fruit may have little effect on the color. The color intensity may fade with age. Clarity is often good, although some fruit will not drop bright. A thick rocky, mousse-like head, sometimes a shade of fruit, is generally long-lasting (carbonation-dependent). Carbonation is typically high, but must be specified. Flavor: The specified fruit should be evident. Low to moderately sour flavor, often with an acidic bite in the finish. The classic barnyard characteristics may be low to high. When young, the beer will present its full fruity taste. As it ages, the lambic taste will become dominant at the expense of the fruit character—thus fruit lambics are not intended for long aging. The finish is commonly dry and tart, but a low, complementary sweetness may be present; higher sweetness levels are not traditional but can be included for personal preference (sweetness level must be specified). A mild vanilla and/or oak flavor is occasionally noticeable. An enteric, smoky or cigar-like character is undesirable. Hop bitterness is generally absent; acidity provides the balance. No hop flavor. Mouthfeel: Light to medium-light body. In spite of the low finishing gravity, the many mouth-filling flavors prevent the beer from tasting like water. Has a low to high tart, puckering quality without being sharply astringent. Some versions have a light warming character. Carbonation can vary from sparkling to nearly still (must be specified)."
                                     :ibu-min         0}))

(def ^:const european-sour-ale
  (merge berliner-weisse flanders-red-ale oud-bruin lambic gueuze fruit-lambic))
