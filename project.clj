(defproject sql-datomic "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [instaparse "1.4.2"]
                 [clj-time "0.12.0"]
                 [com.datomic/datomic-pro "0.9.5206" :exclusions [joda-time]]
                 [com.stuartsierra/component "0.3.1"]
                 [org.clojure/tools.cli "0.3.5"]
                 [org.postgresql/postgresql "9.4.1208.jre7"]
                 [com.datastax.cassandra/cassandra-driver-core "2.0.6"
                  :exclusions [com.google.guava/guava
                               org.slf4j/slf4j-api]]]
  :repositories
  [["releases" "https://artifacts.buehner-fry.com/artifactory/release"]]
  :main sql-datomic.repl
  :aot [sql-datomic.repl])
