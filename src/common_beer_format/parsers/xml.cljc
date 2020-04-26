(ns common-beer-format.parsers.xml
  "Functions to translate between BeerXML and common-beer-format"
  (:require [clojure.xml :as xml]
            [nnichols.xml :as nx]))

(defn beer-xml->common-beer-format
  "Convert the results of clojure parsed xml into cleaner EDN"
  [xml]
  (nx/xml->edn xml {:preserve-attrs? false}))

(defn common-beer-format->beer-xml
  "Restructure EDN to the expected structure for clojure.data.xml"
  [edn]
  (nx/edn->xml edn {:to-xml-case? true :stringify-values? true}))

(defn parse-beer-xml
  "Parse an XML resource as defined by clojure.data.xml, and return the equivalent EDN."
  [xml-doc]
  (beer-xml->common-beer-format (xml/parse xml-doc)))

(defn emit-beer-xml
  "Restructure common-beer-format EDN into emitted XML."
  [edn-doc]
  (xml/emit (common-beer-format->beer-xml edn-doc)))

#?(:clj
   (defn parse-beer-xml-string
     "Clojure's XML parsing implementation doesn't allow users to pass XML strings that aren't resource paths.
      Unfortunately, this forces us to convert strings to streams for the JVM.
      When a better implementation is added to the language, this should be removed."
     [xml-doc]
     (let [string-streamer (fn [s] (java.io.ByteArrayInputStream. (.getBytes (.trim s))))]
       (parse-beer-xml (string-streamer xml-doc)))))
