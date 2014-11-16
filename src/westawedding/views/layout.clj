(ns westawedding.views.layout
  (:require [hiccup.core                :as hiccup]
            [hiccup.page                :as page]))

(defn html-all
  [{:keys [head body]}]
  (hiccup/html (page/doctype :html5)
               [:html
                `[:head
                  [:meta {:charset "utf-8"}]
                  [:title "Westawedding"]
                  [:meta
                   {:name "viewport",
                    :content "width=device-width, initial-scale=1.0"}]
                  ~@head]
                [:body
                 `[:div.container
                   [:h1 "Something here"]
                   ~@body]]]))
