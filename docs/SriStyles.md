#Sri Styles

SriStyleSheet contains styles common to web and mobile

###### TypeSafe Way :

 extend ``trait SriStyleSheet`` to define style sheets . SriStyleSheet comes with two methods ``style`` (which takes attr value pairs)and ``styleE`` (this is used to extend already defined styles).

 Example :

```scala
  object styles extends SriStyleSheet {
    val centering = style(
      alignItems.center,
      justifyContent.center
    )
    val gray = style(backgroundColor := "#cccccc")
    val horizontal = style(flexDirection.row, justifyContent.center)
    val default = styleE(centering, gray)(height := 40)
  }

 ```