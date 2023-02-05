(ns common-beer-format.core-test
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.core :as sut]
            [common-beer-format.fermentables :as fermentables]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest get-spec-test
  (testing "Spec can be retrieved for a qualified keyword"
    (is (spec/spec? (sut/get-spec ::fermentables/fermentable)))))


(deftest spec-description-test
  (testing "Spec description can be retrieved for a spec"
    (is (string? (sut/spec-description (sut/get-spec ::fermentables/fermentable))))))


(spec/def ::test-keyword keyword?)


(deftest valid?-test
  (testing "Valid? returns true for valid data"
    (is (true? (sut/valid? ::test-keyword :foo))))
  (testing "Valid? returns false for invalid data"
    (is (false? (sut/valid? ::test-keyword "foo")))))


(deftest invalid?-test
  (testing "Invalid? returns false for valid data"
    (is (false? (sut/invalid? ::test-keyword :foo))))
  (testing "Invalid? returns true for invalid data"
    (is (true? (sut/invalid? ::test-keyword "foo")))))


(deftest conform-test
  (testing "Conform returns valid data"
    (is (= :foo (sut/conform ::test-keyword :foo)))
    (is (= :foo (sut/conform ::test-keyword "foo"))))
  (testing "Conform returns :clojure.spec.alpha/invalid for invalid data"
    (is (spec/invalid? (sut/conform ::test-keyword 1)))))


(deftest coerce-test
  (testing "coerce returns valid data"
    (is (= :foo (sut/coerce ::test-keyword :foo)))
    (is (= :foo (sut/coerce ::test-keyword "foo"))))
  (testing "coerce returns the original data for invalid data"
    (is (= 1 (sut/coerce ::test-keyword 1)))))


(deftest explain-test
  (testing "explain returns a success string on valid data"
    (is (= "Success!\n" (sut/explain ::test-keyword :foo))))
  (testing "explain returns a string with the reason for invalid data"
    (is (= "1 - failed: keyword? spec: :common-beer-format.core-test/test-keyword\n"
           (sut/explain ::test-keyword 1)))))


(deftest explain-data-test
  (testing "explain-data returns nil on valid data"
    (is (nil? (sut/explain-data ::test-keyword :foo))))
  (testing "explain-data returns a map with the reason for invalid data"
    (is (map? (sut/explain-data ::test-keyword 1)))))
