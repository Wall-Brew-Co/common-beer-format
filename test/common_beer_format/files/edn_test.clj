(ns common-beer-format.files.edn-test
  (:require [clojure.edn :as edn]
            [clojure.spec.alpha :as s]
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


(defn parse-beer-edn
  [file-name spec]
  (let [edn (-> file-name slurp edn/read-string)]
    (cbf/coerce spec edn)))

(defn valid?
  "A test helper to validate a parsed edn object against a spec"
  [file-name spec]
  (s/valid? spec (parse-beer-edn file-name spec)))

(deftest edn-coercion-test
  (testing "Equipment records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/equipment.edn" ::equipment/equipment-wrapper)))
  (testing "Fermentable records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/fermentables.edn" ::fermentables/fermentables-wrapper)))
  (testing "Hop records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/hops.edn" ::hops/hops-wrapper)))
  (testing "Mash records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/mash.edn" ::mash/mash-wrapper)))
  (testing "Misc records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/miscs.edn" ::miscs/miscs-wrapper)))
  (testing "Recipe records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/recipes.edn" ::recipes/recipes-wrapper)))
  (testing "Style records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/style.edn" ::styles/style-wrapper)))
  (testing "Water records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/waters.edn" ::waters/waters-wrapper)))
  (testing "Yeast records parsed from edn coerce into valid data"
    (is (valid? "resources/edn/yeasts.edn" ::yeasts/yeasts-wrapper))))
