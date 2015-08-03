package chandu0101.scalajs.sri.web.styles

import org.scalatest.FunSuite

import scala.scalajs.js
import scala.scalajs.js.JSON.stringify

object styles extends WebStyleSheet {

  val s1 = style(display.flex,
    borderRadius := 45,
    width := "45px")
}

class WebStylesTest extends FunSuite {

  test("convert styles to object") {
    val s1js = js.Dictionary[Any]("display" -> "flex",
      "borderRadius" -> 45,
      "width" -> "45px")
    assert(stringify(styles.s1) == stringify(s1js))
  }


}
