(ns clj-axis.core
  (:use ring.adapter.jetty
        ring.middleware.reload
        ring.middleware.stacktrace)
  (:gen-class))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello from Ring !!!"})

(def app
  (-> #'handler
      (wrap-reload '(clj-axis.core))
      (wrap-stacktrace)))

(defn startServer
  []
  (run-jetty #'app {:port 8080}))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (startServer))
