(ns common-beer-format.core
  "A collection of handy functions to utilize the specs in this library"
  (:require [common-beer-format.parsers.xml :as cbf-xml]
            [common-beer-format.specs.fermentables :as cbf-fermentables]
            [spec-tools.core :as st]))

(def strict-transformer
  (st/type-transformer st/strip-extra-keys-transformer st/strip-extra-values-transformer st/string-transformer))

(def xml-doc (slurp "resources/xml/fermentables.xml"))

(def parsed-data (cbf-xml/parse-beer-xml xml-doc))

(def coerced-data (st/encode ::cbf-fermentables/fermentables-wrapper parsed-data st/string-transformer))
