(ns common-beer-format.generative.fermentables-test
  (:require [clojure.test :refer [deftest is testing]]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.generative.util :as gen]))


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
