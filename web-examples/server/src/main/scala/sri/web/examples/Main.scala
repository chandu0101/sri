package sri.web.examples

import play.api.mvc.{Action, Results}
import play.api.http.ContentTypes.HTML
import play.core.server.NettyServer
import play.api.routing.sird._

object Main extends App with Results {

  def bundle(projectName: String): String = {
    val name = projectName.toLowerCase
    Seq(s"$name-opt-bundle.js", s"$name-fastopt-bundle.js")
      .find(name => getClass.getResource(s"/public/$name") != null)
      .getOrElse(sys.error("Bundle not found in assets"))
  }

  val indexPage =
    s"""
       |<!DOCTYPE html>
       |<html>
       |  <head>
       |  <meta charset="UTF-8">
       |    <meta name="viewport" content="width=device-width, initial-scale=1">
       |    <title>sri web examples</title>
       |    <style>
       |        html {
       |            font-family:  sans-serif;
       |            /* 1 */
       |            -ms-text-size-adjust: 100%;
       |            /* 2 */
       |            -webkit-text-size-adjust: 100%;
       |            /* 2 */
       |        }
       |        body {
       |            margin: 0;
       |            font-size: 15px;
       |            line-height: 20px;
       |        }
       |
       |        .react-root {
       |            position: absolute;
       |            top: 0;
       |            left: 0;
       |            right: 0;
       |            bottom: 0;
       |            box-sizing: border-box;
       |            display: -webkit-box;
       |            display: -webkit-flex;
       |            display: -ms-flexbox;
       |            display: flex;
       |            -webkit-box-orient: vertical;
       |            -webkit-box-direction: normal;
       |            -webkit-flex-direction: column;
       |            -ms-flex-direction: column;
       |            flex-direction: column;
       |        }
       |
       |    </style>
       |  </head>
       |  <body>
       |    <div id="react-root" class="react-root"></div>
       |    <script src="/assets/${bundle("sri-web-examples-client")}"></script>
       |  </body>
       |</html>
        """.stripMargin

  NettyServer.fromRouter() {
    case GET(p"/assets/$file*") => controllers.Assets.versioned("/public", file)
    case GET(p"/$ignored*")     => Action(Ok(indexPage).as(HTML))
  }

}