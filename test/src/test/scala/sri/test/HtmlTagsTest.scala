package sri.test

import org.scalajs.dom
import sri.core.ReactElement
import sri.test.components.RefsTestComponent
import sri.web.ReactDOM
import sri.web.all._
import sri.web.vdom.htmltagsNoInline._


//class HtmlTagsTest extends BaseTest {
//
//  var rootNode: dom.Element = null
//
//  def html = rootNode.innerHTML
//
//  def render(element: ReactElement) = ReactDOM.render(element, rootNode)
//
//  before {
//    rootNode = dom.window.document.createElement("div")
//  }
//
//  after {
//    ReactDOM.unmountComponentAtNode(rootNode)
//  }
//
//  test("script") {
//    render(script(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<script data-reactroot=\"\" id=\"sri-web\">child</script>")
//  }
//
//  test("abbr") {
//    render(abbr(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<abbr data-reactroot=\"\" id=\"sri-web\">child</abbr>")
//  }
//
//  test("a") {
//    render(a(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<a data-reactroot=\"\" id=\"sri-web\">child</a>")
//  }
//
//  test("em") {
//    render(em(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<em data-reactroot=\"\" id=\"sri-web\">child</em>")
//  }
//
//  test("menuitem") {
//    render(menuitem(id = "sri-web"))
//    val prefix = """<menuitem data-reactroot="" id="sri-web""""
//    assert(
//      html == prefix + "></menuitem>" ||
//        html == prefix + "/>"
//    )
//  }
//
//  test("article") {
//    render(article(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<article data-reactroot=\"\" id=\"sri-web\">child</article>")
//  }
//
//  test("output") {
//    render(output(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<output data-reactroot=\"\" id=\"sri-web\">child</output>")
//  }
//
//  test("code") {
//    render(code(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<code data-reactroot=\"\" id=\"sri-web\">child</code>")
//  }
//
//  test("audio") {
//    render(audio(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<audio data-reactroot=\"\" id=\"sri-web\">child</audio>")
//  }
//
//  test("map") {
//    render(map(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<map data-reactroot=\"\" id=\"sri-web\">child</map>")
//  }
//
//  test("header") {
//    render(header(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<header data-reactroot=\"\" id=\"sri-web\">child</header>")
//  }
//
//  test("dl") {
//    render(dl(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<dl data-reactroot=\"\" id=\"sri-web\">child</dl>")
//  }
//
//  test("meta") {
//    render(meta(id = "sri-web"))
//    val prefix = """<meta data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("s") {
//    render(s(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<s data-reactroot=\"\" id=\"sri-web\">child</s>")
//  }
//
//  test("dfn") {
//    render(dfn(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<dfn data-reactroot=\"\" id=\"sri-web\">child</dfn>")
//  }
//
//  test("blockquote") {
//    render(blockquote(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<blockquote data-reactroot=\"\" id=\"sri-web\">child</blockquote>")
//  }
//
//  test("del") {
//    render(del(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<del data-reactroot=\"\" id=\"sri-web\">child</del>")
//  }
//
//  test("dd") {
//    render(dd(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<dd data-reactroot=\"\" id=\"sri-web\">child</dd>")
//  }
//
//  test("hr") {
//    render(hr(id = "sri-web"))
//    val prefix = """<hr data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("menu") {
//    render(menu(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<menu data-reactroot=\"\" id=\"sri-web\">child</menu>")
//  }
//
//  test("form") {
//    render(form(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<form data-reactroot=\"\" id=\"sri-web\">child</form>")
//  }
//
//  test("meter") {
//    render(meter(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<meter data-reactroot=\"\" id=\"sri-web\">child</meter>")
//  }
//
//  test("textarea") {
//    render(textarea(id = "sri-web")())
//    assert(rootNode.innerHTML == "<textarea data-reactroot=\"\" id=\"sri-web\"></textarea>")
//  }
//
//  test("rp") {
//    render(rp(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<rp data-reactroot=\"\" id=\"sri-web\">child</rp>")
//  }
//
//  test("embed") {
//    render(embed(id = "sri-web"))
//    val prefix = """<embed data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("canvas") {
//    render(canvas(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<canvas data-reactroot=\"\" id=\"sri-web\">child</canvas>")
//  }
//
//  test("picture") {
//    render(picture(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<picture data-reactroot=\"\" id=\"sri-web\">child</picture>")
//  }
//
//  test("video") {
//    render(video(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<video data-reactroot=\"\" id=\"sri-web\">child</video>")
//  }
//
//  test("p") {
//    render(p(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<p data-reactroot=\"\" id=\"sri-web\">child</p>")
//  }
//
//  test("span") {
//    render(span(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<span data-reactroot=\"\" id=\"sri-web\">child</span>")
//  }
//
//  test("track") {
//    render(track(id = "sri-web"))
//    val prefix = """<track data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>" || html == prefix + "></track>")
//  }
//
//  test("nav") {
//    render(nav(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<nav data-reactroot=\"\" id=\"sri-web\">child</nav>")
//  }
//
//  test("link") {
//    render(link(id = "sri-web"))
//    val prefix = """<link data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("button") {
//    render(button(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<button data-reactroot=\"\" id=\"sri-web\">child</button>")
//  }
//
//  test("cite") {
//    render(cite(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<cite data-reactroot=\"\" id=\"sri-web\">child</cite>")
//  }
//
//  test("ol") {
//    render(ol(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<ol data-reactroot=\"\" id=\"sri-web\">child</ol>")
//  }
//
//  test("h3") {
//    render(h3(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h3 data-reactroot=\"\" id=\"sri-web\">child</h3>")
//  }
//
//  test("strong") {
//    render(strong(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<strong data-reactroot=\"\" id=\"sri-web\">child</strong>")
//  }
//
//  test("datalist") {
//    render(datalist(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<datalist data-reactroot=\"\" id=\"sri-web\">child</datalist>")
//  }
//
//  test("table") {
//    render(table(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<table data-reactroot=\"\" id=\"sri-web\">child</table>")
//  }
//
//  test("i") {
//    render(i(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<i data-reactroot=\"\" id=\"sri-web\">child</i>")
//  }
//
//  test("kbd") {
//    render(kbd(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<kbd data-reactroot=\"\" id=\"sri-web\">child</kbd>")
//  }
//
//  test("bdo") {
//    render(bdo(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<bdo data-reactroot=\"\" id=\"sri-web\">child</bdo>")
//  }
//
//  test("var") {
//    render(`var`(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<var data-reactroot=\"\" id=\"sri-web\">child</var>")
//  }
//
//  test("option") {
//    render(option(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<option data-reactroot=\"\" id=\"sri-web\">child</option>")
//  }
//
//  test("b") {
//    render(b(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<b data-reactroot=\"\" id=\"sri-web\">child</b>")
//  }
//
//  test("footer") {
//    render(footer(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<footer data-reactroot=\"\" id=\"sri-web\">child</footer>")
//  }
//
//  test("sup") {
//    render(sup(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<sup data-reactroot=\"\" id=\"sri-web\">child</sup>")
//  }
//
//  test("aside") {
//    render(aside(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<aside data-reactroot=\"\" id=\"sri-web\">child</aside>")
//  }
//
//  test("dt") {
//    render(dt(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<dt data-reactroot=\"\" id=\"sri-web\">child</dt>")
//  }
//
//  test("fieldset") {
//    render(fieldset(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<fieldset data-reactroot=\"\" id=\"sri-web\">child</fieldset>")
//  }
//
//  test("h1") {
//    render(h1(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h1 data-reactroot=\"\" id=\"sri-web\">child</h1>")
//  }
//
//  test("br") {
//    render(br(id = "sri-web"))
//    val prefix = """<br data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("base") {
//    render(base(id = "sri-web"))
//    val prefix = """<base data-reactroot="" id="sri-web""""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("noscript") {
//    render(noscript(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<noscript data-reactroot=\"\" id=\"sri-web\">child</noscript>")
//  }
//
//  test("u") {
//    render(u(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<u data-reactroot=\"\" id=\"sri-web\">child</u>")
//  }
//
//  test("div") {
//    render(div(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<div data-reactroot=\"\" id=\"sri-web\">child</div>")
//  }
//
//  test("title") {
//    render(title(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<title data-reactroot=\"\" id=\"sri-web\">child</title>")
//  }
//
//  test("progress") {
//    render(progress(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<progress data-reactroot=\"\" id=\"sri-web\">child</progress>")
//  }
//
//  test("dialog") {
//    render(dialog(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<dialog data-reactroot=\"\" id=\"sri-web\">child</dialog>")
//  }
//
//  test("ul") {
//    render(ul(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<ul data-reactroot=\"\" id=\"sri-web\">child</ul>")
//  }
//
//  test("select") {
//    render(select(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<select data-reactroot=\"\" id=\"sri-web\">child</select>")
//  }
//
//  test("time") {
//    render(time(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<time data-reactroot=\"\" id=\"sri-web\">child</time>")
//  }
//
//  test("input") {
//    render(input(id = "sri-web"))
//    val prefix = "<input data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("param") {
//    render(param(id = "sri-web"))
//    val prefix = "<param data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("h4") {
//    render(h4(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h4 data-reactroot=\"\" id=\"sri-web\">child</h4>")
//  }
//
//  test("optgroup") {
//    render(optgroup(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<optgroup data-reactroot=\"\" id=\"sri-web\">child</optgroup>")
//  }
//
//  //  test("body") {
//  //    render(body(id = "sri-web")("child"))
//  //    assert(rootNode.innerHTML == "<body data-reactroot=\"\" id=\"sri-web\">child</body>")
//  //  }
//
//  test("img") {
//    render(img(id = "sri-web"))
//    val prefix = "<img data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("q") {
//    render(q(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<q data-reactroot=\"\" id=\"sri-web\">child</q>")
//  }
//
//  test("address") {
//    render(address(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<address data-reactroot=\"\" id=\"sri-web\">child</address>")
//  }
//
//  test("source") {
//    render(source(id = "sri-web"))
//    val prefix = "<source data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("summary") {
//    render(summary(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<summary data-reactroot=\"\" id=\"sri-web\">child</summary>")
//  }
//
//  test("wbr") {
//    render(wbr(id = "sri-web"))
//    val prefix = "<wbr data-reactroot=\"\" id=\"sri-web\""
//    assert(html == prefix + ">" || html == prefix + "/>")
//  }
//
//  test("pre") {
//    render(pre(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<pre data-reactroot=\"\" id=\"sri-web\">child</pre>")
//  }
//
//  test("sub") {
//    render(sub(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<sub data-reactroot=\"\" id=\"sri-web\">child</sub>")
//  }
//
//  test("area") {
//    render(area(id = "sri-web"))
//    assert(rootNode.innerHTML matches """<area data-reactroot="" id="sri-web"/?>""")
//  }
//
//  //  test("html") {
//  //    render(html(id = "sri-web")("child"))
//  //    assert(rootNode.innerHTML == "<html data-reactroot=\"\" id=\"sri-web\">child</html>")
//  //  }
//
//  test("ins") {
//    render(ins(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<ins data-reactroot=\"\" id=\"sri-web\">child</ins>")
//  }
//
//  test("figure") {
//    render(figure(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<figure data-reactroot=\"\" id=\"sri-web\">child</figure>")
//  }
//
//  test("main") {
//    render(main(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<main data-reactroot=\"\" id=\"sri-web\">child</main>")
//  }
//
//  test("legend") {
//    render(legend(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<legend data-reactroot=\"\" id=\"sri-web\">child</legend>")
//  }
//
//  test("big") {
//    render(big(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<big data-reactroot=\"\" id=\"sri-web\">child</big>")
//  }
//
//  test("mark") {
//    render(mark(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<mark data-reactroot=\"\" id=\"sri-web\">child</mark>")
//  }
//
//  test("keygen") {
//    render(keygen(id = "sri-web"))
//    val prefix = """<keygen data-reactroot="" id="sri-web""""
//    assert(
//      html == prefix + ">" ||
//        html == prefix + "/>" ||
//        html == prefix + "></keygen>"
//    )
//  }
//
//  test("style") {
//    render(style(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<style data-reactroot=\"\" id=\"sri-web\">child</style>")
//  }
//
//  test("rt") {
//    render(rt(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<rt data-reactroot=\"\" id=\"sri-web\">child</rt>")
//  }
//
//  test("iframe") {
//    render(iframe(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<iframe data-reactroot=\"\" id=\"sri-web\">child</iframe>")
//  }
//
//  test("figcaption") {
//    render(figcaption(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<figcaption data-reactroot=\"\" id=\"sri-web\">child</figcaption>")
//  }
//
//  test("h2") {
//    render(h2(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h2 data-reactroot=\"\" id=\"sri-web\">child</h2>")
//  }
//
//  test("li") {
//    render(li(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<li data-reactroot=\"\" id=\"sri-web\">child</li>")
//  }
//
//  test("h5") {
//    render(h5(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h5 data-reactroot=\"\" id=\"sri-web\">child</h5>")
//  }
//
//  test("samp") {
//    render(samp(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<samp data-reactroot=\"\" id=\"sri-web\">child</samp>")
//  }
//
//  test("small") {
//    render(small(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<small data-reactroot=\"\" id=\"sri-web\">child</small>")
//  }
//
//  test("section") {
//    render(section(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<section data-reactroot=\"\" id=\"sri-web\">child</section>")
//  }
//
//  //  test("head") {
//  //    render(head(id = "sri-web")("child"))
//  //    assert(rootNode.innerHTML == "<head data-reactroot=\"\" id=\"sri-web\">child</head>")
//  //  }
//
//  test("object") {
//    render(`object`(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<object data-reactroot=\"\" id=\"sri-web\">child</object>")
//  }
//
//  test("bdi") {
//    render(bdi(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<bdi data-reactroot=\"\" id=\"sri-web\">child</bdi>")
//  }
//
//  test("details") {
//    render(details(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<details data-reactroot=\"\" id=\"sri-web\">child</details>")
//  }
//
//  test("ruby") {
//    render(ruby(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<ruby data-reactroot=\"\" id=\"sri-web\">child</ruby>")
//  }
//
//  test("hgroup") {
//    render(hgroup(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<hgroup data-reactroot=\"\" id=\"sri-web\">child</hgroup>")
//  }
//
//  test("h6") {
//    render(h6(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<h6 data-reactroot=\"\" id=\"sri-web\">child</h6>")
//  }
//
//  test("label") {
//    render(label(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<label data-reactroot=\"\" id=\"sri-web\">child</label>")
//  }
//
//  test("data") {
//    render(data(id = "sri-web")("child"))
//    assert(rootNode.innerHTML == "<data data-reactroot=\"\" id=\"sri-web\">child</data>")
//  }
//
//  test("table,caption,colgroup,col,thead,tr,th,td,tbody,tfoot") {
//    render(table()(caption()("caption"), colgroup()(col()), thead()(tr()(th()("th"))), tbody()(tr()(td()("td"))), tfoot()("foot")))
//    assert(rootNode.innerHTML matches """<table data-reactroot=""><caption>caption</caption><colgroup><col/?></colgroup><thead><tr><th>th</th></tr></thead><tbody><tr><td>td</td></tr></tbody><tfoot>foot</tfoot></table>""")
//  }
//
//  test("refs") {
//    render(RefsTestComponent())
//    println(s"")
//  }
//
//  test("events") {
//    render(div(onClick = (e : ReactEventH) => assert(e.target.nodeName == "DIV") )())
//    ReactTestUtils.Simulate.click(rootNode.firstChild)
//  }
//
//}