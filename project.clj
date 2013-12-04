(defproject clj-axis "0.1.0-SNAPSHOT"
  :description "A little Axis Web Server"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [ring/ring-devel "1.2.1" :scope "test"]]
  :main clj-axis.core)
