package chandu0101.scalajs.sri.mobile.components

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

/**
 * Created by chandrasekharkode on 4/1/15.
 */
case class ImageSource(uri : String,isStatic : js.UndefOr[Boolean] = js.undefined) {

 def toJson = {
   val p = json()
   p.updateDynamic("uri")(uri)
   isStatic.foreach(v => p.updateDynamic("isStatic")(v))
   p
 }
}

object ImageSource {
  def fromJson(obj : js.Dynamic) = {
     ImageSource(obj.uri.toString,if(js.isUndefined(obj.isStatic)) js.undefined else obj.isStatic.asInstanceOf[Boolean] )
  }
}