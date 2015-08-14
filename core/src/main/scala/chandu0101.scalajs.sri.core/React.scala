package chandu0101.scalajs.sri.core

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.{UndefOr, undefined}

trait React extends js.Object {

  def createClass(specification: js.Object): ReactClass = js.native

  def createElement(tpe: js.Any, props: js.Any = ???, children: js.Any = ???): ReactElement = js.native

  def cloneElement(element: ReactElement, props: js.Any = ???, children: js.Any = ???): ReactElement = js.native

//  def createFactory[P,S](tpe: String | ReactClass): js.Dynamic = js.native

//  def createFactory[P,S](cons : () => ReactComponent[P,S]): js.Dynamic = js.native

  def createFactory(tpe: js.Any): js.Dynamic = js.native

  def render(elm: ReactElement, dom: js.Any, callback: js.Function = ???): js.Any = js.native

  def Children: ReactChildren = js.native
}

object React extends React

trait ReactElement extends js.Object {
  def key: UndefOr[String] = js.native

  def ref: UndefOr[RefType] = js.native
}

trait ReactClass extends js.Object


trait JSProps[P] extends js.Object {
  def key: UndefOr[String] = js.native

  def ref: UndefOr[RefType] = js.native

  def sprops: P = js.native

  def children: PropsChildren = js.native
}

object JSProps {
  def apply[P](key: UndefOr[String] = undefined,
               ref: UndefOr[RefType] = undefined,
               sprops: P) = {
    val dict = js.Dictionary[Any]("sprops" -> sprops)
    key.foreach(v => dict.update("key", v))
    ref.foreach(v => dict.update("ref", v))
    dict.asInstanceOf[JSProps[P]]
  }
}

trait JSState[S] extends js.Object {
  var sstate: S = js.native
}

object JSState {
  def apply[S](sstate: S) = js.Dictionary("sstate" -> sstate).asInstanceOf[JSState[S]]
}


trait ReactChildren extends js.Object {

  def map(children: js.Object, fn: js.Function1[js.Object, _]): js.UndefOr[js.Object] = js.native

  def forEach(children: js.Object, fn: js.Function1[js.Object, _]): Unit = js.native

  def count(children: js.Object): Int = js.native

  def only(children: js.Object): js.Object = js.native

}

trait PropsChildren extends ReactElement

// unmounted react element
trait ReactElementU[P, S] extends ReactComponent[P, S] with ReactElement

// mounted react element
trait ReactElementM[P, S] extends ReactComponent[P, S] with ReactElement


@JSName("React.Component")
class ReactJSComponent[P, S] extends js.Object {


  @JSName("props") private[core] var jsProps: JSProps[P] = js.native

  @JSName("state") private[core] var jsState: JSState[S] = js.native

  var refs: js.Dynamic = js.native

  @JSName("setState") def jsSetState(newState: JSState[S]): Unit = js.native

  @JSName("setState") def jsSetState(callback: js.Function2[JSState[S], JSProps[P], JSState[S]]): Unit = js.native

  def forceUpdate(callback: js.Function = ???): Unit = js.native

  def componentWillMount(): Unit = js.native

  def componentDidMount(): Unit = js.native

  def componentWillUnmount(): Unit = js.native

  @JSName("componentWillReceiveProps") def jsComponentWillReceiveProps(nextProps: JSProps[P]): Unit = js.native

  @JSName("shouldComponentUpdate") def jsShouldComponentUpdate(nextProps: JSProps[P], nextState: JSState[S]): Boolean = js.native

  @JSName("componentWillUpdate") def jsComponentWillUpdate(nextProps: JSProps[P], nextState: JSState[S]): Unit = js.native

  @JSName("componentDidUpdate") def jsComponentDidUpdate(prevProps: JSProps[P], prevState: JSState[S]): Unit = js.native

}


@ScalaJSDefined
abstract class ReactComponent[P, S] extends ReactJSComponent[P, S] {

  if (js.isUndefined(jsState) || jsState == null) {
    jsState = js.Dictionary[Any]("sstate" -> null).asInstanceOf[JSState[S]]
  }

  @JSName("sProps")
  @inline
  def props: P = jsProps.sprops

  @JSName("sState")
  @inline
  def state: S = jsState.sstate

  @inline
  def propsDynamic = jsProps.asInstanceOf[js.Dynamic]

  @inline
  def children: PropsChildren = jsProps.children


  @inline
  def initialState(s: S): Unit = {
    jsState = JSState(s)
  }

  @JSName("sSetState")
  @inline
  def setState(newState: S): Unit = {
    jsSetState(JSState(newState))
  }

  @JSName("sSetStateFunc")
  @inline
  def setState(callback: js.Function2[S, P, S]): Unit = {
    jsSetState((s: JSState[S], p: JSProps[P]) => JSState[S](callback(s.sstate, p.sprops)))
  }

  @inline
  def getRef[T](name: String, cls: Class[T]) = {
    refs.selectDynamic(name).asInstanceOf[T]
  }


  def render(): ReactElement

  @JSName("sComponentWillUpdate")
  def componentWillUpdate(nextProps: => P, nextState: => S): Unit = ()

  @JSName("componentWillUpdate")
  override def jsComponentWillUpdate(nextProps: JSProps[P], nextState: JSState[S]): Unit = {
    componentWillUpdate(nextProps.sprops, nextState.sstate)
  }

  @JSName("sComponentWillReceiveProps")
  def componentWillReceiveProps(nextProps: => P): Unit = ()

  @JSName("componentWillReceiveProps")
  override def jsComponentWillReceiveProps(nextProps: JSProps[P]): Unit = {
    componentWillReceiveProps(nextProps.sprops)
  }

}

trait ReactComponentFactory[P,S] extends ReactComponent[P,S] {
  def apply(props : js.Dynamic,children : ReactElement*):ReactElementU[P,S] = js.native
}