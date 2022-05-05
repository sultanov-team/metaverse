(ns metaverse.runner.sentry
  (:require
    ["@sentry/node" :as sentry]
    ["@sentry/tracing"]
    [metaverse.common.reporter :as reporter]))


(defn init!
  []
  (reporter/init! sentry))
