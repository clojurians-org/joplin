(defproject joplin.dynamodb "0.3.5-SNAPSHOT"
  :description "AWS Dynamodb support for Joplin"
  :url "http://github.com/juxt/joplin"
  :scm {:name "git"
        :url "https://github.com/juxt/joplin"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [joplin.core "0.3.5-SNAPSHOT"]
                 [com.taoensso/faraday "1.8.0"]])
