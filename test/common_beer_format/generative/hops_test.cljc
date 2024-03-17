(ns common-beer-format.generative.hops-test
  (:require #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])
            [clojure.spec.alpha :as spec]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.hops :as hops]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as primitives]))


(deftest data-requirement-test
  (testing "Object specs require data"
    (is (not (spec/valid? ::hops/hop nil)))
    (is (not (spec/valid? ::hops/hop [])))
    (is (not (spec/valid? ::hops/hop {})))
    (is (not (spec/valid? ::hops/hop-wrapper nil)))
    (is (not (spec/valid? ::hops/hop-wrapper [])))
    (is (not (spec/valid? ::hops/hop-wrapper {})))
    (is (not (spec/valid? ::hops/hops-wrapper nil)))
    (is (not (spec/valid? ::hops/hops-wrapper [])))
    (is (not (spec/valid? ::hops/hops-wrapper {}))))
  (testing "Collection specs may be empty, but must be vectors"
    (is (not (spec/valid? ::hops/hops nil)))
    (is (spoon.spec/test-valid? ::hops/hops []))
    (is (not (spec/valid? ::hops/hops {})))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::hops/myrcene))
    (is (gen/generatable? ::hops/use))
    (is (gen/generatable? ::hops/hops-wrapper))
    (is (gen/generatable? ::hops/form))
    (is (gen/generatable? ::hops/time))
    (is (gen/generatable? ::hops/beta))
    (is (gen/generatable? ::hops/hsi))
    (is (gen/generatable? ::hops/hops))
    (is (gen/generatable? ::hops/caryophyllene))
    (is (gen/generatable? ::hops/cohumulone))
    (is (gen/generatable? ::hops/hop-wrapper))
    (is (gen/generatable? ::hops/humulene))
    (is (gen/generatable? ::hops/type))
    (is (gen/generatable? ::hops/hop))
    (is (gen/generatable? ::hops/alpha))))

(deftest wrapper-test
  (testing "Ensure all wrapper specs are marked as such"
    (is (true? (impl/wrapper-spec? ::hops/hops-wrapper)))
    (is (true? (impl/wrapper-spec? ::hops/hop-wrapper))))
  (testing "Ensure all non-wrapper specs are not marked as such"
    (is (not (impl/wrapper-spec? ::hops/hops)))
    (is (not (impl/wrapper-spec? ::hops/hop)))
    (is (not (impl/wrapper-spec? ::hops/alpha)))
    (is (not (impl/wrapper-spec? ::hops/amount)))
    (is (not (impl/wrapper-spec? ::hops/beta)))
    (is (not (impl/wrapper-spec? ::hops/caryophyllene)))
    (is (not (impl/wrapper-spec? ::hops/cohumulone)))
    (is (not (impl/wrapper-spec? ::hops/display-amount)))
    (is (not (impl/wrapper-spec? ::hops/display-time)))
    (is (not (impl/wrapper-spec? ::hops/form)))
    (is (not (impl/wrapper-spec? ::hops/hsi)))
    (is (not (impl/wrapper-spec? ::hops/humulene)))
    (is (not (impl/wrapper-spec? ::hops/inventory)))
    (is (not (impl/wrapper-spec? ::hops/myrcene)))
    (is (not (impl/wrapper-spec? ::hops/name)))
    (is (not (impl/wrapper-spec? ::hops/notes)))
    (is (not (impl/wrapper-spec? ::hops/origin)))
    (is (not (impl/wrapper-spec? ::hops/substitutes)))
    (is (not (impl/wrapper-spec? ::hops/time)))
    (is (not (impl/wrapper-spec? ::hops/type)))
    (is (not (impl/wrapper-spec? ::hops/use)))
    (is (not (impl/wrapper-spec? ::hops/version)))))


    (def sample-hop
      "A hard-coded sample hop for static unit tests"
      {:alpha          5.0
       :amount         0.0638
       :beta           3.0
       :caryophyllene  0.0
       :cohumulone     0.0
       :display-amount "6.38 g"
       :display-time   "60.1 min"
       :form           "Pellet"
       :hsi            0.0
       :humulene       0.0
       :inventory      "0.0 g"
       :myrcene        0.0
       :name           "Goldings, East Kent"
       :notes          "Great all purpose UK hop for ales, stouts, porters"
       :origin         "United Kingdom"
       :substitutes    "Fuggles, East Kent Goldings, Target"
       :time           60.1
       :type           "Bittering"
       :use            "Boil"
       :version        1})


    (def sample-hop-wrapper
      "A hard-coded sample hop-wrapper for static unit tests"
      {:hop sample-hop})


    (def sample-hops
      "A hard-coded sample hops for static unit tests"
      [sample-hop-wrapper])


    (def sample-hops-wrapper
      "A hard-coded sample hops-wrapper for static unit tests"
      {:hops sample-hops})


    (deftest type-test
      (testing "Ensure type map contains all hop types"
        (is (contains? hops/hop-types hops/aroma))
        (is (contains? hops/hop-types hops/bittering))
        (is (contains? hops/hop-types hops/both)))
      (testing "Ensure type set only contains known hop types"
        (is (= #{} (disj hops/hop-types
                         hops/aroma
                         hops/bittering
                         hops/both)))))


    (deftest use-test
      (testing "Ensure type map contains all hop usages"
        (is (contains? hops/hop-uses hops/boil))
        (is (contains? hops/hop-uses hops/dry-hop))
        (is (contains? hops/hop-uses hops/mash))
        (is (contains? hops/hop-uses hops/first-wort))
        (is (contains? hops/hop-uses hops/aroma)))
      (testing "Ensure type set only contains known hop usages"
        (is (= #{} (disj hops/hop-uses
                         hops/aroma
                         hops/boil
                         hops/dry-hop
                         hops/first-wort
                         hops/mash)))))


    (deftest form-test
      (testing "Ensure type map contains all hop forms"
        (is (contains? hops/hop-forms hops/pellet))
        (is (contains? hops/hop-forms hops/plug))
        (is (contains? hops/hop-forms hops/leaf)))
      (testing "Ensure type set only contains known hop forms"
        (is (= #{} (disj hops/hop-forms
                         hops/pellet
                         hops/plug
                         hops/leaf)))))


    (deftest static-keys-test
      (testing "Ensure all static keys are present"
        (is (contains? sample-hop hops/alpha)
            "Static hop must contain alpha key")
        (is (contains? sample-hop hops/amount)
            "Static hop must contain amount key")
        (is (contains? sample-hop hops/beta)
            "Static hop must contain beta key")
        (is (contains? sample-hop hops/caryophyllene)
            "Static hop must contain caryophyllene key")
        (is (contains? sample-hop hops/cohumulone)
            "Static hop must contain cohumulone key")
        (is (contains? sample-hop hops/display-amount)
            "Static hop must contain display-amount key")
        (is (contains? sample-hop hops/display-time)
            "Static hop must contain display-time key")
        (is (contains? sample-hop hops/form)
            "Static hop must contain form key")
        (is (contains? sample-hop hops/hsi)
            "Static hop must contain hsi key")
        (is (contains? sample-hop hops/humulene)
            "Static hop must contain humulene key")
        (is (contains? sample-hop hops/inventory)
            "Static hop must contain inventory key")
        (is (contains? sample-hop hops/myrcene)
            "Static hop must contain myrcene key")
        (is (contains? sample-hop hops/name)
            "Static hop must contain name key")
        (is (contains? sample-hop hops/notes)
            "Static hop must contain notes key")
        (is (contains? sample-hop hops/origin)
            "Static hop must contain origin key")
        (is (contains? sample-hop hops/substitutes)
            "Static hop must contain substitutes key")
        (is (contains? sample-hop hops/time)
            "Static hop must contain time key")
        (is (contains? sample-hop hops/type)
            "Static hop must contain type key")
        (is (contains? sample-hop hops/use)
            "Static hop must contain use key")
        (is (contains? sample-hop hops/version)
            "Static hop must contain version key")
        (is (contains? sample-hop-wrapper hops/hop)
            "Static hop wrapper must contain hop key")
        (is (contains? sample-hops-wrapper hops/hops)
            "Static hops wrapper must contain hops key"))
      (testing "Ensure all keys in the static hop point to valid data"
        (is (spec/valid? ::hops/alpha (sample-hop hops/alpha))
            "Static hop :alpha must be valid")
        (is (spec/valid? ::primitives/amount (sample-hop hops/amount))
            "Static hop :amount must be valid")
        (is (spec/valid? ::hops/beta (sample-hop hops/beta))
            "Static hop :beta must be valid")
        (is (spec/valid? ::hops/caryophyllene (sample-hop hops/caryophyllene))
            "Static hop :caryophyllene must be valid")
        (is (spec/valid? ::hops/cohumulone (sample-hop hops/cohumulone))
            "Static hop :cohumulone must be valid")
        (is (spec/valid? ::primitives/display-amount (sample-hop hops/display-amount))
            "Static hop :display-amount must be valid")
        (is (spec/valid? ::primitives/display-time (sample-hop hops/display-time))
            "Static hop :display-time must be valid")
        (is (spec/valid? ::hops/form (sample-hop hops/form))
            "Static hop :form must be valid")
        (is (spec/valid? ::hops/hsi (sample-hop hops/hsi))
            "Static hop :hsi must be valid")
        (is (spec/valid? ::hops/humulene (sample-hop hops/humulene))
            "Static hop :humulene must be valid")
        (is (spec/valid? ::primitives/inventory (sample-hop hops/inventory))
            "Static hop :inventory must be valid")
        (is (spec/valid? ::hops/myrcene (sample-hop hops/myrcene))
            "Static hop :myrcene must be valid")
        (is (spec/valid? ::primitives/name (sample-hop hops/name))
            "Static hop :name must be valid")
        (is (spec/valid? ::primitives/notes (sample-hop hops/notes))
            "Static hop :notes must be valid")
        (is (spec/valid? ::primitives/origin (sample-hop hops/origin))
            "Static hop :origin must be valid")
        (is (spec/valid? ::primitives/substitutes (sample-hop hops/substitutes))
            "Static hop :substitutes must be valid")
        (is (spec/valid? ::hops/time (sample-hop hops/time))
            "Static hop :time must be valid")
        (is (spec/valid? ::hops/type (sample-hop hops/type))
            "Static hop :type must be valid")
        (is (spec/valid? ::hops/use (sample-hop hops/use))
            "Static hop :use must be valid")
        (is (spec/valid? ::primitives/version (sample-hop hops/version))
            "Static hop :version must be valid")
        (is (spec/valid? ::hops/hop (sample-hop-wrapper hops/hop))
            "Static hop wrapper :hop must be valid")
        (is (spec/valid? ::hops/hops (sample-hops-wrapper hops/hops))
            "Static hops wrapper :hops must be valid"))
      (testing "Sample hops should only contain valid keys"
        (is (= {} (dissoc sample-hop
                          hops/alpha
                          hops/amount
                          hops/beta
                          hops/caryophyllene
                          hops/cohumulone
                          hops/display-amount
                          hops/display-time
                          hops/form
                          hops/hsi
                          hops/humulene
                          hops/inventory
                          hops/myrcene
                          hops/name
                          hops/notes
                          hops/origin
                          hops/substitutes
                          hops/time
                          hops/type
                          hops/use
                          hops/version)))
        (is (= {} (dissoc sample-hop-wrapper hops/hop)))
        (is (= {} (dissoc sample-hops-wrapper hops/hops)))))
