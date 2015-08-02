package chandu0101.scalajs.sri.mobile.components

import chandu0101.scalajs.sri.core.ReactElement
import chandu0101.scalajs.sri.mobile.ReactNative

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.{UndefOr, undefined}

/**
 * Created by chandrasekharkode on 4/1/15.
 *
 *
key: PropTypes.string,
style: PropTypes.js.Any,
ref: PropTypes.String,
  showsUserLocation: PropTypes.bool,
    zoomEnabled: PropTypes.bool,
    rotateEnabled: PropTypes.bool,
    pitchEnabled: PropTypes.bool,
    scrollEnabled: PropTypes.bool,
    region:PropTypes.MapViewRegion,
    mapType:PropTypes.MapType,
    maxDelta: PropTypes.number,
    minDelta: PropTypes.number,
    legalLabelInsets: PropTypes.EdgeInsets,
    onRegionChange: PropTypes.MapViewRegion => Unit,
    onAnnotationPress: PropTypes.MapViewAnnotation => Unit,
 annotations:PropTypes.Seq[MapViewAnnotation]
    onRegionChangeComplete: PropTypes.MapViewRegion => Unit,
 */


object MapView {

  def apply(maxDelta: js.UndefOr[Int] = js.undefined,
            pitchEnabled: js.UndefOr[Boolean] = js.undefined,
            mapType: js.UndefOr[MapType] = js.undefined,
            style: js.UndefOr[js.Any] = js.undefined,
            legalLabelInsets: js.UndefOr[EdgeInsets] = js.undefined,
            onRegionChange: js.UndefOr[MapViewRegion => Unit] = js.undefined,
            ref: js.UndefOr[String] = js.undefined,
            minDelta: js.UndefOr[Int] = js.undefined,
            key: js.UndefOr[String] = js.undefined,
            scrollEnabled: js.UndefOr[Boolean] = js.undefined,
            annotations: js.UndefOr[Seq[MapViewAnnotation]] = js.undefined,
            rotateEnabled: js.UndefOr[Boolean] = js.undefined,
            onRegionChangeComplete: js.UndefOr[MapViewRegion => Unit] = js.undefined,
            region: js.UndefOr[MapViewRegion] = js.undefined,
            zoomEnabled: js.UndefOr[Boolean] = js.undefined,
            showsUserLocation: js.UndefOr[Boolean] = js.undefined,
            onAnnotationPress: js.UndefOr[MapViewAnnotation => Unit] = js.undefined) = {

    val p = js.Dynamic.literal()
    maxDelta.foreach(v => p.updateDynamic("maxDelta")(v))
    pitchEnabled.foreach(v => p.updateDynamic("pitchEnabled")(v))
    mapType.foreach(v => p.updateDynamic("mapType")(v.tpe))
    style.foreach(v => p.updateDynamic("style")(v))
    legalLabelInsets.foreach(v => p.updateDynamic("legalLabelInsets")(v.toJson))
    onRegionChange.foreach(v => p.updateDynamic("onRegionChange")((r: js.Dynamic) => v(MapViewRegion.fromJson(r))))
    ref.foreach(v => p.updateDynamic("ref")(v))
    minDelta.foreach(v => p.updateDynamic("minDelta")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    scrollEnabled.foreach(v => p.updateDynamic("scrollEnabled")(v))
    annotations.foreach(v => p.updateDynamic("annotations")(v.map(_.toJson).toJSArray))
    rotateEnabled.foreach(v => p.updateDynamic("rotateEnabled")(v))
    onRegionChangeComplete.foreach(v => p.updateDynamic("onRegionChangeComplete")((r: js.Dynamic) => v(MapViewRegion.fromJson(r))))
    region.foreach(v => p.updateDynamic("region")(v.toJson))
    zoomEnabled.foreach(v => p.updateDynamic("zoomEnabled")(v))
    showsUserLocation.foreach(v => p.updateDynamic("showsUserLocation")(v))
    onAnnotationPress.foreach(v => p.updateDynamic("onAnnotationPress")((annotation: js.Dynamic) => v(MapViewAnnotation.fromJson(annotation))))

    val f = ReactNative.createFactory(ReactNative.MapView)
    f(p).asInstanceOf[ReactElement]
  }

}


class MapType private(val tpe: String)

object MapType {

  val STANDARD = new MapType("standard")
  val SATELLITE = new MapType("satellite")
  val HYBRID = new MapType("hybrid")

}


case class MapViewRegion(latitude: Double, longitude: Double, latitudeDelta: Double, longitudeDelta: Double) {
  def toJson = json("latitude" -> latitude, "longitudeDelta" -> longitudeDelta, "latitudeDelta" -> latitudeDelta, "longitude" -> longitude)
}

object MapViewRegion {
  def fromJson(obj: js.Dynamic) = MapViewRegion(latitude = obj.latitude.asInstanceOf[Double],
    longitudeDelta = obj.longitudeDelta.asInstanceOf[Double],
    latitudeDelta = obj.latitudeDelta.asInstanceOf[Double],
    longitude = obj.longitude.asInstanceOf[Double])
}

case class MapViewAnnotation(latitude: Double, longitude: Double, title: UndefOr[String] = undefined, subTitle: UndefOr[String] = undefined) {
  def toJson = {
    val p = json()
    subTitle.foreach(v => p.updateDynamic("subtitle")(v))
    p.updateDynamic("latitude")(latitude)
    title.foreach(v => p.updateDynamic("title")(v))
    p.updateDynamic("longitude")(longitude)
    p
  }
}

object MapViewAnnotation {
  def fromJson(obj: js.Dynamic) = MapViewAnnotation(subTitle = if (js.isUndefined(obj.subtitle)) js.undefined else obj.subtitle.asInstanceOf[String],
    latitude = obj.latitude.asInstanceOf[Double],
    title = if (js.isUndefined(obj.title)) js.undefined else obj.title.asInstanceOf[String],
    longitude = obj.longitude.asInstanceOf[Double])
}