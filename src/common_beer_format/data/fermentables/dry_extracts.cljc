(ns common-beer-format.data.fermentables.dry-extracts
  "Data for malt extracts and brewing sugars")

(def ^:private extract-defaults
  {:version        1
   :amount         0.0
   :type           "Dry Extract"
   :recommend-mash false
   :add-after-boil false
   :max-in-batch   1.0
   :yield          0.95})

(defn ^:private build-extract
  [extract-key extract-data]
  {extract-key (merge extract-data extract-defaults)})

(def amber-dry-extract
  (build-extract :amber-dry-extract {:name      "Amber Dry Extract"
                                     :color     13
                                     :potential 1.044
                                     :notes     "Amber colored dry malt extract for general purpose use."}))

(def dark-dry-extract
  (build-extract :dark-dry-extract {:name      "Dark Dry Extract"
                                    :color     18
                                    :potential 1.044
                                    :notes     "For general-purpose use in darker beers."}))

(def extra-light-dry-extract
  (build-extract :extra-light-dry-extract {:name      "Extra Light Dry Extract"
                                           :color     3
                                           :potential 1.036
                                           :notes     "For general-purpose use in light and very light beers."}))

(def light-dry-extract
  (build-extract :light-dry-extract {:name      "Light Dry Extract"
                                     :color     8
                                     :potential 1.044
                                     :notes     "For general-purpose use in light beers."}))

(def wheat-dry-extract
  (build-extract :wheat-dry-extract {:name      "Wheat Dry Extract"
                                     :color     8
                                     :potential 1.044
                                     :notes     "Wheat extract for general-purpose use in wheat beers."}))

(def dry-extracts
  (merge amber-dry-extract dark-dry-extract extra-light-dry-extract light-dry-extract wheat-dry-extract))
