import LauncherConfigs._
import CommonUtils._
import PublicationDetails._
import Dependencies._


// ================================ Module definitions  ================================ //

lazy val Sri = DefProject(".", "root")
  .aggregate(core, addons, universal, web, mobile, mobileExamples, webExamplesServer)
  .configure(addCommandAliases(
    "ct" -> "; test:compile ; core/test",
    "wt" -> "; test:compile ; web/test",
    "tt" -> "; test:compile ; test/test",
    "T" -> "; clean ;t",
    "TT" -> ";+clean ;tt"))
  .settings(preventPublication)

lazy val core = DefProject("core")
  .settings(coreModuleDeps)
  .settings(publicationSettings)

lazy val addons = DefProject("addons")
  .dependsOn(core)
  .settings(addonsModuleDeps)
  .settings(publicationSettings)

lazy val universal = DefProject("universal")
  .dependsOn(core)
  .settings(universalModuleDeps)
  .settings(publicationSettings)


lazy val web = DefProject("web")
  .dependsOn(universal)
  .settings(webModuleDeps)
  .settings(publicationSettings)


lazy val mobile = DefProject("mobile")
  .dependsOn(universal)
  .settings(mobileModuleDeps)
  .settings(publicationSettings)

lazy val webExamplesClient = DefProject("web-examples/client", "web-examples-client")
  .enablePlugins(ScalaJSWeb)
  .dependsOn(web)
  .settings(preventPublication)

lazy val webExamplesServer = Project("web-examples-server", file("web-examples/server"))
  .settings(commonSettings ++ preventPublication: _*)
  .enablePlugins(WebScalaJSBundlerPlugin)
  .settings(
    scalaJSProjects := Seq(webExamplesClient),
    pipelineStages in Assets := Seq(scalaJSPipeline),
    libraryDependencies += "com.typesafe.play" %% "play-netty-server" % "2.5.10",
    WebKeys.packagePrefix in Assets := "public/",
    (managedClasspath in Runtime) += (packageBin in Assets).value
  )


lazy val mobileExamples = DefProject("mobile-examples")
  .dependsOn(mobile)
  .settings(mobilelauncherFull)
  .settings(mobileLauncherFast)
  .settings(mobileExamplesModuleDeps)
  .settings(preventPublication)

lazy val test = DefProject("test")
  .dependsOn(web)
  .settings(scalatestJSSettings: _*)
  .settings(preventPublication)

// workaround http://stackoverflow.com/questions/20931217/deprecation-and-feature-warnings-for-sbt-project-definition-files

scalacOptions ++= Seq("-unchecked", "-deprecation")