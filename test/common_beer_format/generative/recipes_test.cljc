(ns common-beer-format.generative.recipes-test
  (:require [clojure.spec.alpha :as spec]
            [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.equipment-test :as equipment]
            [common-beer-format.generative.fermentables-test :as fermentables]
            [common-beer-format.generative.hops-test :as hops]
            [common-beer-format.generative.mash-test :as mash]
            [common-beer-format.generative.miscs-test :as miscs]
            [common-beer-format.generative.styles-test :as style]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.generative.waters-test :as waters]
            [common-beer-format.generative.yeasts-test :as yeasts]
            [common-beer-format.recipes :as recipes]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest data-requirement-test
  (testing "Object specs require data"
    (is (not (spec/valid? ::recipes/recipe nil)))
    (is (not (spec/valid? ::recipes/recipe [])))
    (is (not (spec/valid? ::recipes/recipe {})))
    (is (not (spec/valid? ::recipes/recipe-wrapper nil)))
    (is (not (spec/valid? ::recipes/recipe-wrapper [])))
    (is (not (spec/valid? ::recipes/recipe-wrapper {})))))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::recipes/primary-temp))
    (is (gen/generatable? ::recipes/asst-brewer))
    (is (gen/generatable? ::recipes/display-og))
    (is (gen/generatable? ::recipes/secondary-age))
    (is (gen/generatable? ::recipes/og))
    (is (gen/generatable? ::recipes/display-primary-temp))
    (is (gen/generatable? ::recipes/abv))
    (is (gen/generatable? ::recipes/recipes))
    (is (gen/generatable? ::recipes/est-color))
    (is (gen/generatable? ::recipes/boil-time))
    (is (gen/generatable? ::recipes/boil-size))
    (is (gen/generatable? ::recipes/display-carb-temp))
    (is (gen/generatable? ::recipes/batch-size))
    (is (gen/generatable? ::recipes/est-fg))
    (is (gen/generatable? ::recipes/display-boil-size))
    (is (gen/generatable? ::recipes/tertiary-age))
    (is (gen/generatable? ::recipes/priming-sugar-equiv))
    (is (gen/generatable? ::recipes/display-secondary-temp))
    (is (gen/generatable? ::recipes/brewer))
    (is (gen/generatable? ::recipes/taste-notes))
    (is (gen/generatable? ::recipes/recipes-wrapper))
    (is (gen/generatable? ::recipes/display-tertiary-temp))
    (is (gen/generatable? ::recipes/age))
    (is (gen/generatable? ::recipes/tertiary-temp))
    (is (gen/generatable? ::recipes/fermentation-stages))
    (is (gen/generatable? ::recipes/recipe))
    (is (gen/generatable? ::recipes/primary-age))
    (is (gen/generatable? ::recipes/carbonation))
    (is (gen/generatable? ::recipes/fg))
    (is (gen/generatable? ::recipes/date))
    (is (gen/generatable? ::recipes/display-batch-size))
    (is (gen/generatable? ::recipes/taste-rating))
    (is (gen/generatable? ::recipes/display-age-temp))
    (is (gen/generatable? ::recipes/est-og))
    (is (gen/generatable? ::recipes/age-temp))
    (is (gen/generatable? ::recipes/priming-sugar-name))
    (is (gen/generatable? ::recipes/est-abv))
    (is (gen/generatable? ::recipes/secondary-temp))
    (is (gen/generatable? ::recipes/efficiency))
    (is (gen/generatable? ::recipes/ibu-method))
    (is (gen/generatable? ::recipes/calories))
    (is (gen/generatable? ::recipes/display-fg))
    (is (gen/generatable? ::recipes/carbonation-temp))
    (is (gen/generatable? ::recipes/forced-carbonation))
    (is (gen/generatable? ::recipes/carbonation-used))
    (is (gen/generatable? ::recipes/recipe-wrapper))
    (is (gen/generatable? ::recipes/actual-efficiency))
    (is (gen/generatable? ::recipes/keg-priming-factor))
    (is (gen/generatable? ::recipes/type))
    (is (gen/generatable? ::recipes/ibu))))


(def sample-recipe
  "A sample recipe for unit tests"
  {:name                   "Secret Bru"
   :style                  style/sample-style
   :equipment              equipment/sample-equipment
   :fermentables           fermentables/sample-fermentables
   :hops                   hops/sample-hops
   :miscs                  miscs/sample-miscs
   :yeasts                 yeasts/sample-yeasts
   :waters                 waters/sample-waters
   :mash                   mash/sample-mash
   :version                1
   :type                   "All Grain"
   :brewer                 "Nick \"The Trick\" Nichols"
   :batch-size             5.0
   :boil-size              6.5
   :boil-time              60
   :asst-brewer            "Discordian Brewing"
   :efficiency             75.0
   :notes                  "This is a test recipe"
   :taste-notes            "This is a test recipe"
   :taste-rating           50
   :og                     1.05
   :fg                     1.01
   :fermentation-stages    2
   :primary-age            7
   :primary-temp           20.0
   :secondary-age          14
   :secondary-temp         20.0
   :tertiary-age           21
   :tertiary-temp          20.0
   :age                    28
   :age-temp               20.0
   :date                   "2016-01-01"
   :carbonation            2.4
   :forced-carbonation     false
   :priming-sugar-name     "Corn Sugar"
   :carbonation-temp       20.0
   :keg-priming-factor     0.5
   :priming-sugar-equiv    4.2
   :est-og                 1.05
   :est-fg                 1.01
   :est-color              4.4
   :ibu                    60.1
   :ibu-method             "Tinseth"
   :est-abv                5.0
   :actual-efficiency      75.0
   :abv                    5.0
   :calories               186.0
   :display-batch-size     "5.00 gal"
   :display-boil-size      "6.50 gal"
   :display-og             "1.050 SG"
   :display-fg             "1.010 SG"
   :display-primary-temp   "20.0 C"
   :display-secondary-temp "20.0 C"
   :display-tertiary-temp  "20.0 C"
   :display-age-temp       "20.0 C"
   :display-carb-temp      "20.0 C"
   :carbonation-used       "Corn Sugar"})


(def sample-recipe-wrapper
  "A sample recipe wrapper for unit tests"
  {:recipe sample-recipe})


(def sample-recipes
  "Sample recipes for unit tests"
  [sample-recipe-wrapper])


(def sample-recipes-wrapper
  "Sample recipes wrapper for unit tests"
  {:recipes sample-recipes})


(deftest static-test-data-check
  (testing "Since this library assumes common-beer-format data is utilized, make sure static test data conforms"
    (is (spoon.spec/test-valid? ::recipes/recipe sample-recipe)
        "Static test data should conform to common-beer-format.recipe/recipe")
    (is (spoon.spec/test-valid? ::recipes/recipe-wrapper sample-recipe-wrapper)
        "Static test data should conform to common-beer-format.recipe/recipe-wrapper")
    (is (spoon.spec/test-valid? ::recipes/recipes sample-recipes)
        "Static test data should conform to common-beer-format.recipe/recipes")
    (is (spoon.spec/test-valid? ::recipes/recipes-wrapper sample-recipes-wrapper)
        "Static test data should conform to common-beer-format.recipe/recipes-wrapper")))


(deftest static-keys-test
  (testing "Ensure static keys exist within complete recipe records and point to valid data"
    (is (contains? sample-recipe recipes/name)
        "Name key should exist within sample recipe")
    (is (contains? sample-recipe recipes/version)
        "Version key should exist within sample recipe")
    (is (contains? sample-recipe recipes/type)
        "Type key should exist within sample recipe")
    (is (contains? sample-recipe recipes/brewer)
        "Brewer key should exist within sample recipe")
    (is (contains? sample-recipe recipes/batch-size)
        "Batch size key should exist within sample recipe")
    (is (contains? sample-recipe recipes/boil-size)
        "Boil size key should exist within sample recipe")
    (is (contains? sample-recipe recipes/boil-time)
        "Boil time key should exist within sample recipe")
    (is (contains? sample-recipe recipes/asst-brewer)
        "Asst brewer key should exist within sample recipe")
    (is (contains? sample-recipe recipes/efficiency)
        "Efficiency key should exist within sample recipe")
    (is (contains? sample-recipe recipes/notes)
        "Notes key should exist within sample recipe")
    (is (contains? sample-recipe recipes/taste-notes)
        "Taste notes key should exist within sample recipe")
    (is (contains? sample-recipe recipes/taste-rating)
        "Taste rating key should exist within sample recipe")
    (is (contains? sample-recipe recipes/og)
        "OG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/fg)
        "FG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/fermentation-stages)
        "Fermentation stages key should exist within sample recipe")
    (is (contains? sample-recipe recipes/primary-age)
        "Primary age key should exist within sample recipe")
    (is (contains? sample-recipe recipes/primary-temp)
        "Primary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/secondary-age)
        "Secondary age key should exist within sample recipe")
    (is (contains? sample-recipe recipes/secondary-temp)
        "Secondary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/tertiary-age)
        "Tertiary age key should exist within sample recipe")
    (is (contains? sample-recipe recipes/tertiary-temp)
        "Tertiary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/age)
        "Age key should exist within sample recipe")
    (is (contains? sample-recipe recipes/age-temp)
        "Age temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/date)
        "Date key should exist within sample recipe")
    (is (contains? sample-recipe recipes/carbonation)
        "Carbonation key should exist within sample recipe")
    (is (contains? sample-recipe recipes/forced-carbonation)
        "Forced carbonation key should exist within sample recipe")
    (is (contains? sample-recipe recipes/priming-sugar-name)
        "Priming sugar name key should exist within sample recipe")
    (is (contains? sample-recipe recipes/carbonation-temp)
        "Carbonation temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/keg-priming-factor)
        "Keg priming factor key should exist within sample recipe")
    (is (contains? sample-recipe recipes/priming-sugar-equiv)
        "Priming sugar equiv key should exist within sample recipe")
    (is (contains? sample-recipe recipes/est-og)
        "Est OG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/est-fg)
        "Est FG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/ibu)
        "IBU key should exist within sample recipe")
    (is (contains? sample-recipe recipes/ibu-method)
        "IBU method key should exist within sample recipe")
    (is (contains? sample-recipe recipes/est-color)
        "Est color key should exist within sample recipe")
    (is (contains? sample-recipe recipes/est-abv)
        "Est ABV key should exist within sample recipe")
    (is (contains? sample-recipe recipes/abv)
        "ABV key should exist within sample recipe")
    (is (contains? sample-recipe recipes/actual-efficiency)
        "Actual efficiency key should exist within sample recipe")
    (is (contains? sample-recipe recipes/calories)
        "Calories key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-boil-size)
        "Display boil size key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-batch-size)
        "Display batch size key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-og)
        "Display OG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-fg)
        "Display FG key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-primary-temp)
        "Display primary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-secondary-temp)
        "Display secondary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-tertiary-temp)
        "Display tertiary temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-age-temp)
        "Display age temp key should exist within sample recipe")
    (is (contains? sample-recipe recipes/carbonation-used)
        "Carbonation used key should exist within sample recipe")
    (is (contains? sample-recipe recipes/keg-priming-factor)
        "Keg priming factor key should exist within sample recipe")
    (is (contains? sample-recipe recipes/display-carb-temp)
        "Display Carb Temp key should exist within sample recipe"))
  (testing "Keys borrowed from other namespaces should be valid"
    (is (contains? sample-recipe recipes/fermentables)
        "Fermentables key should exist within sample recipe")
    (is (contains? sample-recipe recipes/hops)
        "Hops key should exist within sample recipe")
    (is (contains? sample-recipe recipes/miscs)
        "Miscs key should exist within sample recipe")
    (is (contains? sample-recipe recipes/waters)
        "Waters key should exist within sample recipe")
    (is (contains? sample-recipe recipes/yeasts)
        "Yeasts key should exist within sample recipe")
    (is (contains? sample-recipe recipes/mash)
        "Mash key should exist within sample recipe")
    (is (contains? sample-recipe recipes/style)
        "Style key should exist within sample recipe")
    (is (contains? sample-recipe recipes/equipment)
        "Equipment key should exist within sample recipe"))
  (testing "Wrapper keys should be valid"
    (is (contains? sample-recipe-wrapper recipes/recipe)
        "Recipe key should exist within sample recipe")
    (is (contains? sample-recipes-wrapper recipes/recipes)
        "Recipe key should exist within sample recipe"))
  (testing "Sample data should only contain valid keys"
    (is (= {}
           (dissoc sample-recipe
                   recipes/name
                   recipes/style
                   recipes/equipment
                   recipes/fermentables
                   recipes/hops
                   recipes/miscs
                   recipes/yeasts
                   recipes/waters
                   recipes/mash
                   recipes/version
                   recipes/type
                   recipes/brewer
                   recipes/batch-size
                   recipes/boil-size
                   recipes/boil-time
                   recipes/asst-brewer
                   recipes/efficiency
                   recipes/notes
                   recipes/taste-notes
                   recipes/taste-rating
                   recipes/og
                   recipes/fg
                   recipes/fermentation-stages
                   recipes/primary-age
                   recipes/primary-temp
                   recipes/secondary-age
                   recipes/secondary-temp
                   recipes/tertiary-age
                   recipes/tertiary-temp
                   recipes/age
                   recipes/age-temp
                   recipes/date
                   recipes/carbonation
                   recipes/forced-carbonation
                   recipes/priming-sugar-name
                   recipes/carbonation-temp
                   recipes/keg-priming-factor
                   recipes/priming-sugar-equiv
                   recipes/est-og
                   recipes/est-fg
                   recipes/est-color
                   recipes/ibu
                   recipes/ibu-method
                   recipes/est-abv
                   recipes/actual-efficiency
                   recipes/abv
                   recipes/calories
                   recipes/display-batch-size
                   recipes/display-boil-size
                   recipes/display-og
                   recipes/display-fg
                   recipes/display-primary-temp
                   recipes/display-secondary-temp
                   recipes/display-tertiary-temp
                   recipes/display-age-temp
                   recipes/display-carb-temp
                   recipes/carbonation-used)))
    (is (= {}
           (dissoc sample-recipe-wrapper
                   recipes/recipe)))
    (is (= {}
           (dissoc sample-recipes-wrapper recipes/recipes)))))

