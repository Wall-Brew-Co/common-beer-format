(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [common-beer-format.parsers.json :as cbf-json]
            [common-beer-format.parsers.xml :as cbf-xml]
            [common-beer-format.util :as cbf]
            [spec-tools.core :as st]))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn conform
  "Conform `data` to a given `spec` while eliminating non-conforming keys and values"
  {:added "1.0"
   :see-also ["coerce"]}
  [spec data]
  (st/conform spec data cbf/strict-transformer))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn coerce
  "Coerce `data` to a given `spec` while eliminating non-conforming keys and values"
  {:added "1.4"
   :see-also ["conform"]}
  [spec data]
  (st/coerce spec data cbf/strict-transformer))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn parse-and-coerce-xml
  "Parse the string `xml-doc` and decode it as an instance of `cbf-spec`"
  {:added "1.0"}
  [xml-doc cbf-spec]
  (let [parsed-xml (cbf-xml/parse-beer-xml xml-doc)]
    (coerce cbf-spec parsed-xml)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn parse-and-coerce-json
  "Parse the string `json-blob` and decode it as an instance of `cbf-spec`"
  {:added "1.0"}
  [json-blob cbf-spec]
  (let [parsed-json (cbf-json/parse-beer-json json-blob)]
    (coerce cbf-spec parsed-json)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn emit-xml
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent XML"
  {:added "1.0"}
  [cbf-data cbf-spec]
  (let [encoded-data (coerce cbf-spec cbf-data)]
    (cbf-xml/emit-beer-xml encoded-data)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn emit-json
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent json"
  {:added "1.0"}
  [cbf-data cbf-spec]
  (let [encoded-data (coerce cbf-spec cbf-data)]
    (cbf-json/emit-beer-json encoded-data)))
