(ns common-beer-format.files.xml-test
  (:require [clojure.data.xml :as xml]
            [clojure.spec.alpha :as s]
            [clojure.string :as str]
            [clojure.test :refer :all]
            [clj-xml.core :as clj-xml]
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


(defn parse-beer-xml
  [file-name spec]
  (let [xml (deformat (slurp file-name))
        edn (clj-xml/xml->edn (xml/parse-str xml))]
    (cbf/coerce spec edn)))


(deftest equipment-test
  (is (s/valid? ::equipment/equipment-wrapper (parse-beer-xml "resources/xml/equipment.xml" ::equipment/equipment-wrapper))))


(deftest fermentables-test
  (is (s/valid? ::fermentables/fermentables-wrapper (parse-beer-xml "resources/xml/fermentables.xml" ::fermentables/fermentables-wrapper))))


(deftest hops-test
  (is (s/valid? ::hops/hops-wrapper (parse-beer-xml "resources/xml/hops.xml" ::hops/hops-wrapper))))


(deftest mash-test
  (is (s/valid? ::mash/mash-wrapper (parse-beer-xml "resources/xml/mash.xml" ::mash/mash-wrapper))))


(deftest miscs-test
  (is (s/valid? ::miscs/miscs-wrapper (parse-beer-xml "resources/xml/miscs.xml" ::miscs/miscs-wrapper))))


(deftest recipes-test
  (is (s/valid? ::recipes/recipes-wrapper (parse-beer-xml "resources/xml/recipes.xml" ::recipes/recipes-wrapper))))


(deftest styles-test
  (is (s/valid? ::styles/style-wrapper (parse-beer-xml "resources/xml/style.xml" ::styles/style-wrapper))))


(deftest waters-test
  (is (s/valid? ::waters/waters-wrapper (parse-beer-xml "resources/xml/waters.xml" ::waters/waters-wrapper))))


(deftest yeasts-test
  (is (s/valid? ::yeasts/yeasts-wrapper (parse-beer-xml "resources/xml/yeasts.xml" ::yeasts/yeasts-wrapper))))
