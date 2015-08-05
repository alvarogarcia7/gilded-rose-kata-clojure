(defproject gilded-rose "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {  :uberjar {:aot :all}
               :dev {
                     :dependencies [[midje "1.6.3"]]
                     :plugins      [[lein-midje "3.1.3"]]
               }
            })
