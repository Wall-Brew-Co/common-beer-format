(ns common-beer-format.impl-test
  (:require [clojure.spec.gen.alpha :as gen.alpha]
            [clojure.test :refer [deftest is testing]]
            [common-beer-format.impl :as sut]))


(deftest decode-boolean-test
  (testing "Can decode strings into booleans"
    (is (true? (sut/decode-boolean :somearg "true")))
    (is (false? (sut/decode-boolean :somearg "false")))
    (is (true? (sut/decode-boolean :somearg true)))
    (is (false? (sut/decode-boolean :somearg false)))))


(deftest encode-boolean-test
  (testing "Can encode booleans booleans into strings"
    (is (= "TRUE" (sut/encode-boolean :somearg true)))
    (is (= "FALSE" (sut/encode-boolean :somearg false)))))


(deftest set->description-test
  (testing "A set of strings is converted to a description"
    (is (= "Must be one of: \"A description\""
           (sut/set->description #{"a description"})))))


(deftest multiline-test
  (testing "No arguments returns an empty string"
    (is (= "" (sut/multiline))))
  (testing "One argument returns the argument"
    (is (= "one" (sut/multiline "one"))))
  (testing "Multiple arguments are concatenated with newlines"
    (is (= "one\ntwo\nthree" (sut/multiline "one" "two" "three")))))


(deftest real-double-generator-test
  (testing "Generates a double"
    (is (every? number? (gen.alpha/sample (sut/real-double-generator))))))


(defn not-negative?
  "Returns true if x is not negative"
  [x]
  (<= 0 x))


(deftest real-positive-double-generator-test
  (testing "Generates a double"
    (is (every? number? (gen.alpha/sample (sut/real-positive-double-generator))))
    (is (every? not-negative? (gen.alpha/sample (sut/real-positive-double-generator))))))
