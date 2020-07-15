(ns common-beer-format.data.yeasts.wyeast
  "Data for yeasts cultivated by Wyeast"
  (:require [common-beer-format.data.yeasts.yeasts :as yeasts]))

(def german-ale-1007
  (yeasts/build-yeasts :german-ale-1007 {:min-temperature 12.78
                                         :name            "1007 German Ale"
                                         :max-temperature 18.89
                                         :type            "Ale"
                                         :best-for        "German Ales, Alts, Kolsch, Dry Stout"
                                         :laboratory      "Wyeast"
                                         :attenuation     0.765
                                         :notes           "Crisp, dry finish with a mild flavor."
                                         :flocculation    "Low"
                                         :form            "Liquid"
                                         :product-id      "1007"}))

(def american-wheat-ale-1010
  (yeasts/build-yeasts :american-wheat-ale-1010 {:min-temperature 14.44
                                                 :name            "1010 American Wheat Ale"
                                                 :max-temperature 23.33
                                                 :type            "Ale"
                                                 :best-for        "American Wheat, Berlin Weiss, Hefeweizen"
                                                 :laboratory      "Wyeast"
                                                 :attenuation     0.765
                                                 :notes           "Dry, Crisp, tart beer in the American Hefeweizen style. Low flocculation aids in producing desired chill haze."
                                                 :flocculation    "Low"
                                                 :form            "Liquid"
                                                 :product-id      "1010"}))

(def british-cask-ale-1026
  (yeasts/build-yeasts :british-cask-ale-1026 {:min-temperature 17.22
                                               :name            "1026 British Cask Ale"
                                               :max-temperature 22.22
                                               :type            "Ale"
                                               :best-for        "British Ales"
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "A great choice for any cask conditioned British Ale. Produces nice malt profile with a hint of fruit. Finishes dry and slightly tart. "
                                               :flocculation    "Medium"
                                               :form            "Liquid"
                                               :product-id      "1026"}))

(def london-ale-yeast-1028
  (yeasts/build-yeasts :london-ale-yeast-1028 {:min-temperature 15.56
                                               :name            "1028 London Ale Yeast"
                                               :max-temperature 22.22
                                               :type            "Ale"
                                               :best-for        "English Ales, Bitters, IPAs, Brown Ale"
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "Dry finish, bold, rich flavor, some fruit profile and a crisp finish."
                                               :flocculation    "Medium"
                                               :form            "Liquid"
                                               :product-id      "1028"}))

(def american-ale-1056
  (yeasts/build-yeasts :american-ale-1056 {:min-temperature 15.56
                                           :name            "1056 American Ale"
                                           :max-temperature 22.22
                                           :type            "Ale"
                                           :best-for        "American Pale Ale, Scottish Ale, Porters, Sweet Stout, Barley Wine, Alt"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Soft, smooth, clean finish. Very well balanced. Very versitile -- works well with many ale styles."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "1056"}))

(def irish-ale-1084
  (yeasts/build-yeasts :irish-ale-1084 {:min-temperature 16.67
                                        :name            "1084 Irish Ale"
                                        :max-temperature 22.22
                                        :type            "Ale"
                                        :best-for        "Irish Dry Stouts, Porter, Scottish Ale, Brown Ale, Imperial Stout, Barley Wine"
                                        :laboratory      "Wyeast"
                                        :attenuation     0.765
                                        :notes           "Dry diacetyl, fruity flavor characteristic of stouts. Full bodied, dry, clean flavor."
                                        :flocculation    "Medium"
                                        :form            "Liquid"
                                        :product-id      "1084"}))

(def wyeast-ale-blend-1087
  (yeasts/build-yeasts :wyeast-ale-blend-1087 {:min-temperature 17.78
                                               :name            "1087 Wyeast Ale Blend"
                                               :max-temperature 22.22
                                               :type            "Ale"
                                               :best-for        "American and British Ale Styles."
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "Blend of ale strains designed to provide quick starts, good flavor, balance and flocculation. Balanced finish suitable for most American and British ale styles."
                                               :flocculation    "Medium"
                                               :form            "Liquid"
                                               :product-id      "1087"}))

(def british-ale-yeast-1098
  (yeasts/build-yeasts :british-ale-yeast-1098 {:min-temperature 17.78
                                                :name            "1098 British Ale Yeast"
                                                :max-temperature 22.22
                                                :type            "Ale"
                                                :best-for        "All British Ales, Pales, Bitters, English Strong Ale"
                                                :laboratory      "Wyeast"
                                                :attenuation     0.765
                                                :notes           "Fruity, tart, dry crisp finish. Very well balanced."
                                                :flocculation    "Medium"
                                                :form            "Liquid"
                                                :product-id      "1098"}))

(def whitbread-ale-1099
  (yeasts/build-yeasts :whitbread-ale-1099 {:min-temperature 17.78
                                            :name            "1099 Whitbread Ale"
                                            :max-temperature 23.89
                                            :type            "Ale"
                                            :best-for        "Whitbread Ale, British Ales, Pales, Bitters"
                                            :laboratory      "Wyeast"
                                            :attenuation     0.765
                                            :notes           "Slightly more fruity and malty than Wyeast's British Ale. Clear and highly flocculant."
                                            :flocculation    "High"
                                            :form            "Liquid"
                                            :product-id      "1099"}))

(def ringwood-ale-1187
  (yeasts/build-yeasts :ringwood-ale-1187 {:min-temperature 17.78
                                           :name            "1187 Ringwood Ale"
                                           :max-temperature 23.33
                                           :type            "Ale"
                                           :best-for        "Ringwood Ale, Brown Ales"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "European ale yeast. Highly flocculant with complex, clear, but malty profile. Slightly fruity ester."
                                           :flocculation    "High"
                                           :form            "Liquid"
                                           :product-id      "1187"}))

(def belgian-ale-yeast-1214
  (yeasts/build-yeasts :belgian-ale-yeast-1214 {:min-temperature 14.44
                                                :name            "1214 Belgian Ale Yeast"
                                                :max-temperature 20.0
                                                :type            "Ale"
                                                :best-for        "Belgian Ales, Abbey Ales, Trappist Ales"
                                                :laboratory      "Wyeast"
                                                :attenuation     0.765
                                                :notes           "Trappist style ale yeast. Complex estery flavor."
                                                :flocculation    "Medium"
                                                :form            "Liquid"
                                                :product-id      "1214"}))

(def american-ale-ii-1272
  (yeasts/build-yeasts :american-ale-ii-1272 {:min-temperature 15.56
                                              :name            "1272 American Ale II"
                                              :max-temperature 22.22
                                              :type            "Ale"
                                              :best-for        "All American Ales, Brown Ales, Barley Wine"
                                              :laboratory      "Wyeast"
                                              :attenuation     0.765
                                              :notes           "Clean, tart, nutty flavor. More fruity than Wyeast American Ale yeast."
                                              :flocculation    "High"
                                              :form            "Liquid"
                                              :product-id      "1272"}))

(def gf-all-american-ale-1272
  (yeasts/build-yeasts :gf-all-american-ale-1272 {:min-temperature 15.56
                                                  :name            "1272 GF All American Ale"
                                                  :max-temperature 22.22
                                                  :type            "Ale"
                                                  :best-for        "American Amber, Brown, IPA, Pale ales and stouts. Blondes and fruit beers."
                                                  :laboratory      "Wyeast"
                                                  :attenuation     0.765
                                                  :notes           "Popular all purpose American ale style now in a Gluten Free strain. Produces beers that are nutty, clean with a slight tart finish. Ferment warmer to accentuate hops and add fruitiness or ferment cold for clean light citrus character."
                                                  :flocculation    "High"
                                                  :form            "Liquid"
                                                  :product-id      "1272"}))

(def thames-valley-ale-1275
  (yeasts/build-yeasts :thames-valley-ale-1275 {:min-temperature 16.67
                                                :name            "1275 Thames Valley Ale"
                                                :max-temperature 22.22
                                                :type            "Ale"
                                                :best-for        "British Bitters, ESB, India Pale Ale, English Strong Ale"
                                                :laboratory      "Wyeast"
                                                :attenuation     0.765
                                                :notes           "Clean, complex flavor. Low in fruit, low in esters, rich in flavor. Hops come through well."
                                                :flocculation    "Medium"
                                                :form            "Liquid"
                                                :product-id      "1275"}))

(def london-ale-iii-1318
  (yeasts/build-yeasts :london-ale-iii-1318 {:min-temperature 17.78
                                             :name            "1318 London Ale III"
                                             :max-temperature 23.33
                                             :type            "Ale"
                                             :best-for        "British Ales, Bitters"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Light, fruity flavor. Balanced flavor with hint of sweetness."
                                             :flocculation    "High"
                                             :form            "Liquid"
                                             :product-id      "1318"}))

(def northwest-ale-1332
  (yeasts/build-yeasts :northwest-ale-1332 {:min-temperature 18.33
                                            :name            "1332 Northwest Ale"
                                            :max-temperature 23.89
                                            :type            "Ale"
                                            :best-for        "Oregon Ales, All American Ale styles"
                                            :laboratory      "Wyeast"
                                            :attenuation     0.765
                                            :notes           "Classic Northwest US ale yeast. Slight fruit flavor, malty ale with good body and balance."
                                            :flocculation    "High"
                                            :form            "Liquid"
                                            :product-id      "1332"}))

(def british-ale-ii-1335
  (yeasts/build-yeasts :british-ale-ii-1335 {:min-temperature 17.22
                                             :name            "1335 British Ale II"
                                             :max-temperature 23.89
                                             :type            "Ale"
                                             :best-for        "British and Canadian Ales, English Bitters"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Malty, clean, crisp finish. Dry flavor."
                                             :flocculation    "High"
                                             :form            "Liquid"
                                             :product-id      "1335"}))

(def european-ale-yeast-1338
  (yeasts/build-yeasts :european-ale-yeast-1338 {:min-temperature 16.67
                                                 :name            "1338 European Ale Yeast"
                                                 :max-temperature 22.22
                                                 :type            "Ale"
                                                 :best-for        "European Ales, German Ales, Alts, Pale Ale, Brown Ale, Kolsch"
                                                 :laboratory      "Wyeast"
                                                 :attenuation     0.765
                                                 :notes           "Very malty flavor characteristic of Bavarian/Munich Ales. Complex character."
                                                 :flocculation    "High"
                                                 :form            "Liquid"
                                                 :product-id      "1338"}))

(def belgian-strong-ale-1388
  (yeasts/build-yeasts :belgian-strong-ale-1388 {:min-temperature 18.33
                                                 :name            "1388 Belgian Strong Ale"
                                                 :max-temperature 23.89
                                                 :type            "Ale"
                                                 :best-for        "Belgian Ales, Scottish Strong Ale,Trappist Ales, Dubbels, Trippels"
                                                 :laboratory      "Wyeast"
                                                 :attenuation     0.765
                                                 :notes           "Dry, tart, fruity flavor. High alcohol tolerance."
                                                 :flocculation    "Low"
                                                 :form            "Liquid"
                                                 :product-id      "1388"}))

(def denny-s-favorite-50-1450
  (yeasts/build-yeasts :denny-s-favorite-50-1450 {:min-temperature 15.56
                                                  :name            "1450 Denny's Favorite 50"
                                                  :max-temperature 21.11
                                                  :type            "Ale"
                                                  :best-for        "almost any style"
                                                  :laboratory      "Wyeast"
                                                  :attenuation     0.765
                                                  :notes           "This terrific all-round yeast can be used for almost any beer style, and is a mainstay of one of our local homebrewers, Mr. Denny Conn. It is unique in that it produces a big mouthfeel and accentuates the malt, caramel, or fruit character of a beer without being sweet or under-attenuated. "
                                                  :flocculation    "Low"
                                                  :form            "Liquid"
                                                  :product-id      "1450"}))

(def scottish-ale-1728
  (yeasts/build-yeasts :scottish-ale-1728 {:min-temperature 12.78
                                           :name            "1728 Scottish Ale"
                                           :max-temperature 23.89
                                           :type            "Ale"
                                           :best-for        "Scottish Ale, Scottish Strong Ales, Sweet Stout, Imperial Stout, Barley Wine"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "High alcohol tolerance."
                                           :flocculation    "High"
                                           :form            "Liquid"
                                           :product-id      "1728"}))

(def belgian-abbey-ii-1762
  (yeasts/build-yeasts :belgian-abbey-ii-1762 {:min-temperature 18.33
                                               :name            "1762 Belgian Abbey II"
                                               :max-temperature 23.89
                                               :type            "Ale"
                                               :best-for        "Belgian Ales, Trappist Ales, Abbey Ales, Grand Cru"
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "Dry flavor with slight fruitiness. High alcohol tolerance."
                                               :flocculation    "Medium"
                                               :form            "Liquid"
                                               :product-id      "1762"}))

(def london-esb-ale-1968
  (yeasts/build-yeasts :london-esb-ale-1968 {:min-temperature 17.78
                                             :name            "1968 London ESB Ale"
                                             :max-temperature 22.22
                                             :type            "Ale"
                                             :best-for        "English Bitters, IPA, Brown Ales, Mild Ales"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Malty, balanced flavor. Fruity, rich finish. Excellent for cask conditioned ales and bitters."
                                             :flocculation    "High"
                                             :form            "Liquid"
                                             :product-id      "1968"}))

(def budvar-lager-2000
  (yeasts/build-yeasts :budvar-lager-2000 {:min-temperature 7.78
                                           :name            "2000 Budvar Lager"
                                           :max-temperature 13.33
                                           :type            "Lager"
                                           :best-for        "Bohemian Pilsner, Classic Pilsners, Dortmunder and Light Lagers"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Classic pilsner lager yeast. Malty nose and subtle fruit. Rich malt profile, but dry crisp finish. Hop character accentuated by dry finish."
                                           :flocculation    "High"
                                           :form            "Liquid"
                                           :product-id      "2000"}))

(def urquell-lager-2001
  (yeasts/build-yeasts :urquell-lager-2001 {:min-temperature 8.89
                                            :name            "2001 Urquell Lager"
                                            :max-temperature 14.44
                                            :type            "Lager"
                                            :best-for        "Bohemian Pilsner"
                                            :laboratory      "Wyeast"
                                            :attenuation     0.765
                                            :notes           "Pilsner Urquell yeast with mild fruit/floral aroma. Very dry and clean on palate with full mouth feel. Subtle malt character. Clean and neutral finish."
                                            :flocculation    "Medium"
                                            :form            "Liquid"
                                            :product-id      "2001"}))

(def pilsen-lager-2007
  (yeasts/build-yeasts :pilsen-lager-2007 {:min-temperature 8.89
                                           :name            "2007 Pilsen Lager"
                                           :max-temperature 13.33
                                           :type            "Lager"
                                           :best-for        "American Pilsner, Bohemian Pilsner, Light Lagers"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Classic American pilsner strain. Smooth with a malty flavor. Dry and crisp fermentation."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "2007"}))

(def american-lager-2035
  (yeasts/build-yeasts :american-lager-2035 {:min-temperature 8.89
                                             :name            "2035 American Lager"
                                             :max-temperature 14.44
                                             :type            "Lager"
                                             :best-for        "American Lagers and Pilsners"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Bold, with a complex aroma. Good flavor depth characteristics for a wide variety of lager beers."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "2035"}))

(def danish-lager-2042
  (yeasts/build-yeasts :danish-lager-2042 {:min-temperature 7.78
                                           :name            "2042 Danish Lager"
                                           :max-temperature 13.33
                                           :type            "Lager"
                                           :best-for        "Dortmund/Export Lagers"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Rich, Dortmund style, with a crisp, dry finish. Soft profile accentuates hop flavor."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "2042"}))

(def california-lager-2112
  (yeasts/build-yeasts :california-lager-2112 {:min-temperature 14.44
                                               :name            "2112 California Lager"
                                               :max-temperature 20.0
                                               :type            "Lager"
                                               :best-for        "California common beers, Steam Beer"
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "Suited for 19th century California style beers. Lagers at high temperature and produces malty, clear beers."
                                               :flocculation    "High"
                                               :form            "Liquid"
                                               :product-id      "2112"}))

(def bohemian-lager-2124
  (yeasts/build-yeasts :bohemian-lager-2124 {:min-temperature 8.89
                                             :name            "2124 Bohemian Lager"
                                             :max-temperature 14.44
                                             :type            "Lager"
                                             :best-for        "Bohemian Pilsners, Pilsners, German Helles, Bocks"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Ferments clean and malty, with rich malty flavor for full gravity pilsners."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "2124"}))

(def wyeast-lager-blend-2178
  (yeasts/build-yeasts :wyeast-lager-blend-2178 {:min-temperature 8.89
                                                 :name            "2178 Wyeast Lager Blend"
                                                 :max-temperature 14.44
                                                 :type            "Lager"
                                                 :best-for        "Classic Pilsners, Lagers, Bocks."
                                                 :laboratory      "Wyeast"
                                                 :attenuation     0.765
                                                 :notes           "Blend of lager strains to produce a complex but clean lager flavor profile. Suitable for many common lager styles."
                                                 :flocculation    "Medium"
                                                 :form            "Liquid"
                                                 :product-id      "2178"}))

(def bavarian-lager-2206
  (yeasts/build-yeasts :bavarian-lager-2206 {:min-temperature 7.78
                                             :name            "2206 Bavarian Lager"
                                             :max-temperature 14.44
                                             :type            "Lager"
                                             :best-for        "German Bocks, Vienna, Oktoberfest, Hells, Marzens, Dunkel"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Use by many German breweries. Produces a full-bodied, rich, malty beer."
                                             :flocculation    "Medium"
                                             :form            "Liquid"
                                             :product-id      "2206"}))

(def european-lager-ii-2247
  (yeasts/build-yeasts :european-lager-ii-2247 {:min-temperature 7.78
                                                :name            "2247 European Lager II"
                                                :max-temperature 13.33
                                                :type            "Lager"
                                                :best-for        "Bohemian Pilsner, American Pilsner, Helles, Dunkel"
                                                :laboratory      "Wyeast"
                                                :attenuation     0.765
                                                :notes           "Clean, dry flavor profile for aggressively hopped pilsners. Dry finish, mild aroma, slight sulfur production."
                                                :flocculation    "Low"
                                                :form            "Liquid"
                                                :product-id      "2247"}))

(def north-american-lager-2272
  (yeasts/build-yeasts :north-american-lager-2272 {:min-temperature 8.89
                                                   :name            "2272 North American Lager"
                                                   :max-temperature 13.33
                                                   :type            "Lager"
                                                   :best-for        "American Pilsner, California Common, Canadian Lager, Oktoberfest, Marzen"
                                                   :laboratory      "Wyeast"
                                                   :attenuation     0.765
                                                   :notes           "American and Canadian lager yeast. Malty finish makes it suitable for Marzens/Oktoberfest as well."
                                                   :flocculation    "High"
                                                   :form            "Liquid"
                                                   :product-id      "2272"}))

(def czech-pilsner-lager-2278
  (yeasts/build-yeasts :czech-pilsner-lager-2278 {:min-temperature 10.0
                                                  :name            "2278 Czech Pilsner Lager"
                                                  :max-temperature 14.44
                                                  :type            "Lager"
                                                  :best-for        "Bohemian and American Pilsner, Bocks, Oktoberfest, Marzen"
                                                  :laboratory      "Wyeast"
                                                  :attenuation     0.765
                                                  :notes           "Classic Pilsner strain. Creates a dry but malty finish. Perfect for Pilsners and bocks. Some sulfur produced, but will fade with time."
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "2278"}))

(def munich-lager-2308
  (yeasts/build-yeasts :munich-lager-2308 {:min-temperature 8.89
                                           :name            "2308 Munich Lager"
                                           :max-temperature 13.33
                                           :type            "Lager"
                                           :best-for        "Pilsners, Light Lagers, Dortmond/Export, Marzen/Oktoberfest, Dunkel"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Unique Pilsner strain. Very smooth, well-rounded and full bodied. Benefits from a diacetyl rest."
                                           :flocculation    "Medium"
                                           :form            "Liquid"
                                           :product-id      "2308"}))

(def kolsch-yeast-2565
  (yeasts/build-yeasts :kolsch-yeast-2565 {:min-temperature 13.33
                                           :name            "2565 Kolsch Yeast"
                                           :max-temperature 17.78
                                           :type            "Ale"
                                           :best-for        "Kolsch, European Ales"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Very malty flavor with mix of lager and ale character. Crisp, clean finish."
                                           :flocculation    "Low"
                                           :form            "Liquid"
                                           :product-id      "2565"}))

(def octoberfest-lager-blend-2633
  (yeasts/build-yeasts :octoberfest-lager-blend-2633 {:min-temperature 8.89
                                                      :name            "2633 Octoberfest Lager Blend"
                                                      :max-temperature 14.44
                                                      :type            "Lager"
                                                      :best-for        "Octoberfest, Marzen, Bavarian lagers"
                                                      :laboratory      "Wyeast"
                                                      :attenuation     0.765
                                                      :notes           "This blend of lager strains is designed to produce a rich, malty, complex and full bodied Octoberfest style beer. It attenuates well while leaving plenty of malt character and mouthfeel. This strain is low in sulfur production. "
                                                      :flocculation    "Low"
                                                      :form            "Liquid"
                                                      :product-id      "2633"}))

(def bavarian-wheat-yeast-3056
  (yeasts/build-yeasts :bavarian-wheat-yeast-3056 {:min-temperature 17.78
                                                   :name            "3056 Bavarian Wheat Yeast"
                                                   :max-temperature 23.33
                                                   :type            "Wheat"
                                                   :best-for        "Bavarian style wheat beers."
                                                   :laboratory      "Wyeast"
                                                   :attenuation     0.765
                                                   :notes           "Blend of top-fermenting ale and wheat yeasts providing a mild ester and phenolic profile."
                                                   :flocculation    "Medium"
                                                   :form            "Liquid"
                                                   :product-id      "3056"}))

(def weihenstephan-weizen-3068
  (yeasts/build-yeasts :weihenstephan-weizen-3068 {:min-temperature 17.78
                                                   :name            "3068 Weihenstephan Weizen"
                                                   :max-temperature 23.89
                                                   :type            "Wheat"
                                                   :best-for        "Bavarian Weizen"
                                                   :laboratory      "Wyeast"
                                                   :attenuation     0.765
                                                   :notes           "Unique Bavarian wheat yeast that produces the spicy weizen clove and banana flavor. Best when fermented at around 68 deg F."
                                                   :flocculation    "Low"
                                                   :form            "Liquid"
                                                   :product-id      "3068"}))

(def brettanomyces-bruxellensis-3112
  (yeasts/build-yeasts :brettanomyces-bruxellensis-3112 {:min-temperature 15.56
                                                         :name            "3112 Brettanomyces Bruxellensis"
                                                         :max-temperature 23.89
                                                         :type            "Ale"
                                                         :best-for        "Belgian Lambic, Gueze Lambic, and Sour Browns"
                                                         :laboratory      "Wyeast"
                                                         :attenuation     0.765
                                                         :notes           "Wild yeast strain isolated from Brussels region of Belgium. Adds classic sweaty horse hair flavor as well as sourness and cherry-pie like flavor. Generally used in conjunction with S. Cerevisiae after the primary fermentation has begun. Requires 3-6 mo"
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "3112"}))

(def belgian-lambic-blend-3278
  (yeasts/build-yeasts :belgian-lambic-blend-3278 {:min-temperature 17.22
                                                   :name            "3278 Belgian Lambic Blend"
                                                   :max-temperature 23.89
                                                   :type            "Ale"
                                                   :best-for        "Belgian Lambic"
                                                   :laboratory      "Wyeast"
                                                   :attenuation     0.765
                                                   :notes           "Lambic culture of Saccharomyces Cerevisiar and a mixture of yeasts and bacterias. Blend of organisms helps create lactic flavor of Belgian Lambics."
                                                   :flocculation    "Low"
                                                   :form            "Liquid"
                                                   :product-id      "3278"}))

(def german-wheat-3333
  (yeasts/build-yeasts :german-wheat-3333 {:min-temperature 17.22
                                           :name            "3333 German Wheat"
                                           :max-temperature 23.89
                                           :type            "Wheat"
                                           :best-for        "Bavarian Weizen"
                                           :laboratory      "Wyeast"
                                           :attenuation     0.765
                                           :notes           "Subtle flavor profile. Sharp, fruity, crisp, sherry like flavor."
                                           :flocculation    "High"
                                           :form            "Liquid"
                                           :product-id      "3333"}))

(def forbidden-fruit-3463
  (yeasts/build-yeasts :forbidden-fruit-3463 {:min-temperature 17.22
                                              :name            "3463 Forbidden Fruit"
                                              :max-temperature 24.44
                                              :type            "Wheat"
                                              :best-for        "Belgian Wit, Grand Cru"
                                              :laboratory      "Wyeast"
                                              :attenuation     0.765
                                              :notes           "Phenolic profile with subdued fruitiness. Available seasonally."
                                              :flocculation    "Low"
                                              :form            "Liquid"
                                              :product-id      "3463"}))

(def belgian-ardennes-3522
  (yeasts/build-yeasts :belgian-ardennes-3522 {:min-temperature 18.33
                                               :name            "3522 Belgian Ardennes"
                                               :max-temperature 29.44
                                               :type            "Wheat"
                                               :best-for        "Belgian Ale"
                                               :laboratory      "Wyeast"
                                               :attenuation     0.765
                                               :notes           "Phenolics develop at increased temperature. Mild fruitiness and complex spicy flavor."
                                               :flocculation    "High"
                                               :form            "Liquid"
                                               :product-id      "3522"}))

(def bavarian-wheat-3638
  (yeasts/build-yeasts :bavarian-wheat-3638 {:min-temperature 17.78
                                             :name            "3638 Bavarian Wheat"
                                             :max-temperature 23.89
                                             :type            "Wheat"
                                             :best-for        "Bavarian Weizen, Hefeweizen"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Hefeweizen yeast with complex flavor and aroma. Bubble gum, banana flavors with apple/plub ester profile. Malty flavor."
                                             :flocculation    "Low"
                                             :form            "Liquid"
                                             :product-id      "3638"}))

(def french-saison-3711
  (yeasts/build-yeasts :french-saison-3711 {:min-temperature 18.33
                                            :name            "3711 French Saison"
                                            :max-temperature 25.0
                                            :type            "Ale"
                                            :best-for        "French and Belgian Saison or Farmhouse ales"
                                            :laboratory      "Wyeast"
                                            :attenuation     0.765
                                            :notes           "A very versatile strain that produces Saison or farmhouse style biers as well as other Belgian style beers that are highly aromatic (estery), peppery, spicy and citrusy. This strain enhances the use of spices and aroma hops, and is extremely attenuative b"
                                            :flocculation    "Medium"
                                            :form            "Liquid"
                                            :product-id      "3711"}))

(def belgian-saison-3724
  (yeasts/build-yeasts :belgian-saison-3724 {:min-temperature 21.11
                                             :name            "3724 Belgian Saison"
                                             :max-temperature 35.0
                                             :type            "Ale"
                                             :best-for        "Belgian Saison beer"
                                             :laboratory      "Wyeast"
                                             :attenuation     0.765
                                             :notes           "Classic farmhouse ale yeast. Spicy, complex aromatics including bubble gum. Tart and dry on the palate with mild fruitiness. Finishes crisp and mildly acidic. Ferment at warm temperature. May have vigorous fermentation start."
                                             :flocculation    "Low"
                                             :form            "Liquid"
                                             :product-id      "3724"}))

(def roselare-belgian-blend-3763
  (yeasts/build-yeasts :roselare-belgian-blend-3763 {:min-temperature 12.78
                                                     :name            "3763 Roselare Belgian Blend"
                                                     :max-temperature 26.67
                                                     :type            "Ale"
                                                     :best-for        "Belgian sour brown and red beers."
                                                     :laboratory      "Wyeast"
                                                     :attenuation     0.765
                                                     :notes           "Culture of Saccharomyces, Brettonomyces and Lactic Acid Bacteria. Complex aromas and flavors. May be used for primary fermentation. Primarily for sour brown and red Belgian styles."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "3763"}))

(def trappist-high-gravity-3787
  (yeasts/build-yeasts :trappist-high-gravity-3787 {:min-temperature 17.78
                                                    :name            "3787 Trappist High Gravity"
                                                    :max-temperature 25.56
                                                    :type            "Wheat"
                                                    :best-for        "Belgian Wit, Trappist Ale, High gravity ales"
                                                    :laboratory      "Wyeast"
                                                    :attenuation     0.765
                                                    :notes           "Robust top cropping yeast. Phenolic character and alcohol tolerance up to 12%. Rich ester profile and malty flavor."
                                                    :flocculation    "Medium"
                                                    :form            "Liquid"
                                                    :product-id      "3787"}))

(def belgian-wheat-yeast-3942
  (yeasts/build-yeasts :belgian-wheat-yeast-3942 {:min-temperature 17.78
                                                  :name            "3942 Belgian Wheat Yeast"
                                                  :max-temperature 23.33
                                                  :type            "Wheat"
                                                  :best-for        "Belgian Wheat, Bavarian Weizen"
                                                  :laboratory      "Wyeast"
                                                  :attenuation     0.765
                                                  :notes           "Estery lor phenol yeast. Plum and apple aroma with a dry finish."
                                                  :flocculation    "Medium"
                                                  :form            "Liquid"
                                                  :product-id      "3942"}))

(def belgian-witbier-3944
  (yeasts/build-yeasts :belgian-witbier-3944 {:min-temperature 16.67
                                              :name            "3944 Belgian Witbier"
                                              :max-temperature 23.89
                                              :type            "Wheat"
                                              :best-for        "Belgian Wit, Grand Cru"
                                              :laboratory      "Wyeast"
                                              :attenuation     0.765
                                              :notes           "Tart, slightly phenolic character. For Wits and Grand Cru. Tolerates high gravity beers well."
                                              :flocculation    "Medium"
                                              :form            "Liquid"
                                              :product-id      "3944"}))

(def lactobacillus-delbrueckii-4335
  (yeasts/build-yeasts :lactobacillus-delbrueckii-4335 {:min-temperature 15.56
                                                        :name            "4335 Lactobacillus Delbrueckii"
                                                        :max-temperature 35.0
                                                        :type            "Ale"
                                                        :best-for        "Belgian gueze, lambic, sour brown ales, and Berliner Weisse."
                                                        :laboratory      "Wyeast"
                                                        :attenuation     0.765
                                                        :notes           "Lactic acid bacteria isolated from Belgium. Produces mild acidity and sourness found in many types of Belgian beers. Always used in conjunction with S. Cerevisiae and wild yeasts."
                                                        :flocculation    "Medium"
                                                        :form            "Liquid"
                                                        :product-id      "4335"}))

(def pediococcus-cerevisiae-4733
  (yeasts/build-yeasts :pediococcus-cerevisiae-4733 {:min-temperature 15.56
                                                     :name            "4733 Pediococcus Cerevisiae"
                                                     :max-temperature 35.0
                                                     :type            "Ale"
                                                     :best-for        "Gueze and other Belgian styles."
                                                     :laboratory      "Wyeast"
                                                     :attenuation     0.765
                                                     :notes           "Lactic acid bacteria isolated from Belgium. Creates a high level of lactic acidity over a long time. Often used with other yeasts, and it may take several months for flavor to fully develop."
                                                     :flocculation    "Medium"
                                                     :form            "Liquid"
                                                     :product-id      "4733"}))

(def brettanomyces-bruxellensis-5112
  (yeasts/build-yeasts :brettanomyces-bruxellensis-5112 {:min-temperature 15.56
                                                         :name            "5112 Brettanomyces Bruxellensis"
                                                         :max-temperature 23.89
                                                         :type            "Ale"
                                                         :best-for        "Gueuze, Lambics and Sour Browns"
                                                         :laboratory      "Wyeast"
                                                         :attenuation     0.765
                                                         :notes           "This strain of wild yeast was isolated from brewery cultures in the Brussels region of Belgium. It produces the classic sweaty horse blanket character and may form a pellicle in bottles or casks. The strain is generally used in conjunction with S. cerevis"
                                                         :flocculation    "Medium"
                                                         :form            "Liquid"
                                                         :product-id      "5112"}))

(def lactobacillus-5335
  (yeasts/build-yeasts :lactobacillus-5335 {:min-temperature 15.56
                                            :name            "5335 Lactobacillus"
                                            :max-temperature 35.0
                                            :type            "Ale"
                                            :best-for        "Belgian sout beers (secondary)"
                                            :laboratory      "Wyeast"
                                            :attenuation     0.765
                                            :notes           "Lactic acid bacteria isolated from a Belgian brewery. This culture produces moderate levels of acidity and is commonly found in many types of beers including gueuze, lambics, sour brown ales and Berliner Weisse. It is always used in conjunction with S.cer"
                                            :flocculation    "Medium"
                                            :form            "Liquid"
                                            :product-id      "5335"}))

(def brettanomyces-lambucus-5526
  (yeasts/build-yeasts :brettanomyces-lambucus-5526 {:min-temperature 15.56
                                                     :name            "5526 Brettanomyces Lambucus"
                                                     :max-temperature 23.89
                                                     :type            "Ale"
                                                     :best-for        "Lambic"
                                                     :laboratory      "Wyeast"
                                                     :attenuation     0.765
                                                     :notes           "This is a wild yeast strain isolated from Belgian lambic beers. It produces a pie cherry-like flavor and sourness with a distinct Brett character. A pellicle may form in bottles or casks. This strain works best in conjunction with other yeast and lactic b"
                                                     :flocculation    "Very High"
                                                     :form            "Liquid"
                                                     :product-id      "5526"}))

(def pediococcus-5733
  (yeasts/build-yeasts :pediococcus-5733 {:min-temperature 18.33
                                          :name            "5733 Pediococcus"
                                          :max-temperature 35.0
                                          :type            "Ale"
                                          :best-for        "Belgian sour ales"
                                          :laboratory      "Wyeast"
                                          :attenuation     0.765
                                          :notes           "Lactic acid bacteria used in the production of Belgian style beers where additional acidity is desirable. Often found in gueuze and other Belgian style beer. Acid production will increase with storage time. It may also cause ropiness and produce low level"
                                          :flocculation    "Medium"
                                          :form            "Liquid"
                                          :product-id      "5733"}))

(def ^:const wyeast
  (merge german-ale-1007 american-wheat-ale-1010 british-cask-ale-1026 london-ale-yeast-1028 american-ale-1056 irish-ale-1084 wyeast-ale-blend-1087
         british-ale-yeast-1098 whitbread-ale-1099 ringwood-ale-1187 belgian-ale-yeast-1214 american-ale-ii-1272 gf-all-american-ale-1272 thames-valley-ale-1275
         london-ale-iii-1318 northwest-ale-1332 british-ale-ii-1335 european-ale-yeast-1338 belgian-strong-ale-1388 denny-s-favorite-50-1450 scottish-ale-1728
         belgian-abbey-ii-1762 london-esb-ale-1968 budvar-lager-2000 urquell-lager-2001 pilsen-lager-2007 american-lager-2035 danish-lager-2042 california-lager-2112
         bohemian-lager-2124 wyeast-lager-blend-2178 bavarian-lager-2206 european-lager-ii-2247 north-american-lager-2272 czech-pilsner-lager-2278 munich-lager-2308
         kolsch-yeast-2565 octoberfest-lager-blend-2633 bavarian-wheat-yeast-3056 weihenstephan-weizen-3068 brettanomyces-bruxellensis-3112 belgian-lambic-blend-3278
         german-wheat-3333 forbidden-fruit-3463 belgian-ardennes-3522 bavarian-wheat-3638 french-saison-3711 belgian-saison-3724 roselare-belgian-blend-3763 trappist-high-gravity-3787
         belgian-wheat-yeast-3942 belgian-witbier-3944 lactobacillus-delbrueckii-4335 pediococcus-cerevisiae-4733 brettanomyces-bruxellensis-5112 lactobacillus-5335 brettanomyces-lambucus-5526 pediococcus-5733))
