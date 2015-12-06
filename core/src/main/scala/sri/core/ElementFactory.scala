package sri.core

import scala.scalajs.js


trait ElementFactory {

  /**
   * add types to js constructor
   */
  def getTypedConstructor[P, S](ctor: js.Dynamic, clz: Class[_ <: ReactComponent[P, S]]) = {
    ctor.asInstanceOf[ReactTypedConstructor[P, S]]
  }


  /**
   * helper method to create ReactElements for components with props
   */
  def createElement[P, S](ctor: ReactTypedConstructor[P, S],
                          props: P,
                          key: js.UndefOr[String] = js.undefined,
                          ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                           ) = createElementWithChildren(ctor, props, key, ref)()


  /**
   * helper method to create ReactElements for components with no props
   */
  def createElementNoProps[P, S](ctor: ReactTypedConstructor[P, S],
                                 key: js.UndefOr[String] = js.undefined,
                                 ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                  ) = createElementNoPropsWithChildren(ctor, key, ref)()

  /**
   * helper method to create ReactElements for components with props  and children
   */
  def createElementWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                      props: P,
                                      key: js.UndefOr[String] = js.undefined,
                                      ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                       )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, props), children: _*).asInstanceOf[ReactElementU[P, S]]


  /**
   * helper method to create ReactElements for components with no props and children
   */
  def createElementNoPropsWithChildren[P, S](ctor: ReactTypedConstructor[P, S],
                                             key: js.UndefOr[String] = js.undefined,
                                             ref: js.Function1[_ <: ReactComponent[P, S], _] = null
                                              )(children: ReactNode*): ReactElementU[P, S] =
    React.createElement(ctor, JSProps(key, if (ref != null) ref else js.undefined, ()), children: _*).asInstanceOf[ReactElementU[P, S]]


  def createStatelessFunctionElement[P](func: P => ReactElement, props: P, key: js.UndefOr[String] = js.undefined) = {
    React.createElement((jsp: JSProps[P]) => func(jsp.sprops), JSProps(key = key, sprops = props))
  }

  def createStatelessFunctionElementNoProps(func: () => ReactElement, key: js.UndefOr[String] = js.undefined) = {
    React.createElement((jsp: JSProps[_]) => func(), JSProps(key = key, sprops = null))
  }

  def createStatelessFunctionElementWithChildren[P](func: (P, ReactElement) => ReactElement, props: P, key: js.UndefOr[String] = js.undefined)(children: ReactNode*) = {
    React.createElement((jsp: JSProps[P]) => func(jsp.sprops, jsp.children), JSProps(key = key, sprops = props), children: _*)
  }

  def createStatelessFunctionElementNoPropsWithChildren(func: ReactElement => ReactElement, key: js.UndefOr[String] = js.undefined)(children: ReactNode*) = {
    React.createElement((jsp: JSProps[_]) => func(jsp.children), JSProps(key = key, sprops = null), children: _*)
  }

  /**
   * use this method when you want  js.Object as props
   */
  def createStatelessFunctionElementJS[P <: ReactJSProps](func: P => ReactElement, props: P) = {
    React.createElement(func, props)
  }

  /**
   * use this method when you want  js.Object as props
   */
  def createStatelessFunctionElementJSWithChildren[P <: ReactJSProps](func: P => ReactElement, props: P)(children: ReactNode*) = {
    React.createElement(func, props, children: _*)
  }


}

object ElementFactory extends ElementFactory