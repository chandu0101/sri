package sri.mobile.examples.movies

import sri.universal.components.ImageSource

import scala.scalajs.js
import scala.scalajs.js.isUndefined

object MoviesUtil {

  def getImageSource(movie: js.Dynamic, kind: String = ""): ImageSource = {
    var uri = if (!isUndefined(movie) && !isUndefined(movie.posters)) movie.posters.thumbnail.toString else ""
    if (kind.nonEmpty && uri.nonEmpty) uri = uri.replace("tmb", kind)
    ImageSource(uri = uri)
  }

  def getTextFromScore(score: Int): String = {
    if (score > 0) s"$score%" else "N/A"
  }
}
