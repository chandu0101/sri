package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro
import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr, undefined}


case class MapView(maxDelta: js.UndefOr[Int] = js.undefined,
                   pitchEnabled: js.UndefOr[Boolean] = js.undefined,
                   mapType: js.UndefOr[MapType] = js.undefined,
                   style: js.UndefOr[js.Any] = js.undefined,
                   legalLabelInsets: js.UndefOr[EdgeInsets] = js.undefined,
                   onRegionChange: js.UndefOr[js.Dynamic => _] = js.undefined,
                   ref: js.UndefOr[MapViewM => _] = js.undefined,
                   minDelta: js.UndefOr[Int] = js.undefined,
                   key: js.UndefOr[String] = js.undefined,
                   scrollEnabled: js.UndefOr[Boolean] = js.undefined,
                   annotations: js.UndefOr[Seq[MapViewAnnotation]] = js.undefined,
                   rotateEnabled: js.UndefOr[Boolean] = js.undefined,
                   onRegionChangeComplete: js.UndefOr[js.Dynamic => _] = js.undefined,
                   region: js.UndefOr[MapViewRegion] = js.undefined,
                   zoomEnabled: js.UndefOr[Boolean] = js.undefined,
                   showsUserLocation: js.UndefOr[Boolean] = js.undefined,
                   onAnnotationPress: js.UndefOr[js.Dynamic => Unit] = js.undefined) {

  def apply() = {
    val props = JSMacro[MapView](this)
    ReactNative.createElement(ReactNative.MapView,props)
  }

}


class MapType private(val value: String) extends AnyVal

object MapType {

  val STANDARD = new MapType("standard")
  val SATELLITE = new MapType("satellite")
  val HYBRID = new MapType("hybrid")

}


case class MapViewRegion(latitude: Double, longitude: Double, latitudeDelta: Double, longitudeDelta: Double) {
  val toJS = JSMacro[MapViewRegion](this)
}

object MapViewRegion {
  def fromJson(obj: js.Dynamic) = MapViewRegion(latitude = obj.latitude.asInstanceOf[Double],
    longitudeDelta = obj.longitudeDelta.asInstanceOf[Double],
    latitudeDelta = obj.latitudeDelta.asInstanceOf[Double],
    longitude = obj.longitude.asInstanceOf[Double])
}

case class MapViewAnnotation(latitude: Double, longitude: Double, title: UndefOr[String] = undefined, subTitle: UndefOr[String] = undefined) {
  val toJS = JSMacro[MapViewAnnotation](this)
}

object MapViewAnnotation {
  def fromJson(obj: js.Dynamic) = MapViewAnnotation(subTitle = if (js.isUndefined(obj.subtitle)) js.undefined else obj.subtitle.asInstanceOf[String],
    latitude = obj.latitude.asInstanceOf[Double],
    title = if (js.isUndefined(obj.title)) js.undefined else obj.title.asInstanceOf[String],
    longitude = obj.longitude.asInstanceOf[Double])
}

@js.native
trait MapViewM extends js.Object