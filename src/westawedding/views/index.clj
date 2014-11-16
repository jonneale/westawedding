(ns westawedding.views.index
  (:require [westawedding.views.layout :as layout]))

(defn render
  []
  (layout/html-all
   {:body
    [:div
     [:div.row
      [:div.span6
       [:h1
        [:blink
         "Luke and Maddy are getting married!"]]
       [:p "Stay tuned for more info"]]
      [:div.span6
       [:center
        [:img {:src "/img/test/yahooweek.gif"}]
        [:img {:src "/img/test/community.gif"}]
        [:img {:src "/img/test/webtrips.gif"}]
        [:img {:src "/img/test/hacker.gif"}]]]]
     [:div.row
      [:marquee
       [:div.hammers
        [:img {:src "/img/test/mchammer.gif"}]
        [:img {:src "/img/test/mchammer.gif"}]
        [:img {:src "/img/test/mchammer.gif"}]]]
      [:center
       [:img {:src "/img/test/ie_logo.gif"}]
       [:img {:src "/img/test/ns_logo.gif"}]
       [:img {:src "/img/test/noframes.gif"}]
       [:img {:src "/img/test/notepad.gif"}]]]]}))
