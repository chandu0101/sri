package sri.test

import sri.test.components.{HelloStatelessNoPropsWithChildren, HelloStatelessNoProps, HelloStatelessChildren, HelloStateless}

import scala.scalajs.js

class StatelessFunctionComponentsTest extends BaseTest {

  test("should render stateless component with props") {
    val vdom = getRenderedOutput(HelloStateless("hi"))
    assert(vdom.propsDynamic.testID.toString == "st-test")
    assert(vdom.props.children.toString == "hi")
  }

  test("should render stateless component with props & children") {
    val vdom = getRenderedOutput(HelloStatelessChildren("hi")("stateless children"))
    assert(vdom.propsDynamic.testID.toString == "st-test")
    val children = vdom.props.children.asInstanceOf[js.Array[String]]
    assert(children.head == "hi")
    assert(children.last == "stateless children")
  }

  test("should render stateless component with no props") {
    val vdom = getRenderedOutput(HelloStatelessNoProps())
    assert(vdom.propsDynamic.testID.toString == "st-test")
    assert(vdom.props.children.toString == "no props")
  }

  test("should render stateless component no props and with children") {
    val vdom = getRenderedOutput(HelloStatelessNoPropsWithChildren()("stateless children"))
    assert(vdom.propsDynamic.testID.toString == "st-test")
    val children = vdom.props.children.asInstanceOf[js.Array[String]]
    assert(children.head == "no props")
    assert(children.last == "stateless children")
  }

}
