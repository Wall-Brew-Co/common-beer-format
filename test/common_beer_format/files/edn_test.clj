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


(deftest equipment-test
  (is (s/valid? ::equipment/equipment-wrapper (parse-beer-edn "resources/edn/equipment.edn" ::equipment/equipment-wrapper))))


(deftest fermentables-test
  (is (s/valid? ::fermentables/fermentables-wrapper (parse-beer-edn "resources/edn/fermentables.edn" ::fermentables/fermentables-wrapper))))


(deftest hops-test
  (is (s/valid? ::hops/hops-wrapper (parse-beer-edn "resources/edn/hops.edn" ::hops/hops-wrapper))))


(deftest mash-test
  (is (s/valid? ::mash/mash-wrapper (parse-beer-edn "resources/edn/mash.edn" ::mash/mash-wrapper))))


(deftest miscs-test
  (is (s/valid? ::miscs/miscs-wrapper (parse-beer-edn "resources/edn/miscs.edn" ::miscs/miscs-wrapper))))


(deftest recipes-test
  (is (s/valid? ::recipes/recipes-wrapper (parse-beer-edn "resources/edn/recipes.edn" ::recipes/recipes-wrapper))))


(deftest styles-test
  (is (s/valid? ::styles/style-wrapper (parse-beer-edn "resources/edn/style.edn" ::styles/style-wrapper))))


(deftest waters-test
  (is (s/valid? ::waters/waters-wrapper (parse-beer-edn "resources/edn/waters.edn" ::waters/waters-wrapper))))


(deftest yeasts-test
  (is (s/valid? ::yeasts/yeasts-wrapper (parse-beer-edn "resources/edn/yeasts.edn" ::yeasts/yeasts-wrapper))))
