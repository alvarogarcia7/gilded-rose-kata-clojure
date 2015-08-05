(ns gilded-rose.core)

(defn item [sellin quality]
  {:sellin sellin
   :quality quality})

(def non-expired-item (item 1 2))

(defn age-one-day [it]
  (if (< (:sellin it) 0)
    (item (dec (:sellin it))
        (dec (dec (:quality it))))
    (item (dec (:sellin it))
          (dec (:quality it)))))

(age-one-day (age-one-day (item 1 2)))
(age-one-day (item 1 2))


(:sellin non-expired-item)
(:quality non-expired-item)


