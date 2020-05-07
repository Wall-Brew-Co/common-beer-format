(ns common-beer-format.json-sample-test
  (:require [clojure.spec.alpha :as s]
            [clojure.test :as test]
            [common-beer-format.parsers.json :as cbf-json]
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

(test/deftest equipment-test
  (let [json-blob (slurp "resources/json/equipment.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-equipment/equipment-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-equipment/equipment-wrapper conformed-data))))

(test/deftest fermentables-test
  (let [json-blob (slurp "resources/json/fermentables.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-fermentables/fermentables-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-fermentables/fermentables-wrapper conformed-data))))

(test/deftest hops-test
  (let [json-blob (slurp "resources/json/hops.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-hops/hops-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-hops/hops-wrapper conformed-data))))

(test/deftest mash-test
  (let [json-blob (slurp "resources/json/mash.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-mash/mash-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-mash/mash-wrapper conformed-data))))

(test/deftest miscs-test
  (let [json-blob (slurp "resources/json/miscs.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-miscs/miscs-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-miscs/miscs-wrapper conformed-data))))

(test/deftest recipes-test
  (let [json-blob (slurp "resources/json/recipes.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-recipes/recipes-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-recipes/recipes-wrapper conformed-data))))

(test/deftest styles-test
  (let [json-blob (slurp "resources/json/style.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-styles/style-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-styles/style-wrapper conformed-data))))

(test/deftest waters-test
  (let [json-blob (slurp "resources/json/waters.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-waters/waters-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-waters/waters-wrapper conformed-data))))

(test/deftest yeasts-test
  (let [json-blob (slurp "resources/json/yeasts.json")
        parsed-data (cbf-json/parse-beer-json json-blob)
        conformed-data (st/conform ::cbf-yeasts/yeasts-wrapper parsed-data cbf-util/strict-transformer)]
    (test/is (s/valid? ::cbf-yeasts/yeasts-wrapper conformed-data))))
