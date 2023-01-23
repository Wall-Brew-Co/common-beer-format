(ns common-beer-format.waters
  "The definition of a water record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.test.check.generators :as gen]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name]))


(spec/def ::calcium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of calcium (Ca) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::bicarbonate
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of bicarbonate (HCO3) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::sulfate
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of sulfate (SO4) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::chloride
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of chloride (Cl-) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::sodium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of sodium (Na) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::magnesium
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the amount of magnesium (Mg) in parts per million"
     :json-schema/example "2.5"}))


(spec/def ::ph
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the PH of the water"
     :json-schema/example "2.5"}))


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
    {:type        :map
     :description "A ::water record wrapped in a ::water map"
     :spec        (spec/keys :req-un [::water])}))


(spec/def ::waters
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::water records"
     :spec          (spec/coll-of ::water-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::water-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::water-wrapper %2)}))


(spec/def ::waters-wrapper
  (st/spec
    {:type        :map
     :description "A ::waterss-wrapper record"
     :spec        (spec/keys :req-un [::waters])}))
