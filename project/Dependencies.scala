import org.scalajs.jsenv.nodejs.NodeJSEnv
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Dependencies {


  object Version {

    val scala211 = "2.11.8"

    val scalaAsync = "0.9.2"

    val upickle = "0.3.1"

    val scalatest = "3.0.0-M6"

    val utest = "0.3.0"

    val scalaJSDOM = "0.9.0"

    val chandu0101Macros = "2016.5.0"

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


  val scalatestJSSettings = Seq(scalatestJS,
    scalaJSStage in Global := FastOptStage,
//    scalaJSStage in Global := FullOptStage,
    jsDependencies += RuntimeDOM,
    jsDependencies += ProvidedJS / "test-bundle.js" % Test,
    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
//        jsEnv in Test := new NodeJSEnv()
  )


  val utestSettings = Seq(utestJS,
    scalaJSStage in Global := FastOptStage,
    jsDependencies += RuntimeDOM,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
  )

}