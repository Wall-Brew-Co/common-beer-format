(ns common-beer-format.files.json-test
  (:require [clojure.data.json :as json]
            [clojure.spec.alpha :as s]
            [clojure.string :as str]
            [clojure.test :refer :all]
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


(defn deformat
  "Remove formatting specific to Windows (since we're ingesting XML) and double spacing"
  [s]
  (str/replace (str/replace s #"\r\n" "") #"\s\s+" ""))


(defn parse-beer-json
  [file-name spec]
  (let [json (deformat (slurp file-name))
        edn  (json/read-str json :key-fn keyword)]
    (cbf/coerce spec edn)))


(defn valid?
  "A test helper to validate a parsed json object against a spec"
  [file-name spec]
  (s/valid? spec (parse-beer-json file-name spec)))

(deftest json-coercion-test
  (testing "Equipment records parsed from json coerce into valid data"
    (is (valid? "resources/json/equipment.json" ::equipment/equipment-wrapper)))
  (testing "Fermentable records parsed from json coerce into valid data"
    (is (valid? "resources/json/fermentables.json" ::fermentables/fermentables-wrapper)))
  (testing "Hop records parsed from json coerce into valid data"
    (is (valid? "resources/json/hops.json" ::hops/hops-wrapper)))
  (testing "Mash records parsed from json coerce into valid data"
    (is (valid? "resources/json/mash.json" ::mash/mash-wrapper)))
  (testing "Misc records parsed from json coerce into valid data"
    (is (valid? "resources/json/miscs.json" ::miscs/miscs-wrapper)))
  (testing "Recipe records parsed from json coerce into valid data"
    (is (valid? "resources/json/recipes.json" ::recipes/recipes-wrapper)))
  (testing "Style records parsed from json coerce into valid data"
    (is (valid? "resources/json/style.json" ::styles/style-wrapper)))
  (testing "Water records parsed from json coerce into valid data"
    (is (valid? "resources/json/waters.json" ::waters/waters-wrapper)))
  (testing "Yeast records parsed from json coerce into valid data"
    (is (valid? "resources/json/yeasts.json" ::yeasts/yeasts-wrapper))))