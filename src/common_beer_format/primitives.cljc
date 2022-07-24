(ns common-beer-format.primitives
  "The basic definitions, units, etc. used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [clojure.string :as cs]
            [common-beer-format.util :as util]
            [nnichols.predicate :as np]
            [spec-tools.core :as st]))

(s/def ::kilogram
  (st/spec
    {:type                :double
     :spec                (s/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A non-negative IEEE-754 floating point number representing weight in kilograms"
     :json-schema/example "10.7"}))


(s/def ::liter
  (st/spec
    {:type                :double
     :spec                (s/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A non-negative IEEE-754 floating point number representing volume in liters"
     :json-schema/example "12.3"}))


(s/def ::degrees-celsius
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false :NaN? false})
     :description         "An IEEE-754 floating point number representing degress in Celsius"
     :json-schema/example "-10.7"}))


(s/def ::minute
  (st/spec
    {:type                :double
     :spec                (s/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A non-negative IEEE-754 floating point number representing time in minutes"
     :json-schema/example "45.0"}))


(s/def ::specific-gravity
  (st/spec
    {:type                :double
     :spec                (s/and number? pos?)
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A positive IEEE-754 floating point number representing the specific gravity relative to the weight of the same size sample of water"
     :json-schema/example "1.045"}))


(s/def ::kilopascal
  (st/spec
    {:type                :double
     :spec                (s/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A non-negative IEEE-754 floating point number representing pressure in kilopascals"
     :json-schema/example "101.325"}))


(s/def ::percent
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false :NaN? false})
     :description         "An IEEE-754 floating point number representing a human-readable percentage - e.g 5.5"
     :json-schema/example "4.5"}))


(s/def ::boolean
  (st/spec
    {:spec                np/boolean?
     :description         "A boolean logic value of true or false"
     :json-schema/example "false"
     :gen                 #(s/gen boolean?)
     :decode/string       util/decode-boolean
     :encode/string       util/encode-boolean}))


(s/def ::text
  (st/spec
    {:type                :string
     :spec                (s/and string? #(not (cs/blank? %)))
     :description         "A non-empty string"
     :json-schema/example "Used to impart a mild, zesty flavor"}))


(s/def ::version
  (st/spec
    {:type                :long
     :spec                #(= 1 %)
     :gen                 #(s/gen #{1})
     :description         "An integer representing the version of the BeerXML standard implemented in a given record. Currently, only 1 exists"
     :json-schema/example "1"}))


(s/def ::name
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string representing the name of the ingredient"
     :json-schema/example "Citra"}))


(s/def ::amount
  (st/spec
    {:type                :double
     :spec                ::kilogram
     :description         "A ::kilogram value representing the amount of a particular ingredient"
     :json-schema/example "12.5"}))


(s/def ::notes
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string representing any notes about the subject"
     :json-schema/example "A wonderful, zesty aroma"}))


(s/def ::origin
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting the place of originfor a particular ingredient"
     :json-schema/example "Nice, France"}))


(s/def ::substitutes
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting ingredients with me bay used in place of those deonted in the reocrd"
     :json-schema/example "Citra or Sorachi"}))


(s/def ::amount-is-weight
  (st/spec
    {:type                :boolean
     :spec                ::boolean
     :description         "A boolean representing if the amount of the substance is measured in kilograms.
                          When absent, assume false and that the amount of substance is measured in liters."
     :json-schema/example "false"
     :decode/string       util/decode-boolean
     :encode/string       util/encode-boolean}))


(s/def ::display-amount
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for the amount of the ingredient in a recipe formatted for display in arbitrary units"
     :json-schema/example "100 g"}))


(s/def ::inventory
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for the amount of the ingredient in inventory formatted for display in arbitrary units"
     :json-schema/example "100 lbs"}))


(s/def ::display-time
  (st/spec
    {:type                :string
     :spec                ::text
     :description         "A non-empty string denoting a display value for an amount of time formatted for display in arbitrary units"
     :json-schema/example "10 days"}))
