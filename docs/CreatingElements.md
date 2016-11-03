# Creating Elements 

We cannot directly use component classes to construct `ReactElement`s, because (from React documentation): 

>We can't just create an instance of the class using the constructor and use that as an element because a single element can be inserted into the DOM in several places. We need to create an instance of that class for each insertion point of the element. This is why elements are not instances of the class.

[New React Element Factories and JSX](https://gist.github.com/sebmarkbage/d7bce729f38730399d28)

React uses [JSX](https://facebook.github.io/react/docs/jsx-in-depth.html) to create elements from component classes. Since we can't use JSX,  we (all third party langs that compile to JS and interface with react) need a different approach here.

Sri comes with a few helpers methods to achieve this.  [ElementFactory](https://github.com/chandu0101/sri/blob/master/core/src/main/scala/sri/core/ElementFactory.scala)

## Examples

Let's say we have a react component `HelloMessge`. To construct element for this component, first we need to create a reusable factory and then we can use that factory to create elements by passing props and children.

```scala
import sri.core.ElementFactory._
@ScalaJSDefined
class HelloMessage extends ReactComponent[Unit,Unit] {
  def render() = {
   View(...view_props)("Hello Sri")
  }
}
val element = makeElement[HelloMessage]
```

Please check the source code of [ElementFactory](core/src/main/scala/sri/core/ElementFactory.scala) for all helper methods documentation.

