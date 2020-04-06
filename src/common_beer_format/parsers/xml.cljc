(ns common-beer-format.parsers.xml
  (:require [clj-http.client :as http]
            [clojure.data.xml :as xml]
            [clojure.string :as cs])) ;; XML is truly the worst

(defn keywordize
  [s]
  (keyword (cs/join "-" (re-seq #"[a-zA-Z0-9]+" (cs/lower-case (str s))))))

(defn try-or-nil
  "Returns result of applying args to f inside a try/catch, returning nil in case of Exception."
  [f & args]
  (try
    (apply f args)
    (catch Exception _ nil)))

(defn fetch-recipe
  [recipe-number]
  (let [url (str "https://www.brewersfriend.com/homebrew/recipe/beerxml1.0/" recipe-number)
        page (http/get url)]
    (when (= 200 (:status page))
      (-> page
          :body
          xml/parse-str))))

(def clojure-xml (fetch-recipe "364091"))

(defn xml-tag->map-entry
  [xml]
  (cond
    (map? xml)        {(:tag xml) (xml-tag->map-entry (:content xml))}
    (and (every? map? xml)
         (< 1 (count (mapv :tag xml)))
         (= (mapv :tag xml)
            (distinct (mapv :tag xml))))   (into {} (filter second (apply merge (map xml-tag->map-entry xml))))
    (and (seq xml)
         (every? coll? xml))               (keep xml-tag->map-entry xml)
    (= 1 (count xml))                      (first xml)))
