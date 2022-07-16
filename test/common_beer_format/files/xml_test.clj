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


(defn valid?
  "A test helper to validate a parsed xml object against a spec"
  [file-name spec]
  (s/valid? spec (parse-beer-xml file-name spec)))

(deftest xml-coercion-test
  (testing "Equipment records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/equipment.xml" ::equipment/equipment-wrapper)))
  (testing "Fermentable records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/fermentables.xml" ::fermentables/fermentables-wrapper)))
  (testing "Hop records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/hops.xml" ::hops/hops-wrapper)))
  (testing "Mash records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/mash.xml" ::mash/mash-wrapper)))
  (testing "Misc records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/miscs.xml" ::miscs/miscs-wrapper)))
  (testing "Recipe records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/recipes.xml" ::recipes/recipes-wrapper)))
  (testing "Style records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/style.xml" ::styles/style-wrapper)))
  (testing "Water records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/waters.xml" ::waters/waters-wrapper)))
  (testing "Yeast records parsed from xml coerce into valid data"
    (is (valid? "resources/xml/yeasts.xml" ::yeasts/yeasts-wrapper))))