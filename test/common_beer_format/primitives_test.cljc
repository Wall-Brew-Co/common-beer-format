(ns common-beer-format.primitives-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.primitives :as prim]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest kilograms-spec-test
  (testing "Ensure kilogram spec validates data appropriately"
    (is (csa/valid? ::prim/kilogram 1.234))
    (is (csa/valid? ::prim/kilogram 1))
    (is (not (csa/valid? ::prim/kilogram -1.234)))
    (is (not (csa/valid? ::prim/kilogram false)))))

(deftest liter-spec-test
  (testing "Ensure liter spec validates data appropriately"
    (is (csa/valid? ::prim/liter 1.234))
    (is (csa/valid? ::prim/liter 1))
    (is (not (csa/valid? ::prim/liter -1.234)))
    (is (not (csa/valid? ::prim/liter false)))))

(deftest degrees-celsiuss-spec-test
  (testing "Ensure degrees-celsius spec validates data appropriately"
    (is (csa/valid? ::prim/degrees-celsius 1.234))
    (is (csa/valid? ::prim/degrees-celsius 1))
    (is (csa/valid? ::prim/degrees-celsius -1.234))
    (is (not (csa/valid? ::prim/degrees-celsius false)))))

(deftest minutes-spec-test
  (testing "Ensure minute spec validates data appropriately"
    (is (csa/valid? ::prim/minute 1.234))
    (is (csa/valid? ::prim/minute 1))
    (is (not (csa/valid? ::prim/minute -1.234)))
    (is (not (csa/valid? ::prim/minute false)))))

(deftest specific-gravity-spec-test
  (testing "Ensure specific-gravity spec validates data appropriately"
    (is (csa/valid? ::prim/specific-gravity 1.234))
    (is (csa/valid? ::prim/specific-gravity 1))
    (is (not (csa/valid? ::prim/specific-gravity -1.234)))
    (is (not (csa/valid? ::prim/specific-gravity false)))))

(deftest kilopascals-spec-test
  (testing "Ensure kilopascal spec validates data appropriately"
    (is (csa/valid? ::prim/kilopascal 1.234))
    (is (csa/valid? ::prim/kilopascal 1))
    (is (not (csa/valid? ::prim/kilopascal -1.234)))
    (is (not (csa/valid? ::prim/kilopascal false)))))

(deftest version-spec-test
  (testing "Ensure version spec validates data appropriately"
    (is (csa/valid? ::prim/version 1))
    (is (not (csa/valid? ::prim/version -1.234)))
    (is (not (csa/valid? ::prim/version false)))))

(deftest name-spec-test
  (testing "Ensure name spec validates data appropriately"
    (is (csa/valid? ::prim/name "Crystal Malt - 40L"))
    (is (csa/valid? ::prim/name "Citra"))
    (is (not (csa/valid? ::prim/name "")))
    (is (not (csa/valid? ::prim/amount false)))))

(deftest amount-spec-test
  (testing "Ensure the amount spec wraps the kilogram spec appropriately"
    (is (csa/valid? ::prim/amount 12.34))
    (is (csa/valid? ::prim/amount 5))
    (is (not (csa/valid? ::prim/amount -1.234)))
    (is (not (csa/valid? ::prim/amount false)))))

(deftest boolean-spec-test
  (testing "Ensure the boolean spec is correct"
    (is (csa/valid? ::prim/boolean true))
    (is (csa/valid? ::prim/boolean false))
    (is (not (csa/valid? ::prim/boolean -1.234)))
    (is (not (csa/valid? ::prim/boolean "false")))))

(deftest amount-is-weight-test
  (testing "Ensure the amount-is-weight spec wraps the boolean spec appropriately"
    (is (csa/valid? ::prim/amount-is-weight true))
    (is (csa/valid? ::prim/amount-is-weight false))
    (is (not (csa/valid? ::prim/amount-is-weight -1.234)))
    (is (not (csa/valid? ::prim/amount-is-weight "false")))))

(deftest text-test
  (testing "Ensure the text spec is correct"
    (is (csa/valid? ::prim/text "Text goes here"))
    (is (not (csa/valid? ::prim/amount-is-weight "")))
    (is (not (csa/valid? ::prim/amount-is-weight -1.234)))
    (is (not (csa/valid? ::prim/amount-is-weight "  ")))))
