(ns common-beer-format.waters
  "The definition of a water record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st]))

(s/def ::calcium
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of calcium (Ca) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::bicarbonate
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of bicarbonate (HCO3) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::sulfate
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of sulfate (SO4) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::chloride
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of chloride (Cl-) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::sodium
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of sodium (Na) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::magnesium
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the amount of magnesium (Mg) in parts per million"
    :json-schema/example "2.5"}))

(s/def ::ph
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the PH of the water"
    :json-schema/example "2.5"}))

(s/def ::water
  (st/spec
   {:type        :map
    :description "A record representing the water in a beer recipe."
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::prim/amount
                                  ::calcium
                                  ::bicarbonate
                                  ::sulfate
                                  ::chloride
                                  ::sodium
                                  ::magnesium]
                         :opt-un [::ph
                                  ::prim/notes])}))

(s/def ::waters
  (st/spec
   {:type        :vector
    :description "A vector of valid ::water records"
    :spec        (s/coll-of #(s/valid? ::water %))}))
