(ns common-beer-format.generative.mash-test
  (:require [clojure.test :refer [deftest is testing]]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.mash :as mash]))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::mash/display-step-temp))
    (is (gen/generatable? ::mash/mash-wrapper))
    (is (gen/generatable? ::mash/display-grain-temp))
    (is (gen/generatable? ::mash/ramp-time))
    (is (gen/generatable? ::mash/grain-temp))
    (is (gen/generatable? ::mash/display-sparge-temp))
    (is (gen/generatable? ::mash/equip-adjust))
    (is (gen/generatable? ::mash/mash))
    (is (gen/generatable? ::mash/sparge-temp))
    (is (gen/generatable? ::mash/mash-steps))
    (is (gen/generatable? ::mash/mash-step-wrapper))
    (is (gen/generatable? ::mash/tun-specific-heat))
    (is (gen/generatable? ::mash/step-temp))
    (is (gen/generatable? ::mash/type))
    (is (gen/generatable? ::mash/display-tun-weight))
    (is (gen/generatable? ::mash/mash-step))
    (is (gen/generatable? ::mash/description))
    (is (gen/generatable? ::mash/decoction-amt))
    (is (gen/generatable? ::mash/infuse-temp))
    (is (gen/generatable? ::mash/infuse-amount))
    (is (gen/generatable? ::mash/end-temp))
    (is (gen/generatable? ::mash/display-infuse-amt))
    (is (gen/generatable? ::mash/step-time))
    (is (gen/generatable? ::mash/ph))
    (is (gen/generatable? ::mash/tun-temp))
    (is (gen/generatable? ::mash/display-tun-temp))
    (is (gen/generatable? ::mash/tun-weight))
    (is (gen/generatable? ::mash/water-grain-ratio))))
