(ns deadlock-pipeline.pipeline
  (:use [lambdacd.steps.control-flow]
        [deadlock-pipeline.steps])
  (:require
    [lambdacd.steps.manualtrigger :as manualtrigger]))

(def pipeline-def
  `(
     print-1000-lines-at-once
     print-1000-lines-with-delay
     ))
