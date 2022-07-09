(ns common-beer-format.generative.hops-test
  (:require [common-beer-format.generative.util :as gen]
            [common-beer-format.specs.hops :as hops]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


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
