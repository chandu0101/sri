package chandu0101.scalajs.sri.core

import scala.scalajs.js

object ElementFactory {

  /**
   * creates and returns factory for given component constructor
   * @param ctor
   * @param clz
   * @tparam P
   * @tparam S
   * @return
   */
  def getComponentFactory[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }

  /**
   * creates and returns factory for given typed constructor
   * @param ctor
   * @tparam P
   * @tparam S
   * @return
   */
  def getComponentFactory[P, S](ctor: ReactComponentConstructor[P, S]) = {
    React.createFactory(ctor).asInstanceOf[ReactComponentFactory[P, S]]
  }

  /**
   * adds component props and state types to constructor
   * @param ctor
   * @param clz
   * @tparam P
   * @tparam S
   * @return
   */
  def getTypedConstructor[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    ctor.asInstanceOf[ReactComponentConstructor[P, S]]
  }

  def getStatelessFactory[P](fn: js.Function1[P, ReactElement]) = React.createFactory((props: JSProps[P]) => fn(props.sprops)).asInstanceOf[ReactComponentFactory[P, _]]

  /**
   * helper method to create ReactElements for components with props
   * @param factory component factory created using  getComponentFactory method
   * @param props props of react component
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElement[P, S](factory: ReactComponentFactory[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: RefType = null
                           ) = createElementWithChildren(factory, props, key, ref)()


  /**
   * helper method to create ReactElements for components with no props
   * @param factory component factory created using  getComponentFactory method
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoProps[P, S](factory: => ReactComponentFactory[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: RefType = null
                                  ) = createElementNoPropsWithChildren(factory, key, ref)()

  /**
   * helper method to create ReactElements for components with props  and children
   * @param factory component factory created using  getComponentFactory method
   * @param props
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementWithChildren[P, S](factory: => ReactComponentFactory[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: RefType = null
                                       )(children: ReactNode*): ReactElementU[P, S] =
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, props),
      children: _*)


  /**
   * helper method to create ReactElements for components with no props and children
   * @param factory component factory created using  getComponentFactory method
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoPropsWithChildren[P, S](factory: ReactComponentFactory[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: RefType = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    factory(
      JSProps(key, if (ref != null) ref else js.undefined, ()),
      children: _*)


}
