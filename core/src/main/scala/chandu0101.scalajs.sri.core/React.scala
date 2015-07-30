package sri

import scala.scalajs.js
import scala.scalajs.js.{undefined, UndefOr}
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}
import scalajs.js.Dynamic.{literal => json}

object React extends js.Object{

  def createClass(specification : js.Object) : ReactClass = js.native

  def createElement(tpe : js.Any,props : js.Any = ???,children : js.Any = ???) : ReactElement = js.native

  def cloneElement(element : ReactElement,props : js.Any = ???,children : js.Any = ???) : ReactElement = js.native

  def createFactory(tpe : js.Any) : js.Dynamic = js.native

  def render(elm : ReactElement,dom : js.Any,callback : js.Function = ???) : js.Any = js.native
}


trait ReactElement extends js.Object

trait ReactClass extends js.Object


trait JSProps[T] extends js.Object {
  var key : UndefOr[String] = js.native
  var ref : UndefOr[String] = js.native
  var sinstance : T = js.native
}

object JSProps {

  def apply[T](key : UndefOr[String] = undefined,ref : UndefOr[String] = undefined,sinstance : T ) = {
    val dict = js.Dictionary[Any]("sinstance" -> sinstance)
    key.foreach(v => dict.update("key",v))
    ref.foreach(v => dict.update("ref",v))
    dict.asInstanceOf[JSProps[T]]
  }

}


@JSName("React.Component")
class ReactComponent[P,S] extends js.Object {

 @JSName("props")  var jsProps : JSProps[P] = js.native

  def setState(newState : S) : Unit = js.native

  def forceUpdate() : Unit = js.native

  def componentDidMount() : Unit = js.native

}

