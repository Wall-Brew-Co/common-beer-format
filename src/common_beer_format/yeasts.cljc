(ns common-beer-format.yeasts
  "The definition of a yeast record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st]))

(def ^:const yeast-types
  #{"ale" "lager" "wheat" "wine" "champagne"})

(s/def ::type
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? yeast-types (cs/lower-case %)))
    :description         "A case-insensitive string representing the type of yeast added to the beer. Must be one of: 'Ale', 'Lager', 'Wheat', 'Wine', and 'Champagne'"
    :json-schema/example "Ale"}))

(def ^:const yeast-forms
  #{"liquid" "dry" "slant" "culture"})

(s/def ::form
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? yeast-forms (cs/lower-case %)))
    :description         "A case-insensitive string representing the form of the yeast added to the beer. Must be one of: 'Liquid', 'Dry', 'Slant', and 'Culture'"
    :json-schema/example "Ale"}))

(s/def ::laboratory
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting the laboratory that cultivated the yeast"
    :json-schema/example "White Labs"}))

(s/def ::product-id
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting the product label or id number that identifies the strain of yeast"
    :json-schema/example "WLP008"}))

(s/def ::min-temperature
  (st/spec
   {:type                :float
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the minimum recommended temperature of fermenation"
    :json-schema/example "19.5"}))

(s/def ::max-temperature
  (st/spec
   {:type                :float
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the maximum recommended temperature of fermenation"
    :json-schema/example "23.9"}))

(def ^:const yeast-flocculation-types
  #{"low" "medium" "high" "very high"})

(s/def ::flocculation
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? yeast-flocculation-types (cs/lower-case %)))
    :description         "A case-insensitive string representing how dense of a floc the yeast will form. Must be one of: 'Low', 'MEdium', 'High', and 'Very High'"
    :json-schema/example "High"}))

(s/def ::attenuation
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent of malt sugar that can be converted to ethanol and carbon dioxide"
    :json-schema/example "73.2"}))

(s/def ::best-for
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting the styles of beer this yeast is best suited for"
    :json-schema/example "WLP008"}))

(s/def ::times-cultured
  (st/spec
   {:type                :long
    :spec                (s/and int? #(not (neg? %)))
    :description         "A non-negative integer representing the number of times this yeast has been harvested and re-used.
                          A value of zero assumes the yeast came directly from the manufacturer."
    :json-schema/example "1"}))

(s/def ::max-reuse
  (st/spec
   {:type                :long
    :spec                (s/and int? #(not (neg? %)))
    :description         "A non-negative integer representing the suggested maximum number of times the yeast may be harvested and recultured"
    :json-schema/example "3"}))

(s/def ::add-to-secondary
  (st/spec
   {:type                :boolean
    :spec                ::prim/boolean
    :description         "A boolean representing if this yeast was added for a secondary fermentation.
                          When absent, assume false."
    :json-schema/example "false"}))

(s/def ::yeast
  (st/spec
   {:type        :map
    :description "A record representing the yeast in a beer recipe."
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::type
                                  ::form
                                  ::prim/amount]
                         :opt-un [::prim/amount-is-weight
                                  ::laboratory
                                  ::product-id
                                  ::min-temperature
                                  ::max-temperature
                                  ::flocculation
                                  ::attenuation
                                  ::prim/notes
                                  ::best-for
                                  ::times-cultured
                                  ::max-reuse
                                  ::add-to-secondary])}))

(s/def ::yeasts
  (st/spec
   {:type        :vector
    :description "A vector of valid ::yeast records"
    :spec        (s/coll-of #(s/valid? ::yeast %))}))
