(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [common-beer-format.parsers.json :as cbf-json]
            [common-beer-format.parsers.xml :as cbf-xml]
            [common-beer-format.util :as cbf]
            [spec-tools.core :as st]))

(defn conform
  [spec data]
  (st/conform spec data cbf/strict-transformer))

(defn parse-and-coerce-xml
  "Parse the string `xml-doc` and decode it as an instance of `cbf-spec`"
  [xml-doc cbf-spec]
  (let [parsed-xml (cbf-xml/parse-beer-xml xml-doc)]
    (conform cbf-spec parsed-xml)))

(defn parse-and-coerce-json
  "Parse the string `json-blob` and decode it as an instance of `cbf-spec`"
  [json-blob cbf-spec]
  (let [parsed-json (cbf-json/parse-beer-json json-blob)]
    (conform cbf-spec parsed-json)))

(defn emit-xml
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent XML"
  [cbf-data cbf-spec]
  (let [encoded-data (conform cbf-spec cbf-data)]
    (cbf-xml/emit-beer-xml encoded-data)))

(defn emit-json
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent json"
  [cbf-data cbf-spec]
  (let [encoded-data (conform cbf-spec cbf-data)]
    (cbf-json/emit-beer-json encoded-data)))
