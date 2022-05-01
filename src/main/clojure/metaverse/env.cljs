(ns metaverse.env
  (:require
    [cljs.reader :as reader]
    [clojure.string :as str])
  (:require-macros
    [metaverse.utils.resource :as resource]))


(goog-define company-name "@io.lazy-cat")
(goog-define product-name "metaverse")

(goog-define mode "production")
(goog-define version "N/A")
(goog-define build-number "N/A")
(goog-define build-timestamp "N/A")
(goog-define git-url "N/A")
(goog-define git-branch "N/A")
(goog-define git-sha "N/A")
(goog-define logger-level "error")
(goog-define default-language "en")

(goog-define sentry-dsn "N/A")

(goog-define supabase-url "N/A")
(goog-define supabase-public-key "N/A")


(def build-info
  (->> "io/lazy-cat/metaverse/build.edn"
       (resource/slurp)
       (reader/read-string)))


(def develop?
  (= "develop" (str/lower-case mode)))


(def production?
  (= "production" (str/lower-case mode)))
