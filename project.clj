(defproject com.wallbrew/common-beer-format "1.3.1"
  :description "An implementation of the BeerXML spec in multiple formats"
  :url "https://github.com/Wall-Brew-Co/common-beer-format"
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}
  :dependencies [[metosin/spec-tools "0.10.5"]
                 [nnichols "0.9.0"]
                 [org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.844" :scope "provided"]
                 [org.clojure/data.json "2.1.1"]
                 [org.clojure/data.xml "0.2.0-alpha6"]
                 [org.clojure/test.check "1.1.0"]]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[doo "0.1.11"]]
                       :plugins      [[lein-doo "0.1.10"]]}}

  :min-lein-version "2.5.3"

  :aliases {"test-build" ["do" "clean" ["cljsbuild" "once" "test"] ["doo" "once"] ["test"]]}

  :cljsbuild {:builds [{:id           "test"
                        :source-paths ["src" "test"]
                        :compiler     {:main           "common-beer-format.runner"
                                       :output-to      "target/test/app.js"
                                       :output-dir     "target/test/js/compiled/out"
                                       :optimizations  :none
                                       :parallel-build true}}]}

  :doo {:build "test"
        :alias {:default [:chrome-headless-no-sandbox]}
        :paths {:karma "./node_modules/karma/bin/karma"}
        :karma {:launchers {:chrome-headless-no-sandbox {:plugin "karma-chrome-launcher"
                                                         :name   "ChromeHeadlessNoSandbox"}}
                :config    {"captureTimeout"             210000
                            "browserDisconnectTolerance" 3
                            "browserDisconnectTimeout"   210000
                            "browserNoActivityTimeout"   210000
                            "customLaunchers"            {"ChromeHeadlessNoSandbox" {"base"  "ChromeHeadless"
                                                                                     "flags" ["--no-sandbox" "--disable-dev-shm-usage"]}}}}})
