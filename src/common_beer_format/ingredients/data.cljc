(ns common-beer-format.ingredients.data
  "Quick functions and references to ingredient data"
  (:require [common-beer-format.ingredients.fermentables.adjuncts :as adjuncts]
            [common-beer-format.ingredients.fermentables.dry-extracts :as dry-extracts]
            [common-beer-format.ingredients.fermentables.extracts :as extracts]
            [common-beer-format.ingredients.fermentables.grains :as grains]
            [common-beer-format.ingredients.fermentables.sugars :as sugars]))

(defn select-fermentables
  [{:keys [include-adjuncts? include-dry-extracts? include-extracts? include-grains? include-sugars?]}]
  (cond-> {}
    include-adjuncts?     (merge adjuncts/adjuncts)
    include-dry-extracts? (merge dry-extracts/dry-extracts)
    include-extracts?     (merge extracts/extracts)
    include-grains?       (merge grains/grains)
    include-sugars?       (merge sugars/sugars)))

(def all-fermentables
  (select-fermentables {:include-adjuncts?     true
                        :include-dry-extracts? true
                        :include-extracts?     true
                        :include-grains?       true
                        :include-sugars?       true}))
