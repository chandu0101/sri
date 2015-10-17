package sri.test

import sri.core.ReactElement

import scala.scalajs.js

@js.native
object ReactTestUtils  extends js.Object{

  val Simulate : js.Dynamic = js.native

  def renderIntoDocument(instance : ReactElement) : js.Dynamic = js.native

  def isElement(element : ReactElement) : Boolean = js.native

  def createRenderer() : ReactShallowRenderer = js.native
}


@js.native
trait ReactShallowRenderer extends js.Object {

  def render(element : ReactElement) : js.Dynamic = js.native

  def getRenderOutput() : js.Dynamic = js.native
}