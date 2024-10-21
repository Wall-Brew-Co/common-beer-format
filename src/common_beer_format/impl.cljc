(ns common-beer-format.impl
  "Utility functions common to translation.

   This namespace is not intended to be used directly."
  {:added  "1.0"
   :no-doc true}
  (:require [clojure.string :as str]
            [clojure.test.check.generators :as gen]
            [spec-tools.core :as st]))


(def strict-transformer
  "A transformer that strips extra keys and values and converts strings to their appropriate types"
  (st/type-transformer st/strip-extra-keys-transformer st/strip-extra-values-transformer st/string-transformer))

(defn is-boolean?
  "Returns true iff `x` is a boolean.
   Compatibility extension for older versions of Clojure."
  {:added  "2.6"
   :no-doc true}
  [x]
  #?(:clj  (instance? Boolean x)
     :cljs (or (true? x)
               (false? x))))


(defn decode-boolean
  "Decode an XML-like Boolean string to an actual boolean."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-boolean"]}
  [_spec value]
  (if (boolean? value)
    value
    (-> value str str/lower-case parse-boolean)))


(defn encode-boolean
  "Encode a boolean into an XML-like Boolean string."
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-boolean"]}
  [_spec value]
  (-> value str str/upper-case))


(defn decode-sequence
  "Decode a sequence of elements using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-sequence"]}
  [_parent-spec child-spec value]
  (letfn [(decoder [data] (st/decode child-spec data strict-transformer))]
    (mapv decoder value)))


(defn encode-sequence
  "Encode a sequence of elements using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-sequence"]}
  [_parent-spec child-spec value]
  (letfn [(encoder [data] (st/encode child-spec data strict-transformer))]
    (mapv encoder value)))


(defn decode-wrapper
  "Decode a wrapped map using the spec definition of the members of that sequence."
  {:added    "1.0"
   :no-doc   true
   :see-also ["encode-wrapper"]}
  [_parent-spec child-spec value]
  (letfn [(reducing-fn
            [m k v]
            (assoc m k (st/decode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))


(defn encode-wrapper
  "Encode a wrapped map using the spec definition of the members of that sequence"
  {:added    "1.0"
   :no-doc   true
   :see-also ["decode-wrapper"]}
  [_parent-spec child-spec value]
  (letfn [(reducing-fn
            [m k v]
            (assoc m k (st/encode child-spec v strict-transformer)))]
    (reduce-kv reducing-fn {} value)))


(defn set->description
  "Convert a set of allowed value strings, and transform them into a description string."
  {:added  "1.0"
   :no-doc true}
  [allowed-values]
  (->> allowed-values
       (map str/capitalize)
       (map #(str "\"" % "\""))
       (str/join ", ")
       (str "Must be one of: ")))


(defn multiline
  "Concatenate all strings together, with a new line between each.

   When no arguments are provided, returns an empty string.
   When only one argument is provided, returns that argument."
  {:added  "1.0"
   :no-doc true}
  ([] "")
  ([s] s)
  ([s & more]
   (if s
     (str s "\n" (apply multiline more))
     (apply multiline more))))


(defn real-double-generator
  "A generator which produces any double.
   Excludes Not-a-number and infinite values"
  {:added  "2.2"
   :no-doc true}
  []
  (gen/double* {:infinite? false
                :NaN?      false}))


(defn real-positive-double-generator
  "A generator which produces any positive double.
   Excludes Not-a-number and infinite values"
  {:added  "2.2"
   :no-doc true}
  []
  (gen/double* {:infinite? false
                :NaN?      false
                :min       0}))


(def wrapper-spec-key
  "A keyword intended for use with spec-tools to indicate a spec for a wrapper type."
  :common-beer-format/wrapper?)


(def display-name-key
  "A keyword intended for use with spec-tools to indicate a display name for a spec."
  :common-beer-format/display-name)


(def beer-xml-type-key
  "A keyword intended for use with spec-tools to indicate the type of a beer-xml spec."
  :common-beer-format/beer-xml-type)


(def beer-xml-record-set
  "The BeerXML version 1 type for a record set."
  "Record Set")


(def beer-xml-record
  "The BeerXML version 1 type for a record."
  "Record")


(def beer-xml-percentage
  "The BeerXML version 1 type for a percentage."
  "Percentage")


(def beer-xml-list
  "The BeerXML version 1 type for a list."
  "List")


(def beer-xml-text
  "The BeerXML version 1 type for a text."
  "Text")


(def beer-xml-boolean
  "The BeerXML version 1 type for a boolean."
  "Boolean")


(def beer-xml-integer
  "The BeerXML version 1 type for an integer."
  "Integer")


(def beer-xml-floating-point
  "The BeerXML version 1 type for a floating point number."
  "Floating Point")


(def beer-xml-types
  "A set of all BeerXML version 1 types.
   These are called Dara Formats in the BeerXML standard."
  #{beer-xml-record-set
    beer-xml-record
    beer-xml-percentage
    beer-xml-list
    beer-xml-text
    beer-xml-boolean
    beer-xml-integer
    beer-xml-floating-point})


(def beer-xml-units-key
  "A keyword intended for use with spec-tools to indicate the unit of a beer-xml spec."
  :common-beer-format/beer-xml-units)


(def beer-xml-kilogram
  "The BeerXML version 1 unit for a kilogram."
  "Kilogram")


(def beer-xml-liter
  "The BeerXML version 1 unit for a liter."
  "Liter")


(def beer-xml-degrees-celsius
  "The BeerXML version 1 unit for degrees Celsius."
  "Degrees Celsius")


(def beer-xml-minute
  "The BeerXML version 1 unit for a minute."
  "Minute")


(def beer-xml-day
  "The BeerXML version 1 unit for a day."
  "Day")


(def beer-xml-specific-gravity
  "The BeerXML version 1 unit for specific gravity."
  "Specific Gravity")


(def beer-xml-kilopascal
  "The BeerXML version 1 unit for a kilopascal."
  "Kilopascal")


(def beer-xml-abv
  "The BeerXML version 1 unit for ABV."
  "ABV")


(def beer-xml-ibu
  "The BeerXML version 1 unit for IBU."
  "IBU")


(def beer-xml-volumes-of-co2
  "The BeerXML version 1 unit for volumes of CO2."
  "Volumes of CO2")


(def beer-xml-calories-per-gram-degree-celsius
  "The BeerXML version 1 unit for calories per gram degree Celsius."
  "Calories per Gram Degree Celsius")


(def beer-xml-percent-per-hour
  "The BeerXML version 1 unit for percent per hour."
  "Percent per Hour")


(def beer-xml-srm
  "The BeerXML version 1 unit for SRM."
  "SRM")


(def beer-xml-lovibond
  "The BeerXML version 1 unit for Lovibond."
  "Lovibond")


(def beer-xml-units
  "A set of all BeerXML version 1 units."
  #{beer-xml-kilogram
    beer-xml-liter
    beer-xml-degrees-celsius
    beer-xml-minute
    beer-xml-day
    beer-xml-specific-gravity
    beer-xml-kilopascal
    beer-xml-abv
    beer-xml-ibu
    beer-xml-volumes-of-co2
    beer-xml-calories-per-gram-degree-celsius
    beer-xml-percent-per-hour
    beer-xml-srm
    beer-xml-lovibond})


(defn wrapper-spec?
  "Check if a spec is a wrapper spec."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (-> spec st/get-spec (get wrapper-spec-key false)))


(defn spec->display-name
  "Get the display name of a spec."
  {:added  "2.3"
   :no-doc true}
  [spec]
  (-> spec st/get-spec (get display-name-key)))
