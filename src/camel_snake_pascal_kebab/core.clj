(ns camel-snake-pascal-kebab.core
  (:gen-class))


(defn to-camel-case [words]
      (let [rest-words (rest words)
            rest-words-formatted (apply str (map clojure.string/capitalize rest-words))]
           (keyword (str (first words) rest-words-formatted))))

(defn to-pascal-case [words]
      (let [words-formatted (apply str (map clojure.string/capitalize words))]
           (keyword words-formatted)))

(defn to-snake-case
  [words]
  (keyword (clojure.string/join "_" words)))

(def formats
  {:camel-case to-camel-case
   :pascal-case to-pascal-case
   :snake-case to-snake-case})

(defn format
  [input _ format-to]
  (let [words (clojure.string/split (name input) #"-")]
        ((get formats format-to) words)))
