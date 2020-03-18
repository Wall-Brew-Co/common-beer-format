(ns common-beer-format.primitives
  "The basic definitions, units, etc. used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [nnichols.parse :as np]
            [spec-tools.core :as st]))

(s/def ::kilogram
  (st/spec
   {:type          :float
    :spec          (s/and number? pos?)
    :description   "A positive IEEE-754 floating point number representing weight in kilograms"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))

(s/def ::liter
  (st/spec
   {:type          :float
    :spec          (s/and number? pos?)
    :description   "A positive IEEE-754 floating point number representing volume in liters"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))

(s/def ::degrees-celsius
  (st/spec
   {:type          :float
    :spec          number?
    :description   "An IEEE-754 floating point number representing degress in Celsius"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))

(s/def ::minute
  (st/spec
   {:type          :float
    :spec          (s/and number? pos?)
    :description   "A positive IEEE-754 floating point number representing time in minutes"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))

(s/def ::specific-gravity
  (st/spec
   {:type          :float
    :spec          (s/and number? pos?)
    :description   "A positive IEEE-754 floating point number representing the specific gravity relative to the weight of the same size sample of water"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))

(s/def ::kilopascal
  (st/spec
   {:type          :float
    :spec          (s/and number? pos?)
    :description   "A positive IEEE-754 floating point number representing pressure in kilopascals"
    :decode/string #(np/try-parse-float %2)
    :decode/json   #(np/try-parse-float %2)
    :encode/string #(str %2)
    :encode/json   #(str %2)}))
