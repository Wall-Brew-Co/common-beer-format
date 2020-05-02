(ns common-beer-format.miscs
  "The definition of a misc record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st]))

(def ^:const misc-types
  #{"spice" "fining" "water agent" "herb" "flavor" "other"})

(s/def ::type
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? misc-types (cs/lower-case %)))
    :description         "A case-insensitive string representing the type of the miscelaneous item added to the beer. Must be one of: 'Spice', 'Fining', 'Water Agent', 'Herb', 'Flavor', and 'Other'"
    :json-schema/example "Spice"}))

(def ^:const misc-uses
  #{"boil" "mash" "primary" "secondary" "bottling"})

(s/def ::use
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? misc-uses (cs/lower-case %)))
    :description         "A case-insensitive string representing the point in the brewing cycle the miscelaneous ingredient is added to the beer. Must be one of: 'Boil', 'Mash', 'Primary', 'Secondary', and 'Bottling'"
    :json-schema/example "Mash"}))

(s/def ::time
  (st/spec
   {:type                :float
    :spec                ::prim/minute
    :description         "A positive IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the :use field.
                          For \"Boil\" this is the boil time.
                          For \"Mash\" this is the mash time.
                          For \"Primary\", \"Secondary\", and \"Bottling\" this is the amount of time the ingredient spent in that state."
    :json-schema/example "15.0"}))

(s/def ::use-for
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting what the ingredient is used for"
    :json-schema/example "Used to impart a mild, zesty flavor"}))

(s/def ::misc
  (st/spec
   {:type        :map
    :description "A record representing a miscelaneous ingredient in a beer recipe."
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::type
                                  ::use
                                  ::time
                                  ::prim/amount]
                         :opt-un [::prim/amount-is-weight
                                  ::use-for
                                  ::prim/notes])}))

(s/def ::miscs
  (st/spec
   {:type        :vector
    :description "A vector of valid ::misc records"
    :spec        (s/coll-of #(s/valid? ::misc %))}))
