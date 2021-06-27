(ns common-beer-format.data.yeasts.yeasts
  "Function to help minimize repeated data in yeast entry")


(def ^:private yeast-defaults
  "Defaults to generate complete records that match the ::yeast spec"
  {:version 1
   :amount  0.0})


(defn build-yeasts
  [yeast-key yeast-data]
  (let [display-min-temp (str (:min-temperature yeast-data) "C")
        display-max-temp (str (:max-temperature yeast-data) "C")
        yeast-definition (merge yeast-defaults yeast-data)]
    {yeast-key (assoc yeast-definition :display-min-temp display-min-temp :display-max-temp display-max-temp)}))
