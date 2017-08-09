(ns camel-snake-pascal-kebab.core
  (:gen-class)
  (:require [clojure.string :as str]))


(defn to-camel-case
  [words]
  (let [rest-words (rest words)
        rest-words-formatted (apply str (map str/capitalize rest-words))]
    (keyword (str (first words) rest-words-formatted))))

(defn to-pascal-case
  [words]
  (keyword (apply str (map str/capitalize words))))

(defn to-snake-case
  [words]
  (keyword (str/join "_" words)))

(defn to-kebab-case
  [words]
  (keyword (str/join "-" (map str/lower-case words))))

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
        ((get formats format-to) words)))
