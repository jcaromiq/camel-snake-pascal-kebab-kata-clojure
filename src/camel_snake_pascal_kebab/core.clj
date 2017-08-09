(ns camel-snake-pascal-kebab.core
  (:gen-class))



(defn to-camel-case [text]
      (let [words (clojure.string/split (name text) #"-")
            first-word (first words)
            rest-words (rest words)
            rest-words-formatted (apply str (map clojure.string/capitalize rest-words))]
           (keyword (str
                      first-word
                      rest-words-formatted))))
(defn to-pascal-case [text]
      (let [words (clojure.string/split (name text) #"-")
            words-formatted (apply str (map format-word words))]
           (keyword words-formatted))
      )

(defn format
      [input _ format-to]
      (if (= format-to :camel-case)
        (to-camel-case input)
        (if (= format-to :pascal-case)
          (to-pascal-case input)
          :hello_koko)))
