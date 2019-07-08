(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(deftest greet-test
  (testing "Test Greetings"
    (is (= (greet "Pablo" 50) "Hello, Pablo your age in romans is L"))))

(deftest redis-test
  (testing "Redis Test"
    (is (= "PONG" (ping)))))
