(ns common-beer-format.recipes
  "The definition of a recipe record used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.equipment :as cbf-equipment]
            [common-beer-format.fermentables :as cbf-fermentables]
            [common-beer-format.hops :as cbf-hops]
            [common-beer-format.impl :as impl]
            [common-beer-format.mash :as cbf-mash]
            [common-beer-format.miscs :as cbf-miscs]
            [common-beer-format.primitives :as prim]
            [common-beer-format.styles :as cbf-styles]
            [common-beer-format.waters :as cbf-waters]
            [common-beer-format.yeasts :as cbf-yeasts]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def recipe
  "A map representing a recipe in BeerXML."
  :recipe)


(def recipes
  "A vector of maps representing recipes in BeerXML."
  :recipes)


(def name
  "A string representing the name of the recipe."
  :name)


(def version
  "A string representing the BeerXML version the recipe was defined with."
  :version)


(def type
  "A string representing the type of recipe.
   
   Currenltly, BeerXML support the following types:
   
   - `all-grain`: A recipe that uses only malted grains.
   - `partial-mash`: A recipe that uses a combination of malted grains and malt extract.
   - `extract`: A recipe that uses only malt extract."
  :type)


(def style
  "A map representing the style of the recipe."
  cbf-styles/style)


(def brewer
  "A string representing the name of the brewer."
  :brewer)


(def batch-size
  "A double representing the target final volume of the recipe."
  :batch-size)


(def boil-size
  "A double representing the starting volume of the wort."
  :boil-size)


(def boil-time
  "A double representing the time in minutes to boil the wort."
  :boil-time)


(def hops
  "A vector of maps representing hops used in the recipe."
  cbf-hops/hops)


(def fermentables
  "A vector of maps representing fermentables used in the recipe."
  cbf-fermentables/fermentables)


(def miscs
  "A vector of maps representing miscs used in the recipe."
  cbf-miscs/miscs)


(def yeasts
  "A vector of maps representing yeasts used in the recipe."
  cbf-yeasts/yeasts)


(def waters
  "A vector of maps representing water profiles used in the recipe."
  cbf-waters/waters)


(def mash
  "A map representing the mash profile and steps used in the recipe."
  cbf-mash/mash)


(def equipment
  "A map representing the equipment used in the recipe."
  cbf-equipment/equipment)


(def asst-brewer
  "A string representing the name of the assistant brewer."
  :asst-brewer)


(def notes
  "A string representing notes about the recipe."
  :notes)


(def efficiency
  "A double representing the efficiency of the recipe."
  :efficiency)


(def taste-notes
  "A string representing the taste notes of the recipe."
  :taste-notes)


(def taste-rating
  "A double representing the taste rating of the recipe."
  :taste-rating)


(def og
  "A double representing the original gravity of the recipe."
  :og)


(def fg
  "A double representing the final gravity of the recipe."
  :fg)


(def fermentation-stages
  "An integer representing the number of fermentation stages in the recipe."
  :fermentation-stages)


(def primary-age
  "A double representing the age of the primary fermentation in days."
  :primary-age)


(def primary-temp
  "A double representing the temperature of the primary fermentation in degrees Celsius."
  :primary-temp)


(def secondary-age
  "A double representing the age of the secondary fermentation in days."
  :secondary-age)


(def secondary-temp
  "A double representing the temperature of the secondary fermentation in degrees Celsius."
  :secondary-temp)


(def tertiary-age
  "A double representing the age of the tertiary fermentation in days."
  :tertiary-age)


(def tertiary-temp
  "A double representing the temperature of the tertiary fermentation in degrees Celsius."
  :tertiary-temp)


(def age
  "A double representing the age of the beer in days."
  :age)


(def age-temp
  "A double representing the temperature of the beer in degrees Celsius."
  :age-temp)


(def date
  "A string representing the date the recipe was brewed."
  :date)


(def carbonation
  "A double representing the carbonation of the beer in volumes of CO2."
  :carbonation)


(def forced-carbonation
  "A boolean representing whether the beer was carbonated using forced carbonation."
  :forced-carbonation)


(def priming-sugar-name
  "A string representing the name of the priming sugar used."
  :priming-sugar-name)


(def carbonation-temp
  "A double representing the temperature of the beer in degrees Celsius."
  :carbonation-temp)


(def priming-sugar-equiv
  "A double representing the conversion factor to priming sugar equivalent."
  :priming-sugar-equivalent)


(def keg-priming-factor
  "A double representing the conversion factor to keg priming factor."
  :keg-priming-factor)


(def est-og
  "A double representing the estimated original gravity of the beer."
  :est-og)


(def est-fg
  "A double representing the estimated final gravity of the beer."
  :est-fg)


(def est-color
  "A double representing the estimated color of the beer."
  :est-color)


(def ibu
  "A double representing the bitterness of the beer."
  :ibu)


(def ibu-method
  "A string representing the method used to calculate the bitterness of the beer.
   
   Currently, the following methods are supported:
   
   - Tinseth: Tinseth's method for calculating bitterness.
   - Rager: Rager's method for calculating bitterness.
   - Garetz: Garetz's method for calculating bitterness."
  :ibu-method)


(def est-abv
  "A double representing the estimated alcohol by volume of the beer."
  :est-abv)


(def abv
  "A double representing the alcohol by volume of the beer."
  :abv)


(def actual-efficiency
  "A double representing the actual efficiency of the beer."
  :actual-efficiency)


(def calories
  "A double representing the calories of the beer."
  :calories)


(def display-batch-size
  "A human-readable string representing the display batch size of the beer."
  :display-batch-size)


(def display-boil-size
  "A human-readable string representing the display boil size of the beer."
  :display-boil-size)


(def display-og
  "A human-readable string representing the display original gravity of the beer."
  :display-og)


(def display-fg
  "A human-readable string representing the display final gravity of the beer."
  :display-fg)


(def display-primary-temp
  "A human-readable string representing the display primary temperature of the beer."
  :display-primary-temp)


(def display-secondary-temp
  "A human-readable string representing the display secondary temperature of the beer."
  :display-secondary-temp)


(def display-tertiary-temp
  "A human-readable string representing the display tertiary temperature of the beer."
  :display-tertiary-temp)


(def display-age-temp
  "A human-readable string representing the display age temperature of the beer."
  :display-age-temp)


(def carbonation-used
  "A human-readable string representing the type carbonation used in the beer."
  :carbonation-used)


(def display-carb-temp
  "A human-readable string representing the display carbonation temperature of the beer."
  :display-carb-temp)


(def extract
  "A recipe type that exclusively uses malt extracts and sugars."
  "extract")


(def partial-mash
  "A recipe type that uses a combination of malt extracts and sugars and malted grains."
  "partial mash")


(def all-grain
  "A recipe type that exclusively uses malted grains."
  "all grain")


(def recipe-types
  "A set of strings representing the valid recipe types."
  #{all-grain
    extract
    partial-mash})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? recipe-types (str/lower-case %)))
     :gen                 #(spec/gen recipe-types)
     :description         (impl/multiline "A case-insensitive string representing the type of recipe."
                                          (impl/set->description recipe-types))
     :json-schema/example "All Grain"}))


(spec/def ::brewer
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the brewer."
     :json-schema/example "Nick A. Nichols"}))


(spec/def ::batch-size
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the target final volume of recipe."
     :json-schema/example "5.8"}))


(spec/def ::boil-size
  (st/spec
    {:type                :double
     :spec                ::prim/liter
     :description         "A non-negative IEEE-754 floating point number representing the starting volume of the wort."
     :json-schema/example "7.5"}))


(spec/def ::boil-time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes to boil the wort."
     :json-schema/example "45.0"}))


(spec/def ::asst-brewer
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the assistant brewer."
     :json-schema/example "Dariusz R. Jakubowski"}))


(spec/def ::efficiency
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent brewhouse efficiency to be used for estimating the starting gravity of the beer."
     :json-schema/example "85.6"}))


(spec/def ::taste-notes
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting any tasting notes."
     :json-schema/example "A nice, full body and intense mouthfeel"}))


(spec/def ::taste-rating
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing the tasting score of the beer."
     :json-schema/example "100.0"}))


(spec/def ::og
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the pre-fermentation specific gravity of the recipe."
     :json-schema/example "1.060"}))


(spec/def ::fg
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the post-fermentation specific gravity of the recipe."
     :json-schema/example "1.048"}))


(spec/def ::fermentation-stages
  (st/spec
    {:type                :long
     :spec                (spec/and integer? pos?)
     :description         "An integer representing the number of fermentation stages in the recipe."
     :json-schema/example "2"}))


(spec/def ::primary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the number of days spent in primary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::primary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for primary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::secondary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing the number of days spent in secondary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::secondary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for secondary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::tertiary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing the number of days spent in tertiary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::tertiary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for tertiary fermentation."
     :json-schema/example "12.0"}))


(spec/def ::age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A non-negative IEEE-754 floating point number representing the number of days to bottle age the beer."
     :json-schema/example "12.0"}))


(spec/def ::age
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the number of days to bottle age the beer."
     :json-schema/example "12.0"}))


(spec/def ::age-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for bottle aging."
     :json-schema/example "12.0"}))


(spec/def ::date
  ;; 
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         (impl/multiline "A non-empty string denoting the display date the recipe was created on."
                                          "Intentionally implemented as a string type to match BeerXML spec.")
     :json-schema/example "2020/05/06"}))


(spec/def ::carbonation
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing the carbonation for this recipe in volumes of CO2."
     :json-schema/example "1.5"}))


(spec/def ::forced-carbonation
  (st/spec
    {:spec                ::prim/boolean
     :description         (impl/multiline "A boolean representing if this batch was force carbonated with CO2 pressure."
                                          "When absent, assume false.")
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::priming-sugar-name
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the priming agent used to carbonate the beer."
     :json-schema/example "Corn Sugar"}))


(spec/def ::carbonation-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "An IEEE-754 floating point number representing the temperaure in degrees Celsius for either bottling or forced carbonation."
     :json-schema/example "12.0"}))


(spec/def ::priming-sugar-equiv
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing the conversion factor to an equivalent amount of corn sugar."
     :json-schema/example "1.5"}))


(spec/def ::keg-priming-factor
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 impl/real-double-generator
     :description         "An IEEE-754 floating point number representing the conversion factor of sugar needed to prime carbonation in large containers."
     :json-schema/example "1.5"}))


(spec/def ::est-og
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated estimated original gravity formatted for display in arbitrary units."
     :json-schema/example "1.050sg"}))


(spec/def ::est-fg
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated estimated final gravity formatted for display in arbitrary units."
     :json-schema/example "1.050sg"}))


(spec/def ::est-color
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated color formatted for display in arbitrary units."
     :json-schema/example "30SRM"}))


(spec/def ::ibu
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 impl/real-positive-double-generator
     :description         "A positive IEEE-754 floating point number representing the bitterness in IBUs for the recipe."
     :json-schema/example "40"}))


(def rager
  "The Rager method of IBU calculation."
  "rager")


(def tinseth
  "The Tinseth method of IBU calculation."
  "tinseth")


(def garetz
  "The Garetz method of IBU calculation."
  "garetz")


(def ibu-method-types
  "A set of valid IBU calculation methods."
  #{garetz
    rager
    tinseth})


(spec/def ::ibu-method
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? ibu-method-types (str/lower-case %)))
     :gen                 #(spec/gen ibu-method-types)
     :description         (impl/multiline "A case-insensitive string representing the method of calculation used derive the IBUs."
                                          (impl/set->description ibu-method-types))
     :json-schema/example "Garetz"}))


(spec/def ::est-abv
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the estimated ABV for the recipe."
     :json-schema/example "40"}))


(spec/def ::abv
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the actual ABV for the recipe."
     :json-schema/example "40"}))


(spec/def ::actual-efficiency
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the actual conversion efficiency between the measured final and original gravities."
     :json-schema/example "40"}))


(spec/def ::calories
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the number of dietary calories per serving of this recipe."
     :json-schema/example "180 Cal / pint"}))


(spec/def ::display-boil-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units."
     :json-schema/example "5.0 gallons"}))


(spec/def ::display-batch-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-permentation volume formatted for display in arbitrary units."
     :json-schema/example "4.5 gallons"}))


(spec/def ::display-og
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-permentation gravity formatted for display in arbitrary units."
     :json-schema/example "1.050sg"}))


(spec/def ::display-fg
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the post-permentation gravity formatted for display in arbitrary units."
     :json-schema/example "1.050sg"}))


(spec/def ::display-primary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the primary fermentation step formatted for display in arbitrary units."
     :json-schema/example "68F"}))


(spec/def ::display-secondary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the secondary fermentation step formatted for display in arbitrary units."
     :json-schema/example "68F"}))


(spec/def ::display-tertiary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the tertiary fermentation step formatted for display in arbitrary units."
     :json-schema/example "68F"}))


(spec/def ::display-age-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the aging step formatted for display in arbitrary units."
     :json-schema/example "68F"}))


(spec/def ::carbonation-used
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the carbonation measures used formatted for display in arbitrary units."
     :json-schema/example "Kegged at 1.36 atmospheres"}))


(spec/def ::display-carb-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the bottling step formatted for display in arbitrary units."
     :json-schema/example "68F"}))


(spec/def ::recipe
  (st/spec
    {:type        :map
     :description "A record representing a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::type
                                      ::cbf-styles/style
                                      ::brewer
                                      ::batch-size
                                      ::boil-size
                                      ::boil-time
                                      ::cbf-hops/hops
                                      ::cbf-fermentables/fermentables
                                      ::cbf-miscs/miscs
                                      ::cbf-yeasts/yeasts
                                      ::cbf-waters/waters
                                      ::cbf-mash/mash]
                             :opt-un [::cbf-equipment/equipment
                                      ::asst-brewer
                                      ::efficiency
                                      ::prim/notes
                                      ::taste-notes
                                      ::taste-rating
                                      ::og
                                      ::fg
                                      ::fermentation-stages
                                      ::primary-age
                                      ::primary-temp
                                      ::secondary-age
                                      ::secondary-temp
                                      ::tertiary-age
                                      ::tertiary-temp
                                      ::age
                                      ::age-temp
                                      ::date
                                      ::carbonation
                                      ::forced-carbonation
                                      ::priming-sugar-name
                                      ::carbonation-temp
                                      ::priming-sugar-equiv
                                      ::keg-priming-factor
                                      ::est-og
                                      ::est-fg
                                      ::est-color
                                      ::ibu
                                      ::ibu-method
                                      ::est-abv
                                      ::abv
                                      ::actual-efficiency
                                      ::calories
                                      ::display-batch-size
                                      ::display-boil-size
                                      ::display-og
                                      ::display-fg
                                      ::display-primary-temp
                                      ::display-secondary-temp
                                      ::display-tertiary-temp
                                      ::display-age-temp
                                      ::carbonation-used
                                      ::display-carb-temp])}))


(spec/def ::recipe-wrapper
  (st/spec
    {:type        :map
     :description "A ::recipe record wrapped in a ::recipes map."
     :spec        (spec/keys :req-un [::recipe])}))


(spec/def ::recipes
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::recipe records."
     :spec          (spec/coll-of ::recipe-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::recipe-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::recipe-wrapper %2)}))


(spec/def ::recipes-wrapper
  (st/spec
    {:type        :map
     :description "A ::recipes-wrapper record."
     :spec        (spec/keys :req-un [::recipes])}))
