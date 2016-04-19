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
        val outFileTemp = (artifactPath in Compile in fastOptMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFileTemp)

        val fullOutputCode = IO.read((fastOptJS in Compile).value.data)

        IO.append(outFileTemp, fullOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFileTemp, launcher)

        val outString = processRequireFunctionsInFastOpt(outFileTemp)
        IO.delete(outFileTemp)
        val outFile = (artifactPath in Compile in fastOptMobile).value
        IO.append(outFile, outString)
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
        val outFileTemp = (artifactPath in Compile in fullOptMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFileTemp)

        val fullOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.append(outFileTemp, fullOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFileTemp, launcher)

        val outString = processRequireFunctions(outFileTemp)
        IO.delete(outFileTemp)
        val outFile = (artifactPath in Compile in fullOptMobile).value
        IO.append(outFile, outString)
        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )

  /**
   * react-native prod bundler needs require function without name spaces
   * @param file
   * @return
   */
  def processRequireFunctions(file: File): String = {
    val text = IO.read(file)
    val SJS_NAME_SPACE = "exportsNamespace:"
    val i = text.indexOf(SJS_NAME_SPACE) + SJS_NAME_SPACE.length
    val j = text.substring(i).indexOf(";") + i // TODO look for non valid identifier ![_$0-9a-zA-Z]
    val nameSpace = text.substring(i,j)
    text.replaceAll(s"$nameSpace.require\\(", "require\\(")
  }

  /**
   * react-native prod bundler needs require function without name spaces
   * @param file
   * @return
   */
  def processRequireFunctionsInFastOpt(file: File): String = {
    val text = IO.read(file)
     text.replaceAll("\\$g.require\\(", "require\\(")
  }

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


}
