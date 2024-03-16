(ns common-beer-format.generative.equipment-test
  (:require [clojure.spec.alpha :as spec]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.equipment :as equipment]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.primitives :as primitives]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest data-requirement-test
  (testing "Object specs require data"
    (is (not (spec/valid? ::equipment/equipment nil)))
    (is (not (spec/valid? ::equipment/equipment [])))
    (is (not (spec/valid? ::equipment/equipment {})))
    (is (not (spec/valid? ::equipment/equipment-wrapper nil)))
    (is (not (spec/valid? ::equipment/equipment-wrapper [])))
    (is (not (spec/valid? ::equipment/equipment-wrapper {})))
    (is (not (spec/valid? ::equipment/equipments nil)))
    (is (not (spec/valid? ::equipment/equipments {})))
    (is (not (spec/valid? ::equipment/equipments-wrapper nil)))
    (is (not (spec/valid? ::equipment/equipments-wrapper [])))
    (is (not (spec/valid? ::equipment/equipments-wrapper {}))))
  (testing "Collection specs may be empty, but must be vectors"
    (is (not (spec/valid? ::equipment/equipments nil)))
    (is (spoon.spec/test-valid? ::equipment/equipments []))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::equipment/boil-size))
    (is (gen/generatable? ::equipment/batch-size))
    (is (gen/generatable? ::equipment/tun-volume))
    (is (gen/generatable? ::equipment/tun-weight))
    (is (gen/generatable? ::equipment/tun-specific-heat))
    (is (gen/generatable? ::equipment/top-up-water))
    (is (gen/generatable? ::equipment/trub-chiller-loss))
    (is (gen/generatable? ::equipment/evap-rate))
    (is (gen/generatable? ::equipment/boil-time))
    (is (gen/generatable? ::equipment/calc-boil-volume))
    (is (gen/generatable? ::equipment/lauter-deadspace))
    (is (gen/generatable? ::equipment/top-up-kettle))
    (is (gen/generatable? ::equipment/hop-utilization))
    (is (gen/generatable? ::equipment/display-boil-size))
    (is (gen/generatable? ::equipment/display-tun-volume))
    (is (gen/generatable? ::equipment/display-top-up-water))
    (is (gen/generatable? ::equipment/display-trub-chiller-loss))
    (is (gen/generatable? ::equipment/display-lauter-deadspace))
    (is (gen/generatable? ::equipment/display-top-up-kettle))
    (is (gen/generatable? ::equipment/equipment))
    (is (gen/generatable? ::equipment/equipment-wrapper))))


(def sample-equipment
  "A hard-coded sample equipment for static unit tests"
  {:batch-size                19.9
   :display-batch-size        "19.9 liters"
   :boil-size                 26.2
   :display-boil-size         "26.2 liters"
   :boil-time                 60.5
   :calc-boil-volume          true
   :evap-rate                 9.0
   :hop-utilization           100.5
   :lauter-deadspace          0.8
   :display-lauter-deadspace  "0.8 liters"
   :name                      "8 Gal pot with 5 gal Igloo Cooler"
   :notes                     "Popular all grain setup. 5 Gallon Gott or Igloo cooler as mash tun with false bottom, and 7-9 gallon brewpot capable of boiling at least 6 gallons of wort. Primarily used for single infusion mashes."
   :top-up-kettle             0.5
   :display-top-up-kettle     "0.5 liters"
   :top-up-water              0.5
   :display-top-up-water      "0.5 liters"
   :trub-chiller-loss         0.8
   :display-trub-chiller-loss "0.8 liters"
   :tun-specific-heat         0.3
   :tun-volume                19.9
   :display-tun-volume        "19.9 liters"
   :tun-weight                2.5
   :display-tun-weight        "2.5 kilograms"
   :version                   1})


(def sample-equipment-wrapper
  "A hard-coded sample equipment-wrapper for static unit tests"
  {equipment/equipment sample-equipment})


(def sample-equipments
  "A hard-coded sample equipments for static unit tests"
  [sample-equipment-wrapper])


(def sample-equipments-wrapper
  "A hard-coded sample equipments-wrapper for static unit tests"
  {equipment/equipments sample-equipments})


(deftest static-test-data-check
  (testing "Since this library assumes common-beer-format data is utilized, make sure static test data conforms"
    (is (spoon.spec/test-valid? ::equipment/equipment sample-equipment)
        "Static test data should conform to common-beer-format.equipment/equipment")
    (is (spoon.spec/test-valid? ::equipment/equipment-wrapper sample-equipment-wrapper)
        "Static test data should conform to common-beer-format.equipment/equipment-wrapper")
    (is (spoon.spec/test-valid? ::equipment/equipments sample-equipments)
        "Static test data should conform to common-beer-format.equipment/equipments")
    (is (spoon.spec/test-valid? ::equipment/equipments-wrapper sample-equipments-wrapper)
        "Static test data should conform to common-beer-format.equipment/equipments-wrapper")))


(deftest static-keys-test
  (testing "Ensure static keys exist within complete equipment records and point to valid data"
    (is (contains? sample-equipment equipment/name)
        "Name key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::primitives/name (sample-equipment equipment/name))
        "Name key should point to valid data")
    (is (contains? sample-equipment equipment/version)
        "Version key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::primitives/version (sample-equipment equipment/version))
        "Version key should point to valid data")
    (is (contains? sample-equipment equipment/boil-size)
        "Boil size key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/boil-size (sample-equipment equipment/boil-size))
        "Boil size key should point to valid data")
    (is (contains? sample-equipment equipment/batch-size)
        "Batch size key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/batch-size (sample-equipment equipment/batch-size))
        "Batch size key should point to valid data")
    (is (contains? sample-equipment equipment/tun-volume)
        "Tun volume key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/tun-volume (sample-equipment equipment/tun-volume))
        "Tun volume key should point to valid data")
    (is (contains? sample-equipment equipment/tun-weight)
        "Tun weight key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/tun-weight (sample-equipment equipment/tun-weight))
        "Tun weight key should point to valid data")
    (is (contains? sample-equipment equipment/tun-specific-heat)
        "Tun specific heat key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/tun-specific-heat (sample-equipment equipment/tun-specific-heat))
        "Tun specific heat key should point to valid data")
    (is (contains? sample-equipment equipment/top-up-water)
        "Top up water key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/top-up-water (sample-equipment equipment/top-up-water))
        "Top up water key should point to valid data")
    (is (contains? sample-equipment equipment/trub-chiller-loss)
        "Trub chiller loss key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/trub-chiller-loss (sample-equipment equipment/trub-chiller-loss))
        "Trub chiller loss key should point to valid data")
    (is (contains? sample-equipment equipment/evap-rate)
        "Evap rate key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/evap-rate (sample-equipment equipment/evap-rate))
        "Evap rate key should point to valid data")
    (is (contains? sample-equipment equipment/boil-time)
        "Boil time key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/boil-time (sample-equipment equipment/boil-time))
        "Boil time key should point to valid data")
    (is (contains? sample-equipment equipment/calc-boil-volume)
        "Calc boil volume key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/calc-boil-volume (sample-equipment equipment/calc-boil-volume))
        "Calc boil volume key should point to valid data")
    (is (contains? sample-equipment equipment/hop-utilization)
        "Hop utilization key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/hop-utilization (sample-equipment equipment/hop-utilization))
        "Hop utilization key should point to valid data")
    (is (contains? sample-equipment equipment/lauter-deadspace)
        "Lauter deadspace key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/lauter-deadspace (sample-equipment equipment/lauter-deadspace))
        "Lauter deadspace key should point to valid data")
    (is (contains? sample-equipment equipment/top-up-kettle)
        "Top up kettle key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/top-up-kettle (sample-equipment equipment/top-up-kettle))
        "Top up kettle key should point to valid data")
    (is (contains? sample-equipment equipment/notes)
        "Notes key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::primitives/notes (sample-equipment equipment/notes))
        "Notes key should point to valid data")
    (is (contains? sample-equipment equipment/display-boil-size)
        "Display boil size key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-boil-size (sample-equipment equipment/display-boil-size))
        "Display boil size key should point to valid data")
    (is (contains? sample-equipment equipment/display-batch-size)
        "Display batch size key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-batch-size (sample-equipment equipment/display-batch-size))
        "Display batch size key should point to valid data")
    (is (contains? sample-equipment equipment/display-tun-volume)
        "Display tun volume key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-tun-volume (sample-equipment equipment/display-tun-volume))
        "Display tun volume key should point to valid data")
    (is (contains? sample-equipment equipment/display-tun-weight)
        "Display tun weight key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-tun-weight (sample-equipment equipment/display-tun-weight))
        "Display tun weight key should point to valid data")
    (is (contains? sample-equipment equipment/display-top-up-water)
        "Display top up water key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-top-up-water (sample-equipment equipment/display-top-up-water))
        "Display top up water key should point to valid data")
    (is (contains? sample-equipment equipment/display-trub-chiller-loss)
        "Display trub chiller loss key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-trub-chiller-loss (sample-equipment equipment/display-trub-chiller-loss))
        "Display trub chiller loss key should point to valid data")
    (is (contains? sample-equipment equipment/display-lauter-deadspace)
        "Lauter deadspace key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/lauter-deadspace (sample-equipment equipment/display-lauter-deadspace))
        "Lauter deadspace key should point to valid data")
    (is (contains? sample-equipment equipment/display-top-up-kettle)
        "Display top up kettle key should exist within sample equipment")
    (is (spoon.spec/test-valid? ::equipment/display-top-up-kettle (sample-equipment equipment/display-top-up-kettle))
        "Display top up kettle key should point to valid data")
    (is (contains? sample-equipment-wrapper equipment/equipment)
        "Equipment key should exist within sample equipment wrapper")
    (is (spoon.spec/test-valid? ::equipment/equipment (sample-equipment-wrapper equipment/equipment))
        "Equipment key should point to valid data"))
  (testing "Sample equipment only contains valid keys"
    (is (= {}
           (dissoc sample-equipment
                   equipment/name
                   equipment/version
                   equipment/batch-size
                   equipment/boil-size
                   equipment/tun-volume
                   equipment/tun-weight
                   equipment/tun-specific-heat
                   equipment/top-up-water
                   equipment/trub-chiller-loss
                   equipment/evap-rate
                   equipment/boil-time
                   equipment/calc-boil-volume
                   equipment/hop-utilization
                   equipment/lauter-deadspace
                   equipment/top-up-kettle
                   equipment/notes
                   equipment/display-boil-size
                   equipment/display-batch-size
                   equipment/display-tun-volume
                   equipment/display-tun-weight
                   equipment/display-top-up-water
                   equipment/display-trub-chiller-loss
                   equipment/display-lauter-deadspace
                   equipment/display-top-up-kettle))))
  (testing "Sample equipment wrapper only contains valid keys"
    (is (= {}
           (dissoc sample-equipment-wrapper
                   equipment/equipment)))))
