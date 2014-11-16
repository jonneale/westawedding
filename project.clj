(defproject westawedding "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure     "1.2.1"]
                 [ring          "1.3.1"]]
  :plugins [[lein-ring "0.7.0"]]
  :min-lein-version "2.0.0"
  :ring    {:handler westawedding.handler/app
            :port 3007}
  :main    westawedding.main
  :profiles {:uberjar {:aot :all}})
