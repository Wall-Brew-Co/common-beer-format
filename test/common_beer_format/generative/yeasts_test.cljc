(ns common-beer-format.generative.yeasts-test
  (:require [clojure.test :refer :all]
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
