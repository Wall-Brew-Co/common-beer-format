(ns common-beer-format.data-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.data.data :as data]
            [common-beer-format.specs.fermentables :as fermentables]
            [common-beer-format.specs.hops :as hops]
            [common-beer-format.specs.styles :as styles]
            [common-beer-format.specs.yeasts :as yeasts]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest fermentables-test
  (testing "Ensure all fermentables are well formed"
    (is (every? keyword? (keys data/all-fermentables)))
    (is (every? #(csa/valid? ::fermentables/fermentable %) (vals data/all-fermentables)))))

(deftest hops-test
  (testing "Ensure all hops are well formed"
    (is (every? keyword? (keys data/all-hops)))
    (is (every? #(csa/valid? ::hops/hop %) (vals data/all-hops)))))

(deftest style-test
  (testing "Ensure all styles are well formed"
    (is (every? keyword? (keys data/all-style-guides)))
    (is (every? #(csa/valid? ::styles/style %) (vals data/all-style-guides)))))

(deftest yeast-test
  (testing "Ensure all yeasts are well formed"
    (is (every? keyword? (keys data/all-yeasts)))
    (is (every? #(csa/valid? ::yeasts/yeast %) (vals data/all-yeasts)))))
