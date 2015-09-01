package chandu0101.scalajs.sri.mobile.examples.movies

import chandu0101.scalajs.sri.core.ElementFactory._
import chandu0101.scalajs.sri.core.{ReactComponent, RefType}
import chandu0101.scalajs.sri.mobile._
import chandu0101.scalajs.sri.mobile.components._
import chandu0101.scalajs.sri.mobile.examples.movies.MoviesUtil._
import chandu0101.scalajs.sri.mobile.styles.NativeStyleSheet

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.ScalaJSDefined


object MovieDetails {


  object Ratings {

    @ScalaJSDefined
    class Component extends ReactComponent[js.Dynamic, Unit] {
      def render() = {
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
    }

    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(rating: js.Dynamic, key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, rating, key = key, ref = ref)

  }

  object Cast {

    @ScalaJSDefined
    class Component extends ReactComponent[js.Array[js.Dynamic], Unit] {
      def render() = {
        View()(
          Text(style = styles.castTitle)("Actors"),
          View()(
            props.map(actor => Text(key = actor.name.toString, style = styles.castActor)(s"${actor.name.toString}")): _*
          )
        )
      }
    }


    val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

    def apply(cast: js.Array[js.Dynamic], key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, cast, key = key, ref = ref)

  }


  @ScalaJSDefined
  class Component extends ReactComponent[js.Dynamic, Unit] {

    def render() = {
      ScrollView(contentContainerStyle = styles.contentContainer)(
        View()(
          View(style = styles.mainSection)(
            Image(style = styles.detailsImage, source = getImageSource(props, "det")),
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

  }

  val factory = getComponentFactory(js.constructorOf[Component],classOf[Component])

  def apply(movie: js.Dynamic, key: UndefOr[String] = js.undefined, ref: RefType = null) = createElement(factory, movie, key = key, ref = ref)

  object styles extends NativeStyleSheet {

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
