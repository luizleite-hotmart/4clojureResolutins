;(= __ (let [x 5] (+ 2 x)))
;let will assign 5 to 'x' after this will sum with '2' the result will be 7
(= 7 (let [x 5] (+ 2 x)))

;(= __ (let [x 3, y 10] (- y x)))
;let will assign 3 to 'x' and 10 for 'y'  after this will reduce y - x result equals 7
(= 7 (let [x 3, y 10] (- y x)))

;(= __ (let [x 21] (let [y 3] (/ x y))))
; let will assign 21 to 'x' and 3 to 'y'  after this will divide x/y result equals 7
(= 7 (let [x 21] (let [y 3] (/ x y))))

(= 7 7)