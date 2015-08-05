(ns gilded-rose.core)

(defn item [sellin quality]
  {:sellin sellin
   :quality quality})

(item 1 2)

(defn age-one-day [item]
  item)
