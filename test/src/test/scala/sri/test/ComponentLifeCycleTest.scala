package sri.test

import sri.test.components.HelloLifeCycle
import sri.test.components.HelloLifeCycle._

import scala.scalajs.js.JSON
import scala.scalajs.js

class ComponentLifeCycleTest extends BaseTest {

  before {
    willMount = false
    didMount = false
    rendered = false
    willUpdate = false
    didUpdate = false
    shouldUpdate = false
    willReceiveProps = false
  }

  test("test life cycles") {
    val instance = getMountedInstance[HelloLifeCycle.Component](HelloLifeCycle())
    assert(willMount)
    //    assert(didMount == DID_MOUNT) TODO check didMount not called
    assert(rendered)
    assert(!willUpdate)
    assert(!didUpdate)
    assert(!willReceiveProps)
    assert(!shouldUpdate)
    instance.updateState()
    assert(willUpdate)
    assert(didUpdate)
    assert(shouldUpdate)
    
  }


}
