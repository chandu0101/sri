package sri

import scala.collection.GenTraversableOnce
import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenTraversableOnce
import scala.scalajs.js.`|`

package object core {

  type RefType = String | js.Function

  type PropsChildrenType = ReactElement | js.Array[ReactChildren]

  type ReactText = String | Double

  type ReactEmpty = Boolean | Null

  type ReactNode = ReactElement | ReactText | js.Array[ReactElement] | js.Array[String] | js.Array[Double] | js.Array[ReactElementU[_, _]]

  //  implicit def seqElementToSeqNode(elm: Seq[ReactElement]): Seq[ReactNode] = elm.asInstanceOf[Seq[ReactNode]]

  implicit def genTravarsableToJSArrayReactElement(elm: GenTraversableOnce[ReactElement]): ReactNode = elm.toJSArray.asInstanceOf[ReactNode]


}