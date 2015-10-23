package sri.universal.styles

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


trait NativeAttrs extends FlexBoxStyles with TextStyles with ImageStyles with ViewStyles with Transforms

object NativeAttrs extends NativeAttrs

trait FlexBoxStyles {

  val flex = new NativeStyle[Double]("flex")
  val flexOne = flex := 1

  val borderBottomWidth = new NativeStyle[Double]("borderBottomWidth")
  val borderLeftWidth = new NativeStyle[Double]("borderLeftWidth")
  val borderRightWidth = new NativeStyle[Double]("borderRightWidth")
  val borderTopWidth = new NativeStyle[Double]("borderTopWidth")
  val borderWidth = new NativeStyle[Double]("borderWidth")
  val bottom = new NativeStyle[Double]("bottom")
  val height = new NativeStyle[Double]("height")
  val left = new NativeStyle[Double]("left")
  val margin = new NativeStyle[Double]("margin")
  val marginBottom = new NativeStyle[Double]("marginBottom")
  val marginHorizontal = new NativeStyle[Double]("marginHorizontal")
  val marginLeft = new NativeStyle[Double]("marginLeft")
  val marginRight = new NativeStyle[Double]("marginRight")
  val marginTop = new NativeStyle[Double]("marginTop")
  val marginVertical = new NativeStyle[Double]("marginVertical")
  val padding = new NativeStyle[Double]("padding")
  val paddingBottom = new NativeStyle[Double]("paddingBottom")
  val paddingHorizontal = new NativeStyle[Double]("paddingHorizontal")
  val paddingLeft = new NativeStyle[Double]("paddingLeft")
  val paddingRight = new NativeStyle[Double]("paddingRight")
  val paddingTop = new NativeStyle[Double]("paddingTop")
  val paddingVertical = new NativeStyle[Double]("paddingVertical")
  val right = new NativeStyle[Double]("right")
  val top = new NativeStyle[Double]("top")
  val width = new NativeStyle[Double]("width")
  val letterSpacing = new NativeStyle[Double]("letterSpacing")

  object position extends NativeStyle[String]("position") {
    val absolute = this := "absolute"
    val relative = this := "relative"
  }

  object flexDirection extends NativeStyle[String]("flexDirection") {
    val row = this := "row"
    val column = this := "column"
  }

  object flexWrap extends NativeStyle[String]("flexWrap") {
    val wrap = this := "wrap"
    val nowrap = this := "nowrap"
  }

  object alignItems extends NativeStyle[String]("alignItems") {
    val center = this := "center"
    val flexStart = this := "flex-start"
    val flexEnd = this := "flex-end"
    val stretch = this := "stretch"
  }

  object alignSelf extends NativeStyle[String]("alignSelf") {
    val auto = this := "auto"
    val center = this := "center"
    val flexStart = this := "flex-start"
    val flexEnd = this := "flex-end"
    val stretch = this := "stretch"
  }

  object justifyContent extends NativeStyle[String]("justifyContent") {
    val spaceBetween = this := "space-between"
    val center = this := "center"
    val flexStart = this := "flex-start"
    val flexEnd = this := "flex-end"
    val spaceAround = this := "space-around"
  }


}


trait TextStyles {

  val color = new NativeStyle[String]("color")
  val containerBackgroundColor = new NativeStyle[String]("containerBackgroundColor")
  val fontFamily = new NativeStyle[String]("fontFamily")
  val fontSize = new NativeStyle[Double]("fontSize")
  val lineHeight = new NativeStyle[Double]("lineHeight")

  object fontStyle extends NativeStyle[String]("fontStyle") {
    val normal = this := "normal"
    val italic = this := "italic"
  }

  object textAlign extends NativeStyle[String]("textAlign") {
    val auto = this := "auto"
    val left = this := "left"
    val right = this := "right"
    val center = this := "center"
  }

  object writingDirection extends NativeStyle[String]("writingDirection") {
    val auto = this := "auto"
    val ltr = this := "ltr"
    val rtl = this := "trl"
  }

  object fontWeight extends NativeStyle[String]("fontWeight") {
    val normal = this := "normal"
    val bold = this := "bold"
    val _100 = this := "100"
    val _200 = this := "200"
    val _300 = this := "300"
    val _400 = this := "400"
    val _500 = this := "500"
    val _600 = this := "600"
    val _700 = this := "700"
    val _800 = this := "800"
    val _900 = this := "900"
  }

}


trait ImageStyles {

  val backgroundColor = new NativeStyle[String]("backgroundColor")
  val borderColor = new NativeStyle[String]("borderColor")
  val tintColor = new NativeStyle[String]("tintColor")
  val borderRadius = new NativeStyle[Double]("borderRadius")
  val opacity = new NativeStyle[Double]("opacity")
  val resizeMode = new NativeStyle[String]("resizeMode")

}

trait ViewStyles {

  val borderBottomColor = new NativeStyle[String]("borderBottomColor")
  val borderLeftColor = new NativeStyle[String]("borderLeftColor")
  val borderRightColor = new NativeStyle[String]("borderRightColor")
  val borderTopColor = new NativeStyle[String]("borderTopColor")

  object borderStyle extends NativeStyle[String]("borderStyle") {
    val solid = this := "solid"
    val dotted = this := "dotted"
    val dashed = this := "dashed"
  }


  object overflow extends NativeStyle[String]("overflow") {
    val visible = this := "visible"
    val hidden = this := "hidden"
  }

  val rotation = new NativeStyle[Double]("rotation")
  val scaleX = new NativeStyle[Double]("scaleX")
  val scaleY = new NativeStyle[Double]("scaleY")
  val shadowOpacity = new NativeStyle[Double]("shadowOpacity")
  val shadowRadius = new NativeStyle[Double]("shadowRadius")
  val translateX = new NativeStyle[Double]("translateX")
  val translateY = new NativeStyle[Double]("translateY")
  val shadowColor = new NativeStyle[String]("shadowColor")

  case class ShadowOffset(height: Double, width: Double) {
    def toJson = json(height = height, width = width)
  }

  val shadowOffset = new NativeStyle[js.Object]("shadowOffset")
  val transformMatrix = new NativeStyle[js.Array[Double]]("transformMatrix")
  val borderTopLeftRadius = new NativeStyle[Double]("borderTopLeftRadius")
  val borderTopRightRadius = new NativeStyle[Double]("borderTopRightRadius")

}

trait Transforms {
  val transform = new NativeStyle[js.Array[js.Dynamic]]("transform")

}