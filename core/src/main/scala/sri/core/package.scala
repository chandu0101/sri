package sri

import scala.collection.GenTraversableOnce
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g}
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
    def ?=(elm: => ReactNode): ReactElement = if (value) elm.asInstanceOf[ReactElement] else null
  }

  implicit class UndefOr_Ext_Methods(val value: js.UndefOr[_]) extends AnyVal {
    def isUndefinedOrNull: Boolean = value.isEmpty || value == null

    def isDefinedAndNotNull: Boolean = value.isDefined && value != null
  }

  implicit class String_Ext_Methods(val value: String) extends AnyVal {

    def removeForwardSlashes = if (value != null) value.replaceAll("/", "") else value

    def removeTrailingSlash = if (value != null) value.replaceAll("/$", "") else value
  }

  trait CoreAll extends ElementFactory with ElementFactoryLegacy {
    @inline def load[T](lib: String): T = g.require(lib).asInstanceOf[T]

    @inline def loadDynamic(lib: String): js.Dynamic = load[js.Dynamic](lib)

  }

  object all extends CoreAll

}