(ns common-beer-format.data.yeasts.lallemand
  "Data for yeasts cultivated by Lallemand"
  (:require [common-beer-format.data.yeasts.yeasts :as yeasts]))

(def lalvin-71b-1122
  (yeasts/build-yeasts :lalvin-71b-1122 {:min-temperature 15.0
                                         :name            "71B-1122 Lalvin"
                                         :max-temperature 30.0
                                         :type            "Wine"
                                         :best-for        "Young wines such as nouveau, blush and sugar white."
                                         :laboratory      "Lallemand"
                                         :attenuation     0.765
                                         :notes           "Rapid starter with constant and complete fermentation. Ability to metabolize high amounts (20-40%) of malic acid. Partial metabolism of malic acid helps soften the wine. May produce significant esters, making it a good choice for concentrates. "
                                         :flocculation    "High"
                                         :form            "Dry"
                                         :product-id      "71B-1122"}))

(def lalvin-d-47
  (yeasts/build-yeasts :lalvin-d-47 {:min-temperature 10.0
                                     :name            "D-47 Lalvin"
                                     :max-temperature 30.0
                                     :type            "Wine"
                                     :best-for        "White wines such as Chardonnay and Rose. Also good for mead."
                                     :laboratory      "Lallemand"
                                     :attenuation     0.765
                                     :notes           "Recommended for white variety wines such as Chardonnay and Rose as well as Mead. Low foaming, quick fermenting, forming a compact lees at the end of fermentation. Use yeast nutrients if making mead. Saccharomyces Cerevisiae."
                                     :flocculation    "High"
                                     :form            "Dry"
                                     :product-id      "D-47"}))

(def lalvin-ec-1118
  (yeasts/build-yeasts :lalvin-ec-1118 {:min-temperature 7.22
                                        :name            "EC-1118 Lalvin"
                                        :max-temperature 35.0
                                        :type            "Wine"
                                        :best-for        "All types of wine and also cider."
                                        :laboratory      "Lallemand"
                                        :attenuation     0.765
                                        :notes           "Low production of foam, volatile acid and H2S. Ferments over a wide temperature range. High alcohol tolerance, compact lees and good flocculation. Relatively neutral flavor and aroma."
                                        :flocculation    "High"
                                        :form            "Dry"
                                        :product-id      "EC-1118"}))

(def lalvin-k1v-1116
  (yeasts/build-yeasts :lalvin-k1v-1116 {:min-temperature 15.0
                                         :name            "K1V-1116 Lalvin"
                                         :max-temperature 30.0
                                         :type            "Wine"
                                         :best-for        "Souvingnon Blanc, Chenin Blanc and Seyval."
                                         :laboratory      "Lallemand"
                                         :attenuation     0.765
                                         :notes           "Used for white grape varieties. Rapid starter with constant and complete fermentation. Capable of surviving difficult conditions such as low nutrient or high SO2 levels. Has low volatile action."
                                         :flocculation    "Medium"
                                         :form            "Dry"
                                         :product-id      "K1V-1116"}))

(def lalvin-rc-212
  (yeasts/build-yeasts :lalvin-rc-212 {:min-temperature 15.0
                                       :name            "RC-212 Lalvin"
                                       :max-temperature 30.0
                                       :type            "Wine"
                                       :best-for        "Red wines."
                                       :laboratory      "Lallemand"
                                       :attenuation     0.765
                                       :notes           "RC212 recommended for red variety wines and high gravity beers. Alcohol tolerance in the 12-14% range. Low foaming and moderate speed fermenting. Saccharomyces Cerevisiae."
                                       :flocculation    "Medium"
                                       :form            "Dry"
                                       :product-id      "RC-212"}))

(def lallemand
  (merge lalvin-71b-1122 lalvin-d-47 lalvin-ec-1118 lalvin-k1v-1116 lalvin-rc-212))
