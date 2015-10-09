package sri.mobile.examples.uiexplorer.components.ios

import sri.core._
import sri.mobile.all._
import sri.mobile.components.{MapView, MapViewAnnotation, MapViewRegion}
import sri.mobile.examples.uiexplorer.{UIExample, UIExplorerBlock, UIExplorerPage}
import sri.universal.ReactEvent
import sri.universal.components._
import sri.universal.styles.SriStyleSheet

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.util.Try


object MapViewExample extends UIExample {


  object MapRegionInput {

    case class State(region: MapViewRegion = MapViewRegion(0.0, 0.0, 0.0, 0.0))

    @ScalaJSDefined
    class Component extends ReactComponent[Props, State] {

      initialState(State())

      def render() = {
        View()(
          View(style = styles.row)(
            Text()("Latitude"),
            TextInput(value = state.region.latitude.toString,
              style = styles.textInput,
              onChange = onChangeLatitude _,
              selectTextOnFocus = true)()),
          View(style = styles.row)(
            Text()("Longitude"),
            TextInput(value = state.region.longitude.toString,
              style = styles.textInput,
              onChange = onChangeLongitude _,
              selectTextOnFocus = true)()),
          View(style = styles.row)(
            Text()("Latitude delta"),
            TextInput(value = state.region.latitudeDelta.toString,
              style = styles.textInput,
              onChange = onChangeLatitudeDelta _,
              selectTextOnFocus = true)()),
          View(style = styles.row)(
            Text()("Longitude delta"),
            TextInput(value = state.region.longitudeDelta.toString,
              style = styles.textInput,
              onChange = onChangeLongitudeDelta _,
              selectTextOnFocus = true)()
          ),
          View(style = styles.changeButton)(
            Text(onPress = change _)("Change")
          )
        )
      }

      @JSName("sComponentWillReceiveProps")
      override def componentWillReceiveProps(nextProps: => Props): Unit = {
        val region = if (nextProps.region != null) nextProps.region
        else MapViewRegion(0.0, 0.0, 0.0, 0.0)
        setState(state.copy(region = region))

      }

      var region = MapViewRegion(0.0, 0.0, 0.0, 0.0)

      def getDouble(str: String) = {
        val doubleOption = Try(str.toDouble).toOption
        doubleOption.getOrElse(0.0)
      }

      def onChangeLatitude(e: ReactEvent) = {
        region = region.copy(latitude = getDouble(e.nativeEvent.text.toString))
      }

      def onChangeLongitude(e: ReactEvent) = {
        region = region.copy(longitude = getDouble(e.nativeEvent.text.toString))
      }

      def onChangeLatitudeDelta(e: ReactEvent) = {
        region = region.copy(latitudeDelta = getDouble(e.nativeEvent.text.toString))
      }

      def onChangeLongitudeDelta(e: ReactEvent) = {
        region = region.copy(longitudeDelta = getDouble(e.nativeEvent.text.toString))
      }

      def change: Unit = {
        setState(state.copy(region = region))
        props.onChange(state.region)
      }
    }

    case class Props(region: MapViewRegion, onChange: (MapViewRegion) => _)


    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

    def apply(props: Props, key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElement(ctor, props)

  }


  object MapExample {

    case class State(mapRegion: MapViewRegion = MapViewRegion(0.0, 0.0, 0.0, 0.0), mapRegionInput: MapViewRegion = MapViewRegion(0.0, 0.0, 0.0, 0.0), annotations: Seq[MapViewAnnotation] = Seq(), isFirstLoad: Boolean = true)

    @ScalaJSDefined
    class Component extends ReactComponent[Unit, State] {

      initialState(State())

      def render() = View()(
        MapView(style = styles.map,
          onRegionChange = onRegionChange _,
          onRegionChangeComplete = onRegionChangeComplete _,
          region = state.mapRegion,
          annotations = state.annotations
        )(),
        MapRegionInput(MapRegionInput.Props(onChange = onRegionInputChanged _, region = state.mapRegionInput))
      )

      def getAnnotations(region: MapViewRegion) = {
        Seq(MapViewAnnotation(latitude = region.latitude, longitude = region.longitude, title = "You Are Here"))
      }

      def onRegionChange(region: js.Dynamic) = {
        setState(state.copy(mapRegionInput = MapViewRegion.fromJson(region)))
      }

      def onRegionChangeComplete(regionD: js.Dynamic) = {
        if (state.isFirstLoad) {
          val region = MapViewRegion.fromJson(regionD)
          setState(state.copy(
            mapRegionInput = region,
            annotations = getAnnotations(region),
            isFirstLoad = false
          ))
        }
      }

      def onRegionInputChanged(region: MapViewRegion) = {
        setState(state.copy(mapRegion = region, mapRegionInput = region, annotations = getAnnotations(region)))
      }

      override def componentDidMount(): Unit = {
        println(s"mounted nap parent")
      }
    }

    val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


    def apply(key: UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor)

  }

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = UIExplorerPage(
      UIExplorerBlock("Map")(
        MapExample()
      ),
      UIExplorerBlock("Map shows user location")(
        MapView(style = styles.map, showsUserLocation = true)()
      )
    )
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  val component = createElementNoProps(ctor)


  object styles extends SriStyleSheet {

    val map = style(height := 150,
      margin := 10,
      borderWidth := 1,
      borderColor := "#000000")

    val row = style(flexDirection.row,
      justifyContent.spaceBetween)

    val textInput = style(width := 150,
      height := 20,
      borderWidth := 0.5,
      borderColor := "#aaaaaa",
      fontSize := 13,
      padding := 4)

    val changeButton = style(
      alignSelf.center,
      marginTop := 5,
      padding := 3,
      borderWidth := 0.5,
      borderColor := "#777777"
    )

  }

  override def title: String = "MapView"

  override def description: String = "Base component to display maps"
}
