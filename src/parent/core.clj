(ns parent.core
  (:gen-class)
  (:require [child.core :as child]))

(defn parent
  []
  (child/output))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World Parent!")
  (println (parent)))
