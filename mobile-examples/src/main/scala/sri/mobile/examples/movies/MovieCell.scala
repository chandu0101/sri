package sri.mobile.examples.movies

import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.movies.MoviesApp.DetailsPage
import sri.mobile.examples.movies.MoviesUtil._
import sri.universal.components._
import sri.universal.router
import sri.universal.router.UniversalRouterComponent
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined

object MovieCell {


  @ScalaJSDefined
  class Component extends UniversalRouterComponent[js.Dynamic, Unit] {
    def render() = {
      val criticScore = props.ratings.critics_score.asInstanceOf[Int]
      View()(
        TouchableHighlight(key = "th", onPress = () => navigateTo(DetailsPage, props, props.title.toString))(
          View(key = "pap", style = styles.row)(
            Image(key = "is", source = getImageSource(props, "det"), style = styles.cellImage)(),
            View(key = "sv", style = styles.textContainer)(
              Text(key = "tt", style = styles.movieTitle)(props.title.toString),
              Text(key = "year", style = styles.movieYear, numberOfLines = 1)(
                props.year.toString,
                Text(key = "hello")(
                  s"Critcs ${getTextFromScore(criticScore)}"
                )
              )
            )
          )
        ),
        View(key = "cb", style = styles.cellBorder)()
      )
    }
  }


  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  ctor.contextTypes = router.routerContextTypes

  def apply(movie: js.Dynamic, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, movie, key = key, ref = ref)


  object styles extends UniversalStyleSheet {
    val textContainer = style(
      flex := 1
    )
    val movieTitle = style(
      flex := 1,
      fontSize := 16,
      fontWeight._500,
      marginBottom := 2
    )
    val movieYear = style(
      color := "#999999",
      fontSize := 12
    )
    val row = style(
      alignItems.center,
      backgroundColor := "white",
      flexDirection.row,
      padding := 5
    )
    val cellImage = style(
      backgroundColor := "#dddddd",
      height := 93,
      marginRight := 10,
      width := 60
    )
    val cellBorder = style(
      backgroundColor := "rgba(0, 0, 0, 0.1)",
      height := 1.0 / ReactNative.PixelRatio.get(),
      marginLeft := 4
    )
  }

}
