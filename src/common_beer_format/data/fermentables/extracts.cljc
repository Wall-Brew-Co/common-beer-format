(ns common-beer-format.data.fermentables.extracts
  "Data for malt extracts and brewing sugars")


(def ^:private extract-defaults
  {:version        1
   :amount         0.0
   :recommend-mash false
   :type           "Extract"})


(defn ^:private build-extract
  [extract-key extract-data]
  {extract-key (merge extract-data extract-defaults)})


(def amber-liquid-extract
  (build-extract :amber-liquid-extract {:name           "Amber Liquid Extract"
                                        :yield          0.78
                                        :color          13
                                        :add-after-boil false
                                        :max-in-batch   1.0
                                        :potential      1.036
                                        :notes          "Amber colored liquid malt extract for general purpose use."}))


(def dark-liquid-extract
  (build-extract :dark-liquid-extract {:name           "Dark Liquid Extract"
                                       :yield          0.78
                                       :color          18
                                       :add-after-boil false
                                       :max-in-batch   1.0
                                       :potential      1.036
                                       :notes          "For general-purpose use in darker beers."}))


(def honey
  (build-extract :honey {:name           "Honey"
                         :yield          0.75
                         :color          1
                         :add-after-boil true
                         :max-in-batch   0.3
                         :potential      1.035
                         :notes          "Used for light flavor and body. Can be added to primary fermentation, but must be pasteurized"}))


(def pale-liquid-extract
  (build-extract :pale-liquid-extract {:name           "Pale Liquid Extract"
                                       :yield          0.78
                                       :color          8
                                       :add-after-boil false
                                       :max-in-batch   1.0
                                       :potential      1.036
                                       :notes          "For general-purpose use in light and pale beers."}))


(def pilsner-liquid-extract
  (build-extract :pilsner-liquid-extract {:name           "Pilsner Liquid Extract"
                                          :yield          0.78
                                          :color          4
                                          :add-after-boil false
                                          :max-in-batch   1.0
                                          :potential      1.036
                                          :notes          "For general-purpose use in pale beers."}))


(def rice-extract-syrup
  (build-extract :rice-extract-syrup {:name           "Rice Extract Syrup"
                                      :yield          0.69
                                      :color          7
                                      :add-after-boil false
                                      :max-in-batch   0.15
                                      :potential      1.032
                                      :notes          "Used like other rice adjuncts in American and Japanese lagers."}))


(def rye-liquid-extract
  (build-extract :rye-liquid-extract {:name           "Rye Liquid Extract"
                                      :yield          0.69
                                      :color          7
                                      :add-after-boil false
                                      :max-in-batch   1.0
                                      :potential      1.034
                                      :notes          "Mixed rye/barley extract for general-purpose brewing."}))


(def sorghum-syrup
  (build-extract :sorghum-syrup {:name           "Sorghum Syrup"
                                 :yield          0.78
                                 :color          7
                                 :add-after-boil false
                                 :max-in-batch   1.0
                                 :potential      1.036
                                 :notes          "A gluten-free extract based on sorghum grain. Can be used as a substitute for Light Malt Extract."}))


(def wheat-liquid-extract
  (build-extract :wheat-liquid-extract {:name           "Wheat Liquid Extract"
                                        :yield          0.78
                                        :color          8
                                        :add-after-boil false
                                        :max-in-batch   1.0
                                        :potential      1.036
                                        :notes          "Wheat/barley extract for general-purpose use in wheat beers."}))


(def extracts
  (merge amber-liquid-extract dark-liquid-extract honey pale-liquid-extract pilsner-liquid-extract rice-extract-syrup rye-liquid-extract sorghum-syrup wheat-liquid-extract))
