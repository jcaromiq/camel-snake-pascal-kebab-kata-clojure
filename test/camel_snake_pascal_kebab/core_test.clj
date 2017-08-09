(ns camel-snake-pascal-kebab.core-test
    (:require
      [midje.sweet :refer :all]
      [camel-snake-pascal-kebab.core :refer :all]))


(facts
  "converting in different cases"
  (fact
    "from kebab to camel case"
    (format :hello-koko :using :camel-case) => :helloKoko
    (format :hello-koko-pepe :using :camel-case) => :helloKokoPepe)

  (fact
    "from kebab to snake case"
    (format :hello-koko :using :snake-case) => :hello_koko
    (format :hello-koko-pepe :using :snake-case) => :hello_koko_pepe)

  (fact
    "from kebab to pascal case"
    (format :hello-koko :using :pascal-case) => :HelloKoko
    (format :hello-koko-pepe :using :pascal-case) => :HelloKokoPepe)

  (fact
    "from kebab to kebab case"
    (format :hello-koko :using :kebab-case) => :hello-koko
    (format :hello-koko-pepe :using :kebab-case) => :hello-koko-pepe)


  (fact
    "from camel to kebab case"
    (format :helloKoko :using :kebab-case) => :hello-koko
    (format :helloKokoPepe :using :kebab-case) => :hello-koko-pepe)

  (fact
    "from camel to snake case"
    (format :helloKoko :using :snake-case) => :hello_koko
    (format :helloKokoPepe :using :snake-case) => :hello_koko_pepe)

  (fact
    "from camel to pascal case"
    (format :helloKoko :using :pascal-case) => :HelloKoko
    (format :helloKokoPepe :using :pascal-case) => :HelloKokoPepe)

  (fact
    "from camel to camel case"
    (format :helloKoko :using :camel-case) => :helloKoko
    (format :helloKokoPepe :using :camel-case) => :helloKokoPepe)


  (fact
    "from snake to kebab case"
    (format :hello_koko :using :kebab-case) => :hello-koko
    (format :hello_koko_pepe :using :kebab-case) => :hello-koko-pepe)

  (fact
    "from snake to snake case"
    (format :hello_koko :using :snake-case) => :hello_koko
    (format :hello_koko_pepe :using :snake-case) => :hello_koko_pepe)

  (fact
    "from snake to pascal case"
    (format :hello_koko :using :pascal-case) => :HelloKoko
    (format :hello_koko_pepe :using :pascal-case) => :HelloKokoPepe)

  (fact
    "from snake to camel case"
    (format :hello_koko :using :camel-case) => :helloKoko
    (format :hello_koko_pepe :using :camel-case) => :helloKokoPepe)


  (fact
    "from pascal to kebab case"
    (format :HelloKoko :using :kebab-case) => :hello-koko
    (format :helloKokoPepe :using :kebab-case) => :hello-koko-pepe)

  (fact
    "from pascal to snake case"
    (format :HelloKoko :using :snake-case) => :hello_koko
    (format :helloKokoPepe :using :snake-case) => :hello_koko_pepe)

  (fact
    "from pascal to pascal case"
    (format :HelloKoko :using :pascal-case) => :HelloKoko
    (format :helloKokoPepe :using :pascal-case) => :HelloKokoPepe)

  (fact
    "from pascal to camel case"
    (format :HelloKoko :using :camel-case) => :helloKoko
    (format :helloKokoPepe :using :camel-case) => :helloKokoPepe))