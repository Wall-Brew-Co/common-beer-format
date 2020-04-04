(ns common-beer-format.fermentables-test
  (:require [clojure.spec.alpha :as csa]
            [common-beer-format.fermentables :as fermentables]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(def conforming-fermentable
  {:name    "Caramel/Crystal - 40L"
   :version 1
   :type    "grain"
   :amount  12.5
   :yield   80.6
   :color   40.0})

(def extra-fields
  {:add-after-boil   false
   :origin           "Germany"
   :supplier         "Gnome Brew"
   :notes            "Sweet, sweet caramel"
   :coarse-fine-diff 48.9
   :moisture         2.0
   :diastatic-power  0.0
   :protein          8.2
   :max-in-batch     100.0
   :recommend-mash   true
   :ibu-gal-per-lb   0.0})

(def full-fermentable
  (merge conforming-fermentable extra-fields))

(deftest type-spec-test
  (testing "Ensure type spec validates data appropriately"
    (is (csa/valid? ::fermentables/type (:type conforming-fermentable)))
    (is (csa/valid? ::fermentables/type "Dry Extract"))
    (is (not (csa/valid? ::fermentables/type -1.234)))
    (is (not (csa/valid? ::fermentables/type "Nesquick")))
    (is (not (csa/valid? ::fermentables/type "")))
    (is (not (csa/valid? ::fermentables/type :extract)))))

(deftest fermentable-test
  (testing "Ensure fermentable spec validates data appropriately"
    (is (csa/valid? ::fermentables/fermentable conforming-fermentable))
    (is (csa/valid? ::fermentables/fermentable (assoc conforming-fermentable :random-key "random value")))
    (is (csa/valid? ::fermentables/fermentable full-fermentable))
    (is (csa/valid? ::fermentables/fermentable (assoc full-fermentable :random-key "random value")))
    (is (not (csa/valid? ::fermentables/fermentable (dissoc conforming-fermentable :version))))
    (is (not (csa/valid? ::fermentables/fermentable (dissoc full-fermentable :name))))
    (is (not (csa/valid? ::fermentables/fermentable (update conforming-fermentable :version inc))))
    (is (not (csa/valid? ::fermentables/fermentable (assoc conforming-fermentable :notes :bad-value))))
    (is (not (csa/valid? ::fermentables/fermentable {})))))

(deftest fermentables-test
  (testing "Ensure fermentables spec validates data appropriately"
    (is (csa/valid? ::fermentables/fermentables [conforming-fermentable]))
    (is (csa/valid? ::fermentables/fermentables [(assoc conforming-fermentable :random-key "random value")]))
    (is (csa/valid? ::fermentables/fermentables [conforming-fermentable full-fermentable]))
    (is (csa/valid? ::fermentables/fermentables [full-fermentable (assoc conforming-fermentable :random-key "random value")]))
    (is (csa/valid? ::fermentables/fermentables []))
    (is (not (csa/valid? ::fermentables/fermentables [{}])))
    (is (not (csa/valid? ::fermentables/fermentables conforming-fermentable)))
    (is (not (csa/valid? ::fermentables/fermentables [(dissoc conforming-fermentable :type)])))))
