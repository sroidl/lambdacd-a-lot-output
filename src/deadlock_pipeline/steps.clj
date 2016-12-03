(ns deadlock-pipeline.steps
  (:require [lambdacd.steps.shell :as shell]
            [lambdacd.steps.support]))

(defn print-1000-lines-at-once [args {home-dir :home-dir :as ctx}]
  (shell/bash ctx home-dir "cd resources; ./variant-a.sh"))
