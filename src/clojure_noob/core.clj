(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  ; OPERATIONS
  ; This is how Clojure does operations, yeah weirdo
  ; (operator operand1 operand2 ... operandn)
  (+ 1 2 3) ; => 6
  (/ 60 12) ; => 5
  (- 33 3) ; => 30
  (* 4 5 5) ; => 100
  (str "Pupuru" "neko") ; => "Pupuruneko" (concatenates string)
)
