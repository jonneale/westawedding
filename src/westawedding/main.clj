(ns westawedding.main
  (:require [westawedding.handler :as api]
            [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn -main [& args]
  (jetty/run-jetty api/app {:port 3021 :join? true}))
