(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [common-beer-format.parsers.json :as cbf-json]
            [common-beer-format.parsers.xml :as cbf-xml]
            [common-beer-format.specs.equipment :as cbf-equipment]
            [common-beer-format.specs.fermentables :as cbf-fermentables]
            [common-beer-format.specs.hops :as cbf-hops]
            [common-beer-format.specs.mash :as cbf-mash]
            [common-beer-format.specs.miscs :as cbf-miscs]
            [common-beer-format.specs.recipes :as cbf-recipes]
            [common-beer-format.specs.styles :as cbf-styles]
            [common-beer-format.specs.waters :as cbf-waters]
            [common-beer-format.specs.yeasts :as cbf-yeasts]
            [common-beer-format.util :as cbf]
            [spec-tools.core :as st]))

(defn parse-and-coerce-xml
  "Parse the string `xml-doc` and decode it as an instance of `cbf-spec`"
  [xml-doc cbf-spec]
  (let [parsed-xml (cbf-xml/parse-beer-xml xml-doc)]
    (st/decode cbf-spec parsed-xml cbf/strict-transformer)))

(defn parse-and-coerce-json
  "Parse the string `json-blob` and decode it as an instance of `cbf-spec`"
  [json-blob cbf-spec]
  (let [parsed-json (cbf-json/parse-beer-json json-blob)]
    (st/decode cbf-spec parsed-json cbf/strict-transformer)))

(defn emit-xml
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent XML"
  [cbf-data cbf-spec]
  (let [encoded-data (st/encode cbf-spec cbf-data cbf/strict-transformer)]
    (cbf-xml/emit-beer-xml encoded-data)))

(defn emit-json
  "Encode `cbf-data` as an instance of `cbf-spec` and return the equivalent json"
  [cbf-data cbf-spec]
  (let [encoded-data (st/encode cbf-spec cbf-data cbf/strict-transformer)]
    (cbf-json/emit-beer-json encoded-data)))
