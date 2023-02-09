(ns common-beer-format.generative.util
  "Utilities for generative tests"
  (:require [clojure.spec.alpha :as spec]
            [clojure.spec.gen.alpha :as gen]))


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
