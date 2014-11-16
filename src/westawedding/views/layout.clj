(ns westawedding.views.layout
  (:require [hiccup.core                :as hiccup]
            [hiccup.page                :as page]))

(defn html-all
  [{:keys [head body]}]
  (hiccup/html (page/doctype :html5)
               [:html
                [:head
                 [:meta {:charset "utf-8"}]
                 [:title "Westawedding"]
                 [:link
                  {:href "/stylesheets/bootstrap.min.css",
                   :media "screen",
                   :rel "stylesheet"}]
                 [:script {:src "/javascripts/jquery-2.0.3.min.js"}]
                 [:script {:src "/javascripts/bootstrap.min.js"}]
                 [:meta
                  {:name "viewport",
                   :content "width=device-width, initial-scale=1.0"}]
                 head]
                [:body
                 [:div.navbar.navbar-fixed-top
                  [:div.navbar-inner
                   [:div.container
                    [:ul.nav
                     [:li "Search with Alta Vista"]]]]]
                 [:div.container {:style "margin-top: 60px;"}
                  [:embed {:src "/sound/three-non-blondes.wav" :autostart "true" :hidden "true" :loop "true"}]
                  body]]]))
