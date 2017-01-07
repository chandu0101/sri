package sri.universal.styles

import sri.universal.apis.AnimatedValue

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.|


trait NativeAttrs extends FlexBoxStyles with TextStyles with ImageStyles with ViewStyles with Transforms

object NativeAttrs extends NativeAttrs

trait FlexBoxStyles {

  val flex = new NativeStyle[Double | AnimatedValue]("flex")
  val flexBasis = new NativeStyle[Double | AnimatedValue]("flexBasis")
  val flexShrink = new NativeStyle[Double | AnimatedValue]("flexShrink")
  val flexGrow = new NativeStyle[Double | AnimatedValue]("flexGrow")
  val flexOne = flex := 1

  val borderBottomWidth = new NativeStyle[Double | AnimatedValue]("borderBottomWidth")
  val borderLeftWidth = new NativeStyle[Double | AnimatedValue]("borderLeftWidth")
  val borderRightWidth = new NativeStyle[Double | AnimatedValue]("borderRightWidth")
  val borderTopWidth = new NativeStyle[Double | AnimatedValue]("borderTopWidth")
  val borderWidth = new NativeStyle[Double | AnimatedValue]("borderWidth")
  val bottom = new NativeStyle[Double | AnimatedValue]("bottom")
  val height = new NativeStyle[Double | AnimatedValue]("height")
  val left = new NativeStyle[Double | AnimatedValue]("left")
  val margin = new NativeStyle[Double | AnimatedValue]("margin")
  val marginBottom = new NativeStyle[Double | AnimatedValue]("marginBottom")
  val marginHorizontal = new NativeStyle[Double | AnimatedValue]("marginHorizontal")
  val marginLeft = new NativeStyle[Double | AnimatedValue]("marginLeft")
  val marginRight = new NativeStyle[Double | AnimatedValue]("marginRight")
  val marginTop = new NativeStyle[Double | AnimatedValue]("marginTop")
  val marginVertical = new NativeStyle[Double | AnimatedValue]("marginVertical")
  val maxHeight = new NativeStyle[Double | AnimatedValue]("maxHeight")
  val maxWidth = new NativeStyle[Double | AnimatedValue]("maxWidth")
  val minHeight = new NativeStyle[Double | AnimatedValue]("minHeight")
  val minWidth = new NativeStyle[Double | AnimatedValue]("minWidth")
  val padding = new NativeStyle[Double | AnimatedValue]("padding")
  val paddingBottom = new NativeStyle[Double | AnimatedValue]("paddingBottom")
  val paddingHorizontal = new NativeStyle[Double | AnimatedValue]("paddingHorizontal")
  val paddingLeft = new NativeStyle[Double | AnimatedValue]("paddingLeft")
  val paddingRight = new NativeStyle[Double | AnimatedValue]("paddingRight")
  val paddingTop = new NativeStyle[Double | AnimatedValue]("paddingTop")
  val paddingVertical = new NativeStyle[Double | AnimatedValue]("paddingVertical")
  val right = new NativeStyle[Double | AnimatedValue]("right")
  val top = new NativeStyle[Double | AnimatedValue]("top")
  val width = new NativeStyle[Double | AnimatedValue]("width")
  val zIndex = new NativeStyle[Double | AnimatedValue]("zIndex")
  val letterSpacing = new NativeStyle[Double | AnimatedValue]("letterSpacing")

  object overflow extends NativeStyle[String]("overflow") {
    val visible = this := "visible"
    val hidden = this := "hidden"
    val scroll = this := "scroll"
  }

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
  val fontSize = new NativeStyle[Double | AnimatedValue]("fontSize")
  val lineHeight = new NativeStyle[Double | AnimatedValue]("lineHeight")
  val textShadowOffset = new NativeStyle[js.Dynamic]("textShadowOffset")
  val textShadowRadius = new NativeStyle[Double | AnimatedValue]("textShadowRadius")
  val textShadowColor = new NativeStyle[String]("textShadowColor")
  val textDecorationLine = new NativeStyle[String]("textDecorationLine")

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

  object textAlignVertical extends NativeStyle[String]("textAlignVertical") {
    val auto = this := "auto"
    val top = this := "top"
    val bottom = this := "bottom"
    val center = this := "center"
  }

  object lineBreakMode extends NativeStyle[String]("lineBreakMode") {
    val clipping = this := "clipping"
    val wordWrapping = this := "word-wrapping"
    val charWrapping = this := "char-wrapping"
    val truncatingHead = this := "truncating-head"
    val truncatingMiddle = this := "truncating-middle"
    val truncatingTail = this := "truncating-tail"
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
  val overlayColor = new NativeStyle[String]("overlayColor")
  val borderRadius = new NativeStyle[Double | AnimatedValue]("borderRadius")
  val opacity = new NativeStyle[Double | AnimatedValue]("opacity")
  val resizeMode = new NativeStyle[String]("resizeMode")

}

trait ViewStyles {

  val aspectRatio = new NativeStyle[Double]("aspectRatio")
  val borderBottomColor = new NativeStyle[String]("borderBottomColor")
  val borderLeftColor = new NativeStyle[String]("borderLeftColor")
  val borderRightColor = new NativeStyle[String]("borderRightColor")
  val borderTopColor = new NativeStyle[String]("borderTopColor")

  object borderStyle extends NativeStyle[String]("borderStyle") {
    val solid = this := "solid"
    val dotted = this := "dotted"
    val dashed = this := "dashed"
  }

  val rotation = new NativeStyle[Double | AnimatedValue]("rotation")
  val scaleX = new NativeStyle[Double | AnimatedValue]("scaleX")
  val scaleY = new NativeStyle[Double | AnimatedValue]("scaleY")
  val shadowOpacity = new NativeStyle[Double | AnimatedValue]("shadowOpacity")
  val shadowRadius = new NativeStyle[Double | AnimatedValue]("shadowRadius")
  val translateX = new NativeStyle[Double | AnimatedValue]("translateX")
  val translateY = new NativeStyle[Double | AnimatedValue]("translateY")
  val elevation = new NativeStyle[Double | AnimatedValue]("elevation")
  val shadowColor = new NativeStyle[String]("shadowColor")

  case class ShadowOffset(height: Double, width: Double) {
    def toJson = json(height = height, width = width)
  }

  val shadowOffset = new NativeStyle[js.Object]("shadowOffset")
  val transformMatrix = new NativeStyle[js.Array[Double]]("transformMatrix")
  val borderTopLeftRadius = new NativeStyle[Double | AnimatedValue]("borderTopLeftRadius")
  val borderTopRightRadius = new NativeStyle[Double | AnimatedValue]("borderTopRightRadius")
  val borderBottomLeftRadius = new NativeStyle[Double | AnimatedValue]("borderTopRightRadius")
  val borderBottomRightRadius = new NativeStyle[Double | AnimatedValue]("borderTopRightRadius")

}

trait Transforms {
  val transform = new NativeStyle[js.Array[js.Dynamic]]("transform")

}