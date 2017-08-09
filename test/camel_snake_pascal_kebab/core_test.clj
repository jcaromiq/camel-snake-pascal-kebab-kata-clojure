(ns camel-snake-pascal-kebab.core-test
    (:require
      [midje.sweet :refer :all]
      [camel-snake-pascal-kebab.core :refer :all]))


(facts
  "converting in different cases"
  (fact
    "from kebab to camel case"
    (format :hello-koko :using :camel-case) => :helloKoko
    (format :hello-koko-pepe :using :camel-case) => :helloKokoPepe
    (format :hello-pepe :using :camel-case) => :helloPepe)

  (fact
    "from kebab to snake case"
    (format :hello-koko :using :snake-case) => :hello_koko
    (format :hello-koko-pepe :using :snake-case) => :hello_koko_pepe)

  (fact
    "from kebab to kebab case"
    (format :hello-koko :using :kebab-case) => :hello-koko
    (format :hello-koko-pepe :using :kebab-case) => :hello-koko-pepe)

  (fact
    "from camel to kebab case"
    (format :helloKoko :using :kebab-case) => :hello-koko))