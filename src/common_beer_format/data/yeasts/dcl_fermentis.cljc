(ns common-beer-format.data.yeasts.dcl-fermentis
  "Data for yeasts cultivated by DCL/Fermentis"
  (:require [common-beer-format.data.yeasts.yeasts :as yeasts]))

(def k-97-safale-german-ale 
  (yeasts/build-yeasts :k-97-safale-german-ale {:min-temperature 15.0
                                                :name            "K-97 SafAle German Ale"
                                                :max-temperature 24.0
                                                :type            "Ale"
                                                :best-for        "High attenuation ales, wheat beers and weizens."
                                                :laboratory      "DCL/Fermentis"
                                                :attenuation     0.765
                                                :notes           "Low sedimentation yeast, sometimes used in open fermentation. Good for wheat beers, weizens and light ales."
                                                :flocculation    "Medium"
                                                :form            "Dry"
                                                :product-id      "K-97"})) 

(def s-04-safale-english-ale 
  (yeasts/build-yeasts :s-04-safale-english-ale {:min-temperature 15.0
                                                 :name            "S-04 SafAle English Ale"
                                                 :max-temperature 24.0
                                                 :type            "Ale"
                                                 :best-for        "Great general purpose ale yeast."
                                                 :laboratory      "DCL/Fermentis"
                                                 :attenuation     0.765
                                                 :notes           "Fast starting, fast fermenting yeast. Quick attenuation helps to produce a clean, crisp, clear ale. Can be used in a wide range of ales."
                                                 :flocculation    "Medium"
                                                 :form            "Dry"
                                                 :product-id      "S-04"})) 

(def s-189-saflager-german-lager 
  (yeasts/build-yeasts :s-189-saflager-german-lager {:min-temperature 8.89
                                                     :name            "S-189 SafLager German Lager"
                                                     :max-temperature 13.33
                                                     :type            "Lager"
                                                     :best-for        "Wide range of lagers and pilsners."
                                                     :laboratory      "DCL/Fermentis"
                                                     :attenuation     0.765
                                                     :notes           "Popular lager yeast strain. Produces wide range of continental lagers and pilsners. Clean finish."
                                                     :flocculation    "High"
                                                     :form            "Dry"
                                                     :product-id      "S-189"})) 

(def s-23-saflager-west-european-lager 
  (yeasts/build-yeasts :s-23-saflager-west-european-lager {:min-temperature 7.78
                                                           :name            "S-23 SafLager West European Lager"
                                                           :max-temperature 10.0
                                                           :type            "Lager"
                                                           :best-for        "German style Lagers and Pilsners."
                                                           :laboratory      "DCL/Fermentis"
                                                           :attenuation     0.765
                                                           :notes           "German lager yeast strain. Performs well at low temperature. High flocculation and attenuation for a clean German finish."
                                                           :flocculation    "High"
                                                           :form            "Dry"
                                                           :product-id      "S-23"})) 

(def s-33-safbrew-ale 
  (yeasts/build-yeasts :s-33-safbrew-ale {:min-temperature 18.33
                                          :name            "S-33 SafBrew Ale"
                                          :max-temperature 22.22
                                          :type            "Ale"
                                          :best-for        "Most ales."
                                          :laboratory      "DCL/Fermentis"
                                          :attenuation     0.765
                                          :notes           "General purpose ale yeast, widely used. Very consistent, clean finish. High attenuation and good flavor profile."
                                          :flocculation    "Medium"
                                          :form            "Dry"
                                          :product-id      "S-33"})) 

(def t-58-safbrew-specialty-ale 
  (yeasts/build-yeasts :t-58-safbrew-specialty-ale {:min-temperature 15.56
                                                    :name            "T-58 SafBrew Specialty Ale"
                                                    :max-temperature 22.22
                                                    :type            "Ale"
                                                    :best-for        "Complex ales."
                                                    :laboratory      "DCL/Fermentis"
                                                    :attenuation     0.765
                                                    :notes           "Estery, somewhat spicy ale yeast. Solid yeast formation at end of fermentation. Widely used for bottle and cask conditioning."
                                                    :flocculation    "Medium"
                                                    :form            "Dry"
                                                    :product-id      "T-58"})) 

(def us-05-safale-american 
  (yeasts/build-yeasts :us-05-safale-american {:min-temperature 15.0
                                               :name            "US-05 Safale American"
                                               :max-temperature 23.89
                                               :type            "Ale"
                                               :best-for        "American ale, other clean finish ales"
                                               :laboratory      "DCL/Fermentis"
                                               :attenuation     0.765
                                               :notes           "American ale yeast that produces well balanced beers with low diacetyl and a very clean, crisp end palate."
                                               :flocculation    "Medium"
                                               :form            "Dry"
                                               :product-id      "US-05"}))  

(def w-34-70-saflager-lager 
  (yeasts/build-yeasts :w-34-70-saflager-lager {:min-temperature 8.89
                                                :name            "W-34/70 Saflager Lager"
                                                :max-temperature 15.0
                                                :type            "Lager"
                                                :best-for        "European lagers"
                                                :laboratory      "DCL/Fermentis"
                                                :attenuation     0.765
                                                :notes           "A famous yeast strain from Weihenstephan Germany used worldwide in brewing. Their most popular strain for lagers."
                                                :flocculation    "High"
                                                :form            "Dry"
                                                :product-id      "W-34/70"})) 

(def wb-06-safbrew-wheat 
  (yeasts/build-yeasts :wb-06-safbrew-wheat {:min-temperature 15.0
                                             :name            "WB-06 Safbrew Wheat"
                                             :max-temperature 23.89
                                             :type            "Wheat"
                                             :best-for        "Wheat beers"
                                             :laboratory      "DCL/Fermentis"
                                             :attenuation     0.765
                                             :notes           "A specialty yeast for wheat beer fermentation. The yeast produces a subtle estery and phenlol flavor typical of wheat beers."
                                             :flocculation    "Medium"
                                             :form            "Dry"
                                             :product-id      "WB-06"}))

(def dcl-fermentis
  (merge k-97-safale-german-ale s-04-safale-english-ale s-189-saflager-german-lager s-23-saflager-west-european-lager
         s-33-safbrew-ale t-58-safbrew-specialty-ale us-05-safale-american w-34-70-saflager-lager wb-06-safbrew-wheat))
