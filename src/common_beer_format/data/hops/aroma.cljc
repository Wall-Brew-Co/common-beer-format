(ns common-beer-format.data.hops.aroma
  "Data for aromatic hops"
  (:require [common-beer-format.data.hops.hops :as hops]))

(def crystal
  (hops/build-hop :crystal {:beta          0.065
                            :name          "Crystal"
                            :cohumulone    0.25
                            :type          "aroma"
                            :myrcene       0.45
                            :humulene      0.25
                            :hsi           0.65
                            :notes         "Woody, floral, and fruity with spice notes of cinnamon, nutmeg, and black pepper."
                            :caryophyllene 0.07
                            :alpha         0.055
                            :substitutes   "Liberty, Mt Hood, Hallertau"}))

(def liberty
  (hops/build-hop :liberty {:beta          0.04
                            :name          "Liberty"
                            :cohumulone    0.25
                            :type          "aroma"
                            :myrcene       0.45
                            :humulene      0.31
                            :hsi           0.45
                            :notes         "Notes of lemon and spice"
                            :caryophyllene 0.1
                            :alpha         0.05
                            :substitutes   "Mt Hood, Hallertau"}))

(def glacier
  (hops/build-hop :glacier {:beta          0.082
                            :name          "Glacier"
                            :cohumulone    0.13
                            :type          "aroma"
                            :myrcene       0.45
                            :humulene      0.3
                            :hsi           0.7
                            :notes         "Herby, woody, and citrusy notes."
                            :caryophyllene 0.1
                            :alpha         0.055
                            :substitutes   "Willamette"}))

(def mt-hood
  (hops/build-hop :mt-hood {:beta          0.08
                            :name          "Mt. Hood"
                            :cohumulone    0.22
                            :type          "aroma"
                            :myrcene       0.35
                            :humulene      0.2
                            :hsi           0.55
                            :notes         "Hallertau derivant. Mild spicy flavor."
                            :caryophyllene 0.11
                            :alpha         0.07
                            :substitutes   "Crystal"}))

(def strisselspalt
  (hops/build-hop :strisselspalt {:beta          0.045
                                  :name          "Strisselspalt"
                                  :cohumulone    0.25
                                  :type          "aroma"
                                  :myrcene       0.42
                                  :humulene      0.22
                                  :hsi           0.65
                                  :notes         "Pleasant mixture of herbal, floral, and citrus notes"
                                  :caryophyllene 0.09
                                  :alpha         0.045
                                  :substitutes   "Hallertau, Mt Hood"}))

(def simcoe
  (hops/build-hop :simcoe {:beta          0.05
                           :name          "Simcoe"
                           :cohumulone    0.17
                           :type          "aroma"
                           :myrcene       0.65
                           :humulene      0.15
                           :hsi           0.75
                           :notes         "Bright citrus flavors with earthy undertones. Aromas of grapefruit, pine, and herbs."
                           :caryophyllene 0.07
                           :alpha         0.14
                           :substitutes   "Summit"}))

(def cascade
  (hops/build-hop :cascade {:beta          0.07
                            :name          "Cascade"
                            :cohumulone    0.35
                            :type          "aroma"
                            :myrcene       0.5
                            :humulene      0.12
                            :hsi           0.5
                            :notes         "Floral, with elements of citrus."
                            :caryophyllene 0.05
                            :alpha         0.07
                            :substitutes   "Centennial, Amarillo, Columbus"}))

(def willamette
  (hops/build-hop :willamette {:beta          0.045
                               :name          "Willamette"
                               :cohumulone    0.3
                               :type          "aroma"
                               :myrcene       0.45
                               :humulene      0.25
                               :hsi           0.6
                               :notes         "Herbal spiciness with floral notes"
                               :caryophyllene 0.07
                               :alpha         0.06
                               :substitutes   "Fuggle, Glacier"}))

(def spalt
  (hops/build-hop :spalt {:beta          0.04
                          :name          "Spalt"
                          :cohumulone    0.25
                          :type          "aroma"
                          :myrcene       0.3
                          :humulene      0.025
                          :hsi           0.55
                          :notes         "Earthen and spice notes."
                          :caryophyllene 0.1
                          :alpha         0.041
                          :substitutes   "Saaz, Hallertau, Sterling"}))

(def sterling
  (hops/build-hop :sterling {:beta          0.06
                             :name          "Sterling"
                             :cohumulone    0.25
                             :type          "aroma"
                             :myrcene       0.45
                             :humulene      0.2
                             :hsi           0.65
                             :notes         "Derivant of Saaz. Similar earthen and spice notes."
                             :caryophyllene 0.06
                             :alpha         0.05
                             :substitutes   "Saaz"}))

(def santiam
  (hops/build-hop :santiam {:beta          0.08
                            :name          "Santiam"
                            :cohumulone    0.2
                            :type          "aroma"
                            :myrcene       0.3
                            :humulene      0.25
                            :hsi           0.45
                            :notes         "Soft, herbal, floral, fruity aromas with hints of pepper and spice"
                            :caryophyllene 0.055
                            :alpha         0.07
                            :substitutes   "Spalt, Hallertau, Liberty"}))

(def ultra
  (hops/build-hop :ultra {:beta          0.045
                          :name          "Ultra"
                          :cohumulone    0.3
                          :type          "aroma"
                          :myrcene       0.3
                          :humulene      0.35
                          :hsi           0.65
                          :notes         "Mild spice aroma and flavor."
                          :caryophyllene 0.1
                          :alpha         0.035
                          :substitutes   "Hallertau, Saaz"}))

(def ahtanum
  (hops/build-hop :ahtanum {:beta          0.05
                            :name          "Ahtanum"
                            :cohumulone    0.3
                            :type          "aroma"
                            :myrcene       0.5
                            :humulene      0.18
                            :hsi           0.5
                            :notes         "Distinct grapefruit scent and flavor."
                            :caryophyllene 0.1
                            :alpha         0.057
                            :substitutes   "Willamette, Centennial, Cascade"}))

(def mosaic
  (hops/build-hop :mosaic {:beta          0.04
                           :name          "Mosaic"
                           :cohumulone    0.22
                           :type          "aroma"
                           :myrcene       0.5
                           :humulene      0.1
                           :hsi           0.75
                           :notes         "HBC# 369. Complex flavor reminiscent of stone fruit."
                           :caryophyllene 0.05
                           :alpha         0.135
                           :substitutes   "Citra"}))

(def golding-us
  (hops/build-hop :golding-us {:beta          0.03
                               :name          "Golding US"
                               :cohumulone    0.2
                               :type          "aroma"
                               :myrcene       0.3
                               :humulene      0.4
                               :hsi           0.65
                               :notes         "Direct descendants of East Kent Golding. Delicate fruit and herbal aromas."
                               :caryophyllene 0.15
                               :alpha         0.06
                               :substitutes   "Fuggle, East Kent Golding"}))

(def east-kent-golding
  (hops/build-hop :east-kent-golding {:beta          0.03
                                      :name          "East Kent Golding"
                                      :cohumulone    0.3
                                      :type          "aroma"
                                      :myrcene       0.3
                                      :humulene      0.3
                                      :hsi           0.75
                                      :notes         "Delicate fruit and herbal aromas."
                                      :caryophyllene 0.1
                                      :alpha         0.06
                                      :substitutes   "Fuggle, Golding"}))

(def fuggle-us
  (hops/build-hop :fuggle-us {:beta          0.02
                              :name          "Fuggle US"
                              :cohumulone    0.27
                              :type          "aroma"
                              :myrcene       0.4
                              :humulene      0.25
                              :hsi           0.5
                              :notes         "A slight, fruity flavor"
                              :caryophyllene 0.09
                              :alpha         0.055
                              :substitutes   "Willamette, Newport"}))

(def delta
  (hops/build-hop :delta {:beta          0.07
                          :name          "Delta"
                          :cohumulone    0.23
                          :type          "aroma"
                          :myrcene       0.35
                          :humulene      0.3
                          :hsi           0.85
                          :notes         "Spicy citrus and summer melon notes/"
                          :caryophyllene 0.12
                          :alpha         0.07
                          :substitutes   "Fuggle, Willamette"}))

(def saaz-us
  (hops/build-hop :saaz-us {:beta          0.045
                            :name          "Saaz US"
                            :cohumulone    0.25
                            :type          "aroma"
                            :myrcene       0.3
                            :humulene      0.2
                            :hsi           0.5
                            :notes         "Also called Saazer. Strong herbal character."
                            :caryophyllene 0.06
                            :alpha         0.045
                            :substitutes   "Centennial, Amarillo"}))

(def palisade
  (hops/build-hop :palisade {:beta          0.08
                             :name          "Palisade"
                             :cohumulone    0.25
                             :type          "aroma"
                             :myrcene       0.09
                             :humulene      0.2
                             :hsi           0.65
                             :notes         "Flavors of nectar fruits and citrus. Aromas that are floral, herbaceous, and grassy."
                             :caryophyllene 0.17
                             :alpha         0.095
                             :substitutes   "Golding, Chinook"}))

(def centennial
  (hops/build-hop :centennial {:beta          0.045
                               :name          "Centennial"
                               :cohumulone    0.3
                               :type          "aroma"
                               :myrcene       0.5
                               :humulene      0.14
                               :hsi           0.6
                               :notes         "Also sold as Super Cascade. Earthy and floral flavor with faint citrues notes."
                               :caryophyllene 0.05
                               :alpha         0.115
                               :substitutes   "Chinook, Galena, CTZ"}))

(def hallertau-us
  (hops/build-hop :hallertau-us {:beta          0.055
                                 :name          "Hallertau US"
                                 :cohumulone    0.23
                                 :type          "aroma"
                                 :myrcene       0.4
                                 :humulene      0.45
                                 :hsi           0.55
                                 :notes         "Sometimes sold as Mittelfrüher. Light aroma of spice and floral notes."
                                 :caryophyllene 0.1
                                 :alpha         0.055
                                 :substitutes   "Liberty"}))

(def amarillo
  (hops/build-hop :amarillo {:beta          0.07
                             :name          "Amarillo"
                             :cohumulone    0.2
                             :type          "aroma"
                             :myrcene       0.7
                             :humulene      0.1
                             :hsi           0.95
                             :notes         "Known as VGXP01. Strong orange flavor."
                             :caryophyllene 0.03
                             :alpha         0.11
                             :substitutes   "Cascade, Chinook"}))

(def vanguard
  (hops/build-hop :vanguard {:beta          0.07
                             :name          "Vanguard"
                             :cohumulone    0.15
                             :type          "aroma"
                             :myrcene       0.25
                             :humulene      0.45
                             :hsi           0.75
                             :notes         "Floral and spice notes."
                             :caryophyllene 0.13
                             :alpha         0.06
                             :substitutes   "Hallertau, Saaz, Mt Hood"}))

(def aroma
  (merge crystal liberty glacier mt-hood simcoe cascade willamette spalt sterling santiam ultra ahtanum mosaic golding-us
         east-kent-golding fuggle-us delta saaz-us palisade centennial hallertau-us amarillo vanguard strisselspalt))
