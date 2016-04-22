name := """paper"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
   "com.typesafe.play" %% "play-slick" % "0.8.0",
    "com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0",
  "mysql" % "mysql-connector-java" % "5.1.32",
   "joda-time" % "joda-time" % "2.3",
  "org.joda" % "joda-convert" % "1.6",
   "org.mindrot" % "jbcrypt" % "0.3m"
)

//resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
//routesGenerator := InjectedRoutesGenerator
