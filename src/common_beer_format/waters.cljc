(ns common-beer-format.waters
  "The definition of a water record used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name]))


(def water
  "A map representing the water used during the mash and for top-up."
  :water)


(def waters
  "A vector of water records."
  :waters)


(def name
  "The name of the water record."
  :name)


(def version
  "The version of the BeerXML specification used to create the water record."
  :version)


(def amount
  "The amount of water in liters."
  :amount)


(def calcium
  "The amount of calcium in parts per million."
  :calcium)


(def bicarbonate
  "The amount of bicarbonate in parts per million."
  :bicarbonate)


(def sulfate
  "The amount of sulfate in parts per million."
  :sulfate)


(def chloride
  "The amount of chloride in parts per million."
  :chloride)


(def sodium
  "The amount of sodium in parts per million."
  :sodium)


(def magnesium
  "The amount of magnesium in parts per million."
  :magnesium)


(def ph
  "The pH of the water."
  :ph)


(def notes
  "Notes about the water profile."
  :notes)


(def display-amount
  "The amount of water in a human-readable format."
  :display-amount)


(spec/def ::calcium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of calcium (Ca) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::bicarbonate
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of bicarbonate (HCO3) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::sulfate
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of sulfate (SO4) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::chloride
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of chloride (Cl-) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::sodium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of sodium (Na) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::magnesium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the amount of magnesium (Mg) in parts per million."
     :json-schema/example "2.5"}))


(spec/def ::ph
  (st/spec
    {:type                 :double
     :spec                 (spec/and number? pos?)
     impl/display-name-key "PH"
     :gen                  impl/real-positive-double-generator
     :description          "A positive IEEE-754 floating point number representing the PH of the water."
     :json-schema/example  "2.5"}))


(spec/def ::water
  (st/spec
    {:type        :map
     :description "A record representing the water in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::prim/amount
                                      ::calcium
                                      ::bicarbonate
                                      ::sulfate
                                      ::chloride
                                      ::sodium
                                      ::magnesium]
                             :opt-un [::ph
                                      ::prim/notes
                                      ::prim/display-amount])}))


(spec/def ::water-wrapper
  (st/spec
    {:type                 :map
     impl/wrapper-spec-key true
     :description          "A `::water` record wrapped in a `:water` map."
     :spec                 (spec/keys :req-un [::water])}))


(spec/def ::waters
  (st/spec
    {:type          :vector
     :description   "A vector of valid `::water` records."
     :spec          (spec/coll-of ::water-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::water-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::water-wrapper %2)}))


(spec/def ::waters-wrapper
  (st/spec
    {:type                 :map
     impl/wrapper-spec-key true
     :description          "A `::waters-wrapper` record."
     :spec                 (spec/keys :req-un [::waters])}))
