(ns common-beer-format.styles.bjcp-2015.styles
  "Function to help minimize repeated data in 2015 BJCP style guidelines")

(def ^:private style-defaults
  {:version 1
   :style-guide "BJCP 2015"})

(defn build-style
  "Construct a style, including display/range values derived from core style data"
  [style-key style-data]
  (let [carb-range        (str (:carb-min style-data) "-" (:carb-max style-data) " Vols")
        og-range          (str (:og-min style-data) "-" (:og-max style-data) " SG")
        fg-range          (str (:fg-min style-data) "-" (:fg-max style-data) " SG")
        abv-range         (str (:abv-min style-data) "% - " (:abv-max style-data) "%")
        ibu-range         (str (:ibu-min style-data) "-" (:ibu-max style-data) " IBUs")
        color-range       (str (:color-min style-data) "-" (:color-max style-data) " SRM")
        display-color-min (str (:color-min style-data) " SRM")
        display-color-max (str (:color-max style-data) " SRM")
        display-og-min    (str (:og-min style-data) " SG")
        display-og-max    (str (:og-max style-data) " SG")
        display-fg-min    (str (:fg-min style-data) " SG")
        display-fg-max    (str (:fg-max style-data) " SG")
        base-style        (merge style-defaults style-data)
        style-def         (assoc base-style
                                 :carb-range        carb-range
                                 :og-range          og-range
                                 :fg-range          fg-range
                                 :abv-range         abv-range
                                 :ibu-range         ibu-range
                                 :color-range       color-range
                                 :display-color-min display-color-min
                                 :display-color-max display-color-max
                                 :display-og-min    display-og-min
                                 :display-og-max    display-og-max
                                 :display-fg-min    display-fg-min
                                 :display-fg-max    display-fg-max)]
    {style-key style-def}))

(def american-light-lager
  (build-style :american-light-lager {:category        "Standard American Beer"
                                      :carb-min        1.5
                                      :fg-max          1.008
                                      :og-min          1.028
                                      :name            "American Light Lager"
                                      :type            "Lager"
                                      :style-letter    "A"
                                      :abv-min         2.8
                                      :fg-min          0.998
                                      :category-number "1"
                                      :carb-max        3.0
                                      :ibu-max         12
                                      :ingredients     "Two- or six-row barley with high percentage (up to 40%) of rice or corn as adjuncts. Additional enzymes can further lighten the body and lower carbohydrates."
                                      :examples        "Bud Light, Coors Light, Keystone Light, Michelob Light, Miller Lite, Old Milwaukee Light"
                                      :notes           "Highly carbonated, very light-bodied, nearly flavorless lager designed to be consumed very cold. Very refreshing and thirst quenching."
                                      :og-max          1.04
                                      :color-min       2
                                      :abv-max         4.2
                                      :color-max       3
                                      :profile         "Aroma: Low to no malt aroma, although it can be perceived as grainy, sweet, or corn-like if present. Hop aroma is light to none, with a spicy or floral hop character if present. While a clean fermentation character is desirable, a light amount of yeast character (particularly a light apple fruitiness) is not a fault. Light DMS is not a fault. Appearance: Very pale straw to pale yellow color. White, frothy head seldom persists. Very clear. Flavor: Relatively neutral palate with a crisp and dry finish and a low to very low grainy or corn-like flavor that might be perceived as sweetness due to the low bitterness. Hop flavor ranges from none to low levels, and can have a floral, spicy, or herbal quality (although rarely strong enough to detect). Low to very low hop bitterness. Balance may vary from slightly malty to slightly bitter, but is relatively close to even. High levels of carbonation may accentuate the crispness of the dry finish. Clean lager fermentation character. Mouthfeel: Very light (sometimes watery) body. Very highly carbonated with slight carbonic bite on the tongue."
                                      :ibu-min         8}))
