(ns common-beer-format.parsers.json
  "Functions to translate between BeerJSON and common-beer-format"
  (:require #?(:clj [clojure.data.json :as json])))

(defn parse-beer-json
  "Convert the results of clojure parsed json into cleaner EDN"
  [json-doc]
  #?(:clj  (json/read-str json-doc :key-fn keyword))
  #?(:cljs (js->clj json-doc :keywordize-keys true)))

(defn emit-beer-json
  "Restructure EDN to the expected structure for clojure.data.json"
  [edn]
  #?(:clj  (json/write-str edn :key-fn name :value-fn str))
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
