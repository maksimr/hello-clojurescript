(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-clojurescript.core
   :output-to "out/hello_clojurescript.js"
   :output-dir "out"})
