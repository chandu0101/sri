package sri.web

import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/*
 * Scalatags version = cdf3d4797236a7d31dc413c1c8ba45466ea4a1c6
 */
package object vdom {

  type TopNode = dom.Element

  val EmptyTag: TagMod = new TagMod {
    def applyTo(t: Builder) = ()
  }

  trait Tags extends HtmlTags with Extra.Tags
  trait JustTags extends Tags { final def svg = SvgTags }
  object Tags extends JustTags

  trait Attrs extends HtmlAttrs with Extra.Attrs with HtmlStyles
  trait JustAttrs extends Attrs { final def svg = SvgAttrs }
  object Attrs extends JustAttrs

  // If you're wondering why abstract class instead of trait, https://issues.scala-lang.org/browse/SI-4767
  abstract class Base extends Implicits {
    final type ReactTagOf[+N <: TopNode] = sri.web.vdom.ReactTagOf[N]
    final type ReactTag = sri.web.vdom.ReactTagOf[TopNode]
    final type TagMod = sri.web.vdom.TagMod
    final type ReactAttr = sri.web.vdom.ReactAttr
    final type ReactStyle = sri.web.vdom.ReactStyle

    @inline final def TagMod = sri.web.vdom.TagMod
    @inline final def EmptyTag = sri.web.vdom.EmptyTag
    @inline final def ReactAttr = sri.web.vdom.ReactAttr
    @inline final def ReactStyle = sri.web.vdom.ReactStyle
  }

  object all extends Base with Tags with Attrs {
    object svg extends SvgTags with SvgAttrs
    @inline def keyAttr = key
    @inline def refAttr = ref
  }

  object prefix_<^ extends Base {
    @inline def < = Tags
    @inline def ^ = Attrs
  }

  object svg {
    object all extends Base with SvgTags with SvgAttrs

    object prefix_<^ extends Base {
      @inline def < = SvgTags
      @inline def ^ = SvgAttrs
    }
  }
}