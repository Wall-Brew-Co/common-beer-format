(ns common-beer-format.generative.fermentables-test
  (:require #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])
            [clojure.spec.alpha :as spec]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as primitives]))


(deftest data-requirement-test
  (testing "Object specs require data"
    (is (not (spec/valid? ::fermentables/fermentable nil)))
    (is (not (spec/valid? ::fermentables/fermentable [])))
    (is (not (spec/valid? ::fermentables/fermentable {})))
    (is (not (spec/valid? ::fermentables/fermentable-wrapper nil)))
    (is (not (spec/valid? ::fermentables/fermentable-wrapper [])))
    (is (not (spec/valid? ::fermentables/fermentable-wrapper {})))
    (is (not (spec/valid? ::fermentables/fermentables-wrapper nil)))
    (is (not (spec/valid? ::fermentables/fermentables-wrapper [])))
    (is (not (spec/valid? ::fermentables/fermentables-wrapper {}))))
  (testing "Collection specs may be empty, but must be vectors"
    (is (not (spec/valid? ::fermentables/fermentables nil)))
    (is (spoon.spec/test-valid? ::fermentables/fermentables []))
    (is (not (spec/valid? ::fermentables/fermentables {})))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::fermentables/coarse-fine-diff))
    (is (gen/generatable? ::fermentables/display-color))
    (is (gen/generatable? ::fermentables/recommend-mash))
    (is (gen/generatable? ::fermentables/protein))
    (is (gen/generatable? ::fermentables/yield))
    (is (gen/generatable? ::fermentables/ibu-gal-per-lb))
    (is (gen/generatable? ::fermentables/fermentables))
    (is (gen/generatable? ::fermentables/fermentable-wrapper))
    (is (gen/generatable? ::fermentables/potential))
    (is (gen/generatable? ::fermentables/supplier))
    (is (gen/generatable? ::fermentables/fermentable))
    (is (gen/generatable? ::fermentables/type))
    (is (gen/generatable? ::fermentables/moisture))
    (is (gen/generatable? ::fermentables/fermentables-wrapper))
    (is (gen/generatable? ::fermentables/color))
    (is (gen/generatable? ::fermentables/add-after-boil))
    (is (gen/generatable? ::fermentables/diastatic-power))
    (is (gen/generatable? ::fermentables/max-in-batch))))

(deftest wrapper-test
  (testing "Ensure wrapper specs are marked as such"
    (is (true? (impl/wrapper-spec? ::fermentables/fermentable-wrapper)))
    (is (true? (impl/wrapper-spec? ::fermentables/fermentables-wrapper))))
  (testing "Ensure non-wrapper specs are not marked as such"
    (is (false? (impl/wrapper-spec? ::fermentables/fermentable)))
    (is (false? (impl/wrapper-spec? ::fermentables/fermentables)))
    (is (false? (impl/wrapper-spec? ::fermentables/coarse-fine-diff)))
    (is (false? (impl/wrapper-spec? ::fermentables/display-color)))
    (is (false? (impl/wrapper-spec? ::fermentables/recommend-mash)))
    (is (false? (impl/wrapper-spec? ::fermentables/protein)))
    (is (false? (impl/wrapper-spec? ::fermentables/yield)))
    (is (false? (impl/wrapper-spec? ::fermentables/ibu-gal-per-lb)))
    (is (false? (impl/wrapper-spec? ::fermentables/potential)))
    (is (false? (impl/wrapper-spec? ::fermentables/supplier)))
    (is (false? (impl/wrapper-spec? ::fermentables/type)))
    (is (false? (impl/wrapper-spec? ::fermentables/moisture)))
    (is (false? (impl/wrapper-spec? ::fermentables/color)))
    (is (false? (impl/wrapper-spec? ::fermentables/add-after-boil)))
    (is (false? (impl/wrapper-spec? ::fermentables/diastatic-power)))
    (is (false? (impl/wrapper-spec? ::fermentables/max-in-batch)))))


(def sample-fermentable
  "A hard-coded sample fermentable usable for unit tests"
  {:add-after-boil   false
   :amount           0.45
   :coarse-fine-diff 1.5
   :color            500.1
   :diastatic-power  0.0
   :display-amount   "0.45 kg"
   :display-color    "500.1 L"
   :ibu-gal-per-lb   0.0
   :inventory        0.0
   :max-in-batch     10.0
   :moisture         5.0
   :name             "Black Barley"
   :notes            "Unmalted roasted barley for stouts, porters"
   :origin           "United States"
   :potential        1.036
   :protein          13.2
   :recommend-mash   false
   :supplier         "Gnome Brew"
   :type             "Grain"
   :version          1
   :yield            78.0})


(def sample-fermentable-wrapper
  "A hard-coded sample fermentable-wrapper for static unit tests"
  {:fermentable sample-fermentable})


(def sample-fermentables
  "A hard-coded sample fermentables for static unit tests"
  [sample-fermentable-wrapper])


(def sample-fermentables-wrapper
  "A hard-coded sample fermentables-wrapper for static unit tests"
  {:fermentables sample-fermentables})


(deftest type-test
  (testing "Ensure type map contains all fermentable types"
    (is (contains? fermentables/fermentable-types fermentables/adjunct)
        "Type map should contain adjuncts")
    (is (contains? fermentables/fermentable-types fermentables/dry-extract)
        "Type map should contain dry extract")
    (is (contains? fermentables/fermentable-types fermentables/extract)
        "Type map should contain extract")
    (is (contains? fermentables/fermentable-types fermentables/grain)
        "Type map should contain grain")
    (is (contains? fermentables/fermentable-types fermentables/sugar)
        "Type map should contain sugar"))
  (testing "Ensure type set only contains known fermentable types"
    (is (= #{} (disj fermentables/fermentable-types
                     fermentables/adjunct
                     fermentables/dry-extract
                     fermentables/extract
                     fermentables/grain
                     fermentables/sugar)))))


(deftest static-test-data-check
  (testing "Since this library assumes common-beer-format data is utilized, make sure static test data conforms"
    (is (spoon.spec/test-valid? ::fermentables/fermentable sample-fermentable)
        "Static test data should conform to common-beer-format.fermentable/fermentable")
    (is (spoon.spec/test-valid? ::fermentables/fermentable-wrapper sample-fermentable-wrapper)
        "Static test data should conform to common-beer-format.fermentable/fermentable-wrapper")
    (is (spoon.spec/test-valid? ::fermentables/fermentables sample-fermentables)
        "Static test data should conform to common-beer-format.fermentable/fermentables")
    (is (spoon.spec/test-valid? ::fermentables/fermentables-wrapper sample-fermentables-wrapper)
        "Static test data should conform to common-beer-format.fermentable/fermentables-wrapper")))


(deftest static-keys-test
  (testing "Ensure static keys exist within complete fermentable records and point to valid data"
    (is (contains? sample-fermentable fermentables/add-after-boil)
        "Static test data should contain a key for add-after-boil")
    (is (spoon.spec/test-valid? ::primitives/boolean (sample-fermentable fermentables/add-after-boil))
        "Static test data should contain a valid add-after-boil")
    (is (contains? sample-fermentable fermentables/amount)
        "Static test data should contain a key for amount")
    (is (spoon.spec/test-valid? ::primitives/amount (sample-fermentable fermentables/amount))
        "Static test data should contain a valid amount")
    (is (contains? sample-fermentable fermentables/coarse-fine-diff)
        "Static test data should contain a key for coarse-fine-diff")
    (is (spoon.spec/test-valid? ::fermentables/coarse-fine-diff (sample-fermentable fermentables/coarse-fine-diff))
        "Static test data should contain a valid coarse-fine-diff")
    (is (contains? sample-fermentable fermentables/color)
        "Static test data should contain a key for color")
    (is (spoon.spec/test-valid? ::fermentables/color (sample-fermentable fermentables/color))
        "Static test data should contain a valid color")
    (is (contains? sample-fermentable fermentables/diastatic-power)
        "Static test data should contain a key for diastatic-power")
    (is (spoon.spec/test-valid? ::fermentables/diastatic-power (sample-fermentable fermentables/diastatic-power))
        "Static test data should contain a valid diastatic-power")
    (is (contains? sample-fermentable fermentables/display-amount)
        "Static test data should contain a key for display-amount")
    (is (spoon.spec/test-valid? ::primitives/display-amount (sample-fermentable fermentables/display-amount))
        "Static test data should contain a valid display-amount")
    (is (contains? sample-fermentable fermentables/display-color)
        "Static test data should contain a key for display-color")
    (is (spoon.spec/test-valid? ::fermentables/display-color (sample-fermentable fermentables/display-color))
        "Static test data should contain a valid display-color")
    (is (contains? sample-fermentable fermentables/ibu-gal-per-lb)
        "Static test data should contain a key for ibu-gal-per-lb")
    (is (spoon.spec/test-valid? ::fermentables/ibu-gal-per-lb (sample-fermentable fermentables/ibu-gal-per-lb))
        "Static test data should contain a valid ibu-gal-per-lb")
    (is (contains? sample-fermentable fermentables/inventory)
        "Static test data should contain a key for inventory")
    (is (spoon.spec/test-valid? ::primitives/amount (sample-fermentable fermentables/inventory))
        "Static test data should contain a valid inventory")
    (is (contains? sample-fermentable fermentables/max-in-batch)
        "Static test data should contain a key for max-in-batch")
    (is (spoon.spec/test-valid? ::fermentables/max-in-batch (sample-fermentable fermentables/max-in-batch))
        "Static test data should contain a valid max-in-batch")
    (is (contains? sample-fermentable fermentables/moisture)
        "Static test data should contain a key for moisture")
    (is (spoon.spec/test-valid? ::fermentables/moisture (sample-fermentable fermentables/moisture))
        "Static test data should contain a valid moisture")
    (is (contains? sample-fermentable fermentables/name)
        "Static test data should contain a key for name")
    (is (spoon.spec/test-valid? ::primitives/name (sample-fermentable fermentables/name))
        "Static test data should contain a valid name")
    (is (contains? sample-fermentable fermentables/notes)
        "Static test data should contain a key for notes")
    (is (spoon.spec/test-valid? ::primitives/notes (sample-fermentable fermentables/notes))
        "Static test data should contain a valid notes")
    (is (contains? sample-fermentable fermentables/origin)
        "Static test data should contain a key for origin")
    (is (spoon.spec/test-valid? ::primitives/origin (sample-fermentable fermentables/origin))
        "Static test data should contain a valid origin")
    (is (contains? sample-fermentable fermentables/potential)
        "Static test data should contain a key for potential")
    (is (spoon.spec/test-valid? ::fermentables/potential (sample-fermentable fermentables/potential))
        "Static test data should contain a valid potential")
    (is (contains? sample-fermentable fermentables/protein)
        "Static test data should contain a key for protein")
    (is (spoon.spec/test-valid? ::fermentables/protein (sample-fermentable fermentables/protein))
        "Static test data should contain a valid protein")
    (is (contains? sample-fermentable fermentables/recommend-mash)
        "Static test data should contain a key for recommend-mash")
    (is (spoon.spec/test-valid? ::primitives/boolean (sample-fermentable fermentables/recommend-mash))
        "Static test data should contain a valid recommend-mash")
    (is (contains? sample-fermentable fermentables/supplier)
        "Static test data should contain a key for supplier")
    (is (spoon.spec/test-valid? ::fermentables/supplier (sample-fermentable fermentables/supplier))
        "Static test data should contain a valid supplier")
    (is (contains? sample-fermentable fermentables/type)
        "Static test data should contain a key for type")
    (is (spoon.spec/test-valid? ::fermentables/type (sample-fermentable fermentables/type))
        "Static test data should contain a valid type")
    (is (contains? sample-fermentable fermentables/version)
        "Static test data should contain a key for version")
    (is (spoon.spec/test-valid? ::primitives/version (sample-fermentable fermentables/version))
        "Static test data should contain a valid version")
    (is (contains? sample-fermentable fermentables/yield)
        "Static test data should contain a key for yield")
    (is (spoon.spec/test-valid? ::fermentables/yield (sample-fermentable fermentables/yield))
        "Static test data should contain a valid yield")
    (is (contains? sample-fermentable-wrapper fermentables/fermentable)
        "Static test data should contain a key for fermentable")
    (is (spoon.spec/test-valid? ::fermentables/fermentable (sample-fermentable-wrapper fermentables/fermentable))
        "Static test data should contain a valid fermentable")
    (is (contains? sample-fermentables-wrapper fermentables/fermentables)
        "Static test data should contain a key for fermentables")
    (is (spoon.spec/test-valid? ::fermentables/fermentables (sample-fermentables-wrapper fermentables/fermentables))
        "Static test data should contain a valid fermentables"))
  (testing "Sample fermentables only contains valid keys"
    (is (= {}
           (dissoc sample-fermentable
                   fermentables/add-after-boil
                   fermentables/amount
                   fermentables/coarse-fine-diff
                   fermentables/color
                   fermentables/diastatic-power
                   fermentables/display-amount
                   fermentables/display-color
                   fermentables/ibu-gal-per-lb
                   fermentables/inventory
                   fermentables/max-in-batch
                   fermentables/moisture
                   fermentables/name
                   fermentables/notes
                   fermentables/origin
                   fermentables/potential
                   fermentables/protein
                   fermentables/recommend-mash
                   fermentables/supplier
                   fermentables/type
                   fermentables/version
                   fermentables/yield)))
    (is (= {} (dissoc sample-fermentable-wrapper fermentables/fermentable)))
    (is (= {} (dissoc sample-fermentables-wrapper fermentables/fermentables)))))
