import scalariform.formatter.preferences._

name := "nghia_dt_bbs_backend"

version := "1.0"

lazy val `nghia_dt_bbs_backend` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.12.2"

unmanagedResourceDirectories in Test += baseDirectory(_ / "target/web/public/test").value

libraryDependencies ++= Seq(
  evolutions, ehcache, ws, specs2 % Test, guice,
  "mysql" % "mysql-connector-java" % "8.0.22",
  //  "com.typesafe.play"     %% "play-json"                    % "2.9.1",
  "org.scalikejdbc" %% "scalikejdbc-play-initializer" % "2.8.0-scalikejdbc-3.5",
  "org.skinny-framework" %% "skinny-orm" % "3.0.3",
  "org.skinny-framework" %% "skinny-task" % "3.0.3",
  "ch.qos.logback" % "logback-classic" % "1.1.+"
)

libraryDependencies ++= Seq(evolutions, guice, ehcache, ws, jdbc, specs2 % Test)
//libraryDependencies ++= Seq(guice, jdbc, evolutions)

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  //Scala Guice
  "net.codingwell" %% "scala-guice" % "4.2.6",
  "org.json4s" %% "json4s-jackson" % "3.6.7"
)

//
//
//scalariformPreferences := scalariformPreferences.value
//  .setPreference(AlignSingleLineCaseStatements, true)
//  .setPreference(DoubleIndentConstructorArguments, true)
//  .setPreference(DanglingCloseParenthesis, Preserve)




