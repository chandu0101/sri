package chandu0101.scalajs.sri.web

import chandu0101.scalajs.sri.core.{ReactJSComponent, React}
import org.scalatest.FunSuite

import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class Hello extends ReactJSComponent

class SampleTest extends FunSuite{


  test("sample") {
    println(s"here here here ${new Hello()}")
    assert(2 == 2)
  }
}
