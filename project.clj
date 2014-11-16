(defproject westawedding "0.1.0-SNAPSHOT"
  :description "Luke and Maddy's Wedding Site"
  :url "http://westawedding.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure     "1.2.1"]
                 [ring          "1.3.1"]
                 [environ       "0.5.0"]]
  :plugins [[lein-ring "0.7.0"]
            [environ/environ.lein "0.2.1"]]
  :min-lein-version "2.0.0"
  :hooks   [environ.leiningen.hooks]
  :ring    {:handler westawedding.handler/app
            :port 3007}
  :main    westawedding.main
  :uberjar-name "westawedding-standalone.jar"
  :profiles {:uberjar {:aot :all}})
