 (defn my-join [lst seprator] 
   (if (<= (count lst) 1) 
     (str (first lst)) 
   	(str (first lst) seprator (my-join (rest lst) seprator))))
