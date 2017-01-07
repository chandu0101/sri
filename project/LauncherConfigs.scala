import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import sbt.Keys._
import sbt._

object LauncherConfigs {

  /** ================ React_native task   ================ */

  val SJS_OUTPUT_PATH = "assets/scalajs-output.js"

  val fastOptMobile = Def.taskKey[File]("Generate mobile output file for fastOptJS")

  lazy val mobileLauncherFast =
    Seq(
      artifactPath in Compile in fastOptJS :=
        baseDirectory.value / SJS_OUTPUT_PATH,
      artifactPath in Compile in fastOptMobile :=
        baseDirectory.value / "index.ios.js",
      fastOptMobile in Compile := {
        (artifactPath in Compile in fastOptMobile).value.delete()
        val outFile = (artifactPath in Compile in fastOptMobile).value

        val fastoptOutputCode = IO.read((fastOptJS in Compile).value.data)

        val outString = fastoptOutputCode.replace("this[\"__ScalaJSExportsNamespace\"] = $e;", "") //TODO we don't need this in scala.js 0.6.15

        IO.write(baseDirectory.value / SJS_OUTPUT_PATH, outString)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )

  val fullOptMobile = Def.taskKey[File]("Generate mobile output file for fullOptJS")

  lazy val mobilelauncherFull =
    Seq(
      artifactPath in Compile in fullOptJS :=
        baseDirectory.value / SJS_OUTPUT_PATH,
      artifactPath in Compile in fullOptMobile :=
        baseDirectory.value / "index.ios.js",
      fullOptMobile in Compile := {
        (artifactPath in Compile in fullOptMobile).value.delete()

        val outFile = (artifactPath in Compile in fullOptMobile).value

        val fulloptOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.write(baseDirectory.value / SJS_OUTPUT_PATH, fulloptOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        outFile
      }
    )


  //=============================== Web =========================================/

  val fastOptWeb = Def.taskKey[Unit]("Generate web output file for fastOptJS")

  lazy val fastWebLauncher =
    Seq(
      artifactPath in Compile in fastOptJS :=
        baseDirectory.value / SJS_OUTPUT_PATH,
      fastOptWeb in Compile := {
        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.write(baseDirectory.value / "assets/scalajs-output-launcher.js", launcher)
      }
    )

  val fullOptWeb = Def.taskKey[Unit]("Generate web output file for fullOptJS")

  lazy val fullWebLauncher =
    Seq(
      artifactPath in Compile in fullOptJS :=
        baseDirectory.value / SJS_OUTPUT_PATH,
      fullOptWeb in Compile := {
        (fullOptJS in Compile).value
        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.write(baseDirectory.value / "assets/scalajs-output-launcher.js", launcher)
      }
    )

}
