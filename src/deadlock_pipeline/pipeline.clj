(ns deadlock-pipeline.pipeline
  (:use [lambdacd.steps.control-flow]
        [deadlock-pipeline.steps])
  (:require
    [lambdacd.steps.manualtrigger :as manualtrigger]))

(def pipeline-def
  `(
     ;manualtrigger/wait-for-manual-trigger
     (in-parallel
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj)

     (in-parallel
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj
       print-1000-lines-in-clj)
     ))

