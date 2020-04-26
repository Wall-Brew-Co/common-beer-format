(ns common-beer-format.parsers.json
  "Functions to translate between BeerJSON and common-beer-format"
  (:require [clojure.data.json :as json]))

(defn parse-beer-json
  "Convert the results of clojure parsed json into cleaner EDN"
  [json-doc]
  (json/read-str json-doc :key-fn keyword))

(defn emit-beer-json
  "Restructure EDN to the expected structure for clojure.data.json"
  [json-doc]
  (json/write-str json-doc :key-fn name :value-fn str))

(defn parse-beer-json-stream
  "Parse JSON into common-beer-format EDN"
  [json-doc]
  (json/read json-doc :key-fn keyword))

(defn emit-beer-json-stream
  "Restructure common-beer-format EDN into standard JSON."
  [json-doc]
  (json/write json-doc :key-fn name :value-fn str))
