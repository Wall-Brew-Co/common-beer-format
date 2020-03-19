(ns common-beer-format.primitives
  "The basic definitions, units, etc. used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [spec-tools.core :as st]))

(s/def ::kilogram
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing weight in kilograms"
    :json-schema/example "10.7"}))

(s/def ::liter
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing volume in liters"
    :json-schema/example "12.3"}))

(s/def ::degrees-celsius
  (st/spec
   {:type                :float
    :spec                number?
    :description         "An IEEE-754 floating point number representing degress in Celsius"
    :json-schema/example "-10.7"}))

(s/def ::minute
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing time in minutes"
    :json-schema/example "45.0"}))

(s/def ::specific-gravity
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the specific gravity relative to the weight of the same size sample of water"
    :json-schema/example "1.045"}))

(s/def ::kilopascal
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing pressure in kilopascals"
    :json-schema/example "101.325"}))

(s/def ::percent
  (st/spec
   {:type                :float
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing a human-readable percentage - e.g 5.5"
    :json-schema/example "4.5"}))

(s/def ::version
  (st/spec
   {:type                :int
    :spec                #(= 1 %)
    :description         "An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists"
    :json-schema/example "1"}))

(s/def ::name
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string representing the name of the ingredient"
    :json-schema/example "Citra"}))

(s/def ::amount
  (st/spec
   {:type                :float
    :spec                ::kilogram
    :description         "A ::kilogram value representing the amount of a particular ingredient"
    :json-schema/example "12.5"}))

(s/def ::notes
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string representing any notes about the subject"
    :json-schema/example "A wonderful, zesty aroma"}))

(s/def ::origin
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting the place of originfor a particular ingredient"
    :json-schema/example "Nice, France"}))

(s/def ::substitutes
  (st/spec
   {:type                :string
    :spec                (s/and string? #(not (cs/blank? %)))
    :description         "A non-empty string denoting ingredients with me bay used in place of those deonted in the reocrd"
    :json-schema/example "Citra or Sorachi"}))
