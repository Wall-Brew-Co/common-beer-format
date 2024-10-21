(ns common-beer-format.mash
  "The definition of mash steps and the mash profile records used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def mash
  "A record representing a mash profile."
  :mash)


(def mash-step
  "A record representing a mash-step."
  :mash-step)


(def name
  "The name of the mash step or mash profile."
  :name)


(def version
  "The version of the BeerXML specification used to create the mash step or mash profile."
  :version)


(def type
  "The type of mash step.

   Currently, the following types are allowed:

   - `decoction` - A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
   - `infusion` - A mash step where fermentable ingredients steep in water at a specific temperature.
   - `temperature` - A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  :type)


(def infuse-amount
  "The volume of water in liters required for an infusion step."
  :infuse-amount)


(def step-temp
  "The temperature of the mash step should be performed at in degrees Celsius."
  :step-temp)


(def step-time
  "The time in minutes to spend at this step."
  :step-time)


(def ramp-time
  "The time in minutes to achieve the desired step temperature."
  :ramp-time)


(def end-temp
  "The temperature of the mash after the step has completed."
  :end-temp)


(def description
  "A human-readable description of the mash step."
  :description)


(def water-grain-ratio
  "A display value for the water:grain ratio after infusion formatted for display in arbitrary units."
  :water-grain-ratio)


(def decoction-amt
  "A display value for the calculated volume of mash to decoct formatted for display in arbitrary units."
  :decoction-amt)


(def infuse-temp
  "A display value for the temperature of an infusion step formatted for display in arbitrary units."
  :infuse-temp)


(def display-step-temp
  "A display value for the temperature of the mash step formatted for display in arbitrary units."
  :display-step-temp)


(def display-infuse-amt
  "A display value for the volume of water in the mash step formatted for display in arbitrary units."
  :display-infuse-amt)


(def decoction
  "A mash step where the fermentable ingredients are boiled and then returned to the mash tun."
  "Decoction")


(def infusion
  "A mash step where fermentable ingredients steep in water at a specific temperature."
  "Infusion")


(def temperature
  "A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  "Temperature")


(def mash-step-types
  "A set of allowed mash types.

   Currently, the following types are allowed:

   - `decoction` - A mash step where the fermentable ingredients are boiled and then returned to the mash tun.
   - `infusion` - A mash step where fermentable ingredients steep in water at a specific temperature.
   - `temperature` - A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source."
  #{decoction
    infusion
    temperature})


(spec/def ::type
  (st/spec
    {:type                  :string
     :spec                  mash-step-types
     impl/beer-xml-type-key impl/beer-xml-list
     :gen                   #(spec/gen mash-step-types)
     :description           (impl/multiline "A case-sensitive string representing the type of mash step."
                                            (impl/set->description mash-step-types)
                                            ""
                                            "- Decoction: A mash step where the fermentable ingredients are boiled and then returned to the mash tun."
                                            "- Infusion: A mash step where fermentable ingredients steep in water at a specific temperature."
                                            "- Temperature: A mash step where the temperature of the mash is held at a specific temperature for a specific time by an external source.")
     :json-schema/example   "Temperature"}))


(spec/def ::infuse-amount
  (st/spec
    {:type                   :double
     :spec                   ::prim/liter
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-liter
     :description            "A non-negative IEEE-754 floating point number representing the volume of water in liters required for an infusion step."
     :json-schema/example    5.8}))


(spec/def ::step-temp
  (st/spec
    {:type                   :double
     impl/display-name-key   "Step Temperature"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-degrees-celsius
     :spec                   ::prim/degrees-celsius
     :description            "A non-negative IEEE-754 floating point number representing the temperature of the mash step should be performed at in degrees Celsius."
     :json-schema/example    80}))


(spec/def ::step-time
  (st/spec
    {:type                   :double
     :spec                   ::prim/minute
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-minute
     :description            "A non-negative IEEE-754 floating point number representing the time in minutes to spend at this step."
     :json-schema/example    45.0}))


(spec/def ::ramp-time
  (st/spec
    {:type                   :double
     :spec                   ::prim/minute
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-minute
     :description            "A non-negative IEEE-754 floating point number representing the time in minutes to achieve the desired step temperature."
     :json-schema/example    45.0}))


(spec/def ::end-temp
  (st/spec
    {:type                   :double
     impl/display-name-key   "End Temperature"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-degrees-celsius
     :spec                   ::prim/degrees-celsius
     :description            "A non-negative IEEE-754 floating point number representing the temperature of the mash after the step has completed in degrees Celsius."
     :json-schema/example    80}))


(spec/def ::description
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string describing the mash step."
     :json-schema/example   "Stir your grain bag carefully at 140F."}))


(spec/def ::water-grain-ratio
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the water:grain ratio after infusion formatted for display in arbitrary units."
     :json-schema/example   "1.5qt/lb"}))


(spec/def ::decoction-amt
  (st/spec
    {:type                  :string
     impl/display-name-key  "Decoction Amount"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for the calculated volume of mash to decoct formatted for display in arbitrary units."
     :json-schema/example   "7.5 liters"}))


(spec/def ::infuse-temp
  (st/spec
    {:type                  :string
     impl/display-name-key  "Infusion Temperature"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for the temperature of an infusion step formatted for display in arbitrary units."
     :json-schema/example   "150F"}))


(spec/def ::display-step-temp
  (st/spec
    {:type                  :string
     impl/display-name-key  "Display Step Temperature"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for the temperature of an arbitrary step formatted for display in arbitrary units."
     :json-schema/example   "150F"}))


(spec/def ::display-infuse-amt
  (st/spec
    {:type                  :string
     impl/display-name-key  "Display Infusion Amount"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for the volume of infused liquid formatted for display in arbitrary units."
     :json-schema/example   "2.2L"}))


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
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record
     :description           "A `::mash` record wrapped in a `:mash` map"
     :spec                  (spec/keys :req-un [::mash-step])}))


(spec/def ::mash-steps
  (st/spec
    {:type                  :vector
     impl/beer-xml-type-key impl/beer-xml-record-set
     :description           "A `::mash-step` record set."
     :spec                  (spec/coll-of ::mash-step-wrapper :into [] :kind vector?)
     :decode/string         #(impl/decode-sequence %1 ::mash-step-wrapper %2)
     :encode/string         #(impl/encode-sequence %1 ::mash-step-wrapper %2)}))


(def mash-steps
  "A collection of mash-steps."
  :mash-steps)


(def grain-temp
  "The temperature of the grain before adding it to the mash."
  :grain-temp)


(def notes
  "Notes about the mash."
  :notes)


(def tun-temp
  "The pre-mash temperature of the mash tun."
  :tun-temp)


(def sparge-temp
  "The temperature of the sparge water."
  :sparge-temp)


(def ph
  "The PH of the water."
  :ph)


(def tun-weight
  "The weight of the mash tun."
  :tun-weight)


(def tun-specific-heat
  "The specific heat of the mash tun in Calories per gram-degree Celsius."
  :tun-specific-heat)


(def equip-adjust
  "Whether or not to account for the temperature effects of the equipment used."
  :equip-adjust)


(def display-grain-temp
  "A display value for the temperature of the grain before adding it to the mash."
  :display-grain-temp)


(def display-tun-temp
  "A display value for the temperature of the mash tun."
  :display-tun-temp)


(def display-sparge-temp
  "A display value for the temperature of the sparge water."
  :display-sparge-temp)


(def display-tun-weight
  "A display value for the weight of the mash tun."
  :display-tun-weight)


(spec/def ::grain-temp
  (st/spec
    {:type                   :double
     impl/display-name-key   "Grain Temperature"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-degrees-celsius
     :spec                   ::prim/degrees-celsius
     :description            "A non-negative IEEE-754 floating point number representing the temperature of the grain before adding it to the mash in degrees Celsius."
     :json-schema/example    80}))


(spec/def ::tun-temp
  (st/spec
    {:type                   :double
     impl/display-name-key   "Tun Temperature"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-degrees-celsius
     :spec                   ::prim/degrees-celsius
     :description            "A non-negative IEEE-754 floating point number representing the temperature of the grain tun in degrees Celsius."
     :json-schema/example    80}))


(spec/def ::sparge-temp
  (st/spec
    {:type                   :double
     impl/display-name-key   "Sparge Temperature"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-degrees-celsius
     :spec                   ::prim/degrees-celsius
     :description            "A non-negative IEEE-754 floating point number representing the temperature of the sparge in degrees Celsius."
     :json-schema/example    50}))


(spec/def ::ph
  (st/spec
    {:type                  :double
     impl/display-name-key  "PH"
     impl/beer-xml-type-key impl/beer-xml-floating-point
     :spec                  ::prim/non-negative-number
     :description           "A non-negative IEEE-754 floating point number representing the PH of the water."
     :json-schema/example   2.5}))


(spec/def ::tun-weight
  (st/spec
    {:type                   :double
     :spec                   ::prim/kilogram
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-kilogram
     :description            "A non-negative IEEE-754 floating point number representing the weight of the of the mash tun in kilograms."
     :json-schema/example    15.0}))


(spec/def ::tun-specific-heat
  (st/spec
    {:type                   :double
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-calories-per-gram-degree-celsius
     :spec                   ::prim/non-negative-number
     :description            "A non-negative IEEE-754 floating point number representing the specific heat of the mash tun in Calories per gram-degree Celsius."
     :json-schema/example    0.2}))


(spec/def ::equip-adjust
  (st/spec
    {:spec                  ::prim/boolean
     impl/display-name-key  "Equipment Adjust"
     impl/beer-xml-type-key impl/beer-xml-boolean
     :description           (impl/multiline "A boolean denoting whether or not programs should account for the temperature effects of the equipment used."
                                            "When absent, assume false.")
     :json-schema/example   true
     :decode/string         impl/decode-boolean
     :encode/string         impl/encode-boolean}))


(spec/def ::display-grain-temp
  (st/spec
    {:type                  :string
     impl/display-name-key  "Display Grain Temperature"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for grain temperature formatted for display in arbitrary units."
     :json-schema/example   "72F"}))


(spec/def ::display-tun-temp
  (st/spec
    {:type                  :string
     impl/display-name-key  "Display Tun Temperature"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for mash tun temperature formatted for display in arbitrary units."
     :json-schema/example   "72F"}))


(spec/def ::display-sparge-temp
  (st/spec
    {:type                  :string
     impl/display-name-key  "Display Sparge Temperature"
     impl/beer-xml-type-key impl/beer-xml-text
     :spec                  ::prim/text
     :description           "A non-empty string denoting a display value for sparging process temperature formatted for display in arbitrary units."
     :json-schema/example   "172F"}))


(spec/def ::display-tun-weight
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for mash tun weight formatted for display in arbitrary units."
     :json-schema/example   "72lbs"}))


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
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record
     :description           "A `::mash-wrapper` record"
     :spec                  (spec/keys :req-un [::mash])}))


(spec/def ::mashs
  (st/spec
    {:type          :vector
     :description   "A vector of valid `::mash` records."
     :spec          (spec/coll-of ::mash-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::mash-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::mash-wrapper %2)}))


(spec/def ::mashs-wrapper
  (st/spec
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record-set
     :description           "A `::mashs` record record set."
     :spec                  (spec/keys :req-un [::mashs])}))
