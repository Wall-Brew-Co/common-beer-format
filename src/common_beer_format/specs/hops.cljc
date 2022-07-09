(ns common-beer-format.specs.hops
  "The definition of a hop record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.specs.primitives :as prim]
            [common-beer-format.util :as util]
            [spec-tools.core :as st]))


(s/def ::alpha
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of alpha acid in the hop"
     :json-schema/example "10.7"}))


(def ^:const hop-uses
  #{"boil" "dry hop" "mash" "first wort" "aroma"})


(s/def ::use
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? hop-uses (cs/lower-case %)))
     :gen                 #(s/gen hop-uses)
     :description         "A case-insensitive string representing the means by which the hop is added to the beer.
                          Must be one of: 'Boil', 'Dry Hop', 'Mash', 'First Wort', and 'Aroma'"
     :json-schema/example "mash"}))


(s/def ::time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         "A non-negative IEEE-754 floating point number representing the time in minutes the hop was added dependant on the :use field.
                          For \"Boil\" this is the boil time.
                          For \"Mash\" this is the mash time.
                          For \"First Wort\" this is the boil time.
                          For \"Aroma\" this is the steep time.
                          For \"Dry Hop\" this is the amount of time to dry hop."
     :json-schema/example "15.0"}))


(def ^:const hop-types
  #{"bittering" "aroma" "both"})


(s/def ::type
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? hop-types (cs/lower-case %)))
     :gen                 #(s/gen hop-types)
     :description         "A case-insensitive string representing the means by which the hop is added to the beer.
                          Must be one of: 'Bittering', 'Aroma', and 'Both'"
     :json-schema/example "bittering"}))


(def ^:const hop-forms
  #{"pellet" "plug" "leaf"})


(s/def ::form
  (st/spec
    {:type                :string
     :spec                (s/and string?
                                 #(not (cs/blank? %))
                                 #(contains? hop-forms (cs/lower-case %)))
     :gen #(s/gen hop-forms)
     :description         "A case-insensitive string representing the from of the hop added to the beer.
                          Must be one of: 'Pellet', 'Plug' or 'Leaf'"
     :json-schema/example "leaf"}))


(s/def ::beta
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of beta acid in the hop"
     :json-schema/example "10.7"}))


(s/def ::hsi
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the Hop Stability Index, or percent decay of a hop's alpha acid over six months"
     :json-schema/example "2.2"}))


(s/def ::humulene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of humulene in the hop"
     :json-schema/example "10.7"}))


(s/def ::caryophyllene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of caryophyllene in the hop"
     :json-schema/example "10.7"}))


(s/def ::cohumulone
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of cohumulone in the hop"
     :json-schema/example "10.7"}))


(s/def ::myrcene
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent contents of myrcene in the hop"
     :json-schema/example "10.7"}))


(s/def ::hop
  (st/spec
    {:type        :map
     :description "A record representing a hop in a beer recipe."
     :spec        (s/keys :req-un [::prim/name
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


(s/def ::hop-wrapper
  (st/spec
    {:type        :map
     :description "A ::hop record wrapped in a ::hop map"
     :spec        (s/keys :req-un [::hop])}))


(s/def ::hops
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::hop records"
     :spec          (s/coll-of ::hop-wrapper)
     :decode/string #(util/decode-sequence %1 ::hop-wrapper %2)
     :encode/string #(util/encode-sequence %1 ::hop-wrapper %2)}))


(s/def ::hops-wrapper
  (st/spec
    {:type        :map
     :description "A ::hops-wrapper record"
     :spec        (s/keys :req-un [::hops])}))
