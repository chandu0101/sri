package sri.mobile.components

import chandu0101.macros.tojs.{rename, JSMacro}
import sri.core.{ReactElement, React}
import sri.mobile.{MapViewEvent, ReactNative}
import sri.universal.ReactEvent


import sri.universal.components.{ImageSource, EdgeInsets}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr, undefined}

@deprecated("MapView is now deprecated and will be removed from React Native in version 0.42,Please use https://github.com/airbnb/react-native-maps")
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
                   followUserLocation: js.UndefOr[Boolean] = js.undefined,
                   annotations: js.UndefOr[Seq[MapViewAnnotation]] = js.undefined,
                   overlays: js.UndefOr[Seq[MapViewOverlay]] = js.undefined,
                   rotateEnabled: js.UndefOr[Boolean] = js.undefined,
                   onRegionChangeComplete: js.UndefOr[js.Dynamic => _] = js.undefined,
                   region: js.UndefOr[MapViewRegion] = js.undefined,
                   zoomEnabled: js.UndefOr[Boolean] = js.undefined,
                   showsUserLocation: js.UndefOr[Boolean] = js.undefined,
                   onAnnotationPress: js.UndefOr[js.Dynamic => _] = js.undefined) {

  def apply() = {
    val props = JSMacro[MapView](this)
    React.createElement(ReactNative.MapView, props)
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

@ScalaJSDefined
class MapViewAnnotationJS(val latitude: Double,
                          val longitude: Double,
                          val title: UndefOr[String] = undefined,
                          val subTitle: UndefOr[String] = undefined,
                          val tintColor: js.UndefOr[String] = js.undefined,
                          val animateDrop: js.UndefOr[Boolean] = js.undefined,
                          val leftCalloutView: js.UndefOr[ReactElement] = js.undefined,
                          val rightCalloutView: js.UndefOr[ReactElement] = js.undefined,
                          val detailCalloutView: js.UndefOr[ReactElement] = js.undefined,
                          val view: js.UndefOr[ReactElement] = js.undefined,
                          val draggable: js.UndefOr[Boolean] = js.undefined,
                          val onFocus: js.UndefOr[js.Function1[ReactEvent[MapViewEvent], _]] = js.undefined,
                          val onBlur: js.UndefOr[js.Function1[ReactEvent[MapViewEvent], _]] = js.undefined,
                          val onDragStateChange: js.UndefOr[js.Function1[js.Dynamic, _]] = js.undefined,
                          val image: js.UndefOr[js.Dynamic] = undefined
                           ) extends js.Object


case class MapViewAnnotation(latitude: Double,
                             longitude: Double,
                             title: UndefOr[String] = undefined,
                             subTitle: UndefOr[String] = undefined,
                             tintColor: js.UndefOr[String] = js.undefined,
                             animateDrop: js.UndefOr[Boolean] = js.undefined,
                             leftCalloutView: js.UndefOr[ReactElement] = js.undefined,
                             rightCalloutView: js.UndefOr[ReactElement] = js.undefined,
                             detailCalloutView: js.UndefOr[ReactElement] = js.undefined,
                             view: js.UndefOr[ReactElement] = js.undefined,
                             draggable: js.UndefOr[Boolean] = js.undefined,
                             onDragStateChange: js.UndefOr[js.Function1[js.Dynamic, _]] = js.undefined,
                             image: js.UndefOr[ImageSource] = undefined,
                             @rename("image") imageDynamic: js.UndefOr[js.Dynamic] = undefined
                              ) {
  val toJS = JSMacro[MapViewAnnotation](this)
}


case class MapViewOverlay(coordinates: Seq[MapViewCoordinate], lineWidth: Double, strokeColor: String, fillColor: String, id: String) {
  val toJS = JSMacro[MapViewOverlay](this)
}

case class MapViewCoordinate(latitude: Double, longitude: Double) {
  val toJS = JSMacro[MapViewCoordinate](this)
}

@js.native
trait MapViewM extends js.Object