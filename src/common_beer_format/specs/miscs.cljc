(ns common-beer-format.specs.miscs
  "The definition of a misc record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [common-beer-format.util :as util]
            [spec-tools.core :as st]))


(def ^:const misc-types
  #{"spice" "fining" "water agent" "herb" "flavor" "other"})


(s/def ::type
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? misc-types (cs/lower-case %)))
     :gen #(s/gen misc-types)
     :description         "A case-insensitive string representing the type of the miscellaneous item added to the beer.
                          Must be one of: 'Spice', 'Fining', 'Water Agent', 'Herb', 'Flavor', and 'Other'"
     :json-schema/example "Spice"}))


(def ^:const misc-uses
  #{"boil" "mash" "primary" "secondary" "bottling"})


(s/def ::use
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? misc-uses (cs/lower-case %)))
     :gen                #(s/gen misc-uses)
     :description         "A case-insensitive string representing the point in the brewing cycle the miscellaneous ingredient is added to the beer.
                          Must be one of: 'Boil', 'Mash', 'Primary', 'Secondary', and 'Bottling'"
     :json-schema/example "Mash"}))


(s/def ::time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the :use field.
                          For \"Boil\" this is the boil time.
                          For \"Mash\" this is the mash time.
                          For \"Primary\", \"Secondary\", and \"Bottling\" this is the amount of time the ingredient spent in that state."
     :json-schema/example "15.0"}))


(s/def ::use-for
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting what the ingredient is used for"
     :json-schema/example "Used to impart a mild, zesty flavor"}))


(s/def ::misc
  (st/spec
    {:type        :map
     :description "A record representing a miscellaneous ingredient in a beer recipe."
     :spec        (s/keys :req-un [::prim/name
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


(s/def ::misc-wrapper
  (st/spec
    {:type        :map
     :description "A ::misc record wrapped in a :misc map"
     :spec        (s/keys :req-un [::misc])}))


(s/def ::miscs
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::misc records"
     :spec          (s/coll-of ::misc-wrapper)
     :decode/string #(util/decode-sequence %1 ::misc-wrapper %2)
     :encode/string #(util/encode-sequence %1 ::misc-wrapper %2)}))


(s/def ::miscs-wrapper
  (st/spec
    {:type        :map
     :description "A ::miscs record"
     :spec        (s/keys :req-un [::miscs])}))
