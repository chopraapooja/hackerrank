;; Count the number of elements in an array without using count, size or length operators
(defn list-length [lst] 
  (reduce (fn [count ele] (inc count)) 0 lst))
