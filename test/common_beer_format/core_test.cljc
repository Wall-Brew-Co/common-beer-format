(ns common-beer-format.core-test
  (:require [common-beer-format.core :as cbf]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))
