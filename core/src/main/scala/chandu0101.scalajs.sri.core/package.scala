package chandu0101.scalajs.sri

import scala.scalajs.js
import scala.scalajs.js.`|`

package object core {

  type RefType = String | js.Function

  type PropsChildrenType = ReactElement | js.Array[ReactChildren]

  type ReactNode = String | ReactElement | Double


  implicit def seqElementToSeqNode(elm : Seq[ReactElement]): Seq[ReactNode] = elm.asInstanceOf[Seq[ReactNode]]


}