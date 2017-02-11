(defproject hello-browser "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.473"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :cljsbuild {
              :builds [{:source-paths ["src/cljs"]
                        :compiler {
                                   :main "hello-browser.core"
                                   :output-to "public/core.js"}}]})
