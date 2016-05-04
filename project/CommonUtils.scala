import org.scalajs.sbtplugin.ScalaJSPlugin
import sbt.Keys._
import sbt._

object CommonUtils {



  lazy val commonSettings =
    Seq(
      organization := "com.github.chandu0101.sri",
      version := "0.5.1-SNAPSHOT",
      homepage := Some(url("https://github.com/chandu0101/sri")),
      licenses +=("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")),
      scalaVersion := Dependencies.Version.scala211,
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
        "-language:postfixOps", "-language:implicitConversions",
        "-language:higherKinds", "-language:existentials"))


  def DefProject(name: String, id: String = "") = {
    Project(if (id.isEmpty) name else id, file(name))
      .settings(commonSettings: _*)
      .enablePlugins(ScalaJSPlugin)
  }

  def addCommandAliases(m: (String, String)*) = {
    val s = m.map(p => addCommandAlias(p._1, p._2)).reduce(_ ++ _)
    (_: Project).settings(s: _*)
  }

}