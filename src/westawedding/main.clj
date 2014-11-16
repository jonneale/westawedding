(ns westawedding.main
  (:require [westawedding.handler :as api]
            [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn -main [& [port]]
  (let [port (Integer. (or port 5000))]
    (jetty/run-jetty #'api/app {:port port :join? false})))
