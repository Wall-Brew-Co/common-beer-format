(ns common-beer-format.hops-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.hops :as hops]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest alpha-spec-test
  (testing "Ensure alpha spec validates data appropriately"
    (is (csa/valid? ::hops/alpha 1.234))
    (is (csa/valid? ::hops/alpha 1))
    (is (not (csa/valid? ::hops/alpha -1.234)))
    (is (not (csa/valid? ::hops/alpha false)))))

(deftest use-spec-test
  (testing "Ensure use spec validates data appropriately"
    (is (csa/valid? ::hops/use "Boil"))
    (is (csa/valid? ::hops/use "mash"))
    (is (csa/valid? ::hops/use "dRy HoP"))
    (is (not (csa/valid? ::hops/use :aroma)))
    (is (not (csa/valid? ::hops/use "")))
    (is (not (csa/valid? ::hops/alpha false)))))

(deftest time-spec-test
  (testing "Ensure time spec validates data appropriately"
    (is (csa/valid? ::hops/time 1.234))
    (is (csa/valid? ::hops/time 1))
    (is (not (csa/valid? ::hops/time -1.234)))
    (is (not (csa/valid? ::hops/time false)))))

(deftest type-spec-test
  (testing "Ensure type spec validates data appropriately"
    (is (csa/valid? ::hops/type "Bittering"))
    (is (csa/valid? ::hops/type "ArOmA"))
    (is (csa/valid? ::hops/type "both"))
    (is (not (csa/valid? ::hops/type :both)))
    (is (not (csa/valid? ::hops/type "")))
    (is (not (csa/valid? ::hops/type false)))))

(deftest form-spec-test
  (testing "Ensure form spec validates data appropriately"
    (is (csa/valid? ::hops/form "Pellet"))
    (is (csa/valid? ::hops/form "pLUg"))
    (is (csa/valid? ::hops/form "leaf"))
    (is (not (csa/valid? ::hops/form :plug)))
    (is (not (csa/valid? ::hops/form "")))
    (is (not (csa/valid? ::hops/form false)))))

(deftest beta-spec-test
  (testing "Ensure beta spec validates data appropriately"
    (is (csa/valid? ::hops/beta 1.234))
    (is (csa/valid? ::hops/beta 1))
    (is (not (csa/valid? ::hops/beta -1.234)))
    (is (not (csa/valid? ::hops/beta false)))))

(deftest hsi-spec-test
  (testing "Ensure hsi spec validates data appropriately"
    (is (csa/valid? ::hops/hsi 1.234))
    (is (csa/valid? ::hops/hsi 1))
    (is (not (csa/valid? ::hops/hsi -1.234)))
    (is (not (csa/valid? ::hops/hsi false)))))

(deftest humulene-spec-test
  (testing "Ensure humulene spec validates data appropriately"
    (is (csa/valid? ::hops/humulene 1.234))
    (is (csa/valid? ::hops/humulene 1))
    (is (not (csa/valid? ::hops/humulene -1.234)))
    (is (not (csa/valid? ::hops/humulene false)))))

(deftest caryophyllene-spec-test
  (testing "Ensure caryophyllene spec validates data appropriately"
    (is (csa/valid? ::hops/caryophyllene 1.234))
    (is (csa/valid? ::hops/caryophyllene 1))
    (is (not (csa/valid? ::hops/caryophyllene -1.234)))
    (is (not (csa/valid? ::hops/caryophyllene false)))))

(deftest cohumulone-spec-test
  (testing "Ensure cohumulone spec validates data appropriately"
    (is (csa/valid? ::hops/cohumulone 1.234))
    (is (csa/valid? ::hops/cohumulone 1))
    (is (not (csa/valid? ::hops/cohumulone -1.234)))
    (is (not (csa/valid? ::hops/cohumulone false)))))

(deftest myrcene-spec-test
  (testing "Ensure myrcene spec validates data appropriately"
    (is (csa/valid? ::hops/myrcene 1.234))
    (is (csa/valid? ::hops/myrcene 1))
    (is (not (csa/valid? ::hops/myrcene -1.234)))
    (is (not (csa/valid? ::hops/myrcene false)))))

(def conforming-hop
  {:name    "Citra"
   :version 1
   :alpha   2.7
   :amount  0.0425243
   :use     "Dry Hop"
   :time    7200.0})

(def extra-fields
  {:notes         "A nice, zesty flavor"
   :type          "Aroma"
   :form          "Leaf"
   :beta          3.80
   :hsi           75.0
   :origin        "United States of America"
   :substitute    "Mosaic, Simcoe, Sorachi"
   :humulene      11.2
   :caryophyllene 6.7
   :cohumulone    22.0
   :myrcene       60.1})

(def full-hop
  (merge conforming-hop extra-fields))

(deftest hop-test
  (testing "Ensure hop spec validates data appropriately"
    (is (csa/valid? ::hops/hop conforming-hop))
    (is (csa/valid? ::hops/hop (assoc conforming-hop :random-key "random value")))
    (is (csa/valid? ::hops/hop full-hop))
    (is (csa/valid? ::hops/hop (assoc full-hop :random-key "random value")))
    (is (not (csa/valid? ::hops/hop (dissoc conforming-hop :alpha))))
    (is (not (csa/valid? ::hops/hop (dissoc full-hop :alpha))))
    (is (not (csa/valid? ::hops/hop (update conforming-hop :version inc))))
    (is (not (csa/valid? ::hops/hop (assoc conforming-hop :notes :bad-value))))
    (is (not (csa/valid? ::hops/hop {})))))

(deftest hops-test
  (testing "Ensure hops spec validates data appropriately"
    (is (csa/valid? ::hops/hops [conforming-hop]))
    (is (csa/valid? ::hops/hops [(assoc conforming-hop :random-key "random value")]))
    (is (csa/valid? ::hops/hops [conforming-hop full-hop]))
    (is (csa/valid? ::hops/hops [full-hop (assoc conforming-hop :random-key "random value")]))
    (is (csa/valid? ::hops/hops []))
    (is (not (csa/valid? ::hops/hops [{}])))
    (is (not (csa/valid? ::hops/hops conforming-hop)))
    (is (not (csa/valid? ::hops/hops [(dissoc conforming-hop :alpha)])))))
