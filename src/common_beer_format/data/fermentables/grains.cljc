(ns common-beer-format.data.fermentables.grains
  "Data for malt barley and core grains")

(def ^:private grain-defaults
  {:version 1
   :amount  0.0
   :type    "Grain"})

(defn ^:private build-grain
  [grain-key grain-data]
  {grain-key (merge grain-data grain-defaults)})

(def acid-malt
  (build-grain :acid-malt {:name             "Acid Malt"
                           :potential        1.027
                           :yield            0.587
                           :coarse-fine-diff 0.015
                           :moisture         0.04
                           :color            3
                           :recommend-mash   true
                           :add-after-boil   false
                           :diastatic-power  0
                           :max-in-batch     0.1
                           :protein          0.06
                           :notes            "Acid malt contains acids from natural lactic acids. Used by German brewers to adjust malt PH without chemicals to adhere to German purity laws. Also enhances the head retention."}))

(def amber-malt
  (build-grain :amber-malt {:name             "Amber Malt"
                            :potential        1.035
                            :yield            0.75
                            :coarse-fine-diff 0.015
                            :moisture         0.028
                            :color            22
                            :recommend-mash   true
                            :add-after-boil   false
                            :diastatic-power  20
                            :max-in-batch     0.2
                            :protein          0.1
                            :notes            "Roasted specialty malt used in some English browns, milds and old ales to add color and a biscuit taste. Intense flavor - so limit use. Low diastatic power so must be mashed with well modified malts."}))

(def aromatic-malt
  (build-grain :aromatic-malt {:name             "Aromatic Malt"
                               :potential        1.036
                               :yield            0.78
                               :coarse-fine-diff 0.015
                               :moisture         0.04
                               :color            26
                               :recommend-mash   true
                               :add-after-boil   false
                               :diastatic-power  29
                               :max-in-batch     0.1
                               :protein          0.118
                               :notes            "Provides a very strong malt flavor and aroma to your beer."}))

(def barley-flaked
  (build-grain :barley-flaked {:name             "Barley, Flaked"
                               :potential        1.032
                               :yield            0.7
                               :coarse-fine-diff 0.015
                               :moisture         0.09
                               :color            2
                               :recommend-mash   true
                               :add-after-boil   false
                               :diastatic-power  0
                               :max-in-batch     0.2
                               :protein          0.135
                               :notes            "Adds significant body to Porters and Stouts. High haze producing protein prevents use in light beers."}))

(def barley-raw
  (build-grain :barley-raw {:name             "Barley, Raw"
                            :potential        1.028
                            :yield            0.609
                            :coarse-fine-diff 0.015
                            :moisture         0.04
                            :color            2
                            :recommend-mash   true
                            :add-after-boil   false
                            :diastatic-power  0
                            :max-in-batch     0.15
                            :protein          0.117
                            :notes            "Raw, unmalted barley can be used to add body to your beer. Use in homebrew requires very fine milling combined with a decoction or multi-stage mash. Performs best when used in small quantities with well modified grains."}))

(def barley-torrefied
  (build-grain :barley-torrefied {:name             "Barley, Torrefied"
                                  :potential        1.036
                                  :yield            0.79
                                  :coarse-fine-diff 0.015
                                  :moisture         0.04
                                  :color            2
                                  :recommend-mash   true
                                  :add-after-boil   false
                                  :diastatic-power  0
                                  :max-in-batch     0.4
                                  :protein          0.16
                                  :notes            "Raw barley that has been popped to open the kernels. Used in place of raw barley for faster conversion and higher yields. High in haze producing protein"}))

(def biscuit-malt
  (build-grain :biscuit-malt {:name             "Biscuit Malt"
                              :potential        1.036
                              :yield            0.79
                              :coarse-fine-diff 0.015
                              :moisture         0.04
                              :color            23
                              :recommend-mash   false
                              :add-after-boil   false
                              :diastatic-power  6
                              :max-in-batch     0.1
                              :protein          0.105
                              :notes            "Use for English ales, brown ales and porters. Adds a biscuit like flavor and aroma. Can be used as a substitute for toasted malt."}))

(def black-patent-malt
  (build-grain :black-patent-malt {:name             "Black (Patent) Malt"
                                   :potential        1.025
                                   :yield            0.55
                                   :coarse-fine-diff 0.015
                                   :moisture         0.06
                                   :color            500
                                   :recommend-mash   false
                                   :add-after-boil   false
                                   :diastatic-power  0
                                   :max-in-batch     0.1
                                   :protein          0.132
                                   :notes            "Dark color and dry roasted flavor characteristic of Stouts and Porters. Used for: Coloring in small amounts, or flavoring of Stouts and Porters in larger amounts."}))

(def black-barley-stout
  (build-grain :black-barley-stout {:name             "Black Barley (Stout)"
                                    :potential        1.025
                                    :yield            0.55
                                    :coarse-fine-diff 0.015
                                    :moisture         0.05
                                    :color            500
                                    :recommend-mash   false
                                    :add-after-boil   false
                                    :diastatic-power  0
                                    :max-in-batch     0.1
                                    :protein          0.132
                                    :notes            "Unmalted barley roasted at high temperature to create a dry, coffee like flavor. Imparts a sharp acrid flavor characteristic of dry stouts. Gives dryness to a stout or porter."}))

(def brown-malt
  (build-grain :brown-malt {:name             "Brown Malt"
                            :potential        1.032
                            :yield            0.7
                            :coarse-fine-diff 0.015
                            :moisture         0.04
                            :color            65
                            :recommend-mash   true
                            :add-after-boil   false
                            :diastatic-power  0
                            :max-in-batch     0.1
                            :protein          0
                            :notes            "Imparts a dry, biscuit flavor. Used in nut brown ales, porters and some Belgian ales."}))

(def brumalt
  (build-grain :brumalt {:name             "Brumalt"
                         :potential        1.033
                         :yield            0.717
                         :coarse-fine-diff 0.015
                         :moisture         0.04
                         :color            23
                         :recommend-mash   true
                         :add-after-boil   false
                         :diastatic-power  0
                         :max-in-batch     0.1
                         :protein          0.07
                         :notes            "Dark German malt developed to add malt flavor of Alt, Marzen and Oktoberfest beers. Helps create authentic maltiness without having to do a decoction mash."}))

(def cara-pils-dextrine
  (build-grain :cara-pils-dextrine {:name             "Cara-Pils/Dextrine"
                                    :potential        1.033
                                    :yield            0.72
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            2
                                    :recommend-mash   false
                                    :add-after-boil   false
                                    :diastatic-power  0
                                    :max-in-batch     0.2
                                    :protein          0.132
                                    :notes            "Significantly increases foam/head retention and body of the beer."}))

(def carafoam
  (build-grain :carafoam {:name             "CaraFoam"
                          :potential        1.033
                          :yield            0.72
                          :coarse-fine-diff 0.015
                          :moisture         0.04
                          :color            2
                          :recommend-mash   false
                          :add-after-boil   false
                          :diastatic-power  0
                          :max-in-batch     0.2
                          :protein          0.132
                          :notes            "Significantly increases foam/head retention and body of the beer."}))

(def dextrine
  (build-grain :dextrine {:name             "Dextrine"
                          :potential        1.033
                          :yield            0.72
                          :coarse-fine-diff 0.015
                          :moisture         0.04
                          :color            2
                          :recommend-mash   false
                          :add-after-boil   false
                          :diastatic-power  0
                          :max-in-batch     0.2
                          :protein          0.132
                          :notes            "Significantly increases foam/head retention and body of the beer."}))

(def caraamber
  (build-grain :caraamber {:name             "Caraamber"
                           :potential        1.035
                           :yield            0.75
                           :coarse-fine-diff 0.015
                           :moisture         0.04
                           :color            30
                           :recommend-mash   false
                           :add-after-boil   false
                           :diastatic-power  0
                           :max-in-batch     0.2
                           :protein          0.132
                           :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-10l
  (build-grain :caramel-crystal-malt-10l {:name             "Caramel/Crystal Malt - 10L"
                                          :potential        1.035
                                          :yield            0.75
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            10
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-20l
  (build-grain :caramel-crystal-malt-20l {:name             "Caramel/Crystal Malt - 20L"
                                          :potential        1.035
                                          :yield            0.75
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            20
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-30l
  (build-grain :caramel-crystal-malt-30l {:name             "Caramel/Crystal Malt - 30L"
                                          :potential        1.035
                                          :yield            0.75
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            30
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-40l
  (build-grain :caramel-crystal-malt-40l {:name             "Caramel/Crystal Malt - 40L"
                                          :potential        1.034
                                          :yield            0.74
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            40
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-60l
  (build-grain :caramel-crystal-malt-60l {:name             "Caramel/Crystal Malt - 60L"
                                          :potential        1.034
                                          :yield            0.74
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            60
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-80l
  (build-grain :caramel-crystal-malt-80l {:name             "Caramel/Crystal Malt - 80L"
                                          :potential        1.034
                                          :yield            0.74
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            80
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-90l
  (build-grain :caramel-crystal-malt-90l {:name             "Caramel/Crystal Malt - 90L"
                                          :potential        1.034
                                          :yield            0.74
                                          :coarse-fine-diff 0.015
                                          :moisture         0.04
                                          :color            90
                                          :recommend-mash   false
                                          :add-after-boil   false
                                          :diastatic-power  0
                                          :max-in-batch     0.2
                                          :protein          0.132
                                          :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-120l
  (build-grain :caramel-crystal-malt-120l {:name             "Caramel/Crystal Malt - 120L"
                                           :potential        1.033
                                           :yield            0.72
                                           :coarse-fine-diff 0.015
                                           :moisture         0.04
                                           :color            120
                                           :recommend-mash   false
                                           :add-after-boil   false
                                           :diastatic-power  0
                                           :max-in-batch     0.2
                                           :protein          0.102
                                           :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-140l
  (build-grain :caramel-crystal-malt-140l {:name             "Caramel/Crystal Malt - 140L"
                                           :potential        1.033
                                           :yield            0.72
                                           :coarse-fine-diff 0.015
                                           :moisture         0.04
                                           :color            140
                                           :recommend-mash   false
                                           :add-after-boil   false
                                           :diastatic-power  0
                                           :max-in-batch     0.2
                                           :protein          0.102
                                           :notes            "Adds body, color and improves head retention."}))

(def caramel-crystal-malt-160l
  (build-grain :caramel-crystal-malt-160l {:name             "Caramel/Crystal Malt - 160L"
                                           :potential        1.033
                                           :yield            0.72
                                           :coarse-fine-diff 0.015
                                           :moisture         0.04
                                           :color            160
                                           :recommend-mash   false
                                           :add-after-boil   false
                                           :diastatic-power  0
                                           :max-in-batch     0.2
                                           :protein          0.102
                                           :notes            "Adds body, color and improves head retention."}))

(def caramunich-malt
  (build-grain :caramunich-malt {:name             "Caramunich Malt"
                                 :potential        1.033
                                 :yield            0.717
                                 :coarse-fine-diff 0.015
                                 :moisture         0.04
                                 :color            56
                                 :recommend-mash   false
                                 :add-after-boil   false
                                 :diastatic-power  0
                                 :max-in-batch     0.1
                                 :protein          0
                                 :notes            "Caramel, copper colored malt. Used in Belgian ales and German bocks."}))

(def carared
  (build-grain :carared {:name             "Carared"
                         :potential        1.035
                         :yield            0.75
                         :coarse-fine-diff 0.015
                         :moisture         0.04
                         :color            20
                         :recommend-mash   false
                         :add-after-boil   false
                         :diastatic-power  0
                         :max-in-batch     0.2
                         :protein          0.132
                         :notes            "Adds body, color and improves head retention."}))

(def caravienne-malt
  (build-grain :caravienne-malt {:name             "Caravienne Malt"
                                 :potential        1.034
                                 :yield            0.739
                                 :coarse-fine-diff 0.015
                                 :moisture         0.04
                                 :color            22
                                 :recommend-mash   false
                                 :add-after-boil   false
                                 :diastatic-power  0
                                 :max-in-batch     0.1
                                 :protein          0
                                 :notes            "Light Belgian crystal malt. Used in light Trappist and Abbey style Belgian ales."}))

(def chocolate-malt
  (build-grain :chocolate-malt {:name             "Chocolate Malt"
                                :potential        1.028
                                :yield            0.6
                                :coarse-fine-diff 0.015
                                :moisture         0.04
                                :color            350
                                :recommend-mash   false
                                :add-after-boil   false
                                :diastatic-power  0
                                :max-in-batch     0.1
                                :protein          0.132
                                :notes            "Dark malt that gives a rich red or brown color and nutty flavor. Maintains some malty flavor, not as dark as roasted malt."}))

(def chocolate-malt-uk
  (build-grain :chocolate-malt-uk {:name             "Chocolate Malt (UK)"
                                   :potential        1.034
                                   :yield            0.73
                                   :coarse-fine-diff 0.015
                                   :moisture         0.04
                                   :color            450
                                   :recommend-mash   false
                                   :add-after-boil   false
                                   :diastatic-power  0
                                   :max-in-batch     0.1
                                   :protein          0.105
                                   :notes            "Dark malt that gives a rich red or brown color and nutty flavor. Maintains some malty flavor, not as dark as roasted malt."}))

(def corn-flaked
  (build-grain :corn-flaked {:name             "Corn (Flaked)"
                             :potential        1.030
                             :yield            0.825
                             :coarse-fine-diff 0.015
                             :moisture         0.09
                             :color            3
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  0
                             :max-in-batch     1
                             :protein          0.1
                             :notes            "Generally a neutral flavor, used to reduce maltiness of beer."}))

(def maris-otter-pale-malt
  (build-grain :maris-otter-pale-malt {:name             "Maris Otter Pale Malt"
                                       :potential        1.037
                                       :yield            0.8
                                       :coarse-fine-diff 0.013
                                       :moisture         0.035
                                       :color            1
                                       :recommend-mash   true
                                       :add-after-boil   false
                                       :diastatic-power  10
                                       :max-in-batch     1
                                       :protein          0.1
                                       :notes            "A base malt from the UK."}))

(def melanoiden-malt
  (build-grain :melanoiden-malt {:name             "Melanoiden Malt"
                                 :potential        1.037
                                 :yield            0.8
                                 :coarse-fine-diff 0.013
                                 :moisture         0.035
                                 :color            20
                                 :recommend-mash   true
                                 :add-after-boil   false
                                 :diastatic-power  10
                                 :max-in-batch     0.15
                                 :protein          0.11
                                 :notes            "Aromatic malt from Banberg, Germany. Promotes a full flavor and rounds off beer color. Promotes deep red color and malty flavor."}))

(def mild-malt
  (build-grain :mild-malt {:name             "Mild Malt"
                           :potential        1.037
                           :yield            0.8
                           :coarse-fine-diff 0.015
                           :moisture         0.04
                           :color            4
                           :recommend-mash   true
                           :add-after-boil   false
                           :diastatic-power  53
                           :max-in-batch     1
                           :protein          0.106
                           :notes            "Also called 'English Mild' - a light specialty malt used in Brown Ales"}))

(def munich-malt
  (build-grain :munich-malt {:name             "Munich Malt"
                             :potential        1.037
                             :yield            0.8
                             :coarse-fine-diff 0.013
                             :moisture         0.05
                             :color            9
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  72
                             :max-in-batch     0.8
                             :protein          0.115
                             :notes            "Malty-sweet flavor characteristic and adds a reddish amber color to the beer. Does not contribute signficantly to body or head retention."}))

(def munich-malt-10l
  (build-grain :munich-malt-10l {:name             "Munich Malt - 10L"
                                 :potential        1.035
                                 :yield            0.77
                                 :coarse-fine-diff 0.028
                                 :moisture         0.05
                                 :color            10
                                 :recommend-mash   true
                                 :add-after-boil   false
                                 :diastatic-power  50
                                 :max-in-batch     0.8
                                 :protein          0.135
                                 :notes            "Malty-sweet flavor characteristic and adds a slight orange color to the beer."}))

(def munich-malt-20l
  (build-grain :munich-malt-20l {:name             "Munich Malt - 20L"
                                 :potential        1.035
                                 :yield            0.75
                                 :coarse-fine-diff 0.028
                                 :moisture         0.05
                                 :color            20
                                 :recommend-mash   true
                                 :add-after-boil   false
                                 :diastatic-power  25
                                 :max-in-batch     0.8
                                 :protein          0.135
                                 :notes            "Malty-sweet flavor characteristic and adds a orange to deep orange color to the beer."}))

(def oats-flaked
  (build-grain :oats-flaked {:name             "Oats, Flaked"
                             :potential        1.037
                             :yield            0.8
                             :coarse-fine-diff 0.015
                             :moisture         0.09
                             :color            1
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  0
                             :max-in-batch     0.3
                             :protein          0.09
                             :notes            "Adds body, mouth feel and head retention to the beer. Adds substantial protein haze to light beers. Protein rest recommended unless flakes are pre-gelatinized."}))

(def oats-malted
  (build-grain :oats-malted {:name             "Oats, Malted"
                             :potential        1.037
                             :yield            0.8
                             :coarse-fine-diff 0.015
                             :moisture         0.09
                             :color            1
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  0
                             :max-in-batch     0.1
                             :protein          0.09
                             :notes            "Malted oats. Adds body, mouth feel and head retention to the beer Creates chill haze in lighter beers, so is primarily used in dark ones."}))

(def pale-malt-2-row-belgium
  (build-grain :pale-malt-2-row-belgium {:name             "Pale Malt (2 Row) - Belgium"
                                         :potential        1.037
                                         :yield            0.8
                                         :coarse-fine-diff 0.015
                                         :moisture         0.04
                                         :color            3
                                         :recommend-mash   true
                                         :add-after-boil   false
                                         :diastatic-power  60
                                         :max-in-batch     1
                                         :protein          0.105
                                         :notes            "Base malt for all beer styles"}))

(def pale-malt-2-row-uk
  (build-grain :pale-malt-2-row-uk {:name             "Pale Malt (2 Row) - UK"
                                    :potential        1.036
                                    :yield            0.78
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            3
                                    :recommend-mash   true
                                    :add-after-boil   false
                                    :diastatic-power  45
                                    :max-in-batch     1
                                    :protein          0.101
                                    :notes            "Base malt for all English beer styles"}))

(def pale-malt-2-row-us
  (build-grain :pale-malt-2-row-us {:name             "Pale Malt (2 Row) - USA"
                                    :potential        1.036
                                    :yield            0.79
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            2
                                    :recommend-mash   true
                                    :add-after-boil   false
                                    :diastatic-power  140
                                    :max-in-batch     1
                                    :protein          0.123
                                    :notes            "Base malt for all beer styles"}))

(def pale-malt-6-row-us
  (build-grain :pale-malt-6-row-us {:name             "Pale Malt (6 Row) - USA"
                                    :potential        1.035
                                    :yield            0.76
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            2
                                    :recommend-mash   true
                                    :add-after-boil   false
                                    :diastatic-power  150
                                    :max-in-batch     1
                                    :protein          0.13
                                    :notes            "Base malt for all beer styles"}))

(def peat-smoked-malt
  (build-grain :peat-smoked-malt {:name             "Peat Smoked Malt"
                                  :potential        1.034
                                  :yield            0.74
                                  :coarse-fine-diff 0.015
                                  :moisture         0.04
                                  :color            3
                                  :recommend-mash   true
                                  :add-after-boil   false
                                  :diastatic-power  0
                                  :max-in-batch     0.2
                                  :protein          0
                                  :notes            "Robust smoky malt that provides a smoky flavor. Used in scottish ales and wee heavy ales."}))

(def pilsner-2-row-belgium
  (build-grain :pilsner-2-row-belgium {:name             "Pilsner (2 Row) - Belgium"
                                       :potential        1.036
                                       :yield            0.79
                                       :coarse-fine-diff 0.015
                                       :moisture         0.04
                                       :color            2
                                       :recommend-mash   true
                                       :add-after-boil   false
                                       :diastatic-power  105
                                       :max-in-batch     1
                                       :protein          0.105
                                       :notes            "Belgian base malt for Continental lagers"}))

(def pilsner-2-row-germany
  (build-grain :pilsner-2-row-germany {:name             "Pilsner (2 Row) - Germany"
                                       :potential        1.037
                                       :yield            0.81
                                       :coarse-fine-diff 0.015
                                       :moisture         0.04
                                       :color            2
                                       :recommend-mash   true
                                       :add-after-boil   false
                                       :diastatic-power  110
                                       :max-in-batch     1
                                       :protein          0.11
                                       :notes            "German base for Pilsners and Bohemian Lagers"}))

(def pilsner-2-row-uk
  (build-grain :pilsner-2-row-uk {:name             "Pilsner (2 Row) - UK"
                                  :potential        1.036
                                  :yield            0.78
                                  :coarse-fine-diff 0.015
                                  :moisture         0.04
                                  :color            1
                                  :recommend-mash   true
                                  :add-after-boil   false
                                  :diastatic-power  60
                                  :max-in-batch     1
                                  :protein          0.1
                                  :notes            "Pilsner base malt"}))

(def rice-flaked
  (build-grain :rice-flaked {:name             "Rice, Flaked"
                             :potential        1.032
                             :yield            0.7
                             :coarse-fine-diff 0.015
                             :moisture         0.09
                             :color            1
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  0
                             :max-in-batch     0.25
                             :protein          0.1
                             :notes            "Used to add fermentable sugar without increasing body. Produces a milder, less grainy tasting beer."}))

(def roasted-barley
  (build-grain :roasted-barley {:name             "Roasted Barley"
                                :potential        1.025
                                :yield            0.55
                                :coarse-fine-diff 0.015
                                :moisture         0.05
                                :color            300
                                :recommend-mash   false
                                :add-after-boil   false
                                :diastatic-power  0
                                :max-in-batch     0.1
                                :protein          0.132
                                :notes            "Roasted at high temperature to create a burnt, grainy, coffee like flavor. Imparts a red to deep brown color to beer, and very strong roasted flavor."}))

(def rye-malt
  (build-grain :rye-malt {:name             "Rye Malt"
                          :potential        1.029
                          :yield            0.63
                          :coarse-fine-diff 0.015
                          :moisture         0.04
                          :color            5
                          :recommend-mash   true
                          :add-after-boil   false
                          :diastatic-power  75
                          :max-in-batch     0.15
                          :protein          0.103
                          :notes            "Adds a dry, crisp character to the beer. Yields a deep red color, and a distinctive rye flavor"}))

(def rye-flaked
  (build-grain :rye-flaked {:name             "Rye, Flaked"
                            :potential        1.036
                            :yield            0.783
                            :coarse-fine-diff 0.015
                            :moisture         0.04
                            :color            2
                            :recommend-mash   true
                            :add-after-boil   false
                            :diastatic-power  0
                            :max-in-batch     0.1
                            :protein          0
                            :notes            "Imparts a dry, crisp rye flavor to rye beers. Can be easier to mash than raw rye."}))

(def smoked-malt
  (build-grain :smoked-malt {:name             "Smoked Malt"
                             :potential        1.037
                             :yield            0.8
                             :coarse-fine-diff 0.015
                             :moisture         0.04
                             :color            9
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  0
                             :max-in-batch     1
                             :protein          0.115
                             :notes            "Malt that has been smoked over an open fire. Creates a distinctive smoke flavor and aroma."}))

(def special-b-malt
  (build-grain :special-b-malt {:name             "Special B Malt"
                                :potential        1.030
                                :yield            0.652
                                :coarse-fine-diff 0.015
                                :moisture         0.04
                                :color            180
                                :recommend-mash   true
                                :add-after-boil   false
                                :diastatic-power  0
                                :max-in-batch     0.1
                                :protein          0
                                :notes            "Extreme caramel aroma and flavored malt. Used in dark Belgian Abbey and Trappist ales."}))

(def special-roast
  (build-grain :special-roast {:name             "Special Roast"
                               :potential        1.033
                               :yield            0.72
                               :coarse-fine-diff 0.015
                               :moisture         0.025
                               :color            50
                               :recommend-mash   true
                               :add-after-boil   false
                               :diastatic-power  6
                               :max-in-batch     0.1
                               :protein          0.105
                               :notes            "Use for English ales, nut brown ales and porters. Adds a toasted, biscuit like flavor and aroma"}))

(def toasted-malt
  (build-grain :toasted-malt {:name             "Toasted Malt"
                              :potential        1.033
                              :yield            0.717
                              :coarse-fine-diff 0.015
                              :moisture         0.04
                              :color            27
                              :recommend-mash   true
                              :add-after-boil   false
                              :diastatic-power  0
                              :max-in-batch     0.1
                              :protein          0.117
                              :notes            "Similar to Biscuit or Victory malt, this malt adds reddish/orange color and improved body without sweetness along with a toasted flavor."}))

(def victory-malt
  (build-grain :victory-malt {:name             "Victory Malt"
                              :potential        1.034
                              :yield            0.73
                              :coarse-fine-diff 0.015
                              :moisture         0.04
                              :color            25
                              :recommend-mash   true
                              :add-after-boil   false
                              :diastatic-power  50
                              :max-in-batch     0.15
                              :protein          0.132
                              :notes            "Toasted malt that adds a Biscuit or toasted flavor to English ales."}))

(def vienna-malt
  (build-grain :vienna-malt {:name             "Vienna Malt"
                             :potential        1.036
                             :yield            0.78
                             :coarse-fine-diff 0.015
                             :moisture         0.04
                             :color            4
                             :recommend-mash   true
                             :add-after-boil   false
                             :diastatic-power  50
                             :max-in-batch     0.9
                             :protein          0.11
                             :notes            "Kiln dried malt darker than Pale Malt, but not as dark as Munich Malt. Imparts a golden to orange color to the beer."}))

(def wheat-malt-belgium
  (build-grain :wheat-malt-belgium {:name             "Wheat Malt - Belgium"
                                    :potential        1.037
                                    :yield            0.81
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            2
                                    :recommend-mash   true
                                    :add-after-boil   false
                                    :diastatic-power  74
                                    :max-in-batch     0.6
                                    :protein          0.115
                                    :notes            "Malted wheat for use in Wheat beers"}))

(def dark-wheat-malt
  (build-grain :dark-wheat-malt {:name "Dark Wheat Malt"
                                 :potential 1.039
                                 :yield 0.84
                                 :coarse-fine-diff 0.015
                                 :moisture 0.035
                                 :color 9
                                 :recommend-mash true
                                 :add-after-boil false
                                 :diastatic-power 10
                                 :max-in-batch 0.2
                                 :protein 0.115
                                 :notes "Dark malted wheat base for use in dark wheat styles such as Dunkleweizen."}))

(def wheat-malt-germany
  (build-grain :wheat-malt-germany {:name             "Wheat Malt - Germany"
                                    :potential        1.039
                                    :yield            0.84
                                    :coarse-fine-diff 0.015
                                    :moisture         0.04
                                    :color            2
                                    :recommend-mash   true
                                    :add-after-boil   false
                                    :diastatic-power  95
                                    :max-in-batch     0.6
                                    :protein          0.125
                                    :notes            "Malted wheat base for use in all wheat styles"}))

(def wheat-flaked
  (build-grain :wheat-flaked {:name             "Wheat, Flaked"
                              :potential        1.035
                              :yield            0.77
                              :coarse-fine-diff 0.015
                              :moisture         0.09
                              :color            2
                              :recommend-mash   true
                              :add-after-boil   false
                              :diastatic-power  0
                              :max-in-batch     0.4
                              :protein          0.16
                              :notes            "Flaked wheat adds to increased body and foam retention. May be used in small amounts to improve head retention and body."}))

(def wheat-roasted
  (build-grain :wheat-roasted {:name "Wheat, Roasted"
                               :potential 1.025
                               :yield 0.543
                               :coarse-fine-diff 0.015
                               :moisture 0.04
                               :color 425
                               :recommend-mash true
                               :add-after-boil false
                               :diastatic-power 0
                               :max-in-batch 0.1
                               :protein 0.13
                               :notes "Also called Chocolate Wheat Malt. Adds a deep, dark brown color to dunkelweizens and other dark beer styles."}))

(def wheat-torrified
  (build-grain :wheat-torrified {:name             "Wheat, Torrified"
                                 :potential        1.036
                                 :yield            0.79
                                 :coarse-fine-diff 0.015
                                 :moisture         0.09
                                 :color            2
                                 :recommend-mash   true
                                 :add-after-boil   false
                                 :diastatic-power  0
                                 :max-in-batch     0.4
                                 :protein          0.16
                                 :notes            "Unmodified wheat that has been popped to open the kernels. Protein rest recommended when mashing."}))

(def white-wheat-malt
  (build-grain :white-wheat-malt {:name             "White Wheat Malt"
                                  :potential        1.040
                                  :yield            0.86
                                  :coarse-fine-diff 0.022
                                  :moisture         0.04
                                  :color            2
                                  :recommend-mash   true
                                  :add-after-boil   false
                                  :diastatic-power  130
                                  :max-in-batch     0.6
                                  :protein          0.145
                                  :notes            "White wheat gives a malty flavor not available from raw wheat."}))

(def grains
  (merge acid-malt amber-malt aromatic-malt barley-flaked barley-raw barley-torrefied biscuit-malt black-patent-malt black-barley-stout brown-malt brumalt
         cara-pils-dextrine carafoam dextrine caraamber caramel-crystal-malt-10l caramel-crystal-malt-20l caramel-crystal-malt-30l caramel-crystal-malt-40l
         caramel-crystal-malt-60l caramel-crystal-malt-80l caramel-crystal-malt-90l caramel-crystal-malt-120l caramel-crystal-malt-140l caramel-crystal-malt-160l
         caramunich-malt carared caravienne-malt chocolate-malt chocolate-malt-uk corn-flaked melanoiden-malt mild-malt munich-malt munich-malt-10l munich-malt-20l
         oats-flaked oats-malted maris-otter-pale-malt pale-malt-2-row-belgium pale-malt-2-row-uk pale-malt-2-row-us pale-malt-6-row-us peat-smoked-malt
         pilsner-2-row-belgium pilsner-2-row-germany pilsner-2-row-uk rice-flaked roasted-barley rye-malt rye-flaked smoked-malt special-b-malt special-roast
         toasted-malt victory-malt vienna-malt wheat-malt-belgium dark-wheat-malt wheat-malt-germany wheat-flaked wheat-roasted wheat-torrified white-wheat-malt))
