#Mobile Styles

React Native doesn't implement CSS but instead relies on JavaScript to let you style your application. You can define styles in dynamic/typesafe way

##### Dynamic Way :

 Use js.Dynamic.literal to define js styles

Example :

```scala
 import scala.scalajs.js.Dynamic.{literal => json}
  val styles = ReactNative.StyleSheet.create(
    json(
      container = json(flex = 1,
        backgroundColor = "#F5FCFF"),
      textCenter = json(textAlign = "center",marginTop = 10)
    )
  )

  //access styles
   View(style = styles.container)(..)
```

###### TypeSafe Way :

 extend ``trait MobileStyleSheet`` to define style sheets . NativeStyleSheet comes with two methods ``style`` (which takes attr value pairs)and ``styleE`` (this is used to extend already defined styles).

 Example :

```scala
  object styles extends MobileStyleSheet {
    val centering = style(
      alignItems.center,
      justifyContent.center
    )
    val gray = style(backgroundColor := "#cccccc")
    val horizontal = style(flexDirection.row, justifyContent.center)
    val default = styleE(centering, gray)(height := 40)
  }

 ```