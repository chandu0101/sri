import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

object LauncherConfigs {

  /** ================ React_native task   ================ */
  val fullOptIOS = Def.taskKey[File]("Generate the file given to react native")

  lazy val iosLauncher =
    Seq(
      artifactPath in Compile in fullOptIOS :=
        baseDirectory.value / "index.ios.js",
      fullOptIOS in Compile := {
        val outFile = (artifactPath in Compile in fullOptIOS).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFile)
        //        val loaders = IO.read((resourceDirectory in Compile).value / "loader.js")
        //
        //        IO.append(outFile, loaders)

        val fullOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.append(outFile, fullOutputCode)

        //        IO.copyFile((fullOptJS in Compile).value.data, outFile)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        outFile
      }
    )

  val webExamplesAssets = "web-examples/assets"

  lazy val webExamplesLauncher = Seq(crossTarget in(Compile, fullOptJS) := file(webExamplesAssets),
    crossTarget in(Compile, fastOptJS) := file(webExamplesAssets),
    crossTarget in(Compile, packageScalaJSLauncher) := file(webExamplesAssets),
    artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
      ((moduleName in fastOptJS).value + "-opt.js"))
  )



  def addCommandAliases(m: (String, String)*) = {
    val s = m.map(p => addCommandAlias(p._1, p._2)).reduce(_ ++ _)
    (_: Project).settings(s: _*)
  }
}