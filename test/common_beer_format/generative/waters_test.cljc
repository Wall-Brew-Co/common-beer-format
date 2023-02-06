(ns common-beer-format.generative.waters-test
  (:require [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.waters :as waters]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::waters/sodium))
    (is (gen/generatable? ::waters/magnesium))
    (is (gen/generatable? ::waters/chloride))
    (is (gen/generatable? ::waters/waters))
    (is (gen/generatable? ::waters/water))
    (is (gen/generatable? ::waters/ph))
    (is (gen/generatable? ::waters/water-wrapper))
    (is (gen/generatable? ::waters/waters-wrapper))
    (is (gen/generatable? ::waters/bicarbonate))
    (is (gen/generatable? ::waters/calcium))
    (is (gen/generatable? ::waters/sulfate))))


(def ^:const sample-water
  "A hard-coded sample water for static unit tests"
  {:amount         20.0
   :bicarbonate    300.0
   :calcium        295.0
   :chloride       25.0
   :display-amount "20.0 L"
   :magnesium      45.0
   :name           "Chicago"
   :notes          "The best there is"
   :ph             8.0
   :sodium         55.0
   :sulfate        725.0
   :version        1})


(def ^:const sample-water-wrapper
  "A hard-coded sample water-wrapper for static unit tests"
  {:water sample-water})


(def ^:const sample-waters
  "A hard-coded sample waters for static unit tests"
  [sample-water-wrapper])


(def ^:const sample-waters-wrapper
  "A hard-coded sample waters-wrapper for static unit tests"
  {:waters sample-waters})


(deftest static-keys-test
  (testing "Ensure all static keys can be used to access data"
    (is (contains? sample-water waters/name)
        "sample-water should contain :name")
    (is (contains? sample-water waters/version)
        "sample-water should contain :version")
    (is (contains? sample-water waters/amount)
        "sample-water should contain :amount")
    (is (contains? sample-water waters/ph)
        "sample-water should contain :ph")
    (is (contains? sample-water waters/sodium)
        "sample-water should contain :sodium")
    (is (contains? sample-water waters/magnesium)
        "sample-water should contain :magnesium")
    (is (contains? sample-water waters/chloride)
        "sample-water should contain :chloride")
    (is (contains? sample-water waters/sulfate)
        "sample-water should contain :sulfate")
    (is (contains? sample-water waters/calcium)
        "sample-water should contain :calcium")
    (is (contains? sample-water waters/bicarbonate)
        "sample-water should contain :bicarbonate")
    (is (contains? sample-water waters/notes)
        "sample-water should contain :notes")
    (is (contains? sample-water waters/display-amount)
        "sample-water should contain :display-amount")
    (is (contains? sample-water-wrapper waters/water)
        "sample-water-wrapper should contain :water")
    (is (contains? sample-waters-wrapper waters/waters)
        "sample-waters-wrapper should contain :waters"))
  (testing "Sample test data is valid"
    (is (spoon.spec/test-valid? ::waters/water sample-water))
    (is (spoon.spec/test-valid? ::waters/waters sample-waters))
    (is (spoon.spec/test-valid? ::waters/water-wrapper sample-water-wrapper))
    (is (spoon.spec/test-valid? ::waters/waters-wrapper sample-waters-wrapper)))
  (testing "Sample water should only contain valid keys"
    (is (= {} (dissoc sample-water
                      waters/amount
                      waters/bicarbonate
                      waters/calcium
                      waters/chloride
                      waters/magnesium
                      waters/name
                      waters/notes
                      waters/ph
                      waters/sodium
                      waters/sulfate
                      waters/version
                      waters/display-amount)))))
