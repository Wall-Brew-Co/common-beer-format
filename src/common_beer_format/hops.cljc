(ns common-beer-format.hops
  "The definition of a hop record used in BeerXML"
  (:require [clojure.spec.alpha :as s]
            [clojure.string :as cs]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st]))

(s/def ::alpha
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of alpha acid in the hop"
    :json-schema/example "10.7"}))

(def ^:const hop-uses
  #{"boil" "dry hop" "mash" "first wort" "aroma"})

(s/def ::use
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? hop-uses (cs/lower-case %)))
    :description         "A case-insensitive string representing the means by which the hop is added to the beer. Must be one of: 'Boil', 'Dry Hop', 'Mash', 'First Wort', and 'Aroma'"
    :json-schema/example "mash"}))

(s/def ::time
  (st/spec
   {:type                :float
    :spec                ::prim/minute
    :description         "A positive IEEE-754 floating point number representing the time in minutes the hop was added dependant on the :use field.
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
    :description         "A case-insensitive string representing the means by which the hop is added to the beer. Must be one of: 'Bittering', 'Aroma', and 'Both'"
    :json-schema/example "bittering"}))

(def ^:const hop-forms
  #{"pellet" "plug" "leaf"})

(s/def ::form
  (st/spec
   {:type                :string
    :spec                (s/and string?
                                #(not (cs/blank? %))
                                #(contains? hop-forms (cs/lower-case %)))
    :description         "A case-insensitive string representing the from of the hop added to the beer. Must be one of: 'Pellet', 'Plug' or 'Leaf'"
    :json-schema/example "leaf"}))

(s/def ::beta
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of beta acid in the hop"
    :json-schema/example "10.7"}))

(s/def ::hsi
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the Hop Stability Index, or percent decay of a hop's alpha acid over six months"
    :json-schema/example "2.2"}))

(s/def ::humulene
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of humulene in the hop"
    :json-schema/example "10.7"}))

(s/def ::caryophyllene
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of caryophyllene in the hop"
    :json-schema/example "10.7"}))

(s/def ::cohumulone
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of cohumulone in the hop"
    :json-schema/example "10.7"}))

(s/def ::myrcene
  (st/spec
   {:type                :float
    :spec                ::prim/percent
    :description         "A positive IEEE-754 floating point number representing the percent contents of myrcene in the hop"
    :json-schema/example "10.7"}))

(s/def ::hop
  (s/keys :req-un [::prim/name
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
                   ::myrcene]))

(s/def ::hops
  (s/coll-of #(s/valid? ::hop %)))
