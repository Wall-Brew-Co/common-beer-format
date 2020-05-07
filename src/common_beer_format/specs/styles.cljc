(ns common-beer-format.specs.styles
  "The definition of a style record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [spec-tools.core :as st]))

(s/def ::category
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the category this style belongs to"
    :json-schema/example "American Lagers"}))

(s/def ::category-number
  ;; Intentionally implemented as a string type to match BeerXML spec
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the category number of this style"
    :json-schema/example "1"}))

(s/def ::style-letter
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the letter used to denote the style or sub-style"
    :json-schema/example "A"}))

(s/def ::style-guide
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the name of the style guide the style/category belongs to"
    :json-schema/example "BJCP"}))

(def ^:const style-types
  #{"lager" "ale" "mead" "wheat" "mixed" "cider"})

(s/def ::type
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? style-types (cs/lower-case %)))
    :description         "A case-insensitive string representing the type of beverage the style dictates.
                          Must be one of: 'Lager', 'Ale', 'Mead', 'Wheat', 'Mixed', and 'Cider'"
    :json-schema/example "Lager"}))

(s/def ::og-min
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style"
    :json-schema/example "1.048"}))

(s/def ::og-max
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style"
    :json-schema/example "1.060"}))

(s/def ::fg-min
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style"
    :json-schema/example "1.048"}))

(s/def ::fg-max
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style"
    :json-schema/example "1.060"}))

(s/def ::ibu-min
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the minimum bitterness in IBUs for the style"
    :json-schema/example "32"}))

(s/def ::ibu-max
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the maximum bitterness in IBUs for the style"
    :json-schema/example "40"}))

(s/def ::color-min
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the lightest color in SRM for the style"
    :json-schema/example "32"}))

(s/def ::color-max
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the darkest color in SRM for the style"
    :json-schema/example "40"}))

(s/def ::carb-min
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the minimum carbonation for this style in volumes of CO2"
    :json-schema/example "1.5"}))

(s/def ::carb-max
  (st/spec
   {:type                :double
    :spec                (s/and number? pos?)
    :description         "A positive IEEE-754 floating point number representing the maximum carbonation for this style in volumes of CO2"
    :json-schema/example "2.2"}))

(s/def ::abv-min
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the minimum recommended ABV percentage for the style"
    :json-schema/example "3.2"}))

(s/def ::abv-max
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the maximum recommended ABV percentage for the style"
    :json-schema/example "4.0"}))

(s/def ::profile
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the aroma and flavor profile of the style"
    :json-schema/example "Full-bodied and dark"}))

(s/def ::ingredients
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the suggested ingredients for the style"
    :json-schema/example "water, barley, and hops"}))

(s/def ::examples
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting example beers of this style"
    :json-schema/example "Every overly citrus IPA on the market"}))

(s/def ::style
  (st/spec
   {:type        :map
    :description "A record representing a beer style."
    :spec        (s/keys :req-un [::prim/name
                                  ::prim/version
                                  ::category
                                  ::category-number
                                  ::style-letter
                                  ::style-guide
                                  ::type
                                  ::og-min
                                  ::og-max
                                  ::fg-min
                                  ::fg-max
                                  ::ibu-min
                                  ::ibu-max
                                  ::color-min
                                  ::color-max]
                         :opt-un [::carb-min
                                  ::carb-max
                                  ::abv-min
                                  ::abv-max
                                  ::prim/notes
                                  ::profile
                                  ::ingredients
                                  ::examples])}))

(s/def ::styles
  (st/spec
   {:type        :vector
    :description "A vector of valid ::style records"
    :spec        (s/coll-of #(s/valid? ::style %))}))
