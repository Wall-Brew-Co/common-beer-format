(defproject com.wallbrew/common-beer-format "2.1.0"
  :description "An implementation of the BeerXML spec in multiple formats"
  :url "https://github.com/Wall-Brew-Co/common-beer-format"
  :license {:name "MIT"
            :url  "https://opensource.org/licenses/MIT"}
  :dependencies [[metosin/spec-tools "0.10.5"]
                 [nnichols "1.1.0"]
                 [org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60" :scope "provided"]
                 [org.clojure/data.json "2.4.0"]
                 [org.clojure/data.xml "0.2.0-alpha8"]
                 [org.clojure/spec.alpha "0.3.218"]
                 [org.clojure/test.check "1.1.1"]]
  :plugins [[lein-cljsbuild "1.1.8"]
            [lein-project-version "0.1.0"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[com.wallbrew/clj-xml "1.7.2"]
                                      [com.wallbrew/spoon "1.1.0"]
                                      [doo "0.1.11"]
                                      [org.clojure/data.json "2.4.0"]
                                      [org.clojure/data.xml "0.2.0-alpha8"]]
                       :plugins      [[lein-doo "0.1.11"]]}}
  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]]

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
