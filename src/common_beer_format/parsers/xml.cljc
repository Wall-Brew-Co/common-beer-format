(ns common-beer-format.parsers.xml
  "Functions to translate between BeerXML and common-beer-format"
  (:require [clojure.data.xml :as xml]
            [common-beer-format.util :as util]
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
  (beer-xml->common-beer-format (xml/parse-str (util/deformat xml-doc))))


(defn emit-beer-xml
  "Restructure common-beer-format EDN into emitted XML."
  [edn-doc]
  (xml/emit-str (common-beer-format->beer-xml edn-doc)))


#?(:clj
   (defn parse-beer-xml-resource
     "Clojurescripts's XML parsing implementation doesn't allow users to pass XML resource paths.
      When that implementation is added to the language, this should be modified."
     [xml-resource]
     (beer-xml->common-beer-format (xml/parse xml-resource))))
