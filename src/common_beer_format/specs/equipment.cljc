(ns common-beer-format.specs.equipment
  "The definition of an equipment record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [nnichols.parse :as n-parse]
            [spec-tools.core :as st]))

(s/def ::boil-size
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the pre-boil volume for the equipment setup"
    :json-schema/example "10.8"}))

(s/def ::batch-size
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the target volume of the batch at the start of fermentation"
    :json-schema/example "5.8"}))

(s/def ::tun-volume
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the volume of the of the mash tun in liters"
    :json-schema/example "15.0"}))

(s/def ::tun-weight
  (st/spec
   {:type                :double
    :spec                ::prim/kilogram
    :description         "A positive IEEE-754 floating point number representing the weight of the of the mash tun in kilograms"
    :json-schema/example "15.0"}))

(s/def ::tun-specific-heat
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the specific heat of the mashtun in Calories per gram-degree Celsius"
    :json-schema/example "0.2"}))

(s/def ::top-up-water
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the volume of top-up water added before fermentation in liters"
    :json-schema/example "2.1"}))

(s/def ::trub-chiller-loss
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the volume of wort lost during transition from the boiler to primary fermentation vessel"
    :json-schema/example "0.1"}))

(s/def ::evap-rate
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percentage of wort lost to evaporation per hour of the boil"
    :json-schema/example "1.2"}))

(s/def ::calc-boil-volume
  (st/spec
   {:spec                ::prim/boolean
    :description         "A boolean denoting whether or not programs reading this equipment record should calculate the boil size.
                          When absent, assume false.
                          When true, then boil-size = (batch-seze – top-up-water – trub-chiller-loss) * (1 + boil-time * evap-rate)"
    :json-schema/example "true"
    :decode/string #(-> %2 str n-parse/parse-boolean)
    :encode/string #(-> %2 str cs/upper-case)}))

(s/def ::lauter-deadspace
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the volume of wort lost to the lauter tun"
    :json-schema/example "0.1"}))

(s/def ::top-up-kettle
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the volume of top-up water added to the boil kettle before the boil begins"
    :json-schema/example "2.1"}))

(s/def ::hop-utilization
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percentage of large batch hop utilization"
    :json-schema/example "1.2"}))

(s/def ::equipment
  (st/spec
   {:type        :map
    :description "A record representing the brewing equipment used in brewing"
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::boil-size
                                  ::batch-size]
                         :opt-un [::tun-volume
                                  ::tun-weight
                                  ::tun-specific-heat
                                  ::top-up-water
                                  ::trub-chiller-loss
                                  ::evap-rate
                                  ::boil-time
                                  ::calc-boil-volume
                                  ::lauter-deadspace
                                  ::top-up-kettle
                                  ::hop-utilization
                                  ::prim/notes])}))
