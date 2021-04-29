(ns tres-game)

(use '[utils :only (empty-square process-move)])

(def board {:a {:owner 1 :count 3} :b empty-square :c empty-square
            :d empty-square :e empty-square :f empty-square
            :g empty-square :h empty-square :i {:owner 2 :count 3}})

(defn get-move []
  (println "Enter your move in the form <start><end><count> (e.g. \"ab3\"):")
  (process-move (read-line)))

(defn get-moves []
  (repeat 3 (get-move)))

(defn update-board [board team-one-moves team-two-moves]
  (print board))

(defn play [board]
  (let [team-one-moves (get-moves) team-two-moves (get-moves)]
    (update-board board team-one-moves team-two-moves)))

;; (play board)
