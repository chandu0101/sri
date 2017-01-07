package sri.tools

import scala.io.Source

/**
  *  work only for traits and  classes with no constructor params
  */
object LiteralCompanions {

  case class LiteralMeta(name: String, supers: Seq[String])

  case class FieldMeta(name: String, tpe: String, default: Option[String])

  def getObjects(inputPath: String) = {

    var fieldsCache: Map[String, Seq[FieldMeta]] = Map()

    val fileContent = Source.fromFile(inputPath)
      .getLines()
      .mkString("\n")
      .replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "") // remove all comments

    def getLiteralInfo(l: String) = {
      val x = l.replace("trait", "").replace("abstract", "").replace("class", "").trim
      val name = x.substring(0, x.indexOf("extends")).trim
      val supers = x.replace("extends", "").replace(name, "").replace("{", "").split("with").map(_.trim).toSeq
      LiteralMeta(name, supers)
    }

    def getLiteralVars(lt: LiteralMeta): Seq[FieldMeta] = {
      var i = fileContent.indexOf(s"trait ${lt.name}")
      if (i < 0) i = fileContent.indexOf(s"class ${lt.name}")
      val s = fileContent.substring(i)
      val j = s.indexOf("{")
      val k = s.indexOf("}")
      s.substring(j + 1, k - 1)
        .split("\n")
        .filter(_.contains(":"))
        .map(s => {
          val pt = s.split(":")
          val name = pt.head.replace("var", "")
            .replace("val", "")
            .replace("def", "").trim
          val tpeValue = pt.last.trim.replace(";", "").replace(",", "")
          var tpe = tpeValue.trim
          var default:Option[String] = None
          if (tpeValue.contains("=")) {
            tpe = tpeValue.split("=").head.trim
            default = Some(tpeValue.split("=").last.trim)
          }
          val optional = tpe.startsWith("js.UndefOr[") || tpe.startsWith("UndefOr[") || tpe.startsWith("U[")
          FieldMeta(name, tpe,default)
        })
    }

    val isDirectLiteral = (lt: LiteralMeta) => lt.supers.size == 1 && lt.supers.head == "js.Object"

    val literals = fileContent.split("\n").filter(l => (l.contains("trait") || l.contains("class")) && l.contains("extends") && l.contains("{")).map(getLiteralInfo)

    val literalsSorted = literals.filter(isDirectLiteral) ++ literals.filter(lt => !isDirectLiteral(lt))
//${fields.map(f => if(f.default.isEmpty) s"o.updateDynamic(\"${f.name}\")(${f.name})" else s"${f.name}.foreach(v => o.updateDynamic(\"${f.name}\")(v))").mkString("\n")}
    def createCompanion(name: String, fields: Seq[FieldMeta]): String = {
      s"""
         |object $name {
         |  @inline
         |  def apply(${fields.map(f => s"${f.name}: ${f.tpe}${if (f.default.isEmpty) "" else s" = ${f.default.get}"}").mkString(",")}) = {
         |     val o = js.Dynamic.literal()
         |
         |     js.Dynamic.literal(${fields.map(f => s"${f.name} = ${f.name}").mkString(",")}).asInstanceOf[$name]
         |  }
         |}
       """.stripMargin
    }

    val objects = literalsSorted.map(lt => {
      val fields = getLiteralVars(lt)
      fieldsCache = fieldsCache.updated(lt.name, fields)
      val superFields = if (isDirectLiteral(lt)) Seq()
      else lt.supers.flatMap(s => fieldsCache.get(s).getOrElse(Seq()))
      val finalFields = fields ++ superFields
      createCompanion(lt.name, finalFields)
    }).mkString("\n")

    val imports = fileContent.split("\n").filter(l => l.trim.startsWith("import ")).mkString("\n")
    val packageName = fileContent.split("\n").filter(l => l.trim.startsWith("package ")).mkString("\n")

    s"""
       |${packageName}
       |
            |${imports}
       |
            |/** This file is auto generated please file issues instead of sending PR's */
       |
            |${objects}
       |
          """.stripMargin
  }

  def generateFiles(literalDefs: Seq[LiteralPathMeta]) = {
    literalDefs.foreach(ld => {
      val content = LiteralCompanions.getObjects(ld.inputPath)
      writeToFile(ld.outputPath, content)
    })
  }

}
