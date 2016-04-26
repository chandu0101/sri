package sri.test

import org.scalajs.dom
import sri.test.router.WebRouterExample._
import sri.test.router.{HomeScreen, WebRouterExample}
import sri.web.ReactDOM
import sri.web.router.Location
import scala.scalajs.js.Dynamic.{literal => json}

class WebRouterTest extends BaseTest {

  var rootNode: dom.Element = null

  def render() = ReactDOM.render(WebRouterExample.router, rootNode)

  before {
    rootNode = dom.document.createElement("div")
  }

  after {
    ReactDOM.unmountComponentAtNode(rootNode)
  }

  test("should render home component on initial render") {
    render()
    assert(rootNode.textContent == "home")
  }

  test("static page with state") {
    render()
    HomeScreen.ctrl.navigateTo(StaticStatePage, state = json(x = 1)) // navigate using WebRouter ctrl
    assert(rootNode.textContent == "Welcome to StaticState Screen, State you passed is : {\"x\":1}")

    WebRouterExample.Config.history.push(new Location(pathname = "/staticstate", state = json(x = 2))) // navigate using history
    assert(rootNode.textContent == "Welcome to StaticState Screen, State you passed is : {\"x\":2}")
  }

  test("static page with query") {
    render()
    HomeScreen.ctrl.navigateTo(StaticQueryPage, query = json(sort = 1)) // navigate using WebRouter ctrl
    assert(rootNode.textContent == """Welcome to StaticQuery Screen, Query you passed is : {"sort":"1"}""")

    WebRouterExample.Config.history.push(new Location(pathname = "/staticquery", query = json(sort = -1))) // navigate using history
    assert(rootNode.textContent == """Welcome to StaticQuery Screen, Query you passed is : {"sort":"-1"}""")
  }

  test("Dyanmic page") {
    render()
    HomeScreen.ctrl.navigateToDynamic(DynamicPage, placeholder = "1") // navigate using WebRouter ctrl
    assert(rootNode.textContent == """Dynamic id passed is  :: 1""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamic/2")) // navigate using history
    assert(rootNode.textContent == """Dynamic id passed is  :: 2""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamic/2hfgh")) // navigate using history
    assert(rootNode.textContent == """Dynamic id passed is  :: -1""")

  }

  test("Dyanmic page with state") {
    render()
    HomeScreen.ctrl.navigateToDynamic(DynamicStatePage, placeholder = "1", state = json(x = 1)) // navigate using WebRouter ctrl
    assert(rootNode.textContent == """Welcome to Dynamic State Screen, Passed Id : 1  and passed State  : {"x":1}""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamicstate/2",state = json(x = 2))) // navigate using history
    assert(rootNode.textContent == """Welcome to Dynamic State Screen, Passed Id : 2  and passed State  : {"x":2}""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamicstate/2hfgh",state = json(x = 3))) // navigate using history
    assert(rootNode.textContent == """Welcome to Dynamic State Screen, Passed Id : -1  and passed State  : {"x":3}""")

  }

  test("Dyanmic page with query") {
    render()
    HomeScreen.ctrl.navigateToDynamic(DynamicQueryPage, placeholder = "1", query = json(x = 1)) // navigate using WebRouter ctrl
    assert(rootNode.textContent == """Welcome to Dynamic Query Screen, Passed Id : 1  and passed Query  : {"x":"1"}""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamicquery/2",query = json(x = 2))) // navigate using history
    assert(rootNode.textContent == """Welcome to Dynamic Query Screen, Passed Id : 2  and passed Query  : {"x":"2"}""")

    WebRouterExample.Config.history.push(new Location(pathname = "/dynamicquery/2hfgh",query = json(x = 3))) // navigate using history
    assert(rootNode.textContent == """Welcome to Dynamic Query Screen, Passed Id : -1  and passed Query  : {"x":"3"}""")

  }

  test("Not found page") {
    render()
    HomeScreen.ctrl.navigateTo(StaticStatePage2) // navigate using WebRouter ctrl
    assert(rootNode.textContent == "home")

    WebRouterExample.Config.history.push(new Location(pathname = "/dyanmic/1/sdd")) // navigate using history
    assert(rootNode.textContent == "home")

  }

}
