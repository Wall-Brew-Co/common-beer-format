(ns common-beer-format.data.styles.bjcp-2015.bjcp-2015
  "Quick access to all 2015 BJCP styles"
  (:require [common-beer-format.data.styles.bjcp-2015.alternative-fermentables-beer :as alternative-fermentables-beer]
            [common-beer-format.data.styles.bjcp-2015.amber-and-brown-american-beer :as amber-and-brown-american-beer]
            [common-beer-format.data.styles.bjcp-2015.amber-bitter-european-beer :as amber-bitter-european-beer]
            [common-beer-format.data.styles.bjcp-2015.amber-malty-european-lager :as amber-malty-european-lager]
            [common-beer-format.data.styles.bjcp-2015.american-porter-and-stout :as american-porter-and-stout]
            [common-beer-format.data.styles.bjcp-2015.american-wild-ale :as american-wild-ale]
            [common-beer-format.data.styles.bjcp-2015.belgian-ale :as belgian-ale]
            [common-beer-format.data.styles.bjcp-2015.british-bitter :as british-bitter]
            [common-beer-format.data.styles.bjcp-2015.brown-british-beer :as brown-british-beer]
            [common-beer-format.data.styles.bjcp-2015.czech-lager :as czech-lager]
            [common-beer-format.data.styles.bjcp-2015.dark-british-beer :as dark-british-beer]
            [common-beer-format.data.styles.bjcp-2015.dark-european-lager :as dark-european-lager]
            [common-beer-format.data.styles.bjcp-2015.european-sour-ale :as european-sour-ale]
            [common-beer-format.data.styles.bjcp-2015.fruit-beer :as fruit-beer]
            [common-beer-format.data.styles.bjcp-2015.german-wheat-beer :as german-wheat-beer]
            [common-beer-format.data.styles.bjcp-2015.historic-beer :as historic-beer]
            [common-beer-format.data.styles.bjcp-2015.international-lager :as international-lager]
            [common-beer-format.data.styles.bjcp-2015.ipa :as ipa]
            [common-beer-format.data.styles.bjcp-2015.irish-beer :as irish-beer]
            [common-beer-format.data.styles.bjcp-2015.pale-american-ale :as pale-american-ale]
            [common-beer-format.data.styles.bjcp-2015.pale-bitter-european-beer :as pale-bitter-european-beer]
            [common-beer-format.data.styles.bjcp-2015.pale-commonwealth-beer :as pale-commonwealth-beer]
            [common-beer-format.data.styles.bjcp-2015.pale-malty-european-lager :as pale-malty-european-lager]
            [common-beer-format.data.styles.bjcp-2015.scottish-ale :as scottish-ale]
            [common-beer-format.data.styles.bjcp-2015.smoked-beer :as smoked-beer]
            [common-beer-format.data.styles.bjcp-2015.specialty-beer :as specialty-beer]
            [common-beer-format.data.styles.bjcp-2015.spiced-beer :as spiced-beer]
            [common-beer-format.data.styles.bjcp-2015.standard-american-beer :as standard-american-beer]
            [common-beer-format.data.styles.bjcp-2015.strong-american-ale :as strong-american-ale]
            [common-beer-format.data.styles.bjcp-2015.strong-belgian-ale :as strong-belgian-ale]
            [common-beer-format.data.styles.bjcp-2015.strong-british-ale :as strong-british-ale]
            [common-beer-format.data.styles.bjcp-2015.strong-european-beer :as strong-european-beer]
            [common-beer-format.data.styles.bjcp-2015.trappist-ale :as trappist-ale]
            [common-beer-format.data.styles.bjcp-2015.wood-beer :as wood-beer]))


(def all-styles
  (merge alternative-fermentables-beer/alternative-fermentables-beer
         amber-and-brown-american-beer/amber-and-brown-american-beer
         amber-bitter-european-beer/amber-bitter-european-beer
         amber-malty-european-lager/amber-malty-european-lager
         american-porter-and-stout/american-porter-and-stout
         american-wild-ale/american-wild-ale
         belgian-ale/belgian-ale
         british-bitter/british-bitter
         brown-british-beer/brown-british-beer
         czech-lager/czech-lager
         dark-british-beer/dark-british-beer
         dark-european-lager/dark-european-lager
         european-sour-ale/european-sour-ale
         fruit-beer/fruit-beers
         german-wheat-beer/german-wheat-beer
         historic-beer/historic-beer
         international-lager/international-lager
         ipa/ipa
         irish-beer/irish-beer
         pale-american-ale/pale-american-ale
         pale-bitter-european-beer/pale-bitter-european-beer
         pale-commonwealth-beer/pale-commonwealth-beer
         pale-malty-european-lager/pale-malty-european-lager
         scottish-ale/scottish-ale
         smoked-beer/smoked-beer
         specialty-beer/specialty-beer
         spiced-beer/spiced-beer
         standard-american-beer/standard-american-beer
         strong-american-ale/strong-american-ale
         strong-belgian-ale/strong-belgian-ale
         strong-british-ale/strong-british-ale
         strong-european-beer/strong-european-beer
         trappist-ale/trappist-ale
         wood-beer/wood-beer))
