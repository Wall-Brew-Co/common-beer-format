(ns common-beer-format.parsers.xml
  "Functions to translate between BeerXML and common-beer-format"
  (:require [clj-xml.core :as xml]))

(defn beer-xml->common-beer-format
  "Convert the results of clojure parsed xml into cleaner EDN"
  [xml]
  (xml/xml->edn xml {:preserve-attrs? false}))

(defn common-beer-format->beer-xml
  "Restructure EDN to the expected structure for clojure.data.xml"
  [edn]
  (xml/edn->xml edn {:to-xml-case? true :stringify-values? true}))

(defn parse-beer-xml
  "Parse an XML string as defined by clojure.data.xml, and return the equivalent EDN."
  [xml-doc]
  (xml/xml-str->edn xml-doc {:preserve-attrs? false}))

(defn emit-beer-xml
  "Restructure common-beer-format EDN into emitted XML."
  [edn-doc]
  (xml/edn->xml-str edn-doc {:to-xml-case? true :stringify-values? true}))

#?(:clj
   (defn parse-beer-xml-resource
     "Clojurescripts's XML parsing implementation doesn't allow users to pass XML resource paths.
      When that implementation is added to the language, this should be modified."
     [xml-resource]
     (xml/xml-source->edn xml-resource {:preserve-attrs? false})))
