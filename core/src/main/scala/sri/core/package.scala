package sri

import scala.collection.GenTraversableOnce
import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce
import scala.scalajs.js.`|`

package object core {

  type RefType = js.Function

  type PropsChildrenType = ReactElement | js.Array[ReactChildren]

  type ReactText = String | Double

  type ReactEmpty = Boolean | Null

  type ReactNode = ReactElement | ReactText | js.Array[ReactElement] | js.Array[String] | js.Array[Double] | js.Array[ReactElementU[_, _]]

  implicit def genTravarsableToJSArrayReactElement(elm: GenTraversableOnce[ReactElement]): ReactNode = elm.toJSArray.asInstanceOf[ReactNode]

  implicit class Boolean_Ext_Methods(val value: Boolean) extends AnyVal {
    def ?=(elm: => ReactNode): ReactNode = if (value) elm else null
  }

  trait CoreAll extends ElementFactory

  object all extends CoreAll

}