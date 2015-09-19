package chandu0101.scalajs.sri.core

import scala.scalajs.js

object ElementFactory {

  def getComponentFactory[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }

  def getComponentFactory[P, S](ctor: ReactComponentConstructor[P,S]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }

  def getTypedConstructor[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    ctor.asInstanceOf[ReactComponentConstructor[P, S]]
  }

  def getStatelessFactory[P](fn : js.Function1[P,ReactElement]) = React.createFactory((props: JSProps[P]) => fn(props.sprops)).asInstanceOf[ReactComponentFactory[P,_]]

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
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, props),
      children: _*)


  def createElementNoPropsWithChildren[P, S](factory: ReactComponentFactory[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: RefType = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, ()),
      children: _*)



}
