(defproject selmer-test/parent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [selmer "1.11.8"]
                 [selmer-test/child "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot parent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
