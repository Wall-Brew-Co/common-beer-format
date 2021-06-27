(ns common-beer-format.specs.mash
  "The definition of mash steps and the mash profile records used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [common-beer-format.util :as util]
            [spec-tools.core :as st]))


(def mash-step-types
  #{"infusion" "temperature" "decoction"})


(s/def ::type
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? mash-step-types (cs/lower-case %)))
     :description         "A case-insensitive string representing the type of mash step.
                          Must be one of: 'Infusion', 'Temperature', and 'Decoction'"
     :json-schema/example "Temperature"}))


(s/def ::infuse-amount
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A positive IEEE-754 floating point number representing the volume of water in liters required for an infusion step."
     :json-schema/example "5.8"}))


(s/def ::step-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A positive IEEE-754 floating point number representing the temperature of the mash step should be performed at in degrees Celsius"
     :json-schema/example "80"}))


(s/def ::step-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A positive IEEE-754 floating point number representing the time in minutes to spend at this step"
     :json-schema/example "45.0"}))


(s/def ::ramp-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A positive IEEE-754 floating point number representing the time in minutes to achieve the desired step temperature"
     :json-schema/example "45.0"}))


(s/def ::end-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A positive IEEE-754 floating point number representing the temperature of the mash after the step has completed"
     :json-schema/example "80"}))


(s/def ::description
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the mash step"
     :json-schema/example "Stir your grain bag carefully at 140F"}))


(s/def ::water-grain-ratio
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the water:grain ratio after infusion formatted for display in arbitrary units"
     :json-schema/example "1.5qt/lb"}))


(s/def ::decoction-amt
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the calculated volume of mash to decoct formatted for display in arbitrary units"
     :json-schema/example "7.5 liters"}))


(s/def ::infuse-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of an infusion step formatted for display in arbitrary units"
     :json-schema/example "150F"}))


(s/def ::display-step-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of an arbitrary step formatted for display in arbitrary units"
     :json-schema/example "150F"}))


(s/def ::display-infuse-amt
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume of infused liquid formatted for display in arbitrary units"
     :json-schema/example "2.2L"}))


(s/def ::mash-step
  (st/spec
    {:type        :map
     :description "A record representing a step within the mashing process."
     :spec        (s/keys :req-un [::prim/name
                                   ::prim/version
                                   ::type
                                   ::infuse-amount
                                   ::step-temp
                                   ::step-time]
                          :opt-un [::ramp-time
                                   ::end-temp
                                   ::description
                                   ::water-grain-ratio
                                   ::decoction-amt
                                   ::infuse-temp
                                   ::display-step-temp
                                   ::display-infuse-amt])}))


(s/def ::mash-step-wrapper
  (st/spec
    {:type        :map
     :description "A ::mash record wrapped in a ::mash map"
     :spec        (s/keys :req-un [::mash-step])}))


(s/def ::mash-steps
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::mash-step records"
     :spec          (s/coll-of #(s/valid? ::mash-step-wrapper %))
     :decode/string #(util/decode-sequence %1 ::mash-step-wrapper %2)
     :encode/string #(util/encode-sequence %1 ::mash-step-wrapper %2)}))


(s/def ::grain-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A positive IEEE-754 floating point number representing the temperature of the grain before adding it to the mash in degrees Celsius"
     :json-schema/example "80"}))


(s/def ::tun-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A positive IEEE-754 floating point number representing the temperature of the grain tun in degrees Celsius"
     :json-schema/example "80"}))


(s/def ::sparge-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A positive IEEE-754 floating point number representing the temperature of the sparge in degrees Celsius"
     :json-schema/example "50"}))


(s/def ::ph
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A positive IEEE-754 floating point number representing the PH of the water"
     :json-schema/example "2.5"}))


(s/def ::tun-weight
  (st/spec
    {:type                :double
     :spec                ::prim/kilogram
     :description         "A positive IEEE-754 floating point number representing the weight of the of the mash tun in kilograms"
     :json-schema/example "15.0"}))


(s/def ::tun-specific-heat
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A positive IEEE-754 floating point number representing the specific heat of the mashtun in Calories per gram-degree Celsius"
     :json-schema/example "0.2"}))


(s/def ::equip-adjust
  (st/spec
    {:spec                ::prim/boolean
     :description         "A boolean denoting whether or not programs should account for the temperature effects of the equipment used.
                          When absent, assume false."
     :json-schema/example "true"
     :decode/string       util/decode-boolean
     :encode/string       util/encode-boolean}))


(s/def ::display-grain-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for grain temperature formatted for display in arbitrary units"
     :json-schema/example "72F"}))


(s/def ::display-tun-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for mash tun temperature formatted for display in arbitrary units"
     :json-schema/example "72F"}))


(s/def ::display-sparge-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for sparging process temperature formatted for display in arbitrary units"
     :json-schema/example "172F"}))


(s/def ::display-tun-weight
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for mash tun weight formatted for display in arbitrary units"
     :json-schema/example "72lbs"}))


(s/def ::mash
  (st/spec
    {:type        :map
     :description "A record representing the mashing process."
     :spec        (s/keys :req-un [::prim/name
                                   ::prim/version
                                   ::grain-temp
                                   ::mash-steps]
                          :opt-un [::prim/notes
                                   ::tun-temp
                                   ::sparge-temp
                                   ::ph
                                   ::tun-weight
                                   ::tun-specific-heat
                                   ::equip-adjust
                                   ::display-grain-temp
                                   ::display-tun-temp
                                   ::display-sparge-temp
                                   ::display-tun-weight])}))


(s/def ::mash-wrapper
  (st/spec
    {:type        :map
     :description "A ::mash-wrapper record"
     :spec        (s/keys :req-un [::mash])}))
