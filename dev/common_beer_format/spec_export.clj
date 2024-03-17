(ns common-beer-format.spec-export
  "Exports the specs in common-beer-format to markdown files.

   cljdoc will use these markdown files to generate the documentation for the common-beer-format library.
   Otherwise, the specs are not easily accessible to the end user.

   This namespace is not intended for public use and is not bundled into the source code."
  {:no-doc true}
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [common-beer-format.core :as cbf]
            [common-beer-format.equipment :as equipment]
            [common-beer-format.fermentables :as fermentables]
            [common-beer-format.hops :as hops]
            [common-beer-format.impl :as impl]
            [common-beer-format.mash :as mash]
            [common-beer-format.miscs :as miscs]
            [common-beer-format.recipes :as recipes]
            [common-beer-format.styles :as styles]
            [common-beer-format.waters :as waters]
            [common-beer-format.yeasts :as yeasts]))


(defn ->capital-sting
  "Convert a string sequence to a single string with all words capitalized."
  [string-sequence]
  (str/join " " (map str/capitalize string-sequence)))


(defn spec->human-name
  "Converts a spec to a human-readable name."
  [spec]
  (let [spec-definition (cbf/get-spec spec)]
    (if (get spec-definition impl/display-name-key)
      (impl/spec->display-name spec)
      (-> spec
          name
          (str/replace #"-" " ")
          (str/split #" ")
          ->capital-sting))))

(defn beer-xml-units->markdown
  "Converts a BeerXML unit to a markdown string."
  [units]
  (let [units-seq (cond
                    (string? units) [units]
                    (sequential? units) units
                    :else (throw (ex-info "Units must be a string or a sequence." {:units units})))]
    (if (= 1 (count units-seq))
      (str "- BeerXML Unit: " (first units-seq))
      (str "- BeerXML Units: " (str/join ", " units-seq)))))


(defn spec->markdown-link
  "Converts a spec to a markdown link."
  [spec]
  (-> spec
      spec->human-name
      str/lower-case
      (str/replace #" " "-")))


(defn coerce-example-value
  "Coerces an example value to the spec type."
  [spec]
  (let [spec-definition (cbf/get-spec spec)
        example-value   (:json-schema/example spec-definition)
        clojure-value   (cbf/coerce spec example-value)]
    (if (string? clojure-value)
      (str "\"" clojure-value "\"")
      clojure-value)))


(defn leaf-spec->markdown
  "Generates a markdown description of a leaf spec.

   This function generates the appropriate header so the map and sequence specs can link to it."
  [spec]
  (println (str "Generating leaf spec markdown for " spec))
  (let [spec-definition  (cbf/get-spec spec)
        display-name     (spec->human-name spec)
        spec-type        (-> spec-definition :type spec->human-name)
        example-value    (coerce-example-value spec)
        spec-description (:description spec-definition)
        beer-xml-type    (get spec-definition impl/beer-xml-type-key)
        beer-xml-units   (get spec-definition impl/beer-xml-units-key)]
    (if (:leaf? spec-definition)
      (impl/multiline
       (str "## " display-name)
       ""
       spec-description
       ""
       (when beer-xml-type
         (str "- BeerXML Type: `" beer-xml-type "`"))
       (when beer-xml-units
         (beer-xml-units->markdown beer-xml-units))
       (str "- Clojure Key Name: `" (-> spec name keyword) "`")
       (str "- Clojure Type: " spec-type)
       (str "- Example: `" example-value "`")
       "" ; Add a newline at the end
       "")
      (throw (ex-info "Spec is not a leaf spec." {:spec spec})))))


(defn key-spec->markdown
  "Take the spec for required/optional keys and generate markdown for them."
  [key-spec]
  (let [human-name    (spec->human-name key-spec)
        markdown-link (spec->markdown-link key-spec)]
    (str "- [" human-name "](#" markdown-link ")\n")))


(defn map-spec->markdown
  "Generates a markdown description of a map spec."
  [spec]
  (println (str "Generating map spec markdown for " spec))
  (let [spec-definition       (cbf/get-spec spec)
        spec-description      (:description spec-definition)
        display-name          (spec->human-name spec)
        key->spec-map         (:spec-tools.parse/key->spec spec-definition)
        required-keys         (vec (:spec-tools.parse/keys-req spec-definition))
        required-specs        (sort-by name (vals (select-keys key->spec-map required-keys)))
        optional-keys         (vec (:spec-tools.parse/keys-opt spec-definition))
        optional-specs        (sort-by name (vals (select-keys key->spec-map optional-keys)))
        required-key-markdown (apply str (map key-spec->markdown required-specs))
        optional-key-markdown (apply str (map key-spec->markdown optional-specs))]

    (if (= :map (:type spec-definition))
      (impl/multiline
       (str "## " display-name)
       ""
       spec-description
       ""
       "### Required Keys"
       ""
       required-key-markdown
       ""
       "### Optional Keys"
       ""
       optional-key-markdown
       ""
       "")
      (throw (ex-info "Spec is not a map spec." {:spec spec})))))


(defn wrapper-spec->markdown
  "Generates a markdown description of a wrapper spec."
  [spec]
  (println (str "Generating wrapper spec markdown for " spec))
  (let [spec-definition       (cbf/get-spec spec)
        spec-description      (:description spec-definition)
        display-name          (spec->human-name spec)
        key->spec-map         (:spec-tools.parse/key->spec spec-definition)
        required-keys         (vec (:spec-tools.parse/keys-req spec-definition))
        required-specs        (sort-by name (vals (select-keys key->spec-map required-keys)))
        required-key-markdown (apply str (map key-spec->markdown required-specs))
        beer-xml-type         (get spec-definition impl/beer-xml-type-key)]
    (if (impl/wrapper-spec? spec)
      (impl/multiline
       (str "## " display-name)
       ""
       spec-description
       ""
       (when beer-xml-type
         (str "- BeerXML Type: `" beer-xml-type "`"))
       ""
       "### Wrapped Record"
       ""
       required-key-markdown
       ""
       "")
      (throw (ex-info "Spec is not a wrapper spec." {:spec spec})))))


(defn sequence-spec->markdown
  "Generates a markdown description of a sequence spec."
  [spec]
  (println (str "Generating sequence spec markdown for " spec))
  (let [spec-definition       (cbf/get-spec spec)
        spec-description      (:description spec-definition)
        display-name          (spec->human-name spec)
        sequence-spec         (-> spec-definition :spec-tools.parse/item :spec)
        required-key-markdown (key-spec->markdown sequence-spec)]
    (if (= :vector (:type spec-definition))
      (impl/multiline
       (str "## " display-name)
       ""
       spec-description
       ""
       "### Collection Type"
       ""
       required-key-markdown
       ""
       "")
      (throw (ex-info "Spec is not a sequence spec." {:spec spec})))))


(defn map-spec->leaf-spec-markdown
  "Generates a markdown description of a map spec that contains leaf specs."
  [spec]
  (println (str "Generating leaf spec markdown for " spec))
  (let [spec-definition (cbf/get-spec spec)
        key->spec-map   (:spec-tools.parse/key->spec spec-definition)
        leaf-specs      (sort-by name (vals key->spec-map))
        leaf-specs*     (filter #(:leaf? (cbf/get-spec %)) leaf-specs)
        leaf-markdown   (apply str (map leaf-spec->markdown leaf-specs*))]
    (if (every? :leaf? (map cbf/get-spec leaf-specs*))
      (impl/multiline leaf-markdown "" "")
      (throw (ex-info "Spec is not a map spec." {:spec spec})))))


(defn deformat
  "Remove extra newlines and formatting issues from a string."
  [^String s]
  (-> s
      (str/replace #"\n\n\n\n" "\n")
      (str/replace #"\n\n\n" "\n\n")))


(defn render-equipment-file!
  "Render the equipment specs to a markdown file."
  []
  (println "Rendering equipment file")
  (io/make-parents "doc/specs/equipment.md")
  (spit "doc/specs/equipment.md"
        (deformat
          (str "# Equipment Records\n\n"
               (wrapper-spec->markdown ::equipment/equipments-wrapper)
               (sequence-spec->markdown ::equipment/equipments)
               (wrapper-spec->markdown ::equipment/equipment-wrapper)
               (map-spec->markdown ::equipment/equipment)
               (map-spec->leaf-spec-markdown ::equipment/equipment)))))

(defn render-fermentables-file!
  "Render the fermentable specs to a markdown file."
  []
  (println "Rendering fermentables file")
  (io/make-parents "doc/specs/fermentables.md")
  (spit "doc/specs/fermentables.md"
        (deformat
          (str "# Fermentable Records\n\n"
               (wrapper-spec->markdown ::fermentables/fermentables-wrapper)
               (sequence-spec->markdown ::fermentables/fermentables)
               (wrapper-spec->markdown ::fermentables/fermentable-wrapper)
               (map-spec->markdown ::fermentables/fermentable)
               (map-spec->leaf-spec-markdown ::fermentables/fermentable)))))

(defn render-hop-file!
  "Render the hop specs to a markdown file."
  []
  (println "Rendering hop file")
  (io/make-parents "doc/specs/hops.md")
  (spit "doc/specs/hops.md"
        (deformat
          (str "# Hop Records\n\n"
               (wrapper-spec->markdown ::hops/hops-wrapper)
               (sequence-spec->markdown ::hops/hops)
               (wrapper-spec->markdown ::hops/hop-wrapper)
               (map-spec->markdown ::hops/hop)
               (map-spec->leaf-spec-markdown ::hops/hop)))))

(defn render-mash-file!
  "Render the mash specs to a markdown file."
  []
  (println "Rendering mash file")
  (io/make-parents "doc/specs/mash.md")
  (spit "doc/specs/mash.md"
        (deformat
          (str "# Mash Records\n\n"
               (wrapper-spec->markdown ::mash/mashs-wrapper)
               (sequence-spec->markdown ::mash/mashs)
               (wrapper-spec->markdown ::mash/mash-wrapper)
               (map-spec->markdown ::mash/mash)
               (map-spec->leaf-spec-markdown ::mash/mash)
               "\n"
               (sequence-spec->markdown ::mash/mash-steps)
               (wrapper-spec->markdown ::mash/mash-step-wrapper)
               (map-spec->markdown ::mash/mash-step)
               (map-spec->leaf-spec-markdown ::mash/mash-step)))))

(defn render-miscs-file!
  "Render the misc specs to a markdown file."
  []
  (println "Rendering misc file")
  (io/make-parents "doc/specs/miscs.md")
  (spit "doc/specs/miscs.md"
        (deformat
          (str "# Misc Records\n\n"
               (wrapper-spec->markdown ::miscs/miscs-wrapper)
               (sequence-spec->markdown ::miscs/miscs)
               (wrapper-spec->markdown ::miscs/misc-wrapper)
               (map-spec->markdown ::miscs/misc)
               (map-spec->leaf-spec-markdown ::miscs/misc)))))

(defn render-recipes-file!
  "Render the recipe specs to a markdown file."
  []
  (println "Rendering recipe file")
  (io/make-parents "doc/specs/recipes.md")
  (spit "doc/specs/recipes.md"
        (deformat
          (str "# Recipe Records\n\n"
               (wrapper-spec->markdown ::recipes/recipes-wrapper)
               (sequence-spec->markdown ::recipes/recipes)
               (wrapper-spec->markdown ::recipes/recipe-wrapper)
               (map-spec->markdown ::recipes/recipe)
               (map-spec->leaf-spec-markdown ::recipes/recipe)))))

(defn render-styles-file!
  "Render the style specs to a markdown file."
  []
  (println "Rendering style file")
  (io/make-parents "doc/specs/styles.md")
  (spit "doc/specs/styles.md"
        (deformat
          (str "# Style Records\n\n"
               (wrapper-spec->markdown ::styles/styles-wrapper)
               (sequence-spec->markdown ::styles/styles)
               (wrapper-spec->markdown ::styles/style-wrapper)
               (map-spec->markdown ::styles/style)
               (map-spec->leaf-spec-markdown ::styles/style)))))

(defn render-waters-file!
  "Render the water specs to a markdown file."
  []
  (println "Rendering water file")
  (io/make-parents "doc/specs/water.md")
  (spit "doc/specs/water.md"
        (deformat
          (str "# Water Records\n\n"
               (wrapper-spec->markdown ::waters/waters-wrapper)
               (sequence-spec->markdown ::waters/waters)
               (wrapper-spec->markdown ::waters/water-wrapper)
               (map-spec->markdown ::waters/water)
               (map-spec->leaf-spec-markdown ::waters/water)))))

(defn render-yeasts-file!
  "Render the yeast specs to a markdown file."
  []
  (println "Rendering yeast file")
  (io/make-parents "doc/specs/yeast.md")
  (spit "doc/specs/yeast.md"
        (deformat
          (str "# Yeast Records\n\n"
               (wrapper-spec->markdown ::yeasts/yeasts-wrapper)
               (sequence-spec->markdown ::yeasts/yeasts)
               (wrapper-spec->markdown ::yeasts/yeast-wrapper)
               (map-spec->markdown ::yeasts/yeast)
               (map-spec->leaf-spec-markdown ::yeasts/yeast)))))


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn render-specs!
  "Render all the specs to markdown files."
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
