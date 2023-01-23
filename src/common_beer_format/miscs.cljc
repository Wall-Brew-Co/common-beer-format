(ns common-beer-format.miscs
  "The definition of a misc record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def ^:const misc-types
  #{"spice" "fining" "water agent" "herb" "flavor" "other"})


(spec/def ::type
  (st/spec
   {:type                :string
    :spec                (spec/and string?
                                   #(not (str/blank? %))
                                   #(contains? misc-types (str/lower-case %)))
    :gen                 #(spec/gen misc-types)
    :description         "A case-insensitive string representing the type of the miscellaneous item added to the beer.
                          Must be one of: 'Spice', 'Fining', 'Water Agent', 'Herb', 'Flavor', and 'Other'"
    :json-schema/example "Spice"}))


(def ^:const misc-uses
  #{"boil" "mash" "primary" "secondary" "bottling"})


(spec/def ::use
  (st/spec
   {:type                :string
    :spec                (spec/and string?
                                   #(not (str/blank? %))
                                   #(contains? misc-uses (str/lower-case %)))
    :gen                 #(spec/gen misc-uses)
    :description         "A case-insensitive string representing the point in the brewing cycle the miscellaneous ingredient is added to the beer.
                          Must be one of: 'Boil', 'Mash', 'Primary', 'Secondary', and 'Bottling'"
    :json-schema/example "Mash"}))


(spec/def ::time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the :use field.
                          For \"Boil\" this is the boil time.
                          For \"Mash\" this is the mash time.
                          For \"Primary\", \"Secondary\", and \"Bottling\" this is the amount of time the ingredient spent in that state."
     :json-schema/example "15.0"}))


(spec/def ::use-for
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting what the ingredient is used for"
     :json-schema/example "Used to impart a mild, zesty flavor"}))


(spec/def ::misc
  (st/spec
    {:type        :map
     :description "A record representing a miscellaneous ingredient in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::type
                                      ::use
                                      ::time
                                      ::prim/amount]
                             :opt-un [::prim/amount-is-weight
                                      ::use-for
                                      ::prim/notes
                                      ::prim/display-amount
                                      ::prim/inventory
                                      ::prim/display-time])}))


(spec/def ::misc-wrapper
  (st/spec
    {:type        :map
     :description "A ::misc record wrapped in a :misc map"
     :spec        (spec/keys :req-un [::misc])}))


(spec/def ::miscs
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::misc records"
     :spec          (spec/coll-of ::misc-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::misc-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::misc-wrapper %2)}))


(spec/def ::miscs-wrapper
  (st/spec
    {:type        :map
     :description "A ::miscs record"
     :spec        (spec/keys :req-un [::miscs])}))
