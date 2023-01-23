(ns common-beer-format.files.xml-test
  (:require [clj-xml.core :as clj-xml]
            [clojure.data.xml :as xml]
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


(defn deformat
  "Remove formatting specific to Windows (since we're ingesting XML) and double spacing"
  [s]
  (str/replace (str/replace s #"\r\n" "") #"\s\s+" ""))


(defn parse-beer-xml
  "Parse a beer XML file as EDN"
  [file-name spec]
  (let [xml (deformat (slurp file-name))
        edn (clj-xml/xml->edn (xml/parse-str xml))]
    (cbf/coerce spec edn)))

(defn round-trip-edn
  "Round trip a beer SML file."
  [file-name spec]
  (let [xml         (deformat (slurp file-name))
        edn          (clj-xml/xml->edn (xml/parse-str xml))
        coerced-data (cbf/coerce spec edn)
        string       (cbf/encode spec coerced-data)]
    (cbf/coerce spec string)))


(deftest equipment-test
  (is (spoon/test-valid? ::equipment/equipment-wrapper (parse-beer-xml "resources/xml/equipment.xml" ::equipment/equipment-wrapper)))
  (is (= (round-trip-edn "resources/xml/equipment.xml" ::equipment/equipment-wrapper)
         (parse-beer-xml "resources/xml/equipment.xml" ::equipment/equipment-wrapper))))


(deftest fermentables-test
  (is (spoon/test-valid? ::fermentables/fermentables-wrapper (parse-beer-xml "resources/xml/fermentables.xml" ::fermentables/fermentables-wrapper)))
  (is (= (round-trip-edn "resources/xml/fermentables.xml" ::fermentables/fermentables-wrapper)
         (parse-beer-xml "resources/xml/fermentables.xml" ::fermentables/fermentables-wrapper))))


(deftest hops-test
  (is (spoon/test-valid? ::hops/hops-wrapper (parse-beer-xml "resources/xml/hops.xml" ::hops/hops-wrapper)))
  (is (= (round-trip-edn "resources/xml/hops.xml" ::hops/hops-wrapper)
         (parse-beer-xml "resources/xml/hops.xml" ::hops/hops-wrapper))))


(deftest mash-test
  (is (spoon/test-valid? ::mash/mash-wrapper (parse-beer-xml "resources/xml/mash.xml" ::mash/mash-wrapper)))
  (is (= (round-trip-edn "resources/xml/mash.xml" ::mash/mash-wrapper)
         (parse-beer-xml "resources/xml/mash.xml" ::mash/mash-wrapper))))


(deftest miscs-test
  (is (spoon/test-valid? ::miscs/miscs-wrapper (parse-beer-xml "resources/xml/miscs.xml" ::miscs/miscs-wrapper)))
  (is (= (round-trip-edn "resources/xml/miscs.xml" ::miscs/miscs-wrapper)
         (parse-beer-xml "resources/xml/miscs.xml" ::miscs/miscs-wrapper))))


(deftest recipes-test
  (is (spoon/test-valid? ::recipes/recipes-wrapper (parse-beer-xml "resources/xml/recipes.xml" ::recipes/recipes-wrapper)))
  (is (= (round-trip-edn "resources/xml/recipes.xml" ::recipes/recipes-wrapper)
         (parse-beer-xml "resources/xml/recipes.xml" ::recipes/recipes-wrapper))))


(deftest styles-test
  (is (spoon/test-valid? ::styles/style-wrapper (parse-beer-xml "resources/xml/style.xml" ::styles/style-wrapper)))
  (is (= (round-trip-edn "resources/xml/style.xml" ::styles/style-wrapper)
         (parse-beer-xml "resources/xml/style.xml" ::styles/style-wrapper))))


(deftest waters-test
  (is (spoon/test-valid? ::waters/waters-wrapper (parse-beer-xml "resources/xml/waters.xml" ::waters/waters-wrapper)))
  (is (= (round-trip-edn "resources/xml/waters.xml" ::waters/waters-wrapper)
         (parse-beer-xml "resources/xml/waters.xml" ::waters/waters-wrapper))))


(deftest yeasts-test
  (is (spoon/test-valid? ::yeasts/yeasts-wrapper (parse-beer-xml "resources/xml/yeasts.xml" ::yeasts/yeasts-wrapper)))
  (is (= (round-trip-edn "resources/xml/yeasts.xml" ::yeasts/yeasts-wrapper)
         (parse-beer-xml "resources/xml/yeasts.xml" ::yeasts/yeasts-wrapper))))
