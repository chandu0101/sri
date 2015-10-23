package sri.test

import sri.test.components.{HelloStatelessChildren, HelloStateless}

import scala.scalajs.js

class StatelessFunctionComponentsTest extends BaseTest {

  test("should render stateless component") {
    val vdom = getRenderedOutput(HelloStateless("hi"))
    assert(vdom.propsDynamic.testID.toString == "st-test")
    assert(vdom.props.children.toString == "hi")
  }

  test("should render stateless component with children") {
    val vdom = getRenderedOutput(HelloStatelessChildren("hi")("stateless children"))
    assert(vdom.propsDynamic.testID.toString == "st-test")
    val children = vdom.props.children.asInstanceOf[js.Array[String]]
    assert(children.head == "hi")
    assert(children.last == "stateless children")
  }

}
