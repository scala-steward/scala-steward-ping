ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.rintcius"
ThisBuild / organizationName := "rintcius"

ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-ping",
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-core" % "3.0.6",
      "com.codecommit" %% "skolems" % "0.2.1",
      "com.dimafeng" %% "testcontainers-scala-core" % "0.39.7",
      "com.github.fs2-blobstore" %% "s3" % "0.9.4",
      "dev.optics" %% "monocle-core" % "3.0.0-RC2",
      "io.chrisdavenport" %% "cats-scalacheck" % "0.3.1",
      "io.chrisdavenport" %% "cormorant-fs2" % "0.5.0-M1",
      "io.chrisdavenport" %% "fuuid" % "0.8.0-M2",
      "io.chrisdavenport" %% "mapref" % "0.2.0-M2",
      "io.circe" %% "circe-generic" % "0.14.1",
      "io.circe" %% "circe-golden" % "0.3.0",
      "io.github.kirill5k" %% "mongo4cats-core" % "0.4.0",
      "is.cir" %% "ciris" % "2.2.0",
      "org.http4s" %% "http4s-server" % "1.0.0-M23",
      "org.scalameta" %% "munit" % "0.7.29",
      "org.scodec" %% "scodec-core" % "1.11.8",
      "org.scodec" %% "scodec-bits" % "1.1.29",
      "org.typelevel" %% "cats-core" % "2.6.1",
      "org.typelevel" %% "cats-effect" % "3.2.9",
      "org.typelevel" %% "cats-mtl" % "1.2.1",
      "org.typelevel" %% "cats-parse" % "0.3.4",
      "org.typelevel" %% "discipline-munit" % "1.0.9",
      "org.typelevel" %% "log4cats-core" % "2.1.1",
      "org.typelevel" %% "munit-cats-effect-3" % "1.0.6",
      "org.typelevel" %% "scalacheck-effect" % "1.0.3"
    )
  )
