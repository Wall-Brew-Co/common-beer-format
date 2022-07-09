(ns common-beer-format.xml-sample-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :refer :all]
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
            [common-beer-format.util :as cbf-util]
            [spec-tools.core :as st]))


(deftest equipment-test
  (let [xml-doc (slurp "resources/xml/equipment.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-equipment/equipment-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-equipment/equipment-wrapper conformed-data))))


(deftest fermentables-test
  (let [xml-doc (slurp "resources/xml/fermentables.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-fermentables/fermentables-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-fermentables/fermentables-wrapper conformed-data))))


(deftest hops-test
  (let [xml-doc (slurp "resources/xml/hops.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-hops/hops-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-hops/hops-wrapper conformed-data))))


(deftest mash-test
  (let [xml-doc (slurp "resources/xml/mash.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-mash/mash-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-mash/mash-wrapper conformed-data))))


(deftest miscs-test
  (let [xml-doc (slurp "resources/xml/miscs.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-miscs/miscs-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-miscs/miscs-wrapper conformed-data))))


(deftest recipes-test
  (let [xml-doc (slurp "resources/xml/recipes.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-recipes/recipes-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-recipes/recipes-wrapper conformed-data))))


(deftest styles-test
  (let [xml-doc (slurp "resources/xml/style.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-styles/style-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-styles/style-wrapper conformed-data))))


(deftest waters-test
  (let [xml-doc (slurp "resources/xml/waters.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-waters/waters-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-waters/waters-wrapper conformed-data))))


(deftest yeasts-test
  (let [xml-doc (slurp "resources/xml/yeasts.xml")
        parsed-data (cbf-xml/parse-beer-xml xml-doc)
        conformed-data (st/conform ::cbf-yeasts/yeasts-wrapper parsed-data cbf-util/strict-transformer)]
    (is (s/valid? ::cbf-yeasts/yeasts-wrapper conformed-data))))
