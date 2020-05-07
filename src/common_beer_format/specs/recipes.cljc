(ns common-beer-format.specs.recipes
  "The definition of a recipe record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.equipment :as cbf-equipment]
            [common-beer-format.specs.fermentables :as cbf-fermentables]
            [common-beer-format.specs.hops :as cbf-hops]
            [common-beer-format.specs.mash :as cbf-mash]
            [common-beer-format.specs.miscs :as cbf-miscs]
            [common-beer-format.specs.primitives :as prim]
            [common-beer-format.specs.styles :as cbf-styles]
            [common-beer-format.specs.waters :as cbf-waters]
            [common-beer-format.specs.yeasts :as cbf-yeasts]
            [common-beer-format.util :as util]
            [spec-tools.core :as st]))

(def ^:const recipe-types
  #{"extract" "partial mash" "all grain"})

(s/def ::type
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? recipe-types (cs/lower-case %)))
    :description         "A case-insensitive string representing the type of recipe.
                          Must be one of: 'Extract', 'Partial Mash', and 'All Grain'"
    :json-schema/example "All Grain"}))

(s/def ::brewer
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the name of the brewer"
    :json-schema/example "Nick A. Nichols"}))

(s/def ::batch-size
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the target final volume of recipe."
    :json-schema/example "5.8"}))

(s/def ::boil-size
  (st/spec
   {:type                :double
    :spec                ::prim/liter
    :description         "A positive IEEE-754 floating point number representing the starting volume of the wort."
    :json-schema/example "7.5"}))

(s/def ::boil-time
  (st/spec
   {:type                :double
    :spec                ::prim/minute
    :description         "A positive IEEE-754 floating point number representing the time in minutes to boil the wort"
    :json-schema/example "45.0"}))

(s/def ::asst-brewer
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the name of the assitant brewer"
    :json-schema/example "Dariusz R. Jakubowski"}))

(s/def ::efficiency
  (st/spec
   {:type                :double
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent brewhouse efficiency to be used for estimating the starting gravity of the beer."
    :json-schema/example "85.6"}))

(s/def ::taste-notes
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting any tasting notes"
    :json-schema/example "A nice, full body and intense mouthfeel"}))

(s/def ::taste-rating
  (st/spec
   {:type                :double
    :spec                number?
    :description         "An IEEE-754 floating point number representing the tasting score of the beer"
    :json-schema/example "100.0"}))

(s/def ::og
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the pre-fermentation specific gravity of the recipe"
    :json-schema/example "1.060"}))

(s/def ::fg
  (st/spec
   {:type                :double
    :spec                ::prim/specific-gravity
    :description         "A positive IEEE-754 floating point number representing the post-fermentation specific gravity of the recipe"
    :json-schema/example "1.048"}))

(s/def ::fermentation-stages
  (st/spec
   {:type                :long
    :spec                (s/and integer? pos?)
    :description         "An integer representing the number of fermentation stages in the recipe"
    :json-schema/example "2"}))

(s/def ::primary-age
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the number of days spent in primary fermentation"
    :json-schema/example "12.0"}))

(s/def ::primary-temp
  (st/spec
   {:type                :double
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the temperaure in degrees Celsius for primary fermentation"
    :json-schema/example "12.0"}))

(s/def ::secondary-age
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the number of days spent in secondary fermentation"
    :json-schema/example "12.0"}))

(s/def ::secondary-temp
  (st/spec
   {:type                :double
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the temperaure in degrees Celsius for secondary fermentation"
    :json-schema/example "12.0"}))

(s/def ::tertiary-age
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the number of days spent in tertiary fermentation"
    :json-schema/example "12.0"}))

(s/def ::tertiary-temp
  (st/spec
   {:type                :double
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the temperaure in degrees Celsius for tertiary fermentation"
    :json-schema/example "12.0"}))

(s/def ::age
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the number of days to bottle age the beer"
    :json-schema/example "12.0"}))

(s/def ::temp
  (st/spec
   {:type                :double
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the temperaure in degrees Celsius for bottle aging"
    :json-schema/example "12.0"}))

(s/def ::date
  ;; Intentionally implemented as a string type to match BeerXML spec
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the display date the recipe was created on"
    :json-schema/example "2020/05/06"}))

(s/def ::carbonation
  (st/spec
   {:type                :double
    :spec                number?
    :description         "A positive IEEE-754 floating point number representing the carbonation for this recipe in volumes of CO2"
    :json-schema/example "1.5"}))

(s/def ::forced-carbonation
  (st/spec
   {:spec                ::prim/boolean
    :description         "A boolean representing if this batch was force carbonated with CO2 pressure..
                          When absent, assume false."
    :json-schema/example "false"
    :decode/string       util/decode-boolean
    :encode/string       util/encode-boolean}))

(s/def ::priming-sugar-name
  (st/spec
   {:type                :string
    :spec                ::prim/text
    :description         "A non-empty string denoting the name of the priming agent used to carbonate the beer"
    :json-schema/example "Corn Sugar"}))

(s/def ::carbonation-temp
  (st/spec
   {:type                :double
    :spec                ::prim/degrees-celsius
    :description         "A positive IEEE-754 floating point number representing the temperaure in degrees Celsius for either bottling or forced carbonation"
    :json-schema/example "12.0"}))

(s/def ::priming-sugar-equiv
  (st/spec
   {:type                :double
    :spec                number?
    :description         "An IEEE-754 floating point number representing the conversion factor to an equivalent amount of corn sugar"
    :json-schema/example "1.5"}))

(s/def ::keg-priming-factor
  (st/spec
   {:type                :double
    :spec                number?
    :description         "An IEEE-754 floating point number representing the conversion factor of sugar needed to prime carbonation in large containers."
    :json-schema/example "1.5"}))

(s/def ::recipe
  (st/spec
   {:type        :map
    :description "A record representing a beer recipe"
    :spec        (s/keys :req-un [::prim/name
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
                                  ::priming-sugar-equic
                                  ::keg-priming-factor])}))

(s/def ::recipe-wrapper
  (st/spec
   {:type        :map
    :description "A ::recipe record wrapped in a ::recipes map"
    :spec        (s/keys :req-un [::recipe])}))

(s/def ::recipes
  (st/spec
   {:type          :vector
    :description   "A vector of valid ::recipe records"
    :spec          (s/coll-of #(s/valid? ::recipe-wrapper %))
    :decode/string #(util/decode-sequence %1 ::recipe-wrapper %2)
    :encode/string #(util/encode-sequence %1 ::recipe-wrapper %2)}))

(s/def ::recipes-wrapper
  (st/spec
   {:type        :map
    :description "A ::recipes-wrapper record"
    :spec        (s/keys :req-un [::recipes])}))
