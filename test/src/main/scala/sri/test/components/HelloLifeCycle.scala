package sri.test.components

import sri.core.ElementFactory._
import sri.core.{React, ReactComponent}
import sri.universal.ReactUniversal
import sri.universal.components.Text

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}

object HelloLifeCycle {

  var willMount = false

  var willUnMount = false

  var didMount = false

  var willUpdate = false

  var didUpdate = false

  var willReceiveProps = false

  var rendered = false

  var shouldUpdate = false


  @ScalaJSDefined
  class Component extends ReactComponent[String, String] {

    initialState("")

    override def componentWillMount(): Unit = {
      willMount = true
    }

    override def componentDidMount(): Unit = {
      didMount = true
    }

    @JSName("sComponentWillReceiveProps")
    override def componentWillReceiveProps(nextProps: => String): Unit = {
      willReceiveProps = true
    }

    @JSName("sComponentWillUpdate")
    override def componentWillUpdate(nextProps: => String, nextState: => String): Unit = {
        willUpdate = true
    }

    def render() = {
      rendered = true
      Text()("Sample")
    }


    @JSName("sShouldComponentUpdate")
    override def shouldComponentUpdate(nextProps: => String, nextState: => String): Boolean = {
      shouldUpdate = true
      true
    }

    @JSName("sComponentDidUpdate")
    override def componentDidUpdate(prevProps: => String, prevState: => String): Unit = {
      didUpdate = true
    }

    override def componentWillUnmount(): Unit = {
      println(s"*********************** unmount")
    }

    def updateState() = {
      setState("newState")
    }
  }

  val factory = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(factory, "hi", key = "hkey", ref = ref)
}
