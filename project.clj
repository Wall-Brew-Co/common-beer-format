(defproject com.wallbrew/common-beer-format "2.3.0"
  :description "An implementation of the BeerXML spec in multiple formats."
  :url "https://github.com/Wall-Brew-Co/common-beer-format"
  :license {:name         "MIT"
            :url          "https://opensource.org/licenses/MIT"
            :distribution :repo
            :comments     "Same-as all Wall-Brew projects"}
  :scm {:name "git"
        :url  "https://github.com/Wall-Brew-Co/common-beer-format"}
  :pom-addition [:organization
                 [:name "Wall Brew Co."]
                 [:url "https://wallbrew.com"]]
  :dependencies [[metosin/spec-tools "0.10.7"]
                 [nnichols/nnichols "1.1.0"]
                 [org.clojure/clojure "1.12.0"]
                 [org.clojure/clojurescript "1.11.132" :scope "provided"]]
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2024.08.29"]
             [com.wallbrew/bouncer "1.0.0"]
            [com.wallbrew/lein-sealog "1.6.0"]
            [lein-cljsbuild/lein-cljsbuild "1.1.8"]
            [mvxcvi/cljstyle "0.16.630"]]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[com.wallbrew/clj-xml "1.9.1"]
                                      [com.wallbrew/spoon "1.2.3"]
                                      [doo/doo "0.1.11"]
                                      [org.clojure/data.json "2.5.0"]]
                       :plugins      [[lein-doo/lein-doo "0.1.11"]]}
             :export  {:source-paths ["src" "dev"]}}
  :deploy-branches ["master"]
  :deploy-repositories [["clojars" {:url           "https://clojars.org/repo"
                                    :username      :env/clojars_user
                                    :password      :env/clojars_pass
                                    :sign-releases false}]]

  :min-lein-version "2.5.3"

  :aliases {"test-build"   ["do" "clean" ["cljsbuild" "once" "test"] ["doo" "once"] ["test"]]
            "export-specs" ["with-profile" "export" "run" "-m" "common-beer-format.spec-export/render-specs!"]}

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
