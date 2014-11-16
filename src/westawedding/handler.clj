(ns westawedding.handler
  (:use     [compojure.core])
  (:require [westawedding.views.index                                    :as index]
            [compojure.handler                                           :as handler]
            [compojure.route                                             :as route]))

(defroutes main-routes

  (GET "/"
       []
       (index/render))

  (route/resources "/"))

(def app
  (-> main-routes
      (handler/site)))
