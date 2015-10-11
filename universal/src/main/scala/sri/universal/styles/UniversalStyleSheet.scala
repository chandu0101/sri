package sri.universal.styles

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenMap


trait UniversalStyleSheet extends NativeAttrs {
  /** if duplicate attrs found then last one wins */
  @inline def styleE(maps: js.Dictionary[Any]*)(v: NativeStylePair[_]*) = {
    maps.fold(js.Dictionary.empty[Any])((d1, d2) => d1.++(d2).toJSDictionary)
      .++(style(v: _*))
      .toJSDictionary
  }

  @inline def style(v: NativeStylePair[_]*): js.Dictionary[Any] = {
    val p = js.Dictionary.empty[Any]
    v.foreach(t => p.update(t.key, t.value))
    p
  }
}

object UniversalStyleSheet extends UniversalStyleSheet {

  val wholeContainer = style(flexOne)
}

class NativeStyle[T](name: String) {
  def :=(v: T) = new NativeStylePair[T](name, v)
}

class NativeStylePair[T](val key: String, val value: T)