package sri.tools

import java.io.File

import sri.tools.LiteralCompanions.FieldMeta

import scala.meta._

object SriTools extends {

  def main(args: Array[String]): Unit = {

    val literalDefs = Seq(LiteralPathMeta(inputPath = "universal/src/main/scala/sri/universal/LiteralTypes.scala", outputPath = "universal/src/main/scala/sri/universal/LiteralTypesCompanions.scala"))

    //    LiteralCompanions.generateFiles(literalDefs)

    val path = "universal/src/main/scala/sri/universal/LiteralTypes.scala"

    val file = new File(path)

    val source = file.parse[Source]

    val tree = source match {
      case Parsed.Success(tree) => tree
      case _ => null
    }

    case class OMeta(name:String,fields : Seq[FieldMeta],supers:Seq[String])

    def getMeta(name:String,tpes: Seq[Type.Param],ctorCalls: Seq[Ctor.Call],statements: Seq[Stat]) = {

    }

    tree.stats.head.traverse { case elm:Tree =>
      elm match {
        case q"..$mods trait $name[..$tpes] extends $template" => template match {
          case template"{..$stats} with ..$ctorCalls {$param => ..$stats2 }" => {
//            getMeta(name.toString(),tpes,ctorCalls,stats2)

            println(s"$name First stats : $stats ctorCalls : ${ctorCalls}  param : $param stats2 : $stats2 tpes : ${if(tpes.isEmpty) tpes else tpes.head.syntax}")
          }
        }
        case q"..$mods class $name[..$tpes] extends $template" => template match {
          case template"{..$stats} with ..$ctorCalls {$param => ..$stats2 }" => {
            //            getMeta(name.toString(),tpes,ctorCalls,stats2)

            println(s"$name First stats : $stats ctorCalls : ${ctorCalls}  param : $param stats2 : $stats2 tpes : ${if(tpes.isEmpty) tpes else tpes.head.syntax}")
          }
        }
        case _ =>
      }
    }



    //   val x=  tree match {
    //      case source"..$stats" => stats.foldLeft(List[String]())((acc,elm) => elm match {
    //        case q"..$mods trait $name extends $template" => { println(s"man $template"); acc :+ s"$name" }
    //        case _ => { println(s"other $elm"); acc :+ "other" }
    //      })
    //    }

    //    println(s"man x: $x")
    //    source.stats.foreach(s => s match {
    //      case q"..$mods trait $name extends $template" => println(s"man $template")
    //      case _ => println(s"other $s")
    //    })

  }
}
