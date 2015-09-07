package chandu0101.scalajs.sri.core

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

object ElementFactory {

  def getComponentFactory[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }

  def createElement[P, S](factory: ReactComponentFactory[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: RefType = null
                           ) = createElementWithChildren(factory, props, key, ref)()


  def createElementNoProps[P, S](factory: => ReactComponentFactory[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: RefType = null
                                  ) = createElementNoPropsWithChildren(factory, key, ref)()


  def createElementWithChildren[P, S](factory: => ReactComponentFactory[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: RefType = null
                                       )(children: ReactNode*): ReactElementU[P, S] =
    factory.asInstanceOf[js.Dynamic](
      JSProps(key, if (ref != null) ref else js.undefined, props),
      children.toJSArray).asInstanceOf[ReactElementU[P, S]]


  def createElementNoPropsWithChildren[P, S](factory: ReactComponentFactory[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: RefType = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    factory.asInstanceOf[js.Dynamic](
      JSProps(key, if (ref != null) ref else js.undefined, ()),
      children.toJSArray).asInstanceOf[ReactElementU[P, S]]


}
