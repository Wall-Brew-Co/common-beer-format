(defproject com.wallbrew/common-beer-format "2.6.0"
  :description "An implementation of the BeerXML spec in multiple formats."
  :url "https://github.com/Wall-Brew-Co/common-beer-format"
  :license {:name         "MIT"
            :url          "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments     "Same-as all Wall-Brew projects"}
  :scm {:name "git"
        :url  "https://github.com/Wall-Brew-Co/common-beer-format"}
  :global-vars {*warn-on-reflection* true}
  :pom-addition [:organization
                 [:name "Wall Brew Co."]
                 [:url "https://wallbrew.com"]]
  :pedantic? true
  :dependencies [[metosin/spec-tools "0.10.7"]
                 [org.clojure/clojure "1.12.1"]
                 [org.clojure/clojurescript "1.12.42" :scope "provided"]
                 [org.clojure/test.check "1.1.1"]]
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2025.07.28"]
            [com.wallbrew/bouncer "1.2.0"]
            [com.wallbrew/lein-sealog "1.9.0"]
            [lein-cljsbuild/lein-cljsbuild "1.1.8"]
            [mvxcvi/cljstyle "0.17.642"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[com.wallbrew/clj-xml "1.13.0"]
                                      [com.wallbrew/spoon "1.5.0"]
                                      [doo/doo "0.1.11"]
                                      [mvxcvi/cljstyle "0.17.642"]
                                      [org.clojure/data.json "2.5.1"]]
                       :plugins      [[lein-doo/lein-doo "0.1.11"]]}
             :export  {:source-paths ["src" "dev"]}}
  :deploy-branches ["master"]
  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]]

  :min-lein-version "2.5.3"

  :aliases {"cljstyle"   ["run" "-m" "cljstyle.main" "fix"]
            "test-build"    ["do" "clean" ["cljsbuild" "once" "test"] ["doo" "once"] ["test"]]
            "export-specs"  ["with-profile" "+export" "run" "-m" "common-beer-format.spec-export/render-specs!"]
            "export-schema" ["with-profile" "+export" "run" "-m" "common-beer-format.json-schema-export/render-specs!"]}

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
