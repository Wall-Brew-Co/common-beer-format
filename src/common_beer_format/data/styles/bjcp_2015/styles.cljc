(ns common-beer-format.data.styles.bjcp-2015.styles
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
