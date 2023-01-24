(ns common-beer-format.recipes
  "The definition of a recipe record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [clojure.test.check.generators :as gen]
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

(def ^:const recipe
  "A map representing a recipe in BeerXML."
  :recipe)

(def ^:const recipes
  "A vector of maps representing recipes in BeerXML."
  :recipes)

(def ^:const name
  "A string representing the name of the recipe."
  :name)

(def ^:const version
  "A string representing the BeerXML version the recipe was defined with."
  :version)

(def ^:const type
  "A string representing the type of recipe.
   
   Currenltly, BeerXML support the following types:
   
   - `all-grain`: A recipe that uses only malted grains.
   - `partial-mash`: A recipe that uses a combination of malted grains and malt extract.
   - `extract`: A recipe that uses only malt extract."
  :type)

(def ^:const hops
  "A vector of maps representing hops used in the recipe."
  cbf-hops/hops)


(def ^:const recipe-types
  #{"extract" "partial mash" "all grain"})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? recipe-types (str/lower-case %)))
     :gen                 #(spec/gen recipe-types)
     :description         (str "A case-insensitive string representing the type of recipe.\n"
                               "Must be one of: 'Extract', 'Partial Mash', and 'All Grain'")
     :json-schema/example "All Grain"}))


(spec/def ::brewer
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the brewer"
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
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes to boil the wort"
     :json-schema/example "45.0"}))


(spec/def ::asst-brewer
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the assistant brewer"
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
     :description         "A non-empty string denoting any tasting notes"
     :json-schema/example "A nice, full body and intense mouthfeel"}))


(spec/def ::taste-rating
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "An IEEE-754 floating point number representing the tasting score of the beer"
     :json-schema/example "100.0"}))


(spec/def ::og
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the pre-fermentation specific gravity of the recipe"
     :json-schema/example "1.060"}))


(spec/def ::fg
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the post-fermentation specific gravity of the recipe"
     :json-schema/example "1.048"}))


(spec/def ::fermentation-stages
  (st/spec
    {:type                :long
     :spec                (spec/and integer? pos?)
     :description         "An integer representing the number of fermentation stages in the recipe"
     :json-schema/example "2"}))


(spec/def ::primary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? pos?)
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the number of days spent in primary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::primary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for primary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::secondary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A non-negative IEEE-754 floating point number representing the number of days spent in secondary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::secondary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for secondary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::tertiary-age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A non-negative IEEE-754 floating point number representing the number of days spent in tertiary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::tertiary-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for tertiary fermentation"
     :json-schema/example "12.0"}))


(spec/def ::age
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A non-negative IEEE-754 floating point number representing the number of days to bottle age the beer"
     :json-schema/example "12.0"}))


(spec/def ::age
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the number of days to bottle age the beer"
     :json-schema/example "12.0"}))


(spec/def ::age-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "A non-negative IEEE-754 floating point number representing the temperaure in degrees Celsius for bottle aging"
     :json-schema/example "12.0"}))


(spec/def ::date
  ;; Intentionally implemented as a string type to match BeerXML spec
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the display date the recipe was created on"
     :json-schema/example "2020/05/06"}))


(spec/def ::carbonation
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "An IEEE-754 floating point number representing the carbonation for this recipe in volumes of CO2"
     :json-schema/example "1.5"}))


(spec/def ::forced-carbonation
  (st/spec
    {:spec                ::prim/boolean
     :description         "A boolean representing if this batch was force carbonated with CO2 pressure..
                          When absent, assume false."
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::priming-sugar-name
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the name of the priming agent used to carbonate the beer"
     :json-schema/example "Corn Sugar"}))


(spec/def ::carbonation-temp
  (st/spec
    {:type                :double
     :spec                ::prim/degrees-celsius
     :description         "An IEEE-754 floating point number representing the temperaure in degrees Celsius for either bottling or forced carbonation"
     :json-schema/example "12.0"}))


(spec/def ::priming-sugar-equiv
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "An IEEE-754 floating point number representing the conversion factor to an equivalent amount of corn sugar"
     :json-schema/example "1.5"}))


(spec/def ::keg-priming-factor
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "An IEEE-754 floating point number representing the conversion factor of sugar needed to prime carbonation in large containers."
     :json-schema/example "1.5"}))


(spec/def ::est-og
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated estimated original gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::est-fg
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated estimated final gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::est-color
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the calculated color formatted for display in arbitrary units"
     :json-schema/example "30SRM"}))


(spec/def ::ibu
  (st/spec
    {:type                :double
     :spec                (spec/and number? #(not (neg? %)))
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false
                                         :min       0})
     :description         "A positive IEEE-754 floating point number representing the bitterness in IBUs for the recipe"
     :json-schema/example "40"}))


(def ^:const ibu-method-types
  #{"rager" "tinseth" "garetz"})


(spec/def ::ibu-method
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? ibu-method-types (str/lower-case %)))
     :gen                 #(spec/gen ibu-method-types)
     :description         "A case-insensitive string representing the method of calculation used derive the IBUs.
                          Must be one of: 'Rager', 'Tinseth', and 'Garetz'"
     :json-schema/example "Garetz"}))


(spec/def ::est-abv
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the estimated ABV for the recipe"
     :json-schema/example "40"}))


(spec/def ::abv
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the actual ABV for the recipe"
     :json-schema/example "40"}))


(spec/def ::actual-efficiency
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the actual conversion efficiency between the measured final and original gravities"
     :json-schema/example "40"}))


(spec/def ::calories
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string describing the number of dietary calories per serving of this recipe"
     :json-schema/example "180 Cal / pint"}))


(spec/def ::display-boil-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-boil volume formatted for display in arbitrary units"
     :json-schema/example "5.0 gallons"}))


(spec/def ::display-batch-size
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-permentation volume formatted for display in arbitrary units"
     :json-schema/example "4.5 gallons"}))


(spec/def ::display-og
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the pre-permentation gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::display-fg
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the post-permentation gravity formatted for display in arbitrary units"
     :json-schema/example "1.050sg"}))


(spec/def ::display-primary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the primary fermentation step formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::display-secondary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the secondary fermentation step formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::display-tertiary-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the tertiary fermentation step formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::display-age-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the aging step formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::carbonation-used
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the carbonation measures used formatted for display in arbitrary units"
     :json-schema/example "Kegged at 1.36 atmospheres"}))


(spec/def ::display-carb-temp
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the temperature of the bottling step formatted for display in arbitrary units"
     :json-schema/example "68F"}))


(spec/def ::recipe
  (st/spec
    {:type        :map
     :description "A record representing a beer recipe"
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
     :description "A ::recipe record wrapped in a ::recipes map"
     :spec        (spec/keys :req-un [::recipe])}))


(spec/def ::recipes
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::recipe records"
     :spec          (spec/coll-of ::recipe-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::recipe-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::recipe-wrapper %2)}))


(spec/def ::recipes-wrapper
  (st/spec
    {:type        :map
     :description "A ::recipes-wrapper record"
     :spec        (spec/keys :req-un [::recipes])}))
