(ns common-beer-format.styles
  "The definition of a style record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.primitives :as prim]
            [common-beer-format.util :as util]
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
     :gen #(s/gen style-types)
     :description         "A case-insensitive string representing the type of beverage the style dictates.
                          Must be one of: 'Lager', 'Ale', 'Mead', 'Wheat', 'Mixed', and 'Cider'"
     :json-schema/example "Lager"}))


(s/def ::og-min
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style"
     :json-schema/example "1.048"}))


(s/def ::og-max
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style"
     :json-schema/example "1.060"}))


(s/def ::fg-min
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style"
     :json-schema/example "1.048"}))


(s/def ::fg-max
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style"
     :json-schema/example "1.060"}))


(s/def ::ibu-min
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the minimum bitterness in IBUs for the style"
     :json-schema/example "32"}))


(s/def ::ibu-max
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the maximum bitterness in IBUs for the style"
     :json-schema/example "40"}))


(s/def ::color-min
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the lightest color in SRM for the style"
     :json-schema/example "32"}))


(s/def ::color-max
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the darkest color in SRM for the style"
     :json-schema/example "40"}))


(s/def ::carb-min
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the minimum carbonation for this style in volumes of CO2"
     :json-schema/example "1.5"}))


(s/def ::carb-max
  (st/spec
    {:type                :double
     :spec                number?
     :description         "A non-negative IEEE-754 floating point number representing the maximum carbonation for this style in volumes of CO2"
     :json-schema/example "2.2"}))


(s/def ::abv-min
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the minimum recommended ABV percentage for the style"
     :json-schema/example "0.032"}))


(s/def ::abv-max
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the maximum recommended ABV percentage for the style"
     :json-schema/example "0.04"}))


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


(s/def ::display-og-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum original gravity formatted for display in arbitrary units"
     :json-schema/example "1.036sg"}))


(s/def ::display-og-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum original gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(s/def ::display-fg-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum final gravity formatted for display in arbitrary units"
     :json-schema/example "1.036sg"}))


(s/def ::display-fg-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum final gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(s/def ::display-color-min
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum color formatted for display in arbitrary units"
     :json-schema/example "32SRM"}))


(s/def ::display-color-max
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum color formatted for display in arbitrary units"
     :json-schema/example "40 SRM"}))


(s/def ::og-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of original gravities formatted for display in arbitrary units"
     :json-schema/example "1.036sg-1.050sg"}))


(s/def ::fg-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of final gravities formatted for display in arbitrary units"
     :json-schema/example "1.036sg-1.050sg"}))


(s/def ::ibu-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of International Bittering Units formatted for display in arbitrary units"
     :json-schema/example "10-20IBUs"}))


(s/def ::carb-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of carbonation volumes formatted for display in arbitrary units"
     :json-schema/example "2.0-2.6 vols CO2"}))


(s/def ::color-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of colors formatted for display in arbitrary units"
     :json-schema/example "10 - 22 SRM"}))


(s/def ::abv-range
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the range of ABV levels formatted for display in arbitrary units"
     :json-schema/example "8.0-11.2%"}))


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


(s/def ::style-wrapper
  (st/spec
    {:type        :map
     :description "A ::style record wrapped in a ::style map"
     :spec        (s/keys :req-un [::style])}))


(s/def ::styles
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::style records"
     :spec          (s/coll-of ::style-wrapper)
     :decode/string #(util/decode-sequence %1 ::style-wrapper %2)
     :encode/string #(util/encode-sequence %1 ::style-wrapper %2)}))


(s/def ::styles-wrapper
  (st/spec
    {:type        :map
     :description "A ::styles-wrapper record"
     :spec        (s/keys :req-un [::styles])}))
