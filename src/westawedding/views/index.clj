(ns westawedding.views.index
  (:require [westawedding.views.layout :as layout]))

(defn render
  []
  (layout/html-all
   {:body
    [:h1 "boom"]}))
