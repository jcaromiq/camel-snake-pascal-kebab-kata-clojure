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
            words-formatted (apply str (map clojure.string/capitalize words))]
           (keyword words-formatted)))

(defn to-snake-case
      [text]
      :hello_koko)

(def formats
  {:camel-case to-camel-case
   :pascal-case to-pascal-case
   :snake-case to-snake-case})

(defn format
      [input _ format-to]
      ((get formats format-to) input))
