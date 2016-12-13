# DOM DSL :


##### HTML Tags : 

```scala
import sri.web.vdom.htmltags._ ( faster ,but output file size will be more(Tip : gzip and cache ) )

        or 
        
import sri.web.vdom.htmltagsNoInline._ (small file size , but less performant than inline version)

```

Example :
         No magic, all tags are plain scala methods.
         
```scala         
 
 import sri.web.vdom.htmltags._ 
 import sri.web.all._
 
 val Component = (props : Props) => {
    div(id = "sri-web")(
      input(id = "sri-web-input"),
      div(key = "hello" , onClick = (e : ReactEventH) => println("OK!"))("Click Me"),
      div(key = 2, ref = (node : dom.html.Div) => { ... } )()
    )
 } 

```

If you want prefixed versions( &lt;.div() , &lt;.input(), ...) then import following

```scala
import sri.web.vdom.htmltagsPrefix_<._

    or
    
import sri.web.vdom.htmltagsNoInlinePrefix_<._
```


##### SVG Tags : 

```scala
import sri.web.vdom.svgtags._ ( faster ,but output file size will be more(Tip : gzip and cache ) )

        or 
        
import sri.web.vdom.svgtagsNoInline._ (small file size , but less performant than inline version)

```

Example :
         No magic, all tags are plain scala methods.
         
```scala         
 
 import sri.web.vdom.svgtags._ 
 import sri.web.all._
 
 val Component = (props : Props) => {
    svg(id = "sri-web")(
      rect(width = 120)()
    )
 } 

```

If you want prefixed versions( &lt;.svg() , &lt;.rect(), ...) then import following

```scala
import sri.web.vdom.svgtagsPrefix_<._

    or
    
import sri.web.vdom.svgtagsNoInlinePrefix_<._
```