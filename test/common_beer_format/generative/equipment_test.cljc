(ns common-beer-format.generative.equipment-test
  (:require [common-beer-format.generative.util :as gen]
            [common-beer-format.equipment :as equipment]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::equipment/boil-size))
    (is (gen/generatable? ::equipment/batch-size))
    (is (gen/generatable? ::equipment/tun-volume))
    (is (gen/generatable? ::equipment/tun-weight))
    (is (gen/generatable? ::equipment/tun-specific-heat))
    (is (gen/generatable? ::equipment/top-up-water))
    (is (gen/generatable? ::equipment/trub-chiller-loss))
    (is (gen/generatable? ::equipment/evap-rate))
    (is (gen/generatable? ::equipment/boil-time))
    (is (gen/generatable? ::equipment/calc-boil-volume))
    (is (gen/generatable? ::equipment/lauter-deadspace))
    (is (gen/generatable? ::equipment/top-up-kettle))
    (is (gen/generatable? ::equipment/hop-utilization))
    (is (gen/generatable? ::equipment/display-boil-size))
    (is (gen/generatable? ::equipment/display-tun-volume))
    (is (gen/generatable? ::equipment/display-top-up-water))
    (is (gen/generatable? ::equipment/display-trub-chiller-loss))
    (is (gen/generatable? ::equipment/display-lauter-deadspace))
    (is (gen/generatable? ::equipment/display-top-up-kettle))
    (is (gen/generatable? ::equipment/equipment))
    (is (gen/generatable? ::equipment/equipment-wrapper))))
