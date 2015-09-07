import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {

  val scalaAsyncVersion = "0.9.2"

  val upickleVersion = "0.3.1"

  val scalatestVersion = "3.0.0-M6"

  val utestVersion = "0.3.0"

  val scalaJSDOMVersion = "0.8.1"


  val chandu0101MacrosVersion = "0.5"


  val utestJS = libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % Test

  val scalatestJS = libraryDependencies += "org.scalatest" %%% "scalatest" % scalatestVersion % Test

  val scalaAsync = libraryDependencies += "org.scala-lang.modules" %% "scala-async" % scalaAsyncVersion

  val scalaJSUpickle = libraryDependencies += "com.lihaoyi" %%% "upickle" % upickleVersion

  val scalaJSDOM = libraryDependencies += "org.scala-js" %%% "scalajs-dom" % scalaJSDOMVersion

  val chandu0101Macros = libraryDependencies += "com.github.chandu0101" %%% "macros" % chandu0101MacrosVersion


  val coreModuleDeps = Seq(
  )

  val webModuleDeps = Seq(scalaJSDOM,
  jsDependencies += ProvidedJS / "webtest-bundle.js" % Test
  )

  val mobileModuleDeps = Seq(scalaJSDOM,
    chandu0101Macros
  )

  val mobileExamplesModuleDeps = Seq(scalaAsync)

}