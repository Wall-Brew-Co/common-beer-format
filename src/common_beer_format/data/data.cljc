(ns common-beer-format.data.data
  "Quick functions and references to ingredient data"
  (:require [common-beer-format.data.fermentables.adjuncts :as adjuncts]
            [common-beer-format.data.fermentables.dry-extracts :as dry-extracts]
            [common-beer-format.data.fermentables.extracts :as extracts]
            [common-beer-format.data.fermentables.grains :as grains]
            [common-beer-format.data.fermentables.sugars :as sugars]
            [common-beer-format.data.hops.aroma :as aroma]
            [common-beer-format.data.hops.bittering :as bittering]
            [common-beer-format.data.hops.both :as both]
            [common-beer-format.data.styles.bjcp-2015.bjcp-2015 :as bjcp-2015]))

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

(defn select-hops
  [{:keys [include-aroma? include-bittering? include-both?]}]
  (cond-> {}
    include-aroma?     (merge aroma/aroma)
    include-bittering? (merge bittering/bittering)
    include-both?      (merge both/both)))

(def all-hops
  (select-hops {:include-aroma?     true
                :include-bittering? true 
                :include-both?      true}))

(defn select-style-guides
  [{:keys [include-bjcp-2015?]}]
  (cond-> {}
    include-bjcp-2015? (merge bjcp-2015/all-styles)))

(def all-style-guides
  (select-style-guides {:include-bjcp-2015? true}))
