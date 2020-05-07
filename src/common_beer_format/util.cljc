(ns common-beer-format.util
  "Utility functions common to translation"
  (:require [clojure.string :as cs]
            [nnichols.parse :as n-parse]
            [spec-tools.core :as st]))

(defn deformat
  "Remove formatting specific to Windows (since we're ingesting XML) and double spacing"
  [s]
  (cs/replace (cs/replace s #"\r\n" "") #"\s\s+" ""))

(defn decode-boolean
  "Decode an XML-like Boolean string to an actual boolean"
  [_spec value]
  (-> value str n-parse/parse-boolean))

(defn encode-boolean
  "Encode a boolean into an XML-like Boolean string"
  [_spec value]
  (-> value str cs/upper-case))

(defn decode-sequence
  "Decode a sequence of elements using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (mapv (fn [data] (st/decode child-spec data st/string-transformer)) value))
  
(defn encode-sequence
  "Encode a sequence of elements using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (mapv (fn [data] (st/encode child-spec data st/string-transformer)) value))
