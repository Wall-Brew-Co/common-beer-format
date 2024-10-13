(ns common-beer-format.generative.primitives-test
  (:require [clojure.spec.alpha :as spec]
            [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
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


(deftest kilogram-test
  (testing "Only positive doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/kilogram 0.0))
    (is (spoon.spec/test-valid? ::primitives/kilogram 1.0))
    (is (spoon.spec/test-valid? ::primitives/kilogram 1.5))
    (is (not (spec/valid? ::primitives/kilogram -1.0)))
    (is (not (spec/valid? ::primitives/kilogram -1.5)))
    (is (not (spec/valid? ::primitives/kilogram "0.0")))
    (is (not (spec/valid? ::primitives/kilogram true)))
    (is (not (spec/valid? ::primitives/kilogram false)))
    (is (not (spec/valid? ::primitives/kilogram nil)))
    (is (not (spec/valid? ::primitives/kilogram [])))
    (is (not (spec/valid? ::primitives/kilogram {})))
    (is (not (spec/valid? ::primitives/kilogram #{})))))


(deftest liter-test
  (testing "Only positive doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/liter 0.0))
    (is (spoon.spec/test-valid? ::primitives/liter 1.0))
    (is (spoon.spec/test-valid? ::primitives/liter 1.5))
    (is (not (spec/valid? ::primitives/liter -1.0)))
    (is (not (spec/valid? ::primitives/liter -1.5)))
    (is (not (spec/valid? ::primitives/liter "0.0")))
    (is (not (spec/valid? ::primitives/liter true)))
    (is (not (spec/valid? ::primitives/liter false)))
    (is (not (spec/valid? ::primitives/liter nil)))
    (is (not (spec/valid? ::primitives/liter [])))
    (is (not (spec/valid? ::primitives/liter {})))
    (is (not (spec/valid? ::primitives/liter #{})))))


(deftest degrees-celsius-test
  (testing "Doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/degrees-celsius 0.0))
    (is (spoon.spec/test-valid? ::primitives/degrees-celsius 1.0))
    (is (spoon.spec/test-valid? ::primitives/degrees-celsius 1.5))
    (is (spoon.spec/test-valid? ::primitives/degrees-celsius -1.0))
    (is (spoon.spec/test-valid? ::primitives/degrees-celsius -1.5))
    (is (not (spec/valid? ::primitives/degrees-celsius "0.0")))
    (is (not (spec/valid? ::primitives/degrees-celsius true)))
    (is (not (spec/valid? ::primitives/degrees-celsius false)))
    (is (not (spec/valid? ::primitives/degrees-celsius nil)))
    (is (not (spec/valid? ::primitives/degrees-celsius [])))
    (is (not (spec/valid? ::primitives/degrees-celsius {})))
    (is (not (spec/valid? ::primitives/degrees-celsius #{})))))


(deftest minute-test
  (testing "Only positive doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/minute 0))
    (is (spoon.spec/test-valid? ::primitives/minute 1.0))
    (is (spoon.spec/test-valid? ::primitives/minute 15))
    (is (not (spec/valid? ::primitives/minute -1)))
    (is (not (spec/valid? ::primitives/minute -15)))
    (is (not (spec/valid? ::primitives/minute "0")))
    (is (not (spec/valid? ::primitives/minute true)))
    (is (not (spec/valid? ::primitives/minute false)))
    (is (not (spec/valid? ::primitives/minute nil)))
    (is (not (spec/valid? ::primitives/minute [])))
    (is (not (spec/valid? ::primitives/minute {})))
    (is (not (spec/valid? ::primitives/minute #{})))))


(deftest specific-gravity-test
  (testing "Only positive doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/specific-gravity 0.0))
    (is (spoon.spec/test-valid? ::primitives/specific-gravity 1.0))
    (is (spoon.spec/test-valid? ::primitives/specific-gravity 1.5))
    (is (not (spec/valid? ::primitives/specific-gravity -1.0)))
    (is (not (spec/valid? ::primitives/specific-gravity -1.5)))
    (is (not (spec/valid? ::primitives/specific-gravity "0.0")))
    (is (not (spec/valid? ::primitives/specific-gravity true)))
    (is (not (spec/valid? ::primitives/specific-gravity false)))
    (is (not (spec/valid? ::primitives/specific-gravity nil)))
    (is (not (spec/valid? ::primitives/specific-gravity [])))
    (is (not (spec/valid? ::primitives/specific-gravity {})))
    (is (not (spec/valid? ::primitives/specific-gravity #{})))))


(deftest kilopascal-test
  (testing "Only positive doubles are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/kilopascal 0.0))
    (is (spoon.spec/test-valid? ::primitives/kilopascal 1.0))
    (is (spoon.spec/test-valid? ::primitives/kilopascal 1.5))
    (is (not (spec/valid? ::primitives/kilopascal -1.0)))
    (is (not (spec/valid? ::primitives/kilopascal -1.5)))
    (is (not (spec/valid? ::primitives/kilopascal "0.0")))
    (is (not (spec/valid? ::primitives/kilopascal true)))
    (is (not (spec/valid? ::primitives/kilopascal false)))
    (is (not (spec/valid? ::primitives/kilopascal nil)))
    (is (not (spec/valid? ::primitives/kilopascal [])))
    (is (not (spec/valid? ::primitives/kilopascal {})))
    (is (not (spec/valid? ::primitives/kilopascal #{})))))


(deftest percent-test
  (testing "Numbers are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/percent 0.0))
    (is (spoon.spec/test-valid? ::primitives/percent 1.0))
    (is (spoon.spec/test-valid? ::primitives/percent 1.5))
    (is (spoon.spec/test-valid? ::primitives/percent -1.5))
    (is (not (spec/valid? ::primitives/percent "0.0")))
    (is (not (spec/valid? ::primitives/percent true)))
    (is (not (spec/valid? ::primitives/percent false)))
    (is (not (spec/valid? ::primitives/percent nil)))
    (is (not (spec/valid? ::primitives/percent [])))
    (is (not (spec/valid? ::primitives/percent {})))
    (is (not (spec/valid? ::primitives/percent #{})))))


(deftest boolean-test
  (testing "Booleans are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/boolean true))
    (is (spoon.spec/test-valid? ::primitives/boolean false))
    (is (not (spec/valid? ::primitives/boolean "true")))
    (is (not (spec/valid? ::primitives/boolean "false")))
    (is (not (spec/valid? ::primitives/boolean 1)))
    (is (not (spec/valid? ::primitives/boolean 0)))
    (is (not (spec/valid? ::primitives/boolean nil)))
    (is (not (spec/valid? ::primitives/boolean [])))
    (is (not (spec/valid? ::primitives/boolean {})))
    (is (not (spec/valid? ::primitives/boolean #{})))))


(deftest text-test
  (testing "Non-blank Strings are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/text "true"))
    (is (spoon.spec/test-valid? ::primitives/text "false"))
    (is (spoon.spec/test-valid? ::primitives/text "1"))
    (is (spoon.spec/test-valid? ::primitives/text "0"))
    (is (spoon.spec/test-valid? ::primitives/text "foo"))
    (is (not (spec/valid? ::primitives/text "")))
    (is (not (spec/valid? ::primitives/text "   ")))
    (is (not (spec/valid? ::primitives/text true)))
    (is (not (spec/valid? ::primitives/text false)))
    (is (not (spec/valid? ::primitives/text 1)))
    (is (not (spec/valid? ::primitives/text 0)))
    (is (not (spec/valid? ::primitives/text nil)))
    (is (not (spec/valid? ::primitives/text [])))
    (is (not (spec/valid? ::primitives/text {})))
    (is (not (spec/valid? ::primitives/text #{})))))


(deftest version-test
  (testing "Only supported BeerXML version numbers are marked valid"
    (is (spoon.spec/test-valid? ::primitives/version 1))
    (is (not (spec/valid? ::primitives/version "1")))
    (is (not (spec/valid? ::primitives/version -1)))
    (is (not (spec/valid? ::primitives/version "")))
    (is (not (spec/valid? ::primitives/version "   ")))
    (is (not (spec/valid? ::primitives/version true)))
    (is (not (spec/valid? ::primitives/version false)))
    (is (not (spec/valid? ::primitives/version 0)))
    (is (not (spec/valid? ::primitives/version nil)))
    (is (not (spec/valid? ::primitives/version [])))
    (is (not (spec/valid? ::primitives/version {})))
    (is (not (spec/valid? ::primitives/version #{})))))


(deftest name-test
  (testing "Non-blank Strings are marked as valid"
    (is (spoon.spec/test-valid? ::primitives/name "true"))
    (is (spoon.spec/test-valid? ::primitives/name "false"))
    (is (spoon.spec/test-valid? ::primitives/name "1"))
    (is (spoon.spec/test-valid? ::primitives/name "0"))
    (is (spoon.spec/test-valid? ::primitives/name "foo"))
    (is (not (spec/valid? ::primitives/name "")))
    (is (not (spec/valid? ::primitives/name "   ")))
    (is (not (spec/valid? ::primitives/name true)))
    (is (not (spec/valid? ::primitives/name false)))
    (is (not (spec/valid? ::primitives/name 1)))
    (is (not (spec/valid? ::primitives/name 0)))
    (is (not (spec/valid? ::primitives/name nil)))
    (is (not (spec/valid? ::primitives/name [])))
    (is (not (spec/valid? ::primitives/name {})))
    (is (not (spec/valid? ::primitives/name #{})))))
