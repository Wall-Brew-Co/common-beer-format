(ns common-beer-format.generative.primitives-test
  (:require [clojure.test :refer [deftest is testing]]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.primitives :as primitives]))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::primitives/kilogram))
    (is (gen/generatable? ::primitives/liter))
    (is (gen/generatable? ::primitives/degrees-celsius))
    (is (gen/generatable? ::primitives/minute))
    (is (gen/generatable? ::primitives/specific-gravity))
    (is (gen/generatable? ::primitives/kilopascal))
    (is (gen/generatable? ::primitives/percent))
    (is (gen/generatable? ::primitives/boolean))
    (is (gen/generatable? ::primitives/text))
    (is (gen/generatable? ::primitives/version))
    (is (gen/generatable? ::primitives/name))
    (is (gen/generatable? ::primitives/amount))
    (is (gen/generatable? ::primitives/notes))
    (is (gen/generatable? ::primitives/origin))
    (is (gen/generatable? ::primitives/substitutes))
    (is (gen/generatable? ::primitives/amount-is-weight))
    (is (gen/generatable? ::primitives/display-amount))
    (is (gen/generatable? ::primitives/inventory))
    (is (gen/generatable? ::primitives/display-time))))
