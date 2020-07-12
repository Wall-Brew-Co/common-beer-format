(ns common-beer-format.data.styles.bjcp-2015.bjcp-2015
  "Quick access to all 2015 BJCP styles"
  (:require [common-beer-format.data.styles.bjcp-2015.alternative-fermentables-beer :as alternative-fermentables-beer]
            [common-beer-format.data.styles.bjcp-2015.amber-and-brown-american-beer :as amber-and-brown-american-beer]
            [common-beer-format.data.styles.bjcp-2015.amber-bitter-european-beer :as amber-bitter-european-beer]))

(def all-styles
  (merge alternative-fermentables-beer/alternative-fermentables-beer
         amber-and-brown-american-beer/amber-and-brown-american-beer
         amber-bitter-european-beer/amber-bitter-european-beer))
