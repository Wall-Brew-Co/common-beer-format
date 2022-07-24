(ns ^:no-doc common-beer-format.util
  "Utility functions common to translation"
  (:require [clojure.string :as str]
            [nnichols.parse :as n-parse]
            [spec-tools.core :as st]))


(def strict-transformer
  (st/type-transformer st/strip-extra-keys-transformer st/strip-extra-values-transformer st/string-transformer))


(defn decode-boolean
  "Decode an XML-like Boolean string to an actual boolean"
  [_spec value]
  (-> value str n-parse/parse-boolean))


(defn encode-boolean
  "Encode a boolean into an XML-like Boolean string"
  [_spec value]
  (-> value str str/upper-case))


(defn decode-sequence
  "Decode a sequence of elements using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (mapv (fn [data] (st/decode child-spec data strict-transformer)) value))


(defn encode-sequence
  "Encode a sequence of elements using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (mapv (fn [data] (st/encode child-spec data strict-transformer)) value))


(defn decode-wrapper
  "Decode a wrapped map using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (let [reducing-fn (fn [m k v]
                      (assoc m k (st/decode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))


(defn encode-wrapper
  "Encode a wrapped map using the spec definition of the members of that sequence"
  [_parent-spec child-spec value]
  (let [reducing-fn (fn [m k v]
                      (assoc m k (st/encode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))
