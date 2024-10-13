(ns common-beer-format.generative.miscs-test
  (:require [clojure.spec.alpha :as spec]
            [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.miscs :as miscs]
            [common-beer-format.primitives :as primitives]))


(deftest data-requirement-test
  (testing "Object specs require data"
    (is (not (spec/valid? ::miscs/misc nil)))
    (is (not (spec/valid? ::miscs/misc [])))
    (is (not (spec/valid? ::miscs/misc {})))
    (is (not (spec/valid? ::miscs/misc-wrapper nil)))
    (is (not (spec/valid? ::miscs/misc-wrapper [])))
    (is (not (spec/valid? ::miscs/misc-wrapper {})))
    (is (not (spec/valid? ::miscs/miscs-wrapper nil)))
    (is (not (spec/valid? ::miscs/miscs-wrapper [])))
    (is (not (spec/valid? ::miscs/miscs-wrapper {}))))
  (testing "Collection specs may be empty, but must be vectors"
    (is (not (spec/valid? ::miscs/miscs nil)))
    (is (spoon.spec/test-valid? ::miscs/miscs []))
    (is (not (spec/valid? ::miscs/miscs {})))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::miscs/miscs-wrapper))
    (is (gen/generatable? ::miscs/use-for))
    (is (gen/generatable? ::miscs/misc))
    (is (gen/generatable? ::miscs/type))
    (is (gen/generatable? ::miscs/misc-wrapper))
    (is (gen/generatable? ::miscs/miscs))
    (is (gen/generatable? ::miscs/use))
    (is (gen/generatable? ::miscs/time))))


(def sample-misc
  "A hard-coded sample misc for static unit tests"
  {:amount           0.010
   :amount-is-weight false
   :display-amount   "10.0 g"
   :display-time     "15 min"
   :inventory        0.0
   :name             "Irish Moss"
   :notes            "Used as a clarifying agent during the last few minutes of the boil"
   :time             15.0
   :type             "Fining"
   :use              "Boil"
   :use-for          "Boil"
   :version          1})


(def sample-misc-wrapper
  "A hard-coded sample misc-wrapper for static unit tests"
  {miscs/misc sample-misc})


(def sample-miscs
  "A hard-coded sample miscs for static unit tests"
  [sample-misc-wrapper])


(def sample-miscs-wrapper
  "A hard-coded sample miscs-wrapper for static unit tests"
  {miscs/miscs sample-miscs})


(deftest static-test-data-check
  (testing "Since this library assumes common-beer-format data is utilized, make sure static test data conforms"
    (is (spoon.spec/test-valid? ::miscs/misc sample-misc)
        "Static test data should conform to common-beer-format.misc/misc")
    (is (spoon.spec/test-valid? ::miscs/misc-wrapper sample-misc-wrapper)
        "Static test data should conform to common-beer-format.misc/misc-wrapper")
    (is (spoon.spec/test-valid? ::miscs/miscs sample-miscs)
        "Static test data should conform to common-beer-format.misc/miscs")
    (is (spoon.spec/test-valid? ::miscs/miscs-wrapper sample-miscs-wrapper)
        "Static test data should conform to common-beer-format.misc/miscs-wrapper")))


(deftest type-test
  (testing "Ensure type map contains all misc types"
    (is (contains? miscs/misc-types miscs/fining)
        "Type map should contain fining agents")
    (is (contains? miscs/misc-types miscs/flavor)
        "Type map should contain dry flavoring")
    (is (contains? miscs/misc-types miscs/herb)
        "Type map should contain herbs")
    (is (contains? miscs/misc-types miscs/other)
        "Type map should contain other miscs")
    (is (contains? miscs/misc-types miscs/spice)
        "Type map should contain spices")
    (is (contains? miscs/misc-types miscs/water-agent)
        "Type map should contain water-agents"))
  (testing "Ensure type set only contains known misc types"
    (is (= #{} (disj miscs/misc-types
                     miscs/fining
                     miscs/flavor
                     miscs/herb
                     miscs/other
                     miscs/spice
                     miscs/water-agent)))))


(deftest use-test
  (testing "Ensure use map contains all misc uese"
    (is (contains? miscs/misc-uses miscs/boil)
        "Use map should contain in-boil ingredients")
    (is (contains? miscs/misc-uses miscs/mash)
        "Use map should contain mash-based additions")
    (is (contains? miscs/misc-uses miscs/primary)
        "Use map should contain primary fermentation ingredients")
    (is (contains? miscs/misc-uses miscs/secondary)
        "Use map should contain secondary fermentation ingredients")
    (is (contains? miscs/misc-uses miscs/bottling)
        "Use map should contain bottling reagents"))
  (testing "Ensure use set only contains known misc uses"
    (is (= #{} (disj miscs/misc-uses
                     miscs/boil
                     miscs/mash
                     miscs/primary
                     miscs/secondary
                     miscs/bottling)))))


(deftest static-keys-test
  (testing "Ensure static keys exist within complete records"
    (is (contains? sample-misc :amount)
        "Static test data should contain :amount")
    (is (contains? sample-misc :amount-is-weight)
        "Static test data should contain :amount-is-weight")
    (is (contains? sample-misc :display-amount)
        "Static test data should contain :display-amount")
    (is (contains? sample-misc :display-time)
        "Static test data should contain :display-time")
    (is (contains? sample-misc :inventory)
        "Static test data should contain :inventory")
    (is (contains? sample-misc :name)
        "Static test data should contain :name")
    (is (contains? sample-misc :notes)
        "Static test data should contain :notes")
    (is (contains? sample-misc :time)
        "Static test data should contain :time")
    (is (contains? sample-misc :type)
        "Static test data should contain :type")
    (is (contains? sample-misc :use)
        "Static test data should contain :use")
    (is (contains? sample-misc :use-for)
        "Static test data should contain :use-for")
    (is (contains? sample-misc :version)
        "Static test data should contain :version")
    (is (contains? sample-misc-wrapper :misc)
        "Static test data should contain :misc")
    (is (contains? sample-miscs-wrapper :miscs)
        "Static test data should contain :miscs"))
  (testing "Static keys should point to vali data"
    (is (spoon.spec/test-valid? ::miscs/misc (get sample-misc-wrapper miscs/misc))
        "Static test data should contain valid :misc")
    (is (spoon.spec/test-valid? ::miscs/miscs (get sample-miscs-wrapper miscs/miscs))
        "Static test data should contain valid :miscs")
    (is (spoon.spec/test-valid? ::primitives/name (get sample-misc miscs/name))
        "Static test data should contain valid :name")
    (is (spoon.spec/test-valid? ::primitives/amount (get sample-misc miscs/amount))
        "Static test data should contain valid :amount")
    (is (spoon.spec/test-valid? ::primitives/version (get sample-misc miscs/version))
        "Static test data should contain valid :version")
    (is (spoon.spec/test-valid? ::primitives/inventory (get sample-misc miscs/inventory))
        "Static test data should contain valid :inventory")
    (is (spoon.spec/test-valid? ::primitives/notes (get sample-misc miscs/notes))
        "Static test data should contain valid :notes")
    (is (spoon.spec/test-valid? ::primitives/display-amount (get sample-misc miscs/display-amount))
        "Static test data should contain valid :display-amount")
    (is (spoon.spec/test-valid? ::primitives/display-time (get sample-misc miscs/display-time))
        "Static test data should contain valid :display-time")
    (is (spoon.spec/test-valid? ::primitives/amount-is-weight (get sample-misc miscs/amount-is-weight))
        "Static test data should contain valid :amount-is-weight")
    (is (spoon.spec/test-valid? ::miscs/time (get sample-misc miscs/time))
        "Static test data should contain valid :time")
    (is (spoon.spec/test-valid? ::miscs/use (get sample-misc miscs/use))
        "Static test data should contain valid :use")
    (is (spoon.spec/test-valid? ::miscs/use-for (get sample-misc miscs/use-for))
        "Static test data should contain valid :use-for")
    (is (spoon.spec/test-valid? ::miscs/type (get sample-misc miscs/type))
        "Static test data should contain valid :type"))
  (testing "Static maps only contain valid keys"
    (is (= {} (dissoc sample-misc
                      miscs/amount
                      miscs/amount-is-weight
                      miscs/display-amount
                      miscs/display-time
                      miscs/inventory
                      miscs/name
                      miscs/notes
                      miscs/time
                      miscs/type
                      miscs/use
                      miscs/use-for
                      miscs/version)))
    (is (= {} (dissoc sample-misc-wrapper miscs/misc)))
    (is (= {} (dissoc sample-miscs-wrapper miscs/miscs)))))
