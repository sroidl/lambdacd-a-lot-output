(ns deadlock-pipeline.steps
  (:require [lambdacd.steps.shell :as shell]))

(defn some-step-that-does-nothing [args ctx]
  {:status :success})

(defn some-step-that-echos-foo [args ctx]
  (shell/bash ctx "/" "echo foo"))

(defn some-step-that-echos-bar [args ctx]
  (shell/bash ctx "/" "echo bar"))

(defn some-failing-step [args ctx]
  (shell/bash ctx "/" "echo \"i am going to fail now...\"" "exit 1"))

(defn print-1000-lines-at-once [args ctx]
  (shell/bash ctx "/" "pwd"))

(defn print-1000-lines-with-delay [args ctx]
  (shell/bash ctx "/" "pwd")
  )