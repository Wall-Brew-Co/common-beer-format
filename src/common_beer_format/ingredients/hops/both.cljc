(ns common-beer-format.ingredients.hops.both
  "Data for multi-purpose hops"
  (:require [common-beer-format.ingredients.hops.hops :as hops]))

(def el-dorado
  (hops/build-hop :el-dorado {:beta          8.0
                              :name          "El Dorado"
                              :cohumulone    0.0
                              :type          "both"
                              :myrcene       0.0
                              :humulene      0.0
                              :hsi           0.0
                              :notes         ""
                              :caryophyllene 0.0
                              :alpha         16.0
                              :substitutes   ""}))

(def celeia
  (hops/build-hop :celeia {:beta          3.5
                           :name          "Celeia"
                           :cohumulone    0.0
                           :type          "both"
                           :myrcene       0.0
                           :humulene      0.0
                           :hsi           0.0
                           :notes         ""
                           :caryophyllene 0.0
                           :alpha         5.5
                           :substitutes   ""}))

(def perle-us
  (hops/build-hop :perle-us {:beta          5.0
                             :name          "Perle US"
                             :cohumulone    0.0
                             :type          "both"
                             :myrcene       0.0
                             :humulene      0.0
                             :hsi           0.0
                             :notes         ""
                             :caryophyllene 0.0
                             :alpha         9.5
                             :substitutes   ""}))

(def northdown
  (hops/build-hop :northdown {:beta          4.75
                              :name          "Northdown"
                              :cohumulone    0.0
                              :type          "both"
                              :myrcene       0.0
                              :humulene      0.0
                              :hsi           0.0
                              :notes         ""
                              :caryophyllene 0.0
                              :alpha         8.5
                              :substitutes   ""}))

(def horizon
  (hops/build-hop :horizon {:beta          8.5
                            :name          "Horizon"
                            :cohumulone    0.0
                            :type          "both"
                            :myrcene       0.0
                            :humulene      0.0
                            :hsi           0.0
                            :notes         ""
                            :caryophyllene 0.0
                            :alpha         13.0
                            :substitutes   ""}))

(def northern-brewer
  (hops/build-hop :northern-brewer {:beta          5.0
                                    :name          "Northern Brewer"
                                    :cohumulone    0.0
                                    :type          "both"
                                    :myrcene       0.0
                                    :humulene      0.0
                                    :hsi           0.0
                                    :notes         ""
                                    :caryophyllene 0.0
                                    :alpha         10.0
                                    :substitutes   ""}))

(def ^:const both
  (merge el-dorado celeia perle-us northdown horizon))
