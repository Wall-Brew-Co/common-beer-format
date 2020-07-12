(ns common-beer-format.data-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.data.data :as ingredients]
            [common-beer-format.specs.fermentables :as fermentables]
            [common-beer-format.specs.hops :as hops]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest fermentables-test
  (testing "Ensure all fermentables are well formed"
    (is (every? keyword? (keys ingredients/all-fermentables)))
    (is (every? #(csa/valid? ::fermentables/fermentable %) (vals ingredients/all-fermentables)))))

(deftest hops-test
  (testing "Ensure all hops are well formed"
    (is (every? keyword? (keys ingredients/all-hops)))
    (is (every? #(csa/valid? ::hops/hop %) (vals ingredients/all-hops)))))
