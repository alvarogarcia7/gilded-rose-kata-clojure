(ns gilded-rose.core)

(defn item [sellin quality]
  {:sellin sellin
   :quality quality})

(def non-expired-item (item 1 2))

(defn age-one-day [it]
  (if (< (:sellin it) 0)
    (item (dec (:sellin it))
        (max (dec (dec (:quality it))) 0))
    (item (dec (:sellin it))
          (max (dec (:quality it)) 0))))

(age-one-day (age-one-day (item 1 2)))
(age-one-day (item 1 2))
(age-one-day (item 1 0))


(:sellin non-expired-item)
(:quality non-expired-item)


