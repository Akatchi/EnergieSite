name := """energie_site"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  ws,
  specs2 % Test,
  "com.typesafe.play" %% "play-slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.1",
  "mysql" % "mysql-connector-java" % "5.1.34",
  "com.typesafe.slick" %% "slick-codegen" % "3.0.0-RC3",
  "com.typesafe.play" %% "anorm" % "2.4.0",
  "org.webjars" % "bootstrap" % "3.3.5",
  "org.webjars" % "jquery" % "2.1.4",
  "jp.t2v" %% "play2-auth"        % "0.14.1",
  "jp.t2v" %% "play2-auth-social" % "0.14.1", // for social login
  "jp.t2v" %% "play2-auth-test"   % "0.14.1" % "test"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
