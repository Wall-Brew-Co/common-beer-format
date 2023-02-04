(ns common-beer-format.impl-test
  (:require [common-beer-format.impl :as sut]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest decode-boolean-test
  (testing "Can decode strings into booleans"
    (is (true? (sut/decode-boolean :somearg "true")))
    (is (false? (sut/decode-boolean :somearg "false")))))


(deftest encode-boolean-test
  (testing "Can encode booleans booleans into strings"
    (is (= "TRUE" (sut/encode-boolean :somearg true)))
    (is (= "FALSE" (sut/encode-boolean :somearg false)))))
