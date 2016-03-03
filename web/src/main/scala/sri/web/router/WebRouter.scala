package sri.web.router

import org.scalajs.dom
import sri.core._
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined


sealed trait WebPage

trait WebStaticPage extends WebPage

trait WebDynamicPage[T] extends WebPage

case class WebRoute(page: WebPage, component: Any, path: String, parser: js.UndefOr[String => _] = js.undefined, placeholder: js.UndefOr[String] = js.undefined, state: js.UndefOr[js.Object] = js.undefined, search: js.UndefOr[String] = js.undefined, query: js.UndefOr[js.Object] = js.undefined, action: js.UndefOr[String] = js.undefined)

object WebRouter {

  object WebRouterContext {

    @ScalaJSDefined
    class Component extends ReactComponent[RouterState, Unit] {
      def render() = {
        props.location != null ?= props.ctrl.config.renderScene(RouteUtils.getRoute(props.location, props.ctrl))
      }

      def getChildContext() = {
        js.Dictionary("routerctrl" -> props.ctrl)
      }
    }

    case class Props(ctrl: WebRouterCtrl)

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    ctor.childContextTypes = routerContextTypes

    def apply(props: RouterState, key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props, key = key, ref = ref)

  }


  case class RouterState(ctrl: WebRouterCtrl, location: Location)

  @ScalaJSDefined
  class Component extends ReactComponent[Props, RouterState] {

    override def componentWillMount(): Unit = {
      val history = props.config.history
      val ctrl = new WebRouterCtrl(history, props.config)
      initialState(RouterState(ctrl, null))
      unlistenBefore = history.listenBefore((location: Location) => {
        if (props.config.interceptTransition == null) true else props.config.interceptTransition(RouteUtils.getRoute(location, ctrl))
      })
      unlisten = history.listen((loc: Location) => {
        setState(state.copy(location = loc))
      })

    }

    override def render(): ReactElement = {
      WebRouterContext(state)
    }


    override def componentWillUnmount(): Unit = {
      if (unlisten != null) unlisten()
      if (unlistenBefore != null) unlistenBefore()
    }

    var unlisten: js.Function0[_] = null
    var unlistenBefore: js.Function0[_] = null


  }


  case class Props(config: WebRouterConfig)

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(routerConfig: WebRouterConfig) = createElement(ctor, Props(routerConfig))

}

