(ns common-beer-format.ingredients-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.ingredients.data :as ingredients]
            [common-beer-format.specs.fermentables :as fermentables]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest fermentables-test
  (testing "Ensure all fermentables are well formed"
    (is (every? keyword? (keys ingredients/all-fermentables)))
    (is (every? #(csa/valid? ::fermentables/fermentable %) (vals ingredients/all-fermentables)))))
