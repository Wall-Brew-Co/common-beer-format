(ns common-beer-format.hops
  "The definition of a hop record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type time use]))


(def hop
  "A map representing a hop."
  :hop)


(def hops
  "A vector of hops."
  :hops)


(def name
  "The name of the hop."
  :name)


(def version
  "The version of the BeerXML specification used to create the hop record."
  :version)


(def alpha
  "The percent contents of alpha acid in the hop."
  :alpha)


(def amount
  "The amount of the hop in the recipe."
  :amount)


(def use
  "The means by which the hop is added to the beer.

   Currently, the following uses are allowed:

   - `boil` - Hops added to the boil.
   - `dry hop` - Hops added to the fermentation vessel after pitching yeast.
   - `mash` - Hops added to the mash prior to the boil.
   - `first wort` - Hops added to the first wort.
   - `aroma` - Hops added to the beer for aroma."
  :use)


(def time
  "The time in minutes the hop was added dependant on the `:use` field."
  :time)


(def notes
  "Notes about the hop."
  :notes)


(def type
  "The type of hop added to the beer, based on its intended purpose.

   Currently, the following types are allowed:

   - `bittering` - Hops added solely for their bittering properties.
   - `aroma` - Hops added solely for their aromatic properties and flavor.
   - `both` - Hops which may be added for both their bittering and aromatic properties."
  :type)


(def form
  "The form of the hop added to the beer.

   Currently, the following forms are allowed:

   - `pellet` - Hops in pellet form.
   - `plug` - Hops in plug form.
   - `leaf` - Hops in leaf form."
  :form)


(def beta
  "The percent contents of beta acid in the hop."
  :beta)


(def hsi
  "The Hop Stability Index, or percent decay of a hop's alpha acid over six months."
  :hsi)


(def origin
  "The origin of the hop."
  :origin)


(def substitutes
  "A string containing suitable alternative hop names to use as a replcaement for the hop."
  :substitutes)


(def humulene
  "The percent contents of humulene in the hop, which contributes to the unique aroma of hops."
  :humulene)


(def caryophyllene
  "The percent contents of caryophyllene in the hop, which contributes to the peppery characteristics of hop aroma."
  :caryophyllene)


(def cohumulone
  "The percent contents of cohumulone in the hop, which contributes to the sour characteristics of hop aroma."
  :cohumulone)


(def myrcene
  "The percent contents of myrcene in the hop, which contributes to the earthy characteristics of hop aroma."
  :myrcene)


(def display-amount
  "The amount of the hop in the recipe, formatted for display."
  :display-amount)


(def display-time
  "The time in minutes the hop was added dependant on the `:use` field, formatted for display."
  :display-time)


(def inventory
  "The amount of the hop in inventory."
  :inventory)


(spec/def ::alpha
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of alpha acid in the hop"
     :json-schema/example "10.7"}))


(def boil
  "Hops added to the boil."
  "boil")


(def dry-hop
  "Hops added to the fermentation vessel after pitching yeast."
  "dry hop")


(def mash
  "Hops added to the mash prior to the boil."
  "mash")


(def first-wort
  "Hops added to the first wort."
  "first wort")


(def aroma
  "Hops added to the beer for aroma."
  "aroma")


(def hop-uses
  "The allowed values for the means by which the hop is added to the beer."
  #{aroma
    boil
    dry-hop
    first-wort
    mash})


(spec/def ::use
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? hop-uses (str/lower-case %)))
     :gen                 #(spec/gen hop-uses)
     :description         (impl/multiline "A case-insensitive string representing the means by which the hop is added to the beer."
                                          (impl/set->description hop-uses))
     :json-schema/example "mash"}))


(spec/def ::time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         (impl/multiline
                            "A non-negative IEEE-754 floating point number representing the time in minutes the hop was added dependant on the :use field."
                            "For \"Boil\" this is the boil time."
                            "For \"Mash\" this is the mash time."
                            "For \"First Wort\" this is the boil time."
                            "For \"Aroma\" this is the steep time."
                            "For \"Dry Hop\" this is the amount of time to dry hop.")
     :json-schema/example "15.0"}))


(def bittering
  "Hops added to the boil for bittering."
  "bittering")


(def both
  "Hops added to the boil for both bittering and aroma."
  "both")


(def hop-types
  "The allowed values for the type of hop."
  #{bittering
    aroma
    both})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? hop-types (str/lower-case %)))
     :gen                 #(spec/gen hop-types)
     :description         (impl/multiline "A case-insensitive string representing the means by which the hop is added to the beer."
                                          (impl/set->description hop-types))
     :json-schema/example "bittering"}))


(def pellet
  "Hops added to the boil in pellet form."
  "pellet")


(def plug
  "Hops added to the boil in plug form."
  "plug")


(def leaf
  "Hops added to the boil in whole leaf form."
  "leaf")


(def hop-forms
  "The allowed values for the physical form of the hop."
  #{pellet
    plug
    leaf})


(spec/def ::form
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? hop-forms (str/lower-case %)))
     :gen                 #(spec/gen hop-forms)
     :description         (impl/multiline "A case-insensitive string representing the physical form of the hop."
                                          (impl/set->description hop-forms))
     :json-schema/example "leaf"}))


(spec/def ::beta
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of beta acid in the hop"
     :json-schema/example "10.7"}))


(spec/def ::hsi
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the Hop Stability Index, or percent decay of a hop's alpha acid over six months"
     :json-schema/example "2.2"}))


(spec/def ::humulene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of humulene in the hop"
     :json-schema/example "10.7"}))


(spec/def ::caryophyllene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of caryophyllene in the hop"
     :json-schema/example "10.7"}))


(spec/def ::cohumulone
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of cohumulone in the hop"
     :json-schema/example "10.7"}))


(spec/def ::myrcene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of myrcene in the hop"
     :json-schema/example "10.7"}))


(spec/def ::hop
  (st/spec
    {:type        :map
     :description "A record representing a hop in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::alpha
                                      ::prim/amount
                                      ::use
                                      ::time]
                             :opt-un [::prim/notes
                                      ::type
                                      ::form
                                      ::beta
                                      ::hsi
                                      ::prim/origin
                                      ::prim/substitutes
                                      ::humulene
                                      ::caryophyllene
                                      ::cohumulone
                                      ::myrcene
                                      ::prim/display-amount
                                      ::prim/inventory
                                      ::prim/display-time])}))


(spec/def ::hop-wrapper
  (st/spec
    {:type        :map
     :description "A ::hop record wrapped in a ::hop map"
     :spec        (spec/keys :req-un [::hop])}))


(spec/def ::hops
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::hop records"
     :spec          (spec/coll-of ::hop-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::hop-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::hop-wrapper %2)}))


(spec/def ::hops-wrapper
  (st/spec
    {:type        :map
     :description "A ::hops-wrapper record"
     :spec        (spec/keys :req-un [::hops])}))
