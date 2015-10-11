
## Refs To Components

react 0.14 supports two types of refs( string based and callback). In future string ref's are going to be obsolete

>The next big (and probably most invasive change for a while) will be replacing string refs. Most can be automatically converted. #reactjs
 Use callback refs e.g.
 this.node = n} /> to avoid having to do any upgrade work. Allows you to move work from life-cycles too
 
so Sri only supports callback refs.

## Refs to Scala Components 

Let say we have a Child component which has public method `hideMe()`, In Parent component we're rendering child component ,after render if we want to invoke childs `hideMe()` method then we must get reference to child component.

```scala
object Parent {
  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = div(null,Child(ref = storeChildRef _))
    var childRef: Child.Component = _
    def storeChildRef(cref: Child.Component) = {
      childRef = cref // store reference to use later
      childRef.hideMe() // invoke actions
    }
  }
  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(ctor, key = key, ref = ref)
}

object Child {
  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = div(null, "Child Component")
    def hideMe() = {
      println(s"Ok done!.")
    }
  }
  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component,_] = null) = createElementNoProps(ctor, key = key, ref = ref)
}


```


