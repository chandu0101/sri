package sri.web

import sri.core._

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}

package object vdom {

  @inline
  def addJsObjects(in: js.Object, extra: js.Object) = {
    val extraDict = extra.asInstanceOf[js.Dictionary[js.Any]]
    for (key <- extraDict.keys) {
      val v = extraDict(key)
      if (!js.isUndefined(v)) in.asInstanceOf[js.Dynamic].updateDynamic(key)(v)
    }
  }

  /**
   *
   * // Production mode
      // http://babeljs.io/blog/2015/03/31/5.0.0/#inline-elements

      // Logic here taken from:
      // https://github.com/babel/babel/blob/master/packages/babel-helpers/src/helpers.js
      // https://github.com/babel/babel/tree/master/packages/babel-plugin-transform-react-inline-elements/test/fixtures/inline-elements
    https://github.com/japgolly/scalajs-react/blob/master/core/src/main/scala/japgolly/scalajs/react/vdom/Builder.scala
   * @param tag
   * @param props
   * @param children
   * @return
   */
  @inline
  def inlineReactElement(tag: String, props: js.Object, children: ReactNode*): ReactElement = {
    val ref = props.asInstanceOf[js.Dynamic].ref.asInstanceOf[js.UndefOr[js.Any]]
    if (ref.isDefined)
      React.createElement(tag, props, children: _*)
    else {

      val REACT_ELEMENT_TYPE: js.Any =
        try
          js.Dynamic.global.Symbol.`for`("react.element")
        catch {
          case _: Throwable => 0xeac7
        }
      val key = props.asInstanceOf[js.Dynamic].key.asInstanceOf[js.UndefOr[js.Any]]

      val clen = children.length
      if (clen != 0) {
        val c: js.Any = if (clen == 1) children(0).asInstanceOf[js.Any] else (children.toJSArray)
        props.asInstanceOf[js.Dynamic].updateDynamic("children")(c)
      }

      json(
        `$$typeof` = REACT_ELEMENT_TYPE,
        `type` = tag,
        key = key.fold(null: js.Any)("" + _),
        ref = null,
        props = props,
        _owner = null)
        .asInstanceOf[ReactElement]
    }

  }

  /* this works here, but not in the general case!
 * (see https://github.com/scala-js/scala-js/pull/2070 )
 */
  //TODO We need to find a better solution here
  private[vdom] implicit def UnionEvidence[A: ClassTag, B: ClassTag](ab: A | B)(implicit eva: A => js.Any, evb: B => js.Any): js.Any =
    ab match {
      case a: A => eva(a)
      case b: B => evb(b)
    }

  object htmltags extends HtmlTagsInline

  object htmltagsPrefix_< {
    @inline def < = htmltags
  }

  object htmltagsNoInline extends HtmlTags

  object htmltagsNoInlinePrefix_< {
    @inline def < = htmltagsNoInline
  }

}
