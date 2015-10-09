package sri.core

import scala.scalajs.js


trait ElementFactory {

  /**
   * add types to js constructor
   * @param ctor
   * @param clz
   * @tparam P
   * @tparam S
   * @return
   */
  def getTypedConstructor[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactJSComponent[P, S]]) = {
    ctor.asInstanceOf[ReactTypedConstructor[P, S]]
  }

  def getStatelessFactory[P](fn: js.Function1[P, ReactElement]) = React.createFactory((props: JSProps[P]) => fn(props.sprops)).asInstanceOf[ReactComponentFactory[P, _]]

  /**
   * helper method to create ReactElements for components with props
   * @param ctor typed constructor
   * @param props props of react component
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElement[P, S](ctor: ReactTypedConstructor[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                           ) = createElementWithChildren(ctor, props, key, ref)()


  /**
   * helper method to create ReactElements for components with no props
   * @param ctor typed constructor
   * @param key
   * @param ref
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoProps[P, S](ctor: ReactTypedConstructor[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                  ) = createElementNoPropsWithChildren(ctor, key, ref)()

  /**
   * helper method to create ReactElements for components with props  and children
   * @param ctor typed constructor
   * @param props
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                       )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, props), children: _*).asInstanceOf[ReactElementU[P, S]]


  /**
   * helper method to create ReactElements for components with no props and children
   * @param ctor typed constructor
   * @param key
   * @param ref
   * @param children
   * @tparam P
   * @tparam S
   * @return
   */
  def createElementNoPropsWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, ()), children: _*).asInstanceOf[ReactElementU[P, S]]


}

object ElementFactory extends ElementFactory