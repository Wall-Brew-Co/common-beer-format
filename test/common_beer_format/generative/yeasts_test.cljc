(ns common-beer-format.generative.yeasts-test
  (:require [clojure.test :refer [deftest is testing]]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.yeasts :as yeasts]))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::yeasts/yeast-wrapper))
    (is (gen/generatable? ::yeasts/yeast))
    (is (gen/generatable? ::yeasts/disp-max-temp))
    (is (gen/generatable? ::yeasts/attenuation))
    (is (gen/generatable? ::yeasts/flocculation))
    (is (gen/generatable? ::yeasts/form))
    (is (gen/generatable? ::yeasts/product-id))
    (is (gen/generatable? ::yeasts/min-temperature))
    (is (gen/generatable? ::yeasts/yeasts))
    (is (gen/generatable? ::yeasts/add-to-secondary))
    (is (gen/generatable? ::yeasts/yeasts-wrapper))
    (is (gen/generatable? ::yeasts/max-reuse))
    (is (gen/generatable? ::yeasts/culture-date))
    (is (gen/generatable? ::yeasts/max-temperature))
    (is (gen/generatable? ::yeasts/type))
    (is (gen/generatable? ::yeasts/times-cultured))
    (is (gen/generatable? ::yeasts/disp-min-temp))
    (is (gen/generatable? ::yeasts/best-for))
    (is (gen/generatable? ::yeasts/laboratory))))


(def sample-yeast
  "A hard-coded sample yeast for static unit tests"
  {:add-to-secondary false
   :amount           0.250
   :amount-is-weight false
   :attenuation      73.0
   :best-for         "Irish Dry Stouts"
   :culture-date     "2015-01-01"
   :disp-max-temp    "22.2 C"
   :disp-min-temp    "16.7 C"
   :display-amount   "250.0 ml"
   :flocculation     "Very High"
   :form             "Liquid"
   :inventory        "None"
   :laboratory       "Wyeast Labs"
   :max-reuse        5
   :max-temperature  22.2
   :min-temperature  16.7
   :name             "Irish Ale"
   :notes            "Dry, fruity flavor characteristic of stouts.  Full bodied, dry, clean flavor."
   :product-id       "1084"
   :times-cultured   0
   :type             "Ale"
   :version          1})


(def sample-yeast-wrapper
  "A hard-coded sample yeast-wrapper for static unit tests"
  {:yeast sample-yeast})


(def sample-yeasts
  "A hard-coded sample yeasts for static unit tests"
  [sample-yeast-wrapper])


(def sample-yeasts-wrapper
  "A hard-coded sample yeasts-wrapper for static unit tests"
  {:yeasts sample-yeasts})


(deftest static-keys-test
  (testing "Ensure all static keys can be used to access data"
    (is (contains? sample-yeast yeasts/name)
        "Ensure the yeast name can be accessed")
    (is (contains? sample-yeast yeasts/version)
        "Ensure the yeast version can be accessed")
    (is (contains? sample-yeast yeasts/amount)
        "Ensure the yeast amount can be accessed")
    (is (contains? sample-yeast yeasts/attenuation)
        "Ensure the yeast attenuation can be accessed")
    (is (contains? sample-yeast yeasts/flocculation)
        "Ensure the yeast flocculation can be accessed")
    (is (contains? sample-yeast yeasts/form)
        "Ensure the yeast form can be accessed")
    (is (contains? sample-yeast yeasts/product-id)
        "Ensure the yeast product-id can be accessed")
    (is (contains? sample-yeast yeasts/min-temperature)
        "Ensure the yeast min-temperature can be accessed")
    (is (contains? sample-yeast yeasts/max-temperature)
        "Ensure the yeast max-temperature can be accessed")
    (is (contains? sample-yeast yeasts/notes)
        "Ensure the yeast notes can be accessed")
    (is (contains? sample-yeast yeasts/best-for)
        "Ensure the yeast best-for can be accessed")
    (is (contains? sample-yeast yeasts/laboratory)
        "Ensure the yeast laboratory can be accessed")
    (is (contains? sample-yeast yeasts/type)
        "Ensure the yeast type can be accessed")
    (is (contains? sample-yeast yeasts/amount-is-weight)
        "Ensure the yeast amount-is-weight can be accessed")
    (is (contains? sample-yeast yeasts/add-to-secondary)
        "Ensure the yeast add-to-secondary can be accessed")
    (is (contains? sample-yeast yeasts/max-reuse)
        "Ensure the yeast max-reuse can be accessed")
    (is (contains? sample-yeast yeasts/culture-date)
        "Ensure the yeast culture-date can be accessed")
    (is (contains? sample-yeast yeasts/times-cultured)
        "Ensure the yeast times-cultured can be accessed")
    (is (contains? sample-yeast yeasts/disp-min-temp)
        "Ensure the yeast disp-min-temp can be accessed")
    (is (contains? sample-yeast yeasts/disp-max-temp)
        "Ensure the yeast disp-max-temp can be accessed")
    (is (contains? sample-yeast yeasts/display-amount)
        "Ensure the yeast display-amount can be accessed")
    (is (contains? sample-yeast yeasts/inventory)
        "Ensure the yeast inventory can be accessed")
    (is (contains? sample-yeast-wrapper yeasts/yeast)
        "Ensure the yeast-wrapper yeast can be accessed")
    (is (contains? sample-yeasts-wrapper yeasts/yeasts)
        "Ensure the yeasts-wrapper yeasts can be accessed"))
  (testing "Sample test data is valid"
    (is (spoon.spec/test-valid? ::yeasts/yeast sample-yeast)
        "Ensure the sample yeast is valid")
    (is (spoon.spec/test-valid? ::yeasts/yeast-wrapper sample-yeast-wrapper)
        "Ensure the sample yeast-wrapper is valid")
    (is (spoon.spec/test-valid? ::yeasts/yeasts sample-yeasts)
        "Ensure the sample yeasts is valid")
    (is (spoon.spec/test-valid? ::yeasts/yeasts-wrapper sample-yeasts-wrapper)
        "Ensure the sample yeasts-wrapper is valid"))
  (testing "Sample yeast should only contain valid keys"
    (is (= {}
           (dissoc sample-yeast
                   yeasts/name
                   yeasts/version
                   yeasts/amount
                   yeasts/attenuation
                   yeasts/flocculation
                   yeasts/form
                   yeasts/product-id
                   yeasts/min-temperature
                   yeasts/max-temperature
                   yeasts/notes
                   yeasts/best-for
                   yeasts/laboratory
                   yeasts/type
                   yeasts/amount-is-weight
                   yeasts/add-to-secondary
                   yeasts/max-reuse
                   yeasts/culture-date
                   yeasts/times-cultured
                   yeasts/disp-min-temp
                   yeasts/disp-max-temp
                   yeasts/display-amount
                   yeasts/inventory)))))
