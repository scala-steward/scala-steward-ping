ThisBuild / scalaVersion := "2.13.16"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.rintcius"
ThisBuild / organizationName := "rintcius"

ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-ping",
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-core" % "3.12.0",
      "com.codecommit" %% "skolems" % "0.2.1",
      "com.dimafeng" %% "testcontainers-scala-core" % "0.43.0",
      "com.github.fs2-blobstore" %% "s3" % "0.9.15",
      "dev.optics" %% "monocle-core" % "3.3.0",
      "io.chrisdavenport" %% "cats-scalacheck" % "0.3.2",
      "io.chrisdavenport" %% "cormorant-fs2" % "0.5.0-M1",
      "io.chrisdavenport" %% "fuuid" % "0.8.0-M2",
      "io.chrisdavenport" %% "mapref" % "0.2.1",
      "io.circe" %% "circe-generic" % "0.14.14",
      "io.circe" %% "circe-golden" % "0.5.1",
      "io.github.kirill5k" %% "mongo4cats-core" % "0.7.13",
      "is.cir" %% "ciris" % "3.9.0",
      "org.http4s" %% "http4s-server" % "1.0.0-M44",
      "org.scalameta" %% "munit" % "1.1.1",
      "org.scodec" %% "scodec-core" % "1.11.11",
      "org.scodec" %% "scodec-bits" % "1.2.4",
      "org.typelevel" %% "cats-core" % "2.13.0",
      "org.typelevel" %% "cats-effect" % "3.6.3",
      "org.typelevel" %% "cats-mtl" % "1.5.0",
      "org.typelevel" %% "cats-parse" % "1.1.0",
      "org.typelevel" %% "discipline-munit" % "2.0.0",
      "org.typelevel" %% "log4cats-core" % "2.7.1",
      "org.typelevel" %% "munit-cats-effect" % "2.1.0",
      "org.typelevel" %% "scalacheck-effect" % "1.0.4"
    )
  )
