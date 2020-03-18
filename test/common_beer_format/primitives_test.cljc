(ns common-beer-format.primitives-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest kilograms-spec-test
  (testing "Ensure kilogram spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/kilogram 1.234))
    (is (csa/valid? ::prim/kilogram 1))
    (is (csa/valid? ::prim/kilogram (st/coerce ::prim/kilogram "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/kilogram (st/coerce ::prim/kilogram "1.234" st/string-transformer)))
    (is (csa/valid? ::prim/kilogram (st/coerce ::prim/kilogram 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/kilogram (st/coerce ::prim/kilogram 1.234 st/string-transformer)))
    (is (not (csa/valid? ::prim/kilogram -1.234)))
    (is (not (csa/valid? ::prim/kilogram false)))))

(deftest liter-spec-test
  (testing "Ensure liter spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/liter 1.234))
    (is (csa/valid? ::prim/liter 1))
    (is (csa/valid? ::prim/liter (st/coerce ::prim/liter "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/liter (st/coerce ::prim/liter "1.234" st/string-transformer)))
    (is (csa/valid? ::prim/liter (st/coerce ::prim/liter 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/liter (st/coerce ::prim/liter 1.234 st/string-transformer)))
    (is (not (csa/valid? ::prim/liter -1.234)))
    (is (not (csa/valid? ::prim/liter false)))))

(deftest degrees-celsiuss-spec-test
  (testing "Ensure degrees-celsius spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/degrees-celsius 1.234))
    (is (csa/valid? ::prim/degrees-celsius 1))
    (is (csa/valid? ::prim/degrees-celsius (st/coerce ::prim/degrees-celsius "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/degrees-celsius (st/coerce ::prim/degrees-celsius "-1.234" st/string-transformer)))
    (is (csa/valid? ::prim/degrees-celsius (st/coerce ::prim/degrees-celsius 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/degrees-celsius (st/coerce ::prim/degrees-celsius -1.234 st/string-transformer)))
    (is (csa/valid? ::prim/degrees-celsius -1.234))
    (is (not (csa/valid? ::prim/degrees-celsius false)))))

(deftest minutes-spec-test
  (testing "Ensure minute spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/minute 1.234))
    (is (csa/valid? ::prim/minute 1))
    (is (csa/valid? ::prim/minute (st/coerce ::prim/minute "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/minute (st/coerce ::prim/minute "1.234" st/string-transformer)))
    (is (csa/valid? ::prim/minute (st/coerce ::prim/minute 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/minute (st/coerce ::prim/minute 1.234 st/string-transformer)))
    (is (not (csa/valid? ::prim/minute -1.234)))
    (is (not (csa/valid? ::prim/minute false)))))

(deftest specific-gravity-spec-test
  (testing "Ensure specific-gravity spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/specific-gravity 1.234))
    (is (csa/valid? ::prim/specific-gravity 1))
    (is (csa/valid? ::prim/specific-gravity (st/coerce ::prim/specific-gravity "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/specific-gravity (st/coerce ::prim/specific-gravity "1.234" st/string-transformer)))
    (is (csa/valid? ::prim/specific-gravity (st/coerce ::prim/specific-gravity 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/specific-gravity (st/coerce ::prim/specific-gravity 1.234 st/string-transformer)))
    (is (not (csa/valid? ::prim/specific-gravity -1.234)))
    (is (not (csa/valid? ::prim/specific-gravity false)))))

(deftest kilopascals-spec-test
  (testing "Ensure kilopascal spec conforms and validates data appropriately"
    (is (csa/valid? ::prim/kilopascal 1.234))
    (is (csa/valid? ::prim/kilopascal 1))
    (is (csa/valid? ::prim/kilopascal (st/coerce ::prim/kilopascal "1.234" st/json-transformer)))
    (is (csa/valid? ::prim/kilopascal (st/coerce ::prim/kilopascal "1.234" st/string-transformer)))
    (is (csa/valid? ::prim/kilopascal (st/coerce ::prim/kilopascal 1.234 st/json-transformer)))
    (is (csa/valid? ::prim/kilopascal (st/coerce ::prim/kilopascal 1.234 st/string-transformer)))
    (is (not (csa/valid? ::prim/kilopascal -1.234)))
    (is (not (csa/valid? ::prim/kilopascal false)))))
