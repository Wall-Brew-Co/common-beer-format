(ns common-beer-format.fermentables
  "The definition of a fermentable record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [clojure.test.check.generators :as gen]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def ^:const fermentable
  "A map representing an ingredient with fermentable sugars added during the mash."
  :fermentable)


(def ^:const fermentables
  "A sequence of ingredients with fermentable sugars added during the mash."
  :fermentables)


(def ^:const name
  "The name of the fermentable record."
  :name)


(def ^:const version
  "The version of the BeerXML specification used to create the fermentable record."
  :version)


(def ^:const type
  "The type of the fermentable ingredient.
   
   Currently, the following types are allowed:

   - `adjunct` - Non-grain and non-sugar ingredients that are added to the wort that contain fermentable sugars. 
   - `dry-extract` - Dry extract is a concentrated form of fermentable sugars derived from malted barley.
   - `extract` - Extract is a concentrated form of fermentable sugars derived from malted barley in liquid form.
   - `grain` - Whole or milled barley, rye, wheat, or other grain.
   - `sugar` - Raw, candied, and other natural sources of sugar (e.g. Honey)."
  :type)


(def ^:const amount
  "The amount of the fermentable ingredient added to the mash."
  :amount)


(def ^:const yield
  "The percent of fermentable sugars rendered from the fermentable ingredient during the mash."
  :yield)


(def ^:const color
  "The color of the fermentable ingredient in Lovibond for the grain type, and SRM for all other types."
  :color)


(def ^:const add-after-boil
  "A boolean representing if the fermentable was added after the boil.
   When absent, assume false."
  :add-after-boil)


(def ^:const origin
  "The origin of the fermentable ingredient."
  :origin)


(def ^:const supplier
  "The supplier of the fermentable ingredient."
  :supplier)


(def ^:const notes
  "Notes about the fermentable ingredient."
  :notes)


(def ^:const coarse-fine-diff
  "The difference between extractable sugar content with a coarse and fine grind of the grain."
  :coarse-fine-diff)


(def ^:const moisture
  "The percent moisture content of the grain."
  :moisture)


(def ^:const diastatic-power
  "The diastatic power of the grain- which is the ability of the grain to convert starches to sugars in degrees Lintner."
  :diastatic-power)


(def ^:const protein
  "The percent protein content of the grain."
  :protein)


(def ^:const max-in-batch
  "The maximum percentage of the fermentable ingredient that should be used in the mash."
  :max-in-batch)


(def ^:const recommend-mash
  "A boolean representing if the fermentable ingredient is recommended for mash or to be added at the start of the boil."
  :recommend-mash)


(def ^:const ibu-gal-per-lb
  "The IBU contribution per gallon of wort per pound of the fermentable ingredient."
  :ibu-gal-per-lb)


(def ^:const display-amount
  "The amount of the fermentable ingredient to display in the recipe in a human-readable format."
  :display-amount)


(def ^:const potential
  "The potential gravity of the fermentable ingredient in SG if all fermentable sugars were extracted."
  :potential)


(def ^:const inventory
  "The amount of the fermentable ingredient available on-hand."
  :inventory)


(def ^:const display-color
  "The color of the fermentable ingredient to display in the recipe in a human-readable format."
  :display-color)


(def ^:const adjunct
  "A non-grain and non-sugar ingredient that is added to the wort that contain fermentable sugars."
  "adjunct")


(def ^:const dry-extract
  "A concentrated form of fermentable sugars derived from malted barley."
  "dry extract")


(def ^:const extract
  "A concentrated form of fermentable sugars derived from malted barley in liquid form."
  "extract")


(def ^:const grain
  "Whole or milled barley, rye, wheat, or other grain."
  "grain")


(def ^:const sugar
  "Raw, candied, and other natural sources of sugar (e.g. Honey)."
  "sugar")


(def ^:const fermentable-types
  "The types of fermentables that are allowed in BeerXML.
   
   - `adjunct` - Non-grain and non-sugar ingredients that are added to the wort that contain fermentable sugars. 
   - `dry-extract` - Dry extract is a concentrated form of fermentable sugars derived from malted barley.
   - `extract` - Extract is a concentrated form of fermentable sugars derived from malted barley in liquid form.
   - `grain` - Whole or milled barley, rye, wheat, or other grain.
   - `sugar` - Raw, candied, and other natural sources of sugar (e.g. Honey)."
  #{adjunct
    dry-extract
    extract
    grain
    sugar})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? fermentable-types (str/lower-case %)))
     :gen                 #(spec/gen fermentable-types)
     :description         (impl/multiline "A case-insensitive string representing the form of the fermentable."
                                          (impl/set->description fermentable-types))
     :json-schema/example "grain"}))


(spec/def ::yield
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the percent rendered sugar from the fermentable"
     :json-schema/example "0.856"}))


(spec/def ::color
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         "A non-negative IEEE-754 floating point number representing the color in Lovibond for the grain type, and SRM for all other types for the fermentable"
     :json-schema/example "32"}))


(spec/def ::add-after-boil
  (st/spec
    {:spec                ::prim/boolean
     :description         (impl/multiline "A boolean representing if the fermentable was added after the boil."
                                          "When absent, assume false.")
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::supplier
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting the supplier of the fermentable ingredient"
     :json-schema/example "Gnome Brew"}))


(spec/def ::coarse-fine-diff
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the percent difference between the coarse grain yield and fine grain yield."
                                          "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example "0.856"}))


(spec/def ::moisture
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the percent moisture in the grain."
                                          "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example "0.45"}))


(spec/def ::diastatic-power
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the diastatic power of the grain in Lintner units."
                                          "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example "0.65"}))


(spec/def ::protein
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the protein contents of the grain."
                                          "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example "0.10"}))


(spec/def ::max-in-batch
  (st/spec
    {:type                :double
     :spec                ::prim/percent
     :description         "A non-negative IEEE-754 floating point number representing the suggested maximum percent by weight of the fermentable with respect to all fermentables."
     :json-schema/example "1.0"}))


(spec/def ::recommend-mash
  (st/spec
    {:spec                ::prim/boolean
     :description         (impl/multiline "A boolean representing if the fermentable is recommended to be included in the mashing step."
                                          "Only appropriate for the 'Grain' or 'Adjunct' types."
                                          "When absent, assume false.")
     :json-schema/example "false"
     :decode/string       impl/decode-boolean
     :encode/string       impl/encode-boolean}))


(spec/def ::ibu-gal-per-lb
  (st/spec
    {:type                :double
     :spec                number?
     :gen                 #(gen/double* {:infinite? false
                                         :NaN?      false})
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the IBUs per pound per gallon of water assuming a 60 minute boil."
                                          "Only appropriate for the 'Extract' type.")
     :json-schema/example "12.5"}))


(spec/def ::potential
  (st/spec
    {:type                :double
     :spec                ::prim/specific-gravity
     :description         "A non-negative IEEE-754 floating point number representing the potential yield in specific gravity units of the ingredient"
     :json-schema/example "1.048"}))


(spec/def ::display-color
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting a display value for the color of the ingredient formatted for display in arbitrary units"
     :json-schema/example "200 Lovibond"}))


(spec/def ::fermentable
  (st/spec
    {:type        :map
     :description "A record representing a fermentable ingredient in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::type
                                      ::prim/amount
                                      ::yield
                                      ::color]
                             :opt-un [::add-after-boil
                                      ::prim/origin
                                      ::supplier
                                      ::prim/notes
                                      ::coarse-fine-diff
                                      ::moisture
                                      ::diastatic-power
                                      ::protein
                                      ::max-in-batch
                                      ::recommend-mash
                                      ::ibu-gal-per-lb
                                      ::prim/display-amount
                                      ::potential
                                      ::prim/inventory
                                      ::display-color])}))


(spec/def ::fermentable-wrapper
  (st/spec
    {:type        :map
     :description "A ::fermentable record wrapped in a ::fermentable map"
     :spec        (spec/keys :req-un [::fermentable])}))


(spec/def ::fermentables
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::fermentable-wrapper records"
     :spec          (spec/coll-of ::fermentable-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::fermentable-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::fermentable-wrapper %2)}))


(spec/def ::fermentables-wrapper
  (st/spec
    {:type        :map
     :description "A ::fermentables-wrapper record"
     :spec        (spec/keys :req-un [::fermentables])}))
