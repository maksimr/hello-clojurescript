(defproject hello-browser "0.1.0-SNAPSHOT"
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.473"]
                 ]

  :plugins [
            [lein-cljsbuild "1.1.5"]
            [lein-figwheel "0.5.9"]
            ]

  :cljsbuild {
              :builds [{:id "dev"
                        :source-paths ["src/cljs"]

                        ;; by default figwheel served resources/public directory
                        ;; https://github.com/bhauman/lein-figwheel/wiki/Configuration-Options
                        :figwheel {:heads-up-display false}

                        :compiler {:main "hello-browser.core"
                                   :asset-path "cljs/out"
                                   :output-dir "resources/public/cljs/out"
                                   :output-to "resources/public/cljs/main.js"}}]})
