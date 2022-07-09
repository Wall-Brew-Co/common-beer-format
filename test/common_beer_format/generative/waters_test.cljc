(ns common-beer-format.generative.waters-test
  (:require [common-beer-format.generative.util :as gen]
            [common-beer-format.specs.waters :as waters]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


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
