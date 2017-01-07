package sri

import java.io.{File, PrintWriter}

package object tools {


  case class LiteralPathMeta(inputPath:String,outputPath : String)

  def writeToFile(name: String, content: String) = {
    val pw = new PrintWriter(new File(name))
    try pw.write(content) finally pw.close()
  }
}
