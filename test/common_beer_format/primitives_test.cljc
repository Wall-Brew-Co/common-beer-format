(ns common-beer-format.primitives-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon]
            [common-beer-format.primitives :as prim]))


(deftest kilograms-spec-test
  (testing "Ensure kilogram spec validates data appropriately"
    (is (spoon/test-valid? ::prim/kilogram 1.234))
    (is (spoon/test-valid? ::prim/kilogram 1))
    (is (spoon/test-valid? ::prim/kilogram 0))
    (is (not (s/valid? ::prim/kilogram nil)))
    (is (not (s/valid? ::prim/kilogram -1)))
    (is (not (s/valid? ::prim/kilogram -0.254)))
    (is (not (s/valid? ::prim/kilogram false)))))


(deftest liter-spec-test
  (testing "Ensure liter spec validates data appropriately"
    (is (spoon/test-valid? ::prim/liter 1.234))
    (is (spoon/test-valid? ::prim/liter 1))
    (is (spoon/test-valid? ::prim/liter 0))
    (is (not (s/valid? ::prim/liter nil)))
    (is (not (s/valid? ::prim/liter -1)))
    (is (not (s/valid? ::prim/liter -0.254)))
    (is (not (s/valid? ::prim/liter false)))))


(deftest degrees-celsiuss-spec-test
  (testing "Ensure degrees-celsius spec validates data appropriately"
    (is (spoon/test-valid? ::prim/degrees-celsius 1.234))
    (is (spoon/test-valid? ::prim/degrees-celsius 1))
    (is (spoon/test-valid? ::prim/degrees-celsius 0))
    (is (spoon/test-valid? ::prim/degrees-celsius -1.234))
    (is (not (s/valid? ::prim/degrees-celsius false)))))


(deftest minutes-spec-test
  (testing "Ensure minute spec validates data appropriately"
    (is (spoon/test-valid? ::prim/minute 1.234))
    (is (spoon/test-valid? ::prim/minute 1))
    (is (spoon/test-valid? ::prim/minute 0))
    (is (not (s/valid? ::prim/minute nil)))
    (is (not (s/valid? ::prim/minute -1)))
    (is (not (s/valid? ::prim/minute -0.254)))
    (is (not (s/valid? ::prim/minute false)))))


(deftest specific-gravity-spec-test
  (testing "Ensure specific-gravity spec validates data appropriately"
    (is (spoon/test-valid? ::prim/specific-gravity 1.234))
    (is (spoon/test-valid? ::prim/specific-gravity 1))
    (is (not (s/valid? ::prim/specific-gravity nil)))
    (is (not (s/valid? ::prim/specific-gravity 0)))
    (is (not (s/valid? ::prim/specific-gravity -1)))
    (is (not (s/valid? ::prim/specific-gravity -0.254)))
    (is (not (s/valid? ::prim/specific-gravity false)))))


(deftest kilopascals-spec-test
  (testing "Ensure kilopascal spec validates data appropriately"
    (is (spoon/test-valid? ::prim/kilopascal 1.234))
    (is (spoon/test-valid? ::prim/kilopascal 1))
    (is (spoon/test-valid? ::prim/kilopascal 0))
    (is (not (s/valid? ::prim/kilopascal nil)))
    (is (not (s/valid? ::prim/kilopascal -1)))
    (is (not (s/valid? ::prim/kilopascal -0.254)))
    (is (not (s/valid? ::prim/kilopascal false)))))


(deftest version-spec-test
  (testing "Ensure version spec validates data appropriately"
    (is (spoon/test-valid? ::prim/version 1))
    (is (not (s/valid? ::prim/version nil)))
    #? (:clj (is (not (s/valid? ::prim/version 1.0)))) ; Javascript just has one number type
    (is (not (s/valid? ::prim/version 0)))
    (is (not (s/valid? ::prim/version false)))))


(deftest name-spec-test
  (testing "Ensure name spec validates data appropriately"
    (is (spoon/test-valid? ::prim/name "Crystal Malt - 40L"))
    (is (spoon/test-valid? ::prim/name "Citra"))
    (is (not (s/valid? ::prim/name "")))
    (is (not (s/valid? ::prim/amount false)))))


(deftest amount-spec-test
  (testing "Ensure the amount spec wraps the kilogram spec appropriately"
    (is (spoon/test-valid? ::prim/amount 12.34))
    (is (spoon/test-valid? ::prim/amount 5))
    (is (spoon/test-valid? ::prim/amount 0))
    (is (not (s/valid? ::prim/amount nil)))
    (is (not (s/valid? ::prim/amount -1)))
    (is (not (s/valid? ::prim/amount -0.254)))
    (is (not (s/valid? ::prim/amount false)))))


(deftest boolean-spec-test
  (testing "Ensure the boolean spec is correct"
    (is (spoon/test-valid? ::prim/boolean true))
    (is (spoon/test-valid? ::prim/boolean false))
    (is (not (s/valid? ::prim/boolean nil)))
    (is (not (s/valid? ::prim/boolean "false")))))


(deftest amount-is-weight-test
  (testing "Ensure the amount-is-weight spec wraps the boolean spec appropriately"
    (is (spoon/test-valid? ::prim/amount-is-weight true))
    (is (spoon/test-valid? ::prim/amount-is-weight false))
    (is (not (s/valid? ::prim/amount-is-weight nil)))
    (is (not (s/valid? ::prim/amount-is-weight "false")))))


(deftest text-test
  (testing "Ensure the text spec is correct"
    (is (spoon/test-valid? ::prim/text "Text goes here"))
    (is (not (s/valid? ::prim/amount-is-weight "")))
    (is (not (s/valid? ::prim/amount-is-weight nil)))
    (is (not (s/valid? ::prim/amount-is-weight "  ")))))
