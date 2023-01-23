(ns common-beer-format.generative.hops-test
  (:require [clojure.test :refer :all]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.hops :as hops]))


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
