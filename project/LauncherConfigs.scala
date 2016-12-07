import org.scalajs.sbtplugin.ScalaJSPlugin.AutoImport._
import scalajsbundler.ScalaJSBundlerPlugin.autoImport._
import sbt.Keys._
import sbt._

object LauncherConfigs {

  /** ================ React_native task   ================ */

  val fastOptMobile = Def.taskKey[Unit]("Generate mobile output file for fastOptJS")

  lazy val mobileLauncherFast =
    Seq(
      fastOptMobile in Compile := mobileTask(fastOptJS).value
    )

  val fullOptMobile = Def.taskKey[Unit]("Generate the file given to react native")

  lazy val mobilelauncherFull =
    Seq(
      fullOptMobile in Compile := mobileTask(fullOptJS).value
    )

  def mobileTask(stage: TaskKey[Attributed[File]]): Def.Initialize[Task[Unit]] = Def.task {
    val targetDir = (crossTarget in stage).value
    val outFiles = Seq(targetDir / "index.ios.js", targetDir / "index.android.js")
    for (outFile <- outFiles) {
      IO.write(outFile, (scalaJSLauncher in (Compile, stage)).value.data.content)
    }
    val cmd = (targetDir / "node_modules" / "react-native" / "packager" / "packager.sh").absolutePath
    Process(cmd, targetDir) ! streams.value.log
    ()
  }.dependsOn(npmUpdate in (Compile, stage))

  val fullOptRelayMobile = Def.taskKey[File]("Generate the file given to react native relay")

  lazy val mobileRelayLauncher =
    Seq(
      artifactPath in Compile in fullOptRelayMobile :=
        baseDirectory.value / "index.ios.js",
      fullOptMobile in Compile := {
        val outFile = (artifactPath in Compile in fullOptRelayMobile).value

        val loaderFile = (resourceDirectory in Compile).value / "loader.js"

        IO.copyFile(loaderFile, outFile)

        val fullOutputCode = IO.read((fullOptJS in Compile).value.data)

        IO.write(baseDirectory.value / "scalajs-output.js", fullOutputCode)

        val launcher = (scalaJSLauncher in Compile).value.data.content
        IO.append(outFile, launcher)

        IO.copyFile(outFile, baseDirectory.value / "index.android.js")
        // outFile
      }
    )

  //=============================== Web =========================================/

  val relayWebExamplesAssets = "relay-web-examples/assets"

  lazy val relayWebExamplesLauncher = Seq(crossTarget in(Compile, fullOptJS) := file(relayWebExamplesAssets),
    crossTarget in(Compile, fastOptJS) := file(relayWebExamplesAssets),
    crossTarget in(Compile, packageScalaJSLauncher) := file(relayWebExamplesAssets),
    artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
      ((moduleName in fastOptJS).value + "-opt.js"))
  )


}
