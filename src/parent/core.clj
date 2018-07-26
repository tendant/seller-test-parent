(ns parent.core
  (:gen-class)
  (:require [child.core :as child]
            [selmer.parser :as parser]
            [clojure.java.io :as io]))

;; (parser/set-resource-path! (io/resource "templates"))

(defn parent
  []
  (child/output))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World Parent!")
  (println (parent)))
