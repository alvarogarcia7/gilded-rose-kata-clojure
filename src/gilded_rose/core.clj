(ns gilded-rose.core)

(defn item [name sellin quality]
  {:sellin sellin
   :quality quality
   :name name})

(def non-expired-item (item "normal" 1 2))

(defn age-one-day [it]
  (if (< (:sellin it) 0)
    (item (:name it)
          (dec (:sellin it))
          (if (= "Aged Brie" (:name it))
            (min (inc (inc (:quality it))) 50)
            (if (= "Sulfuras" (:name it))
              (:quality it)
              (max (dec (dec (:quality it))) 0))))
    (item (:name it)
          (dec (:sellin it))
          (if (= "Aged Brie" (:name it))
            (min (inc (:quality it)) 50)
            (if (= "Sulfuras" (:name it))
              (:quality it)
              (max (dec (:quality it)) 0))))))

(age-one-day (age-one-day (item "a" 1 2)))
(age-one-day (item "a" 1 2))
(age-one-day (item "a" 1 0))
(age-one-day (age-one-day (age-one-day (item "Aged Brie" 1 0))))
(age-one-day (item "Aged Brie" 10 50))
(age-one-day (item "Sulfuras" -1 1))

(:sellin non-expired-item)
(:quality non-expired-item)


