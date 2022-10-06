(ns common-beer-format.generative.miscs-test
  (:require [clojure.test :refer [deftest is testing]]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.miscs :as miscs]))


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
