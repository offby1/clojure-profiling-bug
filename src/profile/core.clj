(ns profile.core
  (:use [clojure.contrib.profile :only (profile)]))

(defn -main [& args]
  (profile
   (printf "OK, you got me!\n")))
