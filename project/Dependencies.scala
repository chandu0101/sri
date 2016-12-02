import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import scalajsbundler.ScalaJSBundlerPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {

    val scala211 = "2.11.8"

    val scala212 = "2.12.0"

    val scalaAsync = "0.9.6"

    val upickle = "0.3.1"

    val scalatest = "3.0.0"

    val utest = "0.3.0"

    val scalaJSDOM = "0.9.1"

    val chandu0101Macros = "2016.11.0"

    val react = "^15.3.2"

  }


  val utestJS = libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % Test

  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % Version.scalatest % Test

  val scalaAsync = libraryDependencies += "org.scala-lang.modules" %% "scala-async" % Version.scalaAsync

  val scalaJSUpickle = libraryDependencies += "com.lihaoyi" %%% "upickle" % Version.upickle

  val scalaJSDOM = libraryDependencies += "org.scala-js" %%% "scalajs-dom" % Version.scalaJSDOM

  val chandu0101Macros = libraryDependencies += "com.github.chandu0101" %%% "macros" % Version.chandu0101Macros

  val scalaReflect = libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided

  val coreModuleDeps = Seq(
    scalaJSDOM,
    chandu0101Macros,
    npmDependencies in Compile += "react" -> Version.react
  )

  val universalModuleDeps = Seq(
    npmDependencies in Compile ++= Seq(
      "react" -> "15.4.0-rc.4",
      "react-native" -> "0.38.0"
    )
  )

  val addonsModuleDeps = Seq(
    npmDependencies in Compile += "react-addons-perf" -> Version.react
  )

  val webModuleDeps = Seq(
    npmDependencies in Compile ++= Seq(
      "react-dom" -> Version.react,
      "history" -> "4.4.0"
    )
  )

  val mobileModuleDeps = Seq(

  )

  val mobileExamplesModuleDeps = Seq(scalaAsync)



  val scalatestJSSettings = Seq(scalatestJS,
    scalaJSStage in Global := FastOptStage,
//    scalaJSStage in Global := FullOptStage,
    requiresDOM := true,
    npmDependencies in Compile ++= Seq(
      "react-addons-test-utils" -> Version.react
    )
  )


  val utestSettings = Seq(utestJS,
    scalaJSStage in Global := FastOptStage,
    requiresDOM := true,
    testFrameworks += new TestFramework("utest.runner.Framework")
  )

}