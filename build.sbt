import sbt._
import sbt.Keys._

// format: off
scalaOrganization in ThisBuild := "org.scala-lang"
scalaVersion      in ThisBuild := "2.12.4"
conflictManager   in ThisBuild := ConflictManager.strict
// format: on

val sharedSettings = Seq( organization := "eu.epitech" )

val pathKataSettings =
  Defaults.coreDefaultSettings ++
    sharedSettings ++
    Scalac.settings ++
    Dependencies.settings :+
    (testOptions in Test += Tests.Argument( TestFrameworks.ScalaTest, "-oDF" ))

val `path-kata-core` = project
  .settings( pathKataSettings )
  .settings( SbtBuildInfo.buildSettings( "PathKataCoreBuildInfo" ) )
  .settings( Console.coreImports.settings )

val `path-kata` = project
  .in( file( "." ) )
  .settings( sharedSettings )
  .settings( Dependencies.overrides )
  .aggregate( `path-kata-core` )
