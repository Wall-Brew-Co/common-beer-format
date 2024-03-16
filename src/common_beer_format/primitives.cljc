(ns common-beer-format.primitives
  "The basic definitions, units, etc. used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [nnichols.predicate :as np]
            [spec-tools.core :as st]))


(spec/def ::kilogram
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing weight in kilograms"
     :json-schema/example "10.7"}))


(spec/def ::liter
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing volume in liters"
     :json-schema/example "12.3"}))


(spec/def ::degrees-celsius
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing degress in Celsius"
     :json-schema/example "-10.7"}))


(spec/def ::minute
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing time in minutes"
     :json-schema/example "45.0"}))


(spec/def ::specific-gravity
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the specific gravity relative to the weight of the same size sample of water"
     :json-schema/example "1.045"}))


(spec/def ::kilopascal
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing pressure in kilopascals"
     :json-schema/example "101.325"}))


(spec/def ::percent
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing a human-readable percentage - e.g 5.5"
     :json-schema/example "4.5"}))


(spec/def ::boolean
  (st/spec
    {:spec                np/boolean?
     :description         "A boolean logic value of true or false"
     :json-schema/example "false"
     :gen                 #(spec/gen boolean?)
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::text
  (st/spec
    {:type                :string
     :spec                (spec/and string? #(not (str/blank? %)))
     :description         "A non-empty string"
     :json-schema/example "Used to impart a mild, zesty flavor"}))


(spec/def ::version
  (st/spec
    {:type                :long
     :spec                #(= 1 %)
     :gen                 #(spec/gen #{1})
     :description         "An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists"
     :json-schema/example "1"}))


(spec/def ::name
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string representing the name of the ingredient"
     :json-schema/example "Citra"}))


(spec/def ::amount
  (st/spec
    {:type                :double
     :spec                ::kilogram
     :description         "A ::kilogram value representing the amount of a particular ingredient"
     :json-schema/example "12.5"}))


(spec/def ::notes
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string representing any notes about the subject"
     :json-schema/example "A wonderful, zesty aroma"}))


(spec/def ::origin
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting the place of origin for a particular ingredient"
     :json-schema/example "Nice, France"}))


(spec/def ::substitutes
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting ingredients with me bay used in place of those denoted in the record"
     :json-schema/example "Citra or Sorachi"}))


(spec/def ::amount-is-weight
  (st/spec
    {:type                :boolean
     :spec                ::boolean
     :description         (impl/multiline
                            "A boolean representing if the amount of the substance is measured in kilograms."
                            "When absent, assume false and that the amount of substance is measured in liters.")
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::display-amount
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units"
     :json-schema/example "100 g"}))


(spec/def ::inventory
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units"
     :json-schema/example "100 lbs"}))


(spec/def ::display-time
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for an amount of time formatted for display in arbitrary units"
     :json-schema/example "10 days"}))
