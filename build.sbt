ThisBuild / scalaVersion := "2.13.11"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.rintcius"
ThisBuild / organizationName := "rintcius"

ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-ping",
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-core" % "3.7.0",
      "com.codecommit" %% "skolems" % "0.2.1",
      "com.dimafeng" %% "testcontainers-scala-core" % "0.40.17",
      "com.github.fs2-blobstore" %% "s3" % "0.9.9",
      "dev.optics" %% "monocle-core" % "3.2.0",
      "io.chrisdavenport" %% "cats-scalacheck" % "0.3.2",
      "io.chrisdavenport" %% "cormorant-fs2" % "0.5.0-M1",
      "io.chrisdavenport" %% "fuuid" % "0.8.0-M2",
      "io.chrisdavenport" %% "mapref" % "0.2.1",
      "io.circe" %% "circe-generic" % "0.14.2",
      "io.circe" %% "circe-golden" % "0.3.0",
      "io.github.kirill5k" %% "mongo4cats-core" % "0.6.15",
      "is.cir" %% "ciris" % "3.2.0",
      "org.http4s" %% "http4s-server" % "1.0.0-M40",
      "org.scalameta" %% "munit" % "0.7.29",
      "org.scodec" %% "scodec-core" % "1.11.10",
      "org.scodec" %% "scodec-bits" % "1.1.37",
      "org.typelevel" %% "cats-core" % "2.9.0",
      "org.typelevel" %% "cats-effect" % "3.5.1",
      "org.typelevel" %% "cats-mtl" % "1.3.1",
      "org.typelevel" %% "cats-parse" % "0.3.10",
      "org.typelevel" %% "discipline-munit" % "1.0.9",
      "org.typelevel" %% "log4cats-core" % "2.6.0",
      "org.typelevel" %% "munit-cats-effect-3" % "1.0.7",
      "org.typelevel" %% "scalacheck-effect" % "1.0.4"
    )
  )
