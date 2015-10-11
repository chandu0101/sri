#Universal Styles

`UniversalStyleSheet` contains styles common to web and mobile. Extend ``trait SriStyleSheet`` to define style sheets. `SriStyleSheet` comes with two methods: ``style`` (which takes attr value pairs) and ``styleE`` (which is used to extend already defined styles).

 Example :

```scala
  object styles extends UniversalStyleSheet {
    val centering = style(
      alignItems.center,
      justifyContent.center
    )
    val gray = style(backgroundColor := "#cccccc")
    val horizontal = style(flexDirection.row, justifyContent.center)
    val default = styleE(centering, gray)(height := 40)
  }

 ```
