(ns common-beer-format.mash
  "The definition of mash steps and the mash profile records used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def ^:const mash-step
  "A record representing a mash-step"
  :mash-step)


(def ^:const name
  "The name of the mash step or mash profile"
  :name)


(def ^:const version
  "The version of the BeerXML specification used to create the mash step or mash profile."
  :version)


(def ^:const type
  "The type of mash step.
   
   Currently, the following types are allowed:
   
   - `decoction` - A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
   - `infusion` - A mash step where fermentable ingredients steep in water at a specific temperature.
   - `temperature` - A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  :type)


(def ^:const infuse-amount
  "The volume of water in liters required for an infusion step."
  :infuse-amount)


(def ^:const step-temp
  "The temperature of the mash step should be performed at in degrees Celsius"
  :step-temp)


(def ^:const step-time
  "The time in minutes to spend at this step"
  :step-time)


(def ^:const ramp-time
  "The time in minutes to achieve the desired step temperature"
  :ramp-time)


(def ^:const end-temp
  "The temperature of the mash after the step has completed"
  :end-temp)


(def ^:const description
  "A human-readable description of the mash step"
  :description)


(def ^:const water-grain-ratio
  "A display value for the water:grain ratio after infusion formatted for display in arbitrary units"
  :water-grain-ratio)


(def ^:const decoction-amt
  "A display value for the calculated volume of mash to decoct formatted for display in arbitrary units"
  :decoction-amt)


(def ^:const infuse-temp
  "A display value for the temperature of an infusion step formatted for display in arbitrary units"
  :infuse-temp)


(def ^:const display-step-temp
  "A display value for the temperature of the mash step formatted for display in arbitrary units"
  :display-step-temp)


(def ^:const display-infuse-amt
  "A display value for the volume of water in the mash step formatted for display in arbitrary units"
  :display-infuse-amt)


(def ^:const decoction
  "A mash step where the fermentable ingredients are boiled and then returned to the mash tun."
  "decoction")


(def ^:const infusion
  "A mash step where fermentable ingredients steep in water at a specific temperature."
  "infusion")


(def ^:const temperature
  "A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  "temperature")


(def ^:const mash-step-types
  "A set of allowed mash types
   
   Currently, the following types are allowed:
   
   - `decoction` - A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
   - `infusion` - A mash step where fermentable ingredients steep in water at a specific temperature.
   - `temperature` - A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  #{decoction
    infusion
    temperature})


(spec/def ::type
  (st/spec
   {:type                :string
    :spec                (spec/and string?
                                   #(not (str/blank? %))
                                   #(contains? mash-step-types (str/lower-case %)))
    :gen                 #(spec/gen mash-step-types)
    :description         (impl/multiline "A case-insensitive string representing the type of mash step."
                                         (impl/set->description mash-step-types))
    :json-schema/example "Temperature"}))


(spec/def ::infuse-amount
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of water in liters required for an infusion step."
     :json-schema/example "5.8"}))


(spec/def ::step-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperature of the mash step should be performed at in degrees Celsius"
     :json-schema/example "80"}))


(spec/def ::step-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes to spend at this step"
     :json-schema/example "45.0"}))


(spec/def ::ramp-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes to achieve the desired step temperature"
     :json-schema/example "45.0"}))


(spec/def ::end-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperature of the mash after the step has completed"
     :json-schema/example "80"}))


(spec/def ::description
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the mash step"
     :json-schema/example "Stir your grain bag carefully at 140F"}))


(spec/def ::water-grain-ratio
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the water:grain ratio after infusion formatted for display in arbitrary units"
     :json-schema/example "1.5qt/lb"}))


(spec/def ::decoction-amt
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the calculated volume of mash to decoct formatted for display in arbitrary units"
     :json-schema/example "7.5 liters"}))


(spec/def ::infuse-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of an infusion step formatted for display in arbitrary units"
     :json-schema/example "150F"}))


(spec/def ::display-step-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of an arbitrary step formatted for display in arbitrary units"
     :json-schema/example "150F"}))


(spec/def ::display-infuse-amt
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume of infused liquid formatted for display in arbitrary units"
     :json-schema/example "2.2L"}))


(spec/def ::mash-step
  (st/spec
    {:type        :map
     :description "A record representing a step within the mashing process."
     :spec        (spec/keys :req-un [::prim/name
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


(spec/def ::mash-step-wrapper
  (st/spec
    {:type        :map
     :description "A ::mash record wrapped in a ::mash map"
     :spec        (spec/keys :req-un [::mash-step])}))


(spec/def ::mash-steps
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::mash-step records"
     :spec          (spec/coll-of ::mash-step-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::mash-step-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::mash-step-wrapper %2)}))


(def ^:const mash-steps
  "A collection of mash-steps"
  :mash-steps)


(def ^:const grain-temp
  "The temperature of the grain before adding it to the mash"
  :grain-temp)


(def ^:const notes
  "Notes about the mash."
  :notes)


(def ^:const tun-temp
  "The pre-mash temperature of the mash tun"
  :tun-temp)


(def ^:const sparge-temp
  "The temperature of the sparge water."
  :sparge-temp)


(def ^:const ph
  "The PH of the water."
  :ph)


(def ^:const tun-weight
  "The weight of the mash tun."
  :tun-weight)


(def ^:const tun-specific-heat
  "The specific heat of the mash tun in Calories per gram-degree Celsius."
  :tun-specific-heat)


(def ^:const equip-adjust
  "Whether or not to account for the temperature effects of the equipment used."
  :equip-adjust)


(def ^:const display-grain-temp
  "A display value for the temperature of the grain before adding it to the mash"
  :display-grain-temp)


(def ^:const display-tun-temp
  "A display value for the temperature of the mash tun"
  :display-tun-temp)


(def ^:const display-sparge-temp
  "A display value for the temperature of the sparge water"
  :display-sparge-temp)


(def ^:const display-tun-weight
  "A display value for the weight of the mash tun"
  :display-tun-weight)


(spec/def ::grain-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperature of the grain before adding it to the mash in degrees Celsius"
     :json-schema/example "80"}))


(spec/def ::tun-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperature of the grain tun in degrees Celsius"
     :json-schema/example "80"}))


(spec/def ::sparge-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperature of the sparge in degrees Celsius"
     :json-schema/example "50"}))


(spec/def ::ph
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :description         "A non-negative IEEE-754 floating point number representing the PH of the water"
     :json-schema/example "2.5"}))


(spec/def ::tun-weight
  (st/spec
    {:type                :double
     :spec                ::prim/kilogram
     :description         "A non-negative IEEE-754 floating point number representing the weight of the of the mash tun in kilograms"
     :json-schema/example "15.0"}))


(spec/def ::tun-specific-heat
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :description         "A non-negative IEEE-754 floating point number representing the specific heat of the mashtun in Calories per gram-degree Celsius"
     :json-schema/example "0.2"}))


(spec/def ::equip-adjust
  (st/spec
   {:spec                ::prim/boolean
    :description         (impl/multiline "A boolean denoting whether or not programs should account for the temperature effects of the equipment used."
                                         "When absent, assume false.")
    :json-schema/example "true"
    :decode/string       impl/decode-boolean
    :encode/string       impl/encode-boolean}))


(spec/def ::display-grain-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for grain temperature formatted for display in arbitrary units"
     :json-schema/example "72F"}))


(spec/def ::display-tun-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for mash tun temperature formatted for display in arbitrary units"
     :json-schema/example "72F"}))


(spec/def ::display-sparge-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for sparging process temperature formatted for display in arbitrary units"
     :json-schema/example "172F"}))


(spec/def ::display-tun-weight
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for mash tun weight formatted for display in arbitrary units"
     :json-schema/example "72lbs"}))


(spec/def ::mash
  (st/spec
    {:type        :map
     :description "A record representing the mashing process."
     :spec        (spec/keys :req-un [::prim/name
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


(spec/def ::mash-wrapper
  (st/spec
    {:type        :map
     :description "A ::mash-wrapper record"
     :spec        (spec/keys :req-un [::mash])}))
