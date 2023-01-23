(ns common-beer-format.primitives-test
  (:require [clojure.spec.alpha :as spec]
            [clojure.test :refer :all]
            [com.wallbrew.spoon.spec :as spoon]
            [common-beer-format.core :as cbf]
            [common-beer-format.primitives :as prim]))


(deftest kilograms-spec-test
  (testing "Ensure kilogram spec validates data appropriately"
    (is (spoon/test-valid? ::prim/kilogram 1.234))
    (is (spoon/test-valid? ::prim/kilogram 1))
    (is (spoon/test-valid? ::prim/kilogram 0))
    (is (cbf/valid? ::prim/kilogram 0))
    (is (cbf/invalid? ::prim/kilogram nil))
    (is (not (cbf/invalid? ::prim/kilogram 0)))
    (is (not (cbf/valid? ::prim/kilogram nil)))
    (is (not (spec/valid? ::prim/kilogram nil)))
    (is (not (spec/valid? ::prim/kilogram -1)))
    (is (not (spec/valid? ::prim/kilogram -0.254)))
    (is (not (spec/valid? ::prim/kilogram false)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/kilogram\n"
           (cbf/explain ::prim/kilogram nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/kilogram 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/kilogram "1.0")))))


(deftest liter-spec-test
  (testing "Ensure liter spec validates data appropriately"
    (is (spoon/test-valid? ::prim/liter 1.234))
    (is (spoon/test-valid? ::prim/liter 1))
    (is (spoon/test-valid? ::prim/liter 0))
    (is (cbf/valid? ::prim/liter 0))
    (is (cbf/invalid? ::prim/liter nil))
    (is (not (cbf/invalid? ::prim/liter 0)))
    (is (not (cbf/valid? ::prim/liter nil)))
    (is (not (spec/valid? ::prim/liter nil)))
    (is (not (spec/valid? ::prim/liter -1)))
    (is (not (spec/valid? ::prim/liter -0.254)))
    (is (not (spec/valid? ::prim/liter false)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/liter\n"
            (cbf/explain ::prim/liter nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/liter 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/liter "1.0")))))


(deftest degrees-celsiuss-spec-test
  (testing "Ensure degrees-celsius spec validates data appropriately"
    (is (spoon/test-valid? ::prim/degrees-celsius 1.234))
    (is (spoon/test-valid? ::prim/degrees-celsius 1))
    (is (spoon/test-valid? ::prim/degrees-celsius 0))
    (is (spoon/test-valid? ::prim/degrees-celsius -1.234))
    (is (not (spec/valid? ::prim/degrees-celsius false)))
    (is (cbf/valid? ::prim/degrees-celsius 0))
    (is (cbf/invalid? ::prim/degrees-celsius nil))
    (is (not (cbf/invalid? ::prim/degrees-celsius 0)))
    (is (not (cbf/valid? ::prim/degrees-celsius nil)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/degrees-celsius\n"
            (cbf/explain ::prim/degrees-celsius nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/degrees-celsius 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/degrees-celsius "1.0")))))


(deftest minutes-spec-test
  (testing "Ensure minute spec validates data appropriately"
    (is (spoon/test-valid? ::prim/minute 1.234))
    (is (spoon/test-valid? ::prim/minute 1))
    (is (spoon/test-valid? ::prim/minute 0))
    (is (not (spec/valid? ::prim/minute nil)))
    (is (not (spec/valid? ::prim/minute -1)))
    (is (not (spec/valid? ::prim/minute -0.254)))
    (is (not (spec/valid? ::prim/minute false)))
    (is (cbf/valid? ::prim/minute 0))
    (is (cbf/invalid? ::prim/minute nil))
    (is (not (cbf/invalid? ::prim/minute 0)))
    (is (not (cbf/valid? ::prim/minute nil)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/minute\n"
            (cbf/explain ::prim/minute nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/minute 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/minute "1.0")))))


(deftest specific-gravity-spec-test
  (testing "Ensure specific-gravity spec validates data appropriately"
    (is (spoon/test-valid? ::prim/specific-gravity 1.234))
    (is (spoon/test-valid? ::prim/specific-gravity 1))
    (is (not (spec/valid? ::prim/specific-gravity nil)))
    (is (not (spec/valid? ::prim/specific-gravity 0)))
    (is (not (spec/valid? ::prim/specific-gravity -1)))
    (is (not (spec/valid? ::prim/specific-gravity -0.254)))
    (is (not (spec/valid? ::prim/specific-gravity false)))
    (is (cbf/valid? ::prim/specific-gravity 1))
    (is (cbf/invalid? ::prim/specific-gravity nil))
    (is (not (cbf/invalid? ::prim/specific-gravity 1)))
    (is (not (cbf/valid? ::prim/specific-gravity nil)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/specific-gravity\n"
            (cbf/explain ::prim/specific-gravity nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/specific-gravity 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/specific-gravity "1.0")))))


(deftest kilopascals-spec-test
  (testing "Ensure kilopascal spec validates data appropriately"
    (is (spoon/test-valid? ::prim/kilopascal 1.234))
    (is (spoon/test-valid? ::prim/kilopascal 1))
    (is (spoon/test-valid? ::prim/kilopascal 0))
    (is (not (spec/valid? ::prim/kilopascal nil)))
    (is (not (spec/valid? ::prim/kilopascal -1)))
    (is (not (spec/valid? ::prim/kilopascal -0.254)))
    (is (not (spec/valid? ::prim/kilopascal false)))
    (is (cbf/valid? ::prim/kilopascal 0))
    (is (cbf/invalid? ::prim/kilopascal nil))
    (is (not (cbf/invalid? ::prim/kilopascal 0)))
    (is (not (cbf/valid? ::prim/kilopascal nil)))
    (is (=  "nil - failed: number? spec: :common-beer-format.primitives/kilopascal\n"
            (cbf/explain ::prim/kilopascal nil))))
  (testing "Test transport-level encoding options"
    (is (= "1.234" (cbf/encode ::prim/kilopascal 1.234)))
    (is (= 1.0 (cbf/coerce ::prim/kilopascal "1.0")))))


(deftest version-spec-test
  (testing "Ensure version spec validates data appropriately"
    (is (spoon/test-valid? ::prim/version 1))
    (is (not (spec/valid? ::prim/version nil)))
    #? (:clj (is (not (spec/valid? ::prim/version 1.0)))) ; Javascript just has one number type
    (is (not (spec/valid? ::prim/version 0)))
    (is (not (spec/valid? ::prim/version false)))
    (is (cbf/valid? ::prim/version 1))
    (is (cbf/invalid? ::prim/version nil))
    (is (not (cbf/invalid? ::prim/version 1)))
    (is (not (cbf/valid? ::prim/version nil)))
    (is (=  "nil - failed: (= 1 %) spec: :common-beer-format.primitives/version\n"
            (cbf/explain ::prim/version nil))))
  (testing "Test transport-level encoding options"
    (is (= "1" (cbf/encode ::prim/version 1)))
    (is (= 1 (cbf/coerce ::prim/version "1")))))


(deftest name-spec-test
  (testing "Ensure name spec validates data appropriately"
    (is (spoon/test-valid? ::prim/name "Crystal Malt - 40L"))
    (is (spoon/test-valid? ::prim/name "Citra"))
    (is (not (spec/valid? ::prim/name "")))
    (is (not (spec/valid? ::prim/name false)))
    (is (cbf/valid? ::prim/name "1"))
    (is (cbf/invalid? ::prim/name nil))
    (is (not (cbf/invalid? ::prim/name "1")))
    (is (not (cbf/valid? ::prim/name nil)))
    (is (=  "nil - failed: string? spec: :common-beer-format.primitives/name\n"
            (cbf/explain ::prim/name nil))))
  (testing "Test transport-level encoding options"
    (is (= "Crystal Malt - 40L" (cbf/encode ::prim/name "Crystal Malt - 40L")))
    (is (= "Crystal Malt - 40L" (cbf/coerce ::prim/name "Crystal Malt - 40L")))))


(deftest amount-spec-test
  (testing "Ensure the amount spec wraps the kilogram spec appropriately"
    (is (spoon/test-valid? ::prim/amount 12.34))
    (is (spoon/test-valid? ::prim/amount 5))
    (is (spoon/test-valid? ::prim/amount 0))
    (is (not (spec/valid? ::prim/amount nil)))
    (is (not (spec/valid? ::prim/amount -1)))
    (is (not (spec/valid? ::prim/amount -0.254)))
    (is (not (spec/valid? ::prim/amount false)))))


(deftest boolean-spec-test
  (testing "Ensure the boolean spec is correct"
    (is (spoon/test-valid? ::prim/boolean true))
    (is (spoon/test-valid? ::prim/boolean false))
    (is (not (spec/valid? ::prim/boolean nil)))
    (is (not (spec/valid? ::prim/boolean "false"))))
  (testing "Test transport-level encoding options - true"
    (is (= "TRUE" (cbf/encode ::prim/boolean true)))
    (is (= true (cbf/coerce ::prim/boolean "true"))))
  (testing "Test transport-level encoding options - false"
    (is (= "FALSE" (cbf/encode ::prim/boolean false)))
    (is (= false (cbf/coerce ::prim/boolean "false")))))


(deftest amount-is-weight-test
  (testing "Ensure the amount-is-weight spec wraps the boolean spec appropriately"
    (is (spoon/test-valid? ::prim/amount-is-weight true))
    (is (spoon/test-valid? ::prim/amount-is-weight false))
    (is (not (spec/valid? ::prim/amount-is-weight nil)))
    (is (not (spec/valid? ::prim/amount-is-weight "false")))))


(deftest text-test
  (testing "Ensure the text spec is correct"
    (is (spoon/test-valid? ::prim/text "Text goes here"))
    (is (not (spec/valid? ::prim/text "")))
    (is (not (spec/valid? ::prim/text nil)))
    (is (not (spec/valid? ::prim/text "  ")))))
