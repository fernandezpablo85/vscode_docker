(ns sample.core
  (:require [taoensso.carmine :as car :refer (wcar)]))

(def conn {:pool {} :spec {:uri "redis://redis:6379"}})

(defmacro wcar* [& body] `(car/wcar conn ~@body))

(defn ping
  []
  (wcar* (car/ping)))
