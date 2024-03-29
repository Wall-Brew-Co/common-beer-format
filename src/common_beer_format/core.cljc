(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library."
  {:added "1.0"}
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.impl :as cbf]
            [spec-tools.core :as st]))


(defn conform
  "Conform `data` to a given `spec` while eliminating non-conforming keys and values."
  {:added    "1.0"
   :see-also ["coerce" "spec-tools.core/conform"]}
  [spec data]
  (st/conform spec data cbf/strict-transformer))


(defn coerce
  "Coerce `data` to a given `spec` while eliminating non-conforming keys and values."
  {:added    "1.4"
   :see-also ["conform" "spec-tools.core/coerce"]}
  [spec data]
  (st/coerce spec data cbf/strict-transformer))


(defn explain
  "Explain why `data` does not conform to `spec` as a human readable string."
  {:added    "2.0"
   :see-also ["spec-tools.core/explain"]}
  [spec data]
  (with-out-str (st/explain spec data)))


(defn encode
  "Encode the `data` described by `spec` into a string."
  {:added    "2.1"
   :see-also ["spec-tools.core/encode"]}
  [spec data]
  (st/encode spec data cbf/strict-transformer))


(defn explain-data
  "Explain why `data` does not conform to `spec` with a map of information."
  {:added    "2.0"
   :see-also ["spec-tools.core/explain-data"]}
  [spec data]
  (st/explain-data spec data))


(defn get-spec
  "Returns spec registered for keyword/symbol/var k, or nil."
  {:added    "2.2"
   :see-also ["clojure.spec.alpha/get-spec"]}
  [k]
  (spec/get-spec k))


(defn spec-description
  "Describe a `spec`."
  {:added    "2.0"
   :see-also ["spec-tools.core/spec-description"]}
  [spec]
  (st/spec-description spec))


(defn valid?
  "Returns true when `data` conforms to `spec`, and false otherwise."
  {:added    "2.0"
   :see-also ["clojure.spec.alpha/valid?" "invalid?"]}
  [spec data]
  (spec/valid? spec data))


(defn invalid?
  "Returns false when `data` conforms to `spec`, and true otherwise."
  {:added    "2.0"
   :see-also ["clojure.spec.alpha/valid?" "valid?"]}
  [spec data]
  (not (spec/valid? spec data)))
