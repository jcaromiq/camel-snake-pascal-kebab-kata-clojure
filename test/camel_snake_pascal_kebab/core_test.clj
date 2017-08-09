(ns camel-snake-pascal-kebab.core-test
    (:require
      [midje.sweet :refer :all]
      [camel-snake-pascal-kebab.core :refer :all]))


(facts
  "converting in different cases"
  (fact
    "from kebab case"
    (format :hello-koko :using :camel-case) => :helloKoko
    (format :hello-koko-pepe :using :camel-case) => :helloKokoPepe
    (format :hello-pepe :using :camel-case) => :helloPepe
    )
  (fact
    "from kebab to snake case"
    (format :hello-koko :using :snake-case) => :hello_koko)
  (fact
    "from kebab to pascal case"
    (format :hello-koko :using :pascal-case) => :HelloKoko))
