(ns common-beer-format.styles
  "The definition of a style record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [clojure.test.check.generators :as gen]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(spec/def ::category
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the category this style belongs to"
     :json-schema/example "American Lagers"}))


(spec/def ::category-number
  ;; Intentionally implemented as a string type to match BeerXML spec
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the category number of this style"
     :json-schema/example "1"}))


(spec/def ::style-letter
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the letter used to denote the style or sub-style"
     :json-schema/example "A"}))


(spec/def ::style-guide
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the style guide the style/category belongs to"
     :json-schema/example "BJCP"}))


(def ^:const style-types
  #{"lager" "ale" "mead" "wheat" "mixed" "cider"})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? style-types (str/lower-case %)))
     :gen                 #(spec/gen style-types)
     :description         "A case-insensitive string representing the type of beverage the style dictates.
                          Must be one of: 'Lager', 'Ale', 'Mead', 'Wheat', 'Mixed', and 'Cider'"
     :json-schema/example "Lager"}))


(spec/def ::og-min
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style"
     :json-schema/example "1.048"}))


(spec/def ::og-max
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style"
     :json-schema/example "1.060"}))


(spec/def ::fg-min
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style"
     :json-schema/example "1.048"}))


(spec/def ::fg-max
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style"
     :json-schema/example "1.060"}))


(spec/def ::ibu-min
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the minimum bitterness in IBUs for the style"
     :json-schema/example "32"}))


(spec/def ::ibu-max
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the maximum bitterness in IBUs for the style"
     :json-schema/example "40"}))


(spec/def ::color-min
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the lightest color in SRM for the style"
     :json-schema/example "32"}))


(spec/def ::color-max
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the darkest color in SRM for the style"
     :json-schema/example "40"}))


(spec/def ::carb-min
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the minimum carbonation for this style in volumes of CO2"
     :json-schema/example "1.5"}))


(spec/def ::carb-max
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the maximum carbonation for this style in volumes of CO2"
     :json-schema/example "2.2"}))


(spec/def ::abv-min
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the minimum recommended ABV percentage for the style"
     :json-schema/example "0.032"}))


(spec/def ::abv-max
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the maximum recommended ABV percentage for the style"
     :json-schema/example "0.04"}))


(spec/def ::profile
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the aroma and flavor profile of the style"
     :json-schema/example "Full-bodied and dark"}))


(spec/def ::ingredients
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the suggested ingredients for the style"
     :json-schema/example "water, barley, and hops"}))


(spec/def ::examples
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting example beers of this style"
     :json-schema/example "Every overly citrus IPA on the market"}))


(spec/def ::display-og-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum original gravity formatted for display in arbitrary units"
     :json-schema/example "1.036sg"}))


(spec/def ::display-og-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum original gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::display-fg-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum final gravity formatted for display in arbitrary units"
     :json-schema/example "1.036sg"}))


(spec/def ::display-fg-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum final gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::display-color-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum color formatted for display in arbitrary units"
     :json-schema/example "32SRM"}))


(spec/def ::display-color-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum color formatted for display in arbitrary units"
     :json-schema/example "40 SRM"}))


(spec/def ::og-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of original gravities formatted for display in arbitrary units"
     :json-schema/example "1.036sg-1.050sg"}))


(spec/def ::fg-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of final gravities formatted for display in arbitrary units"
     :json-schema/example "1.036sg-1.050sg"}))


(spec/def ::ibu-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of International Bittering Units formatted for display in arbitrary units"
     :json-schema/example "10-20IBUs"}))


(spec/def ::carb-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of carbonation volumes formatted for display in arbitrary units"
     :json-schema/example "2.0-2.6 vols CO2"}))


(spec/def ::color-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of colors formatted for display in arbitrary units"
     :json-schema/example "10 - 22 SRM"}))


(spec/def ::abv-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of ABV levels formatted for display in arbitrary units"
     :json-schema/example "8.0-11.2%"}))


(spec/def ::style
  (st/spec
    {:type        :map
     :description "A record representing a beer style."
     :spec        (spec/keys :req-un [::prim/name
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
                                      ::examples
                                      ::display-og-min
                                      ::display-og-max
                                      ::display-fg-min
                                      ::display-fg-max
                                      ::display-color-min
                                      ::display-color-max
                                      ::og-range
                                      ::fg-range
                                      ::ibu-range
                                      ::carb-range
                                      ::color-range
                                      ::abv-range])}))


(spec/def ::style-wrapper
  (st/spec
    {:type        :map
     :description "A ::style record wrapped in a ::style map"
     :spec        (spec/keys :req-un [::style])}))


(spec/def ::styles
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::style records"
     :spec          (spec/coll-of ::style-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::style-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::style-wrapper %2)}))


(spec/def ::styles-wrapper
  (st/spec
    {:type        :map
     :description "A ::styles-wrapper record"
     :spec        (spec/keys :req-un [::styles])}))
