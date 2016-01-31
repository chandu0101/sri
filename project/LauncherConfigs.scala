import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

object LauncherConfigs {

  /** ================ React_native task   ================ */

  val fastOptMobile = Def.taskKey[File]("Generate mobile output file for fastOptJS")

  lazy val mobileLauncherFast =
    Seq(
      artifactPath in Compile in fastOptMobile :=
        baseDirectory.value / "index.ios.js",
      fastOptMobile in Compile := {
        val outFile = (artifactPath in Compile in fastOptMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFile)

        val fastOutputCode = IO.read((fastOptJS in Compile).value.data)

        IO.append(outFile, fastOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )

  val fullOptMobile = Def.taskKey[File]("Generate the file given to react native")

  lazy val mobilelauncherFull =
    Seq(
      artifactPath in Compile in fullOptMobile :=
        baseDirectory.value / "index.ios.js",
      fullOptMobile in Compile := {
        val outFile = (artifactPath in Compile in fullOptMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFile)

        val fullOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.append(outFile, fullOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )

  val fullOptRelayMobile = Def.taskKey[File]("Generate the file given to react native relay")

  lazy val mobileRelayLauncher =
    Seq(
      artifactPath in Compile in fullOptRelayMobile :=
        baseDirectory.value / "index.ios.js",
      fullOptRelayMobile in Compile := {
        val outFile = (artifactPath in Compile in fullOptRelayMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFile)

        val fullOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.append(outFile, fullOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )

  //=============================== Web =========================================/

  val webExamplesAssets = "web-examples/assets"

  lazy val webExamplesLauncher = Seq(crossTarget in(Compile, fullOptJS) := file(webExamplesAssets),
    crossTarget in(Compile, fastOptJS) := file(webExamplesAssets),
    crossTarget in(Compile, packageScalaJSLauncher) := file(webExamplesAssets),
    artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
      ((moduleName in fastOptJS).value + "-opt.js"))
  )


  val relayWebExamplesAssets = "relay-web-examples/assets"

  lazy val relayWebExamplesLauncher = Seq(crossTarget in(Compile, fullOptJS) := file(relayWebExamplesAssets),
    crossTarget in(Compile, fastOptJS) := file(relayWebExamplesAssets),
    crossTarget in(Compile, packageScalaJSLauncher) := file(relayWebExamplesAssets),
    artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
      ((moduleName in fastOptJS).value + "-opt.js"))
  )


  def addCommandAliases(m: (String, String)*) = {
    val s = m.map(p => addCommandAlias(p._1, p._2)).reduce(_ ++ _)
    (_: Project).settings(s: _*)
  }


  //================================================= Desktop =================================//

  val fastOptDesktop = Def.taskKey[File]("Generate desktop app bundles")

  lazy val desktopLauncher =
    Seq(
      artifactPath in Compile in fastOptDesktop :=
        baseDirectory.value / "main.js",
      fastOptDesktop in Compile := {
        val mainOutFile = (artifactPath in Compile in fastOptDesktop).value

        val renderOutFile = (baseDirectory.value / "render-bundle.js")

        val mainLoaderFile = (resourceDirectory in Compile).value / "mainLoader.js"

        val renderLoaderFile = (resourceDirectory in Compile).value / "renderLoader.js"

        IO.copyFile(mainLoaderFile, mainOutFile)

        val fastOptCode = IO.read((fastOptJS in Compile).value.data)

        IO.append(mainOutFile, fastOptCode)

        IO.copyFile((fastOptJS in Compile).value.data, renderOutFile)

        IO.append(renderOutFile, IO.read(renderLoaderFile))

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(mainOutFile, launcher)

        mainOutFile
      }
    )


}
