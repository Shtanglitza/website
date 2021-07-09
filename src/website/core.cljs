(ns website.core
  (:require [goog.dom :as dom]
            [goog.dom.classlist :as dom-classlist]
            [goog.events :as events]
            [goog.fx.dom :as fx]))

(defn add-event [element e cb]
  (events/listen element (name e) cb))

(defn fadein [element]
  (let [anim (fx/Fade. element 0 1 500)]
    (. anim (play))))

(defn hide-all-elements [elements]
  (dom-classlist/add (first elements) "hidden")
  (dom-classlist/add (second elements) "hidden")
  ;(dom-classlist/add (second (rest elements)) "hidden")
  ;(dom-classlist/add (second (rest (rest elements))) "hidden")
  (dom-classlist/add (last elements) "hidden"))

(defn hide-all-projects [elements]
  (dom-classlist/add (first elements) "hidden")
  (dom-classlist/add (second elements) "hidden")
  (dom-classlist/add (last elements) "hidden"))

(defn highlight-menu [no]
  (let [elements (.getElementsByClassName js/document "menu-item-link")]
    (dom-classlist/remove (first elements) "selected")
    (dom-classlist/remove (second elements) "selected")
    (dom-classlist/remove (second (rest elements )) "selected")
    (dom-classlist/remove (last elements) "selected"))
  (dom-classlist/add
    (first
      (.querySelectorAll
        js/document
        (str ".menu-item-link[data-no='" no "']")))
    "selected"))

(defn open-page [no]
  (dom-classlist/remove (first (.querySelectorAll js/document (str ".main-item[data-page-no=\"" no "\"]"))) "hidden")
  (fadein (first (.querySelectorAll js/document (str ".main-item[data-page-no=\"" no "\"]")))))

(defn change-page [event]
  (let [no (.-no (.-dataset (.-currentTarget event)))]
    (hide-all-elements (.getElementsByClassName js/document "main-item"))
    ;(hide-all-projects (.getElementsByClassName js/document "main main-project"))
    (highlight-menu no)
    (open-page no)))

(defn show-proj [no]
  (dom-classlist/remove (first (.querySelectorAll js/document (str ".main[data-proj-no=\"" no "\"]"))) "hidden")
  (fadein (first (.querySelectorAll js/document (str ".main[data-proj-no=\"" no "\"]")))))

(defn change-proj [event]
  (let [no (.-proj (.-dataset (.-currentTarget event)))]
    (hide-all-elements (.getElementsByClassName js/document "main main-item"))
    ;(hide-all-projects (.getElementsByClassName js/document "main main-project"))
    (show-proj no)))

(defn back-from-proj [event]
  (let [no (.-inProjNo (.-dataset (.-currentTarget event)))]
    (hide-all-elements (.getElementsByClassName js/document "main main-item"))
    ;(hide-all-projects (.getElementsByClassName js/document "main main-project"))
    (highlight-menu no)
    (open-page no)))

(let [menu-items (.getElementsByClassName js/document "menu-item-link")
      project-items (.getElementsByClassName js/document "projects-item-link-as-menu")
      project-back-buttons (.getElementsByClassName js/document "button-link")]
  (add-event (first menu-items) (.-CLICK events/EventType) change-page)
  (add-event (second menu-items) (.-CLICK events/EventType) change-page)
  (add-event (second (rest menu-items)) (.-CLICK events/EventType) change-page)
  (add-event (last menu-items) (.-CLICK events/EventType) change-page)

  ;(add-event (first project-items) (.-CLICK events/EventType) change-proj)
  ;(add-event (second project-items) (.-CLICK events/EventType) change-proj)
  ;(add-event (last project-items) (.-CLICK events/EventType) change-proj)
  ;
  ;(add-event (first project-back-buttons) (.-CLICK events/EventType) back-from-proj)
  ;(add-event (second project-back-buttons) (.-CLICK events/EventType) back-from-proj)
  ;(add-event (last project-back-buttons) (.-CLICK events/EventType) back-from-proj)
  )

(dom-classlist/add (first (.getElementsByTagName js/document "body")) "loaded")
