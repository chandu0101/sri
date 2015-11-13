import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt.{Build, _}

object Sri extends Build {

  import Dependencies._
  import LauncherConfigs._
  import PublicationDetails._

  val Scala211 = "2.11.7"

  lazy val commonSettings =
    Seq(
      organization := "com.github.chandu0101.sri",
      version := "0.3.0-SNAPSHOT",
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
    jsDependencies += ProvidedJS / "test-bundle.js" % Test
    //    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
    //    jsEnv in Test := new NodeJSEnv()
  )


  val utestSettings = Seq(utestJS,
    scalaJSStage in Global := FastOptStage,
    jsDependencies += RuntimeDOM,
    testFrameworks += new TestFramework("utest.runner.Framework"),
    jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))
  )


  // ================================ Module definitions  ================================ //
  lazy val Sri = DefProject(".", "root")
    .aggregate(core, addons, universal, web, mobile, desktop, relay, mobileExamples, webExamples, relayWebExamples, relayMobileExamples)
    .configure(addCommandAliases(
    "ct" -> "; test:compile ; core/test",
    "wt" -> "; test:compile ; web/test",
    "tt" -> "; test:compile ; test/test",
    "T" -> "; clean ;t",
    "TT" -> ";+clean ;tt"))
    .settings(preventPublication)

  lazy val core = DefProject("core")
    .settings(coreModuleDeps)
    .settings(scalatestJSSettings)
    .settings(publicationSettings)

  lazy val addons = DefProject("addons")
    .dependsOn(core)
    .settings(publicationSettings)

  lazy val universal = DefProject("universal")
    .dependsOn(core)
    .settings(publicationSettings)

  lazy val relay = DefProject("relay")
    .dependsOn(universal)
    .settings(publicationSettings)
    .settings(relayModuleDeps)

  lazy val web = DefProject("web")
    .dependsOn(universal)
    .settings(webModuleDeps)
    .settings(scalatestJSSettings)
    .settings(publicationSettings)


  lazy val mobile = DefProject("mobile")
    .dependsOn(universal)
    .settings(mobileModuleDeps)
    .settings(publicationSettings)

  lazy val desktop = DefProject("desktop")
    .dependsOn(web)
    .settings(desktopModuleDeps)
    .settings(publicationSettings)

  lazy val webExamples = DefProject("web-examples")
    .dependsOn(web, relay)
    .settings(webExamplesLauncher)
    .settings(preventPublication)


  lazy val relayWebExamples = DefProject("relay-web-examples")
    .dependsOn(web, relay)
    .settings(relayWebExamplesLauncher)
    .settings(preventPublication)

  lazy val mobileExamples = DefProject("mobile-examples")
    .dependsOn(mobile)
    .settings(mobilelauncher)
    .settings(mobileExamplesModuleDeps)
    .settings(preventPublication)

  lazy val relayMobileExamples = DefProject("relay-mobile-examples")
    .dependsOn(mobile, relay)
    .settings(mobilelauncher)
    .settings(preventPublication)

  lazy val test = DefProject("test")
    .dependsOn(universal)
    .settings(scalatestJSSettings)

}