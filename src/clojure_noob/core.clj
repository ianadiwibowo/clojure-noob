(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  ; DEBUGGING
  (println "Hello Pupuruneko!")

  ; OPERATIONS
  ; This is how Clojure does operations, yeah weirdo
  ; (operator operand1 operand2 ... operandn)
  (+ 1 2 3) ; => 6
  (/ 60 12) ; => 5
  (- 33 3) ; => 30
  (* 4 5 5) ; => 100
  (str "Pupuru" "neko") ; => "Pupuruneko" (concatenates string)

  ; IF
  ; (if condition-form
  ;   then-form
  ;   optional-else-form)
  (if true
    "Pupuruneko TRUE"
    "Pupuruneko FALSE") ; => "Pupuruneko TRUE"

  (if true
    "Pupuruneko TRUE") ; => "Pupuruneko TRUE"

  (if false
    "Pupuruneko TRUE"
    "Pupuruneko FALSE") ; => "Pupuruneko FALSE"

  ; `do` for multiple expressions
  (if  true
    (do
      (println "Success!")
      "Pupuruneko TRUE")
    (do
      (println "Failed!")
      "Pupuruneko FALSE"))

  ; WHEN
  ; Just like `if` but with `do`
  (when true
    (println "Success!")
    "Pupuruneko TRUE") ; => "Pupuruneko TRUE"

  ; NIL
  ; `nil` and `false` are falsey, everything else are truthy
  (nil? 7) ; => false
  (nil? nil) ; => true

  ; EQUALITY
  (= 1 1) ; => true
  (= nil nil) ; => true
  (= 6 7) ; => false

  (if (= 1 1)
    (println "Equal")
    (println "Not equal"))

  ; OR
  ; Returns the first truthy value, or the last value
  (or false true) ; => true
  (or false nil :pupuruneko 2) ; => :pupuruneko
  (or false) ; => false
  (or nil) ; => nil
  (or (= 1 1) (= 2 3)) ; => false (use this for `if` condition check)

  ; AND
  ; Returns the first false value, or the last value
  (and :tea :coffee) ; => :coffee
  (and :tea nil false) ; => nil

  ; VARIABLES
  (def cat-name "Lupita")
  (def cat-names ["Lupita" "Kupita" "Bupita" "Vito" "Rijong"]))
