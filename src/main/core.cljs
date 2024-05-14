(ns core
      (:require [applied-science.js-interop :as j]
                [reagent.dom :as rdom]))


(goog-define assets-url "")

(defn website
      []
      [:div {:style {:width "100%"
                     :height "100%"
                     :display "flex"}}
       [:div {:id "sidebar"
              :style {:width "300px"
                      :min-width "300px"
                      :height "100%"
                      :display "flex"
                      :background-color "#1c1d18"}}
        [:div {:style {:display "flex"
                       :min-width "0px"
                       :flex "1 1 auto"
                       :flex-direction "column"
                       :overflow "hidden"}}
         [:div {:style {:display "flex"
                        :width "100%"
                        :height "150px"}}
          [:h2 {:style {:margin "auto"
                        :font-size "3rem"}}
           [:span
            [:img {:src (str assets-url "images/logo.png")
                   :style {:height "3rem"
                           :margin-bottom "-0.3rem"}}]]
           "htanglitza"]]
         [:div {:style {:display "flex"
                        :flex "1 1 auto"
                        :flex-direction "column"
                        :justify-content "center"
                        :align-items "center"}}
          [:div {:class "menu-item"}
           [:a {:on-click (fn []
                            (j/call
                              (j/call js/document :getElementById "welcome")
                              :scrollIntoView
                              #js{:behavior "smooth"}))}
            [:h2 {:id "menu-welcome"} "WELCOME"]]]
          [:div {:class "menu-item"}
           [:a {:on-click (fn []
                            (j/call
                              (j/call js/document :getElementById "expertise")
                              :scrollIntoView
                              #js{:behavior "smooth"}))}
            [:h2 {:id "menu-expertise"} "EXPERTISE"]]]
          [:div {:class "menu-item"}
           [:a {:on-click (fn []
                            (j/call
                              (j/call js/document :getElementById "contact")
                              :scrollIntoView
                              #js{:behavior "smooth"}))}
            [:h2 {:id "menu-contact"} "CONTACT"]]]]
         [:div {:style {:display "flex"
                        :width "100%"
                        :height "200px"
                        :flex-direction "column"
                        :justify-content "center"
                        :align-items "center"}}
          [:div {:style {:display "flex"
                         :flex-direction "row"
                         :justify-content "center"
                         :align-items "center"
                         :margin "3px"}}
           [:div {:style {:display "flex"
                          :flex-direction "row"
                          :align-items "center"}}
            [:a {:class "linked-in"
                 :href "https://www.linkedin.com/in/vladimir-mladenovi%C4%87-b8b8aa2b/"
                 :target "_blank"
                 :style {:margin-left "5px"
                         :margin-right "5px"}}
             [:img {:src (str assets-url "images/linkedin.svg")}]]
            [:a {:class "google-maps"
                 :href "https://maps.google.com/maps?q=42.997914940760104,21.946745015285675"
                 :target "_blank"
                 :style {:margin-left "5px"
                         :margin-right "5px"}}
             [:img {:src (str assets-url "images/maps.svg")}]]]]
          [:a {:href "mailto:shtanglitza@gmail.com"
               :target "_blank"
               :style {:margin-left "5px"
                       :margin-right "5px"
                       :display "flex"
                       :flex-direction "row"
                       :justify-content "center"
                       :align-items "center"
                       :margin "3px"}}
           [:img {:src (str assets-url "images/email.svg")}]
           [:span "shtanglitza@gmail.com"]]]]]
       [:div {:style {:display "flex"
                      :flex "1 1 auto"
                      :background-color "#8f7e60"
                      :height "100vh"
                      :overflow-y "auto"}}
        [:div {:style {:width "100%"
                       :height "100vh"
                       :background-color "#1c1d18"}}
         [:div {:id "welcome"
                :style {:display "flex"
                        :width "100%"
                        :height "60vh"
                        :background-color "#1c1d18"
                        :border-left "2px solid #8f7e60"}}
          [:p {:style {:color "#8f7e60"
                       :width "100%"
                       :font-size "6rem"
                       :text-align "center"
                       :padding "2rem"
                       :padding-top "10rem"}}
           "Welcome to "
           [:span [:img {:src (str assets-url "images/logo.png")
                         :style {:height "6rem"
                                 :margin-bottom "-0.6rem"}}]]
           "htanglitza"]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"}}
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Unlock the potential of biomedical data with Shtanglitza – revolutionizing ontologies, data integration, and knowledge graphs to fuel innovation and drive informed decision-making."]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"}
                :id "test-1"}
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "We are a dedicated team of experts focused on empowering the biomedical domain through ontologies, data integration, harmonization, analysis, and knowledge graphs. With our small but highly skilled engineering team, we offer tailored solutions to enhance data organization, uncover hidden insights, and drive informed decision-making."]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"}}
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our capabilities include custom ontology development, seamless data integration, intuitive knowledge graph construction, advanced data analysis, efficient semantic querying, and bespoke application development. We are committed to ensuring data security and compliance with relevant regulations, such as HIPAA and GDPR."]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"}
                :id "test-1"}
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Experience the difference with Sgtanglitza as we help you unlock the true potential of your biomedical data. Discover innovative solutions designed to streamline your workflows, improve collaboration, and boost productivity. Get started today with personalized training and support from our expert team. Together, let's revolutionize the way you harness the power of biomedical data!"]]
         [:div {:id "expertise"
                :style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "30vh"}}
          [:h2 {:style {:color "#1c1d18"
                        :text-align "center"
                        :font-size "3rem"
                        :font-weight 500
                        :width "100%"}}
           "EXPERTISE"]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#8f7e60"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Ontology Development and Management"]
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our expert small engineering team creates, maintains, and updates custom ontologies tailored to the biomedical domain, ensuring accurate representation of domain knowledge for efficient data organization, integration, and retrieval."]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#1c1d18"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Data Integration and Harmonization"]
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "We offer bespoke data integration and harmonization solutions, combining and refining disparate biomedical data sources into a unified, consistent, and easily-accessible format. Our skilled team ensures improved data quality and seamless information exchange."]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#8f7e60"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Knowledge Graph Construction and Visualization"]
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our team builds tailored knowledge graphs representing complex biomedical data as interconnected nodes and edges, enabling intuitive data exploration and the discovery of hidden relationships and insights for informed decision-making."]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#1c1d18"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Data Analysis and Insights"]
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our engineers employ advanced statistical and machine learning methods to uncover hidden patterns, trends, and correlations in biomedical data, providing valuable insights that drive research, innovation, and informed decision-making in the biomedical domain."]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#8f7e60"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Semantic Data Querying and Retrieval"]
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "We develop custom solutions for efficient and precise querying of biomedical data, allowing users to easily search, retrieve, and filter information using natural language queries and ensuring quick access to relevant data and insights."]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#1c1d18"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Data Security and Compliance"]
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our team prioritizes data security and adheres to industry best practices and regulatory standards, ensuring the protection of sensitive biomedical data while maintaining compliance with relevant data privacy regulations, such as HIPAA and GDPR."]]
         [:div {:style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "60vh"
                        :border-left "2px solid #8f7e60"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#8f7e60"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Custom Biomedical Application Development"]
          [:p {:style {:color "#8f7e60"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "We offer tailored application development services, collaborating closely with you to design, develop, and deploy applications that streamline biomedical workflows, improve collaboration, and boost productivity within the domain."]]
         [:div {:style {:display "flex"
                        :background-color "#8f7e60"
                        :padding "5rem"
                        :height "60vh"
                        :flex-direction "column"}}
          [:h3 {:style {:color "#1c1d18"
                        :text-align "center"
                        :padding "2.5rem"
                        :padding-bottom 0
                        :font-size "2.5rem"
                        :font-weight 500}}
           "Personalized Training and Support"]
          [:p {:style {:color "#1c1d18"
                       :text-align "center"
                       :padding "2rem"
                       :font-size "2rem"}}
           "Our engineering team provides comprehensive training and ongoing support to help you make the most of our solutions. We offer personalized guidance, hands-on workshops, and technical assistance, ensuring your team can confidently navigate and utilize our data integration, analysis, and visualization tools."]]
         [:div {:id "contact"
                :style {:display "flex"
                        :background-color "#1c1d18"
                        :padding "5rem"
                        :height "30vh"
                        :border-left "2px solid #8f7e60"}}
          [:h2 {:style {:color "#8f7e60"
                        :text-align "center"
                        :font-size "3rem"
                        :font-weight 500
                        :width "100%"}}
           "CONTACT"]]
         [:div {:style {:display "flex"
                        :width "100%"
                        :height "40vh"
                        :flex-direction "column"
                        :justify-content "center"
                        :align-items "center"}}
          [:div {:style {:display "flex"
                         :flex-direction "row"
                         :justify-content "center"
                         :align-items "center"
                         :margin "3px"}}
           [:div {:style {:display "flex"
                          :flex-direction "row"
                          :align-items "center"}}
            [:a {:class "linked-in"
                 :href "https://www.linkedin.com/in/vladimir-mladenovi%C4%87-b8b8aa2b/"
                 :target "_blank"
                 :style {:margin-left "5px"
                         :margin-right "5px"}}
             [:img {:src (str assets-url "images/linkedin-b.svg")}]]
            [:a {:class "google-maps"
                 :href "https://maps.google.com/maps?q=42.997914940760104,21.946745015285675"
                 :target "_blank"
                 :style {:margin-left "5px"
                         :margin-right "5px"}}
             [:img {:src (str assets-url "images/maps-b.svg")}]]]]
          [:a {:href "mailto:shtanglitza@gmail.com"
               :target "_blank"
               :style {:margin-left "5px"
                       :margin-right "5px"
                       :display "flex"
                       :flex-direction "row"
                       :justify-content "center"
                       :align-items "center"
                       :margin "3px"}}
           [:img {:src (str assets-url "images/email-b.svg")}]
           [:span {:style {:color "#1c1d18"}} "shtanglitza@gmail.com"]]]]]])

(defn ^:export render
      []
      (rdom/render [website]
                   (js/document.getElementById "app")))

(defn ^:dev/after-load start []
      (js/console.log "start")
      (render))

(defn init []
      (js/console.log "init")
      (start))