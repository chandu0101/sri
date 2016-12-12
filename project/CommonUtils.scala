import sbt.Keys._
import sbt._

import scalajsbundler.ScalaJSBundlerPlugin

object CommonUtils {



  lazy val commonSettings =
    Seq(
      organization := "com.github.chandu0101",
      version := "0.6.0",
      homepage := Some(url("https://github.com/chandu0101/sri")),
      licenses +=("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0")),
      scalaVersion := Dependencies.Version.scala211,
      crossScalaVersions := Seq(Dependencies.Version.scala211,Dependencies.Version.scala212),
      scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
        "-language:postfixOps", "-language:implicitConversions",
        "-language:higherKinds", "-language:existentials"))



  def DefProject(dir: String, _id: String = "") = {
    val id = if (_id.isEmpty) dir else _id
    Project(id, file(dir))
      .settings(commonSettings: _*)
      .settings(Keys.name := "sri-" + id)
      .enablePlugins(ScalaJSBundlerPlugin)
  }

  def addCommandAliases(m: (String, String)*) = {
    val s = m.map(p => addCommandAlias(p._1, p._2)).reduce(_ ++ _)
    (_: Project).settings(s: _*)
  }

}