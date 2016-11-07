import LauncherConfigs._
import CommonUtils._
import PublicationDetails._
import Dependencies._


// ================================ Module definitions  ================================ //

lazy val Sri = DefProject(".", "root")
  .aggregate(core, addons, universal, web, mobile, mobileExamples, webExamples)
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
  .settings(publicationSettings)

lazy val universal = DefProject("universal")
  .dependsOn(core)
  .settings(publicationSettings)


lazy val web = DefProject("web")
  .dependsOn(universal)
  .settings(webModuleDeps)
  .settings(publicationSettings)


lazy val mobile = DefProject("mobile")
  .dependsOn(universal)
  .settings(scalaJSModuleKind := ModuleKind.CommonJSModule)
  .settings(mobileModuleDeps)
  .settings(publicationSettings)


lazy val webExamples = DefProject("web-examples")
  .dependsOn(web)
  .settings(webExamplesLauncher)
  .settings(preventPublication)


lazy val mobileExamples = DefProject("mobile-examples")
  .dependsOn(mobile)
  .settings(mobilelauncherFull)
  .settings(mobileLauncherFast)
  .settings(mobileExamplesModuleDeps)
  .settings(preventPublication)

lazy val test = DefProject("test")
  .dependsOn(web)
  .settings(scalatestJSSettings: _*)

// workaround http://stackoverflow.com/questions/20931217/deprecation-and-feature-warnings-for-sbt-project-definition-files

scalacOptions ++= Seq("-unchecked", "-deprecation")