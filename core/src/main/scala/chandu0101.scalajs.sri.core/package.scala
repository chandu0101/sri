package chandu0101.scalajs.sri

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

package object core {

  type RefType = String | js.Function

  type PropsChildrenType = ReactElement | js.Array[ReactChildren]

  type ReactNode = String | ReactElement | Double

  /** Core Factory methods */
  def createComponent[P, S](key: js.UndefOr[String] = js.undefined,
                               ref: RefType = null,
                               props: P,
                               instance: => ReactComponent[P, S]) = createComponentC(key, ref, props, instance)(Nil)

  def createComponentC[P, S](key: js.UndefOr[String] = js.undefined,
                                ref: RefType = null,
                                props: P,
                                instance: => ReactComponent[P, S]): Traversable[ReactElement] => ReactComponentU[P, S] =
    (children: Traversable[ReactElement]) => React.createElement(() => instance,
    JSProps(key, if (ref != null) ref else js.undefined, props),
    children.toJSArray).asInstanceOf[ReactComponentU[P, S]]


  case class CoreFactory[P,S](instance :ReactComponent[P, S]) {

    var vProps : P = _
    var vKey : js.UndefOr[String] = js.undefined
    var vRef : RefType = null
    var vChildren : js.Array[ReactElement] = null

    def props(props : P) = {
      vProps = props
      this
    }

    def key(key : js.UndefOr[String]) = {
      vKey = key
      this
    }

    def ref(ref : RefType) = {
      vRef = ref
      this
    }

    def children(c : ReactElement*) = {
      vChildren = c.toJSArray
      this
    }

    def build = React.createElement(() => instance,
      JSProps(vKey, if (vRef != null) vRef else js.undefined, vProps),
      vChildren).asInstanceOf[ReactComponentU[P, S]]

  }


}