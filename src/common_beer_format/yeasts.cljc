(ns common-beer-format.yeasts
  "The definition of a yeast record used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def yeast
  "A map representing the yeast used during the mash and for top-up."
  :yeast)


(def yeasts
  "A vector of yeast records."
  :yeasts)


(def name
  "The name of the yeast record."
  :name)


(def version
  "The version of the BeerXML specification used to create the yeast record."
  :version)


(def amount
  "The amount of yeast in liters or kilograms.
   Depends upon `:amount-is-weight`."
  :amount)


(def type
  "The type of yeast, usually categorized by the intended beverage or style.
   
   Currently, the following types are supported:
   
   - `ale` - Yeast that ferments at higher temperatures and produces a more fruity, estery, and alcohol-forward beer.
   - `lager` - Yeast that ferments at lower temperatures and produces a crisp, clean, and alcohol-restrained beer.
   - `wheat` - Yeast that ferments at higher temperatures and produces a fruity and phenol-forward beer.
   - `wine` - Yeast traditionally used in wine making.
   - `champagne` - Yeast traditionally used in champagne making, offering a dry taste."
  :type)


(def ale
  "Yeast that ferments at higher temperatures and produces a more fruity, estery, and alcohol-forward beer."
  "ale")


(def lager
  "Yeast that ferments at lower temperatures and produces a crisp, clean, and alcohol-restrained beer."
  "lager")


(def wheat
  "Yeast that ferments at higher temperatures and produces a fruity and phenol-forward beer."
  "wheat")


(def wine
  "Yeast traditionally used in wine making."
  "wine")


(def champagne
  "Yeast traditionally used in champagne making, offering a dry taste."
  "champagne")


(def yeast-types
  "The allowed values for the `:type` of yeast used to ferment the beer."
  #{ale
    lager
    wheat
    wine
    champagne})


(def form
  "The form of the yeast added to the beer.
   
   Currently, the following forms are supported:
   
   - `liquid` - A liquid slurry of yeast, usually with a source of nutrietns or sugars.
   - `dry` - Dry yeast sold in a dehydrated state to extend shelf life.
   - `slant` - Yeast cultivated on a solid growth medium.
   - `culture` - Yeast clutivated from previous fermentations."
  :form)


(def liquid
  "A liquid slurry of yeast, usually with a source of nutrietns or sugars."
  "liquid")


(def dry
  "Dry yeast sold in a dehydrated state to extend shelf life."
  "dry")


(def slant
  "Yeast cultivated on a solid growth medium."
  "slant")


(def culture
  "Yeast clutivated from previous fermentations."
  "culture")


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? yeast-types (str/lower-case %)))
     :gen                 #(spec/gen yeast-types)
     :description         (impl/multiline "A case-insensitive string representing the type of yeast added to the beer."
                                          (impl/set->description yeast-types))
     :json-schema/example "Ale"}))


(def yeast-forms
  "The allowed values for the `:form` of yeast used to ferment the beer."
  #{liquid
    dry
    slant
    culture})


(def amount-is-weight
  "A boolean value indicating whether the `:amount` is in kilograms or liters."
  :amount-is-weight)


(def laboratory
  "The laboratory that cultivated the yeast."
  :laboratory)


(def product-id
  "The product label or id number that identifies the strain of yeast."
  :product-id)


(def min-temperature
  "The minimum recommended temperature of fermenation."
  :min-temperature)


(def max-temperature
  "The maximum recommended temperature of fermenation."
  :max-temperature)


(def flocculation
  "The rate at which the yeast settles out of suspension.
   
   Currently, the following flocculation types are supported:
   
   - `low` - The yeast settles out of suspension slowly.
   - `medium` - The yeast settles out of suspension at a moderate rate.
   - `high` - The yeast settles out of suspension quickly.
   - `very high` - The yeast settles out of suspension very quickly."
  :flocculation)


(def low
  "The yeast settles out of suspension slowly."
  "low")


(def medium
  "The yeast settles out of suspension at a moderate rate."
  "medium")


(def high
  "The yeast settles out of suspension quickly."
  "high")


(def very-high
  "The yeast settles out of suspension very quickly."
  "very high")


(def attenuation
  "The percentage of sugars that are typically converted to alcohol during fermentation."
  :attenuation)


(def notes
  "A free-form text field for recording any additional information about the yeast."
  :notes)


(def best-for
  "A free-form text field for denoting styles the yeast is best suited for."
  :best-for)


(def times-cultured
  "The number of times the yeast has been cultured."
  :times-cultured)


(def max-reuse
  "A suggestion of the maximum number of times the yeast can be cultured."
  :max-reuse)


(def add-to-secondary
  "A boolean value indicating whether the yeast should be added to the secondary fermentation."
  :add-to-secondary)


(def display-amount
  "A human-readable string representing the amount of yeast added to the beer."
  :display-amount)


(def disp-min-temp
  "A human-readable string representing the minimum recommended temperature of fermenation."
  :disp-min-temp)


(def disp-max-temp
  "A human-readable string representing the maximum recommended temperature of fermenation."
  :disp-max-temp)


(def inventory
  "A map containing information about the yeast on hand in inventory."
  :inventory)


(def culture-date
  "A non-empty string denoting a display value for the date the yeast sample was last cultured formatted for display in arbitrary structure"
  :culture-date)


(spec/def ::form
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? yeast-forms (str/lower-case %)))
     :gen                 #(spec/gen yeast-forms)
     :description         (impl/multiline "A case-insensitive string representing the form of the yeast added to the beer."
                                          (impl/set->description yeast-forms))
     :json-schema/example "Ale"}))


(spec/def ::laboratory
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the laboratory that cultivated the yeast"
     :json-schema/example "White Labs"}))


(spec/def ::product-id
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the product label or id number that identifies the strain of yeast"
     :json-schema/example "WLP008"}))


(spec/def ::min-temperature
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "An IEEE-754 floating point number representing the minimum recommended temperature of fermenation"
     :json-schema/example "19.5"}))


(spec/def ::max-temperature
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "An IEEE-754 floating point number representing the maximum recommended temperature of fermenation"
     :json-schema/example "23.9"}))


(def yeast-flocculation-types
  "The allowed values for the `:flocculation` of yeast used to ferment the beer."
  #{low
    medium
    high
    very-high})


(spec/def ::flocculation
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? yeast-flocculation-types (str/lower-case %)))
     :gen                 #(spec/gen yeast-flocculation-types)
     :description         (impl/multiline "A case-insensitive string representing how dense of a floc the yeast will form."
                                          (impl/set->description yeast-flocculation-types))
     :json-schema/example "High"}))


(spec/def ::attenuation
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A positive IEEE-754 floating point number representing the percent of malt sugar that can be converted to ethanol and carbon dioxide"
     :json-schema/example "73.2"}))


(spec/def ::best-for
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the styles of beer this yeast is best suited for"
     :json-schema/example "WLP008"}))


(spec/def ::times-cultured
  (st/spec
    {:type                :long
     :spec                (spec/and int? #(not (neg? %)))
     :description         (impl/multiline
                            "A non-negative integer representing the number of times this yeast has been harvested and re-used."
                            "A value of zero assumes the yeast came directly from the manufacturer.")
     :json-schema/example "1"}))


(spec/def ::max-reuse
  (st/spec
    {:type                :long
     :spec                (spec/and int? #(not (neg? %)))
     :description         "A non-negative integer representing the suggested maximum number of times the yeast may be harvested and recultured"
     :json-schema/example "3"}))


(spec/def ::add-to-secondary
  (st/spec
    {:spec                ::prim/boolean
     :description         (impl/multiline
                            "A boolean representing if this yeast was added for a secondary fermentation."
                            "When absent, assume false.")
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::disp-min-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the minimum fermentation temperature formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::disp-max-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the maximum fermentation temperature formatted for display in arbitrary units"
     :json-schema/example "75F"}))


(spec/def ::culture-date
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the date the yeast sample was last cultured formatted for display in arbitrary structure"
     :json-schema/example "10/10/2020"}))


(spec/def ::yeast
  (st/spec
    {:type        :map
     :description "A record representing the yeast in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::type
                                      ::form
                                      ::prim/amount]
                             :opt-un [::prim/amount-is-weight
                                      ::laboratory
                                      ::product-id
                                      ::min-temperature
                                      ::max-temperature
                                      ::flocculation
                                      ::attenuation
                                      ::prim/notes
                                      ::best-for
                                      ::times-cultured
                                      ::max-reuse
                                      ::add-to-secondary
                                      ::prim/display-amount
                                      ::disp-min-temp
                                      ::disp-max-temp
                                      ::prim/inventory
                                      ::culture-date])}))


(spec/def ::yeast-wrapper
  (st/spec
    {:type        :map
     :description "A ::yeast record wrapped in a ::yeast map."
     :spec        (spec/keys :req-un [::yeast])}))


(spec/def ::yeasts
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::yeast records."
     :spec          (spec/coll-of ::yeast-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::yeast-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::yeast-wrapper %2)}))


(spec/def ::yeasts-wrapper
  (st/spec
    {:type        :map
     :description "A ::yeasts-wrapper record."
     :spec        (spec/keys :req-un [::yeasts])}))
