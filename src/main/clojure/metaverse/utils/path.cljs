(ns metaverse.utils.path
  (:require
    ["path" :as path]))


(defn join
  [& paths]
  (reduce
    (fn [acc v]
      (.join path acc v))
    paths))
