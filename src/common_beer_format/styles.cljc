(ns common-beer-format.styles
  "The definition of a style record used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def style
  "A record defining a style of beer"
  :style)


(def styles
  "A collection of style records"
  :styles)


(def name
  "The name of the style record"
  :name)


(def version
  "The version of the style record"
  :version)


(def category
  "A non-empty string denoting the category this style belongs to."
  :category)


(def category-number
  "A non-empty string denoting the category number of this style."
  :category-number)


(def style-letter
  "A non-empty string denoting the letter used to denote the style or sub-style."
  :style-letter)


(def style-guide
  "A non-empty string denoting the name of the style guide the style/category belongs to."
  :style-guide)


(def type
  "A case-sensitive string representing the type of beverage the style dictates.

   Currently, the following values are supported:

   - \"Ale\" - A top-fermented beer with a fruity, hoppy taste and a dry finish.
   - \"Lager\" - A light, bottom-fermented beer with a clean, crisp taste and a smooth finish.
   - \"Mead\" - A fermented beverage made from honey and water.
   - \"Wheat\" - A beer made with a large proportion of wheat malt.
   - \"Mixed\" - A beer style that blends two or more styles.
   - \"Cider\" - A fermented beverage made from fruit and water."
  :type)


(def og-min
  "A non-negative IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style."
  :og-min)


(def og-max
  "A non-negative IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style."
  :og-max)


(def fg-min
  "A non-negative IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style."
  :fg-min)


(def fg-max
  "A non-negative IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style."
  :fg-max)


(def ibu-min
  "A non-negative IEEE-754 floating point number representing the minimum bitterness in IBUs for the style."
  :ibu-min)


(def ibu-max
  "A non-negative IEEE-754 floating point number representing the maximum bitterness in IBUs for the style."
  :ibu-max)


(def color-min
  "A non-negative IEEE-754 floating point number representing the minimum color in SRM for the style."
  :color-min)


(def color-max
  "A non-negative IEEE-754 floating point number representing the maximum color in SRM for the style."
  :color-max)


(def carb-min
  "A non-negative IEEE-754 floating point number representing the minimum carbonation in volumes for the style."
  :carb-min)


(def carb-max
  "A non-negative IEEE-754 floating point number representing the maximum carbonation in volumes for the style."
  :carb-max)


(def abv-min
  "A non-negative IEEE-754 floating point number representing the minimum alcohol by volume for the style."
  :abv-min)


(def abv-max
  "A non-negative IEEE-754 floating point number representing the maximum alcohol by volume for the style."
  :abv-max)


(def notes
  "A string containing notes about the style."
  :notes)


(def profile
  "A string containing a profile of the style."
  :profile)


(def ingredients
  "A string containing a description of the ingredients commonly used in the style."
  :ingredients)


(def examples
  "A string containing commercial or well-known examples of the style."
  :examples)


(def display-og-min
  "A human-readable  representation of the minimum pre-fermentation specific gravity for the style."
  :display-og-min)


(def display-og-max
  "A human-readable  representation of the maximum pre-fermentation specific gravity for the style."
  :display-og-max)


(def display-fg-min
  "A human-readable  representation of the minimum post-fermentation specific gravity for the style."
  :display-fg-min)


(def display-fg-max
  "A human-readable  representation of the maximum post-fermentation specific gravity for the style."
  :display-fg-max)


(def display-color-min
  "A human-readable  representation of the minimum color for the style."
  :display-color-min)


(def display-color-max
  "A human-readable  representation of the maximum color for the style."
  :display-color-max)


(def og-range
  "A string containing the range of pre-fermentation specific gravities for the style."
  :og-range)


(def fg-range
  "A string containing the range of post-fermentation specific gravities for the style."
  :fg-range)


(def ibu-range
  "A string containing the range of bitterness for the style."
  :ibu-range)


(def color-range
  "A string containing the range of color for the style."
  :color-range)


(def carb-range
  "A string containing the range of carbonation for the style."
  :carb-range)


(def abv-range
  "A string containing the range of alcohol by volume for the style."
  :abv-range)


(spec/def ::category
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the category this style belongs to."
     :json-schema/example   "American Lagers"}))


(spec/def ::category-number
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           (impl/multiline "A non-empty string denoting the category number of this style."
                                            "The category number is a string because it can be a letter followed by a number, e.g. 'A1' on some guides.")
     :json-schema/example   "1"}))


(spec/def ::style-letter
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the letter used to denote the style or sub-style."
     :json-schema/example   "A"}))


(spec/def ::style-guide
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the name of the style guide the style/category belongs to."
     :json-schema/example   "BJCP"}))


(def lager
  "A light, bottom-fermented beer with a clean, crisp taste and a smooth finish."
  "Lager")


(def ale
  "A top-fermented beer with a fruity, hoppy taste and a dry finish."
  "Ale")


(def mead
  "A fermented beverage made from honey and water."
  "Mead")


(def wheat
  "A beer made with a large proportion of wheat malt."
  "Wheat")


(def mixed
  "A beer style that blends two or more styles."
  "Mixed")


(def cider
  "A fermented beverage made from fruit and water."
  "Cider")


(def style-types
  "A set of strings representing the types of beverages that can be described by a style."
  #{ale
    cider
    lager
    mead
    mixed
    wheat})


(spec/def ::type
  (st/spec
    {:type                  :string
     :spec                  style-types
     impl/beer-xml-type-key impl/beer-xml-list
     :gen                   #(spec/gen style-types)
     :description           (impl/multiline
                              "A case-sensitive string representing the type of beverage the style dictates."
                              (impl/set->description style-types)
                              ""
                              "- Ale: A top-fermented beer with a fruity, hoppy taste and a dry finish."
                              "- Cider: A fermented beverage made from fruit and water."
                              "- Lager: A light, bottom-fermented beer with a clean, crisp taste and a smooth finish."
                              "- Mead: A fermented beverage made from honey and water."
                              "- Mixed: A beer style that blends two or more styles."
                              "- Wheat: A beer made with a large proportion of wheat malt.")
     :json-schema/example   "Lager"}))


(spec/def ::og-min
  (st/spec
    {:type                   :double
     :spec                   ::prim/specific-gravity
     impl/display-name-key   "Minimum Original Gravity"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-specific-gravity
     :description            "A non-negative IEEE-754 floating point number representing the minimum pre-fermentation specific gravity for the style."
     :json-schema/example    "1.048"}))


(spec/def ::og-max
  (st/spec
    {:type                   :double
     :spec                   ::prim/specific-gravity
     impl/display-name-key   "Maximum Original Gravity"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-specific-gravity
     :description            "A non-negative IEEE-754 floating point number representing the maximum pre-fermentation specific gravity for the style."
     :json-schema/example    "1.060"}))


(spec/def ::fg-min
  (st/spec
    {:type                   :double
     :spec                   ::prim/specific-gravity
     impl/display-name-key   "Minimum Final Gravity"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-specific-gravity
     :description            "A non-negative IEEE-754 floating point number representing the minimum post-fermentation specific gravity for the style."
     :json-schema/example    "1.048"}))


(spec/def ::fg-max
  (st/spec
    {:type                   :double
     :spec                   ::prim/specific-gravity
     impl/display-name-key   "Maximum Final Gravity"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-specific-gravity
     :description            "A non-negative IEEE-754 floating point number representing the maximum post-fermentation specific gravity for the style."
     :json-schema/example    "1.060"}))


(spec/def ::ibu-min
  (st/spec
    {:type                   :double
     :spec                   number?
     impl/display-name-key   "Minimum International Bittering Units"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-ibu
     :gen                    impl/real-double-generator
     :description            "A non-negative IEEE-754 floating point number representing the minimum bitterness in IBUs for the style."
     :json-schema/example    "32"}))


(spec/def ::ibu-max
  (st/spec
    {:type                   :double
     :spec                   number?
     impl/display-name-key   "Maximum International Bittering Units"
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-ibu
     :gen                    impl/real-double-generator
     :description            "A non-negative IEEE-754 floating point number representing the maximum bitterness in IBUs for the style."
     :json-schema/example    "40"}))


(spec/def ::color-min
  (st/spec
    {:type                   :double
     :spec                   number?
     :gen                    impl/real-double-generator
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-srm
     :description            "A non-negative IEEE-754 floating point number representing the lightest color in SRM for the style."
     :json-schema/example    "32"}))


(spec/def ::color-max
  (st/spec
    {:type                   :double
     :spec                   number?
     :gen                    impl/real-double-generator
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-srm
     :description            "A non-negative IEEE-754 floating point number representing the darkest color in SRM for the style."
     :json-schema/example    "40"}))


(spec/def ::carb-min
  (st/spec
    {:type                   :double
     :spec                   number?
     impl/display-name-key   "Minimum Carbonation"
     :gen                    impl/real-double-generator
     impl/beer-xml-type-key  impl/beer-xml-percentage
     impl/beer-xml-units-key impl/beer-xml-volumes-of-co2
     :description            "A non-negative IEEE-754 floating point number representing the minimum carbonation for this style in volumes of CO2."
     :json-schema/example    "1.5"}))


(spec/def ::carb-max
  (st/spec
    {:type                   :double
     :spec                   number?
     impl/display-name-key   "Maximum Carbonation"
     impl/beer-xml-type-key  impl/beer-xml-percentage
     impl/beer-xml-units-key impl/beer-xml-volumes-of-co2
     :gen                    impl/real-double-generator
     :description            "A non-negative IEEE-754 floating point number representing the maximum carbonation for this style in volumes of CO2."
     :json-schema/example    "2.2"}))


(spec/def ::abv-min
  (st/spec
    {:type                   :double
     :spec                   ::prim/percent
     impl/beer-xml-type-key  impl/beer-xml-percentage
     impl/beer-xml-units-key impl/beer-xml-abv
     :description            "A non-negative IEEE-754 floating point number representing the minimum recommended ABV percentage for the style."
     :json-schema/example    "0.032"}))


(spec/def ::abv-max
  (st/spec
    {:type                   :double
     :spec                   ::prim/percent
     impl/beer-xml-type-key  impl/beer-xml-percentage
     impl/beer-xml-units-key impl/beer-xml-abv
     :description            "A non-negative IEEE-754 floating point number representing the maximum recommended ABV percentage for the style."
     :json-schema/example    "0.04"}))


(spec/def ::profile
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the aroma and flavor profile of the style."
     :json-schema/example   "Full-bodied and dark."}))


(spec/def ::ingredients
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the suggested ingredients for the style."
     :json-schema/example   "water, barley, and hops."}))


(spec/def ::examples
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting example beers of this style."
     :json-schema/example   "Every overly citrus IPA on the market."}))


(spec/def ::display-og-min
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Display Original Gravity Min"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the minimum original gravity formatted for display in arbitrary units."
     :json-schema/example   "1.036sg"}))


(spec/def ::display-og-max
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Display Original Gravity Max"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the maximum original gravity formatted for display in arbitrary units."
     :json-schema/example   "1.050sg"}))


(spec/def ::display-fg-min
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Display Final Gravity Min"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the minimum final gravity formatted for display in arbitrary units."
     :json-schema/example   "1.036sg"}))


(spec/def ::display-fg-max
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Display Final Gravity Max"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the maximum final gravity formatted for display in arbitrary units."
     :json-schema/example   "1.050sg"}))


(spec/def ::display-color-min
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the minimum color formatted for display in arbitrary units."
     :json-schema/example   "32SRM"}))


(spec/def ::display-color-max
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the maximum color formatted for display in arbitrary units."
     :json-schema/example   "40 SRM"}))


(spec/def ::og-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Original Gravity Range"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of original gravities formatted for display in arbitrary units."
     :json-schema/example   "1.036sg-1.050sg"}))


(spec/def ::fg-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Final Gravity Range"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of final gravities formatted for display in arbitrary units."
     :json-schema/example   "1.036sg-1.050sg"}))


(spec/def ::ibu-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "International Bittering Units Range"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of International Bittering Units formatted for display in arbitrary units."
     :json-schema/example   "10-20IBUs"}))


(spec/def ::carb-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/display-name-key  "Carbonation Range"
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of carbonation volumes formatted for display in arbitrary units."
     :json-schema/example   "2.0-2.6 vols CO2"}))


(spec/def ::color-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of colors formatted for display in arbitrary units."
     :json-schema/example   "10 - 22 SRM"}))


(spec/def ::abv-range
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the range of ABV levels formatted for display in arbitrary units."
     :json-schema/example   "8.0-11.2%"}))


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
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record
     :description           "A `::style` record wrapped in a `:style` map."
     :spec                  (spec/keys :req-un [::style])}))


(spec/def ::styles
  (st/spec
    {:type          :vector
     :description   "A vector of valid `::style` records."
     :spec          (spec/coll-of ::style-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::style-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::style-wrapper %2)}))


(spec/def ::styles-wrapper
  (st/spec
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record-set
     :description           "A `::styles-wrapper` record set."
     :spec                  (spec/keys :req-un [::styles])}))
