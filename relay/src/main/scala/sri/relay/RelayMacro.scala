package sri.relay

import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import java.util.Properties

import scala.io.Source
import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object RelayMacro {


  val START_OF_QUERY = "// START OF QUERY"

  val END_OF_QUERY = "// END OF QUERY"

  val INVALID_PATH = "invalidpath_null"

  def relay_macro_impl(c: Context)(code: c.Expr[String]): c.Tree = {
    import c.universe._

    import scala.sys.process._

    val currentDirectory = new File(".").getCanonicalPath
    val fileName = "relayConfig.properties"
    if (!Files.exists(Paths.get(s"$currentDirectory/$fileName"))) {
      c.abort(c.enclosingPosition, s"Make sure you have $fileName file in $currentDirectory ")
    }

    val source = Source.fromFile(Paths.get(s"$currentDirectory/$fileName").toFile)

    import scala.collection.JavaConverters._
    val properties = new Properties()
    properties.load(source.bufferedReader())
    val props = properties.asScala.toMap

    val rootPath = Paths.get(props.getOrElse("rootPath", INVALID_PATH))
    val inputFilePath = Paths.get(props.getOrElse("inputFilePath", INVALID_PATH))
    val outputFilePath = Paths.get(props.getOrElse("outputFilePath", INVALID_PATH))

    if (!Files.exists(rootPath)) {
      c.abort(c.enclosingPosition, s"rootPath in $currentDirectory/$fileName is not valid ")
    }
    if (!Files.exists(inputFilePath)) {
      c.abort(c.enclosingPosition, s"inputFilePath in $currentDirectory/$fileName is not valid ")
    }
    if (!Files.exists(outputFilePath)) {
      c.abort(c.enclosingPosition, s"outputFilePath in $currentDirectory/$fileName is not valid ")
    }

    val str1 = code match {
      case Expr(Literal(Constant(str: String))) => str
      case _ => c.abort(c.enclosingPosition, s"""Input query should be constant string , Example : RelayMacro("query") ,variables/functions and triple quote string with .stripmargin are not allowed. """)
    }

    val inputCode =
      s"""
         | $START_OF_QUERY
          |
          |Relay.QL`$str1`
                           |
                           | $END_OF_QUERY
          |
       """.stripMargin


    Files.write(inputFilePath, inputCode.getBytes(StandardCharsets.UTF_8))

    val result = Process("npm run relayquery", rootPath.toFile).!!

    println(s"Command Output :  $result")

    val out = Source.fromFile(outputFilePath.toFile).getLines().toList.filter(_.nonEmpty)
    val start = out.zipWithIndex.find { case (s, i) => s.contains(START_OF_QUERY)}.get._2
    val end = out.zipWithIndex.find { case (s, i) => s.contains(END_OF_QUERY)}.get._2

    val parsedText = out.slice(start + 2, end).mkString.trim

    if (parsedText.contains("throw new Error")) {
      c.abort(c.enclosingPosition, "GraphQL Validation Error please check the console for detailed message.")
    }

    q"""$parsedText"""

  }

}

