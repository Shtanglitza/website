(ns website.html
  (:require [hiccup.core :as h]))

(defn back-button [page]
  [:div {:class "buttons"}
   [:div {:class "button"}
    [:a {:class "button-link" :data-in-proj-no (str page)}
     [:div {:class "button-img-wrap"}
      [:div {:class "button-back-arrow"}]]]]])

(defn menu-item [data-no classes span-l h3 span-r]
  [:div {:class "menu-item-wrap"}
   [:div {:class "menu-item"}
    [:a {:data-no (str data-no) :class classes}
     [:span {:class "span-l"} span-l]
     [:h3 h3]
     [:span {:class "span-r"} span-r]]]])

(defn project-item [data-proj span-l h3 span-r p-1 p-2]
  [:div {:class "projects-item"}
   [:a {:class "projects-item-link projects-item-link-as-menu" :data-proj (str data-proj)}
    [:div {:class "projects-item-left"}
     [:span {:class "projects-item-left-left-span"} span-l]
     [:h3 {:class "projects-item-left-h3"} h3]
     [:span {:class "projects-item-left-right-span"} span-r]]
    [:div {:class "projects-item-right"}
     [:p {:class "projects-item-right-top"} p-1]
     [:p {:class "projects-item-right-bottom"} p-2]]]])

(defn project-item-as-header [span-l h3 span-r p-1 p-2 button rest-of-page]
  [:div {:class "projects-item"}
   button
   [:a {:class "projects-item-link"}
    [:div {:class "projects-item-left"}
     [:span {:class "projects-item-left-left-span"} span-l]
     [:h3 {:class "projects-item-left-h3"} h3]
     [:span {:class "projects-item-left-right-span"} span-r]]
    [:div {:class "projects-item-right"}
     [:p {:class "projects-item-right-top"} p-1]
     [:p {:class "projects-item-right-bottom"} p-2]]]
   rest-of-page])

(defn render-html []
  (h/html
    [:html {:lang "en"}
     [:head
      [:title "Shtanglitza"]
      [:meta {:charset "utf-8"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
      [:link {:rel "stylesheet" :href "./css/style.css"}]
      [:link {:href "https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" :rel "stylesheet" :integrity "sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" :crossorigin "anonymous"}]]
     [:body
      [:div {:class "container-fluid"}
       [:div {:class "row justify-content-evenly"}
        [:div {:class "col-xl-4 col-12 menu"}
         (menu-item 1 "selected menu-item-link" "01" "shtanglitza" "d.o.o.")
         (menu-item 2 "menu-item-link" "02" "expertise" "used")
         ;(menu-item 3 "menu-item-link" "03" "projects" "finished")
         (menu-item 4 "menu-item-link" "03" "team" "members")]
        [:div {:class "col-xl-8 col-12 main-item" :id "desc" :data-page-no "1"}
         [:div {:class "desc"}
          [:div {:class "desc-container"}
           [:div {:class "desc-item-top"}
            [:div {:class "desc-item-top-left"}
             [:h1 {:class "desc-item-top-left-h1"} "we are..."]]
            [:div {:class "desc-item-top-right"}
             [:p {:class "desc-item-top-right-top"} "...becoming..."]
             [:p {:class "desc-item-top-right-bottom"} "...something something something"]]]
           [:div {:class "desc-item-bottom"}
            [:div {:class "desc-item-bottom-item"}
             [:div {:class "desc-1"}
              [:h2 {:class "desc-1-h2"}
               "01 - Something"]
              [:p {:class "desc-1-p"}
               "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
               ]]]]]]]
        [:div {:class "col-xl-8 col-12 main-item" :id "desc" :data-page-no "2"}
         [:div {:class "desc"}
          [:div {:class "desc-container"}
           [:div {:class "desc-item-top"}
            [:div {:class "desc-item-top-left"}
             [:h1 {:class "desc-item-top-left-h1"} "we are..."]]
            [:div {:class "desc-item-top-right"}
             [:p {:class "desc-item-top-right-top"} "...becoming..."]
             [:p {:class "desc-item-top-right-bottom"} "...something something something"]]]
           [:div {:class "desc-item-bottom"}
            [:div {:class "desc-item-bottom-item"}
             [:div {:class "desc-1"}
              [:h2 {:class "desc-1-h2"}
               "02 - Something"]
              [:p {:class "desc-1-p"}
               "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
               ]]]]]]]
        [:div {:class "col-xl-8 col-12 main-item" :id "desc" :data-page-no "4"}
         [:div {:class "desc"}
          [:div {:class "desc-container"}
           [:div {:class "desc-item-top"}
            [:div {:class "desc-item-top-left"}
             [:h1 {:class "desc-item-top-left-h1"} "we are..."]]
            [:div {:class "desc-item-top-right"}
             [:p {:class "desc-item-top-right-top"} "...becoming..."]
             [:p {:class "desc-item-top-right-bottom"} "...something something something"]]]
           [:div {:class "desc-item-bottom"}
            [:div {:class "desc-item-bottom-item"}
             [:div {:class "desc-1"}
              [:h2 {:class "desc-1-h2"}
               "03 - Something"]
              [:p {:class "desc-1-p"}
               "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
               ]]]]]]]]]]
     [:div {:id "loader-wrapper"}
      [:div {:id "loader"}]
      [:div {:class "loader-section section-left"}]
      [:div {:class "loader-section section-right"}]]
     [:script {:src "/website/out/main.js"}]]))

(defn write-html-to-file [file]
  (spit file (render-html)))

(defn write-to-index-html [& more]
  (write-html-to-file "./index.html"))

(comment (write-html-to-file "./index.html"))