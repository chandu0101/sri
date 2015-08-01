import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt.{Build, _}

object Sri extends Build {

  import Dependencies._

  val Scala211 = "2.11.7"

  lazy val commonSettings =
    Seq(
      organization := "com.github.chandu0101.sri",
      version := "0.0.1",
      homepage := Some(url("https://github.com/chandu0101/sri")),
      licenses +=("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")),
      scalaVersion := Scala211,
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
        "-language:postfixOps", "-language:implicitConversions",
        "-language:higherKinds", "-language:existentials"))


  def DefProject(name: String, id: String = "") = {
    Project(if (id.isEmpty) name else id, file(name))
      .settings(commonSettings: _*)
      .enablePlugins(ScalaJSPlugin)
  }


  /** ===================  Test frameworks settings   */

  val scalatestJSSettings = Seq(scalatestJS,
    scalaJSStage in Global := FastOptStage,
    jsDependencies += RuntimeDOM,
    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
  )


  val utestSettings = Seq(utestJS,
    scalaJSStage in Global := FastOptStage,
    jsDependencies += RuntimeDOM,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
  )

  /** ================ React_native task   ================ */
  val fullOptIOS = Def.taskKey[File]("Generate the file given to react native")

  lazy val iosLauncher =
    Seq(
      artifactPath in Compile in fullOptIOS :=
        baseDirectory.value / "index.ios.js",
      fullOptIOS in Compile := {
        val outFile = (artifactPath in Compile in fullOptIOS).value

        IO.copyFile((fullOptJS in Compile).value.data, outFile)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        outFile
      }
    )

  val webExamplesAssets = "web-examples/assets"

  lazy val webExamplesLauncher = Seq(crossTarget in(Compile, fullOptJS) := file(webExamplesAssets),
    crossTarget in(Compile, fastOptJS) := file(webExamplesAssets),
    crossTarget in (Compile, packageScalaJSLauncher) := file(webExamplesAssets),
    artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
      ((moduleName in fastOptJS).value + "-opt.js"))
  )


  def useReactJs(scope: String = "compile") = {
    val reactJSVersion = "0.14.0-beta1"
    Seq(
      jsDependencies += "org.webjars.npm" % "react" % reactJSVersion % scope / "react-with-addons.js" commonJSName "React")
  }


  def addCommandAliases(m: (String, String)*) = {
    val s = m.map(p => addCommandAlias(p._1, p._2)).reduce(_ ++ _)
    (_: Project).settings(s: _*)
  }


  // ================================ Module definitions  ================================ //
  lazy val Sri = DefProject(".", "root")
    .aggregate(core,web,webExamples)
    .configure(addCommandAliases(
    "ct" -> "; test:compile ; core/test",
    "wt" -> "; test:compile ; web/test",
    "tt" -> ";+test:compile ;+test/test",
    "T" -> "; clean ;t",
    "TT" -> ";+clean ;tt"))

  lazy val core = DefProject("core")
    .settings(coreModuleDeps: _*)
    .settings(scalatestJSSettings: _*)

  lazy val web = DefProject("web")
    .dependsOn(core)
    .settings(useReactJs("test"): _*)
    .settings(webModuleDeps: _*)

  lazy val webExamples = DefProject("web-examples")
    .dependsOn(web)
    .settings(webExamplesLauncher: _*)

//  lazy val ios = DefProject("ios")
//    .dependsOn(shared)
//    .settings(iosLauncher: _*)
//    .settings(iosModuleDeps: _*)


}