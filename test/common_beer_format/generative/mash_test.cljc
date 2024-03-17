(ns common-beer-format.generative.mash-test
  (:require [clojure.spec.alpha :as spec]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.mash :as mash]
            [common-beer-format.primitives :as primitives]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest data-requirements-test
  (testing "Objects specs require data"
    (is (not (spec/valid? ::mash/mash-step nil)))
    (is (not (spec/valid? ::mash/mash-step [])))
    (is (not (spec/valid? ::mash/mash-step {})))
    (is (not (spec/valid? ::mash/mash-step-wrapper nil)))
    (is (not (spec/valid? ::mash/mash-step-wrapper [])))
    (is (not (spec/valid? ::mash/mash-step-wrapper {})))
    (is (not (spec/valid? ::mash/mash nil)))
    (is (not (spec/valid? ::mash/mash [])))
    (is (not (spec/valid? ::mash/mash {}))))
  (testing "Collection specs may be empty, but must be vectors"
    (is (not (spec/valid? ::mash/mash-steps nil)))
    (is (spoon.spec/test-valid? ::mash/mash-steps []))
    (is (not (spec/valid? ::mash/mash-steps {})))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::mash/display-step-temp))
    (is (gen/generatable? ::mash/mash-wrapper))
    (is (gen/generatable? ::mash/display-grain-temp))
    (is (gen/generatable? ::mash/ramp-time))
    (is (gen/generatable? ::mash/grain-temp))
    (is (gen/generatable? ::mash/display-sparge-temp))
    (is (gen/generatable? ::mash/equip-adjust))
    (is (gen/generatable? ::mash/mash))
    (is (gen/generatable? ::mash/sparge-temp))
    (is (gen/generatable? ::mash/mash-steps))
    (is (gen/generatable? ::mash/mash-step-wrapper))
    (is (gen/generatable? ::mash/tun-specific-heat))
    (is (gen/generatable? ::mash/step-temp))
    (is (gen/generatable? ::mash/type))
    (is (gen/generatable? ::mash/display-tun-weight))
    (is (gen/generatable? ::mash/mash-step))
    (is (gen/generatable? ::mash/description))
    (is (gen/generatable? ::mash/decoction-amt))
    (is (gen/generatable? ::mash/infuse-temp))
    (is (gen/generatable? ::mash/infuse-amount))
    (is (gen/generatable? ::mash/end-temp))
    (is (gen/generatable? ::mash/display-infuse-amt))
    (is (gen/generatable? ::mash/step-time))
    (is (gen/generatable? ::mash/ph))
    (is (gen/generatable? ::mash/tun-temp))
    (is (gen/generatable? ::mash/display-tun-temp))
    (is (gen/generatable? ::mash/tun-weight))
    (is (gen/generatable? ::mash/water-grain-ratio))))


(def sample-mash-step
  "A hard-coded sample mash step for static unit tests"
  {:infuse-amount      10.0
   :name               "Conversion Step, 68C"
   :step-temp          68.0
   :step-time          60.0
   :type               "Infusion"
   :version            1
   :ramp-time          0.0
   :end-temp           68.0
   :description        "Conversion Step, 68C"
   :decoction-amt      0.0
   :infuse-temp        68.0
   :water-grain-ratio  1.25
   :display-step-temp  "68.0 C"
   :display-infuse-amt "10.0 qt"})


(def sample-mash-step-wrapper
  "A hard-coded sample mash-step-wrapper for static unit tests"
  {:mash-step sample-mash-step})


(def sample-mash-steps
  "A hard-coded sample mash-steps for static unit tests"
  [sample-mash-step-wrapper])


(def sample-mash-steps-wrapper
  "A hard-coded sample mash-steps-wrapper for static unit tests"
  {:mash-steps sample-mash-steps})


(def sample-mash
  "A hard-coded sample mash for static unit tests"
  (merge {:name                "Single Step Infusion, 68 C"
          :version             1
          :grain-temp          22.0
          :notes               "Single Step Infusion, 68 C"
          :tun-temp            22.0
          :sparge-temp         75.0
          :ph                  5.4
          :tun-weight          50.0
          :tun-specific-heat   0.12
          :equip-adjust        false
          :display-grain-temp  "22.0 C"
          :display-tun-temp    "22.0 C"
          :display-tun-weight  "50.0 lb"
          :display-sparge-temp "75.0 C"}
         sample-mash-steps-wrapper))


(def sample-mash-wrapper
  "A hard-coded sample mash-wrapper for static unit tests"
  {:mash sample-mash})

(def sample-mashs
  "A hard-coded sample mashs for static unit tests"
  [sample-mash-wrapper])

(def sample-mashs-wrapper
  "A hard-coded sample mashs-wrapper for static unit tests"
  {:mashs sample-mashs})


(deftest mash-step-type-test
  (testing "Ensure type map contains all mash step types"
    (is (contains? mash/mash-step-types mash/infusion))
    (is (contains? mash/mash-step-types mash/decoction))
    (is (contains? mash/mash-step-types mash/temperature)))
  (testing "Ensure type map contains only known mash step types"
    (is (= #{} (disj mash/mash-step-types
                     mash/infusion
                     mash/decoction
                     mash/temperature)))))


(deftest static-test-data-check
  (testing "Since this library assumes common-beer-format data is utilized, make sure static test data conforms"
    (is (spoon.spec/test-valid? ::mash/mash-step sample-mash-step)
        "Static test data should conform to common-beer-format.hop/mash-step")
    (is (spoon.spec/test-valid? ::mash/mash-step-wrapper sample-mash-step-wrapper)
        "Static test data should conform to common-beer-format.hop/mash-step-wrapper")
    (is (spoon.spec/test-valid? ::mash/mash-steps sample-mash-steps)
        "Static test data should conform to common-beer-format.hop/mash-steps")
    (is (spoon.spec/test-valid? ::mash/mash sample-mash)
        "Static test data should conform to common-beer-format.hop/mash")
    (is (spoon.spec/test-valid? ::mash/mash-wrapper sample-mash-wrapper)
        "Static test data should conform to common-beer-format.hop/mash-wrapper")
    (is (spoon.spec/test-valid? ::mash/mashs sample-mashs)
        "Static test data should conform to common-beer-format.hop/mashs")
    (is (spoon.spec/test-valid? ::mash/mashs-wrapper sample-mashs-wrapper)
        "Static test data should conform to common-beer-format.hop/mashs-wrapper")))


(deftest static-keys-test
  (testing "Ensure static keys exist within complete records"
    (testing "mash-steps"
      (is (contains? sample-mash-step mash/name)
          "mash-step should contain name")
      (is (contains? sample-mash-step mash/infuse-amount)
          "mash-step should contain infuse-amount")
      (is (contains? sample-mash-step mash/step-temp)
          "mash-step should contain step-temp")
      (is (contains? sample-mash-step mash/step-time)
          "mash-step should contain step-time")
      (is (contains? sample-mash-step mash/type)
          "mash-step should contain type")
      (is (contains? sample-mash-step mash/version)
          "mash-step should contain version")
      (is (contains? sample-mash-step mash/ramp-time)
          "mash-step should contain ramp-time")
      (is (contains? sample-mash-step mash/end-temp)
          "mash-step should contain end-temp")
      (is (contains? sample-mash-step mash/description)
          "mash-step should contain description")
      (is (contains? sample-mash-step mash/decoction-amt)
          "mash-step should contain decoction-amt")
      (is (contains? sample-mash-step mash/infuse-temp)
          "mash-step should contain infuse-temp")
      (is (contains? sample-mash-step mash/water-grain-ratio)
          "mash-step should contain water-grain-ratio")
      (is (contains? sample-mash-step mash/display-step-temp)
          "mash-step should contain display-step-temp")
      (is (contains? sample-mash-step mash/display-infuse-amt)
          "mash-step should contain display-infuse-amt"))
    (testing "mash-step-wrapper"
      (is (contains? sample-mash-step-wrapper mash/mash-step)
          "mash-step-wrapper should contain mash-step"))
    (testing "mash"
      (is (contains? sample-mash mash/name)
          "mash should contain name")
      (is (contains? sample-mash mash/version)
          "mash should contain version")
      (is (contains? sample-mash mash/grain-temp)
          "mash should contain grain-temp")
      (is (contains? sample-mash mash/notes)
          "mash should contain notes")
      (is (contains? sample-mash mash/tun-temp)
          "mash should contain tun-temp")
      (is (contains? sample-mash mash/sparge-temp)
          "mash should contain sparge-temp")
      (is (contains? sample-mash mash/ph)
          "mash should contain ph")
      (is (contains? sample-mash mash/tun-weight)
          "mash should contain tun-weight")
      (is (contains? sample-mash mash/tun-specific-heat)
          "mash should contain tun-specific-heat")
      (is (contains? sample-mash mash/equip-adjust)
          "mash should contain equip-adjust")
      (is (contains? sample-mash mash/display-grain-temp)
          "mash should contain display-grain-temp")
      (is (contains? sample-mash mash/display-tun-temp)
          "mash should contain display-tun-temp")
      (is (contains? sample-mash mash/display-tun-weight)
          "mash should contain display-tun-weight")
      (is (contains? sample-mash mash/display-sparge-temp)
          "mash should contain display-sparge-temp"))
    (testing "mash-wrapper"
      (is (contains? sample-mash-wrapper mash/mash)
          "mash-wrapper should contain mash")))
  (testing "sample data only contains valid keys"
    (testing "mash-steps"
      (is (= {} (dissoc sample-mash-step
                        mash/name
                        mash/infuse-amount
                        mash/step-temp
                        mash/step-time
                        mash/type
                        mash/version
                        mash/ramp-time
                        mash/end-temp
                        mash/description
                        mash/decoction-amt
                        mash/infuse-temp
                        mash/water-grain-ratio
                        mash/display-step-temp
                        mash/display-infuse-amt))
          "mash-step should only contain valid keys"))
    (testing "mash-step-wrapper"
      (is (= {} (dissoc sample-mash-step-wrapper
                        mash/mash-step))
          "mash-step-wrapper should only contain valid keys"))
    (testing "mash"
      (is (= {} (dissoc sample-mash
                        mash/name
                        mash/version
                        mash/grain-temp
                        mash/notes
                        mash/tun-temp
                        mash/sparge-temp
                        mash/ph
                        mash/tun-weight
                        mash/tun-specific-heat
                        mash/equip-adjust
                        mash/display-grain-temp
                        mash/display-tun-temp
                        mash/display-tun-weight
                        mash/display-sparge-temp
                        mash/mash-steps))
          "mash should only contain valid keys")))
  (testing "Sample data keys should point to valid data"
    (testing "mash-steps"
      (is (spoon.spec/test-valid? ::primitives/name (get sample-mash-step mash/name))
          "mash-step name should be valid")
      (is (spoon.spec/test-valid? ::mash/infuse-amount (get sample-mash-step mash/infuse-amount))
          "mash-step infuse-amount should be valid")
      (is (spoon.spec/test-valid? ::mash/step-temp (get sample-mash-step mash/step-temp))
          "mash-step step-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/step-time (get sample-mash-step mash/step-time))
          "mash-step step-time should be valid")
      (is (spoon.spec/test-valid? ::mash/type (get sample-mash-step mash/type))
          "mash-step type should be valid")
      (is (spoon.spec/test-valid? ::primitives/version (get sample-mash-step mash/version))
          "mash-step version should be valid")
      (is (spoon.spec/test-valid? ::mash/ramp-time (get sample-mash-step mash/ramp-time))
          "mash-step ramp-time should be valid")
      (is (spoon.spec/test-valid? ::mash/end-temp (get sample-mash-step mash/end-temp))
          "mash-step end-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/description (get sample-mash-step mash/description))
          "mash-step description should be valid")
      (is (spoon.spec/test-valid? ::mash/decoction-amt (get sample-mash-step mash/decoction-amt))
          "mash-step decoction-amt should be valid")
      (is (spoon.spec/test-valid? ::mash/infuse-temp (get sample-mash-step mash/infuse-temp))
          "mash-step infuse-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/water-grain-ratio (get sample-mash-step mash/water-grain-ratio))
          "mash-step water-grain-ratio should be valid")
      (is (spoon.spec/test-valid? ::mash/display-step-temp (get sample-mash-step mash/display-step-temp))
          "mash-step display-step-temp should be valid"))
    (testing "mash-step-wrapper"
      (is (spoon.spec/test-valid? ::mash/mash-step (get sample-mash-step-wrapper mash/mash-step))
          "mash-step-wrapper mash-step should be valid"))
    (testing "mash"
      (is (spoon.spec/test-valid? ::primitives/name (get sample-mash mash/name))
          "mash name should be valid")
      (is (spoon.spec/test-valid? ::primitives/version (get sample-mash mash/version))
          "mash version should be valid")
      (is (spoon.spec/test-valid? ::mash/grain-temp (get sample-mash mash/grain-temp))
          "mash grain-temp should be valid")
      (is (spoon.spec/test-valid? ::primitives/notes (get sample-mash mash/notes))
          "mash notes should be valid")
      (is (spoon.spec/test-valid? ::mash/tun-temp (get sample-mash mash/tun-temp))
          "mash tun-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/sparge-temp (get sample-mash mash/sparge-temp))
          "mash sparge-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/ph (get sample-mash mash/ph))
          "mash ph should be valid")
      (is (spoon.spec/test-valid? ::mash/tun-weight (get sample-mash mash/tun-weight))
          "mash tun-weight should be valid")
      (is (spoon.spec/test-valid? ::mash/tun-specific-heat (get sample-mash mash/tun-specific-heat))
          "mash tun-specific-heat should be valid")
      (is (spoon.spec/test-valid? ::mash/equip-adjust (get sample-mash mash/equip-adjust))
          "mash equip-adjust should be valid")
      (is (spoon.spec/test-valid? ::mash/display-grain-temp (get sample-mash mash/display-grain-temp))
          "mash display-grain-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/display-tun-temp (get sample-mash mash/display-tun-temp))
          "mash display-tun-temp should be valid")
      (is (spoon.spec/test-valid? ::mash/display-tun-weight (get sample-mash mash/display-tun-weight))
          "mash display-tun-weight should be valid")
      (is (spoon.spec/test-valid? ::mash/display-sparge-temp (get sample-mash mash/display-sparge-temp))
          "mash display-sparge-temp should be valid"))))
