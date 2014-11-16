(ns westawedding.views.index
  (:require [westawedding.views.layout :as layout]))

(defn render
  []
  (layout/html-all
   {:body
    [:div.row
     [:div.span6
      [:h1
       [:blink
        "Luke and Maddy are getting married!"]]
      [:p "Stay tuned for more info"]
      [:marquee
       [:div.hammers
        [:img {:src "/img/test/mchammer.gif"}]
        [:img {:src "/img/test/mchammer.gif"}]
        [:img {:src "/img/test/mchammer.gif"}]]]]
     [:div.span6
      [:center
       [:img {:src "/img/test/yahooweek.gif"}]
       [:img {:src "/img/test/community.gif"}]
       [:img {:src "/img/test/webwalk.gif"}]
       [:img {:src "/img/test/webtrips.gif"}]]]]}))
