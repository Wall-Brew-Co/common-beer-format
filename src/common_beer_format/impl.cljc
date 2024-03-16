(ns common-beer-format.impl
  "Utility functions common to translation.

   This namespace is not intended to be used directly."
  {:added  "1.0"
   :no-doc true}
  (:require [clojure.string :as str]
            [clojure.test.check.generators :as gen]
            [nnichols.parse :as n-parse]
            [spec-tools.core :as st]
            [clojure.spec.alpha :as spec]
            [clojure.test :as t]))


(def strict-transformer
  "A transformer that strips extra keys and values and converts strings to their appropriate types"
  (st/type-transformer st/strip-extra-keys-transformer st/strip-extra-values-transformer st/string-transformer))


(defn decode-boolean
  "Decode an XML-like Boolean string to an actual boolean."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-boolean"]}
  [_spec value]
  (-> value str n-parse/parse-boolean))


(defn encode-boolean
  "Encode a boolean into an XML-like Boolean string."
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-boolean"]}
  [_spec value]
  (-> value str str/upper-case))


(defn decode-sequence
  "Decode a sequence of elements using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-sequence"]}
  [_parent-spec child-spec value]
  (letfn [(decoder [data] (st/decode child-spec data strict-transformer))]
    (mapv decoder value)))


(defn encode-sequence
  "Encode a sequence of elements using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-sequence"]}
  [_parent-spec child-spec value]
  (letfn [(encoder [data] (st/encode child-spec data strict-transformer))]
    (mapv encoder value)))


(defn decode-wrapper
  "Decode a wrapped map using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-wrapper"]}
  [_parent-spec child-spec value]
  (letfn [(reducing-fn
            [m k v]
            (assoc m k (st/decode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))


(defn encode-wrapper
  "Encode a wrapped map using the spec definition of the members of that sequence"
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-wrapper"]}
  [_parent-spec child-spec value]
  (letfn [(reducing-fn
            [m k v]
            (assoc m k (st/encode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))


(defn set->description
  "Convert a set of allowed value strings, and transform them into a description string."
  {:added  "1.0"
   :no-doc true}
  [allowed-values]
  (->> allowed-values
       (map str/capitalize)
       (map #(str "\"" % "\""))
       (str/join ", ")
       (str "Must be one of: ")))


(defn multiline
  "Concatenate all strings together, with a new line between each.

   When no arguments are provided, returns an empty string.
   When only one argument is provided, returns that argument."
  {:added  "1.0"
   :no-doc true}
  ([] "")
  ([s] s)
  ([s & more] (str s "\n" (apply multiline more))))


(defn real-double-generator
  "A generator which produces any double.
   Excludes Not-a-number and infinite values"
  {:added  "2.2"
   :no-doc true}
  []
  (gen/double* {:infinite? false
                :NaN?      false}))


(defn real-positive-double-generator
  "A generator which produces any positive double.
   Excludes Not-a-number and infinite values"
  {:added  "2.2"
   :no-doc true}
  []
  (gen/double* {:infinite? false
                :NaN?      false
                :min       0}))

(def wrapper-spec-key
  "A keyword intended for use with spec-tools to indicate a spec for a wrapper type."
  :common-beer-format/wrapper?)

(def display-name-key
  "A keyword intended for use with spec-tools to indicate a display name for a spec."
  :common-beer-format/display-name)

(defn wrapper-spec?
  "Check if a spec is a wrapper spec."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (-> spec st/get-spec (get wrapper-spec-key false)))

(defn spec->display-name
  "Get the display name of a spec."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (-> spec st/get-spec (get display-name-key)))
