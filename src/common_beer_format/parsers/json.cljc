(ns common-beer-format.parsers.json
  "Functions to translate between BeerJSON and common-beer-format"
  (:require [common-beer-format.util :as util]
            #?(:clj [clojure.data.json :as json])))

#?(:clj
   (defn shallow-json-transformer
     [v]
     (json/write-str v :key-fn name :value-fn str)))

#?(:clj (declare deep-json-value-transformer))

#?(:clj
   (defn json-map-transformer
     [m k v]
     (assoc m (name k) (deep-json-value-transformer v))))

#?(:clj
   (defn deep-json-value-transformer
     ([v] (deep-json-value-transformer nil v))
     ([_ v]
     (cond
       (nil? v)        ""
       (string? v)     v
       (sequential? v) (mapv deep-json-value-transformer v)
       (map? v)        (reduce-kv json-map-transformer {} v)
       :else           (shallow-json-transformer v)))))

(defn parse-beer-json
  "Convert the results of clojure parsed json into cleaner EDN"
  [json-doc]
  (let [clean-json (util/deformat json-doc)]
    #?(:clj  (json/read-str clean-json :key-fn keyword))
    #?(:cljs (js->clj clean-json :keywordize-keys true))))

(defn emit-beer-json
  "Restructure EDN to the expected structure for clojure.data.json"
  [edn]
  #?(:clj  (json/write-str edn :key-fn name :value-fn deep-json-value-transformer))
  #?(:cljs (clj->js edn)))

#?(:clj
   (defn parse-beer-json-stream
     "Parse JSON streams into common-beer-format EDN for the JVM"
     [json-doc]
     (json/read json-doc :key-fn keyword)))

#?(:clj
   (defn emit-beer-json-stream
     "Restructure common-beer-format EDN into standard JSON stream for the JVM."
     [edn]
     (json/write edn :key-fn name :value-fn str)))
