(ns common-beer-format.data.hops.hops
  "Function to help minimize repeated data in hop entry")


(def ^:private hop-defaults
  "To generate complete records that match the ::hop spec, we have defaulted the following:
   ::use  - 'boil'
   ::form - 'pellet'
   ::time - 0"
  {:version 1
   :amount  0.0
   :time    0.0
   :use     "boil"
   :form    "pellet"})


(defn build-hop
  [hop-key hop-data]
  {hop-key (merge hop-defaults hop-data)})
