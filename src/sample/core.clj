(ns sample.core
  (:gen-class))

(load "core_redis")
(load "core_romans")

(defn greet
  [name age]
  (str "Hello, " name " your age in romans is " (your-age-in-romans age)))

(defn -main
  "main function"
  [& args]
  (println (greet "Pablo" 34)))
