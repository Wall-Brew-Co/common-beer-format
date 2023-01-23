(ns common-beer-format.equipment
  "The definition of an equipment record used in BeerXML"
  (:require [clojure.spec.alpha :as spec]
            [clojure.test.check.generators :as gen]
            [common-beer-format.primitives :as prim]
            [common-beer-format.util :as util]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name]))

(def ^:const equipment
  "A map representing the brewing equipment used during the mash."
  :equipment)

(def ^:const name
  "The name of the equipment record."
  :name)

(def ^:const version
  "The version of the BeerXML specification used to create the equipment record."
  :version)

(def ^:const boil-size
  "The pre-boil volume for the equipment setup."
  :boil-size)

(def ^:const batch-size
  "The target volume of the batch at the start of fermentation."
  :batch-size)

(def ^:const tun-volume
  "The volume of the of the mash tun in liters."
  :tun-volume)

(def ^:const tun-weight
  "The weight of the of the mash tun in kilograms."
  :tun-weight)

(def ^:const tun-specific-heat
  "The specific heat of the mashtun in Calories per gram-degree Celsius."
  :tun-specific-heat)

(def ^:const top-up-water
  "The volume of top-up water added before fermentation in liters."
  :top-up-water)

(def ^:const trub-chiller-loss
  "The volume of wort lost during transition from the boiler to primary fermentation vessel."
  :trub-chiller-loss)

(def ^:const evap-rate
  "The percentage of wort lost to evaporation per hour of the boil."
  :evap-rate)

(def ^:const boil-time
  "The normal amount of time one boils for this equipment setup. This can be used with the evaporation rate to calculate the evaporation loss."
  :boil-time)

(def ^:const calc-boil-volume
  "A boolean denoting whether or not programs reading this equipment record should calculate the boil size."
  :calc-boil-volume)

(def ^:const lauter-deadspace
  "The volume of wort lost to deadspace in the mash tun."
  :lauter-deadspace)

(def ^:const top-up-kettle
  "The volume of wort lost to deadspace in the kettle."
  :top-up-kettle)

(def ^:const hop-utilization
  "The percentage of hops that are utilized in the boil."
  :hop-utilization)

(def ^:const notes
  "A string containing notes about the equipment setup"
  :notes)

(def ^:const display-boil-size
  "The pre-boil volume for the equipment setup in a human-readable format."
  :display-boil-size)

(def ^:const display-batch-size
  "The target volume of the batch at the start of fermentation in a human-readable format."
  :display-batch-size)

(def ^:const display-tun-volume
  "The volume of the of the mash tun in liters in a human-readable format."
  :display-tun-volume)

(def ^:const display-tun-weight
  "The weight of the of the mash tun in kilograms in a human-readable format."
  :display-tun-weight)

(def ^:const display-top-up-water
  "The volume of top-up water added before fermentation in liters in a human-readable format."
  :display-top-up-water)

(def ^:const display-trub-chiller-loss
  "The volume of wort lost during transition from the boiler to primary fermentation vessel in a human-readable format."
  :display-trub-chiller-loss)

(def ^:const display-lauter-deadspace
  "The volume of wort lost to deadspace in the mash tun in a human-readable format."
  :display-lauter-deadspace)

(def ^:const display-top-up-kettle
  "The volume of wort lost to deadspace in the kettle in a human-readable format."
  :display-top-up-kettle)


(spec/def ::boil-size
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the pre-boil volume for the equipment setup"
     :json-schema/example "10.8"}))


(spec/def ::batch-size
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the target volume of the batch at the start of fermentation"
     :json-schema/example "5.8"}))


(spec/def ::tun-volume
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of the of the mash tun in liters"
     :json-schema/example "15.0"}))


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
     :gen                 #(gen/double* {:infinite? false :NaN? false :min 0})
     :description         "A non-negative IEEE-754 floating point number representing the specific heat of the mashtun in Calories per gram-degree Celsius"
     :json-schema/example "0.2"}))


(spec/def ::top-up-water
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of top-up water added before fermentation in liters"
     :json-schema/example "2.1"}))


(spec/def ::trub-chiller-loss
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of wort lost during transition from the boiler to primary fermentation vessel"
     :json-schema/example "0.1"}))


(spec/def ::evap-rate
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percentage of wort lost to evaporation per hour of the boil"
     :json-schema/example "1.2"}))


(spec/def ::boil-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the normal amount of time one boils for this equipment setup. This can be used with the evaporation rate to calculate the evaporation loss."
     :json-schema/example "15"}))


(spec/def ::calc-boil-volume
  (st/spec
    {:spec                ::prim/boolean
     :description         "A boolean denoting whether or not programs reading this equipment record should calculate the boil size.
                          When absent, assume false.
                          When true, then boil-size = (batch-size – top-up-water – trub-chiller-loss) * (1 + boil-time * evap-rate)"
     :json-schema/example "true"
     :decode/string       util/decode-boolean
     :encode/string       util/encode-boolean}))


(spec/def ::lauter-deadspace
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of wort lost to the lauter tun"
     :json-schema/example "0.1"}))


(spec/def ::top-up-kettle
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the volume of top-up water added to the boil kettle before the boil begins"
     :json-schema/example "2.1"}))


(spec/def ::hop-utilization
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percentage of large batch hop utilization"
     :json-schema/example "1.2"}))




(spec/def ::display-boil-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units"
     :json-schema/example "5.0 gallons"}))


(spec/def ::display-batch-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-permentation volume formatted for display in arbitrary units"
     :json-schema/example "4.5 gallons"}))


(spec/def ::display-tun-volume
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume capacity of the mash tun formatted for display in arbitrary units"
     :json-schema/example "20 liters"}))


(spec/def ::display-tun-weight
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the empty weight of the mash tun formatted for display in arbitrary units"
     :json-schema/example "5.5 pounds"}))


(spec/def ::display-top-up-water
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume of top-up water added before fermentation formatted for display in arbitrary units"
     :json-schema/example "2.2 liters"}))


(spec/def ::display-trub-chiller-loss
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume of wort lost in transition between boiler and fermentation vessel formatted for display in arbitrary units"
     :json-schema/example "2.2 liters"}))


(spec/def ::display-lauter-deadspace
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the volume of wort lost in the lauter vessel formatted for display in arbitrary units"
     :json-schema/example "2.2 liters"}))


(spec/def ::display-top-up-kettle
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the top-up water added to the pre-boil stage of the kettle formatted for display in arbitrary units"
     :json-schema/example "2.2 liters"}))


(spec/def ::equipment
  (st/spec
    {:type        :map
     :description "A record representing the brewing equipment used in brewing"
     :spec        (spec/keys :req-un [::prim/name
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
                                      ::prim/notes
                                      ::display-boil-size
                                      ::display-batch-size
                                      ::display-tun-volume
                                      ::display-tun-weight
                                      ::display-top-up-water
                                      ::display-trub-chiller-loss
                                      ::display-lauter-deadspace
                                      ::display-top-up-kettle])}))


(spec/def ::equipment-wrapper
  (st/spec
    {:type          :map
     :description   "An ::equipment record wrapped in an ::equipment map"
     :spec          (spec/keys :req-un [::equipment])
     :decode/string #(util/decode-wrapper %1 ::equipment %2)
     :encode/string #(util/encode-wrapper %1 ::equipment %2)}))
