package sri.test

import org.scalajs.dom
import sri.core.ReactElement
import sri.test.components.RefsTestComponent
import sri.web.ReactDOM
import sri.web.all._
import sri.web.vdom.svgtagsNoInline._


//class SvgTagsTest extends BaseTest {
//
//  var rootNode: dom.Element = null
//
//  def html = rootNode.innerHTML
//
//  def render(element: ReactElement) = ReactDOM.render(element, rootNode)
//
//  before {
//    rootNode = dom.document.createElement("div")
//  }
//
//  after {
//    ReactDOM.unmountComponentAtNode(rootNode)
//  }
//
//
//
//  test("feGaussianBlur") {
//    render(feGaussianBlur(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fegaussianblur data-reactroot=\"\" id=\"sri-web\">child</fegaussianblur>")
//  }
//
//
//  test("feComponentTransfer") {
//    render(feComponentTransfer(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fecomponenttransfer data-reactroot=\"\" id=\"sri-web\">child</fecomponenttransfer>")
//  }
//
//
//  test("feTurbulence") {
//    render(feTurbulence(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feturbulence data-reactroot=\"\" id=\"sri-web\">child</feturbulence>")
//  }
//
//
//  test("meshpatch") {
//    render(meshpatch(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<meshpatch data-reactroot=\"\" id=\"sri-web\">child</meshpatch>")
//  }
//
//
//  test("feMergeNode") {
//    render(feMergeNode(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<femergenode data-reactroot=\"\" id=\"sri-web\">child</femergenode>")
//  }
//
//
//  test("hatchpath") {
//    render(hatchpath(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<hatchpath data-reactroot=\"\" id=\"sri-web\">child</hatchpath>")
//  }
//
//
//  test("svg") {
//    render(svg(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<svg data-reactroot=\"\" id=\"sri-web\">child</svg>")
//  }
//
//
//  test("linearGradient") {
//    render(linearGradient(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<lineargradient data-reactroot=\"\" id=\"sri-web\">child</lineargradient>")
//  }
//
//
//  test("feMerge") {
//    render(feMerge(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<femerge data-reactroot=\"\" id=\"sri-web\">child</femerge>")
//  }
//
//
//  test("feFuncR") {
//    render(feFuncR(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fefuncr data-reactroot=\"\" id=\"sri-web\">child</fefuncr>")
//  }
//
//
//  test("a") {
//    render(aSvg(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<a data-reactroot=\"\" id=\"sri-web\">child</a>")
//  }
//
//
//  test("clipPath") {
//    render(clipPath(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<clippath data-reactroot=\"\" id=\"sri-web\">child</clippath>")
//  }
//
//
//  test("mask") {
//    render(mask(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<mask data-reactroot=\"\" id=\"sri-web\">child</mask>")
//  }
//
//
//  test("feComposite") {
//    render(feComposite(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fecomposite data-reactroot=\"\" id=\"sri-web\">child</fecomposite>")
//  }
//
//
//  test("mpath") {
//    render(mpath(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<mpath data-reactroot=\"\" id=\"sri-web\">child</mpath>")
//  }
//
//
//  test("set") {
//    render(set(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<set data-reactroot=\"\" id=\"sri-web\">child</set>")
//  }
//
//
//  test("feColorMatrix") {
//    render(feColorMatrix(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fecolormatrix data-reactroot=\"\" id=\"sri-web\">child</fecolormatrix>")
//  }
//
//
//  test("feSpotLight") {
//    render(feSpotLight(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fespotlight data-reactroot=\"\" id=\"sri-web\">child</fespotlight>")
//  }
//
//
//  test("desc") {
//    render(desc(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<desc data-reactroot=\"\" id=\"sri-web\">child</desc>")
//  }
//
//
//  test("image") {
//    render(image(id = "sri-web"))
//    val prefix = "<image data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//
//  test("feImage") {
//    render(feImage(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feimage data-reactroot=\"\" id=\"sri-web\">child</feimage>")
//  }
//
//
//  test("hatch") {
//    render(hatch(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<hatch data-reactroot=\"\" id=\"sri-web\">child</hatch>")
//  }
//
//
//  test("polygon") {
//    render(polygon(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<polygon data-reactroot=\"\" id=\"sri-web\">child</polygon>")
//  }
//
//
//  test("animateTransform") {
//    render(animateTransform(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<animatetransform data-reactroot=\"\" id=\"sri-web\">child</animatetransform>")
//  }
//
//
//  test("switch") {
//    render(switch(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<switch data-reactroot=\"\" id=\"sri-web\">child</switch>")
//  }
//
//
//  test("feDiffuseLighting") {
//    render(feDiffuseLighting(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fediffuselighting data-reactroot=\"\" id=\"sri-web\">child</fediffuselighting>")
//  }
//
//
//  test("feConvolveMatrix") {
//    render(feConvolveMatrix(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feconvolvematrix data-reactroot=\"\" id=\"sri-web\">child</feconvolvematrix>")
//  }
//
//
//  test("circle") {
//    render(circle(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<circle data-reactroot=\"\" id=\"sri-web\">child</circle>")
//  }
//
//
//  test("tspan") {
//    render(tspan(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<tspan data-reactroot=\"\" id=\"sri-web\">child</tspan>")
//  }
//
//
//  test("feDropShadow") {
//    render(feDropShadow(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fedropshadow data-reactroot=\"\" id=\"sri-web\">child</fedropshadow>")
//  }
//
//
//  test("stop") {
//    render(stop(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<stop data-reactroot=\"\" id=\"sri-web\">child</stop>")
//  }
//
//
//  test("view") {
//    render(view(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<view data-reactroot=\"\" id=\"sri-web\">child</view>")
//  }
//
//
//  test("discard") {
//    render(discard(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<discard data-reactroot=\"\" id=\"sri-web\">child</discard>")
//  }
//
//
//  test("meshgradient") {
//    render(meshgradient(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<meshgradient data-reactroot=\"\" id=\"sri-web\">child</meshgradient>")
//  }
//
//
//  test("meshrow") {
//    render(meshrow(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<meshrow data-reactroot=\"\" id=\"sri-web\">child</meshrow>")
//  }
//
//
//  test("feDisplacementMap") {
//    render(feDisplacementMap(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fedisplacementmap data-reactroot=\"\" id=\"sri-web\">child</fedisplacementmap>")
//  }
//
//
//  test("path") {
//    render(path(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<path data-reactroot=\"\" id=\"sri-web\">child</path>")
//  }
//
//
//  test("radialGradient") {
//    render(radialGradient(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<radialgradient data-reactroot=\"\" id=\"sri-web\">child</radialgradient>")
//  }
//
//
//  test("feTile") {
//    render(feTile(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fetile data-reactroot=\"\" id=\"sri-web\">child</fetile>")
//  }
//
//
//  test("text") {
//    render(text(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<text data-reactroot=\"\" id=\"sri-web\">child</text>")
//  }
//
//
//  test("feFuncA") {
//    render(feFuncA(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fefunca data-reactroot=\"\" id=\"sri-web\">child</fefunca>")
//  }
//
//
//  test("textPath") {
//    render(textPath(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<textpath data-reactroot=\"\" id=\"sri-web\">child</textpath>")
//  }
//
//
//  test("feBlend") {
//    render(feBlend(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feblend data-reactroot=\"\" id=\"sri-web\">child</feblend>")
//  }
//
//
//  test("marker") {
//    render(marker(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<marker data-reactroot=\"\" id=\"sri-web\">child</marker>")
//  }
//
//
//  test("filter") {
//    render(filter(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<filter data-reactroot=\"\" id=\"sri-web\">child</filter>")
//  }
//
//
//  test("unknown") {
//    render(unknown(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<unknown data-reactroot=\"\" id=\"sri-web\">child</unknown>")
//  }
//
//
//  test("symbol") {
//    render(symbol(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<symbol data-reactroot=\"\" id=\"sri-web\">child</symbol>")
//  }
//
//
//  test("solidcolor") {
//    render(solidcolor(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<solidcolor data-reactroot=\"\" id=\"sri-web\">child</solidcolor>")
//  }
//
//
//  test("fePointLight") {
//    render(fePointLight(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fepointlight data-reactroot=\"\" id=\"sri-web\">child</fepointlight>")
//  }
//
//
//  test("g") {
//    render(g(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<g data-reactroot=\"\" id=\"sri-web\">child</g>")
//  }
//
//
//  test("use") {
//    render(use(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<use data-reactroot=\"\" id=\"sri-web\">child</use>")
//  }
//
//
//  test("animate") {
//    render(animate(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<animate data-reactroot=\"\" id=\"sri-web\">child</animate>")
//  }
//
//
//  test("cursor") {
//    render(cursor(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<cursor data-reactroot=\"\" id=\"sri-web\">child</cursor>")
//  }
//
//
//  test("feFlood") {
//    render(feFlood(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feflood data-reactroot=\"\" id=\"sri-web\">child</feflood>")
//  }
//
//
//  test("polyline") {
//    render(polyline(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<polyline data-reactroot=\"\" id=\"sri-web\">child</polyline>")
//  }
//
//
//  test("metadata") {
//    render(metadata(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<metadata data-reactroot=\"\" id=\"sri-web\">child</metadata>")
//  }
//
//
//  test("line") {
//    render(line(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<line data-reactroot=\"\" id=\"sri-web\">child</line>")
//  }
//
//
//  test("defs") {
//    render(defs(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<defs data-reactroot=\"\" id=\"sri-web\">child</defs>")
//  }
//
//
//  test("feFuncB") {
//    render(feFuncB(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fefuncb data-reactroot=\"\" id=\"sri-web\">child</fefuncb>")
//  }
//
//
//  test("feFuncG") {
//    render(feFuncG(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fefuncg data-reactroot=\"\" id=\"sri-web\">child</fefuncg>")
//  }
//
//
//  test("feSpecularLighting") {
//    render(feSpecularLighting(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fespecularlighting data-reactroot=\"\" id=\"sri-web\">child</fespecularlighting>")
//  }
//
//
//  test("feOffset") {
//    render(feOffset(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<feoffset data-reactroot=\"\" id=\"sri-web\">child</feoffset>")
//  }
//
//
//  test("feDistantLight") {
//    render(feDistantLight(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fedistantlight data-reactroot=\"\" id=\"sri-web\">child</fedistantlight>")
//  }
//
//
//  test("mesh") {
//    render(mesh(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<mesh data-reactroot=\"\" id=\"sri-web\">child</mesh>")
//  }
//
//
//  test("pattern") {
//    render(pattern(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<pattern data-reactroot=\"\" id=\"sri-web\">child</pattern>")
//  }
//
//
//  test("foreignObject") {
//    render(foreignObject(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<foreignobject data-reactroot=\"\" id=\"sri-web\">child</foreignobject>")
//  }
//
//
//  test("feMorphology") {
//    render(feMorphology(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<femorphology data-reactroot=\"\" id=\"sri-web\">child</femorphology>")
//  }
//
//
//  test("animateMotion") {
//    render(animateMotion(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<animatemotion data-reactroot=\"\" id=\"sri-web\">child</animatemotion>")
//  }
//
//
//  test("ellipse") {
//    render(ellipse(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<ellipse data-reactroot=\"\" id=\"sri-web\">child</ellipse>")
//  }
//
//
//  test("rect") {
//    render(rect(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<rect data-reactroot=\"\" id=\"sri-web\">child</rect>")
//  }
//
//
//}