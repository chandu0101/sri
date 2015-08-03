package chandu0101.scalajs.sri.web.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenMap

trait WebStyleSheet extends WebStyleAttrs {


  /** if duplicate attrs found then last one wins */
  @inline def styleE(maps: js.Dictionary[Any]*)(v: WebStylePair*) = {
    maps.fold(js.Dictionary.empty[Any])((d1, d2) => d1.++(d2).toJSDictionary)
      .++(style(v: _*))
      .toJSDictionary
  }

  @inline def style(v: WebStylePair*): js.Dictionary[Any] = {
    val p = js.Dictionary.empty[Any]
    v.foreach(t => p.update(t.name, t.value))
    p
  }

  /**
   * use this method when you copying mobile style to web styles
   * in mobile styles padding : 10 is perfectly fine , but in web it should be padding : "10px"
   * @param v
   * @return
   */
  @inline def styleM(v: WebStylePair*): js.Dictionary[Any] = {
    val p = js.Dictionary.empty[Any]
    v.foreach(t => {
      val v: Any = if (specials.contains(t.name) && t.value.isInstanceOf[Double]) s"${t.value}px" else t.value
      p.update(t.name, v)
    })
    p
  }


  lazy val specials = Set(borderRadius.name,
    width.name,
    margin.name,
    marginLeft.name,
    marginRight.name,
    marginBottom.name,
    marginTop.name,
    height.name,
    borderWidth.name,
    borderBottomWidth.name,
    borderRightWidth.name,
    borderLeftWidth.name,
    borderTopWidth.name,
    borderBottomLeftRadius.name,
    borderBottomRightRadius.name,
    padding.name,
    paddingBottom.name,
    paddingLeft.name,
    paddingRight.name,
    paddingTop.name)

}
