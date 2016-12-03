# deadlock-pipeline

A LambdaCD pipeline targeted to generate a lot of output. In certain Lambda versions this can cause
a deadlock. This repo is used to tweak settings to avoid those deadlocks.


## Usage

* `lein run` will start your pipeline with a web-ui listening on port 8080
* configure `:step-updates-per-sec` in core.clj 