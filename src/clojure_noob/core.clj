(ns clojure-noob.core
  (:gen-class))

(defn say-hello-to-cat
  "Say hello to the cat in the argument"
  [name type]
  (str "Hello, " name ". Super gemoi " type "!"))

;; Arity Overloading, in this case 1-arity and 2-arity
(defn pet
  "Pet the cat"
  ([name type]
   (str "Pet " name ", the " type))
  ([name]
   (pet name "normal cat")) ;; Can be used for default argument
  )

(defn -main
  "Main function -- entry point"
  [& args]

  ;; DEBUGGING
  (println "Hello Pupuruneko!")

  ;; OPERATIONS
  ;; This is how Clojure does operations, yeah weirdo
  ;; (operator operand1 operand2 ... operandn)
  (+ 1 2 3) ;; => 6
  (/ 60 12) ;; => 5
  (- 33 3) ;; => 30
  (* 4 5 5) ;; => 100
  (mod 10 9) ;; => 1
  (str "Pupuru" "neko") ;; => "Pupuruneko" ;; Concatenates string
  (first [5 8 9 1 0 4]) ;; => 5
  (last [5 8 9 1 0 4]) ;; => 4

  ;; IF
  ;; (if condition-form
  ;;   then-form
  ;;   optional-else-form)
  (if true
    "Pupuruneko TRUE"
    "Pupuruneko FALSE") ;; => "Pupuruneko TRUE"

  (if true
    "Pupuruneko TRUE") ;; => "Pupuruneko TRUE"

  (if false
    "Pupuruneko TRUE"
    "Pupuruneko FALSE") ;; => "Pupuruneko FALSE"

  ;; `do` for multiple expressions
  (if  true
    (do
      (println "Success!")
      "Pupuruneko TRUE")
    (do
      (println "Failed!")
      "Pupuruneko FALSE"))

  ;; WHEN
  ;; Just like `if` but with `do`
  (when true
    (println "Success!")
    "Pupuruneko TRUE") ;; => "Pupuruneko TRUE"

  ;; NIL
  ;; `nil` and `false` are falsey, everything else are truthy
  (nil? 7) ;; => false
  (nil? nil) ;; => true

  ;; EQUALITY
  (= 1 1) ;; => true
  (= nil nil) ;; => true
  (= 6 7) ;; => false

  (if (= 1 1)
    (println "Equal")
    (println "Not equal"))

  ;; OR
  ;; Returns the first truthy value, or the last value
  (or false true) ;; => true
  (or false nil :pupuruneko 2) ;; => :pupuruneko
  (or false) ;; => false
  (or nil) ;; => nil
  (or (= 1 1) (= 2 3)) ;; => false ;; Use this for `if` condition check

  ;; AND
  ;; Returns the first false value, or the last value
  (and :tea :coffee) ;; => :coffee
  (and :tea nil false) ;; => nil

  ;; VARIABLE
  (def cat-name "Lupita")
  (def cat-names ["Lupita" "Kupita" "Bupita" "Vito" "Rijong"])

  ;; HASHMAP
  {:first-cat "Lupita"
   :second-cat "Vito"
   :third-cat "Rijong"}

  {:cat {:name "Kupita" :type "Orange Cat"}} ;; Nested hashmap

  (hash-map :first-cat "Lupita"
            :second-cat "Vito"
            :third-cat "Rijong") ;; Or use `hash-map` operator

  (get {:a 0 :b 1} :b) ;; => 1 ;; hashmap retrieval, `nil` if not found
  (get {:a 0 :b 1} :c "Not Found") ;; Use default value if not found

  (get-in {:a 0 :b {:c "Inner Value"}} [:b :c]) ;; => "Inner Value"

  ({:a 77} :a) ;; => 77

  ;; VECTOR (ARRAY)
  [1 2 3]
  (vector "A" "B" "C")

  (get ["A" "B" "C"] 0) ;; => "A" ;; Retrieval by index)

  (conj [10 20 30] 40) ;; => [10 20 30 40] ;; Append

  ;; LIST
  ;; Vector, but stupid
  '(1 2 3 4)
  (nth '(1 2 3 4) 0) ;; => 1

  (conj '(10 20 30) 40) ;; => [40 10 20 30] ;; Prepend

  ;; SET
  ;; A collection of unique values
  #{"Taeka" 3 :yuen-jumbo}

  (hash-set 1 2 1 2 1 2) ;; => #{1 2} ;; Like uniq() in Ruby

  (conj #{1 2 3} 3) ;; => #{1 3 2} ;; Duplicate value will be distinct-ed

  (set [1 2 1 2 1 2]) ;; => #{1, 2} ;; Create set from existing vector

  (contains? #{:a :b :c} :c) ;; => true
  (contains? #{:a :b :c} :d) ;; => false

  (:a #{:a :b}) ;; => :a ;; Like, find if exists
  (get #{:a :b} :a) ;; => :a ;; Synonim
  (:c #{:a :b}) ;; => nil
  (get #{:a :b} :c) ;; => nil

  ;; FUNCTION

  ;; Since function is first-class citizen, it can be an argument
  ;; => #object[clojure.core$_PLUS_ 0x67ac2a24 "clojure.core$_PLUS_@67ac2a24"]
  (or + -) ;; `+` and `-` are functions too
  ((or + 1) 1 2 3) ;; => 6 ;; Because `+` is the result of the `or`

  ;; Higher-order functions: Functions that can either take a function
  ;; as an argument or return a function. Thus, Clojure supports
  ;; first-class functions
  (inc 1) ;; => 2
  (map inc [0 1 2 3 4]) ;; => (1 2 3 4 5)

  (dec 2) ;; => 1
  (map dec [0 1 2 3 4]) ;; => (-1 0 1 2 3)

  ;; Refer to `defn say-hello-to-cat` before `defn main`
  (say-hello-to-cat "Bupita" "Kucing Belang Tiga")
  ;; => Hello, Bupita. Super gemoi Kucing Belang Tiga!

  ;; Refer to `defn pet` before `defn main`
  (pet "Taeka" "Kucing Yuen Jumbo")
  ;; => Pet Taeka, the Kucing Yuen Jumbo

  (pet "Taeka")
  ;; => Pet Taeka, the normal cat
  )
