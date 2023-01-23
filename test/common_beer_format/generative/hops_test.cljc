(ns common-beer-format.generative.hops-test
  (:require [clojure.spec.alpha :as spec]
            [clojure.test :refer :all]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.hops :as hops]
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

(def ^:const sample-hop
  "A hard-coded sample hop for static unit tests"
  {:alpha          5.0
   :amount         0.0638
   :beta           3.0
   :caryophyllene  0.0
   :cohumulone     0.0
   :display-amount "6.38 g"
   :display-time   "60.1 min"
   :form           "pellet"
   :hsi            0.0
   :humulene       0.0
   :inventory      "0.0 g"
   :myrcene        0.0
   :name           "Goldings, East Kent"
   :notes          "Great all purpose UK hop for ales, stouts, porters"
   :origin         "United Kingdom"
   :substitutes    "Fuggles, East Kent Goldings, Target"
   :time           60.1
   :type           "bittering"
   :use            "Boil"
   :version        1})

(def ^:const sample-hop-wrapper
  "A hard-coded sample hop-wrapper for static unit tests"
  {:hop sample-hop})


(def ^:const sample-hops
  "A hard-coded sample hops for static unit tests"
  [sample-hop-wrapper])


(def ^:const sample-hops-wrapper
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
    (is (contains? sample-hop hops/alpha))
    (is (contains? sample-hop hops/amount))
    (is (contains? sample-hop hops/beta))
    (is (contains? sample-hop hops/caryophyllene))
    (is (contains? sample-hop hops/cohumulone))
    (is (contains? sample-hop hops/display-amount))
    (is (contains? sample-hop hops/display-time))
    (is (contains? sample-hop hops/form))
    (is (contains? sample-hop hops/hsi))
    (is (contains? sample-hop hops/humulene))
    (is (contains? sample-hop hops/inventory))
    (is (contains? sample-hop hops/myrcene))
    (is (contains? sample-hop hops/name))
    (is (contains? sample-hop hops/notes))
    (is (contains? sample-hop hops/origin))
    (is (contains? sample-hop hops/substitutes))
    (is (contains? sample-hop hops/time))
    (is (contains? sample-hop hops/type))
    (is (contains? sample-hop hops/use))
    (is (contains? sample-hop hops/version))
    (is (contains? sample-hop-wrapper hops/hop))
    (is (contains? sample-hops-wrapper hops/hops)))
  (testing "Ensure all keys in the static hop point to valid data"
    (is (spec/valid? ::hops/alpha (sample-hop hops/alpha)))
    (is (spec/valid? ::primitives/amount (sample-hop hops/amount)))
    (is (spec/valid? ::hops/beta (sample-hop hops/beta)))
    (is (spec/valid? ::hops/caryophyllene (sample-hop hops/caryophyllene)))
    (is (spec/valid? ::hops/cohumulone (sample-hop hops/cohumulone)))
    (is (spec/valid? ::primitives/display-amount (sample-hop hops/display-amount)))
    (is (spec/valid? ::primitives/display-time (sample-hop hops/display-time)))
    (is (spec/valid? ::hops/form (sample-hop hops/form)))
    (is (spec/valid? ::hops/hsi (sample-hop hops/hsi)))
    (is (spec/valid? ::hops/humulene (sample-hop hops/humulene)))
    (is (spec/valid? ::primitives/inventory (sample-hop hops/inventory)))
    (is (spec/valid? ::hops/myrcene (sample-hop hops/myrcene)))
    (is (spec/valid? ::primitives/name (sample-hop hops/name)))
    (is (spec/valid? ::primitives/notes (sample-hop hops/notes)))
    (is (spec/valid? ::primitives/origin (sample-hop hops/origin)))
    (is (spec/valid? ::primitives/substitutes (sample-hop hops/substitutes)))
    (is (spec/valid? ::hops/time (sample-hop hops/time)))
    (is (spec/valid? ::hops/type (sample-hop hops/type)))
    (is (spec/valid? ::hops/use (sample-hop hops/use)))
    (is (spec/valid? ::primitives/version (sample-hop hops/version)))
    (is (spec/valid? ::hops/hop (sample-hop-wrapper hops/hop)))
    (is (spec/valid? ::hops/hops (sample-hops-wrapper hops/hops))))
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
