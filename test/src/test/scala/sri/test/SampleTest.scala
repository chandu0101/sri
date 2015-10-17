package sri.test

import org.scalatest.FunSuite
import sri.core.React
import sri.test.components.Hello

import scala.scalajs.js.JSON

class SampleTest extends FunSuite{

  test("basic") {
    val shallowRendere = ReactTestUtils.createRenderer()
    shallowRendere.render(Hello())
    val component = shallowRendere.getRenderOutput()
    println(s"component babe ${JSON.stringify(component)}")
  }
}
