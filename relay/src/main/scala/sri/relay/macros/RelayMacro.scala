package sri.relay.macros

import java.io.{BufferedWriter, File, FileWriter, PrintWriter}
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}
import java.util.Properties

import scala.io.Source
import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

/**
 *  uses babel-relay-plugin to generate queries/frags from schema.json
 */
object RelayMacro {

  val debug: Boolean = false

  val START_OF_QUERY = "// START OF QUERY"

  val END_OF_QUERY = "// END OF QUERY"

  val INVALID_PATH = "invalidpath_null"

  var counter = 0

  def relay_macro_impl(c: Context)(code: c.Expr[String]): c.Tree = {
    import c.universe._

    import scala.sys.process._

    val currentDirectory = new File(".").getCanonicalPath
    val parentFolder = c.enclosingPosition.source.file.file.getParentFile

    def searchConfig(file: File, finalDirectory: Boolean = false): File = {
      if(file.isDirectory) {
        file.listFiles().filterNot(_.isDirectory).find{f =>
          f.getName == "relayConfig.properties"
        }.getOrElse({
          val parent = file.getParentFile
          if (!finalDirectory && parent != null) {
            val finalDirectory = parent.getCanonicalPath == currentDirectory
            searchConfig(parent, finalDirectory)
          } else
            c.abort(c.enclosingPosition, s"no config found is no directory! ")
        })
      } else {
        c.abort(c.enclosingPosition, s"${file.getAbsolutePath} is no directory! ")
      }
    }

    val config = searchConfig(parentFolder)

    val source = Source.fromFile(config)

    import scala.collection.JavaConverters._
    val properties = new Properties()
    properties.load(source.bufferedReader())
    val props = properties.asScala.toMap

    def copyPath(counter: Int, s: String): String = {
      s.substring(0, s.length-3) + counter + s.substring(s.length-3, s.length)
    }

    val rootValue = props.getOrElse("rootPath", INVALID_PATH)
    val rootPath = Paths.get(rootValue)
    val inputFilePath = Paths.get(rootValue, props.getOrElse("inputFilePath", INVALID_PATH))
    val outputFilePath = Paths.get(rootValue, props.getOrElse("outputFilePath", INVALID_PATH))

    def createFile(file: File): Unit = {
      new PrintWriter(file) { write(""); close() }
    }

    if (!Files.exists(rootPath)) {
      c.abort(c.enclosingPosition, s"rootPath in ${config.getAbsolutePath}/${config.getName} is not valid ")
    }

    //make sure we create fresh empty input/output files
    if (Files.exists(inputFilePath)) {
      inputFilePath.toFile.delete()
    }
    createFile(inputFilePath.toFile)

    if (Files.exists(outputFilePath)) {
      outputFilePath.toFile.delete()
    }
    createFile(outputFilePath.toFile)

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

    val out = Source.fromFile(outputFilePath.toFile).getLines().toList.filter(_.nonEmpty)

    if(!out.mkString("").contains(START_OF_QUERY)) {
      println(s"Command Output :  $result")
      c.abort(c.enclosingPosition, "GraphQL Validation Error please check the console for detailed message.")
    }

    val start = out.zipWithIndex.find { case (s, i) => s.contains(START_OF_QUERY)}.get._2
    val end = out.zipWithIndex.find { case (s, i) => s.contains(END_OF_QUERY)}.get._2

    val parsedText = out.slice(start + 2, end).mkString.trim
     if (parsedText.contains("throw new Error")) {
      println(s"Command Output :  $result")
      c.abort(c.enclosingPosition, "GraphQL Validation Error please check the console for detailed message.")
    } else {
       println(s"babel-relay plugin successful!")
     }

    q"""$parsedText"""

  }

}

