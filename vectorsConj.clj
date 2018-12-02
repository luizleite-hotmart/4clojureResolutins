;; (= __ (conj [1 2 3] 4))
; conj will grab the second parameter '4' and will return a new vector with that result equals '1 2 3 4'
(= 1 2 3 4 (conj [1 2 3] 4))
