(ns common-beer-format.generative.waters-test
  (:require [clojure.test :refer :all]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.waters :as waters]))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::waters/sodium))
    (is (gen/generatable? ::waters/magnesium))
    (is (gen/generatable? ::waters/chloride))
    (is (gen/generatable? ::waters/waters))
    (is (gen/generatable? ::waters/water))
    (is (gen/generatable? ::waters/ph))
    (is (gen/generatable? ::waters/water-wrapper))
    (is (gen/generatable? ::waters/waters-wrapper))
    (is (gen/generatable? ::waters/bicarbonate))
    (is (gen/generatable? ::waters/calcium))
    (is (gen/generatable? ::waters/sulfate))))
