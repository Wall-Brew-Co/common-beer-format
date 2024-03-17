(ns common-beer-format.generative.util
  "Utilities for generative tests"
  (:require [clojure.spec.alpha :as spec]
            [clojure.spec.gen.alpha :as gen]
            [common-beer-format.core :as cbf]
            [common-beer-format.impl :as impl]))


(defn generatable?
  "Attempts to generate a value for spec and returns true if it succeeds."
  {:added  "1.3"
   :no-doc true}
  [spec]
  (try
    (every? #(spec/valid? spec %) (gen/sample (spec/gen spec)))
    (catch #? (:clj Exception :cljs :default) e
      (println (str "Failed to generate a value for spec: " spec))
      (println e)
      false)))

(defn valid-beer-xml-units?
  "Check the spec for valid BeerXML units.
   Values must either not be present or be one of the valid BeerXML units."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (let [spec-units (-> spec cbf/get-spec impl/beer-xml-units-key)]
    (cond
      (nil? spec-units)    (do (println (str "No units specified for spec: " spec)) true)
      (string? spec-units) (contains? impl/beer-xml-units spec-units)
      (coll? spec-units)   (every? #(contains? impl/beer-xml-units %) spec-units)
      :else                (do (println (str "Invalid units specified for spec: " spec)) false))))

(defn valid-beer-xml-type?
  "Check the spec for valid BeerXML types.
   Values must either not be present or be one of the valid BeerXML types."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (let [spec-units (-> spec cbf/get-spec impl/beer-xml-type-key)]
    (cond
      (nil? spec-units)    (do (println (str "No type specified for spec: " spec)) true)
      (string? spec-units) (contains? impl/beer-xml-types spec-units)
      :else                (do (println (str "Invalid type specified for spec: " spec)) false))))
