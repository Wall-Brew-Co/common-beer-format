(ns common-beer-format.miscs
  "The definition of a misc record used in BeerXML"
  {:added "2.0"}
  (:require [clojure.spec.alpha :as spec]
            [clojure.string :as str]
            [common-beer-format.impl :as impl]
            [common-beer-format.primitives :as prim]
            [spec-tools.core :as st])
  (:refer-clojure :exclude [name time type use]))


(def ^:const misc
  "A miscellaneous ingredient in a beer recipe."
  :misc)


(def ^:const miscs
  "A collection of miscellaneous ingredients in a beer recipe."
  :miscs)


(def ^:const name
  "The name of a miscellaneous ingredient which isn't a hop, yeast, or primarily fermentable sugar."
  :name)


(def ^:const version
  "The BeerXML version of the miscellaneous ingredient."
  :version)


(def ^:const type
  "The type of the miscellaneous ingredient.
   
   Currently, BeerXML Supports the following types:
   
   - `spice`: A spice, such as cinnamon or ginger.
   - `fining`: A fining agent, such as isinglass.
   - `water agent`: A water agent, such as campden tablet.
   - `herb`: An herb, such as mint.
   - `flavor`: A flavoring, such as orange peel or a flavor concentrate.
   - `other`: Any other type of miscellaneous ingredient."
  :type)


(def ^:const use
  "How the miscellaneous ingredient is used in the brewing process.
   
   Currently, BeerXML supports the following uses:
   
   - `boil`: The ingredient is added to the boil.
   - `mash`: The ingredient is added to the mash.
   - `primary`: The ingredient is added to the primary fermentation.
   - `secondary`: The ingredient is added to the secondary fermentation.
   - `bottling`: The ingredient is added to the bottling process."
  :use)


(def ^:const time
  "The time in minutes the ingredient is added to the beer.
   
   For `boil` this is the boil time.
   For `mash` this is the mash time.
   For `primary`, `secondary`, and `bottling` this is the amount of time the ingredient spent in that state."
  :time)


(def ^:const amount
  "The amount of the ingredient added to the beer."
  :amount)


(def ^:const amount-is-weight
  "Whether the amount is a weight or a volume."
  :amount-is-weight)


(def ^:const use-for
  "A description of what the ingredient is used for."
  :use-for)


(def ^:const notes
  "Notes about the ingredient."
  :notes)


(def ^:const display-amount
  "The amount of the ingredient to display."
  :display-amount)


(def ^:const inventory
  "The amount of the ingredient in inventory."
  :inventory)


(def ^:const display-time
  "A human-readable version of the time."
  :display-time)


(def ^:const fining
  "A fining agent, such as isinglass."
  "fining")


(def ^:const flavor
  "A flavoring, such as orange peel or a flavor concentrate."
  "flavor")


(def ^:const herb
  "An herb, such as mint."
  "herb")


(def ^:const other
  "Any other type of miscellaneous ingredient."
  "other")


(def ^:const spice
  "A spice, such as cinnamon or ginger."
  "spice")


(def ^:const water-agent
  "A water agent, such as campden tablet."
  "water agent")


(def ^:const misc-types
  "A set of the miscellaneous ingredient types supported by BeerXML.
   
   Currently, BeerXML Supports the following types:
   
   - `spice`: A spice, such as cinnamon or ginger.
   - `fining`: A fining agent, such as isinglass.
   - `water agent`: A water agent, such as campden tablet.
   - `herb`: An herb, such as mint.
   - `flavor`: A flavoring, such as orange peel or a flavor concentrate.
   - `other`: Any other type of miscellaneous ingredient."
  #{fining
    flavor
    herb
    other
    spice
    water-agent})


(spec/def ::type
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? misc-types (str/lower-case %)))
     :gen                 #(spec/gen misc-types)
     :description         (impl/multiline "A case-insensitive string representing the type of the miscellaneous item added to the beer."
                                          (impl/set->description misc-types))
     :json-schema/example "Spice"}))


(def ^:const boil
  "The ingredient is added to the boil."
  "boil")


(def ^:const mash
  "The ingredient is added to the mash."
  "mash")


(def ^:const primary
  "The ingredient is added to the primary fermentation."
  "primary")


(def ^:const secondary
  "The ingredient is added to the secondary fermentation."
  "secondary")


(def ^:const bottling
  "The ingredient is added to the bottling process."
  "bottling")


(def ^:const misc-uses
  "A set of the miscellaneous ingredient uses supported by BeerXML.
   
   Currently, BeerXML supports the following uses:
   
   - `boil`: The ingredient is added to the boil.
   - `mash`: The ingredient is added to the mash.
   - `primary`: The ingredient is added to the primary fermentation.
   - `secondary`: The ingredient is added to the secondary fermentation.
   - `bottling`: The ingredient is added to the bottling process."
  #{boil
    mash
    primary
    secondary
    bottling})


(spec/def ::use
  (st/spec
    {:type                :string
     :spec                (spec/and string?
                                    #(not (str/blank? %))
                                    #(contains? misc-uses (str/lower-case %)))
     :gen                 #(spec/gen misc-uses)
     :description         (impl/multiline
                            "A case-insensitive string representing the point in the brewing cycle the miscellaneous ingredient is added to the beer."
                            (impl/set->description misc-uses))
     :json-schema/example "Mash"}))


(spec/def ::time
  (st/spec
    {:type                :double
     :spec                ::prim/minute
     :description         (impl/multiline "A non-negative IEEE-754 floating point number representing the time in minutes the ingredient was added dependant on the :use field."
                                          "For \"Boil\" this is the boil time."
                                          "For \"Mash\" this is the mash time."
                                          "For \"Primary\", \"Secondary\", and \"Bottling\" this is the amount of time the ingredient spent in that state.")
     :json-schema/example "15.0"}))


(spec/def ::use-for
  (st/spec
    {:type                :string
     :spec                ::prim/text
     :description         "A non-empty string denoting what the ingredient is used for"
     :json-schema/example "Used to impart a mild, zesty flavor"}))


(spec/def ::misc
  (st/spec
    {:type        :map
     :description "A record representing a miscellaneous ingredient in a beer recipe."
     :spec        (spec/keys :req-un [::prim/name
                                      ::prim/version
                                      ::type
                                      ::use
                                      ::time
                                      ::prim/amount]
                             :opt-un [::prim/amount-is-weight
                                      ::use-for
                                      ::prim/notes
                                      ::prim/display-amount
                                      ::prim/inventory
                                      ::prim/display-time])}))


(spec/def ::misc-wrapper
  (st/spec
    {:type        :map
     :description "A ::misc record wrapped in a :misc map"
     :spec        (spec/keys :req-un [::misc])}))


(spec/def ::miscs
  (st/spec
    {:type          :vector
     :description   "A vector of valid ::misc records"
     :spec          (spec/coll-of ::misc-wrapper :into [] :kind vector?)
     :decode/string #(impl/decode-sequence %1 ::misc-wrapper %2)
     :encode/string #(impl/encode-sequence %1 ::misc-wrapper %2)}))


(spec/def ::miscs-wrapper
  (st/spec
    {:type        :map
     :description "A ::miscs record"
     :spec        (spec/keys :req-un [::miscs])}))
