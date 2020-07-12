(ns common-beer-format.data.fermentables.sugars
  "Data for sugars and syrups used in brewing")

(def ^:private sugar-defaults
  {:version        1
   :amount         0.0
   :type           "Sugar"
   :recommend-mash false
   :add-after-boil false})

(defn ^:private build-sugar
  [sugar-key sugar-data]
  {sugar-key (merge sugar-data sugar-defaults)})

(def dark-brown-sugar
  (build-sugar :dark-brown-sugar {:name         "Dark Brown Sugar"
                                  :color        50
                                  :potential    1.046
                                  :max-in-batch 0.1
                                  :yield        1.0
                                  :notes        "Imparts a sweet, rich flavor."}))

(def light-brown-sugar
  (build-sugar :light-brown-sugar {:name         "Light Brown Sugar"
                                   :color        8
                                   :potential    1.046
                                   :max-in-batch 0.1
                                   :yield        1.0
                                   :notes        "Imparts a sweet, rich flavor."}))

(def belgian-candi-syrup-45l
  (build-sugar :belgian-candi-syrup-45l {:name         "Belgian Candi Syrup - 45L"
                                         :potential    1.032
                                         :yield        0.783
                                         :color        60
                                         :max-in-batch 0.2
                                         :notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales"}))
               
(def belgian-candi-syrup-90l
  (build-sugar :belgian-candi-syrup-90l {:name         "Belgian Candi Syrup - 90L"
                                         :yield        0.783
                                         :potential    1.032
                                         :color        121
                                         :max-in-batch 0.2
                                         :notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales"}))

(def belgian-candi-syrup-180l
  (build-sugar :belgian-candi-syrup-180l {:name         "Belgian Candi Syrup - 180L"
                                          :potential    1.032
                                          :yield        0.783
                                          :color        243
                                          :max-in-batch 0.2
                                          :notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales"}))

(def clear-candi-sugar
  (build-sugar :clear-candi-sugar {:name         "Clear Candi Sugar"
                                   :potential    1.036
                                   :yield        0.783
                                   :color        1
                                   :max-in-batch 0.2
                                   :notes        "Crystalized candi sugar for use in Tripels, Dubbels, and holiday ales"}))

(def cane-sugar
  (build-sugar :cane-sugar {:name         "Cane Sugar"
                            :potential    1.046
                            :yield        1.0
                            :color        0
                            :max-in-batch 0.07
                            :notes        "Common, household sugat to lighten the flavor and body"}))

(def beet-sugar
  (build-sugar :beet-sugar {:name         "Beet Sugar"
                            :potential    1.046
                            :yield        1.0
                            :color        0
                            :max-in-batch 0.07
                            :notes        "Common, household sugat to lighten the flavor and body"}))

(def corn-sugar
  (build-sugar :corn-sugar {:name         "Corn Sugar"
                            :potential    1.046
                            :yield        1.0
                            :color        0
                            :max-in-batch 0.05
                            :notes        "Common bottling sugar"}))

(def dextrose
  (build-sugar :dextrose {:name         "Dextrose"
                          :potential    1.046
                          :yield        1.0
                          :color        0
                          :max-in-batch 0.05
                          :notes        "Common bottling sugar"}))

(def corn-syrup
  (build-sugar :corn-syrup {:name         "Corn Syrup"
                            :potential    1.036
                            :yield        0.783
                            :color        0
                            :max-in-batch 0.1
                            :notes        "Syrup derived from corn sugar"}))

(def demerara-sugar
  (build-sugar :demerara-sugar {:name         "Demerara Sugar"
                                :potential    1.046
                                :yield        1.0
                                :color        2
                                :max-in-batch 0.1
                                :notes        "A dark, unrefined sugar that contains molasses"}))

(def invert-sugar
  (build-sugar :invert-sugar {:name         "Invert Sugar"
                              :potential    1.046
                              :yield        1.0
                              :color        0
                              :max-in-batch 0.1
                              :notes        "A sugar used to increase starting gravity"}))

(def milk-sugar
  (build-sugar :milk-sugar {:name         "Milk Sugar"
                            :potential    1.035
                            :yield        0.761
                            :color        0
                            :max-in-batch 0.1
                            :notes        "A partially fermentable sugar that adds lasting sweetness"}))

(def lactose
  (build-sugar :lactose {:name         "Lactose"
                         :potential    1.035
                         :yield        0.761
                         :color        0
                         :max-in-batch 0.1
                         :notes        "A partially fermentable sugar that adds lasting sweetness"}))

(def molasses
  (build-sugar :molasses {:name         "Molasses"
                          :potential    1.036
                          :yield        0.783
                          :color        80
                          :max-in-batch 0.05
                          :notes        "A strong, dark, and sweet sugar"}))

(def maple-syrup
  (build-sugar :maple-syrup {:name         "Maple Syrup"
                             :potential    1.030
                             :yield        0.652
                             :color        35
                             :max-in-batch 0.10
                             :notes        "If added during the boil it will add a dry, woodsy flavor. If added at bottling, the smooth maple flavor comes through"}))

(def table-sugar
  (build-sugar :table-sugar {:name         "Table Sugar"
                             :potential    1.046
                             :yield        1.0
                             :color        1
                             :max-in-batch 0.1
                             :notes        "A sugar used to increase starting gravity"}))

(def sucrose
  (build-sugar :sucrose {:name         "Sucrose"
                         :potential    1.046
                         :yield        1.0
                         :color        1
                         :max-in-batch 0.1
                         :notes        "A sugar used to increase starting gravity"}))

(def turbinado
  (build-sugar :turbinado {:name         "Turbinado"
                           :potential    1.044
                           :yield        0.957
                           :color        10
                           :max-in-batch 0.1
                           :notes        "A light, raw brown sugar used to increase starting gravity"}))

(def ^:const sugars
  (merge dark-brown-sugar light-brown-sugar belgian-candi-syrup-45l belgian-candi-syrup-90l belgian-candi-syrup-180l clear-candi-sugar cane-sugar beet-sugar
         dextrose corn-sugar corn-syrup demerara-sugar invert-sugar milk-sugar lactose molasses maple-syrup sucrose table-sugar turbinado))
