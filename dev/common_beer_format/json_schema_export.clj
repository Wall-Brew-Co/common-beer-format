(ns common-beer-format.json-schema-export
  "Exports the specs in common-beer-format to JSON Schemas.

   This namespace is not intended for public use and is not bundled into the source code."
  {:no-doc true}
  (:require [clojure.data.json :as json]
            [clojure.java.io :as io]
            [clojure.string :as str]
            [common-beer-format.equipment :as equipment]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.hops :as hops]
            [common-beer-format.mash :as mash]
            [common-beer-format.miscs :as miscs]
            [common-beer-format.recipes :as recipes]
            [common-beer-format.styles :as styles]
            [common-beer-format.waters :as waters]
            [common-beer-format.yeasts :as yeasts]
            [spec-tools.json-schema :as json-schema]))


(defn json-schema-fixup
  "spec-tools only supports Draft 4 JSON Schema, so we need to fix it up to Draft 7."
  [schema-string]
  (-> schema-string
      (str/replace "\"exclusiveMinimum\": true" "\"exclusiveMinimum\": 0")))


(defn export-spec-as-json!
  "Convert a spec to a JSON Schema."
  [spec filename]
  (io/make-parents filename)
  (let [schema (json-schema/transform spec)]
    (println "Exporting" filename)
    (spit filename (json-schema-fixup (json/write-str schema {:indent true})))))


(defn render-equipment-file!
  "Render the equipment specs to a JSON Schema file."
  []
  (println "Rendering equipment file")
  (let [path-prefix "exports/equipment/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::equipment/equipments-wrapper (str path-prefix "equipments-wrapper" path-suffix))
    (export-spec-as-json! ::equipment/equipments (str path-prefix "equipments" path-suffix))
    (export-spec-as-json! ::equipment/equipment-wrapper (str path-prefix "equipment-wrapper" path-suffix))
    (export-spec-as-json! ::equipment/equipment (str path-prefix "equipment" path-suffix))))


(defn render-fermentables-file!
  "Render the fermentable specs to a JSON Schema file."
  []
  (println "Rendering fermentables file")
  (let [path-prefix "exports/fermentables/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::fermentables/fermentables-wrapper (str path-prefix "fermentables-wrapper" path-suffix))
    (export-spec-as-json! ::fermentables/fermentables (str path-prefix "fermentables" path-suffix))
    (export-spec-as-json! ::fermentables/fermentable-wrapper (str path-prefix "fermentable-wrapper" path-suffix))
    (export-spec-as-json! ::fermentables/fermentable (str path-prefix "fermentable" path-suffix))))


(defn render-hop-file!
  "Render the hop specs to a JSON Schema file."
  []
  (println "Rendering hop file")
  (let [path-prefix "exports/hops/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::hops/hops-wrapper (str path-prefix "hops-wrapper" path-suffix))
    (export-spec-as-json! ::hops/hops (str path-prefix "hops" path-suffix))
    (export-spec-as-json! ::hops/hop-wrapper (str path-prefix "hop-wrapper" path-suffix))
    (export-spec-as-json! ::hops/hop (str path-prefix "hop" path-suffix))))


(defn render-mash-file!
  "Render the mash specs to a JSON Schema file."
  []
  (println "Rendering mash file")
  (let [path-prefix "exports/mash/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::mash/mashs-wrapper (str path-prefix "mashs-wrapper" path-suffix))
    (export-spec-as-json! ::mash/mashs (str path-prefix "mashs" path-suffix))
    (export-spec-as-json! ::mash/mash-wrapper (str path-prefix "mash-wrapper" path-suffix))
    (export-spec-as-json! ::mash/mash (str path-prefix "mash" path-suffix))
    (export-spec-as-json! ::mash/mash-steps (str path-prefix "mash-steps" path-suffix))
    (export-spec-as-json! ::mash/mash-step-wrapper (str path-prefix "mash-step-wrapper" path-suffix))
    (export-spec-as-json! ::mash/mash-step (str path-prefix "mash-step" path-suffix))))


(defn render-miscs-file!
  "Render the misc specs to a JSON Schema file."
  []
  (println "Rendering misc file")
  (let [path-prefix "exports/miscs/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::miscs/miscs-wrapper (str path-prefix "miscs-wrapper" path-suffix))
    (export-spec-as-json! ::miscs/miscs (str path-prefix "miscs" path-suffix))
    (export-spec-as-json! ::miscs/misc-wrapper (str path-prefix "misc-wrapper" path-suffix))
    (export-spec-as-json! ::miscs/misc (str path-prefix "misc" path-suffix))))


(defn render-recipes-file!
  "Render the recipe specs to a JSON Schema file."
  []
  (println "Rendering recipe file")
  (let [path-prefix "exports/recipes/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::recipes/recipes-wrapper (str path-prefix "recipes-wrapper" path-suffix))
    (export-spec-as-json! ::recipes/recipes (str path-prefix "recipes" path-suffix))
    (export-spec-as-json! ::recipes/recipe-wrapper (str path-prefix "recipe-wrapper" path-suffix))
    (export-spec-as-json! ::recipes/recipe (str path-prefix "recipe" path-suffix))))


(defn render-styles-file!
  "Render the style specs to a JSON Schema file."
  []
  (println "Rendering style file")
  (let [path-prefix "exports/styles/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::styles/styles-wrapper (str path-prefix "styles-wrapper" path-suffix))
    (export-spec-as-json! ::styles/styles (str path-prefix "styles" path-suffix))
    (export-spec-as-json! ::styles/style-wrapper (str path-prefix "style-wrapper" path-suffix))
    (export-spec-as-json! ::styles/style (str path-prefix "style" path-suffix))))


(defn render-waters-file!
  "Render the water specs to a JSON Schema file."
  []
  (println "Rendering water file")
  (let [path-prefix "exports/waters/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::waters/waters-wrapper (str path-prefix "waters-wrapper" path-suffix))
    (export-spec-as-json! ::waters/waters (str path-prefix "waters" path-suffix))
    (export-spec-as-json! ::waters/water-wrapper (str path-prefix "water-wrapper" path-suffix))
    (export-spec-as-json! ::waters/water (str path-prefix "water" path-suffix))))


(defn render-yeasts-file!
  "Render the yeast specs to a JSON Schema file."
  []
  (println "Rendering yeast file")
  (let [path-prefix "exports/yeasts/json_schema/"
        path-suffix ".json"]
    (export-spec-as-json! ::yeasts/yeasts-wrapper (str path-prefix "yeasts-wrapper" path-suffix))
    (export-spec-as-json! ::yeasts/yeasts (str path-prefix "yeasts" path-suffix))
    (export-spec-as-json! ::yeasts/yeast-wrapper (str path-prefix "yeast-wrapper" path-suffix))
    (export-spec-as-json! ::yeasts/yeast (str path-prefix "yeast" path-suffix))))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}


(defn render-specs!
  "Render all the specs to JSON Schema files."
  []
  (render-equipment-file!)
  (render-fermentables-file!)
  (render-hop-file!)
  (render-mash-file!)
  (render-miscs-file!)
  (render-recipes-file!)
  (render-styles-file!)
  (render-waters-file!)
  (render-yeasts-file!))
