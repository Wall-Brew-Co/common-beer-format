(ns common-beer-format.ingredients.hops.hops
  "Function to help minimize repeated data in hop entry")

(def ^:private hop-defaults
  {:version 1
   :amount  0.0
   :time    0.0
   :hop-use "boil"
   :form    "pellet"})

(defn build-hop
  [hop-key hop-data]
  {hop-key (merge hop-defaults hop-data)})
