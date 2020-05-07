(ns common-beer-format.specs.fermentables
  "The definition of a fermentable record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [common-beer-format.util :as util]
            [spec-tools.core :as st]))

(def ^:const fermentable-types
  #{"grain" "sugar" "extract" "dry extract" "adjunct"})

(s/def ::type
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? fermentable-types (cs/lower-case %)))
    :description         "A case-insensitive string representing the form of the fermentable.
                          Must be one of: 'Grain', 'Sugar', 'Extract', 'Dry Extract', and 'Adjunct'"
    :json-schema/example "grain"}))

(s/def ::yield
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent rendered sugar from the fermentable"
    :json-schema/example "85.6"}))

(s/def ::color
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the color in SRM for the fermentable"
    :json-schema/example "32"}))

(s/def ::add-after-boil
  (st/spec
   {:spec                ::prim/boolean
    :description         "A boolean representing if the fermentable was added after the boil.
                          When absent, assume false."
    :json-schema/example "false"
    :decode/string       util/decode-boolean
    :encode/string       util/encode-boolean}))

(s/def ::supplier
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the supplier of the fermentable ingredient"
    :json-schema/example "Gnome Brew"}))

(s/def ::coarse-fine-diff
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent difference between the coarse grain yield and fine grain yield.
                          Only appropriate for the 'Grain' or 'Adjunct' types."
    :json-schema/example "85.6"}))

(s/def ::moisture
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent moisture in the grain.
                          Only appropriate for the 'Grain' or 'Adjunct' types."
    :json-schema/example "85.6"}))

(s/def ::diastatic-power
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the diastatic power of the grain in Lintner units.
                          Only appropriate for the 'Grain' or 'Adjunct' types."
    :json-schema/example "85.6"}))

(s/def ::protein
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the protein contents of the grain.
                          Only appropriate for the 'Grain' or 'Adjunct' types."
    :json-schema/example "85.6"}))

(s/def ::max-in-batch
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the suggested maximum percent by weight of the fermentable with respect to all fermentables."
    :json-schema/example "60.5"}))

(s/def ::recommend-mash
  (st/spec
   {:spec                ::prim/boolean
    :description         "A boolean representing if the fermentable is recommended to be included in the mashing step.
                          Only appropriate for the 'Grain' or 'Adjunct' types.
                          When absent, assume false."
    :json-schema/example "false"
    :decode/string       util/decode-boolean
    :encode/string       util/encode-boolean}))

(s/def ::ibu-gal-per-lb
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the IBUs per pound per gallon of water assuming a 60 minute boil.
                          Only appropriate for the 'Extract' type."
    :json-schema/example "12.5"}))

(s/def ::fermentable
  (st/spec
   {:type        :map
    :description "A record representing a fermentable ingredient in a beer recipe."
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::type
                                  ::prim/amount
                                  ::yield
                                  ::color]
                         :opt-un [::add-after-boil
                                  ::prim/origin
                                  ::supplier
                                  ::prim/notes
                                  ::coarse-fine-diff
                                  ::moisture
                                  ::diastatic-power
                                  ::protein
                                  ::max-in-batch
                                  ::recommend-mash
                                  ::ibu-gal-per-lb])}))

(s/def ::fermentable-wrapper
  (st/spec
   {:type        :map
    :description "A ::fermentable record wrapped in a ::fermentable map"
    :spec        (s/keys :req-un [::fermentable])}))

(s/def ::fermentables
  (st/spec
   {:type          :vector
    :description   "A vector of valid ::fermentable-wrapper records"
    :spec          (s/coll-of #(s/valid? ::fermentable-wrapper %))
    :decode/string #(util/decode-sequence %1 ::fermentable-wrapper %2)
    :encode/string #(util/encode-sequence %1 ::fermentable-wrapper %2)}))

(s/def ::fermentables-wrapper
  (st/spec
   {:type        :map
    :description "A ::fermentables-wrapper record"
    :spec        (s/keys :req-un [::fermentables])}))
