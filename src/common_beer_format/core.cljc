(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [clojure.string :as cs]
            [common-beer-format.fermentables :as cbf-fermentables]
            [common-beer-format.parsers.xml :as cbf-xml]
            [spec-tools.core :as st]))

(def strict-transformer
  (st/type-transformer st/strip-extra-keys-transformer st/strip-extra-values-transformer st/string-transformer))

(def xml-doc (slurp "resources/xml/fermentables.xml"))

(def clean-doc (cs/replace (cs/replace xml-doc #"\r\n" "") #"\s\s+" ""))

(def parsed-data (cbf-xml/parse-beer-xml clean-doc))

(def coerced-data (st/conform ::cbf-fermentables/fermentables parsed-data strict-transformer))

