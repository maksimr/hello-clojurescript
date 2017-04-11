(require
  '[cljs.build.api :as b]
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])

(b/build "src"
  {:main           'hello-clojurescript.core
   :output-to      "out/hello_clojurescript.js"
   :output-dir     "out"
   :browser-repl   true
   :parallel-build true
   :verbose        true})

(repl/repl (browser/repl-env)
  :output-dir "out")
