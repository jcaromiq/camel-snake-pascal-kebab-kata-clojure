(ns camel-snake-pascal-kebab.core
  (:gen-class)
  (:require [clojure.string :as str]))


(defn to-camel-case
  [words]
  (str (first words) (str/join "" (map str/capitalize (rest words)))))

(defn to-pascal-case
  [words]
  (str/join "" (map str/capitalize words)))

(defn to-snake-case
  [words]
  (str/join "_" words))

(defn to-kebab-case
  [words]
  (str/join "-" (map str/lower-case words)))

(def formats
  {:camel-case to-camel-case
   :pascal-case to-pascal-case
   :snake-case to-snake-case
   :kebab-case to-kebab-case})

(defn split-words
  [input]
  (str/split (name input) #"-|_|(?=[A-Z])"))

(defn format
  [input _ format-to]
  (let [words (split-words input)]
    (keyword ((get formats format-to) words))))
