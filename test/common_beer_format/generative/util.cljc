(ns common-beer-format.generative.util
  "Utilities for generative tests"
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.gen.alpha :as gen]))


(defn generatable?
  "Attempts to generate a value for spec and returns true if it succeeds."
  {:added "1.3"}
  [spec]
  (try
    (every? #(s/valid? spec %) (gen/sample (s/gen spec)))
    (catch Exception e
      (println (str "Failed to generate a value for spec: " spec))
      (println e)
      false)))
