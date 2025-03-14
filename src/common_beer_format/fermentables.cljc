(ns common-beer-format.fermentables
  "The definition of a fermentable record used in BeerXML."
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name type]))


(def fermentable
  "A map representing an ingredient with fermentable sugars added during the mash."
  :fermentable)


(def fermentables
  "A sequence of ingredients with fermentable sugars added during the mash."
  :fermentables)


(def name
  "The name of the fermentable record."
  :name)


(def version
  "The version of the BeerXML specification used to create the fermentable record."
  :version)


(def type
  "The type of the fermentable ingredient.

   Currently, the following types are allowed:

   - `adjunct` - Non-grain and non-sugar ingredients that are added to the wort that contain fermentable sugars.
   - `dry-extract` - Dry extract is a concentrated form of fermentable sugars derived from malted barley.
   - `extract` - Extract is a concentrated form of fermentable sugars derived from malted barley in liquid form.
   - `grain` - Whole or milled barley, rye, wheat, or other grain.
   - `sugar` - Raw, candied, and other natural sources of sugar (e.g. Honey)."
  :type)


(def amount
  "The amount of the fermentable ingredient added to the mash."
  :amount)


(def yield
  "The percent of fermentable sugars rendered from the fermentable ingredient during the mash."
  :yield)


(def color
  "The color of the fermentable ingredient in Lovibond for the grain type, and SRM for all other types."
  :color)


(def add-after-boil
  "A boolean representing if the fermentable was added after the boil.
   When absent, assume false."
  :add-after-boil)


(def origin
  "The origin of the fermentable ingredient."
  :origin)


(def supplier
  "The supplier of the fermentable ingredient."
  :supplier)


(def notes
  "Notes about the fermentable ingredient."
  :notes)


(def coarse-fine-diff
  "The difference between extractable sugar content with a coarse and fine grind of the grain."
  :coarse-fine-diff)


(def moisture
  "The percent moisture content of the grain."
  :moisture)


(def diastatic-power
  "The diastatic power of the grain- which is the ability of the grain to convert starches to sugars in degrees Lintner."
  :diastatic-power)


(def protein
  "The percent protein content of the grain."
  :protein)


(def max-in-batch
  "The maximum percentage of the fermentable ingredient that should be used in the mash."
  :max-in-batch)


(def recommend-mash
  "A boolean representing if the fermentable ingredient is recommended for mash or to be added at the start of the boil."
  :recommend-mash)


(def ibu-gal-per-lb
  "The IBU contribution per gallon of wort per pound of the fermentable ingredient."
  :ibu-gal-per-lb)


(def display-amount
  "The amount of the fermentable ingredient to display in the recipe in a human-readable format."
  :display-amount)


(def potential
  "The potential gravity of the fermentable ingredient in SG if all fermentable sugars were extracted."
  :potential)


(def inventory
  "The amount of the fermentable ingredient available on-hand."
  :inventory)


(def display-color
  "The color of the fermentable ingredient to display in the recipe in a human-readable format."
  :display-color)


(def adjunct
  "A non-grain and non-sugar ingredient that is added to the wort that contain fermentable sugars."
  "Adjunct")


(def dry-extract
  "A concentrated form of fermentable sugars derived from malted barley."
  "Dry Extract")


(def extract
  "A concentrated form of fermentable sugars derived from malted barley in liquid form."
  "Extract")


(def grain
  "Whole or milled barley, rye, wheat, or other grain."
  "Grain")


(def sugar
  "Raw, candied, and other natural sources of sugar (e.g. Honey)."
  "Sugar")


(def fermentable-types
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
    {:type                  :string
     :spec                  fermentable-types
     impl/beer-xml-type-key impl/beer-xml-list
     :gen                   #(spec/gen fermentable-types)
     :description           (impl/multiline "A case-sensitive string representing the form of the fermentable."
                                            (impl/set->description fermentable-types)
                                            ""
                                            "- Adjunct: Non-grain and non-sugar ingredients that are added to the wort that contain fermentable sugars."
                                            "- Dry Extract: Dry extract is a concentrated form of fermentable sugars derived from malted barley."
                                            "- Extract: Extract is a concentrated form of fermentable sugars derived from malted barley in liquid form."
                                            "- Grain: Whole or milled barley, rye, wheat, or other grain."
                                            "- Sugar: Raw, candied, and other natural sources of sugar (e.g. Honey) .)")
     :json-schema/example   "grain"}))


(spec/def ::yield
  (st/spec
    {:type                  :double
     :spec                  ::prim/percent
     impl/beer-xml-type-key impl/beer-xml-percentage
     :description           "A non-negative IEEE-754 floating point number representing the percent rendered sugar from the fermentable."
     :json-schema/example   0.856}))


(spec/def ::color
  (st/spec
    {:type                   :double
     :spec                   number?
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key [impl/beer-xml-lovibond impl/beer-xml-srm]
     :gen                    impl/real-double-generator
     :description            "A non-negative IEEE-754 floating point number representing the color in Lovibond for the grain type, and SRM for all other types for the fermentable."
     :json-schema/example    32}))


(spec/def ::add-after-boil
  (st/spec
    {:spec                  ::prim/boolean
     impl/beer-xml-type-key impl/beer-xml-boolean
     :description           (impl/multiline "A boolean representing if the fermentable was added after the boil."
                                            "When absent, assume false.")
     :json-schema/example   false
     :decode/string         impl/decode-boolean
     :encode/string         impl/encode-boolean}))


(spec/def ::supplier
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting the supplier of the fermentable ingredient."
     :json-schema/example   "Gnome Brew"}))


(spec/def ::coarse-fine-diff
  (st/spec
    {:type                  :double
     impl/display-name-key  "Coarse Fine Difference"
     impl/beer-xml-type-key impl/beer-xml-percentage
     :spec                  ::prim/percent
     :description           (impl/multiline "A non-negative IEEE-754 floating point number representing the percent difference between the coarse grain yield and fine grain yield."
                                            "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example   0.856}))


(spec/def ::moisture
  (st/spec
    {:type                  :double
     :spec                  ::prim/percent
     impl/beer-xml-type-key impl/beer-xml-percentage
     :description           (impl/multiline "A non-negative IEEE-754 floating point number representing the percent moisture in the grain."
                                            "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example   45.0}))


(spec/def ::diastatic-power
  (st/spec
    {:type                  :double
     :spec                  number?
     impl/beer-xml-type-key impl/beer-xml-floating-point
     :gen                   impl/real-double-generator
     :description           (impl/multiline "A non-negative IEEE-754 floating point number representing the diastatic power of the grain in Lintner units."
                                            "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example   0.65}))


(spec/def ::protein
  (st/spec
    {:type                  :double
     :spec                  ::prim/percent
     impl/beer-xml-type-key impl/beer-xml-percentage
     :description           (impl/multiline "A non-negative IEEE-754 floating point number representing the protein contents of the grain."
                                            "Only appropriate for the 'Grain' or 'Adjunct' types.")
     :json-schema/example   10.0}))


(spec/def ::max-in-batch
  (st/spec
    {:type                  :double
     :spec                  ::prim/percent
     impl/beer-xml-type-key impl/beer-xml-percentage
     :description           "A non-negative IEEE-754 floating point number representing the suggested maximum percent by weight of the fermentable with respect to all fermentables."
     :json-schema/example   1.0}))


(spec/def ::recommend-mash
  (st/spec
    {:spec                  ::prim/boolean
     impl/beer-xml-type-key impl/beer-xml-boolean
     :description           (impl/multiline "A boolean representing if the fermentable is recommended to be included in the mashing step."
                                            "Only appropriate for the 'Grain' or 'Adjunct' types."
                                            "When absent, assume false.")
     :json-schema/example   false
     :decode/string         impl/decode-boolean
     :encode/string         impl/encode-boolean}))


(spec/def ::ibu-gal-per-lb
  (st/spec
    {:type                  :double
     :spec                  number?
     impl/beer-xml-type-key impl/beer-xml-floating-point
     :gen                   impl/real-double-generator
     :description           (impl/multiline "A non-negative IEEE-754 floating point number representing the IBUs per pound per gallon of water assuming a 60 minute boil."
                                            "Only appropriate for the 'Extract' type.")
     :json-schema/example   12.5}))


(spec/def ::potential
  (st/spec
    {:type                   :double
     :spec                   ::prim/specific-gravity
     impl/beer-xml-type-key  impl/beer-xml-floating-point
     impl/beer-xml-units-key impl/beer-xml-specific-gravity
     :description            "A non-negative IEEE-754 floating point number representing the potential yield in specific gravity units of the ingredient."
     :json-schema/example    1.048}))


(spec/def ::display-color
  (st/spec
    {:type                  :string
     :spec                  ::prim/text
     impl/beer-xml-type-key impl/beer-xml-text
     :description           "A non-empty string denoting a display value for the color of the ingredient formatted for display in arbitrary units."
     :json-schema/example   "200 Lovibond"}))


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
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record
     :description           "A `::fermentable` record wrapped in a `::fermentable` map."
     :spec                  (spec/keys :req-un [::fermentable])}))


(spec/def ::fermentables
  (st/spec
    {:type          :vector
     :description   "A vector of valid `::fermentable-wrapper` records."
     :spec          (spec/coll-of ::fermentable-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::fermentable-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::fermentable-wrapper %2)}))


(spec/def ::fermentables-wrapper
  (st/spec
    {:type                  :map
     impl/wrapper-spec-key  true
     impl/beer-xml-type-key impl/beer-xml-record-set
     :description           "A `::fermentables-wrapper` record set."
     :spec                  (spec/keys :req-un [::fermentables])}))
