(ns common-beer-format.files.json-test
  (:require [clojure.data.json :as json]
            [clojure.string :as str]
            [clojure.test :refer :all]
            [com.wallbrew.spoon.spec :as spoon]
            [common-beer-format.core :as cbf]
            [common-beer-format.equipment :as equipment]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.hops :as hops]
            [common-beer-format.mash :as mash]
            [common-beer-format.miscs :as miscs]
            [common-beer-format.recipes :as recipes]
            [common-beer-format.styles :as styles]
            [common-beer-format.waters :as waters]
            [common-beer-format.yeasts :as yeasts]))


(defn- deformat
  "Remove formatting specific to Windows and double spacing."
  {:no-doc true}
  [s]
  (str/replace (str/replace s #"\r\n" "") #"\s\s+" ""))


(defn- parse-beer-json
  "Parse a beer JSON file as EDN."
  {:no-doc true}
  [file-name spec]
  (let [json (deformat (slurp file-name))
        edn  (json/read-str json :key-fn keyword)]
    (cbf/coerce spec edn)))


(defn- round-trip-json
  "Round trip a beer JSON file."
  {:no-doc true}
  [file-name spec]
  (let [json         (deformat (slurp file-name))
        edn          (json/read-str json :key-fn keyword)
        coerced-data (cbf/coerce spec edn)
        string       (cbf/encode spec coerced-data)]
    (cbf/coerce spec string)))


(deftest equipment-test
  (is (spoon/test-valid? ::equipment/equipment-wrapper (parse-beer-json "resources/json/equipment.json" ::equipment/equipment-wrapper)))
  (is (= (parse-beer-json "resources/json/equipment.json" ::equipment/equipment-wrapper)
         (round-trip-json "resources/json/equipment.json" ::equipment/equipment-wrapper))))


(deftest fermentables-test
  (is (spoon/test-valid? ::fermentables/fermentables-wrapper (parse-beer-json "resources/json/fermentables.json" ::fermentables/fermentables-wrapper)))
  (is (= (parse-beer-json "resources/json/fermentables.json" ::fermentables/fermentables-wrapper)
         (round-trip-json "resources/json/fermentables.json" ::fermentables/fermentables-wrapper))))


(deftest hops-test
  (is (spoon/test-valid? ::hops/hops-wrapper (parse-beer-json "resources/json/hops.json" ::hops/hops-wrapper)))
  (is (= (parse-beer-json "resources/json/hops.json" ::hops/hops-wrapper)
         (round-trip-json "resources/json/hops.json" ::hops/hops-wrapper))))


(deftest mash-test
  (is (spoon/test-valid? ::mash/mash-wrapper (parse-beer-json "resources/json/mash.json" ::mash/mash-wrapper)))
  (is (= (parse-beer-json "resources/json/mash.json" ::mash/mash-wrapper)
         (round-trip-json "resources/json/mash.json" ::mash/mash-wrapper))))


(deftest miscs-test
  (is (spoon/test-valid? ::miscs/miscs-wrapper (parse-beer-json "resources/json/miscs.json" ::miscs/miscs-wrapper)))
  (is (= (parse-beer-json "resources/json/miscs.json" ::miscs/miscs-wrapper)
         (round-trip-json "resources/json/miscs.json" ::miscs/miscs-wrapper))))


(deftest recipes-test
  (is (spoon/test-valid? ::recipes/recipes-wrapper (parse-beer-json "resources/json/recipes.json" ::recipes/recipes-wrapper)))
  (is (= (parse-beer-json "resources/json/recipes.json" ::recipes/recipes-wrapper)
         (round-trip-json "resources/json/recipes.json" ::recipes/recipes-wrapper))))


(deftest styles-test
  (is (spoon/test-valid? ::styles/style-wrapper (parse-beer-json "resources/json/style.json" ::styles/style-wrapper)))
  (is (= (parse-beer-json "resources/json/style.json" ::styles/style-wrapper)
         (round-trip-json "resources/json/style.json" ::styles/style-wrapper))))


(deftest waters-test
  (is (spoon/test-valid? ::waters/waters-wrapper (parse-beer-json "resources/json/waters.json" ::waters/waters-wrapper)))
  (is (= (parse-beer-json "resources/json/waters.json" ::waters/waters-wrapper)
         (round-trip-json "resources/json/waters.json" ::waters/waters-wrapper))))


(deftest yeasts-test
  (is (spoon/test-valid? ::yeasts/yeasts-wrapper (parse-beer-json "resources/json/yeasts.json" ::yeasts/yeasts-wrapper)))
  (is (= (parse-beer-json "resources/json/yeasts.json" ::yeasts/yeasts-wrapper)
         (round-trip-json "resources/json/yeasts.json" ::yeasts/yeasts-wrapper))))
