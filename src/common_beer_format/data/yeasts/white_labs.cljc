(ns common-beer-format.data.yeasts.white-labs
  "Data for yeasts cultivated by White Labs"
  (:require [common-beer-format.data.yeasts.yeasts :as yeasts]))


(def wlp001-california-ale
  (yeasts/build-yeasts :wlp001-california-ale {:min-temperature 20.0
                                               :name            "WLP001 California Ale"
                                               :max-temperature 22.78
                                               :type            "Ale"
                                               :best-for        "American Style Ales, Ambers, Pale Ales, Brown Ale, Strong Ale"
                                               :laboratory      "White Labs"
                                               :attenuation     0.765
                                               :notes           "Very clean flavor, balance and stability. Accentuates hop flavor Versitile - can be used to make any style ale."
                                               :flocculation    "High"
                                               :form            "Liquid"
                                               :product-id      "WLP001"}))


(def wlp002-english-ale
  (yeasts/build-yeasts :wlp002-english-ale {:min-temperature 18.33
                                            :name            "WLP002 English Ale"
                                            :max-temperature 20.0
                                            :type            "Ale"
                                            :best-for        "English Pale Ale, ESB, India Pale Ale, Brown Ale, Porter, Sweet Stouts and Strong Ales"
                                            :laboratory      "White Labs"
                                            :attenuation     0.765
                                            :notes           "Classic ESB strain best for English style milds, bitters, porters and English style stouts. Leaves a clear beer with some residual sweetness."
                                            :flocculation    "Very High"
                                            :form            "Liquid"
                                            :product-id      "WLP002"}))


(def wlp003-german-ale-ii
  (yeasts/build-yeasts :wlp003-german-ale-ii {:min-temperature 18.33
                                              :name            "WLP003 German Ale II"
                                              :max-temperature 21.11
                                              :type            "Ale"
                                              :best-for        "Kolsch, Alt and German Pale Ales"
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "Strong sulfer component will reduce with aging. Clean flavor, but with more ester production than regular German Ale Yeast."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "WLP003"}))


(def wlp004-irish-ale-yeast
  (yeasts/build-yeasts :wlp004-irish-ale-yeast {:min-temperature 18.33
                                                :name            "WLP004 Irish Ale Yeast"
                                                :max-temperature 20.0
                                                :type            "Ale"
                                                :best-for        "Irish Ales, Stouts, Porters, Browns, Reds and Pale Ale"
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Excellent for Irish Stouts. Produces slight hint of diacetyl balanced by a light fruitiness and a slightly dry crispness."
                                                :flocculation    "Medium"
                                                :form            "Liquid"
                                                :product-id      "WLP004"}))


(def wlp005-british-ale
  (yeasts/build-yeasts :wlp005-british-ale {:min-temperature 19.44
                                            :name            "WLP005 British Ale"
                                            :max-temperature 23.33
                                            :type            "Ale"
                                            :best-for        "Excellent for all English style ales including bitters, pale ale, porters and brown ale."
                                            :laboratory      "White Labs"
                                            :attenuation     0.765
                                            :notes           "This yeast has higher attenuation than the White Labs English Ale yeast strains. Produces a malty flavored beer."
                                            :flocculation    "High"
                                            :form            "Liquid"
                                            :product-id      "WLP005"}))


(def wlp006-bedford-british-ale
  (yeasts/build-yeasts :wlp006-bedford-british-ale {:min-temperature 18.33
                                                    :name            "WLP006 Bedford British Ale"
                                                    :max-temperature 21.11
                                                    :type            "Ale"
                                                    :best-for        "English style ales - bitter, pale, porter and brown ale"
                                                    :laboratory      "White Labs"
                                                    :attenuation     0.765
                                                    :notes           "High attenuation. Ferments dry with high flocculation. Distinctive ester profile. Good for most English ale styles."
                                                    :flocculation    "High"
                                                    :form            "Liquid"
                                                    :product-id      "WLP006"}))


(def wlp007-dry-english-ale
  (yeasts/build-yeasts :wlp007-dry-english-ale {:min-temperature 18.33
                                                :name            "WLP007 Dry English Ale"
                                                :max-temperature 21.11
                                                :type            "Ale"
                                                :best-for        "Pale Ales, Amber, ESB, Brown Ales, Strong Ales"
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Clean, Highly flocculant, and highly attentive yeast. Similar to White labs English Ale yeast, but more attentive. Suitable for high gravity ales."
                                                :flocculation    "High"
                                                :form            "Liquid"
                                                :product-id      "WLP007"}))


(def wlp008-east-coast-ale
  (yeasts/build-yeasts :wlp008-east-coast-ale {:min-temperature 20.0
                                               :name            "WLP008 East Coast Ale"
                                               :max-temperature 22.78
                                               :type            "Ale"
                                               :best-for        "American Ales, Golden ales, Blonde Ale, Pale Ale and German Alt styles"
                                               :laboratory      "White Labs"
                                               :attenuation     0.765
                                               :notes           "White labs \"Brewer Patriot\"strain can be used to reproduce many of the American versions of classic beer styles. Very clean with low esters. "
                                               :flocculation    "Low"
                                               :form            "Liquid"
                                               :product-id      "WLP008"}))


(def wlp009-australian-ale-yeast
  (yeasts/build-yeasts :wlp009-australian-ale-yeast {:min-temperature 18.33
                                                     :name            "WLP009 Australian Ale Yeast"
                                                     :max-temperature 21.11
                                                     :type            "Ale"
                                                     :best-for        "Australian Ales, English Ales"
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "White Labs entry for Australian Ales. Produces a clean, malty finish with pleasant ester character. Bready character. Can ferment clean at high temperatures."
                                                     :flocculation    "High"
                                                     :form            "Liquid"
                                                     :product-id      "WLP009"}))


(def wlp011-european-ale
  (yeasts/build-yeasts :wlp011-european-ale {:min-temperature 18.33
                                             :name            "WLP011 European Ale"
                                             :max-temperature 21.11
                                             :type            "Ale"
                                             :best-for        "Alt, Kolsch, malty English Ales, Fruit beers"
                                             :laboratory      "White Labs"
                                             :attenuation     0.765
                                             :notes           "Malty, Northern European ale yeast. Low ester production, low sulfer, gives a clean profile. Low attenuation contributes to malty taste."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "WLP011"}))


(def wlp013-london-ale
  (yeasts/build-yeasts :wlp013-london-ale {:min-temperature 18.89
                                           :name            "WLP013 London Ale"
                                           :max-temperature 21.67
                                           :type            "Ale"
                                           :best-for        "Classic British Pale Ales, Bitters and Stouts"
                                           :laboratory      "White Labs"
                                           :attenuation     0.765
                                           :notes           "Dry, malty ale yeast. Produces a complex, oak flavored ester character. Hop bitterness comes through well."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "WLP013"}))


(def wlp022-essex-ale-yeast
  (yeasts/build-yeasts :wlp022-essex-ale-yeast {:min-temperature 18.89
                                                :name            "WLP022 Essex Ale Yeast"
                                                :max-temperature 21.11
                                                :type            "Ale"
                                                :best-for        "British milds, pale ales, bitters, stouts."
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Flavorful British yeast with a drier finish than many ale yeasts. Bready and fruity in character. Well suited for top cropping (collecting). Does not flocculate as much as WLP005 or WLP002."
                                                :flocculation    "Medium"
                                                :form            "Liquid"
                                                :product-id      "WLP022"}))


(def wlp023-burton-ale
  (yeasts/build-yeasts :wlp023-burton-ale {:min-temperature 20.0
                                           :name            "WLP023 Burton Ale"
                                           :max-temperature 22.78
                                           :type            "Ale"
                                           :best-for        "All English styles including Pale Ale, IPA, Porter, Stout and Bitters."
                                           :laboratory      "White Labs"
                                           :attenuation     0.765
                                           :notes           "Burton-on-trent yeast produces a complex character. Flavors include apple, pear, and clover honey."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "WLP023"}))


(def wlp025-southwold-ale
  (yeasts/build-yeasts :wlp025-southwold-ale {:min-temperature 18.89
                                              :name            "WLP025 Southwold Ale"
                                              :max-temperature 20.56
                                              :type            "Ale"
                                              :best-for        "British bitters and pale ales."
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "From Suffolk county. Products complex fruity and citrus flavors. Slight sulfer production, but this will fade with aging."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "WLP025"}))


(def wlp026-premium-bitter-ale
  (yeasts/build-yeasts :wlp026-premium-bitter-ale {:min-temperature 19.44
                                                   :name            "WLP026 Premium Bitter Ale"
                                                   :max-temperature 21.11
                                                   :type            "Ale"
                                                   :best-for        "All English ales including bitters, milds, ESB, Porter, Stout and Barley Wine"
                                                   :laboratory      "White Labs"
                                                   :attenuation     0.765
                                                   :notes           "From Staffordshire England. Mild, but complex estery flavor. High attenuation - ferments strong and dry. Suitable for high gravity beers."
                                                   :flocculation    "Medium"
                                                   :form            "Liquid"
                                                   :product-id      "WLP026"}))


(def wlp028-edinburgh-ale
  (yeasts/build-yeasts :wlp028-edinburgh-ale {:min-temperature 18.33
                                              :name            "WLP028 Edinburgh Ale"
                                              :max-temperature 21.11
                                              :type            "Ale"
                                              :best-for        "Strong Scottish style ales, ESB, Irish Reds"
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "Malty strong ale yeast. Reproduces complex, malty, flavorful schottish ales. Hop character comes through well."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "WLP028"}))


(def wlp029-german-ale-kolsch
  (yeasts/build-yeasts :wlp029-german-ale-kolsch {:min-temperature 18.33
                                                  :name            "WLP029 German Ale/Kolsch"
                                                  :max-temperature 20.56
                                                  :type            "Ale"
                                                  :best-for        "Kolsch, Altbiers, Pale Ales, Blonde and Honey Ales"
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "Great for light beers. Accentuates hop flavors. Slight sulfer flavor will fade with age and leave a clean, lager like ale."
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "WLP029"}))


(def wlp033-klassic-ale-yeast
  (yeasts/build-yeasts :wlp033-klassic-ale-yeast {:min-temperature 18.89
                                                  :name            "WLP033 Klassic Ale Yeast"
                                                  :max-temperature 21.11
                                                  :type            "Ale"
                                                  :best-for        "Bitters, milds, porters stouts and scottish ale styles."
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "Traditional English Ale style yeast. Produces ester character, and allows hop flavor through. Leaves a slightly sweet malt character in ales."
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "WLP033"}))


(def wlp036-dusseldorf-alt-yeast
  (yeasts/build-yeasts :wlp036-dusseldorf-alt-yeast {:min-temperature 18.33
                                                     :name            "WLP036 Dusseldorf Alt Yeast"
                                                     :max-temperature 20.56
                                                     :type            "Ale"
                                                     :best-for        "Alt biers, Dusseldorf Alts, German Ales"
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "Traditional Alt yeast from Dusseldorf, Germany. Produces clean, slightly sweet alt beers. Does not accentuate hop flavor like WLP029 does."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP036"}))


(def wlp037-yorkshire-square-ale-yeast
  (yeasts/build-yeasts :wlp037-yorkshire-square-ale-yeast {:min-temperature 18.33
                                                           :name            "WLP037 Yorkshire Square Ale Yeast"
                                                           :max-temperature 20.56
                                                           :type            "Ale"
                                                           :best-for        "English pale ales, English brown ales and Mild ales"
                                                           :laboratory      "White Labs"
                                                           :attenuation     0.765
                                                           :notes           "This yeast produces a malty but well balanced profile. Expect toasty flavors with malt driven esters. Highly flocculent and a good choice for many English ales."
                                                           :flocculation    "High"
                                                           :form            "Liquid"
                                                           :product-id      "WLP037"}))


(def wlp038-manchester-ale-yeast
  (yeasts/build-yeasts :wlp038-manchester-ale-yeast {:min-temperature 18.33
                                                     :name            "WLP038 Manchester Ale Yeast"
                                                     :max-temperature 21.11
                                                     :type            "Ale"
                                                     :best-for        "English style ales"
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "Top fermenting strain that is good for top-cropping. Moderately flocculent with a clean, dry finish. Low ester profile for producing a balanced English ale."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP038"}))


(def wlp039-nottingham-ale-yeast
  (yeasts/build-yeasts :wlp039-nottingham-ale-yeast {:min-temperature 18.89
                                                     :name            "WLP039 Nottingham Ale Yeast"
                                                     :max-temperature 21.11
                                                     :type            "Ale"
                                                     :best-for        "British ales, pale ales, ambers, porters and stouts."
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "British style of ale yeast with a very dry finish and high attenuation. Medium to low fruit and fusel alcohol production. Good top fermenting yeast for cropping. "
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP039"}))


(def wlp041-pacific-ale
  (yeasts/build-yeasts :wlp041-pacific-ale {:min-temperature 18.33
                                            :name            "WLP041 Pacific Ale"
                                            :max-temperature 20.0
                                            :type            "Ale"
                                            :best-for        "English & American ales including milds, bitters, IPA, porters and English stouts."
                                            :laboratory      "White Labs"
                                            :attenuation     0.765
                                            :notes           "Popular yeast from the Pacific Northwest. Leaves a clear and malty profile. More fruity than WLP002. Suitable for many English and American styles."
                                            :flocculation    "High"
                                            :form            "Liquid"
                                            :product-id      "WLP041"}))


(def wlp051-california-ale-v
  (yeasts/build-yeasts :wlp051-california-ale-v {:min-temperature 18.89
                                                 :name            "WLP051 California Ale V"
                                                 :max-temperature 21.11
                                                 :type            "Ale"
                                                 :best-for        "American style Pales, Ambers, Browns, IPAs, American Strong Ale"
                                                 :laboratory      "White Labs"
                                                 :attenuation     0.765
                                                 :notes           "Similar to White Labs California Ale Yeast, but slightly lower attenuation leaves a fuller bodied beer."
                                                 :flocculation    "High"
                                                 :form            "Liquid"
                                                 :product-id      "WLP051"}))


(def wlp060-american-ale-yeast-blend
  (yeasts/build-yeasts :wlp060-american-ale-yeast-blend {:min-temperature 20.0
                                                         :name            "WLP060 American Ale Yeast Blend"
                                                         :max-temperature 22.22
                                                         :type            "Ale"
                                                         :best-for        "American ales with clean finish"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "A blend that celebrates WLP001 (California Ale Yeast's) clean, neutral fermentation. This strain is versatile and adds two other yeast strains that are also clean/neutral in flavor to add a bit of complexity - almost a lager like finish. Slight sulfur m"
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "WLP060"}))


(def wlp080-cream-ale-yeast-blend
  (yeasts/build-yeasts :wlp080-cream-ale-yeast-blend {:min-temperature 18.33
                                                      :name            "WLP080 Cream Ale Yeast Blend"
                                                      :max-temperature 21.11
                                                      :type            "Ale"
                                                      :best-for        "Cream Ale, Hybrids"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "A blend of ale and lager yeast strains that work together to create a clean, light American lager style ale. A pleasing estery aroma may be perceived. Hop flavors and bitterness are slightly subdued. Slight sulfer will be produced during fermentation f"
                                                      :flocculation    "Medium"
                                                      :form            "Liquid"
                                                      :product-id      "WLP080"}))


(def wlp090-san-diego-super-yeast
  (yeasts/build-yeasts :wlp090-san-diego-super-yeast {:min-temperature 18.33
                                                      :name            "WLP090 San Diego Super Yeast"
                                                      :max-temperature 20.0
                                                      :type            "Ale"
                                                      :best-for        "IPAs, American ales"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "A super clean, super-fast fermenting strain. A low ester-producing strain that results in a balanced, neutral flavor and aroma profile. Alcohol-tolerant and very versatile for a wide variety of styles. Similar to California Ale Yeast WLP001 but it generally ferments faster."
                                                      :flocculation    "Very High"
                                                      :form            "Liquid"
                                                      :product-id      "WLP090"}))


(def wlp099-super-high-gravity-ale
  (yeasts/build-yeasts :wlp099-super-high-gravity-ale {:min-temperature 20.56
                                                       :name            "WLP099 Super High Gravity Ale"
                                                       :max-temperature 23.33
                                                       :type            "Ale"
                                                       :best-for        "Very high gravity beers and barley wine up to 25% alcohol."
                                                       :laboratory      "White Labs"
                                                       :attenuation     0.765
                                                       :notes           "Ferments up to 25% alcohol content. Flavor may vary greatly depending on beer alcohol. English like esters at low gravity, but will become more wine-like as alcohol exceeds 16% ABV. Refer to White Labs web page for tips on fermenting high gravity ales."
                                                       :flocculation    "Low"
                                                       :form            "Liquid"
                                                       :product-id      "WLP099"}))


(def wlp300-hefeweizen-ale
  (yeasts/build-yeasts :wlp300-hefeweizen-ale {:min-temperature 20.0
                                               :name            "WLP300 Hefeweizen Ale"
                                               :max-temperature 22.22
                                               :type            "Wheat"
                                               :best-for        "German style wheat beers. Weiss, Weizen, Hefeweizen"
                                               :laboratory      "White Labs"
                                               :attenuation     0.765
                                               :notes           "Produces the banana and clove nose traditionally associated with German Wheat beers. Also produces desired cloudy look."
                                               :flocculation    "Low"
                                               :form            "Liquid"
                                               :product-id      "WLP300"}))


(def wlp320-american-hefeweizen-ale
  (yeasts/build-yeasts :wlp320-american-hefeweizen-ale {:min-temperature 18.33
                                                        :name            "WLP320 American Hefeweizen Ale"
                                                        :max-temperature 20.56
                                                        :type            "Wheat"
                                                        :best-for        "Oregon style American Hefeweizen"
                                                        :laboratory      "White Labs"
                                                        :attenuation     0.765
                                                        :notes           "Produces a much smaller amount of clove and banana flavor than the German Hefeweizen White Labs yeast. Some sulfur, and creates desired cloudy look."
                                                        :flocculation    "Low"
                                                        :form            "Liquid"
                                                        :product-id      "WLP320"}))


(def wlp351-bavarian-weizen-yeast
  (yeasts/build-yeasts :wlp351-bavarian-weizen-yeast {:min-temperature 18.89
                                                      :name            "WLP351 Bavarian Weizen Yeast"
                                                      :max-temperature 21.11
                                                      :type            "Wheat"
                                                      :best-for        "Bavarian Weizen and wheat beers."
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "Former yeast lab W51 strain. Produces a classic German style wheat beer with moderately high, spicy, phenolic overtones reminiscent of cloves."
                                                      :flocculation    "Low"
                                                      :form            "Liquid"
                                                      :product-id      "WLP351"}))


(def wlp380-hefeweizen-iv-ale
  (yeasts/build-yeasts :wlp380-hefeweizen-iv-ale {:min-temperature 18.89
                                                  :name            "WLP380 Hefeweizen IV Ale"
                                                  :max-temperature 21.11
                                                  :type            "Wheat"
                                                  :best-for        "German style Hefeweizen"
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "Large clove and phenolic aroma, but with minimal banana flavor. Citrus and apricot notes. Crisp and drinkable, with some sulfur production."
                                                  :flocculation    "Low"
                                                  :form            "Liquid"
                                                  :product-id      "WLP380"}))


(def wlp400-belgian-wit-ale
  (yeasts/build-yeasts :wlp400-belgian-wit-ale {:min-temperature 19.44
                                                :name            "WLP400 Belgian Wit Ale"
                                                :max-temperature 23.33
                                                :type            "Wheat"
                                                :best-for        "Belgian Wit"
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Phenolic and tart. The original yeast used to produce Wit in Belgium."
                                                :flocculation    "Low"
                                                :form            "Liquid"
                                                :product-id      "WLP400"}))


(def wlp410-belgian-wit-ii
  (yeasts/build-yeasts :wlp410-belgian-wit-ii {:min-temperature 19.44
                                               :name            "WLP410 Belgian Wit II"
                                               :max-temperature 23.33
                                               :type            "Ale"
                                               :best-for        "Belgian Wit, Spiced Ale, Wheat Ales and Specialty Beers"
                                               :laboratory      "White Labs"
                                               :attenuation     0.765
                                               :notes           "Less phenolic than WLP400 (Belgian Wit Ale) but more spicy. Leaves a little more sweetness and flocculation is higher than WLP400."
                                               :flocculation    "Medium"
                                               :form            "Liquid"
                                               :product-id      "WLP410"}))


(def wlp500-trappist-ale
  (yeasts/build-yeasts :wlp500-trappist-ale {:min-temperature 18.33
                                             :name            "WLP500 Trappist Ale"
                                             :max-temperature 22.22
                                             :type            "Ale"
                                             :best-for        "Trappist Ale, Dubbel, Trippel, Belgian Ales"
                                             :laboratory      "White Labs"
                                             :attenuation     0.765
                                             :notes           "Distinctive fruitiness and plum characteristics. Excellent for high gravity beers."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "WLP500"}))


(def wlp510-bastogne-belgian-ale
  (yeasts/build-yeasts :wlp510-bastogne-belgian-ale {:min-temperature 18.89
                                                     :name            "WLP510 Bastogne Belgian Ale"
                                                     :max-temperature 22.22
                                                     :type            "Ale"
                                                     :best-for        "High gravity beers, Belgian ales, Dubbels, Trippels."
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "High gravity Trappist ale yeast. Creates a dry beer with a slightly acidic finish. Cleaner finish and slightly less spicy than WLP500 or WLP530. "
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP510"}))


(def wlp515-antwerp-ale-yeast
  (yeasts/build-yeasts :wlp515-antwerp-ale-yeast {:min-temperature 19.44
                                                  :name            "WLP515 Antwerp Ale Yeast"
                                                  :max-temperature 21.11
                                                  :type            "Ale"
                                                  :best-for        "Belgian pale and amber ales"
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "Clean, almost lager like Belgian ale yeast. Good for Belgian pale and amber ales or with other Belgian yeasts in a blend. Biscuity, ale like aroma present. Hop flavors are accentuated. Slight sulfur during fermentation, and a lager like flavor profile"
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "WLP515"}))


(def wlp530-abbey-ale
  (yeasts/build-yeasts :wlp530-abbey-ale {:min-temperature 18.89
                                          :name            "WLP530 Abbey Ale"
                                          :max-temperature 22.22
                                          :type            "Ale"
                                          :best-for        "Belgian Trappist Ale, Spiced Ale, Trippel, Dubbel, Grand Cru"
                                          :laboratory      "White Labs"
                                          :attenuation     0.765
                                          :notes           "Used in two of six remaining Trappist breweries. Distinctive plum and fruitiness. Good for high gravity beers."
                                          :flocculation    "Medium"
                                          :form            "Liquid"
                                          :product-id      "WLP530"}))


(def wlp540-abbey-iv-ale-yeast
  (yeasts/build-yeasts :wlp540-abbey-iv-ale-yeast {:min-temperature 18.89
                                                   :name            "WLP540 Abbey IV Ale Yeast"
                                                   :max-temperature 22.22
                                                   :type            "Ale"
                                                   :best-for        "Trappist Belgian Ales, Dubbels, Tripels and Specialty ales"
                                                   :laboratory      "White Labs"
                                                   :attenuation     0.765
                                                   :notes           "An authentic Trappist style ale yeast. Use for Belgian ales including abbey ales (dubbels, tripels). Fruit character is medium - between WLP500 (high) and WLP530 (low)"
                                                   :flocculation    "Medium"
                                                   :form            "Liquid"
                                                   :product-id      "WLP540"}))


(def wlp545-belgian-strong-ale-yeast
  (yeasts/build-yeasts :wlp545-belgian-strong-ale-yeast {:min-temperature 18.33
                                                         :name            "WLP545 Belgian Strong Ale Yeast"
                                                         :max-temperature 22.78
                                                         :type            "Ale"
                                                         :best-for        "Belgian dark strongs, Abbey ales and Christmas beers"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "From the Ardennes region of Belgium, this classic strain produces moderate esters and spicy phenolic character. Results in a dry but balanced finish. Use for dark or strong abbey ales."
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "WLP545"}))


(def wlp550-belgian-ale
  (yeasts/build-yeasts :wlp550-belgian-ale {:min-temperature 20.0
                                            :name            "WLP550 Belgian Ale"
                                            :max-temperature 25.56
                                            :type            "Ale"
                                            :best-for        "Belgian Ales, Saisons, Belgian Reds, Belgian Browns, White beers"
                                            :laboratory      "White Labs"
                                            :attenuation     0.765
                                            :notes           "Phenolic and spicy flavors. Complex profile, with less fruitiness than White's Trappist Ale strain."
                                            :flocculation    "Medium"
                                            :form            "Liquid"
                                            :product-id      "WLP550"}))


(def wlp565-belgian-saison-i-ale
  (yeasts/build-yeasts :wlp565-belgian-saison-i-ale {:min-temperature 20.0
                                                     :name            "WLP565 Belgian Saison I Ale"
                                                     :max-temperature 23.89
                                                     :type            "Ale"
                                                     :best-for        "Saison Ale, Belgian Ale, Dubbel, Trippel"
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "Saison yeast from Wallonia. Earthy, spicy and peppery notes. Slightly sweet."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP565"}))


(def wlp566-belgian-saison-ii-yeast
  (yeasts/build-yeasts :wlp566-belgian-saison-ii-yeast {:min-temperature 20.0
                                                        :name            "WLP566 Belgian Saison II Yeast"
                                                        :max-temperature 25.56
                                                        :type            "Ale"
                                                        :best-for        "Belgian or French Saison"
                                                        :laboratory      "White Labs"
                                                        :attenuation     0.765
                                                        :notes           "Saison strain with a more fruity ester profile than WLP565 (Belgian Saison I Yeast). Moderately phenolic with a clove-like characteristic in finished beer flavor and aroma. Ferments quickly."
                                                        :flocculation    "Medium"
                                                        :form            "Liquid"
                                                        :product-id      "WLP566"}))


(def wlp568-belgian-style-saison-ale-yeast-blend
  (yeasts/build-yeasts :wlp568-belgian-style-saison-ale-yeast-blend {:min-temperature 21.11
                                                                     :name            "WLP568 Belgian Style Saison Ale Yeast Blend"
                                                                     :max-temperature 26.67
                                                                     :type            "Ale"
                                                                     :best-for        "Belgian and French Saison"
                                                                     :laboratory      "White Labs"
                                                                     :attenuation     0.765
                                                                     :notes           "This blend melds Belgian style ale and Saison strains. The strains work in harmony to create complex, fruity aromas and flavors. The blend of yeast strains encourages complete fermentation in a timely manner. Phenolic, spicy, earthy, and clove like flavor"
                                                                     :flocculation    "Medium"
                                                                     :form            "Liquid"
                                                                     :product-id      "WLP568"}))


(def wlp570-belgian-golden-ale
  (yeasts/build-yeasts :wlp570-belgian-golden-ale {:min-temperature 20.0
                                                   :name            "WLP570 Belgian Golden Ale"
                                                   :max-temperature 23.89
                                                   :type            "Ale"
                                                   :best-for        "Belgian Ales, Dubbel, Grand Cru, Belgian Holiday Ale"
                                                   :laboratory      "White Labs"
                                                   :attenuation     0.765
                                                   :notes           "Combination of fruitiness and phenolic characters dominate the profile. Some sulfur which will dissapate following fermentation."
                                                   :flocculation    "Low"
                                                   :form            "Liquid"
                                                   :product-id      "WLP570"}))


(def wlp575-belgian-style-ale-yeast-blend
  (yeasts/build-yeasts :wlp575-belgian-style-ale-yeast-blend {:min-temperature 20.0
                                                              :name            "WLP575 Belgian Style Ale Yeast Blend"
                                                              :max-temperature 23.89
                                                              :type            "Ale"
                                                              :best-for        "Trappist and other Belgian ales."
                                                              :laboratory      "White Labs"
                                                              :attenuation     0.765
                                                              :notes           "Blend of two trappist ale yeasts and one Belgian ale yeast. Creates a versatile blend to be used for Trappist and other Belgian style ales."
                                                              :flocculation    "Medium"
                                                              :form            "Liquid"
                                                              :product-id      "WLP575"}))


(def wlp630-berliner-weisse-blend
  (yeasts/build-yeasts :wlp630-berliner-weisse-blend {:min-temperature 20.0
                                                      :name            "WLP630 Berliner Weisse Blend"
                                                      :max-temperature 22.22
                                                      :type            "Wheat"
                                                      :best-for        "Berliner Weisse"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "A blend of a traditional German Weizen yeast and Lactobacillus to create a subtle, tart, drinkable beer. Can take several months to develop tart character. Perfect for traditional Berliner Weisse."
                                                      :flocculation    "Medium"
                                                      :form            "Liquid"
                                                      :product-id      "WLP630"}))


(def wlp645-brettanomyces-claussenii
  (yeasts/build-yeasts :wlp645-brettanomyces-claussenii {:min-temperature 18.33
                                                         :name            "WLP645 Brettanomyces Claussenii"
                                                         :max-temperature 22.22
                                                         :type            "Ale"
                                                         :best-for        "Sour ales (in secondary)"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "Low intensity Brett character. Originally isolated from strong English stock beer, in the early 20th century. The Brett flavors produced are more subtle than WLP650 and WLP653. More aroma than flavor contribution. Fruity, pineapple like aroma."
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "WLP645"}))


(def wlp650-brettanomyces-bruxellensis
  (yeasts/build-yeasts :wlp650-brettanomyces-bruxellensis {:min-temperature 18.33
                                                           :name            "WLP650 Brettanomyces Bruxellensis"
                                                           :max-temperature 22.22
                                                           :type            "Ale"
                                                           :best-for        "Belgian sour ales and labics (in secondary)"
                                                           :laboratory      "White Labs"
                                                           :attenuation     0.765
                                                           :notes           "Medium intensity Brett character. Classic strain used in secondary fermentation for Belgian style beers and lambics. One Trappist brewery uses this strain in secondary fermentation."
                                                           :flocculation    "Medium"
                                                           :form            "Liquid"
                                                           :product-id      "WLP650"}))


(def wlp653-brettanomyces-lambicus
  (yeasts/build-yeasts :wlp653-brettanomyces-lambicus {:min-temperature 18.33
                                                       :name            "WLP653 Brettanomyces Lambicus"
                                                       :max-temperature 22.22
                                                       :type            "Ale"
                                                       :best-for        "Lambics and Flanders/Sour Brown ales"
                                                       :laboratory      "White Labs"
                                                       :attenuation     0.765
                                                       :notes           "Use in secondary. High intensity Brett character. Defines the \"Brett character\": Horsey, smoky and spicy flavors. As the name suggests, this strain is found most often in Lambic style beers, which are spontaneously fermented beers."
                                                       :flocculation    "Medium"
                                                       :form            "Liquid"
                                                       :product-id      "WLP653"}))


(def wlp655-belgian-sour-mix-1
  (yeasts/build-yeasts :wlp655-belgian-sour-mix-1 {:min-temperature 18.33
                                                   :name            "WLP655 Belgian Sour Mix 1"
                                                   :max-temperature 22.22
                                                   :type            "Ale"
                                                   :best-for        "Belgian sour beers (in secondary)"
                                                   :laboratory      "White Labs"
                                                   :attenuation     0.765
                                                   :notes           "Note: Bacteria to use in secondary only. A unique blend perfect for Belgian style beers. Includes Brettanomyces, Saccharomyces, and the bacterial strains Lactobacillus and Pediococcus."
                                                   :flocculation    "Medium"
                                                   :form            "Liquid"
                                                   :product-id      "WLP655"}))


(def wlp670-american-farmhouse-blend
  (yeasts/build-yeasts :wlp670-american-farmhouse-blend {:min-temperature 20.0
                                                         :name            "WLP670 American Farmhouse Blend"
                                                         :max-temperature 22.22
                                                         :type            "Ale"
                                                         :best-for        "Saisons, Farmhouse Ales"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "Inspired by local American brewers crafting semi- traditional Belgian-style ales. This blend creates a complex flavor profile with a moderate level of sourness. It consists of a traditional farmhouse yeast strain and Brettanomyces. Great yeast for farmho"
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "WLP670"}))


(def wlp675-malolactic-bacteria
  (yeasts/build-yeasts :wlp675-malolactic-bacteria {:min-temperature 18.33
                                                    :name            "WLP675 Malolactic Bacteria"
                                                    :max-temperature 22.22
                                                    :type            "Ale"
                                                    :best-for        "Primarily wine"
                                                    :laboratory      "White Labs"
                                                    :attenuation     0.765
                                                    :notes           "Bacteria for use in secondary. Malolactic fermentation is the conversion of malic acid to lactic acid by bacteria from the lactic acid bacteria family. Lactic acid is less acidic than malic acid, which in turn decreases acidity and helps to soften and/o"
                                                    :flocculation    "Medium"
                                                    :form            "Liquid"
                                                    :product-id      "WLP675"}))


(def wlp677-lactobacillus-bacteria
  (yeasts/build-yeasts :wlp677-lactobacillus-bacteria {:min-temperature 18.33
                                                       :name            "WLP677 Lactobacillus Bacteria"
                                                       :max-temperature 22.22
                                                       :type            "Ale"
                                                       :best-for        "Lambic, Berliner Weiss, Sour Brown and Gueze (secondary)"
                                                       :laboratory      "White Labs"
                                                       :attenuation     0.765
                                                       :notes           "Bacteria for use in secondary. This lactic acid bacteria produces moderate levels of acidity and sour flavors found in lambics, Berliner Weiss, sour brown ale and gueze."
                                                       :flocculation    "Medium"
                                                       :form            "Liquid"
                                                       :product-id      "WLP677"}))


(def wlp700-flor-sherry-yeast
  (yeasts/build-yeasts :wlp700-flor-sherry-yeast {:min-temperature 21.11
                                                  :name            "WLP700 Flor Sherry Yeast"
                                                  :max-temperature 24.44
                                                  :type            "Wine"
                                                  :best-for        "Sherry wine yeast"
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "This yeast develops a film (flor) on the surface of the wine. Creates green almond, granny smith and nougat characteristics found in sherry. Can also be used for Port, Madeira and other sweet styles. For use in secondary fermentation. Slow fermentor. Al"
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "WLP700"}))


(def wlp705-sake-yeast
  (yeasts/build-yeasts :wlp705-sake-yeast {:min-temperature 21.11
                                           :name            "WLP705 Sake Yeast"
                                           :max-temperature 24.44
                                           :type            "Wine"
                                           :best-for        "Sake wine yeast"
                                           :laboratory      "White Labs"
                                           :attenuation     0.765
                                           :notes           "For use in rice based fermentations. For sake, use this yeast in conjunction with Koji (to produce fermentable sugar). WLP705 produces full body sake character, and subtle fragrance. Alcohol tolerance to 16%."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "WLP705"}))


(def wlp715-champagne-yeast
  (yeasts/build-yeasts :wlp715-champagne-yeast {:min-temperature 21.11
                                                :name            "WLP715 Champagne Yeast"
                                                :max-temperature 23.89
                                                :type            "Champagne"
                                                :best-for        "Wine, Mead and Cider"
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Can tolerate alcohol up to 17%. For Barley Wine or Meads."
                                                :flocculation    "Low"
                                                :form            "Liquid"
                                                :product-id      "WLP715"}))


(def wlp718-avize-wine-yeast
  (yeasts/build-yeasts :wlp718-avize-wine-yeast {:min-temperature 15.56
                                                 :name            "WLP718 Avize Wine Yeast"
                                                 :max-temperature 32.22
                                                 :type            "Wine"
                                                 :best-for        "Chardonnay"
                                                 :laboratory      "White Labs"
                                                 :attenuation     0.765
                                                 :notes           "Champagne isolate used for complexity in whites. Contributes elegance, especially in barrel fermented Chardonnays. Alcohol tolerance to 15%."
                                                 :flocculation    "Medium"
                                                 :form            "Liquid"
                                                 :product-id      "WLP718"}))


(def wlp720-sweet-mead-wine
  (yeasts/build-yeasts :wlp720-sweet-mead-wine {:min-temperature 21.11
                                                :name            "WLP720 Sweet Mead/Wine"
                                                :max-temperature 23.89
                                                :type            "Wine"
                                                :best-for        "Sweet Mead, Wine and Cider"
                                                :laboratory      "White Labs"
                                                :attenuation     0.765
                                                :notes           "Lower attenuation than White Labs Champagne Yeast. Leaves some residual sweetness as well as fruity flavor. Alcohol concentration up to 15%."
                                                :flocculation    "Low"
                                                :form            "Liquid"
                                                :product-id      "WLP720"}))


(def wlp727-steinberg-geisenheim-wine
  (yeasts/build-yeasts :wlp727-steinberg-geisenheim-wine {:min-temperature 10.0
                                                          :name            "WLP727 Steinberg-Geisenheim Wine"
                                                          :max-temperature 32.22
                                                          :type            "Wine"
                                                          :best-for        "Riesling wines."
                                                          :laboratory      "White Labs"
                                                          :attenuation     0.765
                                                          :notes           "German origin wine yeast. High fruit/ester production. Moderate fermentation characteristics and cold tolerant."
                                                          :flocculation    "Low"
                                                          :form            "Liquid"
                                                          :product-id      "WLP727"}))


(def wlp730-chardonnay-white-wine-yeast
  (yeasts/build-yeasts :wlp730-chardonnay-white-wine-yeast {:min-temperature 10.0
                                                            :name            "WLP730 Chardonnay White Wine Yeast"
                                                            :max-temperature 32.22
                                                            :type            "Wine"
                                                            :best-for        "Chardonnay Wine"
                                                            :laboratory      "White Labs"
                                                            :attenuation     0.765
                                                            :notes           "Dry wine yeast. Slight ester production, low sulfur dioxide production. Enhances varietal character. WLP730 is a good choice for all white and blush wines, including Chablis, Chenin Blanc, Semillon, and Sauvignon Blanc. Fermentation speed is moderate. Al"
                                                            :flocculation    "Low"
                                                            :form            "Liquid"
                                                            :product-id      "WLP730"}))


(def wlp735-french-white-wine-yeast
  (yeasts/build-yeasts :wlp735-french-white-wine-yeast {:min-temperature 15.56
                                                        :name            "WLP735 French White Wine Yeast"
                                                        :max-temperature 32.22
                                                        :type            "Wine"
                                                        :best-for        "French white wines"
                                                        :laboratory      "White Labs"
                                                        :attenuation     0.765
                                                        :notes           "Classic yeast for white wine fermentation. Slow to moderate fermenter and foam producer. Gives an enhanced creamy texture. Alcohol Tolerance: 16%"
                                                        :flocculation    "Low"
                                                        :form            "Liquid"
                                                        :product-id      "WLP735"}))


(def wlp740-merlot-red-wine-yeast
  (yeasts/build-yeasts :wlp740-merlot-red-wine-yeast {:min-temperature 15.56
                                                      :name            "WLP740 Merlot Red Wine Yeast"
                                                      :max-temperature 32.22
                                                      :type            "Wine"
                                                      :best-for        "Merlot, Shiraz, Pinot Noir, Chardonnay, Cabernet, Sauvignon Blanc, and Semillon"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "Neutral, low fusel alcohol production. Will ferment to dryness, alcohol tolerance to 18%. Vigorous fermenter. WLP740 is well suited for Merlot, Shiraz, Pinot Noir, Chardonnay, Cabernet, Sauvignon Blanc, and Semillon. Alcohol Tolerance: 18%"
                                                      :flocculation    "Low"
                                                      :form            "Liquid"
                                                      :product-id      "WLP740"}))


(def wlp749-assmanshausen-wine-yeast
  (yeasts/build-yeasts :wlp749-assmanshausen-wine-yeast {:min-temperature 10.0
                                                         :name            "WLP749 Assmanshausen Wine Yeast"
                                                         :max-temperature 32.22
                                                         :type            "Wine"
                                                         :best-for        "Pinot Noir and Zinfandel"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "German red wine yeast, which results in spicy, fruit aromas. Perfect for Pinot Noir and Zinfandel. Slow to moderate fermenter which is cold tolerant. Alcohol Tolerance: 16%"
                                                         :flocculation    "Low"
                                                         :form            "Liquid"
                                                         :product-id      "WLP749"}))


(def wlp750-french-red-wine-yeast
  (yeasts/build-yeasts :wlp750-french-red-wine-yeast {:min-temperature 15.56
                                                      :name            "WLP750 French Red Wine Yeast"
                                                      :max-temperature 32.22
                                                      :type            "Wine"
                                                      :best-for        "Bordeaux"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "Classic Bordeaux yeast for red wine fermentations. Moderate fermentation characteristics. Tolerates lower fermentation temperatures. Rich, smooth flavor profile. Alcohol Tolerance: 17%"
                                                      :flocculation    "Low"
                                                      :form            "Liquid"
                                                      :product-id      "WLP750"}))


(def wlp760-cabernet-red-wine-yeast
  (yeasts/build-yeasts :wlp760-cabernet-red-wine-yeast {:min-temperature 15.56
                                                        :name            "WLP760 Cabernet Red Wine Yeast"
                                                        :max-temperature 32.22
                                                        :type            "Wine"
                                                        :best-for        "Merlot, Chardonnay, Chianti, Chenin Blanc, and Sauvignon Blanc"
                                                        :laboratory      "White Labs"
                                                        :attenuation     0.765
                                                        :notes           "High temperature tolerance. Moderate fermentation speed. Excellent for full-bodied red wines, ester production complements flavor. WLP760 is also suitable for Merlot, Chardonnay, Chianti, Chenin Blanc, and Sauvignon Blanc. Alcohol Tolerance: 16%"
                                                        :flocculation    "Low"
                                                        :form            "Liquid"
                                                        :product-id      "WLP760"}))


(def wlp770-suremain-burgundy-wine-yeast
  (yeasts/build-yeasts :wlp770-suremain-burgundy-wine-yeast {:min-temperature 15.56
                                                             :name            "WLP770 Suremain Burgundy Wine Yeast"
                                                             :max-temperature 32.22
                                                             :type            "Wine"
                                                             :best-for        "Burgundy"
                                                             :laboratory      "White Labs"
                                                             :attenuation     0.765
                                                             :notes           "Emphasizes fruit aromas in barrel fermentations. High nutrient requirement to avoid volatile acidity production. Alcohol Tolerance: 16%"
                                                             :flocculation    "Low"
                                                             :form            "Liquid"
                                                             :product-id      "WLP770"}))


(def wlp775-english-cider-yeast
  (yeasts/build-yeasts :wlp775-english-cider-yeast {:min-temperature 20.0
                                                    :name            "WLP775 English Cider Yeast"
                                                    :max-temperature 23.89
                                                    :type            "Wine"
                                                    :best-for        "Cider, Wine and High Gravity Beer"
                                                    :laboratory      "White Labs"
                                                    :attenuation     0.765
                                                    :notes           "Classic Cider yeast. Ferments dry, but retains apple flavor. Some sulfer produced during fermentation will fade with age."
                                                    :flocculation    "Medium"
                                                    :form            "Liquid"
                                                    :product-id      "WLP775"}))


(def wlp800-pilsner-lager
  (yeasts/build-yeasts :wlp800-pilsner-lager {:min-temperature 10.0
                                              :name            "WLP800 Pilsner Lager"
                                              :max-temperature 12.78
                                              :type            "Lager"
                                              :best-for        "European Pilsners, Bohemian Pilsner"
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "Classic pilsner strain from Czech Republic. Dry with a malty finish."
                                              :flocculation    "High"
                                              :form            "Liquid"
                                              :product-id      "WLP800"}))


(def wlp802-czech-budejovice-lager
  (yeasts/build-yeasts :wlp802-czech-budejovice-lager {:min-temperature 10.0
                                                       :name            "WLP802 Czech Budejovice Lager"
                                                       :max-temperature 12.78
                                                       :type            "Lager"
                                                       :best-for        "Bohemian Style Pilsner"
                                                       :laboratory      "White Labs"
                                                       :attenuation     0.765
                                                       :notes           "Dry and crisp with low diacetyl production. From Southern Czech Republic."
                                                       :flocculation    "Medium"
                                                       :form            "Liquid"
                                                       :product-id      "WLP802"}))


(def wlp810-san-francisco-lager
  (yeasts/build-yeasts :wlp810-san-francisco-lager {:min-temperature 14.44
                                                    :name            "WLP810 San Francisco Lager"
                                                    :max-temperature 18.33
                                                    :type            "Lager"
                                                    :best-for        "California and Premium Lagers, all American Lagers"
                                                    :laboratory      "White Labs"
                                                    :attenuation     0.765
                                                    :notes           "Produces \"California Common\"style beer."
                                                    :flocculation    "High"
                                                    :form            "Liquid"
                                                    :product-id      "WLP810"}))


(def wlp815-belgian-lager-yeast
  (yeasts/build-yeasts :wlp815-belgian-lager-yeast {:min-temperature 10.0
                                                    :name            "WLP815 Belgian Lager Yeast"
                                                    :max-temperature 12.78
                                                    :type            "Lager"
                                                    :best-for        "European style pilsners, dark lagers, Vienna lager, and American style lagers"
                                                    :laboratory      "White Labs"
                                                    :attenuation     0.765
                                                    :notes           "Clean, crisp European lager yeast with low sulfur production. The strain originates from a very old brewery in West Belgium. Great for European style pilsners, dark lagers, Vienna lager, and American style lagers. "
                                                    :flocculation    "Medium"
                                                    :form            "Liquid"
                                                    :product-id      "WLP815"}))


(def wlp820-octoberfest-marzen-lager
  (yeasts/build-yeasts :wlp820-octoberfest-marzen-lager {:min-temperature 11.11
                                                         :name            "WLP820 Octoberfest/Marzen Lager"
                                                         :max-temperature 14.44
                                                         :type            "Lager"
                                                         :best-for        "Marzen, Oktoberfest, European Lagers, Bocks, Munich Helles"
                                                         :laboratory      "White Labs"
                                                         :attenuation     0.765
                                                         :notes           "Produces a malty, bock style beer. Does not finish as dry or as fast as White's German Lager yeast. Longer lagering or starter recommended."
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "WLP820"}))


(def wlp830-german-lager
  (yeasts/build-yeasts :wlp830-german-lager {:min-temperature 10.0
                                             :name            "WLP830 German Lager"
                                             :max-temperature 12.78
                                             :type            "Lager"
                                             :best-for        "German Marzen, Pilsner, Lagers, Oktoberfest beers."
                                             :laboratory      "White Labs"
                                             :attenuation     0.765
                                             :notes           "Very malty and clean. One of the world's most popular lager yeasts."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "WLP830"}))


(def wlp833-german-bock-lager
  (yeasts/build-yeasts :wlp833-german-bock-lager {:min-temperature 8.89
                                                  :name            "WLP833 German Bock Lager"
                                                  :max-temperature 12.78
                                                  :type            "Lager"
                                                  :best-for        "Bocks, Doppelbocks, Oktoberfest, Vienna, Helles, some American Pilsners"
                                                  :laboratory      "White Labs"
                                                  :attenuation     0.765
                                                  :notes           "Produces beer that has balanced malt and hop character. From Southern Bavaria."
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "WLP833"}))


(def wlp838-southern-german-lager
  (yeasts/build-yeasts :wlp838-southern-german-lager {:min-temperature 10.0
                                                      :name            "WLP838 Southern German Lager"
                                                      :max-temperature 12.78
                                                      :type            "Lager"
                                                      :best-for        "German Pilsner, Helles, Oktoberfest, Marzen, Bocks"
                                                      :laboratory      "White Labs"
                                                      :attenuation     0.765
                                                      :notes           "Malty finish and balanced aroma. Strong fermenter, slight sulfur and low diacetyl."
                                                      :flocculation    "High"
                                                      :form            "Liquid"
                                                      :product-id      "WLP838"}))


(def wlp840-american-lager-yeast
  (yeasts/build-yeasts :wlp840-american-lager-yeast {:min-temperature 10.0
                                                     :name            "WLP840 American Lager Yeast"
                                                     :max-temperature 12.78
                                                     :type            "Lager"
                                                     :best-for        "All American Style Lagers -- both light and dark."
                                                     :laboratory      "White Labs"
                                                     :attenuation     0.765
                                                     :notes           "Dry and clean with very slight apple fruitiness. Minimal sulfer and diacetyl."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "WLP840"}))


(def wlp860-munich-helles
  (yeasts/build-yeasts :wlp860-munich-helles {:min-temperature 8.89
                                              :name            "WLP860 Munich Helles"
                                              :max-temperature 11.11
                                              :type            "Ale"
                                              :best-for        "Munich Helles, Oktoberfest"
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "Possible Augustiner Strain? This yeast helps to produce a malty, but balanced traditional Munich-style lager. Clean and strong fermenter, it's great for a variety of lager styles ranging from Helles to Rauchbier."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "WLP860"}))


(def wlp862-cry-havoc
  (yeasts/build-yeasts :wlp862-cry-havoc {:min-temperature 20.0
                                          :name            "WLP862 Cry Havoc"
                                          :max-temperature 23.33
                                          :type            "Lager"
                                          :best-for        "All American Style Lagers -- both light and dark."
                                          :laboratory      "White Labs"
                                          :attenuation     0.765
                                          :notes           "Licensed by White Labs from Charlie Papazian, author of \"The Complete Joy of Home Brewing\". This yeast was used to brew many of his original recipes. Diverse strain can ferment at ale and lager temps."
                                          :flocculation    "Medium"
                                          :form            "Liquid"
                                          :product-id      "WLP862"}))


(def wlp885-zurich-lager
  (yeasts/build-yeasts :wlp885-zurich-lager {:min-temperature 10.0
                                             :name            "WLP885 Zurich Lager"
                                             :max-temperature 12.78
                                             :type            "Lager"
                                             :best-for        "Swiss style lager, and high gravity lagers (over 11% ABV)"
                                             :laboratory      "White Labs"
                                             :attenuation     0.765
                                             :notes           "Swiss style lager yeast. Sulfer and diacetyl production is minimal. May be used for high gravity lagers with proper care."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "WLP885"}))


(def wlp920-old-bavarian-lager
  (yeasts/build-yeasts :wlp920-old-bavarian-lager {:min-temperature 10.0
                                                   :name            "WLP920 Old Bavarian Lager"
                                                   :max-temperature 12.78
                                                   :type            "Lager"
                                                   :best-for        "Oktoberfest, Marzen, Bock and Dark Lagers."
                                                   :laboratory      "White Labs"
                                                   :attenuation     0.765
                                                   :notes           "Southern Germany/Bavarian lager yeast. Finishes malty with a slight ester profile."
                                                   :flocculation    "Medium"
                                                   :form            "Liquid"
                                                   :product-id      "WLP920"}))


(def wlp940-mexican-lager
  (yeasts/build-yeasts :wlp940-mexican-lager {:min-temperature 10.0
                                              :name            "WLP940 Mexican Lager"
                                              :max-temperature 12.78
                                              :type            "Lager"
                                              :best-for        "Mexican style light and dark lagers."
                                              :laboratory      "White Labs"
                                              :attenuation     0.765
                                              :notes           "From Mexico City - produces a clean lager beer with a crisp finish. Good for mexican style beers."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "WLP940"}))


(def white-labs
  (merge wlp001-california-ale wlp002-english-ale wlp003-german-ale-ii wlp004-irish-ale-yeast wlp005-british-ale wlp006-bedford-british-ale wlp007-dry-english-ale
         wlp008-east-coast-ale wlp009-australian-ale-yeast wlp011-european-ale wlp013-london-ale wlp022-essex-ale-yeast wlp023-burton-ale wlp025-southwold-ale
         wlp026-premium-bitter-ale wlp028-edinburgh-ale wlp029-german-ale-kolsch wlp033-klassic-ale-yeast wlp036-dusseldorf-alt-yeast wlp037-yorkshire-square-ale-yeast
         wlp038-manchester-ale-yeast wlp039-nottingham-ale-yeast wlp041-pacific-ale wlp051-california-ale-v wlp060-american-ale-yeast-blend wlp080-cream-ale-yeast-blend
         wlp090-san-diego-super-yeast wlp099-super-high-gravity-ale wlp300-hefeweizen-ale wlp320-american-hefeweizen-ale wlp351-bavarian-weizen-yeast wlp380-hefeweizen-iv-ale
         wlp400-belgian-wit-ale wlp410-belgian-wit-ii wlp500-trappist-ale wlp510-bastogne-belgian-ale wlp515-antwerp-ale-yeast wlp530-abbey-ale wlp540-abbey-iv-ale-yeast
         wlp545-belgian-strong-ale-yeast wlp550-belgian-ale wlp565-belgian-saison-i-ale wlp566-belgian-saison-ii-yeast wlp568-belgian-style-saison-ale-yeast-blend
         wlp570-belgian-golden-ale wlp575-belgian-style-ale-yeast-blend wlp630-berliner-weisse-blend wlp645-brettanomyces-claussenii wlp650-brettanomyces-bruxellensis
         wlp653-brettanomyces-lambicus wlp655-belgian-sour-mix-1 wlp670-american-farmhouse-blend wlp675-malolactic-bacteria wlp677-lactobacillus-bacteria
         wlp700-flor-sherry-yeast wlp705-sake-yeast wlp715-champagne-yeast wlp718-avize-wine-yeast wlp720-sweet-mead-wine wlp727-steinberg-geisenheim-wine
         wlp730-chardonnay-white-wine-yeast wlp735-french-white-wine-yeast wlp740-merlot-red-wine-yeast wlp749-assmanshausen-wine-yeast
         wlp750-french-red-wine-yeast wlp760-cabernet-red-wine-yeast wlp770-suremain-burgundy-wine-yeast wlp775-english-cider-yeast
         wlp800-pilsner-lager wlp802-czech-budejovice-lager wlp810-san-francisco-lager wlp815-belgian-lager-yeast wlp820-octoberfest-marzen-lager
         wlp830-german-lager wlp833-german-bock-lager wlp838-southern-german-lager wlp840-american-lager-yeast wlp860-munich-helles wlp862-cry-havoc
         wlp885-zurich-lager wlp920-old-bavarian-lager wlp940-mexican-lager))
