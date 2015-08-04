package chandu0101.scalajs.sri

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

package object core {

  type RefType = String | js.Function

  type PropsChildrenType = ReactElement | js.Array[ReactChildren]

  type ReactNode = String | ReactElement | Double


  // ============== create Elements without builder start ================= ///


  def createElement[P , S ](key: js.UndefOr[String] = js.undefined,
                            ref: RefType = null,
                            props: P,
                            instance: => ReactComponent[P, S]) = createElementC(key, ref, props, instance)(Nil)

  def createElementC[P , S ](key: js.UndefOr[String] = js.undefined,
                             ref: RefType = null,
                             props: P,
                             instance: => ReactComponent[P, S]): Traversable[ReactElement] => ReactElementU[P, S] =
    (children: Traversable[ReactElement]) => React.createElement(() => instance,
      JSProps(key, if (ref != null) ref else js.undefined, props),
      children.toJSArray).asInstanceOf[ReactElementU[P, S]]

  // ============== create Elements without builder end ================= ///

}