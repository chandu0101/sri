package sri.mobile.examples.movies

import sri.core.ReactComponent
import sri.mobile.ReactNative
import sri.mobile.all._
import sri.mobile.examples.movies.MoviesUtil._
import sri.universal.components._
import sri.universal.styles.UniversalStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined


object MovieDetails {


  object Ratings {

    val Component = (props: js.Dynamic) => {
      val criticsScore = props.critics_score.asInstanceOf[Int]
      val audienceScore = props.audience_score.asInstanceOf[Int]
      View()(
        View(style = styles.rating)(
          Text(style = styles.ratingTitle)("Critics:"),
          Text(style = styles.ratingValue)(getTextFromScore(criticsScore))
        ),
        View(style = styles.rating)(
          Text(style = styles.ratingTitle)("Audience:"),
          Text(style = styles.ratingValue)(getTextFromScore(audienceScore))
        )
      )
    }

    def apply(rating: js.Dynamic, key: UndefOr[String] = js.undefined) = createStatelessFunctionElement(Component, rating, key = key)

  }

  object Cast {

    val Component  = (props : js.Array[js.Dynamic]) => {
        View()(
          Text(style = styles.castTitle)("Actors"),
          View()(
            props.map(actor => Text(key = actor.name.toString, style = styles.castActor)(s"${actor.name.toString}"))
          )
        )
      }

    def apply(cast: js.Array[js.Dynamic], key: UndefOr[String] = js.undefined) = createStatelessFunctionElement(Component, cast, key = key)

  }


  val Component = (props: js.Dynamic) => {
      ScrollView(contentContainerStyle = styles.contentContainer)(
        View()(
          View(style = styles.mainSection)(
            Image(style = styles.detailsImage, source = getImageSource(props, "det"))(),
            View(style = styles.rightPane)(
              Text()(props.year.toString),
              View(style = styles.mpaaWrapper)(
                Text(style = styles.mpaaText)(props.mpaa_rating.toString)
              ),
              Ratings(props.ratings)
            )
          ),
          View(style = styles.separator)(),
          Text()(props.synopsis.toString),
          View(style = styles.separator)(),
          Cast(props.abridged_cast.asInstanceOf[js.Array[js.Dynamic]])
        )

      )
    }

  def apply(movie: js.Dynamic, key: UndefOr[String] = js.undefined) = createStatelessFunctionElement(Component, movie, key = key)

  object styles extends UniversalStyleSheet {

    val contentContainer = style(
      padding := 10
    )
    val rightPane = style(
      justifyContent.spaceBetween,
      flex := 1
    )
    val movieTitle = style(
      flex := 1,
      fontSize := 16,
      fontWeight._500
    )
    val rating = style(
      marginTop := 10
    )
    val ratingTitle = style(
      fontSize := 14
    )
    val ratingValue = style(
      fontSize := 28,
      fontWeight._500
    )
    val mpaaWrapper = style(
      alignSelf.flexStart,
      borderColor := "black",
      borderWidth := 1,
      paddingHorizontal := 3,
      marginVertical := 5
    )
    val mpaaText = style(
      fontFamily := "Palatino",
      fontSize := 13,
      fontWeight._500
    )
    val mainSection = style(
      flexDirection.row
    )
    val detailsImage = style(
      width := 134,
      height := 200,
      backgroundColor := "#eaeaea",
      marginRight := 10
    )
    val separator = style(
      backgroundColor := "rgba(0, 0, 0, 0.1)",
      height := 1.0 / ReactNative.PixelRatio.get(),
      marginVertical := 10
    )
    val castTitle = style(
      fontWeight._500,
      marginBottom := 3
    )
    val castActor = style(
      marginLeft := 2
    )
  }


}
