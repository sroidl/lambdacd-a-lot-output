(ns deadlock-pipeline.steps
  (:require [lambdacd.steps.shell :as shell]
            [lambdacd.steps.support :as support]
            [clojure.core.async :as async :refer [go >!!]])
  )

(def bacon-ipsum "Bacon ipsum dolor amet meatloaf tongue flank biltong ground round. Sirloin venison sausage kielbasa andouille strip steak tri-tip. Meatloaf biltong capicola shoulder. Sausage shankle pancetta prosciutto porchetta short loin.\n\n")

(defn print-1000-lines-in-clj [args ctx]
  (let [out-ch (:result-channel ctx)]
    (support/capture-output ctx
                            (doseq [i (range 1 1000)]
                              (do
                                (println i ")" bacon-ipsum)
                                )))
    {:status :success}))

