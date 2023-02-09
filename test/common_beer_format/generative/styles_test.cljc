(ns common-beer-format.generative.styles-test
  (:require [com.wallbrew.spoon.spec :as spoon.spec]
            [common-beer-format.generative.util :as gen]
            [common-beer-format.styles :as styles]
            #? (:clj  [clojure.test :refer [deftest is testing]])
            #? (:cljs [cljs.test    :refer-macros [deftest is testing]])))


(deftest valid-generators-test
  (testing "Ensure all generators work out of the box"
    (is (gen/generatable? ::styles/ibu-range))
    (is (gen/generatable? ::styles/type))
    (is (gen/generatable? ::styles/style-letter))
    (is (gen/generatable? ::styles/abv-min))
    (is (gen/generatable? ::styles/og-max))
    (is (gen/generatable? ::styles/styles))
    (is (gen/generatable? ::styles/category))
    (is (gen/generatable? ::styles/carb-range))
    (is (gen/generatable? ::styles/display-fg-max))
    (is (gen/generatable? ::styles/ingredients))
    (is (gen/generatable? ::styles/color-range))
    (is (gen/generatable? ::styles/style-wrapper))
    (is (gen/generatable? ::styles/abv-range))
    (is (gen/generatable? ::styles/profile))
    (is (gen/generatable? ::styles/display-og-min))
    (is (gen/generatable? ::styles/abv-max))
    (is (gen/generatable? ::styles/og-range))
    (is (gen/generatable? ::styles/color-max))
    (is (gen/generatable? ::styles/examples))
    (is (gen/generatable? ::styles/style-guide))
    (is (gen/generatable? ::styles/category-number))
    (is (gen/generatable? ::styles/ibu-min))
    (is (gen/generatable? ::styles/og-min))
    (is (gen/generatable? ::styles/styles-wrapper))
    (is (gen/generatable? ::styles/style))
    (is (gen/generatable? ::styles/carb-min))
    (is (gen/generatable? ::styles/fg-range))
    (is (gen/generatable? ::styles/display-color-max))
    (is (gen/generatable? ::styles/display-color-min))
    (is (gen/generatable? ::styles/display-og-max))
    (is (gen/generatable? ::styles/fg-max))
    (is (gen/generatable? ::styles/display-fg-min))
    (is (gen/generatable? ::styles/fg-min))
    (is (gen/generatable? ::styles/color-min))
    (is (gen/generatable? ::styles/carb-max))
    (is (gen/generatable? ::styles/ibu-max))))


(def sample-style
  "A hard-coded sample style for static unit tests"
  {:abv-max           5.5
   :abv-min           3.2
   :carb-max          2.1
   :carb-min          1.6
   :category          "Stout"
   :category-number   "16"
   :color-max         200.0
   :color-min         35.0
   :fg-max            1.011
   :fg-min            1.007
   :ibu-max           50.0
   :ibu-min           30.0
   :name              "Dry Stout"
   :notes             "Famous Irish Stout. Dry, roasted, almost coffee like flavor."
   :og-max            1.050
   :og-min            1.035
   :style-guide       "BJCP"
   :style-letter      "A"
   :type              "Ale"
   :version           1
   :profile           "A dry stout with a roasted malt character and a dry finish. The roasted malt character should be evident in the aroma and flavor. The beer should be well attenuated and have a dry finish. The body should be medium to full. The beer should be black in color with a tan to brown head. The beer should be well carbonated. The beer should be well balanced with the roasted malt character and the hop bitterness. The beer should be well hopped for the style. The hop bitterness should be medium to high. The hop flavor and aroma should be medium to high. The beer should have a dry finish. The beer should have a roasted malt character. The roasted malt character should be evident in the aroma and flavor. The beer should be well attenuated and have a dry finish. The body should be medium to full. The beer should be black in color with a tan to brown head. The beer should be well carbonated. The beer should be well balanced with the roasted malt character and the hop bitterness. The beer should be well hopped for the style. The hop bitterness should be medium to high. The hop flavor and aroma should be medium to high. The beer should have a dry finish. The beer should have a roasted malt character. The roasted malt character should be evident in the aroma and flavor. The beer should be well attenuated and have a dry finish. The body should be medium to full. The beer should be black in color with a tan to brown head. The beer should be well carbonated. The beer should be well balanced with the roasted malt character and the hop bitterness. The beer should be well hopped for the style. The hop bitterness should be medium to high. The hop flavor and aroma should be medium to high. The beer should have a dry finish. The beer should have a roasted malt character. The roasted malt character should be evident in the aroma and flavor. The beer should be well attenuated and have a dry finish. The body should be medium to full. The beer should be black in color with a tan to brown head. The beer should be well carbonated. The beer should be well balanced with the roasted malt character and the hop bitterness. The beer should be well hopped for the style. The hop bitterness should be medium to high. The hop flavor and aroma should be medium to high. The beer should have a dry finish. The beer should have a roasted malt character."
   :ingredients       "Chocolate Malt, Roasted Barley, Black Patent Malt, Crystal Malt, Pale Malt, Corn Sugar, Hops"
   :examples          "Arminius Winterale"
   :display-og-min    "1.035"
   :display-og-max    "1.050"
   :display-fg-min    "1.007"
   :display-fg-max    "1.011"
   :display-color-min "35.0"
   :display-color-max "200.0"
   :abv-range         "3.2-5.5"
   :ibu-range         "30.0-50.0"
   :og-range          "1.035-1.050"
   :fg-range          "1.007-1.011"
   :color-range       "35.0-200.0"
   :carb-range        "1.6-2.1"})


(def sample-style-wrapper
  "A hard-coded sample style-wrapper for static unit tests"
  {:style sample-style})


(def sample-styles
  "A hard-coded sample styles for static unit tests"
  [sample-style-wrapper])


(def sample-styles-wrapper
  "A hard-coded sample styles-wrapper for static unit tests"
  {:styles sample-styles})


(deftest static-keys-test
  (testing "Ensure all static keys can be used to access data"
    (is (contains? sample-style styles/name)
        "Syles should have a :name")
    (is (contains? sample-style styles/category)
        "Syles should have a :category")
    (is (contains? sample-style styles/category-number)
        "Syles should have a :category-number")
    (is (contains? sample-style styles/style-letter)
        "Syles should have a :style-letter")
    (is (contains? sample-style styles/style-guide)
        "Syles should have a :style-guide")
    (is (contains? sample-style styles/type)
        "Syles should have a :type")
    (is (contains? sample-style styles/notes)
        "Syles should have a :notes")
    (is (contains? sample-style styles/profile)
        "Syles should have a :profile")
    (is (contains? sample-style styles/ingredients)
        "Syles should have a :ingredients")
    (is (contains? sample-style styles/examples)
        "Syles should have a :examples")
    (is (contains? sample-style styles/abv-min)
        "Syles should have a :abv-min")
    (is (contains? sample-style styles/abv-max)
        "Syles should have a :abv-max")
    (is (contains? sample-style styles/abv-range)
        "Syles should have a :abv-range")
    (is (contains? sample-style styles/ibu-min)
        "Syles should have a :ibu-min")
    (is (contains? sample-style styles/ibu-max)
        "Syles should have a :ibu-max")
    (is (contains? sample-style styles/ibu-range)
        "Syles should have a :ibu-range")
    (is (contains? sample-style styles/og-min)
        "Syles should have a :og-min")
    (is (contains? sample-style styles/og-max)
        "Syles should have a :og-max")
    (is (contains? sample-style styles/og-range)
        "Syles should have a :og-range")
    (is (contains? sample-style styles/fg-min)
        "Syles should have a :fg-min")
    (is (contains? sample-style styles/fg-max)
        "Syles should have a :fg-max")
    (is (contains? sample-style styles/fg-range)
        "Syles should have a :fg-range")
    (is (contains? sample-style styles/color-min)
        "Syles should have a :color-min")
    (is (contains? sample-style styles/color-max)
        "Syles should have a :color-max")
    (is (contains? sample-style styles/color-range)
        "Syles should have a :color-range")
    (is (contains? sample-style styles/carb-min)
        "Syles should have a :carb-min")
    (is (contains? sample-style styles/carb-max)
        "Syles should have a :carb-max")
    (is (contains? sample-style styles/carb-range)
        "Syles should have a :carb-range")
    (is (contains? sample-style styles/display-og-min)
        "Syles should have a :display-og-min")
    (is (contains? sample-style styles/display-og-max)
        "Syles should have a :display-og-max")
    (is (contains? sample-style styles/display-fg-min)
        "Syles should have a :display-fg-min")
    (is (contains? sample-style styles/display-fg-max)
        "Syles should have a :display-fg-max")
    (is (contains? sample-style styles/display-color-min)
        "Syles should have a :display-color-min")
    (is (contains? sample-style styles/display-color-max)
        "Syles should have a :display-color-max")
    (is (contains? sample-style styles/version)
        "Syles should have a :version")
    (is (contains? sample-style-wrapper styles/style)
        "Syles should have a :style")
    (is (contains? sample-styles-wrapper styles/styles)
        "Syles should have a :styles"))
  (testing "Sample data is valid"
    (is (spoon.spec/test-valid? ::styles/style sample-style)
        "Sample style should be valid")
    (is (spoon.spec/test-valid? ::styles/style-wrapper sample-style-wrapper)
        "Sample style-wrapper should be valid")
    (is (spoon.spec/test-valid? ::styles/styles sample-styles)
        "Sample styles should be valid")
    (is (spoon.spec/test-valid? ::styles/styles-wrapper sample-styles-wrapper)
        "Sample styles-wrapper should be valid"))
  (testing "Sample data should only contain valid keys"
    (is (= {} (dissoc sample-style
                      styles/name
                      styles/category
                      styles/category-number
                      styles/style-letter
                      styles/type
                      styles/notes
                      styles/profile
                      styles/ingredients
                      styles/examples
                      styles/abv-min
                      styles/abv-max
                      styles/abv-range
                      styles/ibu-min
                      styles/ibu-max
                      styles/ibu-range
                      styles/og-min
                      styles/og-max
                      styles/og-range
                      styles/fg-min
                      styles/fg-max
                      styles/fg-range
                      styles/color-min
                      styles/color-max
                      styles/color-range
                      styles/carb-min
                      styles/carb-max
                      styles/carb-range
                      styles/display-og-min
                      styles/display-og-max
                      styles/display-fg-min
                      styles/display-fg-max
                      styles/display-color-min
                      styles/display-color-max
                      styles/version
                      styles/style-guide)))))
