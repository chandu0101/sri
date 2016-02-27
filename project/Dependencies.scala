import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {

    val scalaAsync = "0.9.2"

    val upickle = "0.3.1"

    val scalatest = "3.0.0-M6"

    val utest = "0.3.0"

    val scalaJSDOM = "0.9.0"

    val chandu0101Macros = "0.5.1"
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
    chandu0101Macros
  )

  val webModuleDeps = Seq(

  )

  val mobileModuleDeps = Seq(

  )


  val mobileExamplesModuleDeps = Seq(scalaAsync)

  val relayModuleDeps = Seq(scalaReflect)
}