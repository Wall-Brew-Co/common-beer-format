(ns common-beer-format.spec-export
  "Exports the specs in common-beer-format to markdown files.

   cljdoc will use these markdown files to generate the documentation for the common-beer-format library.
   Otherwise, the specs are not easily accessible to the end user.

   This namespace is not intended for public use."
  {:no-doc true}
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [common-beer-format.core :as cbf]
            [common-beer-format.equipment :as equipment]
            [common-beer-format.impl :as impl]))


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
  (let [spec-definition  (cbf/get-spec spec)
        display-name     (spec->human-name spec)
        spec-type        (-> spec-definition :type spec->human-name)
        example-value    (coerce-example-value spec)
        spec-description (:description spec-definition)]

    (if (:leaf? spec-definition)
      (str/join
        "\n"
        [(str "## " display-name)
         ""
         spec-description
         ""
         (str "- Key Name: `" (-> spec name keyword) "`")
         (str "- Type: " spec-type)
         (str "- Example: `" example-value "`")
         "" ; Add a newline at the end
         ""])
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
      (str/join
        "\n"
        [(str "## " display-name)
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
         ""])
      (throw (ex-info "Spec is not a map spec." {:spec spec})))))


(defn wrapper-spec->markdown
  "Generates a markdown description of a wrapper spec."
  [spec]
  (let [spec-definition       (cbf/get-spec spec)
        spec-description      (:description spec-definition)
        display-name          (spec->human-name spec)
        key->spec-map         (:spec-tools.parse/key->spec spec-definition)
        required-keys         (vec (:spec-tools.parse/keys-req spec-definition))
        required-specs        (sort-by name (vals (select-keys key->spec-map required-keys)))
        required-key-markdown (apply str (map key-spec->markdown required-specs))]
    (if (impl/wrapper-spec? spec)
      (str/join
        "\n"
        [(str "## " display-name)
         ""
         spec-description
         ""
         "### Wrapped Record"
         ""
         required-key-markdown
         ""
         ""])
      (throw (ex-info "Spec is not a wrapper spec." {:spec spec})))))


(defn sequence-spec->markdown
  "Generates a markdown description of a sequence spec."
  [spec]
  (let [spec-definition       (cbf/get-spec spec)
        spec-description      (:description spec-definition)
        display-name          (spec->human-name spec)
        sequence-spec         (-> spec-definition :spec-tools.parse/item :spec)
        required-key-markdown (key-spec->markdown sequence-spec)]
    (if (= :vector (:type spec-definition))
      (str/join
        "\n"
        [(str "## " display-name)
         ""
         spec-description
         ""
         "### Collection Type"
         ""
         required-key-markdown
         ""
         ""])
      (throw (ex-info "Spec is not a sequence spec." {:spec spec})))))


(defn map-spec->leaf-spec-markdown
  "Generates a markdown description of a map spec that contains leaf specs."
  [spec]
  (let [spec-definition (cbf/get-spec spec)
        key->spec-map   (:spec-tools.parse/key->spec spec-definition)
        leaf-specs      (sort-by name (vals key->spec-map))
        leaf-markdown   (apply str (map leaf-spec->markdown leaf-specs))]
    (if (every? :leaf? (map cbf/get-spec leaf-specs))
      (str/join
        "\n"
        [leaf-markdown
         ""
         ""])
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
  (io/make-parents "doc/specs/equipment.md")
  (spit "doc/specs/equipment.md"
        (deformat
          (str "# Equipment Records\n\n"
               (wrapper-spec->markdown ::equipment/equipments-wrapper)
               (sequence-spec->markdown ::equipment/equipments)
               (wrapper-spec->markdown ::equipment/equipment-wrapper)
               (map-spec->markdown ::equipment/equipment)
               (map-spec->leaf-spec-markdown ::equipment/equipment)))))


(defn render-specs!
  "Render all the specs to markdown files."
  []
  (render-equipment-file!))
