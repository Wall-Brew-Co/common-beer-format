(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.util :as cbf]
            [spec-tools.core :as st]))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn conform
  "Conform `data` to a given `spec` while eliminating non-conforming keys and values"
  {:added    "1.0"
   :see-also ["coerce" "spec-tools.core/conform"]}
  [spec data]
  (st/conform spec data cbf/strict-transformer))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn coerce
  "Coerce `data` to a given `spec` while eliminating non-conforming keys and values"
  {:added    "1.4"
   :see-also ["conform" "spec-tools.core/coerce"]}
  [spec data]
  (st/coerce spec data cbf/strict-transformer))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn explain
  "Explain why `data` does not conform to `spec` as a human readable string"
  {:added    "2.0"
   :see-also ["spec-tools.core/explain"]}
  [spec data]
  (with-out-str (st/explain spec data)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn encode
  "Encode the `data` described by `spec` into a string"
  {:added    "2.1"
   :see-also ["spec-tools.core/encode"]}
  [spec data]
  (st/encode spec data cbf/strict-transformer))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn explain-data
  "Explain why `data` does not conform to `spec` with a map of information"
  {:added    "2.0"
   :see-also ["spec-tools.core/explain-data"]}
  [spec data]
  (st/explain-data spec data))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn spec-description
  "Describe a `spec`"
  {:added    "2.0"
   :see-also ["spec-tools.core/spec-description"]}
  [spec]
  (st/spec-description spec))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn valid?
  "Returns true when `data` conforms to `spec`, and false otherwise"
  {:added    "2.0"
   :see-also ["clojure.spec.alpha/valid?" "invalid?"]}
  [spec data]
  (spec/valid? spec data))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn invalid?
  "Returns false when `data` conforms to `spec`, and true otherwise"
  {:added    "2.0"
   :see-also ["clojure.spec.alpha/valid?" "valid?"]}
  [spec data]
  (not (spec/valid? spec data)))
